package deob;

@ObfuscatedName("a")
public final class class3 {

    @ObfuscatedName("a.q")
    public static int[][][] field23 = new int[4][105][105];

    @ObfuscatedName("a.l")
    public static byte[][][] field18 = new byte[4][104][104];

    @ObfuscatedName("a.a")
    public static int field28 = 99;

    @ObfuscatedName("a.w")
    public static final int[] field27 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("a.g")
    public static final int[] field26 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("a.p")
    public static final int[] field34 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("a.z")
    public static final int[] field30 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("a.n")
    public static final int[] field31 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("a.x")
    public static final int[] field25 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("a.i")
    public static int field32 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("a.m")
    public static int field19 = (int) (Math.random() * 33.0D) - 16;

    public class3() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.q(B)V")
    public static void method895() {
        field28 = 99;
        Statics.field20 = new byte[4][104][104];
        Statics.field21 = new byte[4][104][104];
        Statics.field22 = new byte[4][104][104];
        Statics.field711 = new byte[4][104][104];
        Statics.field704 = new int[4][105][105];
        Statics.field1720 = new byte[4][105][105];
        Statics.field189 = new int[105][105];
        Statics.field835 = new int[104];
        Statics.field1215 = new int[104];
        Statics.field726 = new int[104];
        Statics.field390 = new int[104];
        Statics.field29 = new int[104];
    }

    @ObfuscatedName("aq.l(IIIII)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1720[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field23[0][var5][var4] = field23[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field23[0][var5][var4] = field23[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field23[0][var5][var4] = field23[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field23[0][var5][var4] = field23[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.a([BIIIIIII[Lcx;I)V")
    public static final void method1224(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1279[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class136 var11 = new class136(arg0);
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
                        method1011(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method1011(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.o(IIIB)V")
    public static final void method2047(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field23[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field23[arg0][arg1][arg2 + var5] = field23[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field23[arg0][arg1 + var6][arg2] = field23[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field23[arg0][arg1 - 1][arg2] != 0) {
            field23[arg0][arg1][arg2] = field23[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field23[arg0][arg1][arg2 - 1] != 0) {
            field23[arg0][arg1][arg2] = field23[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field23[arg0][arg1 - 1][arg2 - 1] != 0) {
            field23[arg0][arg1][arg2] = field23[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cq.c(Let;IIIIIII)V")
    public static final void method1011(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method1602();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method1602();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method1602();
                }
            }
            return;
        }
        field18[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method1602();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field23[0][arg2][arg3] = -method1229(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field23[arg1][arg2][arg3] = field23[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method1602();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field23[0][arg2][arg3] = -var8 * 8;
                } else {
                    field23[arg1][arg2][arg3] = field23[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field21[arg1][arg2][arg3] = arg0.method1603();
                Statics.field22[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field711[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field18[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field20[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("u.h([BIILab;[Lcx;B)V")
    public static final void method93(byte[] arg0, int arg1, int arg2, class45 arg3, class95[] arg4) {
        class136 var5 = new class136(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method1615();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method1615();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method1602();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field18[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class95 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method7(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("l.r(IIIIIILab;Lcx;I)V")
    public static final void method7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class45 arg6, class95 arg7) {
        if (client.field1914 && (field18[0][arg1][arg2] & 0x2) == 0) {
            if ((field18[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field18[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field18[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field1970 != var8) {
                return;
            }
        }
        if (arg0 < field28) {
            field28 = arg0;
        }
        class154 var9 = class154.method886(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field2316;
            var11 = var9.field2315;
        } else {
            var10 = var9.field2315;
            var11 = var9.field2316;
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
        int[][] var16 = field23[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field2319 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field2341 == 1) {
            var21 += 256;
        }
        if (var9.method2377()) {
            class125 var22 = new class125();
            var22.field1604 = arg0;
            var22.field1605 = arg1 * 128;
            var22.field1613 = arg2 * 128;
            int var23 = var9.field2315;
            int var24 = var9.field2316;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field2316;
                var24 = var9.field2315;
            }
            var22.field1607 = (arg1 + var23) * 128;
            var22.field1616 = (arg2 + var24) * 128;
            var22.field1608 = var9.field2345;
            var22.field1610 = var9.field2346 * 128;
            var22.field1612 = var9.field2330;
            var22.field1609 = var9.field2312;
            var22.field1614 = var9.field2317;
            if (var9.field2301 != null) {
                var22.field1603 = var9;
                var22.method1481();
            }
            class125.field1617.method1293(var22);
            if (var22.field1614 != null) {
                var22.field1615 = var22.field1612 + (int) (Math.random() * (double) (var22.field1609 - var22.field1612));
            }
        }
        if (arg5 == 22) {
            if (!client.field1914 || var9.field2319 != 0 || var9.field2348 == 1 || var9.field2347) {
                class166 var25;
                if (var9.field2307 == -1 && var9.field2301 == null) {
                    var25 = var9.method2369(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class176(arg3, 22, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
                }
                arg6.method550(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field2348 == 1 && arg7 != null) {
                    arg7.method1200(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class166 var48;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var48 = var9.method2369(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class176(arg3, 10, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            if (var48 != null && arg6.method554(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field2331) {
                int var49 = 15;
                if (var48 instanceof class181) {
                    var49 = ((class181) var48).method3008() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field1720[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field1720[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field2348 != 0 && arg7 != null) {
                arg7.method1214(arg1, arg2, var10, var11, var9.field2318);
            }
        } else if (arg5 >= 12) {
            class166 var26;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var26 = var9.method2369(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class176(arg3, arg5, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method554(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field704[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field2348 != 0 && arg7 != null) {
                arg7.method1214(arg1, arg2, var10, var11, var9.field2318);
            }
        } else if (arg5 == 0) {
            class166 var27;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var27 = var9.method2369(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class176(arg3, 0, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method682(arg0, arg1, arg2, var17, var27, (class166) null, field27[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field2331) {
                    Statics.field1720[arg0][arg1][arg2] = 50;
                    Statics.field1720[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field2328) {
                    Statics.field704[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field2331) {
                    Statics.field1720[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1720[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field2328) {
                    Statics.field704[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field2331) {
                    Statics.field1720[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1720[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field2328) {
                    Statics.field704[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field2331) {
                    Statics.field1720[arg0][arg1][arg2] = 50;
                    Statics.field1720[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field2328) {
                    Statics.field704[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field2348 != 0 && arg7 != null) {
                arg7.method1191(arg1, arg2, arg5, arg4, var9.field2318);
            }
            if (var9.field2324 != 16) {
                arg6.method662(arg0, arg1, arg2, var9.field2324);
            }
        } else if (arg5 == 1) {
            class166 var28;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var28 = var9.method2369(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class176(arg3, 1, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method682(arg0, arg1, arg2, var17, var28, (class166) null, field26[arg4], 0, var20, var21);
            if (var9.field2331) {
                if (arg4 == 0) {
                    Statics.field1720[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1720[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1720[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1720[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field2348 != 0 && arg7 != null) {
                arg7.method1191(arg1, arg2, arg5, arg4, var9.field2318);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class166 var30;
            class166 var31;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var30 = var9.method2369(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method2369(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class176(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
                var31 = new class176(arg3, 2, var29, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method682(arg0, arg1, arg2, var17, var30, var31, field27[arg4], field27[var29], var20, var21);
            if (var9.field2328) {
                if (arg4 == 0) {
                    Statics.field704[arg0][arg1][arg2] |= 0x249;
                    Statics.field704[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field704[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field704[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field704[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field704[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field704[arg0][arg1][arg2] |= 0x492;
                    Statics.field704[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field2348 != 0 && arg7 != null) {
                arg7.method1191(arg1, arg2, arg5, arg4, var9.field2318);
            }
            if (var9.field2324 != 16) {
                arg6.method662(arg0, arg1, arg2, var9.field2324);
            }
        } else if (arg5 == 3) {
            class166 var32;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var32 = var9.method2369(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class176(arg3, 3, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method682(arg0, arg1, arg2, var17, var32, (class166) null, field26[arg4], 0, var20, var21);
            if (var9.field2331) {
                if (arg4 == 0) {
                    Statics.field1720[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1720[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1720[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1720[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field2348 != 0 && arg7 != null) {
                arg7.method1191(arg1, arg2, arg5, arg4, var9.field2318);
            }
        } else if (arg5 == 9) {
            class166 var33;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var33 = var9.method2369(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class176(arg3, arg5, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method554(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field2348 != 0 && arg7 != null) {
                arg7.method1214(arg1, arg2, var10, var11, var9.field2318);
            }
            if (var9.field2324 != 16) {
                arg6.method662(arg0, arg1, arg2, var9.field2324);
            }
        } else if (arg5 == 4) {
            class166 var34;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var34 = var9.method2369(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class176(arg3, 4, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method553(arg0, arg1, arg2, var17, var34, (class166) null, field27[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method651(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class154.method886(var36 >> 14 & 0x7FFF).field2324;
            }
            class166 var37;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var37 = var9.method2369(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class176(arg3, 4, arg4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method553(arg0, arg1, arg2, var17, var37, (class166) null, field27[arg4], 0, field34[arg4] * var35, field30[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method651(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class154.method886(var39 >> 14 & 0x7FFF).field2324 / 2;
            }
            class166 var40;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var40 = var9.method2369(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class176(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method553(arg0, arg1, arg2, var17, var40, (class166) null, 256, arg4, field31[arg4] * var38, field25[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class166 var42;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var42 = var9.method2369(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class176(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method553(arg0, arg1, arg2, var17, var42, (class166) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method651(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class154.method886(var44 >> 14 & 0x7FFF).field2324 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class166 var46;
            class166 var47;
            if (var9.field2307 == -1 && var9.field2301 == null) {
                var46 = var9.method2369(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method2369(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class176(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
                var47 = new class176(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field2307, true, (class166) null);
            }
            arg6.method553(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field31[arg4] * var43, field25[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("m.d(Lab;[Lcx;B)V")
    public static final void method303(class45 arg0, class95[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field18[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field18[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method1181(var3, var4);
                        }
                    }
                }
            }
        }
        field32 += (int) (Math.random() * 5.0D) - 2;
        if (field32 < -8) {
            field32 = -8;
        }
        if (field32 > 8) {
            field32 = 8;
        }
        field19 += (int) (Math.random() * 5.0D) - 2;
        if (field19 < -16) {
            field19 = -16;
        }
        if (field19 > 16) {
            field19 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1720[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field23[var6][var11 + 1][var10] - field23[var6][var11 - 1][var10];
                    int var13 = field23[var6][var11][var10 + 1] - field23[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field189[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field835[var20] = 0;
                Statics.field1215[var20] = 0;
                Statics.field726[var20] = 0;
                Statics.field390[var20] = 0;
                Statics.field29[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field20[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class155 var25 = class155.method481(var24 - 1);
                            Statics.field835[var22] += var25.field2353;
                            Statics.field1215[var22] += var25.field2354;
                            Statics.field726[var22] += var25.field2355;
                            Statics.field390[var22] += var25.field2356;
                            var10002 = Statics.field29[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field20[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class155 var28 = class155.method481(var27 - 1);
                            Statics.field835[var22] -= var28.field2353;
                            Statics.field1215[var22] -= var28.field2354;
                            Statics.field726[var22] -= var28.field2355;
                            Statics.field390[var22] -= var28.field2356;
                            var10002 = Statics.field29[var22]--;
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
                            var29 += Statics.field835[var35];
                            var30 += Statics.field1215[var35];
                            var31 += Statics.field726[var35];
                            var32 += Statics.field390[var35];
                            var33 += Statics.field29[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field835[var36];
                            var30 -= Statics.field1215[var36];
                            var31 -= Statics.field726[var36];
                            var32 -= Statics.field390[var36];
                            var33 -= Statics.field29[var36];
                        }
                        if (var34 >= 1 && var34 < 103) {
                            if (client.field1914 && (field18[0][var21][var34] & 0x2) == 0) {
                                if ((field18[var6][var21][var34] & 0x10) != 0) {
                                    continue;
                                }
                                int var37;
                                if ((field18[var6][var21][var34] & 0x8) != 0) {
                                    var37 = 0;
                                } else if (var6 <= 0 || (field18[1][var21][var34] & 0x2) == 0) {
                                    var37 = var6;
                                } else {
                                    var37 = var6 - 1;
                                }
                                if (client.field1970 != var37) {
                                    continue;
                                }
                            }
                            if (var6 < field28) {
                                field28 = var6;
                            }
                            int var38 = Statics.field20[var6][var21][var34] & 0xFF;
                            int var39 = Statics.field21[var6][var21][var34] & 0xFF;
                            if (var38 > 0 || var39 > 0) {
                                int var40 = field23[var6][var21][var34];
                                int var41 = field23[var6][var21 + 1][var34];
                                int var42 = field23[var6][var21 + 1][var34 + 1];
                                int var43 = field23[var6][var21][var34 + 1];
                                int var44 = Statics.field189[var21][var34];
                                int var45 = Statics.field189[var21 + 1][var34];
                                int var46 = Statics.field189[var21 + 1][var34 + 1];
                                int var47 = Statics.field189[var21][var34 + 1];
                                int var48 = -1;
                                int var49 = -1;
                                if (var38 > 0) {
                                    int var50 = var29 * 256 / var32;
                                    int var51 = var30 / var33;
                                    int var52 = var31 / var33;
                                    var48 = method699(var50, var51, var52);
                                    int var53 = field32 + var50 & 0xFF;
                                    int var54 = field19 + var52;
                                    if (var54 < 0) {
                                        var54 = 0;
                                    } else if (var54 > 255) {
                                        var54 = 255;
                                    }
                                    var49 = method699(var53, var51, var54);
                                }
                                if (var6 > 0) {
                                    boolean var55 = true;
                                    if (var38 == 0 && Statics.field22[var6][var21][var34] != 0) {
                                        var55 = false;
                                    }
                                    if (var39 > 0 && !Statics.method2467(var39 - 1).field2407) {
                                        var55 = false;
                                    }
                                    if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
                                        Statics.field704[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var56 = 0;
                                if (var49 != -1) {
                                    var56 = class173.field2521[method1014(var49, 96)];
                                }
                                if (var39 == 0) {
                                    arg0.method570(var6, var21, var34, 0, 0, -1, var40, var41, var42, var43, method1014(var48, var44), method1014(var48, var45), method1014(var48, var46), method1014(var48, var47), 0, 0, 0, 0, var56, 0);
                                } else {
                                    int var57 = Statics.field22[var6][var21][var34] + 1;
                                    byte var58 = Statics.field711[var6][var21][var34];
                                    class159 var59 = Statics.method2467(var39 - 1);
                                    int var60 = var59.field2406;
                                    int var61;
                                    int var62;
                                    if (var60 >= 0) {
                                        var61 = Statics.field2541.method704(var60);
                                        var62 = -1;
                                    } else if (var59.field2403 == 16711935) {
                                        var62 = -2;
                                        var60 = -1;
                                        var61 = -2;
                                    } else {
                                        var62 = method699(var59.field2404, var59.field2410, var59.field2411);
                                        int var63 = field32 + var59.field2404 & 0xFF;
                                        int var64 = field19 + var59.field2411;
                                        if (var64 < 0) {
                                            var64 = 0;
                                        } else if (var64 > 255) {
                                            var64 = 255;
                                        }
                                        var61 = method699(var63, var59.field2410, var64);
                                    }
                                    int var65 = 0;
                                    if (var61 != -2) {
                                        var65 = class173.field2521[method2504(var61, 96)];
                                    }
                                    if (var59.field2408 != -1) {
                                        int var66 = field32 + var59.field2412 & 0xFF;
                                        int var67 = field19 + var59.field2414;
                                        if (var67 < 0) {
                                            var67 = 0;
                                        } else if (var67 > 255) {
                                            var67 = 255;
                                        }
                                        int var68 = method699(var66, var59.field2413, var67);
                                        var65 = class173.field2521[method2504(var68, 96)];
                                    }
                                    arg0.method570(var6, var21, var34, var57, var58, var60, var40, var41, var42, var43, method1014(var48, var44), method1014(var48, var45), method1014(var48, var46), method1014(var48, var47), method2504(var62, var44), method2504(var62, var45), method2504(var62, var46), method2504(var62, var47), var56, var65);
                                }
                            }
                        }
                    }
                }
            }
            for (int var69 = 1; var69 < 103; var69++) {
                for (int var70 = 1; var70 < 103; var70++) {
                    int var75;
                    if ((field18[var6][var70][var69] & 0x8) != 0) {
                        var75 = 0;
                    } else if (var6 <= 0 || (field18[1][var70][var69] & 0x2) == 0) {
                        var75 = var6;
                    } else {
                        var75 = var6 - 1;
                    }
                    arg0.method653(var6, var70, var69, var75);
                }
            }
            Statics.field20[var6] = (byte[][]) null;
            Statics.field21[var6] = (byte[][]) null;
            Statics.field22[var6] = (byte[][]) null;
            Statics.field711[var6] = (byte[][]) null;
            Statics.field1720[var6] = (byte[][]) null;
        }
        arg0.method685(-50, -10, -50);
        for (int var76 = 0; var76 < 104; var76++) {
            for (int var77 = 0; var77 < 104; var77++) {
                if ((field18[1][var76][var77] & 0x2) == 2) {
                    arg0.method546(var76, var77);
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
                        if ((Statics.field704[var82][var84][var83] & var78) != 0) {
                            int var85 = var83;
                            int var86 = var83;
                            int var87 = var82;
                            int var88 = var82;
                            while (var85 > 0 && (Statics.field704[var82][var84][var85 - 1] & var78) != 0) {
                                var85--;
                            }
                            while (var86 < 104 && (Statics.field704[var82][var84][var86 + 1] & var78) != 0) {
                                var86++;
                            }
                            label351: while (var87 > 0) {
                                for (int var89 = var85; var89 <= var86; var89++) {
                                    if ((Statics.field704[var87 - 1][var84][var89] & var78) == 0) {
                                        break label351;
                                    }
                                }
                                var87--;
                            }
                            label340: while (var88 < var81) {
                                for (int var90 = var85; var90 <= var86; var90++) {
                                    if ((Statics.field704[var88 + 1][var84][var90] & var78) == 0) {
                                        break label340;
                                    }
                                }
                                var88++;
                            }
                            int var91 = (var88 + 1 - var87) * (var86 - var85 + 1);
                            if (var91 >= 8) {
                                short var92 = 240;
                                int var93 = field23[var88][var84][var85] - var92;
                                int var94 = field23[var87][var84][var85];
                                class45.method549(var81, 1, var84 * 128, var84 * 128, var85 * 128, var86 * 128 + 128, var93, var94);
                                for (int var95 = var87; var95 <= var88; var95++) {
                                    for (int var96 = var85; var96 <= var86; var96++) {
                                        Statics.field704[var95][var84][var96] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field704[var82][var84][var83] & var79) != 0) {
                            int var97 = var84;
                            int var98 = var84;
                            int var99 = var82;
                            int var100 = var82;
                            while (var97 > 0 && (Statics.field704[var82][var97 - 1][var83] & var79) != 0) {
                                var97--;
                            }
                            while (var98 < 104 && (Statics.field704[var82][var98 + 1][var83] & var79) != 0) {
                                var98++;
                            }
                            label404: while (var99 > 0) {
                                for (int var101 = var97; var101 <= var98; var101++) {
                                    if ((Statics.field704[var99 - 1][var101][var83] & var79) == 0) {
                                        break label404;
                                    }
                                }
                                var99--;
                            }
                            label393: while (var100 < var81) {
                                for (int var102 = var97; var102 <= var98; var102++) {
                                    if ((Statics.field704[var100 + 1][var102][var83] & var79) == 0) {
                                        break label393;
                                    }
                                }
                                var100++;
                            }
                            int var103 = (var100 + 1 - var99) * (var98 - var97 + 1);
                            if (var103 >= 8) {
                                short var104 = 240;
                                int var105 = field23[var100][var97][var83] - var104;
                                int var106 = field23[var99][var97][var83];
                                class45.method549(var81, 2, var97 * 128, var98 * 128 + 128, var83 * 128, var83 * 128, var105, var106);
                                for (int var107 = var99; var107 <= var100; var107++) {
                                    for (int var108 = var97; var108 <= var98; var108++) {
                                        Statics.field704[var107][var108][var83] &= ~var79;
                                    }
                                }
                            }
                        }
                        if ((Statics.field704[var82][var84][var83] & var80) != 0) {
                            int var109 = var84;
                            int var110 = var84;
                            int var111 = var83;
                            int var112 = var83;
                            while (var111 > 0 && (Statics.field704[var82][var84][var111 - 1] & var80) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field704[var82][var84][var112 + 1] & var80) != 0) {
                                var112++;
                            }
                            label457: while (var109 > 0) {
                                for (int var113 = var111; var113 <= var112; var113++) {
                                    if ((Statics.field704[var82][var109 - 1][var113] & var80) == 0) {
                                        break label457;
                                    }
                                }
                                var109--;
                            }
                            label446: while (var110 < 104) {
                                for (int var114 = var111; var114 <= var112; var114++) {
                                    if ((Statics.field704[var82][var110 + 1][var114] & var80) == 0) {
                                        break label446;
                                    }
                                }
                                var110++;
                            }
                            if ((var110 - var109 + 1) * (var112 - var111 + 1) >= 4) {
                                int var115 = field23[var82][var109][var111];
                                class45.method549(var81, 4, var109 * 128, var110 * 128 + 128, var111 * 128, var112 * 128 + 128, var115, var115);
                                for (int var116 = var109; var116 <= var110; var116++) {
                                    for (int var117 = var111; var117 <= var112; var117++) {
                                        Statics.field704[var82][var116][var117] &= ~var80;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("co.k(IIB)I")
    public static final int method1229(int arg0, int arg1) {
        int var2 = method2048(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2048(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2048(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("client.u(IIIB)I")
    public static final int method2048(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2305(var3, var5);
        int var8 = method2305(var3 + 1, var5);
        int var9 = method2305(var3, var5 + 1);
        int var10 = method2305(var3 + 1, var5 + 1);
        int var11 = 65536 - class173.field2545[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class173.field2545[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class173.field2545[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ef.v(III)I")
    public static final int method2305(int arg0, int arg1) {
        int var2 = method490(arg0 - 1, arg1 - 1) + method490(arg0 + 1, arg1 - 1) + method490(arg0 - 1, arg1 + 1) + method490(arg0 + 1, arg1 + 1);
        int var3 = method490(arg0 - 1, arg1) + method490(arg0 + 1, arg1) + method490(arg0, arg1 - 1) + method490(arg0, arg1 + 1);
        int var4 = method490(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ad.f(III)I")
    public static final int method490(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cs.s(III)I")
    public static final int method1014(int arg0, int arg1) {
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

    @ObfuscatedName("ft.j(III)I")
    public static final int method2504(int arg0, int arg1) {
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

    @ObfuscatedName("ah.e(IIIB)I")
    public static final int method699(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("fu.t(III)Z")
    public static final boolean method2899(int arg0, int arg1) {
        class154 var2 = class154.method886(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method2373(arg1);
    }
}
