package deob;

@ObfuscatedName("t")
public final class class9 {

    @ObfuscatedName("t.a")
    public static int[][][] field135 = new int[4][105][105];

    @ObfuscatedName("t.x")
    public static byte[][][] field118 = new byte[4][104][104];

    @ObfuscatedName("t.e")
    public static int field119 = 99;

    @ObfuscatedName("t.g")
    public static final int[] field125 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("t.v")
    public static final int[] field126 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("t.b")
    public static final int[] field133 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("t.j")
    public static final int[] field128 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("t.m")
    public static final int[] field129 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("t.k")
    public static final int[] field130 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("t.u")
    public static int field131 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("t.i")
    public static int field132 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.a(IIIII)V")
    public static final void method2658(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1390[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field135[0][var5][var4] = field135[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field135[0][var5][var4] = field135[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field135[0][var5][var4] = field135[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field135[0][var5][var4] = field135[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.x([BIIII[Lfe;I)V")
    public static final void method162(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class164[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2745[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class127 var9 = new class127(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method43(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("l.e([BIIIIIII[Lfe;I)V")
    public static final void method59(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2745[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        method43(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method43(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.r(IIII)V")
    public static final void method33(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field135[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field135[arg0][arg1][arg2 + var5] = field135[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field135[arg0][arg1 + var6][arg2] = field135[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field135[arg0][arg1 - 1][arg2] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field135[arg0][arg1][arg2 - 1] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field135[arg0][arg1 - 1][arg2 - 1] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("n.p(Ldy;IIIIIII)V")
    public static final void method43(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2411();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2411();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2411();
                }
            }
            return;
        }
        field118[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2411();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field135[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1603(var10 + 45365, var11 + 91923, 4) - 128 + (method1603(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1603(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field135[arg1][arg2][arg3] = field135[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2411();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field135[0][arg2][arg3] = -var15 * 8;
                } else {
                    field135[arg1][arg2][arg3] = field135[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field121[arg1][arg2][arg3] = arg0.method2412();
                Statics.field252[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field117[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field118[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field120[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("m.n([BIIS)Z")
    public static final boolean method237(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class127 var4 = new class127(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2581();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2581();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2411() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method1806(var5);
                        if (var13 != 22 || !client.field710 || var16.field839 != 0 || var16.field837 == 1 || var16.field828) {
                            if (!var16.method648()) {
                                client.field610++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2581();
                if (var9 == 0) {
                    break;
                }
                var4.method2411();
            }
        }
    }

    @ObfuscatedName("o.o([BIILcx;[Lfe;I)V")
    public static final void method56(byte[] arg0, int arg1, int arg2, class95 arg3, class164[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2581();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2581();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2411();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field118[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class164 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2066(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ch.l(IIIIIILcx;Lfe;B)V")
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field710 && (field118[0][arg1][arg2] & 0x2) == 0) {
            if ((field118[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method234(arg0, arg1, arg2) != client.field534) {
                return;
            }
        }
        if (arg0 < field119) {
            field119 = arg0;
        }
        class32 var8 = class32.method1806(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field836;
            var10 = var8.field835;
        } else {
            var9 = var8.field835;
            var10 = var8.field836;
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
        int[][] var15 = field135[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field839 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field867 == 1) {
            var20 += 256;
        }
        if (var8.method685()) {
            class7 var21 = new class7();
            var21.field85 = arg0;
            var21.field106 = arg1 * 128;
            var21.field87 = arg2 * 128;
            int var22 = var8.field835;
            int var23 = var8.field836;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field836;
                var23 = var8.field835;
            }
            var21.field88 = (arg1 + var22) * 128;
            var21.field89 = (arg2 + var23) * 128;
            var21.field91 = var8.field866;
            var21.field107 = var8.field833 * 128;
            var21.field93 = var8.field826;
            var21.field94 = var8.field868;
            var21.field95 = var8.field854;
            if (var8.field821 != null) {
                var21.field102 = var8;
                var21.method47();
            }
            class7.field86.method3247(var21);
            if (var21.field95 != null) {
                var21.field96 = var21.field93 + (int) (Math.random() * (double) (var21.field94 - var21.field93));
            }
        }
        if (arg5 == 22) {
            if (!client.field710 || var8.field839 != 0 || var8.field837 == 1 || var8.field828) {
                class94 var24;
                if (var8.field843 == -1 && var8.field821 == null) {
                    var24 = var8.method645(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
                }
                arg6.method1885(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field837 == 1 && arg7 != null) {
                    arg7.method3155(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var47;
            if (var8.field843 == -1 && var8.field821 == null) {
                var47 = var8.method645(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            if (var47 != null && arg6.method1856(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field851) {
                int var48 = 15;
                if (var47 instanceof class112) {
                    var48 = ((class112) var47).method2223() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field1390[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field1390[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field837 != 0 && arg7 != null) {
                arg7.method3171(arg1, arg2, var9, var10, var8.field838);
            }
        } else if (arg5 >= 12) {
            class94 var25;
            if (var8.field843 == -1 && var8.field821 == null) {
                var25 = var8.method645(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1856(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1273[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field837 != 0 && arg7 != null) {
                arg7.method3171(arg1, arg2, var9, var10, var8.field838);
            }
        } else if (arg5 == 0) {
            class94 var26;
            if (var8.field843 == -1 && var8.field821 == null) {
                var26 = var8.method645(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1822(arg0, arg1, arg2, var16, var26, (class94) null, field125[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field851) {
                    Statics.field1390[arg0][arg1][arg2] = 50;
                    Statics.field1390[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field1273[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field851) {
                    Statics.field1390[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1390[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field1273[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field851) {
                    Statics.field1390[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1390[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field1273[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field851) {
                    Statics.field1390[arg0][arg1][arg2] = 50;
                    Statics.field1390[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field847) {
                    Statics.field1273[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field837 != 0 && arg7 != null) {
                arg7.method3152(arg1, arg2, arg5, arg4, var8.field838);
            }
            if (var8.field844 != 16) {
                arg6.method1830(arg0, arg1, arg2, var8.field844);
            }
        } else if (arg5 == 1) {
            class94 var27;
            if (var8.field843 == -1 && var8.field821 == null) {
                var27 = var8.method645(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1822(arg0, arg1, arg2, var16, var27, (class94) null, field126[arg4], 0, var19, var20);
            if (var8.field851) {
                if (arg4 == 0) {
                    Statics.field1390[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1390[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1390[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1390[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field837 != 0 && arg7 != null) {
                arg7.method3152(arg1, arg2, arg5, arg4, var8.field838);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class94 var29;
            class94 var30;
            if (var8.field843 == -1 && var8.field821 == null) {
                var29 = var8.method645(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method645(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field843, true, (class94) null);
                var30 = new class14(arg3, 2, var28, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1822(arg0, arg1, arg2, var16, var29, var30, field125[arg4], field125[var28], var19, var20);
            if (var8.field847) {
                if (arg4 == 0) {
                    Statics.field1273[arg0][arg1][arg2] |= 0x249;
                    Statics.field1273[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1273[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1273[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1273[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1273[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1273[arg0][arg1][arg2] |= 0x492;
                    Statics.field1273[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field837 != 0 && arg7 != null) {
                arg7.method3152(arg1, arg2, arg5, arg4, var8.field838);
            }
            if (var8.field844 != 16) {
                arg6.method1830(arg0, arg1, arg2, var8.field844);
            }
        } else if (arg5 == 3) {
            class94 var31;
            if (var8.field843 == -1 && var8.field821 == null) {
                var31 = var8.method645(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1822(arg0, arg1, arg2, var16, var31, (class94) null, field126[arg4], 0, var19, var20);
            if (var8.field851) {
                if (arg4 == 0) {
                    Statics.field1390[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1390[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1390[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1390[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field837 != 0 && arg7 != null) {
                arg7.method3152(arg1, arg2, arg5, arg4, var8.field838);
            }
        } else if (arg5 == 9) {
            class94 var32;
            if (var8.field843 == -1 && var8.field821 == null) {
                var32 = var8.method645(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1856(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field837 != 0 && arg7 != null) {
                arg7.method3171(arg1, arg2, var9, var10, var8.field838);
            }
            if (var8.field844 != 16) {
                arg6.method1830(arg0, arg1, arg2, var8.field844);
            }
        } else if (arg5 == 4) {
            class94 var33;
            if (var8.field843 == -1 && var8.field821 == null) {
                var33 = var8.method645(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var33, (class94) null, field125[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1840(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method1806(var35 >> 14 & 0x7FFF).field844;
            }
            class94 var36;
            if (var8.field843 == -1 && var8.field821 == null) {
                var36 = var8.method645(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var36, (class94) null, field125[arg4], 0, field133[arg4] * var34, field128[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1840(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class32.method1806(var38 >> 14 & 0x7FFF).field844 / 2;
            }
            class94 var39;
            if (var8.field843 == -1 && var8.field821 == null) {
                var39 = var8.method645(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var39, (class94) null, 256, arg4, field129[arg4] * var37, field130[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class94 var41;
            if (var8.field843 == -1 && var8.field821 == null) {
                var41 = var8.method645(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class14(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var41, (class94) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1840(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class32.method1806(var43 >> 14 & 0x7FFF).field844 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class94 var45;
            class94 var46;
            if (var8.field843 == -1 && var8.field821 == null) {
                var45 = var8.method645(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method645(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field843, true, (class94) null);
                var46 = new class14(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field843, true, (class94) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field129[arg4] * var42, field130[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("bh.t(Lcx;[Lfe;I)V")
    public static final void method1478(class95 arg0, class164[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field118[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field118[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3160(var3, var4);
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
        field132 += (int) (Math.random() * 5.0D) - 2;
        if (field132 < -16) {
            field132 = -16;
        }
        if (field132 > 16) {
            field132 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1390[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field135[var6][var11 + 1][var10] - field135[var6][var11 - 1][var10];
                    int var13 = field135[var6][var11][var10 + 1] - field135[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field122[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1625[var20] = 0;
                Statics.field127[var20] = 0;
                Statics.field169[var20] = 0;
                Statics.field62[var20] = 0;
                Statics.field979[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field120[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class33 var26 = (class33) class33.field874.method3196((long) var25);
                            class33 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field2717.method2961(1, var25);
                                class33 var29 = new class33();
                                if (var28 != null) {
                                    var29.method690(new class127(var28), var25);
                                }
                                var29.method692();
                                class33.field874.method3193(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field1625[var22] += var27.field876;
                            Statics.field127[var22] += var27.field877;
                            Statics.field169[var22] += var27.field878;
                            Statics.field62[var22] += var27.field880;
                            var10002 = Statics.field979[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field120[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class33 var34 = (class33) class33.field874.method3196((long) var33);
                            class33 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field2717.method2961(1, var33);
                                class33 var37 = new class33();
                                if (var36 != null) {
                                    var37.method690(new class127(var36), var33);
                                }
                                var37.method692();
                                class33.field874.method3193(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field1625[var22] -= var35.field876;
                            Statics.field127[var22] -= var35.field877;
                            Statics.field169[var22] -= var35.field878;
                            Statics.field62[var22] -= var35.field880;
                            var10002 = Statics.field979[var22]--;
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
                            var39 += Statics.field1625[var45];
                            var40 += Statics.field127[var45];
                            var41 += Statics.field169[var45];
                            var42 += Statics.field62[var45];
                            var43 += Statics.field979[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field1625[var46];
                            var40 -= Statics.field127[var46];
                            var41 -= Statics.field169[var46];
                            var42 -= Statics.field62[var46];
                            var43 -= Statics.field979[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field710 || (field118[0][var21][var44] & 0x2) != 0 || (field118[var6][var21][var44] & 0x10) == 0 && method234(var6, var21, var44) == client.field534)) {
                            if (var6 < field119) {
                                field119 = var6;
                            }
                            int var47 = Statics.field120[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field121[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field135[var6][var21][var44];
                                int var50 = field135[var6][var21 + 1][var44];
                                int var51 = field135[var6][var21 + 1][var44 + 1];
                                int var52 = field135[var6][var21][var44 + 1];
                                int var53 = Statics.field122[var21][var44];
                                int var54 = Statics.field122[var21 + 1][var44];
                                int var55 = Statics.field122[var21 + 1][var44 + 1];
                                int var56 = Statics.field122[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method2659(var59, var60, var61);
                                    int var62 = field131 + var59 & 0xFF;
                                    int var63 = field132 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method2659(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field252[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class37 var66 = (class37) class37.field952.method3196((long) var65);
                                        class37 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field967.method2961(4, var65);
                                            class37 var69 = new class37();
                                            if (var68 != null) {
                                                var69.method796(new class127(var68), var65);
                                            }
                                            var69.method795();
                                            class37.field952.method3193(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field964) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field1273[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class104.field1781[method1804(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1854(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1804(var57, var53), method1804(var57, var54), method1804(var57, var55), method1804(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field252[var6][var21][var44] + 1;
                                    byte var72 = Statics.field117[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class37 var74 = (class37) class37.field952.method3196((long) var73);
                                    class37 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field967.method2961(4, var73);
                                        class37 var77 = new class37();
                                        if (var76 != null) {
                                            var77.method796(new class127(var76), var73);
                                        }
                                        var77.method795();
                                        class37.field952.method3193(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field954;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1782.method2131(var79);
                                        var81 = -1;
                                    } else if (var75.field953 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method2659(var75.field957, var75.field958, var75.field956);
                                        int var82 = field131 + var75.field957 & 0xFF;
                                        int var83 = field132 + var75.field956;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method2659(var82, var75.field958, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class104.field1781[method2914(var80, 96)];
                                    }
                                    if (var75.field951 != -1) {
                                        int var85 = field131 + var75.field960 & 0xFF;
                                        int var86 = field132 + var75.field962;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method2659(var85, var75.field961, var86);
                                        var84 = class104.field1781[method2914(var87, 96)];
                                    }
                                    arg0.method1854(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method1804(var57, var53), method1804(var57, var54), method1804(var57, var55), method1804(var57, var56), method2914(var81, var53), method2914(var81, var54), method2914(var81, var55), method2914(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1818(var6, var89, var88, method234(var6, var89, var88));
                }
            }
            Statics.field120[var6] = (byte[][]) null;
            Statics.field121[var6] = (byte[][]) null;
            Statics.field252[var6] = (byte[][]) null;
            Statics.field117[var6] = (byte[][]) null;
            Statics.field1390[var6] = (byte[][]) null;
        }
        arg0.method1927(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field118[1][var90][var91] & 0x2) == 2) {
                    arg0.method1908(var90, var91);
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
                        if ((Statics.field1273[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field1273[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field1273[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label375: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field1273[var101 - 1][var98][var103] & var92) == 0) {
                                        break label375;
                                    }
                                }
                                var101--;
                            }
                            label364: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field1273[var102 + 1][var98][var104] & var92) == 0) {
                                        break label364;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field135[var102][var98][var99] - var106;
                                int var108 = field135[var101][var98][var99];
                                class95.method1817(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field1273[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1273[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field1273[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field1273[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label428: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field1273[var113 - 1][var115][var97] & var93) == 0) {
                                        break label428;
                                    }
                                }
                                var113--;
                            }
                            label417: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field1273[var114 + 1][var116][var97] & var93) == 0) {
                                        break label417;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field135[var114][var111][var97] - var118;
                                int var120 = field135[var113][var111][var97];
                                class95.method1817(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field1273[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1273[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field1273[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field1273[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label481: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field1273[var96][var123 - 1][var127] & var94) == 0) {
                                        break label481;
                                    }
                                }
                                var123--;
                            }
                            label470: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field1273[var96][var124 + 1][var128] & var94) == 0) {
                                        break label470;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field135[var96][var123][var125];
                                class95.method1817(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field1273[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.q(IIII)I")
    public static int method234(int arg0, int arg1, int arg2) {
        if ((field118[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field118[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cm.c(IIIB)I")
    public static final int method1603(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method60(var3, var5);
        int var8 = method60(var3 + 1, var5);
        int var9 = method60(var3, var5 + 1);
        int var10 = method60(var3 + 1, var5 + 1);
        int var11 = method767(var7, var8, var4, arg2);
        int var12 = method767(var9, var10, var4, arg2);
        return method767(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ap.z(IIIIB)I")
    public static final int method767(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1786[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("l.s(IIB)I")
    public static final int method60(int arg0, int arg1) {
        int var2 = method707(arg0 - 1, arg1 - 1) + method707(arg0 + 1, arg1 - 1) + method707(arg0 - 1, arg1 + 1) + method707(arg0 + 1, arg1 + 1);
        int var3 = method707(arg0 - 1, arg1) + method707(arg0 + 1, arg1) + method707(arg0, arg1 - 1) + method707(arg0, arg1 + 1);
        int var4 = method707(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("an.h(III)I")
    public static final int method707(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cp.f(III)I")
    public static final int method1804(int arg0, int arg1) {
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

    @ObfuscatedName("eh.w(III)I")
    public static final int method2914(int arg0, int arg1) {
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

    @ObfuscatedName("ey.d(IIIB)I")
    public static final int method2659(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ej.y(IIIIIIILcx;Lfe;I)V")
    public static final void method2670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class164 arg8) {
        class32 var9 = class32.method1806(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field836;
            var11 = var9.field835;
        } else {
            var10 = var9.field835;
            var11 = var9.field836;
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
        int[][] var16 = field135[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field839 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field867 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field843 == -1 && var9.field821 == null) {
                var22 = var9.method662(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1885(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field837 == 1) {
                arg8.method3155(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field843 == -1 && var9.field821 == null) {
                var45 = var9.method662(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1856(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field837 != 0) {
                arg8.method3171(arg2, arg3, var10, var11, var9.field838);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field843 == -1 && var9.field821 == null) {
                var23 = var9.method662(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1856(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field837 != 0) {
                arg8.method3171(arg2, arg3, var10, var11, var9.field838);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field843 == -1 && var9.field821 == null) {
                var24 = var9.method662(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1822(arg0, arg2, arg3, var17, var24, (class94) null, field125[arg5], 0, var20, var21);
            if (var9.field837 != 0) {
                arg8.method3152(arg2, arg3, arg6, arg5, var9.field838);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field843 == -1 && var9.field821 == null) {
                var25 = var9.method662(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1822(arg0, arg2, arg3, var17, var25, (class94) null, field126[arg5], 0, var20, var21);
            if (var9.field837 != 0) {
                arg8.method3152(arg2, arg3, arg6, arg5, var9.field838);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field843 == -1 && var9.field821 == null) {
                var27 = var9.method662(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method662(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field843, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1822(arg0, arg2, arg3, var17, var27, var28, field125[arg5], field125[var26], var20, var21);
            if (var9.field837 != 0) {
                arg8.method3152(arg2, arg3, arg6, arg5, var9.field838);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field843 == -1 && var9.field821 == null) {
                var29 = var9.method662(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1822(arg0, arg2, arg3, var17, var29, (class94) null, field126[arg5], 0, var20, var21);
            if (var9.field837 != 0) {
                arg8.method3152(arg2, arg3, arg6, arg5, var9.field838);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field843 == -1 && var9.field821 == null) {
                var30 = var9.method662(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1856(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field837 != 0) {
                arg8.method3171(arg2, arg3, var10, var11, var9.field838);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field843 == -1 && var9.field821 == null) {
                var31 = var9.method662(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1921(arg0, arg2, arg3, var17, var31, (class94) null, field125[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1840(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method1806(var33 >> 14 & 0x7FFF).field844;
            }
            class94 var34;
            if (var9.field843 == -1 && var9.field821 == null) {
                var34 = var9.method662(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1921(arg0, arg2, arg3, var17, var34, (class94) null, field125[arg5], 0, field133[arg5] * var32, field128[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1840(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method1806(var36 >> 14 & 0x7FFF).field844 / 2;
            }
            class94 var37;
            if (var9.field843 == -1 && var9.field821 == null) {
                var37 = var9.method662(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1921(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field129[arg5] * var35, field130[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field843 == -1 && var9.field821 == null) {
                var39 = var9.method662(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1921(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1840(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method1806(var41 >> 14 & 0x7FFF).field844 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field843 == -1 && var9.field821 == null) {
                var43 = var9.method662(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method662(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field843, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field843, true, (class94) null);
            }
            arg7.method1921(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field129[arg5] * var40, field130[arg5] * var40, var20, var21);
        }
    }
}
