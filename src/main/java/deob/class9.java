package deob;

@ObfuscatedName("t")
public final class class9 {

    @ObfuscatedName("t.j")
    public static int[][][] field141 = new int[4][105][105];

    @ObfuscatedName("t.r")
    public static byte[][][] field115 = new byte[4][104][104];

    @ObfuscatedName("t.v")
    public static int field116 = 99;

    @ObfuscatedName("t.g")
    public static final int[] field136 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("t.l")
    public static final int[] field127 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("t.m")
    public static final int[] field128 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("t.b")
    public static final int[] field129 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("t.h")
    public static final int[] field122 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("t.n")
    public static final int[] field131 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("t.s")
    public static int field132 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("t.c")
    public static int field133 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.j(I)V")
    public static void method812() {
        Statics.field117 = (byte[][][]) null;
        Statics.field124 = (byte[][][]) null;
        Statics.field119 = (byte[][][]) null;
        Statics.field120 = (byte[][][]) null;
        Statics.field1355 = (int[][][]) null;
        Statics.field1998 = (byte[][][]) null;
        Statics.field121 = (int[][]) null;
        Statics.field114 = null;
        Statics.field960 = null;
        Statics.field123 = null;
        Statics.field139 = null;
        Statics.field65 = null;
    }

    @ObfuscatedName("o.r(IIIII)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1998[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field141[0][var5][var4] = field141[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field141[0][var5][var4] = field141[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field141[0][var5][var4] = field141[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field141[0][var5][var4] = field141[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.v([BIIII[Lfd;S)V")
    public static final void method692(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class164[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2737[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class127 var9 = new class127(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2935(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("w.p([BIIIIIII[Lfd;S)V")
    public static final void method168(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2737[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class127 var11 = new class127(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method2935(var11, arg1, arg2 + Statics.method1617(var13 & 0x7, var14 & 0x7, arg7), arg3 + class160.method252(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2935(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cm.e(IIIB)V")
    public static final void method2131(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field141[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field141[arg0][arg1][arg2 + var5] = field141[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field141[arg0][arg1 + var6][arg2] = field141[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field141[arg0][arg1 - 1][arg2] != 0) {
            field141[arg0][arg1][arg2] = field141[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field141[arg0][arg1][arg2 - 1] != 0) {
            field141[arg0][arg1][arg2] = field141[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field141[arg0][arg1 - 1][arg2 - 1] != 0) {
            field141[arg0][arg1][arg2] = field141[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ea.d(Ldn;IIIIIII)V")
    public static final void method2935(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2441();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2441();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2441();
                }
            }
            return;
        }
        field115[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2441();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field141[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method56(var10 + 45365, var11 + 91923, 4) - 128 + (method56(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method56(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field141[arg1][arg2][arg3] = field141[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2441();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field141[0][arg2][arg3] = -var15 * 8;
                } else {
                    field141[arg1][arg2][arg3] = field141[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field124[arg1][arg2][arg3] = arg0.method2442();
                Statics.field119[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field120[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field115[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field117[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("db.y([BIII)Z")
    public static final boolean method2366(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class127 var4 = new class127(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2454();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2454();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2441() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method606(var5);
                        if (var13 != 22 || !client.field477 || var16.field829 != 0 || var16.field854 == 1 || var16.field841) {
                            if (!var16.method637()) {
                                client.field526++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2454();
                if (var9 == 0) {
                    break;
                }
                var4.method2441();
            }
        }
    }

    @ObfuscatedName("l.x([BIILcx;[Lfd;I)V")
    public static final void method196(byte[] arg0, int arg1, int arg2, class95 arg3, class164[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2454();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2454();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2441();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field115[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class164 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1348(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ee.t([BIIIIIIILcx;[Lfd;B)V")
    public static final void method2824(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class164[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2454();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2454();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2441();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method606(var11);
                    int var22 = arg2 + class160.method2378(var16 & 0x7, var15 & 0x7, arg7, var21.field825, var21.field856, var20);
                    int var23 = arg3 + class160.method2337(var16 & 0x7, var15 & 0x7, arg7, var21.field825, var21.field856, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field115[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class164 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method1348(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bu.i(IIIIIILcx;Lfd;I)V")
    public static final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field477 && (field115[0][arg1][arg2] & 0x2) == 0) {
            if ((field115[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field115[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field115[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field523 != var8) {
                return;
            }
        }
        if (arg0 < field116) {
            field116 = arg0;
        }
        class32 var9 = class32.method606(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field856;
            var11 = var9.field825;
        } else {
            var10 = var9.field825;
            var11 = var9.field856;
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
        int[][] var16 = field141[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field829 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field851 == 1) {
            var21 += 256;
        }
        if (var9.method643()) {
            class7.method42(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field477 || var9.field829 != 0 || var9.field854 == 1 || var9.field841) {
                class94 var22;
                if (var9.field833 == -1 && var9.field857 == null) {
                    var22 = var9.method661(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
                }
                arg6.method1864(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field854 == 1 && arg7 != null) {
                    arg7.method3230(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var45;
            if (var9.field833 == -1 && var9.field857 == null) {
                var45 = var9.method661(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            if (var45 != null && arg6.method1910(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field819) {
                int var46 = 15;
                if (var45 instanceof class112) {
                    var46 = ((class112) var45).method2236() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field1998[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field1998[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field854 != 0 && arg7 != null) {
                arg7.method3202(arg1, arg2, var10, var11, var9.field828);
            }
        } else if (arg5 >= 12) {
            class94 var23;
            if (var9.field833 == -1 && var9.field857 == null) {
                var23 = var9.method661(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1910(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1355[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field854 != 0 && arg7 != null) {
                arg7.method3202(arg1, arg2, var10, var11, var9.field828);
            }
        } else if (arg5 == 0) {
            class94 var24;
            if (var9.field833 == -1 && var9.field857 == null) {
                var24 = var9.method661(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1866(arg0, arg1, arg2, var17, var24, (class94) null, field136[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field819) {
                    Statics.field1998[arg0][arg1][arg2] = 50;
                    Statics.field1998[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field832) {
                    Statics.field1355[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field819) {
                    Statics.field1998[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1998[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field832) {
                    Statics.field1355[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field819) {
                    Statics.field1998[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1998[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field832) {
                    Statics.field1355[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field819) {
                    Statics.field1998[arg0][arg1][arg2] = 50;
                    Statics.field1998[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field832) {
                    Statics.field1355[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field854 != 0 && arg7 != null) {
                arg7.method3201(arg1, arg2, arg5, arg4, var9.field828);
            }
            if (var9.field848 != 16) {
                arg6.method1874(arg0, arg1, arg2, var9.field848);
            }
        } else if (arg5 == 1) {
            class94 var25;
            if (var9.field833 == -1 && var9.field857 == null) {
                var25 = var9.method661(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1866(arg0, arg1, arg2, var17, var25, (class94) null, field127[arg4], 0, var20, var21);
            if (var9.field819) {
                if (arg4 == 0) {
                    Statics.field1998[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1998[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1998[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1998[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field854 != 0 && arg7 != null) {
                arg7.method3201(arg1, arg2, arg5, arg4, var9.field828);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field833 == -1 && var9.field857 == null) {
                var27 = var9.method661(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method661(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
                var28 = new class14(arg3, 2, var26, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1866(arg0, arg1, arg2, var17, var27, var28, field136[arg4], field136[var26], var20, var21);
            if (var9.field832) {
                if (arg4 == 0) {
                    Statics.field1355[arg0][arg1][arg2] |= 0x249;
                    Statics.field1355[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1355[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1355[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1355[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1355[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1355[arg0][arg1][arg2] |= 0x492;
                    Statics.field1355[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field854 != 0 && arg7 != null) {
                arg7.method3201(arg1, arg2, arg5, arg4, var9.field828);
            }
            if (var9.field848 != 16) {
                arg6.method1874(arg0, arg1, arg2, var9.field848);
            }
        } else if (arg5 == 3) {
            class94 var29;
            if (var9.field833 == -1 && var9.field857 == null) {
                var29 = var9.method661(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1866(arg0, arg1, arg2, var17, var29, (class94) null, field127[arg4], 0, var20, var21);
            if (var9.field819) {
                if (arg4 == 0) {
                    Statics.field1998[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1998[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1998[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1998[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field854 != 0 && arg7 != null) {
                arg7.method3201(arg1, arg2, arg5, arg4, var9.field828);
            }
        } else if (arg5 == 9) {
            class94 var30;
            if (var9.field833 == -1 && var9.field857 == null) {
                var30 = var9.method661(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1910(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field854 != 0 && arg7 != null) {
                arg7.method3202(arg1, arg2, var10, var11, var9.field828);
            }
            if (var9.field848 != 16) {
                arg6.method1874(arg0, arg1, arg2, var9.field848);
            }
        } else if (arg5 == 4) {
            class94 var31;
            if (var9.field833 == -1 && var9.field857 == null) {
                var31 = var9.method661(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1867(arg0, arg1, arg2, var17, var31, (class94) null, field136[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1997(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class32.method606(var33 >> 14 & 0x7FFF).field848;
            }
            class94 var34;
            if (var9.field833 == -1 && var9.field857 == null) {
                var34 = var9.method661(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1867(arg0, arg1, arg2, var17, var34, (class94) null, field136[arg4], 0, field128[arg4] * var32, field129[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1997(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method606(var36 >> 14 & 0x7FFF).field848 / 2;
            }
            class94 var37;
            if (var9.field833 == -1 && var9.field857 == null) {
                var37 = var9.method661(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1867(arg0, arg1, arg2, var17, var37, (class94) null, 256, arg4, field122[arg4] * var35, field131[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class94 var39;
            if (var9.field833 == -1 && var9.field857 == null) {
                var39 = var9.method661(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1867(arg0, arg1, arg2, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1997(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class32.method606(var41 >> 14 & 0x7FFF).field848 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field833 == -1 && var9.field857 == null) {
                var43 = var9.method661(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method661(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
                var44 = new class14(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1867(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field122[arg4] * var40, field131[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("client.z(Lcx;[Lfd;I)V")
    public static final void method542(class95 arg0, class164[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field115[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field115[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3203(var3, var4);
                        }
                    }
                }
            }
        }
        field132 += (int) (Math.random() * 5.0D) - 2;
        if (field132 < -8) {
            field132 = -8;
        }
        if (field132 > 8) {
            field132 = 8;
        }
        field133 += (int) (Math.random() * 5.0D) - 2;
        if (field133 < -16) {
            field133 = -16;
        }
        if (field133 > 16) {
            field133 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1998[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field141[var6][var11 + 1][var10] - field141[var6][var11 - 1][var10];
                    int var13 = field141[var6][var11][var10 + 1] - field141[var6][var11][var10 - 1];
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
                Statics.field114[var20] = 0;
                Statics.field960[var20] = 0;
                Statics.field123[var20] = 0;
                Statics.field139[var20] = 0;
                Statics.field65[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field117[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class33 var25 = class33.method141(var24 - 1);
                            Statics.field114[var22] += var25.field866;
                            Statics.field960[var22] += var25.field867;
                            Statics.field123[var22] += var25.field862;
                            Statics.field139[var22] += var25.field868;
                            var10002 = Statics.field65[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field117[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class33 var28 = class33.method141(var27 - 1);
                            Statics.field114[var22] -= var28.field866;
                            Statics.field960[var22] -= var28.field867;
                            Statics.field123[var22] -= var28.field862;
                            Statics.field139[var22] -= var28.field868;
                            var10002 = Statics.field65[var22]--;
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
                            var29 += Statics.field114[var35];
                            var30 += Statics.field960[var35];
                            var31 += Statics.field123[var35];
                            var32 += Statics.field139[var35];
                            var33 += Statics.field65[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field114[var36];
                            var30 -= Statics.field960[var36];
                            var31 -= Statics.field123[var36];
                            var32 -= Statics.field139[var36];
                            var33 -= Statics.field65[var36];
                        }
                        if (var34 >= 1 && var34 < 103) {
                            if (client.field477 && (field115[0][var21][var34] & 0x2) == 0) {
                                if ((field115[var6][var21][var34] & 0x10) != 0) {
                                    continue;
                                }
                                int var37;
                                if ((field115[var6][var21][var34] & 0x8) != 0) {
                                    var37 = 0;
                                } else if (var6 <= 0 || (field115[1][var21][var34] & 0x2) == 0) {
                                    var37 = var6;
                                } else {
                                    var37 = var6 - 1;
                                }
                                if (client.field523 != var37) {
                                    continue;
                                }
                            }
                            if (var6 < field116) {
                                field116 = var6;
                            }
                            int var38 = Statics.field117[var6][var21][var34] & 0xFF;
                            int var39 = Statics.field124[var6][var21][var34] & 0xFF;
                            if (var38 > 0 || var39 > 0) {
                                int var40 = field141[var6][var21][var34];
                                int var41 = field141[var6][var21 + 1][var34];
                                int var42 = field141[var6][var21 + 1][var34 + 1];
                                int var43 = field141[var6][var21][var34 + 1];
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
                                    var48 = method174(var50, var51, var52);
                                    int var53 = field132 + var50 & 0xFF;
                                    int var54 = field133 + var52;
                                    if (var54 < 0) {
                                        var54 = 0;
                                    } else if (var54 > 255) {
                                        var54 = 255;
                                    }
                                    var49 = method174(var53, var51, var54);
                                }
                                if (var6 > 0) {
                                    boolean var55 = true;
                                    if (var38 == 0 && Statics.field119[var6][var21][var34] != 0) {
                                        var55 = false;
                                    }
                                    if (var39 > 0) {
                                        int var56 = var39 - 1;
                                        class37 var57 = (class37) class37.field936.method3264((long) var56);
                                        class37 var58;
                                        if (var57 == null) {
                                            byte[] var59 = Statics.field954.method3016(4, var56);
                                            class37 var60 = new class37();
                                            if (var59 != null) {
                                                var60.method780(new class127(var59), var56);
                                            }
                                            var60.method785();
                                            class37.field936.method3257(var60, (long) var56);
                                            var58 = var60;
                                        } else {
                                            var58 = var57;
                                        }
                                        if (!var58.field940) {
                                            var55 = false;
                                        }
                                    }
                                    if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
                                        Statics.field1355[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var61 = 0;
                                if (var49 != -1) {
                                    var61 = class104.field1760[method802(var49, 96)];
                                }
                                if (var39 == 0) {
                                    arg0.method1863(var6, var21, var34, 0, 0, -1, var40, var41, var42, var43, method802(var48, var44), method802(var48, var45), method802(var48, var46), method802(var48, var47), 0, 0, 0, 0, var61, 0);
                                } else {
                                    int var62 = Statics.field119[var6][var21][var34] + 1;
                                    byte var63 = Statics.field120[var6][var21][var34];
                                    int var64 = var39 - 1;
                                    class37 var65 = (class37) class37.field936.method3264((long) var64);
                                    class37 var66;
                                    if (var65 == null) {
                                        byte[] var67 = Statics.field954.method3016(4, var64);
                                        class37 var68 = new class37();
                                        if (var67 != null) {
                                            var68.method780(new class127(var67), var64);
                                        }
                                        var68.method785();
                                        class37.field936.method3257(var68, (long) var64);
                                        var66 = var68;
                                    } else {
                                        var66 = var65;
                                    }
                                    int var70 = var66.field944;
                                    int var71;
                                    int var72;
                                    if (var70 >= 0) {
                                        var71 = Statics.field1761.method2198(var70);
                                        var72 = -1;
                                    } else if (var66.field943 == 16711935) {
                                        var72 = -2;
                                        var70 = -1;
                                        var71 = -2;
                                    } else {
                                        var72 = method174(var66.field942, var66.field949, var66.field951);
                                        int var73 = field132 + var66.field942 & 0xFF;
                                        int var74 = field133 + var66.field951;
                                        if (var74 < 0) {
                                            var74 = 0;
                                        } else if (var74 > 255) {
                                            var74 = 255;
                                        }
                                        var71 = method174(var73, var66.field949, var74);
                                    }
                                    int var75 = 0;
                                    if (var71 != -2) {
                                        var75 = class104.field1760[method2046(var71, 96)];
                                    }
                                    if (var66.field941 != -1) {
                                        int var76 = field132 + var66.field945 & 0xFF;
                                        int var77 = field133 + var66.field947;
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = method174(var76, var66.field946, var77);
                                        var75 = class104.field1760[method2046(var78, 96)];
                                    }
                                    arg0.method1863(var6, var21, var34, var62, var63, var70, var40, var41, var42, var43, method802(var48, var44), method802(var48, var45), method802(var48, var46), method802(var48, var47), method2046(var72, var44), method2046(var72, var45), method2046(var72, var46), method2046(var72, var47), var61, var75);
                                }
                            }
                        }
                    }
                }
            }
            for (int var79 = 1; var79 < 103; var79++) {
                for (int var80 = 1; var80 < 103; var80++) {
                    int var85;
                    if ((field115[var6][var80][var79] & 0x8) != 0) {
                        var85 = 0;
                    } else if (var6 <= 0 || (field115[1][var80][var79] & 0x2) == 0) {
                        var85 = var6;
                    } else {
                        var85 = var6 - 1;
                    }
                    arg0.method1862(var6, var80, var79, var85);
                }
            }
            Statics.field117[var6] = (byte[][]) null;
            Statics.field124[var6] = (byte[][]) null;
            Statics.field119[var6] = (byte[][]) null;
            Statics.field120[var6] = (byte[][]) null;
            Statics.field1998[var6] = (byte[][]) null;
        }
        arg0.method1942(-50, -10, -50);
        for (int var86 = 0; var86 < 104; var86++) {
            for (int var87 = 0; var87 < 104; var87++) {
                if ((field115[1][var86][var87] & 0x2) == 2) {
                    arg0.method1860(var86, var87);
                }
            }
        }
        int var88 = 1;
        int var89 = 2;
        int var90 = 4;
        for (int var91 = 0; var91 < 4; var91++) {
            if (var91 > 0) {
                var88 <<= 0x3;
                var89 <<= 0x3;
                var90 <<= 0x3;
            }
            for (int var92 = 0; var92 <= var91; var92++) {
                for (int var93 = 0; var93 <= 104; var93++) {
                    for (int var94 = 0; var94 <= 104; var94++) {
                        if ((Statics.field1355[var92][var94][var93] & var88) != 0) {
                            int var95 = var93;
                            int var96 = var93;
                            int var97 = var92;
                            int var98 = var92;
                            while (var95 > 0 && (Statics.field1355[var92][var94][var95 - 1] & var88) != 0) {
                                var95--;
                            }
                            while (var96 < 104 && (Statics.field1355[var92][var94][var96 + 1] & var88) != 0) {
                                var96++;
                            }
                            label369: while (var97 > 0) {
                                for (int var99 = var95; var99 <= var96; var99++) {
                                    if ((Statics.field1355[var97 - 1][var94][var99] & var88) == 0) {
                                        break label369;
                                    }
                                }
                                var97--;
                            }
                            label358: while (var98 < var91) {
                                for (int var100 = var95; var100 <= var96; var100++) {
                                    if ((Statics.field1355[var98 + 1][var94][var100] & var88) == 0) {
                                        break label358;
                                    }
                                }
                                var98++;
                            }
                            int var101 = (var98 + 1 - var97) * (var96 - var95 + 1);
                            if (var101 >= 8) {
                                short var102 = 240;
                                int var103 = field141[var98][var94][var95] - var102;
                                int var104 = field141[var97][var94][var95];
                                class95.method1861(var91, 1, var94 * 128, var94 * 128, var95 * 128, var96 * 128 + 128, var103, var104);
                                for (int var105 = var97; var105 <= var98; var105++) {
                                    for (int var106 = var95; var106 <= var96; var106++) {
                                        Statics.field1355[var105][var94][var106] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1355[var92][var94][var93] & var89) != 0) {
                            int var107 = var94;
                            int var108 = var94;
                            int var109 = var92;
                            int var110 = var92;
                            while (var107 > 0 && (Statics.field1355[var92][var107 - 1][var93] & var89) != 0) {
                                var107--;
                            }
                            while (var108 < 104 && (Statics.field1355[var92][var108 + 1][var93] & var89) != 0) {
                                var108++;
                            }
                            label422: while (var109 > 0) {
                                for (int var111 = var107; var111 <= var108; var111++) {
                                    if ((Statics.field1355[var109 - 1][var111][var93] & var89) == 0) {
                                        break label422;
                                    }
                                }
                                var109--;
                            }
                            label411: while (var110 < var91) {
                                for (int var112 = var107; var112 <= var108; var112++) {
                                    if ((Statics.field1355[var110 + 1][var112][var93] & var89) == 0) {
                                        break label411;
                                    }
                                }
                                var110++;
                            }
                            int var113 = (var110 + 1 - var109) * (var108 - var107 + 1);
                            if (var113 >= 8) {
                                short var114 = 240;
                                int var115 = field141[var110][var107][var93] - var114;
                                int var116 = field141[var109][var107][var93];
                                class95.method1861(var91, 2, var107 * 128, var108 * 128 + 128, var93 * 128, var93 * 128, var115, var116);
                                for (int var117 = var109; var117 <= var110; var117++) {
                                    for (int var118 = var107; var118 <= var108; var118++) {
                                        Statics.field1355[var117][var118][var93] &= ~var89;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1355[var92][var94][var93] & var90) != 0) {
                            int var119 = var94;
                            int var120 = var94;
                            int var121 = var93;
                            int var122 = var93;
                            while (var121 > 0 && (Statics.field1355[var92][var94][var121 - 1] & var90) != 0) {
                                var121--;
                            }
                            while (var122 < 104 && (Statics.field1355[var92][var94][var122 + 1] & var90) != 0) {
                                var122++;
                            }
                            label475: while (var119 > 0) {
                                for (int var123 = var121; var123 <= var122; var123++) {
                                    if ((Statics.field1355[var92][var119 - 1][var123] & var90) == 0) {
                                        break label475;
                                    }
                                }
                                var119--;
                            }
                            label464: while (var120 < 104) {
                                for (int var124 = var121; var124 <= var122; var124++) {
                                    if ((Statics.field1355[var92][var120 + 1][var124] & var90) == 0) {
                                        break label464;
                                    }
                                }
                                var120++;
                            }
                            if ((var120 - var119 + 1) * (var122 - var121 + 1) >= 4) {
                                int var125 = field141[var92][var119][var121];
                                class95.method1861(var91, 4, var119 * 128, var120 * 128 + 128, var121 * 128, var122 * 128 + 128, var125, var125);
                                for (int var126 = var119; var126 <= var120; var126++) {
                                    for (int var127 = var121; var127 <= var122; var127++) {
                                        Statics.field1355[var92][var126][var127] &= ~var90;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.o(IIII)I")
    public static final int method56(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1848(var3, var5);
        int var8 = method1848(var3 + 1, var5);
        int var9 = method1848(var3, var5 + 1);
        int var10 = method1848(var3 + 1, var5 + 1);
        int var11 = method231(var7, var8, var4, arg2);
        int var12 = method231(var9, var10, var4, arg2);
        return method231(var11, var12, var6, arg2);
    }

    @ObfuscatedName("h.u(IIIII)I")
    public static final int method231(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1754[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ce.f(III)I")
    public static final int method1848(int arg0, int arg1) {
        int var2 = method120(arg0 - 1, arg1 - 1) + method120(arg0 + 1, arg1 - 1) + method120(arg0 - 1, arg1 + 1) + method120(arg0 + 1, arg1 + 1);
        int var3 = method120(arg0 - 1, arg1) + method120(arg0 + 1, arg1) + method120(arg0, arg1 - 1) + method120(arg0, arg1 + 1);
        int var4 = method120(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("t.k(III)I")
    public static final int method120(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ao.q(III)I")
    public static final int method802(int arg0, int arg1) {
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

    @ObfuscatedName("cq.a(IIS)I")
    public static final int method2046(int arg0, int arg1) {
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

    @ObfuscatedName("g.w(IIII)I")
    public static final int method174(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ed.g(III)Z")
    public static final boolean method2718(int arg0, int arg1) {
        class32 var2 = class32.method606(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method667(arg1);
    }
}
