package deob;

@ObfuscatedName("bm")
public final class class75 {

    @ObfuscatedName("bm.c")
    public static int[][][] field1011 = new int[4][105][105];

    @ObfuscatedName("bm.v")
    public static byte[][][] field996 = new byte[4][104][104];

    @ObfuscatedName("bm.q")
    public static int field1005 = 99;

    @ObfuscatedName("bm.l")
    public static final int[] field1008 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bm.a")
    public static final int[] field1012 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bm.p")
    public static final int[] field1004 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bm.b")
    public static final int[] field1006 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bm.n")
    public static final int[] field1007 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bm.o")
    public static final int[] field1003 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bm.m")
    public static int field1009 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bm.d")
    public static int field1010 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("id.c(I)V")
    public static void method4703() {
        field1005 = 99;
        Statics.field998 = new byte[4][104][104];
        Statics.field999 = new byte[4][104][104];
        Statics.field995 = new byte[4][104][104];
        Statics.field997 = new byte[4][104][104];
        Statics.field3 = new int[4][105][105];
        Statics.field1416 = new byte[4][105][105];
        Statics.field4652 = new int[105][105];
        Statics.field3192 = new int[104];
        Statics.field1002 = new int[104];
        Statics.field1327 = new int[104];
        Statics.field4836 = new int[104];
        Statics.field2878 = new int[104];
    }

    @ObfuscatedName("my.v(B)V")
    public static void method5981() {
        Statics.field998 = (byte[][][]) null;
        Statics.field999 = (byte[][][]) null;
        Statics.field995 = (byte[][][]) null;
        Statics.field997 = (byte[][][]) null;
        Statics.field3 = (int[][][]) null;
        Statics.field1416 = (byte[][][]) null;
        Statics.field4652 = (int[][]) null;
        Statics.field3192 = null;
        Statics.field1002 = null;
        Statics.field1327 = null;
        Statics.field4836 = null;
        Statics.field2878 = null;
    }

    @ObfuscatedName("t.q(IIIII)V")
    public static final void method93(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1416[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1011[0][var5][var4] = field1011[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1011[0][var5][var4] = field1011[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1011[0][var5][var4] = field1011[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1011[0][var5][var4] = field1011[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("qi.f([BIIII[Lgv;S)V")
    public static final void method7331(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class191[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2191[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class443 var9 = new class443(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2311(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("d.j([BIIIIIII[Lgv;B)V")
    public static final void method310(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class191[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2191[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class443 var11 = new class443(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method2311(var11, arg1, arg2 + class290.method2629(var13 & 0x7, var14 & 0x7, arg7), arg3 + class290.method3493(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2311(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.e(IIII)V")
    public static final void method347(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1011[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1011[arg0][arg1][arg2 + var5] = field1011[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1011[arg0][arg1 + var6][arg2] = field1011[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1011[arg0][arg1 - 1][arg2] != 0) {
            field1011[arg0][arg1][arg2] = field1011[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1011[arg0][arg1][arg2 - 1] != 0) {
            field1011[arg0][arg1][arg2] = field1011[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1011[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1011[arg0][arg1][arg2] = field1011[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ca.g(Lqt;IIIIIII)V")
    public static final void method2311(class443 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method7047();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method7047();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method7047();
                }
            }
            return;
        }
        field996[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method7047();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field1011[0][arg2][arg3] = -method151(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field1011[arg1][arg2][arg3] = field1011[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method7047();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field1011[0][arg2][arg3] = -var8 * 8;
                } else {
                    field1011[arg1][arg2][arg3] = field1011[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field999[arg1][arg2][arg3] = arg0.method7048();
                Statics.field995[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field997[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field996[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field998[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dy.w([BIIB)Z")
    public static final boolean method2486(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class443 var4 = new class443(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method7084();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method7062();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method7047() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class187 var16 = class187.method3000(var5);
                        if (var13 != 22 || !client.field701 || var16.field2060 != 0 || var16.field2058 == 1 || var16.field2079) {
                            if (!var16.method3334()) {
                                client.field548++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method7062();
                if (var9 == 0) {
                    break;
                }
                var4.method7047();
            }
        }
    }

    @ObfuscatedName("hj.y([BIILgg;[Lgv;I)V")
    public static final void method4191(byte[] arg0, int arg1, int arg2, class204 arg3, class191[] arg4) {
        class443 var5 = new class443(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method7084();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method7062();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method7047();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field996[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class191 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method4729(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bm.i([BIIIIIIILgg;[Lgv;)V")
    public static final void method1912(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class204 arg8, class191[] arg9) {
        class443 var10 = new class443(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method7084();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method7062();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method7047();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class187 var21 = class187.method3000(var11);
                    int var22 = arg2 + class290.method3485(var16 & 0x7, var15 & 0x7, arg7, var21.field2046, var21.field2057, var20);
                    int var23 = arg3 + class290.method2820(var16 & 0x7, var15 & 0x7, arg7, var21.field2046, var21.field2057, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field996[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class191 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method4729(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("jh.s(IIIIIILgg;Lgv;B)V")
    public static final void method4729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class204 arg6, class191 arg7) {
        if (client.field701 && (field996[0][arg1][arg2] & 0x2) == 0 && (field996[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1005) {
            field1005 = arg0;
        }
        class187 var8 = class187.method3000(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2057;
            var10 = var8.field2046;
        } else {
            var9 = var8.field2046;
            var10 = var8.field2057;
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
        int[][] var15 = field1011[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class212.method2959(arg1, arg2, 2, var8.field2060 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2059 == 1) {
            var21 += 256;
        }
        if (var8.method3342()) {
            class63.method36(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field701 || var8.field2060 != 0 || var8.field2058 == 1 || var8.field2079) {
                class205 var22;
                if (var8.field2064 == -1 && var8.field2082 == null) {
                    var22 = var8.method3335(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
                }
                arg6.method3970(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2058 == 1 && arg7 != null) {
                    arg7.method3576(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class205 var48;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var48 = var8.method3335(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            if (var48 != null && arg6.method3857(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2072) {
                int var49 = 15;
                if (var48 instanceof class211) {
                    var49 = ((class211) var48).method4121() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field1416[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field1416[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2058 != 0 && arg7 != null) {
                arg7.method3554(arg1, arg2, var9, var10, var8.field2044);
            }
        } else if (arg5 >= 12) {
            class205 var23;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var23 = var8.method3335(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3857(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2058 != 0 && arg7 != null) {
                arg7.method3554(arg1, arg2, var9, var10, var8.field2044);
            }
        } else if (arg5 == 0) {
            class205 var24;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var24 = var8.method3335(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3965(arg0, arg1, arg2, var16, var24, (class205) null, field1008[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2072) {
                    Statics.field1416[arg0][arg1][arg2] = 50;
                    Statics.field1416[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2063) {
                    Statics.field3[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2072) {
                    Statics.field1416[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1416[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2063) {
                    Statics.field3[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2072) {
                    Statics.field1416[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1416[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2063) {
                    Statics.field3[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2072) {
                    Statics.field1416[arg0][arg1][arg2] = 50;
                    Statics.field1416[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2063) {
                    Statics.field3[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2058 != 0 && arg7 != null) {
                arg7.method3553(arg1, arg2, arg5, arg4, var8.field2044);
            }
            if (var8.field2070 != 16) {
                arg6.method3840(arg0, arg1, arg2, var8.field2070);
            }
        } else if (arg5 == 1) {
            class205 var25;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var25 = var8.method3335(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3965(arg0, arg1, arg2, var16, var25, (class205) null, field1012[arg4], 0, var19, var21);
            if (var8.field2072) {
                if (arg4 == 0) {
                    Statics.field1416[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1416[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1416[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1416[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2058 != 0 && arg7 != null) {
                arg7.method3553(arg1, arg2, arg5, arg4, var8.field2044);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class205 var27;
            class205 var28;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var27 = var8.method3335(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3335(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
                var28 = new class73(arg3, 2, var26, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3965(arg0, arg1, arg2, var16, var27, var28, field1008[arg4], field1008[var26], var19, var21);
            if (var8.field2063) {
                if (arg4 == 0) {
                    Statics.field3[arg0][arg1][arg2] |= 0x249;
                    Statics.field3[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3[arg0][arg1][arg2] |= 0x492;
                    Statics.field3[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2058 != 0 && arg7 != null) {
                arg7.method3553(arg1, arg2, arg5, arg4, var8.field2044);
            }
            if (var8.field2070 != 16) {
                arg6.method3840(arg0, arg1, arg2, var8.field2070);
            }
        } else if (arg5 == 3) {
            class205 var29;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var29 = var8.method3335(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3965(arg0, arg1, arg2, var16, var29, (class205) null, field1012[arg4], 0, var19, var21);
            if (var8.field2072) {
                if (arg4 == 0) {
                    Statics.field1416[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1416[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1416[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1416[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2058 != 0 && arg7 != null) {
                arg7.method3553(arg1, arg2, arg5, arg4, var8.field2044);
            }
        } else if (arg5 == 9) {
            class205 var30;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var30 = var8.method3335(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3857(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2058 != 0 && arg7 != null) {
                arg7.method3554(arg1, arg2, var9, var10, var8.field2044);
            }
            if (var8.field2070 != 16) {
                arg6.method3840(arg0, arg1, arg2, var8.field2070);
            }
        } else if (arg5 == 4) {
            class205 var31;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var31 = var8.method3335(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3969(arg0, arg1, arg2, var16, var31, (class205) null, field1008[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3854(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class187.method3000(class212.method937(var33)).field2070;
            }
            class205 var35;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var35 = var8.method3335(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3969(arg0, arg1, arg2, var16, var35, (class205) null, field1008[arg4], 0, field1004[arg4] * var32, field1006[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3854(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class187.method3000(class212.method937(var37)).field2070 / 2;
            }
            class205 var39;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var39 = var8.method3335(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3969(arg0, arg1, arg2, var16, var39, (class205) null, 256, arg4, field1007[arg4] * var36, field1003[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class205 var41;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var41 = var8.method3335(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class73(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3969(arg0, arg1, arg2, var16, var41, (class205) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3854(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class187.method3000(class212.method937(var43)).field2070 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class205 var46;
            class205 var47;
            if (var8.field2064 == -1 && var8.field2082 == null) {
                var46 = var8.method3335(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3335(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
                var47 = new class73(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2064, var8.field2092, (class205) null);
            }
            arg6.method3969(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1007[arg4] * var42, field1003[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("eg.t(Lgg;[Lgv;I)V")
    public static final void method2723(class204 arg0, class191[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field996[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field996[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3555(var3, var4);
                        }
                    }
                }
            }
        }
        field1009 += (int) (Math.random() * 5.0D) - 2;
        if (field1009 < -8) {
            field1009 = -8;
        }
        if (field1009 > 8) {
            field1009 = 8;
        }
        field1010 += (int) (Math.random() * 5.0D) - 2;
        if (field1010 < -16) {
            field1010 = -16;
        }
        if (field1010 > 16) {
            field1010 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1416[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1011[var6][var16 + 1][var15] - field1011[var6][var16 - 1][var15];
                    int var18 = field1011[var6][var16][var15 + 1] - field1011[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field4652[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field3192[var25] = 0;
                Statics.field1002[var25] = 0;
                Statics.field1327[var25] = 0;
                Statics.field4836[var25] = 0;
                Statics.field2878[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = Statics.field998[var6][var28][var27] & 0xFF;
                        if (var29 > 0) {
                            int var30 = var29 - 1;
                            class181 var31 = (class181) class181.field1983.method4691((long) var30);
                            class181 var32;
                            if (var31 == null) {
                                byte[] var33 = Statics.field1991.method5305(1, var30);
                                class181 var34 = new class181();
                                if (var33 != null) {
                                    var34.method3225(new class443(var33), var30);
                                }
                                var34.method3232();
                                class181.field1983.method4693(var34, (long) var30);
                                var32 = var34;
                            } else {
                                var32 = var31;
                            }
                            Statics.field3192[var27] += var32.field1986;
                            Statics.field1002[var27] += var32.field1987;
                            Statics.field1327[var27] += var32.field1988;
                            Statics.field4836[var27] += var32.field1989;
                            var10002 = Statics.field2878[var27]++;
                        }
                    }
                    int var36 = var26 - 5;
                    if (var36 >= 0 && var36 < 104) {
                        int var37 = Statics.field998[var6][var36][var27] & 0xFF;
                        if (var37 > 0) {
                            int var38 = var37 - 1;
                            class181 var39 = (class181) class181.field1983.method4691((long) var38);
                            class181 var40;
                            if (var39 == null) {
                                byte[] var41 = Statics.field1991.method5305(1, var38);
                                class181 var42 = new class181();
                                if (var41 != null) {
                                    var42.method3225(new class443(var41), var38);
                                }
                                var42.method3232();
                                class181.field1983.method4693(var42, (long) var38);
                                var40 = var42;
                            } else {
                                var40 = var39;
                            }
                            Statics.field3192[var27] -= var40.field1986;
                            Statics.field1002[var27] -= var40.field1987;
                            Statics.field1327[var27] -= var40.field1988;
                            Statics.field4836[var27] -= var40.field1989;
                            var10002 = Statics.field2878[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var44 = 0;
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    int var48 = 0;
                    for (int var49 = -5; var49 < 109; var49++) {
                        int var50 = var49 + 5;
                        if (var50 >= 0 && var50 < 104) {
                            var44 += Statics.field3192[var50];
                            var45 += Statics.field1002[var50];
                            var46 += Statics.field1327[var50];
                            var47 += Statics.field4836[var50];
                            var48 += Statics.field2878[var50];
                        }
                        int var51 = var49 - 5;
                        if (var51 >= 0 && var51 < 104) {
                            var44 -= Statics.field3192[var51];
                            var45 -= Statics.field1002[var51];
                            var46 -= Statics.field1327[var51];
                            var47 -= Statics.field4836[var51];
                            var48 -= Statics.field2878[var51];
                        }
                        if (var49 >= 1 && var49 < 103 && (!client.field701 || (field996[0][var26][var49] & 0x2) != 0 || (field996[var6][var26][var49] & 0x10) == 0)) {
                            if (var6 < field1005) {
                                field1005 = var6;
                            }
                            int var52 = Statics.field998[var6][var26][var49] & 0xFF;
                            int var53 = Statics.field999[var6][var26][var49] & 0xFF;
                            if (var52 > 0 || var53 > 0) {
                                int var54 = field1011[var6][var26][var49];
                                int var55 = field1011[var6][var26 + 1][var49];
                                int var56 = field1011[var6][var26 + 1][var49 + 1];
                                int var57 = field1011[var6][var26][var49 + 1];
                                int var58 = Statics.field4652[var26][var49];
                                int var59 = Statics.field4652[var26 + 1][var49];
                                int var60 = Statics.field4652[var26 + 1][var49 + 1];
                                int var61 = Statics.field4652[var26][var49 + 1];
                                int var62 = -1;
                                int var63 = -1;
                                if (var52 > 0) {
                                    int var64 = var44 * 256 / var47;
                                    int var65 = var45 / var48;
                                    int var66 = var46 / var48;
                                    var62 = method260(var64, var65, var66);
                                    int var67 = field1009 + var64 & 0xFF;
                                    int var68 = field1010 + var66;
                                    if (var68 < 0) {
                                        var68 = 0;
                                    } else if (var68 > 255) {
                                        var68 = 255;
                                    }
                                    var63 = method260(var67, var65, var68);
                                }
                                if (var6 > 0) {
                                    boolean var69 = true;
                                    if (var52 == 0 && Statics.field995[var6][var26][var49] != 0) {
                                        var69 = false;
                                    }
                                    if (var53 > 0 && !class189.method2677(var53 - 1).field2150) {
                                        var69 = false;
                                    }
                                    if (var69 && var54 == var55 && var54 == var56 && var54 == var57) {
                                        Statics.field3[var6][var26][var49] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var63 != -1) {
                                    var70 = class201.field2354[method2696(var63, 96)];
                                }
                                if (var53 == 0) {
                                    arg0.method3830(var6, var26, var49, 0, 0, -1, var54, var55, var56, var57, method2696(var62, var58), method2696(var62, var59), method2696(var62, var60), method2696(var62, var61), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field995[var6][var26][var49] + 1;
                                    byte var72 = Statics.field997[var6][var26][var49];
                                    class189 var73 = class189.method2677(var53 - 1);
                                    int var74 = var73.field2153;
                                    int var75;
                                    int var76;
                                    if (var74 >= 0) {
                                        var75 = Statics.field2364.method4038(var74);
                                        var76 = -1;
                                    } else if (var73.field2152 == 16711935) {
                                        var76 = -2;
                                        var74 = -1;
                                        var75 = -2;
                                    } else {
                                        var76 = method260(var73.field2154, var73.field2157, var73.field2160);
                                        int var77 = field1009 + var73.field2154 & 0xFF;
                                        int var78 = field1010 + var73.field2160;
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        var75 = method260(var77, var73.field2157, var78);
                                    }
                                    int var79 = 0;
                                    if (var75 != -2) {
                                        var79 = class201.field2354[method5514(var75, 96)];
                                    }
                                    if (var73.field2155 != -1) {
                                        int var80 = field1009 + var73.field2159 & 0xFF;
                                        int var81 = field1010 + var73.field2161;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        int var82 = method260(var80, var73.field2151, var81);
                                        var79 = class201.field2354[method5514(var82, 96)];
                                    }
                                    arg0.method3830(var6, var26, var49, var71, var72, var74, var54, var55, var56, var57, method2696(var62, var58), method2696(var62, var59), method2696(var62, var60), method2696(var62, var61), method5514(var76, var58), method5514(var76, var59), method5514(var76, var60), method5514(var76, var61), var70, var79);
                                }
                            }
                        }
                    }
                }
            }
            for (int var83 = 1; var83 < 103; var83++) {
                for (int var84 = 1; var84 < 103; var84++) {
                    arg0.method3829(var6, var84, var83, method4953(var6, var84, var83));
                }
            }
            Statics.field998[var6] = (byte[][]) null;
            Statics.field999[var6] = (byte[][]) null;
            Statics.field995[var6] = (byte[][]) null;
            Statics.field997[var6] = (byte[][]) null;
            Statics.field1416[var6] = (byte[][]) null;
        }
        arg0.method3855(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field996[1][var85][var86] & 0x2) == 2) {
                    arg0.method3898(var85, var86);
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
                        if ((Statics.field3[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field3[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field3[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label355: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field3[var96 - 1][var93][var98] & var87) == 0) {
                                        break label355;
                                    }
                                }
                                var96--;
                            }
                            label344: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field3[var97 + 1][var93][var99] & var87) == 0) {
                                        break label344;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field1011[var97][var93][var94] - var101;
                                int var103 = field1011[var96][var93][var94];
                                class204.method3828(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field3[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field3[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field3[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label408: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field3[var108 - 1][var110][var92] & var88) == 0) {
                                        break label408;
                                    }
                                }
                                var108--;
                            }
                            label397: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field3[var109 + 1][var111][var92] & var88) == 0) {
                                        break label397;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field1011[var109][var106][var92] - var113;
                                int var115 = field1011[var108][var106][var92];
                                class204.method3828(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field3[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field3[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field3[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label461: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field3[var91][var118 - 1][var122] & var89) == 0) {
                                        break label461;
                                    }
                                }
                                var118--;
                            }
                            label450: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field3[var91][var119 + 1][var123] & var89) == 0) {
                                        break label450;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field1011[var91][var118][var120];
                                class204.method3828(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field3[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ji.z(IIII)I")
    public static int method4953(int arg0, int arg1, int arg2) {
        if ((field996[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field996[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("u.r(III)I")
    public static final int method151(int arg0, int arg1) {
        int var2 = method2884(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2884(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2884(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("et.u(IIIB)I")
    public static final int method2884(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method713(var3, var5);
        int var8 = method713(var3 + 1, var5);
        int var9 = method713(var3, var5 + 1);
        int var10 = method713(var3 + 1, var5 + 1);
        int var11 = method3502(var7, var8, var4, arg2);
        int var12 = method3502(var9, var10, var4, arg2);
        int var13 = 65536 - class201.field2352[var6 * 1024 / arg2] >> 1;
        return ((65536 - var13) * var11 >> 16) + (var12 * var13 >> 16);
    }

    @ObfuscatedName("gc.k(IIIII)I")
    public static final int method3502(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class201.field2352[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ag.h(III)I")
    public static final int method713(int arg0, int arg1) {
        int var2 = method4244(arg0 - 1, arg1 - 1) + method4244(arg0 + 1, arg1 - 1) + method4244(arg0 - 1, arg1 + 1) + method4244(arg0 + 1, arg1 + 1);
        int var3 = method4244(arg0 - 1, arg1) + method4244(arg0 + 1, arg1) + method4244(arg0, arg1 - 1) + method4244(arg0, arg1 + 1);
        int var4 = method4244(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("hp.x(IIB)I")
    public static final int method4244(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("de.l(IIS)I")
    public static final int method2696(int arg0, int arg1) {
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

    @ObfuscatedName("lz.a(IIB)I")
    public static final int method5514(int arg0, int arg1) {
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

    @ObfuscatedName("b.p(IIII)I")
    public static final int method260(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("kw.b(III)Z")
    public static final boolean method5217(int arg0, int arg1) {
        class187 var2 = class187.method3000(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3333(arg1);
    }

    @ObfuscatedName("eh.n(IIIIIIILgg;Lgv;I)V")
    public static final void method2823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class204 arg7, class191 arg8) {
        class187 var9 = class187.method3000(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2057;
            var11 = var9.field2046;
        } else {
            var10 = var9.field2046;
            var11 = var9.field2057;
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
        int[][] var16 = field1011[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class212.method2959(arg2, arg3, 2, var9.field2060 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field2059 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class205 var23;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var23 = var9.method3336(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class73(arg4, 22, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3970(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field2058 == 1) {
                arg8.method3576(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class205 var49;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var49 = var9.method3336(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class73(arg4, 10, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            if (var49 != null) {
                arg7.method3857(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field2058 != 0) {
                arg8.method3554(arg2, arg3, var10, var11, var9.field2044);
            }
        } else if (arg6 >= 12) {
            class205 var24;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var24 = var9.method3336(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3857(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field2058 != 0) {
                arg8.method3554(arg2, arg3, var10, var11, var9.field2044);
            }
        } else if (arg6 == 0) {
            class205 var25;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var25 = var9.method3336(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class73(arg4, 0, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3965(arg0, arg2, arg3, var17, var25, (class205) null, field1008[arg5], 0, var20, var22);
            if (var9.field2058 != 0) {
                arg8.method3553(arg2, arg3, arg6, arg5, var9.field2044);
            }
        } else if (arg6 == 1) {
            class205 var26;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var26 = var9.method3336(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class73(arg4, 1, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3965(arg0, arg2, arg3, var17, var26, (class205) null, field1012[arg5], 0, var20, var22);
            if (var9.field2058 != 0) {
                arg8.method3553(arg2, arg3, arg6, arg5, var9.field2044);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class205 var28;
            class205 var29;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var28 = var9.method3336(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method3336(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class73(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
                var29 = new class73(arg4, 2, var27, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3965(arg0, arg2, arg3, var17, var28, var29, field1008[arg5], field1008[var27], var20, var22);
            if (var9.field2058 != 0) {
                arg8.method3553(arg2, arg3, arg6, arg5, var9.field2044);
            }
        } else if (arg6 == 3) {
            class205 var30;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var30 = var9.method3336(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class73(arg4, 3, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3965(arg0, arg2, arg3, var17, var30, (class205) null, field1012[arg5], 0, var20, var22);
            if (var9.field2058 != 0) {
                arg8.method3553(arg2, arg3, arg6, arg5, var9.field2044);
            }
        } else if (arg6 == 9) {
            class205 var31;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var31 = var9.method3336(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3857(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field2058 != 0) {
                arg8.method3554(arg2, arg3, var10, var11, var9.field2044);
            }
        } else if (arg6 == 4) {
            class205 var32;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var32 = var9.method3336(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3969(arg0, arg2, arg3, var17, var32, (class205) null, field1008[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method3854(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class187.method3000(class212.method937(var34)).field2070;
            }
            class205 var36;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var36 = var9.method3336(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3969(arg0, arg2, arg3, var17, var36, (class205) null, field1008[arg5], 0, field1004[arg5] * var33, field1006[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method3854(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class187.method3000(class212.method937(var38)).field2070 / 2;
            }
            class205 var40;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var40 = var9.method3336(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3969(arg0, arg2, arg3, var17, var40, (class205) null, 256, arg5, field1007[arg5] * var37, field1003[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class205 var42;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var42 = var9.method3336(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class73(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3969(arg0, arg2, arg3, var17, var42, (class205) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method3854(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class187.method3000(class212.method937(var44)).field2070 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class205 var47;
            class205 var48;
            if (var9.field2064 == -1 && var9.field2082 == null) {
                var47 = var9.method3336(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method3336(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
                var48 = new class73(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field2064, var9.field2092, (class205) null);
            }
            arg7.method3969(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field1007[arg5] * var43, field1003[arg5] * var43, var20, var22);
        }
    }
}
