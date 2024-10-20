package deob;

@ObfuscatedName("h")
public final class class6 {

    @ObfuscatedName("h.e")
    public static int[][][] field91 = new int[4][105][105];

    @ObfuscatedName("h.w")
    public static byte[][][] field81 = new byte[4][104][104];

    @ObfuscatedName("h.f")
    public static int field82 = 99;

    @ObfuscatedName("h.x")
    public static final int[] field86 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("h.b")
    public static final int[] field97 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("h.q")
    public static final int[] field88 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("h.u")
    public static final int[] field89 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("h.t")
    public static final int[] field90 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("h.d")
    public static final int[] field84 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("h.z")
    public static int field92 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("h.v")
    public static int field93 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.e(I)V")
    public static void method970() {
        field82 = 99;
        Statics.field1432 = new byte[4][104][104];
        Statics.field2025 = new byte[4][104][104];
        Statics.field1857 = new byte[4][104][104];
        Statics.field83 = new byte[4][104][104];
        Statics.field75 = new int[4][105][105];
        Statics.field99 = new byte[4][105][105];
        Statics.field1603 = new int[105][105];
        Statics.field3077 = new int[104];
        Statics.field1505 = new int[104];
        Statics.field1530 = new int[104];
        Statics.field724 = new int[104];
        Statics.field85 = new int[104];
    }

    @ObfuscatedName("as.w(IIIII)V")
    public static final void method1038(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field99[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field91[0][var5][var4] = field91[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field91[0][var5][var4] = field91[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field91[0][var5][var4] = field91[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field91[0][var5][var4] = field91[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.f(IIII)V")
    public static final void method1(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field91[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field91[arg0][arg1][arg2 + var5] = field91[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field91[arg0][arg1 + var6][arg2] = field91[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field91[arg0][arg1 - 1][arg2] != 0) {
            field91[arg0][arg1][arg2] = field91[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field91[arg0][arg1][arg2 - 1] != 0) {
            field91[arg0][arg1][arg2] = field91[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field91[arg0][arg1 - 1][arg2 - 1] != 0) {
            field91[arg0][arg1][arg2] = field91[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("fe.s(Ldq;IIIIIIB)V")
    public static final void method3191(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2355();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2355();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2355();
                }
            }
            return;
        }
        field81[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2355();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field91[0][arg2][arg3] = -method2295(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field91[arg1][arg2][arg3] = field91[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2355();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field91[0][arg2][arg3] = -var8 * 8;
                } else {
                    field91[arg1][arg2][arg3] = field91[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2025[arg1][arg2][arg3] = arg0.method2465();
                Statics.field1857[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field83[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field81[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1432[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("z.p([BIII)Z")
    public static final boolean method587(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class120 var4 = new class120(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2368();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2368();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2355() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method626(var5);
                        if (var13 != 22 || !client.field286 || var16.field923 != 0 || var16.field925 == 1 || var16.field941) {
                            if (!var16.method767()) {
                                client.field336++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2368();
                if (var9 == 0) {
                    break;
                }
                var4.method2355();
            }
        }
    }

    @ObfuscatedName("da.h([BIILcr;[Ldb;I)V")
    public static final void method2301(byte[] arg0, int arg1, int arg2, class87 arg3, class109[] arg4) {
        class120 var5 = new class120(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2368();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2368();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2355();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field81[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class109 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ab.g([BIIIIIIILcr;[Ldb;I)V")
    public static final void method695(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class87 arg8, class109[] arg9) {
        class120 var10 = new class120(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2368();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2368();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2355();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class41 var21 = class41.method626(var11);
                    int var22 = arg2 + class178.method110(var16 & 0x7, var15 & 0x7, arg7, var21.field909, var21.field916, var20);
                    int var23 = arg3 + class178.method2691(var16 & 0x7, var15 & 0x7, arg7, var21.field909, var21.field916, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field81[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class109 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method2(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.a(IIIIIILcr;Ldb;B)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, class109 arg7) {
        if (client.field286 && (field81[0][arg1][arg2] & 0x2) == 0 && (field81[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field82) {
            field82 = arg0;
        }
        class41 var8 = class41.method626(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field916;
            var10 = var8.field909;
        } else {
            var9 = var8.field909;
            var10 = var8.field916;
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
        int[][] var15 = field91[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field923 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field949 == 1) {
            var20 += 256;
        }
        if (var8.method798()) {
            class24 var21 = new class24();
            var21.field590 = arg0;
            var21.field591 = arg1 * 128;
            var21.field598 = arg2 * 128;
            int var22 = var8.field909;
            int var23 = var8.field916;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field916;
                var23 = var8.field909;
            }
            var21.field593 = (arg1 + var22) * 128;
            var21.field594 = (arg2 + var23) * 128;
            var21.field589 = var8.field944;
            var21.field595 = var8.field936 * 128;
            var21.field601 = var8.field938;
            var21.field599 = var8.field947;
            var21.field600 = var8.field948;
            if (var8.field924 != null) {
                var21.field603 = var8;
                var21.method580();
            }
            class24.field602.method3553(var21);
            if (var21.field600 != null) {
                var21.field596 = var21.field601 + (int) (Math.random() * (double) (var21.field599 - var21.field601));
            }
        }
        if (arg5 == 22) {
            if (!client.field286 || var8.field923 != 0 || var8.field925 == 1 || var8.field941) {
                class86 var24;
                if (var8.field939 == -1 && var8.field924 == null) {
                    var24 = var8.method768(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
                }
                arg6.method1782(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field925 == 1 && arg7 != null) {
                    arg7.method2246(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class86 var47;
            if (var8.field939 == -1 && var8.field924 == null) {
                var47 = var8.method768(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            if (var47 != null && arg6.method1789(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field931) {
                int var48 = 15;
                if (var47 instanceof class106) {
                    var48 = ((class106) var47).method2169() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field99[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field99[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field925 != 0 && arg7 != null) {
                arg7.method2244(arg1, arg2, var9, var10, var8.field918);
            }
        } else if (arg5 >= 12) {
            class86 var25;
            if (var8.field939 == -1 && var8.field924 == null) {
                var25 = var8.method768(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field75[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field925 != 0 && arg7 != null) {
                arg7.method2244(arg1, arg2, var9, var10, var8.field918);
            }
        } else if (arg5 == 0) {
            class86 var26;
            if (var8.field939 == -1 && var8.field924 == null) {
                var26 = var8.method768(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1880(arg0, arg1, arg2, var16, var26, (class86) null, field86[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field931) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field922) {
                    Statics.field75[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field931) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field922) {
                    Statics.field75[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field931) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field922) {
                    Statics.field75[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field931) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field922) {
                    Statics.field75[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field925 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field918);
            }
            if (var8.field946 != 16) {
                arg6.method1936(arg0, arg1, arg2, var8.field946);
            }
        } else if (arg5 == 1) {
            class86 var27;
            if (var8.field939 == -1 && var8.field924 == null) {
                var27 = var8.method768(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1880(arg0, arg1, arg2, var16, var27, (class86) null, field97[arg4], 0, var19, var20);
            if (var8.field931) {
                if (arg4 == 0) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field925 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field918);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class86 var29;
            class86 var30;
            if (var8.field939 == -1 && var8.field924 == null) {
                var29 = var8.method768(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method768(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field939, true, (class86) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1880(arg0, arg1, arg2, var16, var29, var30, field86[arg4], field86[var28], var19, var20);
            if (var8.field922) {
                if (arg4 == 0) {
                    Statics.field75[arg0][arg1][arg2] |= 0x249;
                    Statics.field75[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field75[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field75[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field75[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field75[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field75[arg0][arg1][arg2] |= 0x492;
                    Statics.field75[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field925 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field918);
            }
            if (var8.field946 != 16) {
                arg6.method1936(arg0, arg1, arg2, var8.field946);
            }
        } else if (arg5 == 3) {
            class86 var31;
            if (var8.field939 == -1 && var8.field924 == null) {
                var31 = var8.method768(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1880(arg0, arg1, arg2, var16, var31, (class86) null, field97[arg4], 0, var19, var20);
            if (var8.field931) {
                if (arg4 == 0) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field925 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field918);
            }
        } else if (arg5 == 9) {
            class86 var32;
            if (var8.field939 == -1 && var8.field924 == null) {
                var32 = var8.method768(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field925 != 0 && arg7 != null) {
                arg7.method2244(arg1, arg2, var9, var10, var8.field918);
            }
            if (var8.field946 != 16) {
                arg6.method1936(arg0, arg1, arg2, var8.field946);
            }
        } else if (arg5 == 4) {
            class86 var33;
            if (var8.field939 == -1 && var8.field924 == null) {
                var33 = var8.method768(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1788(arg0, arg1, arg2, var16, var33, (class86) null, field86[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1805(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method626(var35 >> 14 & 0x7FFF).field946;
            }
            class86 var36;
            if (var8.field939 == -1 && var8.field924 == null) {
                var36 = var8.method768(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1788(arg0, arg1, arg2, var16, var36, (class86) null, field86[arg4], 0, field88[arg4] * var34, field89[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1805(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method626(var38 >> 14 & 0x7FFF).field946 / 2;
            }
            class86 var39;
            if (var8.field939 == -1 && var8.field924 == null) {
                var39 = var8.method768(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1788(arg0, arg1, arg2, var16, var39, (class86) null, 256, arg4, field90[arg4] * var37, field84[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class86 var41;
            if (var8.field939 == -1 && var8.field924 == null) {
                var41 = var8.method768(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1788(arg0, arg1, arg2, var16, var41, (class86) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1805(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method626(var43 >> 14 & 0x7FFF).field946 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class86 var45;
            class86 var46;
            if (var8.field939 == -1 && var8.field924 == null) {
                var45 = var8.method768(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method768(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field939, true, (class86) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field939, true, (class86) null);
            }
            arg6.method1788(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field90[arg4] * var42, field84[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("w.r(Lcr;[Ldb;B)V")
    public static final void method11(class87 arg0, class109[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field81[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field81[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2258(var3, var4);
                        }
                    }
                }
            }
        }
        field92 += (int) (Math.random() * 5.0D) - 2;
        if (field92 < -8) {
            field92 = -8;
        }
        if (field92 > 8) {
            field92 = 8;
        }
        field93 += (int) (Math.random() * 5.0D) - 2;
        if (field93 < -16) {
            field93 = -16;
        }
        if (field93 > 16) {
            field93 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field99[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field91[var6][var11 + 1][var10] - field91[var6][var11 - 1][var10];
                    int var13 = field91[var6][var11][var10 + 1] - field91[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1603[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field3077[var20] = 0;
                Statics.field1505[var20] = 0;
                Statics.field1530[var20] = 0;
                Statics.field724[var20] = 0;
                Statics.field85[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field1432[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class42 var26 = (class42) class42.field951.method3473((long) var25);
                            class42 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field960.method3048(1, var25);
                                class42 var29 = new class42();
                                if (var28 != null) {
                                    var29.method816(new class120(var28), var25);
                                }
                                var29.method814();
                                class42.field951.method3475(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field3077[var22] += var27.field956;
                            Statics.field1505[var22] += var27.field954;
                            Statics.field1530[var22] += var27.field955;
                            Statics.field724[var22] += var27.field952;
                            var10002 = Statics.field85[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field1432[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class42 var34 = (class42) class42.field951.method3473((long) var33);
                            class42 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field960.method3048(1, var33);
                                class42 var37 = new class42();
                                if (var36 != null) {
                                    var37.method816(new class120(var36), var33);
                                }
                                var37.method814();
                                class42.field951.method3475(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field3077[var22] -= var35.field956;
                            Statics.field1505[var22] -= var35.field954;
                            Statics.field1530[var22] -= var35.field955;
                            Statics.field724[var22] -= var35.field952;
                            var10002 = Statics.field85[var22]--;
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
                            var39 += Statics.field3077[var45];
                            var40 += Statics.field1505[var45];
                            var41 += Statics.field1530[var45];
                            var42 += Statics.field724[var45];
                            var43 += Statics.field85[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field3077[var46];
                            var40 -= Statics.field1505[var46];
                            var41 -= Statics.field1530[var46];
                            var42 -= Statics.field724[var46];
                            var43 -= Statics.field85[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field286 || (field81[0][var21][var44] & 0x2) != 0 || (field81[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field82) {
                                field82 = var6;
                            }
                            int var47 = Statics.field1432[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field2025[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field91[var6][var21][var44];
                                int var50 = field91[var6][var21 + 1][var44];
                                int var51 = field91[var6][var21 + 1][var44 + 1];
                                int var52 = field91[var6][var21][var44 + 1];
                                int var53 = Statics.field1603[var21][var44];
                                int var54 = Statics.field1603[var21 + 1][var44];
                                int var55 = Statics.field1603[var21 + 1][var44 + 1];
                                int var56 = Statics.field1603[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method151(var59, var60, var61);
                                    int var62 = field92 + var59 & 0xFF;
                                    int var63 = field93 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method151(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field1857[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class47.method1952(var48 - 1).field1031) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field75[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class92.field1565[method1212(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1814(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1212(var57, var53), method1212(var57, var54), method1212(var57, var55), method1212(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field1857[var6][var21][var44] + 1;
                                    byte var67 = Statics.field83[var6][var21][var44];
                                    class47 var68 = class47.method1952(var48 - 1);
                                    int var69 = var68.field1030;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1570.method2025(var69);
                                        var71 = -1;
                                    } else if (var68.field1039 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method151(var68.field1028, var68.field1034, var68.field1035);
                                        int var72 = field92 + var68.field1028 & 0xFF;
                                        int var73 = field93 + var68.field1035;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method151(var72, var68.field1034, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class92.field1565[method2584(var70, 96)];
                                    }
                                    if (var68.field1033 != -1) {
                                        int var75 = field92 + var68.field1036 & 0xFF;
                                        int var76 = field93 + var68.field1038;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method151(var75, var68.field1037, var76);
                                        var74 = class92.field1565[method2584(var77, 96)];
                                    }
                                    arg0.method1814(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method1212(var57, var53), method1212(var57, var54), method1212(var57, var55), method1212(var57, var56), method2584(var71, var53), method2584(var71, var54), method2584(var71, var55), method2584(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field81[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field81[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method1783(var6, var79, var78, var84);
                }
            }
            Statics.field1432[var6] = (byte[][]) null;
            Statics.field2025[var6] = (byte[][]) null;
            Statics.field1857[var6] = (byte[][]) null;
            Statics.field83[var6] = (byte[][]) null;
            Statics.field99[var6] = (byte[][]) null;
        }
        arg0.method1810(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field81[1][var85][var86] & 0x2) == 2) {
                    arg0.method1781(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field75[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field75[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field75[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field75[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field75[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field91[var97][var93][var94] - var101;
                                int var103 = field91[var96][var93][var94];
                                class87.method1787(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field75[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field75[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field75[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field75[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field75[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field75[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field91[var109][var106][var92] - var113;
                                int var115 = field91[var108][var106][var92];
                                class87.method1787(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field75[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field75[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field75[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field75[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field75[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field75[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field91[var91][var118][var120];
                                class87.method1787(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field75[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("di.k(IIB)I")
    public static final int method2295(int arg0, int arg1) {
        int var2 = Statics.method2625(arg0 + 45365, arg1 + 91923, 4) - 128 + (Statics.method2625(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Statics.method2625(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("j.n(III)I")
    public static final int method165(int arg0, int arg1) {
        int var2 = method2163(arg0 - 1, arg1 - 1) + method2163(arg0 + 1, arg1 - 1) + method2163(arg0 - 1, arg1 + 1) + method2163(arg0 + 1, arg1 + 1);
        int var3 = method2163(arg0 - 1, arg1) + method2163(arg0 + 1, arg1) + method2163(arg0, arg1 - 1) + method2163(arg0, arg1 + 1);
        int var4 = method2163(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dk.y(III)I")
    public static final int method2163(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bw.i(III)I")
    public static final int method1212(int arg0, int arg1) {
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

    @ObfuscatedName("dm.j(III)I")
    public static final int method2584(int arg0, int arg1) {
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

    @ObfuscatedName("n.l(IIIB)I")
    public static final int method151(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ap.o(IIIIIIILcr;Ldb;S)V")
    public static final void method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class87 arg7, class109 arg8) {
        class41 var9 = class41.method626(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field916;
            var11 = var9.field909;
        } else {
            var10 = var9.field909;
            var11 = var9.field916;
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
        int[][] var16 = field91[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field923 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field949 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class86 var22;
            if (var9.field939 == -1 && var9.field924 == null) {
                var22 = var9.method774(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1782(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field925 == 1) {
                arg8.method2246(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class86 var45;
            if (var9.field939 == -1 && var9.field924 == null) {
                var45 = var9.method774(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            if (var45 != null) {
                arg7.method1789(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field925 != 0) {
                arg8.method2244(arg2, arg3, var10, var11, var9.field918);
            }
        } else if (arg6 >= 12) {
            class86 var23;
            if (var9.field939 == -1 && var9.field924 == null) {
                var23 = var9.method774(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1789(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field925 != 0) {
                arg8.method2244(arg2, arg3, var10, var11, var9.field918);
            }
        } else if (arg6 == 0) {
            class86 var24;
            if (var9.field939 == -1 && var9.field924 == null) {
                var24 = var9.method774(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1880(arg0, arg2, arg3, var17, var24, (class86) null, field86[arg5], 0, var20, var21);
            if (var9.field925 != 0) {
                arg8.method2247(arg2, arg3, arg6, arg5, var9.field918);
            }
        } else if (arg6 == 1) {
            class86 var25;
            if (var9.field939 == -1 && var9.field924 == null) {
                var25 = var9.method774(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1880(arg0, arg2, arg3, var17, var25, (class86) null, field97[arg5], 0, var20, var21);
            if (var9.field925 != 0) {
                arg8.method2247(arg2, arg3, arg6, arg5, var9.field918);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class86 var27;
            class86 var28;
            if (var9.field939 == -1 && var9.field924 == null) {
                var27 = var9.method774(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method774(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field939, true, (class86) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1880(arg0, arg2, arg3, var17, var27, var28, field86[arg5], field86[var26], var20, var21);
            if (var9.field925 != 0) {
                arg8.method2247(arg2, arg3, arg6, arg5, var9.field918);
            }
        } else if (arg6 == 3) {
            class86 var29;
            if (var9.field939 == -1 && var9.field924 == null) {
                var29 = var9.method774(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1880(arg0, arg2, arg3, var17, var29, (class86) null, field97[arg5], 0, var20, var21);
            if (var9.field925 != 0) {
                arg8.method2247(arg2, arg3, arg6, arg5, var9.field918);
            }
        } else if (arg6 == 9) {
            class86 var30;
            if (var9.field939 == -1 && var9.field924 == null) {
                var30 = var9.method774(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1789(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field925 != 0) {
                arg8.method2244(arg2, arg3, var10, var11, var9.field918);
            }
        } else if (arg6 == 4) {
            class86 var31;
            if (var9.field939 == -1 && var9.field924 == null) {
                var31 = var9.method774(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1788(arg0, arg2, arg3, var17, var31, (class86) null, field86[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1805(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class41.method626(var33 >> 14 & 0x7FFF).field946;
            }
            class86 var34;
            if (var9.field939 == -1 && var9.field924 == null) {
                var34 = var9.method774(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1788(arg0, arg2, arg3, var17, var34, (class86) null, field86[arg5], 0, field88[arg5] * var32, field89[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1805(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class41.method626(var36 >> 14 & 0x7FFF).field946 / 2;
            }
            class86 var37;
            if (var9.field939 == -1 && var9.field924 == null) {
                var37 = var9.method774(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1788(arg0, arg2, arg3, var17, var37, (class86) null, 256, arg5, field90[arg5] * var35, field84[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class86 var39;
            if (var9.field939 == -1 && var9.field924 == null) {
                var39 = var9.method774(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1788(arg0, arg2, arg3, var17, var39, (class86) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1805(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class41.method626(var41 >> 14 & 0x7FFF).field946 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class86 var43;
            class86 var44;
            if (var9.field939 == -1 && var9.field924 == null) {
                var43 = var9.method774(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method774(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field939, true, (class86) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field939, true, (class86) null);
            }
            arg7.method1788(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field90[arg5] * var40, field84[arg5] * var40, var20, var21);
        }
    }
}
