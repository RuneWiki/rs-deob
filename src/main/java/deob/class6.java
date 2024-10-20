package deob;

@ObfuscatedName("j")
public final class class6 {

    @ObfuscatedName("j.k")
    public static int[][][] field78 = new int[4][105][105];

    @ObfuscatedName("j.r")
    public static byte[][][] field80 = new byte[4][104][104];

    @ObfuscatedName("j.y")
    public static int field88 = 99;

    @ObfuscatedName("j.i")
    public static final int[] field82 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.h")
    public static final int[] field83 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.e")
    public static final int[] field84 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.a")
    public static final int[] field79 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.c")
    public static final int[] field86 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.f")
    public static final int[] field87 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.q")
    public static int field75 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.z")
    public static int field89 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.k(I)V")
    public static void method484() {
        Statics.field93 = (byte[][][]) null;
        Statics.field76 = (byte[][][]) null;
        Statics.field64 = (byte[][][]) null;
        Statics.field1834 = (byte[][][]) null;
        Statics.field567 = (int[][][]) null;
        Statics.field1270 = (byte[][][]) null;
        Statics.field2928 = (int[][]) null;
        Statics.field896 = null;
        Statics.field85 = null;
        Statics.field2903 = null;
        Statics.field61 = null;
        Statics.field1535 = null;
    }

    @ObfuscatedName("e.r(IIIIB)V")
    public static final void method471(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1270[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field78[0][var5][var4] = field78[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field78[0][var5][var4] = field78[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field78[0][var5][var4] = field78[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field78[0][var5][var4] = field78[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cc.y([BIIII[Lga;I)V")
    public static final void method1866(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class197[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2957[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class107 var9 = new class107(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1785(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("fw.w([BIIIIIII[Lga;B)V")
    public static final void method3129(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class197[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2957[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class107 var11 = new class107(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class155.method2361(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
                        int var22 = arg7 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var20;
                        } else if (var22 == 1) {
                            var23 = 7 - var19;
                        } else if (var22 == 2) {
                            var23 = 7 - var20;
                        } else {
                            var23 = var19;
                        }
                        method1785(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method1785(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.m(IIII)V")
    public static final void method10(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field78[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field78[arg0][arg1][arg2 + var5] = field78[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field78[arg0][arg1 + var6][arg2] = field78[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field78[arg0][arg1 - 1][arg2] != 0) {
            field78[arg0][arg1][arg2] = field78[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field78[arg0][arg1][arg2 - 1] != 0) {
            field78[arg0][arg1][arg2] = field78[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field78[arg0][arg1 - 1][arg2 - 1] != 0) {
            field78[arg0][arg1][arg2] = field78[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cr.j(Lde;IIIIIIB)V")
    public static final void method1785(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2111();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2111();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2111();
                }
            }
            return;
        }
        field80[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2111();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field78[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method146(var10 + 45365, var11 + 91923, 4) - 128 + (method146(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method146(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field78[arg1][arg2][arg3] = field78[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2111();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field78[0][arg2][arg3] = -var15 * 8;
                } else {
                    field78[arg1][arg2][arg3] = field78[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field76[arg1][arg2][arg3] = arg0.method2112();
                Statics.field64[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1834[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field80[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field93[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bt.g([BIIIIIIILcn;[Lga;I)V")
    public static final void method1599(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8, class197[] arg9) {
        class107 var10 = new class107(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2124();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2124();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2111();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class36 var21 = class36.method147(var11);
                    int var22 = arg2 + class155.method927(var16 & 0x7, var15 & 0x7, arg7, var21.field854, var21.field846, var20);
                    int var23 = arg3 + class155.method1605(var16 & 0x7, var15 & 0x7, arg7, var21.field854, var21.field846, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field80[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class197 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        Statics.method103(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bj.o(Lcn;[Lga;I)V")
    public static final void method1432(class79 arg0, class197[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field80[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field80[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3467(var3, var4);
                        }
                    }
                }
            }
        }
        field75 += (int) (Math.random() * 5.0D) - 2;
        if (field75 < -8) {
            field75 = -8;
        }
        if (field75 > 8) {
            field75 = 8;
        }
        field89 += (int) (Math.random() * 5.0D) - 2;
        if (field89 < -16) {
            field89 = -16;
        }
        if (field89 > 16) {
            field89 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1270[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field78[var6][var11 + 1][var10] - field78[var6][var11 - 1][var10];
                    int var13 = field78[var6][var11][var10 + 1] - field78[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2928[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field896[var20] = 0;
                Statics.field85[var20] = 0;
                Statics.field2903[var20] = 0;
                Statics.field61[var20] = 0;
                Statics.field1535[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field93[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class37 var25 = class37.method584(var24 - 1);
                            Statics.field896[var22] += var25.field894;
                            Statics.field85[var22] += var25.field898;
                            Statics.field2903[var22] += var25.field893;
                            Statics.field61[var22] += var25.field897;
                            var10002 = Statics.field1535[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field93[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            int var28 = var27 - 1;
                            class37 var29 = (class37) class37.field891.method3141((long) var28);
                            class37 var30;
                            if (var29 == null) {
                                byte[] var31 = Statics.field895.method2749(1, var28);
                                class37 var32 = new class37();
                                if (var31 != null) {
                                    var32.method680(new class107(var31), var28);
                                }
                                var32.method674();
                                class37.field891.method3137(var32, (long) var28);
                                var30 = var32;
                            } else {
                                var30 = var29;
                            }
                            Statics.field896[var22] -= var30.field894;
                            Statics.field85[var22] -= var30.field898;
                            Statics.field2903[var22] -= var30.field893;
                            Statics.field61[var22] -= var30.field897;
                            var10002 = Statics.field1535[var22]--;
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
                            var34 += Statics.field896[var40];
                            var35 += Statics.field85[var40];
                            var36 += Statics.field2903[var40];
                            var37 += Statics.field61[var40];
                            var38 += Statics.field1535[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field896[var41];
                            var35 -= Statics.field85[var41];
                            var36 -= Statics.field2903[var41];
                            var37 -= Statics.field61[var41];
                            var38 -= Statics.field1535[var41];
                        }
                        if (var39 >= 1 && var39 < 103) {
                            if (client.field394 && (field80[0][var21][var39] & 0x2) == 0) {
                                if ((field80[var6][var21][var39] & 0x10) != 0) {
                                    continue;
                                }
                                int var42;
                                if ((field80[var6][var21][var39] & 0x8) != 0) {
                                    var42 = 0;
                                } else if (var6 <= 0 || (field80[1][var21][var39] & 0x2) == 0) {
                                    var42 = var6;
                                } else {
                                    var42 = var6 - 1;
                                }
                                if (client.field367 != var42) {
                                    continue;
                                }
                            }
                            if (var6 < field88) {
                                field88 = var6;
                            }
                            int var43 = Statics.field93[var6][var21][var39] & 0xFF;
                            int var44 = Statics.field76[var6][var21][var39] & 0xFF;
                            if (var43 > 0 || var44 > 0) {
                                int var45 = field78[var6][var21][var39];
                                int var46 = field78[var6][var21 + 1][var39];
                                int var47 = field78[var6][var21 + 1][var39 + 1];
                                int var48 = field78[var6][var21][var39 + 1];
                                int var49 = Statics.field2928[var21][var39];
                                int var50 = Statics.field2928[var21 + 1][var39];
                                int var51 = Statics.field2928[var21 + 1][var39 + 1];
                                int var52 = Statics.field2928[var21][var39 + 1];
                                int var53 = -1;
                                int var54 = -1;
                                if (var43 > 0) {
                                    int var55 = var34 * 256 / var37;
                                    int var56 = var35 / var38;
                                    int var57 = var36 / var38;
                                    var53 = Statics.method469(var55, var56, var57);
                                    int var58 = field75 + var55 & 0xFF;
                                    int var59 = field89 + var57;
                                    if (var59 < 0) {
                                        var59 = 0;
                                    } else if (var59 > 255) {
                                        var59 = 255;
                                    }
                                    var54 = Statics.method469(var58, var56, var59);
                                }
                                if (var6 > 0) {
                                    boolean var60 = true;
                                    if (var43 == 0 && Statics.field64[var6][var21][var39] != 0) {
                                        var60 = false;
                                    }
                                    if (var44 > 0) {
                                        int var61 = var44 - 1;
                                        class41 var62 = (class41) class41.field959.method3141((long) var61);
                                        class41 var63;
                                        if (var62 == null) {
                                            byte[] var64 = Statics.field958.method2749(4, var61);
                                            class41 var65 = new class41();
                                            if (var64 != null) {
                                                var65.method794(new class107(var64), var61);
                                            }
                                            var65.method792();
                                            class41.field959.method3137(var65, (long) var61);
                                            var63 = var65;
                                        } else {
                                            var63 = var62;
                                        }
                                        if (!var63.field971) {
                                            var60 = false;
                                        }
                                    }
                                    if (var60 && var45 == var46 && var45 == var47 && var45 == var48) {
                                        Statics.field567[var6][var21][var39] |= 0x924;
                                    }
                                }
                                int var66 = 0;
                                if (var54 != -1) {
                                    var66 = class84.field1483[method126(var54, 96)];
                                }
                                if (var44 == 0) {
                                    arg0.method1783(var6, var21, var39, 0, 0, -1, var45, var46, var47, var48, method126(var53, var49), method126(var53, var50), method126(var53, var51), method126(var53, var52), 0, 0, 0, 0, var66, 0);
                                } else {
                                    int var67 = Statics.field64[var6][var21][var39] + 1;
                                    byte var68 = Statics.field1834[var6][var21][var39];
                                    int var69 = var44 - 1;
                                    class41 var70 = (class41) class41.field959.method3141((long) var69);
                                    class41 var71;
                                    if (var70 == null) {
                                        byte[] var72 = Statics.field958.method2749(4, var69);
                                        class41 var73 = new class41();
                                        if (var72 != null) {
                                            var73.method794(new class107(var72), var69);
                                        }
                                        var73.method792();
                                        class41.field959.method3137(var73, (long) var69);
                                        var71 = var73;
                                    } else {
                                        var71 = var70;
                                    }
                                    int var75 = var71.field961;
                                    int var76;
                                    int var77;
                                    if (var75 >= 0) {
                                        var76 = Statics.field1487.method1843(var75);
                                        var77 = -1;
                                    } else if (var71.field960 == 16711935) {
                                        var77 = -2;
                                        var75 = -1;
                                        var76 = -2;
                                    } else {
                                        var77 = Statics.method469(var71.field964, var71.field965, var71.field975);
                                        int var78 = field75 + var71.field964 & 0xFF;
                                        int var79 = field89 + var71.field975;
                                        if (var79 < 0) {
                                            var79 = 0;
                                        } else if (var79 > 255) {
                                            var79 = 255;
                                        }
                                        var76 = Statics.method469(var78, var71.field965, var79);
                                    }
                                    int var80 = 0;
                                    if (var76 != -2) {
                                        var80 = class84.field1483[method563(var76, 96)];
                                    }
                                    if (var71.field976 != -1) {
                                        int var81 = field75 + var71.field962 & 0xFF;
                                        int var82 = field89 + var71.field969;
                                        if (var82 < 0) {
                                            var82 = 0;
                                        } else if (var82 > 255) {
                                            var82 = 255;
                                        }
                                        int var83 = Statics.method469(var81, var71.field968, var82);
                                        var80 = class84.field1483[method563(var83, 96)];
                                    }
                                    arg0.method1783(var6, var21, var39, var67, var68, var75, var45, var46, var47, var48, method126(var53, var49), method126(var53, var50), method126(var53, var51), method126(var53, var52), method563(var77, var49), method563(var77, var50), method563(var77, var51), method563(var77, var52), var66, var80);
                                }
                            }
                        }
                    }
                }
            }
            for (int var84 = 1; var84 < 103; var84++) {
                for (int var85 = 1; var85 < 103; var85++) {
                    arg0.method1621(var6, var85, var84, method2453(var6, var85, var84));
                }
            }
            Statics.field93[var6] = (byte[][]) null;
            Statics.field76[var6] = (byte[][]) null;
            Statics.field64[var6] = (byte[][]) null;
            Statics.field1834[var6] = (byte[][]) null;
            Statics.field1270[var6] = (byte[][]) null;
        }
        arg0.method1760(-50, -10, -50);
        for (int var86 = 0; var86 < 104; var86++) {
            for (int var87 = 0; var87 < 104; var87++) {
                if ((field80[1][var86][var87] & 0x2) == 2) {
                    arg0.method1609(var86, var87);
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
                        if ((Statics.field567[var92][var94][var93] & var88) != 0) {
                            int var95 = var93;
                            int var96 = var93;
                            int var97 = var92;
                            int var98 = var92;
                            while (var95 > 0 && (Statics.field567[var92][var94][var95 - 1] & var88) != 0) {
                                var95--;
                            }
                            while (var96 < 104 && (Statics.field567[var92][var94][var96 + 1] & var88) != 0) {
                                var96++;
                            }
                            label372: while (var97 > 0) {
                                for (int var99 = var95; var99 <= var96; var99++) {
                                    if ((Statics.field567[var97 - 1][var94][var99] & var88) == 0) {
                                        break label372;
                                    }
                                }
                                var97--;
                            }
                            label361: while (var98 < var91) {
                                for (int var100 = var95; var100 <= var96; var100++) {
                                    if ((Statics.field567[var98 + 1][var94][var100] & var88) == 0) {
                                        break label361;
                                    }
                                }
                                var98++;
                            }
                            int var101 = (var98 + 1 - var97) * (var96 - var95 + 1);
                            if (var101 >= 8) {
                                short var102 = 240;
                                int var103 = field78[var98][var94][var95] - var102;
                                int var104 = field78[var97][var94][var95];
                                class79.method1610(var91, 1, var94 * 128, var94 * 128, var95 * 128, var96 * 128 + 128, var103, var104);
                                for (int var105 = var97; var105 <= var98; var105++) {
                                    for (int var106 = var95; var106 <= var96; var106++) {
                                        Statics.field567[var105][var94][var106] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field567[var92][var94][var93] & var89) != 0) {
                            int var107 = var94;
                            int var108 = var94;
                            int var109 = var92;
                            int var110 = var92;
                            while (var107 > 0 && (Statics.field567[var92][var107 - 1][var93] & var89) != 0) {
                                var107--;
                            }
                            while (var108 < 104 && (Statics.field567[var92][var108 + 1][var93] & var89) != 0) {
                                var108++;
                            }
                            label425: while (var109 > 0) {
                                for (int var111 = var107; var111 <= var108; var111++) {
                                    if ((Statics.field567[var109 - 1][var111][var93] & var89) == 0) {
                                        break label425;
                                    }
                                }
                                var109--;
                            }
                            label414: while (var110 < var91) {
                                for (int var112 = var107; var112 <= var108; var112++) {
                                    if ((Statics.field567[var110 + 1][var112][var93] & var89) == 0) {
                                        break label414;
                                    }
                                }
                                var110++;
                            }
                            int var113 = (var110 + 1 - var109) * (var108 - var107 + 1);
                            if (var113 >= 8) {
                                short var114 = 240;
                                int var115 = field78[var110][var107][var93] - var114;
                                int var116 = field78[var109][var107][var93];
                                class79.method1610(var91, 2, var107 * 128, var108 * 128 + 128, var93 * 128, var93 * 128, var115, var116);
                                for (int var117 = var109; var117 <= var110; var117++) {
                                    for (int var118 = var107; var118 <= var108; var118++) {
                                        Statics.field567[var117][var118][var93] &= ~var89;
                                    }
                                }
                            }
                        }
                        if ((Statics.field567[var92][var94][var93] & var90) != 0) {
                            int var119 = var94;
                            int var120 = var94;
                            int var121 = var93;
                            int var122 = var93;
                            while (var121 > 0 && (Statics.field567[var92][var94][var121 - 1] & var90) != 0) {
                                var121--;
                            }
                            while (var122 < 104 && (Statics.field567[var92][var94][var122 + 1] & var90) != 0) {
                                var122++;
                            }
                            label478: while (var119 > 0) {
                                for (int var123 = var121; var123 <= var122; var123++) {
                                    if ((Statics.field567[var92][var119 - 1][var123] & var90) == 0) {
                                        break label478;
                                    }
                                }
                                var119--;
                            }
                            label467: while (var120 < 104) {
                                for (int var124 = var121; var124 <= var122; var124++) {
                                    if ((Statics.field567[var92][var120 + 1][var124] & var90) == 0) {
                                        break label467;
                                    }
                                }
                                var120++;
                            }
                            if ((var120 - var119 + 1) * (var122 - var121 + 1) >= 4) {
                                int var125 = field78[var92][var119][var121];
                                class79.method1610(var91, 4, var119 * 128, var120 * 128 + 128, var121 * 128, var122 * 128 + 128, var125, var125);
                                for (int var126 = var119; var126 <= var120; var126++) {
                                    for (int var127 = var121; var127 <= var122; var127++) {
                                        Statics.field567[var92][var126][var127] &= ~var90;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dt.b(IIIB)I")
    public static int method2453(int arg0, int arg1, int arg2) {
        if ((field80[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field80[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("t.x(IIII)I")
    public static final int method146(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1426(var3, var5);
        int var8 = method1426(var3 + 1, var5);
        int var9 = method1426(var3, var5 + 1);
        int var10 = method1426(var3 + 1, var5 + 1);
        int var11 = 65536 - class84.field1491[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class84.field1491[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class84.field1491[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("bi.n(III)I")
    public static final int method1426(int arg0, int arg1) {
        int var2 = method9(arg0 - 1, arg1 - 1) + method9(arg0 + 1, arg1 - 1) + method9(arg0 - 1, arg1 + 1) + method9(arg0 + 1, arg1 + 1);
        int var3 = method9(arg0 - 1, arg1) + method9(arg0 + 1, arg1) + method9(arg0, arg1 - 1) + method9(arg0, arg1 + 1);
        int var4 = method9(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("r.d(IIB)I")
    public static final int method9(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("n.s(III)I")
    public static final int method126(int arg0, int arg1) {
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

    @ObfuscatedName("al.v(III)I")
    public static final int method563(int arg0, int arg1) {
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
}
