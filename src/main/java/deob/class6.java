package deob;

@ObfuscatedName("r")
public final class class6 {

    @ObfuscatedName("r.e")
    public static int[][][] field93 = new int[4][105][105];

    @ObfuscatedName("r.o")
    public static byte[][][] field78 = new byte[4][104][104];

    @ObfuscatedName("r.y")
    public static int field84 = 99;

    @ObfuscatedName("r.p")
    public static final int[] field85 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("r.j")
    public static final int[] field80 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("r.z")
    public static final int[] field91 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("r.t")
    public static final int[] field86 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("r.c")
    public static final int[] field87 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("r.q")
    public static final int[] field88 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("r.g")
    public static int field89 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("r.m")
    public static int field79 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.y([BIII)Z")
    public static final boolean method818(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class107 var4 = new class107(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2078();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2078();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2123() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class36 var16 = class36.method809(var5);
                        if (var13 != 22 || !client.field471 || var16.field884 != 0 || var16.field862 == 1 || var16.field883) {
                            if (!var16.method632()) {
                                client.field321++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2078();
                if (var9 == 0) {
                    break;
                }
                var4.method2123();
            }
        }
    }

    @ObfuscatedName("dh.b(IIIIIILch;Lgc;I)V")
    public static final void method2497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class197 arg7) {
        if (client.field471 && (field78[0][arg1][arg2] & 0x2) == 0) {
            if ((field78[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2616(arg0, arg1, arg2) != client.field436) {
                return;
            }
        }
        if (arg0 < field84) {
            field84 = arg0;
        }
        class36 var8 = class36.method809(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field861;
            var10 = var8.field896;
        } else {
            var9 = var8.field896;
            var10 = var8.field861;
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
        int[][] var15 = field93[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field884 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field885 == 1) {
            var20 += 256;
        }
        if (var8.method661()) {
            class20 var21 = new class20();
            var21.field563 = arg0;
            var21.field553 = arg1 * 128;
            var21.field554 = arg2 * 128;
            int var22 = var8.field896;
            int var23 = var8.field861;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field861;
                var23 = var8.field896;
            }
            var21.field555 = (arg1 + var22) * 128;
            var21.field568 = (arg2 + var23) * 128;
            var21.field558 = var8.field860;
            var21.field556 = var8.field846 * 128;
            var21.field560 = var8.field891;
            var21.field561 = var8.field872;
            var21.field562 = var8.field863;
            if (var8.field886 != null) {
                var21.field565 = var8;
                var21.method480();
            }
            class20.field552.method3117(var21);
            if (var21.field562 != null) {
                var21.field557 = var21.field560 + (int) (Math.random() * (double) (var21.field561 - var21.field560));
            }
        }
        if (arg5 == 22) {
            if (!client.field471 || var8.field884 != 0 || var8.field862 == 1 || var8.field883) {
                class78 var24;
                if (var8.field868 == -1 && var8.field886 == null) {
                    var24 = var8.method633(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
                }
                arg6.method1616(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field862 == 1 && arg7 != null) {
                    arg7.method3400(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var47;
            if (var8.field868 == -1 && var8.field886 == null) {
                var47 = var8.method633(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            if (var47 != null && arg6.method1699(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field876) {
                int var48 = 15;
                if (var47 instanceof class98) {
                    var48 = ((class98) var47).method1929() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field1073[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field1073[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3379(arg1, arg2, var9, var10, var8.field857);
            }
        } else if (arg5 >= 12) {
            class78 var25;
            if (var8.field868 == -1 && var8.field886 == null) {
                var25 = var8.method633(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1699(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field52[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3379(arg1, arg2, var9, var10, var8.field857);
            }
        } else if (arg5 == 0) {
            class78 var26;
            if (var8.field868 == -1 && var8.field886 == null) {
                var26 = var8.method633(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1578(arg0, arg1, arg2, var16, var26, (class78) null, field85[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field876) {
                    Statics.field1073[arg0][arg1][arg2] = 50;
                    Statics.field1073[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field867) {
                    Statics.field52[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field876) {
                    Statics.field1073[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1073[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field867) {
                    Statics.field52[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field876) {
                    Statics.field1073[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1073[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field867) {
                    Statics.field52[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field876) {
                    Statics.field1073[arg0][arg1][arg2] = 50;
                    Statics.field1073[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field867) {
                    Statics.field52[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3378(arg1, arg2, arg5, arg4, var8.field857);
            }
            if (var8.field869 != 16) {
                arg6.method1586(arg0, arg1, arg2, var8.field869);
            }
        } else if (arg5 == 1) {
            class78 var27;
            if (var8.field868 == -1 && var8.field886 == null) {
                var27 = var8.method633(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1578(arg0, arg1, arg2, var16, var27, (class78) null, field80[arg4], 0, var19, var20);
            if (var8.field876) {
                if (arg4 == 0) {
                    Statics.field1073[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1073[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1073[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1073[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3378(arg1, arg2, arg5, arg4, var8.field857);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class78 var29;
            class78 var30;
            if (var8.field868 == -1 && var8.field886 == null) {
                var29 = var8.method633(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method633(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field868, true, (class78) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1578(arg0, arg1, arg2, var16, var29, var30, field85[arg4], field85[var28], var19, var20);
            if (var8.field867) {
                if (arg4 == 0) {
                    Statics.field52[arg0][arg1][arg2] |= 0x249;
                    Statics.field52[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field52[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field52[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field52[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field52[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field52[arg0][arg1][arg2] |= 0x492;
                    Statics.field52[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3378(arg1, arg2, arg5, arg4, var8.field857);
            }
            if (var8.field869 != 16) {
                arg6.method1586(arg0, arg1, arg2, var8.field869);
            }
        } else if (arg5 == 3) {
            class78 var31;
            if (var8.field868 == -1 && var8.field886 == null) {
                var31 = var8.method633(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1578(arg0, arg1, arg2, var16, var31, (class78) null, field80[arg4], 0, var19, var20);
            if (var8.field876) {
                if (arg4 == 0) {
                    Statics.field1073[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1073[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1073[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1073[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3378(arg1, arg2, arg5, arg4, var8.field857);
            }
        } else if (arg5 == 9) {
            class78 var32;
            if (var8.field868 == -1 && var8.field886 == null) {
                var32 = var8.method633(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1699(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3379(arg1, arg2, var9, var10, var8.field857);
            }
            if (var8.field869 != 16) {
                arg6.method1586(arg0, arg1, arg2, var8.field869);
            }
        } else if (arg5 == 4) {
            class78 var33;
            if (var8.field868 == -1 && var8.field886 == null) {
                var33 = var8.method633(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1579(arg0, arg1, arg2, var16, var33, (class78) null, field85[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1596(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method809(var35 >> 14 & 0x7FFF).field869;
            }
            class78 var36;
            if (var8.field868 == -1 && var8.field886 == null) {
                var36 = var8.method633(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1579(arg0, arg1, arg2, var16, var36, (class78) null, field85[arg4], 0, field91[arg4] * var34, field86[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1596(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class36.method809(var38 >> 14 & 0x7FFF).field869 / 2;
            }
            class78 var39;
            if (var8.field868 == -1 && var8.field886 == null) {
                var39 = var8.method633(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1579(arg0, arg1, arg2, var16, var39, (class78) null, 256, arg4, field87[arg4] * var37, field88[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class78 var41;
            if (var8.field868 == -1 && var8.field886 == null) {
                var41 = var8.method633(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1579(arg0, arg1, arg2, var16, var41, (class78) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1596(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class36.method809(var43 >> 14 & 0x7FFF).field869 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class78 var45;
            class78 var46;
            if (var8.field868 == -1 && var8.field886 == null) {
                var45 = var8.method633(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method633(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field868, true, (class78) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field868, true, (class78) null);
            }
            arg6.method1579(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field87[arg4] * var42, field88[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("ea.w(Lch;[Lgc;I)V")
    public static final void method2600(class79 arg0, class197[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field78[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field78[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3380(var3, var4);
                        }
                    }
                }
            }
        }
        field89 += (int) (Math.random() * 5.0D) - 2;
        if (field89 < -8) {
            field89 = -8;
        }
        if (field89 > 8) {
            field89 = 8;
        }
        field79 += (int) (Math.random() * 5.0D) - 2;
        if (field79 < -16) {
            field79 = -16;
        }
        if (field79 > 16) {
            field79 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1073[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field93[var6][var11 + 1][var10] - field93[var6][var11 - 1][var10];
                    int var13 = field93[var6][var11][var10 + 1] - field93[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field90[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1893[var20] = 0;
                Statics.field1019[var20] = 0;
                Statics.field2389[var20] = 0;
                Statics.field57[var20] = 0;
                Statics.field217[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field82[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class37 var26 = (class37) class37.field905.method3058((long) var25);
                            class37 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field897.method2709(1, var25);
                                class37 var29 = new class37();
                                if (var28 != null) {
                                    var29.method677(new class107(var28), var25);
                                }
                                var29.method676();
                                class37.field905.method3057(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field1893[var22] += var27.field900;
                            Statics.field1019[var22] += var27.field901;
                            Statics.field2389[var22] += var27.field902;
                            Statics.field57[var22] += var27.field899;
                            var10002 = Statics.field217[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field82[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class37 var34 = (class37) class37.field905.method3058((long) var33);
                            class37 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field897.method2709(1, var33);
                                class37 var37 = new class37();
                                if (var36 != null) {
                                    var37.method677(new class107(var36), var33);
                                }
                                var37.method676();
                                class37.field905.method3057(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field1893[var22] -= var35.field900;
                            Statics.field1019[var22] -= var35.field901;
                            Statics.field2389[var22] -= var35.field902;
                            Statics.field57[var22] -= var35.field899;
                            var10002 = Statics.field217[var22]--;
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
                            var39 += Statics.field1893[var45];
                            var40 += Statics.field1019[var45];
                            var41 += Statics.field2389[var45];
                            var42 += Statics.field57[var45];
                            var43 += Statics.field217[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field1893[var46];
                            var40 -= Statics.field1019[var46];
                            var41 -= Statics.field2389[var46];
                            var42 -= Statics.field57[var46];
                            var43 -= Statics.field217[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field471 || (field78[0][var21][var44] & 0x2) != 0 || (field78[var6][var21][var44] & 0x10) == 0 && method2616(var6, var21, var44) == client.field436)) {
                            if (var6 < field84) {
                                field84 = var6;
                            }
                            int var47 = Statics.field82[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field81[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field93[var6][var21][var44];
                                int var50 = field93[var6][var21 + 1][var44];
                                int var51 = field93[var6][var21 + 1][var44 + 1];
                                int var52 = field93[var6][var21][var44 + 1];
                                int var53 = Statics.field90[var21][var44];
                                int var54 = Statics.field90[var21 + 1][var44];
                                int var55 = Statics.field90[var21 + 1][var44 + 1];
                                int var56 = Statics.field90[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method34(var59, var60, var61);
                                    int var62 = field89 + var59 & 0xFF;
                                    int var63 = field79 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method34(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field73[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class41 var66 = (class41) class41.field972.method3058((long) var65);
                                        class41 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field973.method2709(4, var65);
                                            class41 var69 = new class41();
                                            if (var68 != null) {
                                                var69.method782(new class107(var68), var65);
                                            }
                                            var69.method795();
                                            class41.field972.method3057(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field975) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field52[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class84.field1481[method2012(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1708(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method2012(var57, var53), method2012(var57, var54), method2012(var57, var55), method2012(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field73[var6][var21][var44] + 1;
                                    byte var72 = Statics.field2481[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class41 var74 = (class41) class41.field972.method3058((long) var73);
                                    class41 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field973.method2709(4, var73);
                                        class41 var77 = new class41();
                                        if (var76 != null) {
                                            var77.method782(new class107(var76), var73);
                                        }
                                        var77.method795();
                                        class41.field972.method3057(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field974;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1482.method1795(var79);
                                        var81 = -1;
                                    } else if (var75.field986 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method34(var75.field977, var75.field978, var75.field979);
                                        int var82 = field89 + var75.field977 & 0xFF;
                                        int var83 = field79 + var75.field979;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method34(var82, var75.field978, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class84.field1481[method148(var80, 96)];
                                    }
                                    if (var75.field976 != -1) {
                                        int var85 = field89 + var75.field980 & 0xFF;
                                        int var86 = field79 + var75.field981;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method34(var85, var75.field982, var86);
                                        var84 = class84.field1481[method148(var87, 96)];
                                    }
                                    arg0.method1708(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method2012(var57, var53), method2012(var57, var54), method2012(var57, var55), method2012(var57, var56), method148(var81, var53), method148(var81, var54), method148(var81, var55), method148(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1573(var6, var89, var88, method2616(var6, var89, var88));
                }
            }
            Statics.field82[var6] = (byte[][]) null;
            Statics.field81[var6] = (byte[][]) null;
            Statics.field73[var6] = (byte[][]) null;
            Statics.field2481[var6] = (byte[][]) null;
            Statics.field1073[var6] = (byte[][]) null;
        }
        arg0.method1601(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field78[1][var90][var91] & 0x2) == 2) {
                    arg0.method1572(var90, var91);
                }
            }
        }
        int var92 = 1;
        int var93 = 2;
        int var94 = 4;
        for (int var95 = 0; var95 < 4; var95++) {
            if (var95 > 0) {
                var92 <<= 0x3;
                var93 <<= 0x3;
                var94 <<= 0x3;
            }
            for (int var96 = 0; var96 <= var95; var96++) {
                for (int var97 = 0; var97 <= 104; var97++) {
                    for (int var98 = 0; var98 <= 104; var98++) {
                        if ((Statics.field52[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field52[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field52[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label375: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field52[var101 - 1][var98][var103] & var92) == 0) {
                                        break label375;
                                    }
                                }
                                var101--;
                            }
                            label364: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field52[var102 + 1][var98][var104] & var92) == 0) {
                                        break label364;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field93[var102][var98][var99] - var106;
                                int var108 = field93[var101][var98][var99];
                                class79.method1723(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field52[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field52[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field52[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field52[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label428: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field52[var113 - 1][var115][var97] & var93) == 0) {
                                        break label428;
                                    }
                                }
                                var113--;
                            }
                            label417: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field52[var114 + 1][var116][var97] & var93) == 0) {
                                        break label417;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field93[var114][var111][var97] - var118;
                                int var120 = field93[var113][var111][var97];
                                class79.method1723(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field52[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field52[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field52[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field52[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label481: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field52[var96][var123 - 1][var127] & var94) == 0) {
                                        break label481;
                                    }
                                }
                                var123--;
                            }
                            label470: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field52[var96][var124 + 1][var128] & var94) == 0) {
                                        break label470;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field93[var96][var123][var125];
                                class79.method1723(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field52[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.r(IIII)I")
    public static int method2616(int arg0, int arg1, int arg2) {
        if ((field78[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field78[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ca.s(IIII)I")
    public static final int method1822(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1369(var3, var5);
        int var8 = method1369(var3 + 1, var5);
        int var9 = method1369(var3, var5 + 1);
        int var10 = method1369(var3 + 1, var5 + 1);
        int var11 = 65536 - class84.field1486[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class84.field1486[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class84.field1486[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("bj.f(III)I")
    public static final int method1369(int arg0, int arg1) {
        int var2 = method5(arg0 - 1, arg1 - 1) + method5(arg0 + 1, arg1 - 1) + method5(arg0 - 1, arg1 + 1) + method5(arg0 + 1, arg1 + 1);
        int var3 = method5(arg0 - 1, arg1) + method5(arg0 + 1, arg1) + method5(arg0, arg1 - 1) + method5(arg0, arg1 + 1);
        int var4 = method5(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("e.x(III)I")
    public static final int method5(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("co.h(IIB)I")
    public static final int method2012(int arg0, int arg1) {
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

    @ObfuscatedName("i.a(III)I")
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

    @ObfuscatedName("w.u(IIII)I")
    public static final int method34(int arg0, int arg1, int arg2) {
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
