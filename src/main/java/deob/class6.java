package deob;

@ObfuscatedName("e")
public final class class6 {

    @ObfuscatedName("e.j")
    public static int[][][] field92 = new int[4][105][105];

    @ObfuscatedName("e.h")
    public static byte[][][] field85 = new byte[4][104][104];

    @ObfuscatedName("e.m")
    public static int field86 = 99;

    @ObfuscatedName("e.y")
    public static final int[] field93 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("e.w")
    public static final int[] field94 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("e.g")
    public static final int[] field95 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("e.s")
    public static final int[] field96 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("e.k")
    public static final int[] field97 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("e.o")
    public static final int[] field98 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("e.v")
    public static int field99 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("e.f")
    public static int field100 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.j(B)V")
    public static void method627() {
        Statics.field101 = (byte[][][]) null;
        Statics.field88 = (byte[][][]) null;
        Statics.field1139 = (byte[][][]) null;
        Statics.field89 = (byte[][][]) null;
        Statics.field1202 = (int[][][]) null;
        Statics.field3010 = (byte[][][]) null;
        Statics.field90 = (int[][]) null;
        Statics.field74 = null;
        Statics.field91 = null;
        Statics.field1598 = null;
        Statics.field1890 = null;
        Statics.field1896 = null;
    }

    @ObfuscatedName("o.h(IIIII)V")
    public static final void method593(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3010[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field92[0][var5][var4] = field92[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field92[0][var5][var4] = field92[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field92[0][var5][var4] = field92[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field92[0][var5][var4] = field92[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.m([BIIII[Ldj;I)V")
    public static final void method756(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class109[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1880[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class120 var9 = new class120(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1788(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ei.z([BIIIIIII[Ldj;I)V")
    public static final void method2716(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class109[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1880[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class120 var11 = new class120(arg0);
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
                        method1788(var11, arg1, arg2 + var22, arg3 + class178.method2754(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1788(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.x(Ldx;IIIIIII)V")
    public static final void method1788(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2361();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2361();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2361();
                }
            }
            return;
        }
        field85[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2361();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field92[0][arg2][arg3] = -Statics.method940(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field92[arg1][arg2][arg3] = field92[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2361();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field92[0][arg2][arg3] = -var8 * 8;
                } else {
                    field92[arg1][arg2][arg3] = field92[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field88[arg1][arg2][arg3] = arg0.method2531();
                Statics.field1139[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field89[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field85[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field101[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("w.e([BIII)Z")
    public static final boolean method240(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class120 var4 = new class120(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2373();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2373();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2361() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method1789(var5);
                        if (var13 != 22 || !client.field304 || var16.field918 != 0 || var16.field923 == 1 || var16.field916) {
                            if (!var16.method774()) {
                                client.field333++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2373();
                if (var9 == 0) {
                    break;
                }
                var4.method2361();
            }
        }
    }

    @ObfuscatedName("x.i([BIIIIIIILcj;[Ldj;I)V")
    public static final void method36(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class87 arg8, class109[] arg9) {
        class120 var10 = new class120(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2373();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2373();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2361();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class41 var21 = class41.method1789(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field921;
                    int var27 = var21.field922;
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
                    int var32 = arg3 + class178.method4(var16 & 0x7, var15 & 0x7, arg7, var21.field921, var21.field922, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field85[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class109 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2899(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ed.c(IIIIIILcj;Ldj;B)V")
    public static final void method2899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, class109 arg7) {
        if (client.field304 && (field85[0][arg1][arg2] & 0x2) == 0 && (field85[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field86) {
            field86 = arg0;
        }
        class41 var8 = class41.method1789(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field922;
            var10 = var8.field921;
        } else {
            var9 = var8.field921;
            var10 = var8.field922;
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
        int[][] var15 = field92[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field918 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field946 == 1) {
            var20 += 256;
        }
        if (var8.method782()) {
            class24 var21 = new class24();
            var21.field586 = arg0;
            var21.field585 = arg1 * 128;
            var21.field588 = arg2 * 128;
            int var22 = var8.field921;
            int var23 = var8.field922;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field922;
                var23 = var8.field921;
            }
            var21.field589 = (arg1 + var22) * 128;
            var21.field596 = (arg2 + var23) * 128;
            var21.field603 = var8.field952;
            var21.field591 = var8.field951 * 128;
            var21.field597 = var8.field915;
            var21.field587 = var8.field953;
            var21.field600 = var8.field954;
            if (var8.field957 != null) {
                var21.field590 = var8;
                var21.method585();
            }
            class24.field594.method3535(var21);
            if (var21.field600 != null) {
                var21.field592 = var21.field597 + (int) (Math.random() * (double) (var21.field587 - var21.field597));
            }
        }
        if (arg5 == 22) {
            if (!client.field304 || var8.field918 != 0 || var8.field923 == 1 || var8.field916) {
                class86 var24;
                if (var8.field929 == -1 && var8.field957 == null) {
                    var24 = var8.method778(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
                }
                arg6.method1797(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field923 == 1 && arg7 != null) {
                    arg7.method2246(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class86 var47;
            if (var8.field929 == -1 && var8.field957 == null) {
                var47 = var8.method778(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            if (var47 != null && arg6.method1923(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field937) {
                int var48 = 15;
                if (var47 instanceof class106) {
                    var48 = ((class106) var47).method2189() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field3010[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field3010[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field923 != 0 && arg7 != null) {
                arg7.method2243(arg1, arg2, var9, var10, var8.field924);
            }
        } else if (arg5 >= 12) {
            class86 var25;
            if (var8.field929 == -1 && var8.field957 == null) {
                var25 = var8.method778(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1923(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1202[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field923 != 0 && arg7 != null) {
                arg7.method2243(arg1, arg2, var9, var10, var8.field924);
            }
        } else if (arg5 == 0) {
            class86 var26;
            if (var8.field929 == -1 && var8.field957 == null) {
                var26 = var8.method778(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1799(arg0, arg1, arg2, var16, var26, (class86) null, field93[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field937) {
                    Statics.field3010[arg0][arg1][arg2] = 50;
                    Statics.field3010[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field928) {
                    Statics.field1202[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field937) {
                    Statics.field3010[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3010[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field928) {
                    Statics.field1202[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field937) {
                    Statics.field3010[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3010[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field928) {
                    Statics.field1202[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field937) {
                    Statics.field3010[arg0][arg1][arg2] = 50;
                    Statics.field3010[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field928) {
                    Statics.field1202[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field923 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field924);
            }
            if (var8.field930 != 16) {
                arg6.method1957(arg0, arg1, arg2, var8.field930);
            }
        } else if (arg5 == 1) {
            class86 var27;
            if (var8.field929 == -1 && var8.field957 == null) {
                var27 = var8.method778(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1799(arg0, arg1, arg2, var16, var27, (class86) null, field94[arg4], 0, var19, var20);
            if (var8.field937) {
                if (arg4 == 0) {
                    Statics.field3010[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3010[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3010[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3010[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field923 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field924);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class86 var29;
            class86 var30;
            if (var8.field929 == -1 && var8.field957 == null) {
                var29 = var8.method778(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method778(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field929, true, (class86) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1799(arg0, arg1, arg2, var16, var29, var30, field93[arg4], field93[var28], var19, var20);
            if (var8.field928) {
                if (arg4 == 0) {
                    Statics.field1202[arg0][arg1][arg2] |= 0x249;
                    Statics.field1202[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1202[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1202[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1202[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1202[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1202[arg0][arg1][arg2] |= 0x492;
                    Statics.field1202[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field923 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field924);
            }
            if (var8.field930 != 16) {
                arg6.method1957(arg0, arg1, arg2, var8.field930);
            }
        } else if (arg5 == 3) {
            class86 var31;
            if (var8.field929 == -1 && var8.field957 == null) {
                var31 = var8.method778(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1799(arg0, arg1, arg2, var16, var31, (class86) null, field94[arg4], 0, var19, var20);
            if (var8.field937) {
                if (arg4 == 0) {
                    Statics.field3010[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3010[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3010[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3010[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field923 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field924);
            }
        } else if (arg5 == 9) {
            class86 var32;
            if (var8.field929 == -1 && var8.field957 == null) {
                var32 = var8.method778(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1923(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field923 != 0 && arg7 != null) {
                arg7.method2243(arg1, arg2, var9, var10, var8.field924);
            }
            if (var8.field930 != 16) {
                arg6.method1957(arg0, arg1, arg2, var8.field930);
            }
        } else if (arg5 == 4) {
            class86 var33;
            if (var8.field929 == -1 && var8.field957 == null) {
                var33 = var8.method778(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var33, (class86) null, field93[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1920(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method1789(var35 >> 14 & 0x7FFF).field930;
            }
            class86 var36;
            if (var8.field929 == -1 && var8.field957 == null) {
                var36 = var8.method778(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var36, (class86) null, field93[arg4], 0, field95[arg4] * var34, field96[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1920(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method1789(var38 >> 14 & 0x7FFF).field930 / 2;
            }
            class86 var39;
            if (var8.field929 == -1 && var8.field957 == null) {
                var39 = var8.method778(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var39, (class86) null, 256, arg4, field97[arg4] * var37, field98[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class86 var41;
            if (var8.field929 == -1 && var8.field957 == null) {
                var41 = var8.method778(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var41, (class86) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1920(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method1789(var43 >> 14 & 0x7FFF).field930 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class86 var45;
            class86 var46;
            if (var8.field929 == -1 && var8.field957 == null) {
                var45 = var8.method778(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method778(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field929, true, (class86) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field929, true, (class86) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field97[arg4] * var42, field98[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("am.l(IIIB)I")
    public static final int method647(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method166(var3, var5);
        int var8 = method166(var3 + 1, var5);
        int var9 = method166(var3, var5 + 1);
        int var10 = method166(var3 + 1, var5 + 1);
        int var11 = method2700(var7, var8, var4, arg2);
        int var12 = method2700(var9, var10, var4, arg2);
        return method2700(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ey.u(IIIII)I")
    public static final int method2700(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class92.field1573[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("d.r(III)I")
    public static final int method166(int arg0, int arg1) {
        int var2 = method2612(arg0 - 1, arg1 - 1) + method2612(arg0 + 1, arg1 - 1) + method2612(arg0 - 1, arg1 + 1) + method2612(arg0 + 1, arg1 + 1);
        int var3 = method2612(arg0 - 1, arg1) + method2612(arg0 + 1, arg1) + method2612(arg0, arg1 - 1) + method2612(arg0, arg1 + 1);
        int var4 = method2612(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dc.a(III)I")
    public static final int method2612(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("d.d(III)I")
    public static final int method163(int arg0, int arg1) {
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

    @ObfuscatedName("fy.p(III)I")
    public static final int method3074(int arg0, int arg1) {
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

    @ObfuscatedName("e.q(IIII)I")
    public static final int method87(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("gh.b(III)Z")
    public static final boolean method3443(int arg0, int arg1) {
        class41 var2 = class41.method1789(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method776(arg1);
    }

    @ObfuscatedName("fw.t(IIIIIIILcj;Ldj;I)V")
    public static final void method2949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class87 arg7, class109 arg8) {
        class41 var9 = class41.method1789(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field922;
            var11 = var9.field921;
        } else {
            var10 = var9.field921;
            var11 = var9.field922;
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
        int[][] var16 = field92[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field918 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field946 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class86 var22;
            if (var9.field929 == -1 && var9.field957 == null) {
                var22 = var9.method788(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1797(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field923 == 1) {
                arg8.method2246(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class86 var45;
            if (var9.field929 == -1 && var9.field957 == null) {
                var45 = var9.method788(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            if (var45 != null) {
                arg7.method1923(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field923 != 0) {
                arg8.method2243(arg2, arg3, var10, var11, var9.field924);
            }
        } else if (arg6 >= 12) {
            class86 var23;
            if (var9.field929 == -1 && var9.field957 == null) {
                var23 = var9.method788(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1923(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field923 != 0) {
                arg8.method2243(arg2, arg3, var10, var11, var9.field924);
            }
        } else if (arg6 == 0) {
            class86 var24;
            if (var9.field929 == -1 && var9.field957 == null) {
                var24 = var9.method788(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1799(arg0, arg2, arg3, var17, var24, (class86) null, field93[arg5], 0, var20, var21);
            if (var9.field923 != 0) {
                arg8.method2247(arg2, arg3, arg6, arg5, var9.field924);
            }
        } else if (arg6 == 1) {
            class86 var25;
            if (var9.field929 == -1 && var9.field957 == null) {
                var25 = var9.method788(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1799(arg0, arg2, arg3, var17, var25, (class86) null, field94[arg5], 0, var20, var21);
            if (var9.field923 != 0) {
                arg8.method2247(arg2, arg3, arg6, arg5, var9.field924);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class86 var27;
            class86 var28;
            if (var9.field929 == -1 && var9.field957 == null) {
                var27 = var9.method788(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method788(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field929, true, (class86) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1799(arg0, arg2, arg3, var17, var27, var28, field93[arg5], field93[var26], var20, var21);
            if (var9.field923 != 0) {
                arg8.method2247(arg2, arg3, arg6, arg5, var9.field924);
            }
        } else if (arg6 == 3) {
            class86 var29;
            if (var9.field929 == -1 && var9.field957 == null) {
                var29 = var9.method788(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1799(arg0, arg2, arg3, var17, var29, (class86) null, field94[arg5], 0, var20, var21);
            if (var9.field923 != 0) {
                arg8.method2247(arg2, arg3, arg6, arg5, var9.field924);
            }
        } else if (arg6 == 9) {
            class86 var30;
            if (var9.field929 == -1 && var9.field957 == null) {
                var30 = var9.method788(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1923(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field923 != 0) {
                arg8.method2243(arg2, arg3, var10, var11, var9.field924);
            }
        } else if (arg6 == 4) {
            class86 var31;
            if (var9.field929 == -1 && var9.field957 == null) {
                var31 = var9.method788(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1800(arg0, arg2, arg3, var17, var31, (class86) null, field93[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1920(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class41.method1789(var33 >> 14 & 0x7FFF).field930;
            }
            class86 var34;
            if (var9.field929 == -1 && var9.field957 == null) {
                var34 = var9.method788(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1800(arg0, arg2, arg3, var17, var34, (class86) null, field93[arg5], 0, field95[arg5] * var32, field96[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1920(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class41.method1789(var36 >> 14 & 0x7FFF).field930 / 2;
            }
            class86 var37;
            if (var9.field929 == -1 && var9.field957 == null) {
                var37 = var9.method788(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1800(arg0, arg2, arg3, var17, var37, (class86) null, 256, arg5, field97[arg5] * var35, field98[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class86 var39;
            if (var9.field929 == -1 && var9.field957 == null) {
                var39 = var9.method788(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1800(arg0, arg2, arg3, var17, var39, (class86) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1920(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class41.method1789(var41 >> 14 & 0x7FFF).field930 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class86 var43;
            class86 var44;
            if (var9.field929 == -1 && var9.field957 == null) {
                var43 = var9.method788(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method788(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field929, true, (class86) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field929, true, (class86) null);
            }
            arg7.method1800(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field97[arg5] * var40, field98[arg5] * var40, var20, var21);
        }
    }
}
