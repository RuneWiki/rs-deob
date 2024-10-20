package deob;

@ObfuscatedName("l")
public final class class6 {

    @ObfuscatedName("l.g")
    public static int[][][] field87 = new int[4][105][105];

    @ObfuscatedName("l.b")
    public static byte[][][] field88 = new byte[4][104][104];

    @ObfuscatedName("l.w")
    public static int field104 = 99;

    @ObfuscatedName("l.y")
    public static final int[] field94 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.t")
    public static final int[] field95 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.a")
    public static final int[] field102 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.s")
    public static final int[] field97 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.e")
    public static final int[] field98 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.q")
    public static final int[] field99 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.i")
    public static int field100 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.h")
    public static int field91 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.g(B)V")
    public static void method14() {
        field104 = 99;
        Statics.field700 = new byte[4][104][104];
        Statics.field685 = new byte[4][104][104];
        Statics.field90 = new byte[4][104][104];
        Statics.field2015 = new byte[4][104][104];
        Statics.field101 = new int[4][105][105];
        Statics.field2125 = new byte[4][105][105];
        Statics.field170 = new int[105][105];
        Statics.field1952 = new int[104];
        Statics.field89 = new int[104];
        Statics.field3135 = new int[104];
        Statics.field1101 = new int[104];
        Statics.field660 = new int[104];
    }

    @ObfuscatedName("dn.b(IIIII)V")
    public static final void method2305(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2125[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field87[0][var5][var4] = field87[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field87[0][var5][var4] = field87[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field87[0][var5][var4] = field87[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field87[0][var5][var4] = field87[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fj.w([BIIIIIII[Ldz;B)V")
    public static final void method2990(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1883[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
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
                        method41(var11, arg1, arg2 + var22, arg3 + class177.method2985(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method41(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ez.d(IIII)V")
    public static final void method2734(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field87[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field87[arg0][arg1][arg2 + var5] = field87[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field87[arg0][arg1 + var6][arg2] = field87[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field87[arg0][arg1 - 1][arg2] != 0) {
            field87[arg0][arg1][arg2] = field87[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field87[arg0][arg1][arg2 - 1] != 0) {
            field87[arg0][arg1][arg2] = field87[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field87[arg0][arg1 - 1][arg2 - 1] != 0) {
            field87[arg0][arg1][arg2] = field87[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("w.z(Ldm;IIIIIII)V")
    public static final void method41(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2362();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2362();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2362();
                }
            }
            return;
        }
        field88[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2362();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field87[0][arg2][arg3] = -Statics.method1979(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field87[arg1][arg2][arg3] = field87[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2362();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field87[0][arg2][arg3] = -var8 * 8;
                } else {
                    field87[arg1][arg2][arg3] = field87[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field685[arg1][arg2][arg3] = arg0.method2391();
                Statics.field90[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2015[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field88[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field700[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fj.l([BIII)Z")
    public static final boolean method2989(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2506();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2506();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2362() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method3251(var5);
                        if (var13 != 22 || !client.field295 || var16.field953 != 0 || var16.field937 == 1 || var16.field965) {
                            if (!var16.method804()) {
                                client.field352++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2506();
                if (var9 == 0) {
                    break;
                }
                var4.method2362();
            }
        }
    }

    @ObfuscatedName("hw.m([BIILcz;[Ldz;I)V")
    public static final void method3718(byte[] arg0, int arg1, int arg2, class86 arg3, class108[] arg4) {
        class119 var5 = new class119(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2506();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2506();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2362();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field88[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class108 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method3008(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("fi.p(IIIIIILcz;Ldz;B)V")
    public static final void method3008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field295 && (field88[0][arg1][arg2] & 0x2) == 0 && (field88[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field104) {
            field104 = arg0;
        }
        class41 var8 = class41.method3251(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field943;
            var10 = var8.field942;
        } else {
            var9 = var8.field942;
            var10 = var8.field943;
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
        int[][] var15 = field87[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field953 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field963 == 1) {
            var20 += 256;
        }
        if (var8.method803()) {
            class24.method2680(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field295 || var8.field953 != 0 || var8.field937 == 1 || var8.field965) {
                class85 var21;
                if (var8.field949 == -1 && var8.field968 == null) {
                    var21 = var8.method805(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
                }
                arg6.method1800(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field937 == 1 && arg7 != null) {
                    arg7.method2261(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var44;
            if (var8.field949 == -1 && var8.field968 == null) {
                var44 = var8.method805(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            if (var44 != null && arg6.method1795(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field958) {
                int var45 = 15;
                if (var44 instanceof class105) {
                    var45 = ((class105) var44).method2181() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2125[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2125[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2259(arg1, arg2, var9, var10, var8.field945);
            }
        } else if (arg5 >= 12) {
            class85 var22;
            if (var8.field949 == -1 && var8.field968 == null) {
                var22 = var8.method805(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field101[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2259(arg1, arg2, var9, var10, var8.field945);
            }
        } else if (arg5 == 0) {
            class85 var23;
            if (var8.field949 == -1 && var8.field968 == null) {
                var23 = var8.method805(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1972(arg0, arg1, arg2, var16, var23, (class85) null, field94[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field958) {
                    Statics.field2125[arg0][arg1][arg2] = 50;
                    Statics.field2125[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field970) {
                    Statics.field101[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field958) {
                    Statics.field2125[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2125[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field970) {
                    Statics.field101[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field958) {
                    Statics.field2125[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2125[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field970) {
                    Statics.field101[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field958) {
                    Statics.field2125[arg0][arg1][arg2] = 50;
                    Statics.field2125[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field970) {
                    Statics.field101[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2258(arg1, arg2, arg5, arg4, var8.field945);
            }
            if (var8.field951 != 16) {
                arg6.method1804(arg0, arg1, arg2, var8.field951);
            }
        } else if (arg5 == 1) {
            class85 var24;
            if (var8.field949 == -1 && var8.field968 == null) {
                var24 = var8.method805(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1972(arg0, arg1, arg2, var16, var24, (class85) null, field95[arg4], 0, var19, var20);
            if (var8.field958) {
                if (arg4 == 0) {
                    Statics.field2125[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2125[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2125[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2125[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2258(arg1, arg2, arg5, arg4, var8.field945);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class85 var26;
            class85 var27;
            if (var8.field949 == -1 && var8.field968 == null) {
                var26 = var8.method805(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method805(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1972(arg0, arg1, arg2, var16, var26, var27, field94[arg4], field94[var25], var19, var20);
            if (var8.field970) {
                if (arg4 == 0) {
                    Statics.field101[arg0][arg1][arg2] |= 0x249;
                    Statics.field101[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field101[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field101[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field101[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field101[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field101[arg0][arg1][arg2] |= 0x492;
                    Statics.field101[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2258(arg1, arg2, arg5, arg4, var8.field945);
            }
            if (var8.field951 != 16) {
                arg6.method1804(arg0, arg1, arg2, var8.field951);
            }
        } else if (arg5 == 3) {
            class85 var28;
            if (var8.field949 == -1 && var8.field968 == null) {
                var28 = var8.method805(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1972(arg0, arg1, arg2, var16, var28, (class85) null, field95[arg4], 0, var19, var20);
            if (var8.field958) {
                if (arg4 == 0) {
                    Statics.field2125[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2125[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2125[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2125[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2258(arg1, arg2, arg5, arg4, var8.field945);
            }
        } else if (arg5 == 9) {
            class85 var29;
            if (var8.field949 == -1 && var8.field968 == null) {
                var29 = var8.method805(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2259(arg1, arg2, var9, var10, var8.field945);
            }
            if (var8.field951 != 16) {
                arg6.method1804(arg0, arg1, arg2, var8.field951);
            }
        } else if (arg5 == 4) {
            class85 var30;
            if (var8.field949 == -1 && var8.field968 == null) {
                var30 = var8.method805(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1803(arg0, arg1, arg2, var16, var30, (class85) null, field94[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1819(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method3251(var32 >> 14 & 0x7FFF).field951;
            }
            class85 var33;
            if (var8.field949 == -1 && var8.field968 == null) {
                var33 = var8.method805(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1803(arg0, arg1, arg2, var16, var33, (class85) null, field94[arg4], 0, field102[arg4] * var31, field97[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1819(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method3251(var35 >> 14 & 0x7FFF).field951 / 2;
            }
            class85 var36;
            if (var8.field949 == -1 && var8.field968 == null) {
                var36 = var8.method805(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1803(arg0, arg1, arg2, var16, var36, (class85) null, 256, arg4, field98[arg4] * var34, field99[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class85 var38;
            if (var8.field949 == -1 && var8.field968 == null) {
                var38 = var8.method805(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1803(arg0, arg1, arg2, var16, var38, (class85) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1819(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method3251(var40 >> 14 & 0x7FFF).field951 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class85 var42;
            class85 var43;
            if (var8.field949 == -1 && var8.field968 == null) {
                var42 = var8.method805(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method805(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1803(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field98[arg4] * var39, field99[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("r.u(Lcz;[Ldz;I)V")
    public static final void method190(class86 arg0, class108[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field88[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field88[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2260(var3, var4);
                        }
                    }
                }
            }
        }
        field100 += (int) (Math.random() * 5.0D) - 2;
        if (field100 < -8) {
            field100 = -8;
        }
        if (field100 > 8) {
            field100 = 8;
        }
        field91 += (int) (Math.random() * 5.0D) - 2;
        if (field91 < -16) {
            field91 = -16;
        }
        if (field91 > 16) {
            field91 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2125[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field87[var6][var11 + 1][var10] - field87[var6][var11 - 1][var10];
                    int var13 = field87[var6][var11][var10 + 1] - field87[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field170[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1952[var20] = 0;
                Statics.field89[var20] = 0;
                Statics.field3135[var20] = 0;
                Statics.field1101[var20] = 0;
                Statics.field660[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field700[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class42 var25 = class42.method750(var24 - 1);
                            Statics.field1952[var22] += var25.field981;
                            Statics.field89[var22] += var25.field982;
                            Statics.field3135[var22] += var25.field978;
                            Statics.field1101[var22] += var25.field984;
                            var10002 = Statics.field660[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field700[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class42 var28 = class42.method750(var27 - 1);
                            Statics.field1952[var22] -= var28.field981;
                            Statics.field89[var22] -= var28.field982;
                            Statics.field3135[var22] -= var28.field978;
                            Statics.field1101[var22] -= var28.field984;
                            var10002 = Statics.field660[var22]--;
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
                            var29 += Statics.field1952[var35];
                            var30 += Statics.field89[var35];
                            var31 += Statics.field3135[var35];
                            var32 += Statics.field1101[var35];
                            var33 += Statics.field660[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field1952[var36];
                            var30 -= Statics.field89[var36];
                            var31 -= Statics.field3135[var36];
                            var32 -= Statics.field1101[var36];
                            var33 -= Statics.field660[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field295 || (field88[0][var21][var34] & 0x2) != 0 || (field88[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field104) {
                                field104 = var6;
                            }
                            int var37 = Statics.field700[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field685[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field87[var6][var21][var34];
                                int var40 = field87[var6][var21 + 1][var34];
                                int var41 = field87[var6][var21 + 1][var34 + 1];
                                int var42 = field87[var6][var21][var34 + 1];
                                int var43 = Statics.field170[var21][var34];
                                int var44 = Statics.field170[var21 + 1][var34];
                                int var45 = Statics.field170[var21 + 1][var34 + 1];
                                int var46 = Statics.field170[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method1978(var49, var50, var51);
                                    int var52 = field100 + var49 & 0xFF;
                                    int var53 = field91 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method1978(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field90[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class47 var56 = (class47) class47.field1065.method3529((long) var55);
                                        class47 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field1060.method3112(4, var55);
                                            class47 var59 = new class47();
                                            if (var58 != null) {
                                                var59.method975(new class119(var58), var55);
                                            }
                                            var59.method962();
                                            class47.field1065.method3528(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field1063) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field101[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class91.field1567[method2979(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1799(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2979(var47, var43), method2979(var47, var44), method2979(var47, var45), method2979(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field90[var6][var21][var34] + 1;
                                    byte var62 = Statics.field2015[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class47 var64 = (class47) class47.field1065.method3529((long) var63);
                                    class47 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field1060.method3112(4, var63);
                                        class47 var67 = new class47();
                                        if (var66 != null) {
                                            var67.method975(new class119(var66), var63);
                                        }
                                        var67.method962();
                                        class47.field1065.method3528(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field1055;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1554.method2041(var69);
                                        var71 = -1;
                                    } else if (var65.field1056 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method1978(var65.field1053, var65.field1059, var65.field1061);
                                        int var72 = field100 + var65.field1053 & 0xFF;
                                        int var73 = field91 + var65.field1061;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method1978(var72, var65.field1059, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class91.field1567[method191(var70, 96)];
                                    }
                                    if (var65.field1057 != -1) {
                                        int var75 = field100 + var65.field1054 & 0xFF;
                                        int var76 = field91 + var65.field1058;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method1978(var75, var65.field1062, var76);
                                        var74 = class91.field1567[method191(var77, 96)];
                                    }
                                    arg0.method1799(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, method2979(var47, var43), method2979(var47, var44), method2979(var47, var45), method2979(var47, var46), method191(var71, var43), method191(var71, var44), method191(var71, var45), method191(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1798(var6, var79, var78, method2848(var6, var79, var78));
                }
            }
            Statics.field700[var6] = (byte[][]) null;
            Statics.field685[var6] = (byte[][]) null;
            Statics.field90[var6] = (byte[][]) null;
            Statics.field2015[var6] = (byte[][]) null;
            Statics.field2125[var6] = (byte[][]) null;
        }
        arg0.method1927(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field88[1][var80][var81] & 0x2) == 2) {
                    arg0.method1942(var80, var81);
                }
            }
        }
        int var82 = 1;
        int var83 = 2;
        int var84 = 4;
        for (int var85 = 0; var85 < 4; var85++) {
            if (var85 > 0) {
                var82 <<= 0x3;
                var83 <<= 0x3;
                var84 <<= 0x3;
            }
            for (int var86 = 0; var86 <= var85; var86++) {
                for (int var87 = 0; var87 <= 104; var87++) {
                    for (int var88 = 0; var88 <= 104; var88++) {
                        if ((Statics.field101[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field101[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field101[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label355: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field101[var91 - 1][var88][var93] & var82) == 0) {
                                        break label355;
                                    }
                                }
                                var91--;
                            }
                            label344: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field101[var92 + 1][var88][var94] & var82) == 0) {
                                        break label344;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field87[var92][var88][var89] - var96;
                                int var98 = field87[var91][var88][var89];
                                class86.method1797(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field101[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field101[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field101[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field101[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label408: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field101[var103 - 1][var105][var87] & var83) == 0) {
                                        break label408;
                                    }
                                }
                                var103--;
                            }
                            label397: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field101[var104 + 1][var106][var87] & var83) == 0) {
                                        break label397;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field87[var104][var101][var87] - var108;
                                int var110 = field87[var103][var101][var87];
                                class86.method1797(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field101[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field101[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field101[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field101[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label461: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field101[var86][var113 - 1][var117] & var84) == 0) {
                                        break label461;
                                    }
                                }
                                var113--;
                            }
                            label450: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field101[var86][var114 + 1][var118] & var84) == 0) {
                                        break label450;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field87[var86][var113][var115];
                                class86.method1797(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field101[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ey.c(IIIB)I")
    public static int method2848(int arg0, int arg1, int arg2) {
        if ((field88[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field88[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("a.o(IIII)I")
    public static final int method574(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2255(var3, var5);
        int var8 = method2255(var3 + 1, var5);
        int var9 = method2255(var3, var5 + 1);
        int var10 = method2255(var3 + 1, var5 + 1);
        int var11 = 65536 - class91.field1574[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class91.field1574[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class91.field1574[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ds.n(III)I")
    public static final int method2255(int arg0, int arg1) {
        int var2 = method1515(arg0 - 1, arg1 - 1) + method1515(arg0 + 1, arg1 - 1) + method1515(arg0 - 1, arg1 + 1) + method1515(arg0 + 1, arg1 + 1);
        int var3 = method1515(arg0 - 1, arg1) + method1515(arg0 + 1, arg1) + method1515(arg0, arg1 - 1) + method1515(arg0, arg1 + 1);
        int var4 = method1515(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bk.k(III)I")
    public static final int method1515(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ep.f(IIB)I")
    public static final int method2979(int arg0, int arg1) {
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

    @ObfuscatedName("r.x(III)I")
    public static final int method191(int arg0, int arg1) {
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

    @ObfuscatedName("cr.j(IIII)I")
    public static final int method1978(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("fm.r(III)Z")
    public static final boolean method3258(int arg0, int arg1) {
        class41 var2 = class41.method3251(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method810(arg1);
    }
}
