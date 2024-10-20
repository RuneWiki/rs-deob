package deob;

@ObfuscatedName("y")
public final class class9 {

    @ObfuscatedName("y.b")
    public static int[][][] field149 = new int[4][105][105];

    @ObfuscatedName("y.c")
    public static byte[][][] field139 = new byte[4][104][104];

    @ObfuscatedName("y.j")
    public static int field140 = 99;

    @ObfuscatedName("y.d")
    public static final int[] field147 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("y.m")
    public static final int[] field148 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("y.f")
    public static final int[] field160 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("y.a")
    public static final int[] field150 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("y.h")
    public static final int[] field143 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("y.p")
    public static final int[] field152 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("y.e")
    public static int field153 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("y.r")
    public static int field142 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.b(I)V")
    public static void method872() {
        field140 = 99;
        Statics.field141 = new byte[4][104][104];
        Statics.field2490 = new byte[4][104][104];
        Statics.field154 = new byte[4][104][104];
        Statics.field1330 = new byte[4][104][104];
        Statics.field2496 = new int[4][105][105];
        Statics.field145 = new byte[4][105][105];
        Statics.field2120 = new int[105][105];
        Statics.field198 = new int[104];
        Statics.field144 = new int[104];
        Statics.field1028 = new int[104];
        Statics.field1464 = new int[104];
        Statics.field146 = new int[104];
    }

    @ObfuscatedName("ap.c(IIIII)V")
    public static final void method780(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field145[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field149[0][var5][var4] = field149[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field149[0][var5][var4] = field149[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field149[0][var5][var4] = field149[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field149[0][var5][var4] = field149[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dn.j([BIIII[Ldz;I)V")
    public static final void method2190(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class130[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2063[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class127 var9 = new class127(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method47(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ae.i([BIIIIIII[Ldz;I)V")
    public static final void method547(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class130[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2063[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        method47(var11, arg1, arg2 + var22, arg3 + class161.method1370(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method47(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.k(IIII)V")
    public static final void method2166(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field149[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field149[arg0][arg1][arg2 + var5] = field149[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field149[arg0][arg1 + var6][arg2] = field149[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field149[arg0][arg1 - 1][arg2] != 0) {
            field149[arg0][arg1][arg2] = field149[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field149[arg0][arg1][arg2 - 1] != 0) {
            field149[arg0][arg1][arg2] = field149[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field149[arg0][arg1 - 1][arg2 - 1] != 0) {
            field149[arg0][arg1][arg2] = field149[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("q.q(Ldv;IIIIIII)V")
    public static final void method47(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2416();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2416();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2416();
                }
            }
            return;
        }
        field139[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2416();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field149[0][arg2][arg3] = -Statics.method37(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field149[arg1][arg2][arg3] = field149[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2416();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field149[0][arg2][arg3] = -var8 * 8;
                } else {
                    field149[arg1][arg2][arg3] = field149[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2490[arg1][arg2][arg3] = arg0.method2397();
                Statics.field154[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1330[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field139[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field141[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("w.t([BIIB)Z")
    public static final boolean method114(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class127 var4 = new class127(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2409();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2409();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2416() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method46(var5);
                        if (var13 != 22 || !client.field643 || var16.field854 != 0 || var16.field827 == 1 || var16.field848) {
                            if (!var16.method625()) {
                                client.field536++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2409();
                if (var9 == 0) {
                    break;
                }
                var4.method2416();
            }
        }
    }

    @ObfuscatedName("fd.y(IIIIIILck;Ldz;I)V")
    public static final void method3086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field643 && (field139[0][arg1][arg2] & 0x2) == 0) {
            if ((field139[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field139[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field139[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field531 != var8) {
                return;
            }
        }
        if (arg0 < field140) {
            field140 = arg0;
        }
        class32 var9 = class32.method46(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field826;
            var11 = var9.field825;
        } else {
            var10 = var9.field825;
            var11 = var9.field826;
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
        int[][] var16 = field149[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field854 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field850 == 1) {
            var21 += 256;
        }
        if (var9.method631()) {
            class7 var22 = new class7();
            var22.field110 = arg0;
            var22.field117 = arg1 * 128;
            var22.field120 = arg2 * 128;
            int var23 = var9.field825;
            int var24 = var9.field826;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field826;
                var24 = var9.field825;
            }
            var22.field113 = (arg1 + var23) * 128;
            var22.field114 = (arg2 + var24) * 128;
            var22.field124 = var9.field842;
            var22.field115 = var9.field855 * 128;
            var22.field118 = var9.field829;
            var22.field111 = var9.field860;
            var22.field119 = var9.field844;
            if (var9.field851 != null) {
                var22.field123 = var9;
                var22.method62();
            }
            class7.field112.method3261(var22);
            if (var22.field119 != null) {
                var22.field121 = var22.field118 + (int) (Math.random() * (double) (var22.field111 - var22.field118));
            }
        }
        if (arg5 == 22) {
            if (!client.field643 || var9.field854 != 0 || var9.field827 == 1 || var9.field848) {
                class94 var25;
                if (var9.field820 == -1 && var9.field851 == null) {
                    var25 = var9.method662(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
                }
                arg6.method1865(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field827 == 1 && arg7 != null) {
                    arg7.method2657(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var48;
            if (var9.field820 == -1 && var9.field851 == null) {
                var48 = var9.method662(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            if (var48 != null && arg6.method1842(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field841) {
                int var49 = 15;
                if (var48 instanceof class112) {
                    var49 = ((class112) var48).method2235() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field145[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field145[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field827 != 0 && arg7 != null) {
                arg7.method2634(arg1, arg2, var10, var11, var9.field858);
            }
        } else if (arg5 >= 12) {
            class94 var26;
            if (var9.field820 == -1 && var9.field851 == null) {
                var26 = var9.method662(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1842(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2496[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field827 != 0 && arg7 != null) {
                arg7.method2634(arg1, arg2, var10, var11, var9.field858);
            }
        } else if (arg5 == 0) {
            class94 var27;
            if (var9.field820 == -1 && var9.field851 == null) {
                var27 = var9.method662(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1824(arg0, arg1, arg2, var17, var27, (class94) null, field147[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field841) {
                    Statics.field145[arg0][arg1][arg2] = 50;
                    Statics.field145[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field832) {
                    Statics.field2496[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field841) {
                    Statics.field145[arg0][arg1][arg2 + 1] = 50;
                    Statics.field145[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field832) {
                    Statics.field2496[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field841) {
                    Statics.field145[arg0][arg1 + 1][arg2] = 50;
                    Statics.field145[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field832) {
                    Statics.field2496[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field841) {
                    Statics.field145[arg0][arg1][arg2] = 50;
                    Statics.field145[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field832) {
                    Statics.field2496[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field827 != 0 && arg7 != null) {
                arg7.method2666(arg1, arg2, arg5, arg4, var9.field858);
            }
            if (var9.field834 != 16) {
                arg6.method1832(arg0, arg1, arg2, var9.field834);
            }
        } else if (arg5 == 1) {
            class94 var28;
            if (var9.field820 == -1 && var9.field851 == null) {
                var28 = var9.method662(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1824(arg0, arg1, arg2, var17, var28, (class94) null, field148[arg4], 0, var20, var21);
            if (var9.field841) {
                if (arg4 == 0) {
                    Statics.field145[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field145[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field145[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field145[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field827 != 0 && arg7 != null) {
                arg7.method2666(arg1, arg2, arg5, arg4, var9.field858);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class94 var30;
            class94 var31;
            if (var9.field820 == -1 && var9.field851 == null) {
                var30 = var9.method662(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method662(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field820, true, (class94) null);
                var31 = new class14(arg3, 2, var29, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1824(arg0, arg1, arg2, var17, var30, var31, field147[arg4], field147[var29], var20, var21);
            if (var9.field832) {
                if (arg4 == 0) {
                    Statics.field2496[arg0][arg1][arg2] |= 0x249;
                    Statics.field2496[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2496[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2496[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2496[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2496[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2496[arg0][arg1][arg2] |= 0x492;
                    Statics.field2496[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field827 != 0 && arg7 != null) {
                arg7.method2666(arg1, arg2, arg5, arg4, var9.field858);
            }
            if (var9.field834 != 16) {
                arg6.method1832(arg0, arg1, arg2, var9.field834);
            }
        } else if (arg5 == 3) {
            class94 var32;
            if (var9.field820 == -1 && var9.field851 == null) {
                var32 = var9.method662(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1824(arg0, arg1, arg2, var17, var32, (class94) null, field148[arg4], 0, var20, var21);
            if (var9.field841) {
                if (arg4 == 0) {
                    Statics.field145[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field145[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field145[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field145[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field827 != 0 && arg7 != null) {
                arg7.method2666(arg1, arg2, arg5, arg4, var9.field858);
            }
        } else if (arg5 == 9) {
            class94 var33;
            if (var9.field820 == -1 && var9.field851 == null) {
                var33 = var9.method662(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1842(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field827 != 0 && arg7 != null) {
                arg7.method2634(arg1, arg2, var10, var11, var9.field858);
            }
            if (var9.field834 != 16) {
                arg6.method1832(arg0, arg1, arg2, var9.field834);
            }
        } else if (arg5 == 4) {
            class94 var34;
            if (var9.field820 == -1 && var9.field851 == null) {
                var34 = var9.method662(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var34, (class94) null, field147[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1882(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method46(var36 >> 14 & 0x7FFF).field834;
            }
            class94 var37;
            if (var9.field820 == -1 && var9.field851 == null) {
                var37 = var9.method662(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var37, (class94) null, field147[arg4], 0, field160[arg4] * var35, field150[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1882(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class32.method46(var39 >> 14 & 0x7FFF).field834 / 2;
            }
            class94 var40;
            if (var9.field820 == -1 && var9.field851 == null) {
                var40 = var9.method662(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var40, (class94) null, 256, arg4, field143[arg4] * var38, field152[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            if (var9.field820 == -1 && var9.field851 == null) {
                var42 = var9.method662(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var42, (class94) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1882(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class32.method46(var44 >> 14 & 0x7FFF).field834 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class94 var46;
            class94 var47;
            if (var9.field820 == -1 && var9.field851 == null) {
                var46 = var9.method662(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method662(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field820, true, (class94) null);
                var47 = new class14(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field820, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field143[arg4] * var43, field152[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("bt.g(IIIS)I")
    public static final int method1404(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method27(var3, var5);
        int var8 = method27(var3 + 1, var5);
        int var9 = method27(var3, var5 + 1);
        int var10 = method27(var3 + 1, var5 + 1);
        int var11 = method823(var7, var8, var4, arg2);
        int var12 = method823(var9, var10, var4, arg2);
        return method823(var11, var12, var6, arg2);
    }

    @ObfuscatedName("az.s(IIIII)I")
    public static final int method823(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1801[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("i.n(IIB)I")
    public static final int method27(int arg0, int arg1) {
        int var2 = method1529(arg0 - 1, arg1 - 1) + method1529(arg0 + 1, arg1 - 1) + method1529(arg0 - 1, arg1 + 1) + method1529(arg0 + 1, arg1 + 1);
        int var3 = method1529(arg0 - 1, arg1) + method1529(arg0 + 1, arg1) + method1529(arg0, arg1 - 1) + method1529(arg0, arg1 + 1);
        int var4 = method1529(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bs.x(IIB)I")
    public static final int method1529(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("i.o(IIB)I")
    public static final int method25(int arg0, int arg1) {
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

    @ObfuscatedName("n.l(III)I")
    public static final int method148(int arg0, int arg1) {
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

    @ObfuscatedName("do.u(IIII)I")
    public static final int method2323(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("at.z(IIIIIIILck;Ldz;I)V")
    public static final void method667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class130 arg8) {
        class32 var9 = class32.method46(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field826;
            var11 = var9.field825;
        } else {
            var10 = var9.field825;
            var11 = var9.field826;
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
        int[][] var16 = field149[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field854 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field850 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field820 == -1 && var9.field851 == null) {
                var22 = var9.method656(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1865(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field827 == 1) {
                arg8.method2657(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field820 == -1 && var9.field851 == null) {
                var45 = var9.method656(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1842(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field827 != 0) {
                arg8.method2634(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field820 == -1 && var9.field851 == null) {
                var23 = var9.method656(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1842(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field827 != 0) {
                arg8.method2634(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field820 == -1 && var9.field851 == null) {
                var24 = var9.method656(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1824(arg0, arg2, arg3, var17, var24, (class94) null, field147[arg5], 0, var20, var21);
            if (var9.field827 != 0) {
                arg8.method2666(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field820 == -1 && var9.field851 == null) {
                var25 = var9.method656(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1824(arg0, arg2, arg3, var17, var25, (class94) null, field148[arg5], 0, var20, var21);
            if (var9.field827 != 0) {
                arg8.method2666(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field820 == -1 && var9.field851 == null) {
                var27 = var9.method656(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method656(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field820, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1824(arg0, arg2, arg3, var17, var27, var28, field147[arg5], field147[var26], var20, var21);
            if (var9.field827 != 0) {
                arg8.method2666(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field820 == -1 && var9.field851 == null) {
                var29 = var9.method656(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1824(arg0, arg2, arg3, var17, var29, (class94) null, field148[arg5], 0, var20, var21);
            if (var9.field827 != 0) {
                arg8.method2666(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field820 == -1 && var9.field851 == null) {
                var30 = var9.method656(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1842(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field827 != 0) {
                arg8.method2634(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field820 == -1 && var9.field851 == null) {
                var31 = var9.method656(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1825(arg0, arg2, arg3, var17, var31, (class94) null, field147[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1882(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method46(var33 >> 14 & 0x7FFF).field834;
            }
            class94 var34;
            if (var9.field820 == -1 && var9.field851 == null) {
                var34 = var9.method656(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1825(arg0, arg2, arg3, var17, var34, (class94) null, field147[arg5], 0, field160[arg5] * var32, field150[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1882(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method46(var36 >> 14 & 0x7FFF).field834 / 2;
            }
            class94 var37;
            if (var9.field820 == -1 && var9.field851 == null) {
                var37 = var9.method656(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1825(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field143[arg5] * var35, field152[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field820 == -1 && var9.field851 == null) {
                var39 = var9.method656(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1825(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1882(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method46(var41 >> 14 & 0x7FFF).field834 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field820 == -1 && var9.field851 == null) {
                var43 = var9.method656(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method656(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field820, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field820, true, (class94) null);
            }
            arg7.method1825(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field143[arg5] * var40, field152[arg5] * var40, var20, var21);
        }
    }
}
