package deob;

@ObfuscatedName("ch")
public final class class90 {

    @ObfuscatedName("ch.f")
    public static int[][][] field1090 = new int[4][105][105];

    @ObfuscatedName("ch.o")
    public static byte[][][] field1091 = new byte[4][104][104];

    @ObfuscatedName("ch.u")
    public static int field1103 = 99;

    @ObfuscatedName("ch.v")
    public static final int[] field1095 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("ch.x")
    public static final int[] field1099 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("ch.z")
    public static final int[] field1098 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("ch.i")
    public static final int[] field1101 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("ch.a")
    public static final int[] field1102 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("ch.w")
    public static final int[] field1100 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("ch.s")
    public static int field1104 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("ch.y")
    public static int field1105 = (int) (Math.random() * 33.0D) - 16;

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.f(I)V")
    public static void method929() {
        Statics.field70 = (byte[][][]) null;
        Statics.field1093 = (byte[][][]) null;
        Statics.field1092 = (byte[][][]) null;
        Statics.field4080 = (byte[][][]) null;
        Statics.field2490 = (int[][][]) null;
        Statics.field1107 = (byte[][][]) null;
        Statics.field1571 = (int[][]) null;
        Statics.field1094 = null;
        Statics.field1096 = null;
        Statics.field1097 = null;
        Statics.field596 = null;
        Statics.field4137 = null;
    }

    @ObfuscatedName("g.u([BIIIIIII[Lel;I)V")
    public static final void method71(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class136[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1535[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class382 var11 = new class382(arg0);
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
                        method2657(var11, arg1, arg2 + var22, arg3 + class222.method2685(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2657(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.p(IIII)V")
    public static final void method205(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1090[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1090[arg0][arg1][arg2 + var5] = field1090[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1090[arg0][arg1 + var6][arg2] = field1090[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1090[arg0][arg1 - 1][arg2] != 0) {
            field1090[arg0][arg1][arg2] = field1090[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1090[arg0][arg1][arg2 - 1] != 0) {
            field1090[arg0][arg1][arg2] = field1090[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1090[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1090[arg0][arg1][arg2] = field1090[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ef.b(Lnu;IIIIIIB)V")
    public static final void method2657(class382 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5856();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5856();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5856();
                }
            }
            return;
        }
        field1091[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5856();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field1090[0][arg2][arg3] = -method2678(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field1090[arg1][arg2][arg3] = field1090[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5856();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field1090[0][arg2][arg3] = -var8 * 8;
                } else {
                    field1090[arg1][arg2][arg3] = field1090[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1093[arg1][arg2][arg3] = arg0.method6045();
                Statics.field1092[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field4080[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1091[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field70[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cu.e([BIIB)Z")
    public static final boolean method1827(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class382 var4 = new class382(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5871();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5846();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5856() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class295 var16 = class295.method182(var5);
                        if (var13 != 22 || !client.field604 || var16.field3602 != 0 || var16.field3614 == 1 || var16.field3627) {
                            if (!var16.method4601()) {
                                client.field658++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5846();
                if (var9 == 0) {
                    break;
                }
                var4.method5856();
            }
        }
    }

    @ObfuscatedName("ik.k([BIILfu;[Lel;I)V")
    public static final void method3865(byte[] arg0, int arg1, int arg2, class176 arg3, class136[] arg4) {
        class382 var5 = new class382(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method5871();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method5846();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method5856();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1091[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class136 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2735(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("fy.g([BIIIIIIILfu;[Lel;I)V")
    public static final void method2734(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class176 arg8, class136[] arg9) {
        class382 var10 = new class382(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5871();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5846();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5856();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class295 var21 = class295.method182(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3604;
                    int var27 = var21.field3588;
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
                    int var36 = var21.field3604;
                    int var37 = var21.field3588;
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
                        if ((field1091[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class136 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method2735(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fy.h(IIIIIILfu;Lel;B)V")
    public static final void method2735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class176 arg6, class136 arg7) {
        if (client.field604 && (field1091[0][arg1][arg2] & 0x2) == 0 && (field1091[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1103) {
            field1103 = arg0;
        }
        class295 var8 = class295.method182(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3588;
            var10 = var8.field3604;
        } else {
            var9 = var8.field3604;
            var10 = var8.field3588;
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
        int[][] var15 = field1090[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class184.method1978(arg1, arg2, 2, var8.field3602 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3621 == 1) {
            var21 += 256;
        }
        if (var8.method4629()) {
            class78 var22 = new class78();
            var22.field914 = arg0;
            var22.field915 = arg1 * 128;
            var22.field913 = arg2 * 128;
            int var23 = var8.field3604;
            int var24 = var8.field3588;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3588;
                var24 = var8.field3604;
            }
            var22.field917 = (arg1 + var23) * 128;
            var22.field918 = (arg2 + var24) * 128;
            var22.field926 = var8.field3633;
            var22.field919 = var8.field3634 * 128;
            var22.field922 = var8.field3635;
            var22.field923 = var8.field3636;
            var22.field916 = var8.field3628;
            if (var8.field3630 != null) {
                var22.field927 = var8;
                var22.method1531();
            }
            class78.field920.method4155(var22);
            if (var22.field916 != null) {
                var22.field925 = var22.field922 + (int) (Math.random() * (double) (var22.field923 - var22.field922));
            }
        }
        if (arg5 == 22) {
            if (!client.field604 || var8.field3602 != 0 || var8.field3614 == 1 || var8.field3627) {
                class177 var25;
                if (var8.field3612 == -1 && var8.field3630 == null) {
                    var25 = var8.method4602(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
                }
                arg6.method3158(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3614 == 1 && arg7 != null) {
                    arg7.method2308(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class177 var51;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var51 = var8.method4602(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            if (var51 != null && arg6.method3009(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3620) {
                int var52 = 15;
                if (var51 instanceof class183) {
                    var52 = ((class183) var51).method3234() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field1107[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field1107[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3614 != 0 && arg7 != null) {
                arg7.method2326(arg1, arg2, var9, var10, var8.field3607);
            }
        } else if (arg5 >= 12) {
            class177 var26;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var26 = var8.method4602(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3009(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2490[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3614 != 0 && arg7 != null) {
                arg7.method2326(arg1, arg2, var9, var10, var8.field3607);
            }
        } else if (arg5 == 0) {
            class177 var27;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var27 = var8.method4602(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3007(arg0, arg1, arg2, var16, var27, (class177) null, field1095[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3620) {
                    Statics.field1107[arg0][arg1][arg2] = 50;
                    Statics.field1107[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3594) {
                    Statics.field2490[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3620) {
                    Statics.field1107[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1107[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3594) {
                    Statics.field2490[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3620) {
                    Statics.field1107[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1107[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3594) {
                    Statics.field2490[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3620) {
                    Statics.field1107[arg0][arg1][arg2] = 50;
                    Statics.field1107[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3594) {
                    Statics.field2490[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3614 != 0 && arg7 != null) {
                arg7.method2302(arg1, arg2, arg5, arg4, var8.field3607);
            }
            if (var8.field3613 != 16) {
                arg6.method3102(arg0, arg1, arg2, var8.field3613);
            }
        } else if (arg5 == 1) {
            class177 var28;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var28 = var8.method4602(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3007(arg0, arg1, arg2, var16, var28, (class177) null, field1099[arg4], 0, var19, var21);
            if (var8.field3620) {
                if (arg4 == 0) {
                    Statics.field1107[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1107[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1107[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1107[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3614 != 0 && arg7 != null) {
                arg7.method2302(arg1, arg2, arg5, arg4, var8.field3607);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class177 var30;
            class177 var31;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var30 = var8.method4602(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4602(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
                var31 = new class88(arg3, 2, var29, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3007(arg0, arg1, arg2, var16, var30, var31, field1095[arg4], field1095[var29], var19, var21);
            if (var8.field3594) {
                if (arg4 == 0) {
                    Statics.field2490[arg0][arg1][arg2] |= 0x249;
                    Statics.field2490[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2490[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2490[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2490[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2490[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2490[arg0][arg1][arg2] |= 0x492;
                    Statics.field2490[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3614 != 0 && arg7 != null) {
                arg7.method2302(arg1, arg2, arg5, arg4, var8.field3607);
            }
            if (var8.field3613 != 16) {
                arg6.method3102(arg0, arg1, arg2, var8.field3613);
            }
        } else if (arg5 == 3) {
            class177 var32;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var32 = var8.method4602(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3007(arg0, arg1, arg2, var16, var32, (class177) null, field1099[arg4], 0, var19, var21);
            if (var8.field3620) {
                if (arg4 == 0) {
                    Statics.field1107[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1107[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1107[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1107[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3614 != 0 && arg7 != null) {
                arg7.method2302(arg1, arg2, arg5, arg4, var8.field3607);
            }
        } else if (arg5 == 9) {
            class177 var33;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var33 = var8.method4602(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3009(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3614 != 0 && arg7 != null) {
                arg7.method2326(arg1, arg2, var9, var10, var8.field3607);
            }
            if (var8.field3613 != 16) {
                arg6.method3102(arg0, arg1, arg2, var8.field3613);
            }
        } else if (arg5 == 4) {
            class177 var34;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var34 = var8.method4602(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3008(arg0, arg1, arg2, var16, var34, (class177) null, field1095[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method3066(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class295.method182(class184.method2752(var36)).field3613;
            }
            class177 var38;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var38 = var8.method4602(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3008(arg0, arg1, arg2, var16, var38, (class177) null, field1095[arg4], 0, field1098[arg4] * var35, field1101[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method3066(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class295.method182(class184.method2752(var40)).field3613 / 2;
            }
            class177 var42;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var42 = var8.method4602(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3008(arg0, arg1, arg2, var16, var42, (class177) null, 256, arg4, field1102[arg4] * var39, field1100[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class177 var44;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var44 = var8.method4602(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class88(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3008(arg0, arg1, arg2, var16, var44, (class177) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method3066(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class295.method182(class184.method2752(var46)).field3613 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class177 var49;
            class177 var50;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var49 = var8.method4602(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4602(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
                var50 = new class88(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3612, var8.field3622, (class177) null);
            }
            arg6.method3008(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field1102[arg4] * var45, field1100[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("al.n(Lfu;[Lel;I)V")
    public static final void method504(class176 arg0, class136[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1091[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1091[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2304(var3, var4);
                        }
                    }
                }
            }
        }
        field1104 += (int) (Math.random() * 5.0D) - 2;
        if (field1104 < -8) {
            field1104 = -8;
        }
        if (field1104 > 8) {
            field1104 = 8;
        }
        field1105 += (int) (Math.random() * 5.0D) - 2;
        if (field1105 < -16) {
            field1105 = -16;
        }
        if (field1105 > 16) {
            field1105 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1107[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field1090[var6][var11 + 1][var10] - field1090[var6][var11 - 1][var10];
                    int var13 = field1090[var6][var11][var10 + 1] - field1090[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1571[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1094[var20] = 0;
                Statics.field1096[var20] = 0;
                Statics.field1097[var20] = 0;
                Statics.field596[var20] = 0;
                Statics.field4137[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field70[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class290 var26 = (class290) class290.field3538.method3398((long) var25);
                            class290 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field3540.method3933(1, var25);
                                class290 var29 = new class290();
                                if (var28 != null) {
                                    var29.method4487(new class382(var28), var25);
                                }
                                var29.method4484();
                                class290.field3538.method3400(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field1094[var22] += var27.field3539;
                            Statics.field1096[var22] += var27.field3542;
                            Statics.field1097[var22] += var27.field3543;
                            Statics.field596[var22] += var27.field3541;
                            var10002 = Statics.field4137[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field70[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            class290 var33 = class290.method1770(var32 - 1);
                            Statics.field1094[var22] -= var33.field3539;
                            Statics.field1096[var22] -= var33.field3542;
                            Statics.field1097[var22] -= var33.field3543;
                            Statics.field596[var22] -= var33.field3541;
                            var10002 = Statics.field4137[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var34 = 0;
                    int var35 = 0;
                    int var36 = 0;
                    int var37 = 0;
                    int var38 = 0;
                    for (int var39 = -5; var39 < 109; var39++) {
                        int var40 = var39 + 5;
                        if (var40 >= 0 && var40 < 104) {
                            var34 += Statics.field1094[var40];
                            var35 += Statics.field1096[var40];
                            var36 += Statics.field1097[var40];
                            var37 += Statics.field596[var40];
                            var38 += Statics.field4137[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field1094[var41];
                            var35 -= Statics.field1096[var41];
                            var36 -= Statics.field1097[var41];
                            var37 -= Statics.field596[var41];
                            var38 -= Statics.field4137[var41];
                        }
                        if (var39 >= 1 && var39 < 103 && (!client.field604 || (field1091[0][var21][var39] & 0x2) != 0 || (field1091[var6][var21][var39] & 0x10) == 0)) {
                            if (var6 < field1103) {
                                field1103 = var6;
                            }
                            int var42 = Statics.field70[var6][var21][var39] & 0xFF;
                            int var43 = Statics.field1093[var6][var21][var39] & 0xFF;
                            if (var42 > 0 || var43 > 0) {
                                int var44 = field1090[var6][var21][var39];
                                int var45 = field1090[var6][var21 + 1][var39];
                                int var46 = field1090[var6][var21 + 1][var39 + 1];
                                int var47 = field1090[var6][var21][var39 + 1];
                                int var48 = Statics.field1571[var21][var39];
                                int var49 = Statics.field1571[var21 + 1][var39];
                                int var50 = Statics.field1571[var21 + 1][var39 + 1];
                                int var51 = Statics.field1571[var21][var39 + 1];
                                int var52 = -1;
                                int var53 = -1;
                                if (var42 > 0) {
                                    int var54 = var34 * 256 / var37;
                                    int var55 = var35 / var38;
                                    int var56 = var36 / var38;
                                    var52 = method1746(var54, var55, var56);
                                    int var57 = field1104 + var54 & 0xFF;
                                    int var58 = field1105 + var56;
                                    if (var58 < 0) {
                                        var58 = 0;
                                    } else if (var58 > 255) {
                                        var58 = 255;
                                    }
                                    var53 = method1746(var57, var55, var58);
                                }
                                if (var6 > 0) {
                                    boolean var59 = true;
                                    if (var42 == 0 && Statics.field1092[var6][var21][var39] != 0) {
                                        var59 = false;
                                    }
                                    if (var43 > 0 && !class297.method1709(var43 - 1).field3700) {
                                        var59 = false;
                                    }
                                    if (var59 && var44 == var45 && var44 == var46 && var44 == var47) {
                                        Statics.field2490[var6][var21][var39] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var53 != -1) {
                                    var60 = class174.field1899[method954(var53, 96)];
                                }
                                if (var43 == 0) {
                                    arg0.method3107(var6, var21, var39, 0, 0, -1, var44, var45, var46, var47, method954(var52, var48), method954(var52, var49), method954(var52, var50), method954(var52, var51), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field1092[var6][var21][var39] + 1;
                                    byte var62 = Statics.field4080[var6][var21][var39];
                                    class297 var63 = class297.method1709(var43 - 1);
                                    int var64 = var63.field3699;
                                    int var65;
                                    int var66;
                                    if (var64 >= 0) {
                                        var65 = Statics.field1921.method3219(var64);
                                        var66 = -1;
                                    } else if (var63.field3705 == 16711935) {
                                        var66 = -2;
                                        var64 = -1;
                                        var65 = -2;
                                    } else {
                                        var66 = method1746(var63.field3702, var63.field3703, var63.field3704);
                                        int var67 = field1104 + var63.field3702 & 0xFF;
                                        int var68 = field1105 + var63.field3704;
                                        if (var68 < 0) {
                                            var68 = 0;
                                        } else if (var68 > 255) {
                                            var68 = 255;
                                        }
                                        var65 = method1746(var67, var63.field3703, var68);
                                    }
                                    int var69 = 0;
                                    if (var65 != -2) {
                                        var69 = class174.field1899[method1880(var65, 96)];
                                    }
                                    if (var63.field3701 != -1) {
                                        int var70 = field1104 + var63.field3706 & 0xFF;
                                        int var71 = field1105 + var63.field3696;
                                        if (var71 < 0) {
                                            var71 = 0;
                                        } else if (var71 > 255) {
                                            var71 = 255;
                                        }
                                        int var72 = method1746(var70, var63.field3698, var71);
                                        var69 = class174.field1899[method1880(var72, 96)];
                                    }
                                    arg0.method3107(var6, var21, var39, var61, var62, var64, var44, var45, var46, var47, method954(var52, var48), method954(var52, var49), method954(var52, var50), method954(var52, var51), method1880(var66, var48), method1880(var66, var49), method1880(var66, var50), method1880(var66, var51), var60, var69);
                                }
                            }
                        }
                    }
                }
            }
            for (int var73 = 1; var73 < 103; var73++) {
                for (int var74 = 1; var74 < 103; var74++) {
                    int var79;
                    if ((field1091[var6][var74][var73] & 0x8) != 0) {
                        var79 = 0;
                    } else if (var6 <= 0 || (field1091[1][var74][var73] & 0x2) == 0) {
                        var79 = var6;
                    } else {
                        var79 = var6 - 1;
                    }
                    arg0.method3003(var6, var74, var73, var79);
                }
            }
            Statics.field70[var6] = (byte[][]) null;
            Statics.field1093[var6] = (byte[][]) null;
            Statics.field1092[var6] = (byte[][]) null;
            Statics.field4080[var6] = (byte[][]) null;
            Statics.field1107[var6] = (byte[][]) null;
        }
        arg0.method3030(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field1091[1][var80][var81] & 0x2) == 2) {
                    arg0.method3138(var80, var81);
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
                        if ((Statics.field2490[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field2490[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field2490[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label352: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field2490[var91 - 1][var88][var93] & var82) == 0) {
                                        break label352;
                                    }
                                }
                                var91--;
                            }
                            label341: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field2490[var92 + 1][var88][var94] & var82) == 0) {
                                        break label341;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field1090[var92][var88][var89] - var96;
                                int var98 = field1090[var91][var88][var89];
                                class176.method3002(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field2490[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2490[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field2490[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field2490[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label405: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field2490[var103 - 1][var105][var87] & var83) == 0) {
                                        break label405;
                                    }
                                }
                                var103--;
                            }
                            label394: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field2490[var104 + 1][var106][var87] & var83) == 0) {
                                        break label394;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field1090[var104][var101][var87] - var108;
                                int var110 = field1090[var103][var101][var87];
                                class176.method3002(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field2490[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2490[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field2490[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field2490[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label458: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field2490[var86][var113 - 1][var117] & var84) == 0) {
                                        break label458;
                                    }
                                }
                                var113--;
                            }
                            label447: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field2490[var86][var114 + 1][var118] & var84) == 0) {
                                        break label447;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field1090[var86][var113][var115];
                                class176.method3002(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field2490[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("er.l(III)I")
    public static final int method2678(int arg0, int arg1) {
        int var2 = method4056(arg0 + 45365, arg1 + 91923, 4) - 128 + (method4056(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4056(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ib.m(IIII)I")
    public static final int method4056(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method64(var3, var5);
        int var8 = method64(var3 + 1, var5);
        int var9 = method64(var3, var5 + 1);
        int var10 = method64(var3 + 1, var5 + 1);
        int var11 = 65536 - class174.field1909[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class174.field1909[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class174.field1909[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("e.d(IIB)I")
    public static final int method64(int arg0, int arg1) {
        int var2 = method5025(arg0 - 1, arg1 - 1) + method5025(arg0 + 1, arg1 - 1) + method5025(arg0 - 1, arg1 + 1) + method5025(arg0 + 1, arg1 + 1);
        int var3 = method5025(arg0 - 1, arg1) + method5025(arg0 + 1, arg1) + method5025(arg0, arg1 - 1) + method5025(arg0, arg1 + 1);
        int var4 = method5025(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("le.c(III)I")
    public static final int method5025(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bs.j(III)I")
    public static final int method954(int arg0, int arg1) {
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

    @ObfuscatedName("cs.r(III)I")
    public static final int method1880(int arg0, int arg1) {
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

    @ObfuscatedName("cc.q(IIII)I")
    public static final int method1746(int arg0, int arg1, int arg2) {
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
