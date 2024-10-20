package deob;

@ObfuscatedName("t")
public final class class6 {

    @ObfuscatedName("t.q")
    public static int[][][] field77 = new int[4][105][105];

    @ObfuscatedName("t.s")
    public static byte[][][] field73 = new byte[4][104][104];

    @ObfuscatedName("t.h")
    public static int field84 = 99;

    @ObfuscatedName("t.f")
    public static final int[] field80 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("t.w")
    public static final int[] field81 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("t.z")
    public static final int[] field87 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("t.x")
    public static final int[] field83 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("t.v")
    public static final int[] field82 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("t.i")
    public static final int[] field85 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("t.c")
    public static int field86 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("t.r")
    public static int field75 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.q(I)V")
    public static void method2883() {
        Statics.field1927 = (byte[][][]) null;
        Statics.field88 = (byte[][][]) null;
        Statics.field79 = (byte[][][]) null;
        Statics.field76 = (byte[][][]) null;
        Statics.field1296 = (int[][][]) null;
        Statics.field1299 = (byte[][][]) null;
        Statics.field78 = (int[][]) null;
        Statics.field1964 = null;
        Statics.field2488 = null;
        Statics.field91 = null;
        Statics.field2074 = null;
        Statics.field2566 = null;
    }

    @ObfuscatedName("bd.s(IIIII)V")
    public static final void method1362(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1299[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field77[0][var5][var4] = field77[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field77[0][var5][var4] = field77[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field77[0][var5][var4] = field77[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field77[0][var5][var4] = field77[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.h([BIIII[Lhy;B)V")
    public static final void method2992(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class219[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3088[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class111 var9 = new class111(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2441(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("dk.e(Ldx;IIIIIII)V")
    public static final void method2441(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2231();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2231();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2231();
                }
            }
            return;
        }
        field73[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2231();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field77[0][arg2][arg3] = -method8(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field77[arg1][arg2][arg3] = field77[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2231();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field77[0][arg2][arg3] = -var8 * 8;
                } else {
                    field77[arg1][arg2][arg3] = field77[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field88[arg1][arg2][arg3] = arg0.method2149();
                Statics.field79[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field76[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field73[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1927[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("b.n([BIIB)Z")
    public static final boolean method162(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class111 var4 = new class111(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2279();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2279();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2231() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class38 var16 = class38.method2727(var5);
                        if (var13 != 22 || !client.field271 || var16.field868 != 0 || var16.field849 == 1 || var16.field887) {
                            if (!var16.method661()) {
                                client.field322++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2279();
                if (var9 == 0) {
                    break;
                }
                var4.method2231();
            }
        }
    }

    @ObfuscatedName("gg.t([BIILct;[Lhy;I)V")
    public static final void method3410(byte[] arg0, int arg1, int arg2, class81 arg3, class219[] arg4) {
        class111 var5 = new class111(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2279();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2279();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2231();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field73[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class219 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method132(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("u.l(IIIIIILct;Lhy;B)V")
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class219 arg7) {
        if (client.field271 && (field73[0][arg1][arg2] & 0x2) == 0) {
            if ((field73[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2495(arg0, arg1, arg2) != client.field425) {
                return;
            }
        }
        if (arg0 < field84) {
            field84 = arg0;
        }
        class38 var8 = class38.method2727(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field865;
            var10 = var8.field863;
        } else {
            var9 = var8.field863;
            var10 = var8.field865;
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
        int[][] var15 = field77[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field868 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field889 == 1) {
            var20 += 256;
        }
        if (var8.method671()) {
            class22.method2333(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field271 || var8.field868 != 0 || var8.field849 == 1 || var8.field887) {
                class80 var21;
                if (var8.field872 == -1 && var8.field875 == null) {
                    var21 = var8.method700(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
                }
                arg6.method1624(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field849 == 1 && arg7 != null) {
                    arg7.method3633(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var44;
            if (var8.field872 == -1 && var8.field875 == null) {
                var44 = var8.method700(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            if (var44 != null && arg6.method1626(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field880) {
                int var45 = 15;
                if (var44 instanceof class100) {
                    var45 = ((class100) var44).method1997() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field1299[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field1299[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field849 != 0 && arg7 != null) {
                arg7.method3631(arg1, arg2, var9, var10, var8.field867);
            }
        } else if (arg5 >= 12) {
            class80 var22;
            if (var8.field872 == -1 && var8.field875 == null) {
                var22 = var8.method700(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1626(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1296[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field849 != 0 && arg7 != null) {
                arg7.method3631(arg1, arg2, var9, var10, var8.field867);
            }
        } else if (arg5 == 0) {
            class80 var23;
            if (var8.field872 == -1 && var8.field875 == null) {
                var23 = var8.method700(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1759(arg0, arg1, arg2, var16, var23, (class80) null, field80[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field880) {
                    Statics.field1299[arg0][arg1][arg2] = 50;
                    Statics.field1299[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field877) {
                    Statics.field1296[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field880) {
                    Statics.field1299[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1299[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field877) {
                    Statics.field1296[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field880) {
                    Statics.field1299[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1299[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field877) {
                    Statics.field1296[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field880) {
                    Statics.field1299[arg0][arg1][arg2] = 50;
                    Statics.field1299[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field877) {
                    Statics.field1296[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field849 != 0 && arg7 != null) {
                arg7.method3638(arg1, arg2, arg5, arg4, var8.field867);
            }
            if (var8.field873 != 16) {
                arg6.method1632(arg0, arg1, arg2, var8.field873);
            }
        } else if (arg5 == 1) {
            class80 var24;
            if (var8.field872 == -1 && var8.field875 == null) {
                var24 = var8.method700(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1759(arg0, arg1, arg2, var16, var24, (class80) null, field81[arg4], 0, var19, var20);
            if (var8.field880) {
                if (arg4 == 0) {
                    Statics.field1299[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1299[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1299[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1299[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field849 != 0 && arg7 != null) {
                arg7.method3638(arg1, arg2, arg5, arg4, var8.field867);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class80 var26;
            class80 var27;
            if (var8.field872 == -1 && var8.field875 == null) {
                var26 = var8.method700(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method700(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field872, true, (class80) null);
                var27 = new class12(arg3, 2, var25, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1759(arg0, arg1, arg2, var16, var26, var27, field80[arg4], field80[var25], var19, var20);
            if (var8.field877) {
                if (arg4 == 0) {
                    Statics.field1296[arg0][arg1][arg2] |= 0x249;
                    Statics.field1296[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1296[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1296[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1296[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1296[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1296[arg0][arg1][arg2] |= 0x492;
                    Statics.field1296[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field849 != 0 && arg7 != null) {
                arg7.method3638(arg1, arg2, arg5, arg4, var8.field867);
            }
            if (var8.field873 != 16) {
                arg6.method1632(arg0, arg1, arg2, var8.field873);
            }
        } else if (arg5 == 3) {
            class80 var28;
            if (var8.field872 == -1 && var8.field875 == null) {
                var28 = var8.method700(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1759(arg0, arg1, arg2, var16, var28, (class80) null, field81[arg4], 0, var19, var20);
            if (var8.field880) {
                if (arg4 == 0) {
                    Statics.field1299[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1299[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1299[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1299[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field849 != 0 && arg7 != null) {
                arg7.method3638(arg1, arg2, arg5, arg4, var8.field867);
            }
        } else if (arg5 == 9) {
            class80 var29;
            if (var8.field872 == -1 && var8.field875 == null) {
                var29 = var8.method700(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1626(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field849 != 0 && arg7 != null) {
                arg7.method3631(arg1, arg2, var9, var10, var8.field867);
            }
            if (var8.field873 != 16) {
                arg6.method1632(arg0, arg1, arg2, var8.field873);
            }
        } else if (arg5 == 4) {
            class80 var30;
            if (var8.field872 == -1 && var8.field875 == null) {
                var30 = var8.method700(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var30, (class80) null, field80[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1636(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class38.method2727(var32 >> 14 & 0x7FFF).field873;
            }
            class80 var33;
            if (var8.field872 == -1 && var8.field875 == null) {
                var33 = var8.method700(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var33, (class80) null, field80[arg4], 0, field87[arg4] * var31, field83[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1636(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class38.method2727(var35 >> 14 & 0x7FFF).field873 / 2;
            }
            class80 var36;
            if (var8.field872 == -1 && var8.field875 == null) {
                var36 = var8.method700(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var36, (class80) null, 256, arg4, field82[arg4] * var34, field85[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class80 var38;
            if (var8.field872 == -1 && var8.field875 == null) {
                var38 = var8.method700(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class12(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var38, (class80) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1636(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class38.method2727(var40 >> 14 & 0x7FFF).field873 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class80 var42;
            class80 var43;
            if (var8.field872 == -1 && var8.field875 == null) {
                var42 = var8.method700(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method700(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field872, true, (class80) null);
                var43 = new class12(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field872, true, (class80) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field82[arg4] * var39, field85[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("am.m(Lct;[Lhy;I)V")
    public static final void method583(class81 arg0, class219[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field73[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field73[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3646(var3, var4);
                        }
                    }
                }
            }
        }
        field86 += (int) (Math.random() * 5.0D) - 2;
        if (field86 < -8) {
            field86 = -8;
        }
        if (field86 > 8) {
            field86 = 8;
        }
        field75 += (int) (Math.random() * 5.0D) - 2;
        if (field75 < -16) {
            field75 = -16;
        }
        if (field75 > 16) {
            field75 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1299[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field77[var6][var11 + 1][var10] - field77[var6][var11 - 1][var10];
                    int var13 = field77[var6][var11][var10 + 1] - field77[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field78[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1964[var20] = 0;
                Statics.field2488[var20] = 0;
                Statics.field91[var20] = 0;
                Statics.field2074[var20] = 0;
                Statics.field2566[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field1927[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class39 var25 = class39.method1887(var24 - 1);
                            Statics.field1964[var22] += var25.field903;
                            Statics.field2488[var22] += var25.field905;
                            Statics.field91[var22] += var25.field904;
                            Statics.field2074[var22] += var25.field900;
                            var10002 = Statics.field2566[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field1927[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class39 var28 = class39.method1887(var27 - 1);
                            Statics.field1964[var22] -= var28.field903;
                            Statics.field2488[var22] -= var28.field905;
                            Statics.field91[var22] -= var28.field904;
                            Statics.field2074[var22] -= var28.field900;
                            var10002 = Statics.field2566[var22]--;
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
                            var29 += Statics.field1964[var35];
                            var30 += Statics.field2488[var35];
                            var31 += Statics.field91[var35];
                            var32 += Statics.field2074[var35];
                            var33 += Statics.field2566[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field1964[var36];
                            var30 -= Statics.field2488[var36];
                            var31 -= Statics.field91[var36];
                            var32 -= Statics.field2074[var36];
                            var33 -= Statics.field2566[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field271 || (field73[0][var21][var34] & 0x2) != 0 || (field73[var6][var21][var34] & 0x10) == 0 && method2495(var6, var21, var34) == client.field425)) {
                            if (var6 < field84) {
                                field84 = var6;
                            }
                            int var37 = Statics.field1927[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field88[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field77[var6][var21][var34];
                                int var40 = field77[var6][var21 + 1][var34];
                                int var41 = field77[var6][var21 + 1][var34 + 1];
                                int var42 = field77[var6][var21][var34 + 1];
                                int var43 = Statics.field78[var21][var34];
                                int var44 = Statics.field78[var21 + 1][var34];
                                int var45 = Statics.field78[var21 + 1][var34 + 1];
                                int var46 = Statics.field78[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method537(var49, var50, var51);
                                    int var52 = field86 + var49 & 0xFF;
                                    int var53 = field75 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method537(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field79[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class43.method599(var38 - 1).field972) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field1296[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class86.field1460[method618(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1739(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method618(var47, var43), method618(var47, var44), method618(var47, var45), method618(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field79[var6][var21][var34] + 1;
                                    byte var57 = Statics.field76[var6][var21][var34];
                                    class43 var58 = class43.method599(var38 - 1);
                                    int var59 = var58.field977;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1481.method1853(var59);
                                        var61 = -1;
                                    } else if (var58.field970 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method537(var58.field971, var58.field975, var58.field981);
                                        int var62 = field86 + var58.field971 & 0xFF;
                                        int var63 = field75 + var58.field981;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method537(var62, var58.field975, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class86.field1460[method2424(var60, 96)];
                                    }
                                    if (var58.field973 != -1) {
                                        int var65 = field86 + var58.field974 & 0xFF;
                                        int var66 = field75 + var58.field979;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method537(var65, var58.field978, var66);
                                        var64 = class86.field1460[method2424(var67, 96)];
                                    }
                                    arg0.method1739(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method618(var47, var43), method618(var47, var44), method618(var47, var45), method618(var47, var46), method2424(var61, var43), method2424(var61, var44), method2424(var61, var45), method2424(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method1620(var6, var69, var68, method2495(var6, var69, var68));
                }
            }
            Statics.field1927[var6] = (byte[][]) null;
            Statics.field88[var6] = (byte[][]) null;
            Statics.field79[var6] = (byte[][]) null;
            Statics.field76[var6] = (byte[][]) null;
            Statics.field1299[var6] = (byte[][]) null;
        }
        arg0.method1647(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field73[1][var70][var71] & 0x2) == 2) {
                    arg0.method1618(var70, var71);
                }
            }
        }
        int var72 = 1;
        int var73 = 2;
        int var74 = 4;
        for (int var75 = 0; var75 < 4; var75++) {
            if (var75 > 0) {
                var72 <<= 0x3;
                var73 <<= 0x3;
                var74 <<= 0x3;
            }
            for (int var76 = 0; var76 <= var75; var76++) {
                for (int var77 = 0; var77 <= 104; var77++) {
                    for (int var78 = 0; var78 <= 104; var78++) {
                        if ((Statics.field1296[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field1296[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field1296[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label339: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field1296[var81 - 1][var78][var83] & var72) == 0) {
                                        break label339;
                                    }
                                }
                                var81--;
                            }
                            label328: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field1296[var82 + 1][var78][var84] & var72) == 0) {
                                        break label328;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field77[var82][var78][var79] - var86;
                                int var88 = field77[var81][var78][var79];
                                class81.method1619(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field1296[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1296[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field1296[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field1296[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label392: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field1296[var93 - 1][var95][var77] & var73) == 0) {
                                        break label392;
                                    }
                                }
                                var93--;
                            }
                            label381: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field1296[var94 + 1][var96][var77] & var73) == 0) {
                                        break label381;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field77[var94][var91][var77] - var98;
                                int var100 = field77[var93][var91][var77];
                                class81.method1619(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field1296[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1296[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field1296[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field1296[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label445: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field1296[var76][var103 - 1][var107] & var74) == 0) {
                                        break label445;
                                    }
                                }
                                var103--;
                            }
                            label434: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field1296[var76][var104 + 1][var108] & var74) == 0) {
                                        break label434;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field77[var76][var103][var105];
                                class81.method1619(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field1296[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.o(IIII)I")
    public static int method2495(int arg0, int arg1, int arg2) {
        if ((field73[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field73[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("s.k(III)I")
    public static final int method8(int arg0, int arg1) {
        int var2 = method478(arg0 + 45365, arg1 + 91923, 4) - 128 + (method478(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method478(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("f.p(IIII)I")
    public static final int method478(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method503(var3, var5);
        int var8 = method503(var3 + 1, var5);
        int var9 = method503(var3, var5 + 1);
        int var10 = method503(var3 + 1, var5 + 1);
        int var11 = method772(var7, var8, var4, arg2);
        int var12 = method772(var9, var10, var4, arg2);
        return method772(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ab.u(IIIII)I")
    public static final int method772(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class86.field1464[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("x.g(III)I")
    public static final int method503(int arg0, int arg1) {
        int var2 = method4(arg0 - 1, arg1 - 1) + method4(arg0 + 1, arg1 - 1) + method4(arg0 - 1, arg1 + 1) + method4(arg0 + 1, arg1 + 1);
        int var3 = method4(arg0 - 1, arg1) + method4(arg0 + 1, arg1) + method4(arg0, arg1 - 1) + method4(arg0, arg1 + 1);
        int var4 = method4(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("q.a(III)I")
    public static final int method4(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("aa.y(IIB)I")
    public static final int method618(int arg0, int arg1) {
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

    @ObfuscatedName("do.d(IIS)I")
    public static final int method2424(int arg0, int arg1) {
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

    @ObfuscatedName("an.b(IIII)I")
    public static final int method537(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("a.j(IIIIIIILct;Lhy;I)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class81 arg7, class219 arg8) {
        class38 var9 = class38.method2727(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field865;
            var11 = var9.field863;
        } else {
            var10 = var9.field863;
            var11 = var9.field865;
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
        int[][] var16 = field77[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field868 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field889 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class80 var22;
            if (var9.field872 == -1 && var9.field875 == null) {
                var22 = var9.method692(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class12(arg4, 22, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1624(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field849 == 1) {
                arg8.method3633(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var45;
            if (var9.field872 == -1 && var9.field875 == null) {
                var45 = var9.method692(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class12(arg4, 10, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            if (var45 != null) {
                arg7.method1626(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field849 != 0) {
                arg8.method3631(arg2, arg3, var10, var11, var9.field867);
            }
        } else if (arg6 >= 12) {
            class80 var23;
            if (var9.field872 == -1 && var9.field875 == null) {
                var23 = var9.method692(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1626(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3631(arg2, arg3, var10, var11, var9.field867);
            }
        } else if (arg6 == 0) {
            class80 var24;
            if (var9.field872 == -1 && var9.field875 == null) {
                var24 = var9.method692(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class12(arg4, 0, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1759(arg0, arg2, arg3, var17, var24, (class80) null, field80[arg5], 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3638(arg2, arg3, arg6, arg5, var9.field867);
            }
        } else if (arg6 == 1) {
            class80 var25;
            if (var9.field872 == -1 && var9.field875 == null) {
                var25 = var9.method692(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class12(arg4, 1, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1759(arg0, arg2, arg3, var17, var25, (class80) null, field81[arg5], 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3638(arg2, arg3, arg6, arg5, var9.field867);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class80 var27;
            class80 var28;
            if (var9.field872 == -1 && var9.field875 == null) {
                var27 = var9.method692(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method692(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field872, true, (class80) null);
                var28 = new class12(arg4, 2, var26, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1759(arg0, arg2, arg3, var17, var27, var28, field80[arg5], field80[var26], var20, var21);
            if (var9.field849 != 0) {
                arg8.method3638(arg2, arg3, arg6, arg5, var9.field867);
            }
        } else if (arg6 == 3) {
            class80 var29;
            if (var9.field872 == -1 && var9.field875 == null) {
                var29 = var9.method692(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class12(arg4, 3, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1759(arg0, arg2, arg3, var17, var29, (class80) null, field81[arg5], 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3638(arg2, arg3, arg6, arg5, var9.field867);
            }
        } else if (arg6 == 9) {
            class80 var30;
            if (var9.field872 == -1 && var9.field875 == null) {
                var30 = var9.method692(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1626(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3631(arg2, arg3, var10, var11, var9.field867);
            }
        } else if (arg6 == 4) {
            class80 var31;
            if (var9.field872 == -1 && var9.field875 == null) {
                var31 = var9.method692(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var31, (class80) null, field80[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1636(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class38.method2727(var33 >> 14 & 0x7FFF).field873;
            }
            class80 var34;
            if (var9.field872 == -1 && var9.field875 == null) {
                var34 = var9.method692(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var34, (class80) null, field80[arg5], 0, field87[arg5] * var32, field83[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1636(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class38.method2727(var36 >> 14 & 0x7FFF).field873 / 2;
            }
            class80 var37;
            if (var9.field872 == -1 && var9.field875 == null) {
                var37 = var9.method692(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var37, (class80) null, 256, arg5, field82[arg5] * var35, field85[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class80 var39;
            if (var9.field872 == -1 && var9.field875 == null) {
                var39 = var9.method692(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class12(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var39, (class80) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1636(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class38.method2727(var41 >> 14 & 0x7FFF).field873 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class80 var43;
            class80 var44;
            if (var9.field872 == -1 && var9.field875 == null) {
                var43 = var9.method692(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method692(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field872, true, (class80) null);
                var44 = new class12(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field872, true, (class80) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field82[arg5] * var40, field85[arg5] * var40, var20, var21);
        }
    }
}
