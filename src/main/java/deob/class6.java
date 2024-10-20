package deob;

@ObfuscatedName("l")
public final class class6 {

    @ObfuscatedName("l.m")
    public static int[][][] field78 = new int[4][105][105];

    @ObfuscatedName("l.w")
    public static byte[][][] field79 = new byte[4][104][104];

    @ObfuscatedName("l.e")
    public static int field88 = 99;

    @ObfuscatedName("l.d")
    public static final int[] field83 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.t")
    public static final int[] field84 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.c")
    public static final int[] field91 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.z")
    public static final int[] field85 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.n")
    public static final int[] field87 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.q")
    public static final int[] field80 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.a")
    public static int field89 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.b")
    public static int field90 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.m(IIIII)V")
    public static final void method140(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1456[0][var5][var4] = 127;
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

    @ObfuscatedName("b.w([BIIII[Lds;I)V")
    public static final void method587(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class112[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1955[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class123 var9 = new class123(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3311(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("fm.e(Ldj;IIIIIII)V")
    public static final void method3311(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2398();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2398();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2398();
                }
            }
            return;
        }
        field79[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2398();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field78[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2309(var10 + 45365, var11 + 91923, 4) - 128 + (method2309(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2309(var10, var11, 1) - 128 >> 2);
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
                int var15 = arg0.method2398();
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
                Statics.field82[arg1][arg2][arg3] = arg0.method2415();
                Statics.field2354[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2142[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field79[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field81[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("eo.o(IIIIIILcu;Lds;B)V")
    public static final void method2766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field278 && (field79[0][arg1][arg2] & 0x2) == 0 && (field79[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field88) {
            field88 = arg0;
        }
        class43 var8 = class43.method96(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field981;
            var10 = var8.field977;
        } else {
            var9 = var8.field977;
            var10 = var8.field981;
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
        int[][] var15 = field78[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field975 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field983 == 1) {
            var20 += 256;
        }
        if (var8.method806()) {
            class25.method2133(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field278 || var8.field975 != 0 || var8.field960 == 1 || var8.field972) {
                class89 var21;
                if (var8.field943 == -1 && var8.field984 == null) {
                    var21 = var8.method801(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
                }
                arg6.method1875(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field960 == 1 && arg7 != null) {
                    arg7.method2317(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var44;
            if (var8.field943 == -1 && var8.field984 == null) {
                var44 = var8.method801(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            if (var44 != null && arg6.method1909(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field985) {
                int var45 = 15;
                if (var44 instanceof class109) {
                    var45 = ((class109) var44).method2227() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field1456[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field1456[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field960 != 0 && arg7 != null) {
                arg7.method2297(arg1, arg2, var9, var10, var8.field961);
            }
        } else if (arg5 >= 12) {
            class89 var22;
            if (var8.field943 == -1 && var8.field984 == null) {
                var22 = var8.method801(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method1909(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field763[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field960 != 0 && arg7 != null) {
                arg7.method2297(arg1, arg2, var9, var10, var8.field961);
            }
        } else if (arg5 == 0) {
            class89 var23;
            if (var8.field943 == -1 && var8.field984 == null) {
                var23 = var8.method801(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method2000(arg0, arg1, arg2, var16, var23, (class89) null, field83[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field985) {
                    Statics.field1456[arg0][arg1][arg2] = 50;
                    Statics.field1456[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field965) {
                    Statics.field763[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field985) {
                    Statics.field1456[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1456[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field965) {
                    Statics.field763[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field985) {
                    Statics.field1456[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1456[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field965) {
                    Statics.field763[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field985) {
                    Statics.field1456[arg0][arg1][arg2] = 50;
                    Statics.field1456[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field965) {
                    Statics.field763[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field960 != 0 && arg7 != null) {
                arg7.method2298(arg1, arg2, arg5, arg4, var8.field961);
            }
            if (var8.field967 != 16) {
                arg6.method1885(arg0, arg1, arg2, var8.field967);
            }
        } else if (arg5 == 1) {
            class89 var24;
            if (var8.field943 == -1 && var8.field984 == null) {
                var24 = var8.method801(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method2000(arg0, arg1, arg2, var16, var24, (class89) null, field84[arg4], 0, var19, var20);
            if (var8.field985) {
                if (arg4 == 0) {
                    Statics.field1456[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1456[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1456[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1456[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field960 != 0 && arg7 != null) {
                arg7.method2298(arg1, arg2, arg5, arg4, var8.field961);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class89 var26;
            class89 var27;
            if (var8.field943 == -1 && var8.field984 == null) {
                var26 = var8.method801(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method801(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field943, true, (class89) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method2000(arg0, arg1, arg2, var16, var26, var27, field83[arg4], field83[var25], var19, var20);
            if (var8.field965) {
                if (arg4 == 0) {
                    Statics.field763[arg0][arg1][arg2] |= 0x249;
                    Statics.field763[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field763[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field763[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field763[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field763[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field763[arg0][arg1][arg2] |= 0x492;
                    Statics.field763[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field960 != 0 && arg7 != null) {
                arg7.method2298(arg1, arg2, arg5, arg4, var8.field961);
            }
            if (var8.field967 != 16) {
                arg6.method1885(arg0, arg1, arg2, var8.field967);
            }
        } else if (arg5 == 3) {
            class89 var28;
            if (var8.field943 == -1 && var8.field984 == null) {
                var28 = var8.method801(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method2000(arg0, arg1, arg2, var16, var28, (class89) null, field84[arg4], 0, var19, var20);
            if (var8.field985) {
                if (arg4 == 0) {
                    Statics.field1456[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1456[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1456[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1456[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field960 != 0 && arg7 != null) {
                arg7.method2298(arg1, arg2, arg5, arg4, var8.field961);
            }
        } else if (arg5 == 9) {
            class89 var29;
            if (var8.field943 == -1 && var8.field984 == null) {
                var29 = var8.method801(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method1909(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field960 != 0 && arg7 != null) {
                arg7.method2297(arg1, arg2, var9, var10, var8.field961);
            }
            if (var8.field967 != 16) {
                arg6.method1885(arg0, arg1, arg2, var8.field967);
            }
        } else if (arg5 == 4) {
            class89 var30;
            if (var8.field943 == -1 && var8.field984 == null) {
                var30 = var8.method801(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method1878(arg0, arg1, arg2, var16, var30, (class89) null, field83[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1895(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class43.method96(var32 >> 14 & 0x7FFF).field967;
            }
            class89 var33;
            if (var8.field943 == -1 && var8.field984 == null) {
                var33 = var8.method801(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method1878(arg0, arg1, arg2, var16, var33, (class89) null, field83[arg4], 0, field91[arg4] * var31, field85[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1895(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method96(var35 >> 14 & 0x7FFF).field967 / 2;
            }
            class89 var36;
            if (var8.field943 == -1 && var8.field984 == null) {
                var36 = var8.method801(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method1878(arg0, arg1, arg2, var16, var36, (class89) null, 256, arg4, field87[arg4] * var34, field80[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class89 var38;
            if (var8.field943 == -1 && var8.field984 == null) {
                var38 = var8.method801(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method1878(arg0, arg1, arg2, var16, var38, (class89) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1895(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class43.method96(var40 >> 14 & 0x7FFF).field967 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class89 var42;
            class89 var43;
            if (var8.field943 == -1 && var8.field984 == null) {
                var42 = var8.method801(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method801(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field943, true, (class89) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field943, true, (class89) null);
            }
            arg6.method1878(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field87[arg4] * var39, field80[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("j.g(Lcu;[Lds;I)V")
    public static final void method91(class90 arg0, class112[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field79[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field79[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2300(var3, var4);
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
        field90 += (int) (Math.random() * 5.0D) - 2;
        if (field90 < -16) {
            field90 = -16;
        }
        if (field90 > 16) {
            field90 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1456[var6];
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
                    Statics.field2651[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field3054[var20] = 0;
                Statics.field261[var20] = 0;
                Statics.field2053[var20] = 0;
                Statics.field68[var20] = 0;
                Statics.field2965[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field81[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class44 var26 = (class44) class44.field996.method3556((long) var25);
                            class44 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field995.method3086(1, var25);
                                class44 var29 = new class44();
                                if (var28 != null) {
                                    var29.method849(new class123(var28), var25);
                                }
                                var29.method856();
                                class44.field996.method3562(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field3054[var22] += var27.field998;
                            Statics.field261[var22] += var27.field997;
                            Statics.field2053[var22] += var27.field1000;
                            Statics.field68[var22] += var27.field1001;
                            var10002 = Statics.field2965[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field81[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class44 var34 = (class44) class44.field996.method3556((long) var33);
                            class44 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field995.method3086(1, var33);
                                class44 var37 = new class44();
                                if (var36 != null) {
                                    var37.method849(new class123(var36), var33);
                                }
                                var37.method856();
                                class44.field996.method3562(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field3054[var22] -= var35.field998;
                            Statics.field261[var22] -= var35.field997;
                            Statics.field2053[var22] -= var35.field1000;
                            Statics.field68[var22] -= var35.field1001;
                            var10002 = Statics.field2965[var22]--;
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
                            var39 += Statics.field3054[var45];
                            var40 += Statics.field261[var45];
                            var41 += Statics.field2053[var45];
                            var42 += Statics.field68[var45];
                            var43 += Statics.field2965[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field3054[var46];
                            var40 -= Statics.field261[var46];
                            var41 -= Statics.field2053[var46];
                            var42 -= Statics.field68[var46];
                            var43 -= Statics.field2965[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field278 || (field79[0][var21][var44] & 0x2) != 0 || (field79[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field88) {
                                field88 = var6;
                            }
                            int var47 = Statics.field81[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field82[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field78[var6][var21][var44];
                                int var50 = field78[var6][var21 + 1][var44];
                                int var51 = field78[var6][var21 + 1][var44 + 1];
                                int var52 = field78[var6][var21][var44 + 1];
                                int var53 = Statics.field2651[var21][var44];
                                int var54 = Statics.field2651[var21 + 1][var44];
                                int var55 = Statics.field2651[var21 + 1][var44 + 1];
                                int var56 = Statics.field2651[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method100(var59, var60, var61);
                                    int var62 = field89 + var59 & 0xFF;
                                    int var63 = field90 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method100(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field2354[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class49.method554(var48 - 1).field1076) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field763[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class95.field1657[method2349(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1874(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method2349(var57, var53), method2349(var57, var54), method2349(var57, var55), method2349(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field2354[var6][var21][var44] + 1;
                                    byte var67 = Statics.field2142[var6][var21][var44];
                                    int var68 = var48 - 1;
                                    class49 var69 = (class49) class49.field1073.method3556((long) var68);
                                    class49 var70;
                                    if (var69 == null) {
                                        byte[] var71 = Statics.field1084.method3086(4, var68);
                                        class49 var72 = new class49();
                                        if (var71 != null) {
                                            var72.method961(new class123(var71), var68);
                                        }
                                        var72.method960();
                                        class49.field1073.method3562(var72, (long) var68);
                                        var70 = var72;
                                    } else {
                                        var70 = var69;
                                    }
                                    int var74 = var70.field1075;
                                    int var75;
                                    int var76;
                                    if (var74 >= 0) {
                                        var75 = Statics.field1658.method2105(var74);
                                        var76 = -1;
                                    } else if (var70.field1074 == 16711935) {
                                        var76 = -2;
                                        var74 = -1;
                                        var75 = -2;
                                    } else {
                                        var76 = method100(var70.field1078, var70.field1079, var70.field1081);
                                        int var77 = field89 + var70.field1078 & 0xFF;
                                        int var78 = field90 + var70.field1081;
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        var75 = method100(var77, var70.field1079, var78);
                                    }
                                    int var79 = 0;
                                    if (var75 != -2) {
                                        var79 = class95.field1657[method2870(var75, 96)];
                                    }
                                    if (var70.field1077 != -1) {
                                        int var80 = field89 + var70.field1072 & 0xFF;
                                        int var81 = field90 + var70.field1083;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        int var82 = method100(var80, var70.field1082, var81);
                                        var79 = class95.field1657[method2870(var82, 96)];
                                    }
                                    arg0.method1874(var6, var21, var44, var66, var67, var74, var49, var50, var51, var52, method2349(var57, var53), method2349(var57, var54), method2349(var57, var55), method2349(var57, var56), method2870(var76, var53), method2870(var76, var54), method2870(var76, var55), method2870(var76, var56), var65, var79);
                                }
                            }
                        }
                    }
                }
            }
            for (int var83 = 1; var83 < 103; var83++) {
                for (int var84 = 1; var84 < 103; var84++) {
                    arg0.method1873(var6, var84, var83, method2818(var6, var84, var83));
                }
            }
            Statics.field81[var6] = (byte[][]) null;
            Statics.field82[var6] = (byte[][]) null;
            Statics.field2354[var6] = (byte[][]) null;
            Statics.field2142[var6] = (byte[][]) null;
            Statics.field1456[var6] = (byte[][]) null;
        }
        arg0.method1899(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field79[1][var85][var86] & 0x2) == 2) {
                    arg0.method1871(var85, var86);
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
                        if ((Statics.field763[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field763[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field763[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label364: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field763[var96 - 1][var93][var98] & var87) == 0) {
                                        break label364;
                                    }
                                }
                                var96--;
                            }
                            label353: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field763[var97 + 1][var93][var99] & var87) == 0) {
                                        break label353;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field78[var97][var93][var94] - var101;
                                int var103 = field78[var96][var93][var94];
                                class90.method1979(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field763[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field763[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field763[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field763[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label417: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field763[var108 - 1][var110][var92] & var88) == 0) {
                                        break label417;
                                    }
                                }
                                var108--;
                            }
                            label406: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field763[var109 + 1][var111][var92] & var88) == 0) {
                                        break label406;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field78[var109][var106][var92] - var113;
                                int var115 = field78[var108][var106][var92];
                                class90.method1979(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field763[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field763[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field763[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field763[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label470: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field763[var91][var118 - 1][var122] & var89) == 0) {
                                        break label470;
                                    }
                                }
                                var118--;
                            }
                            label459: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field763[var91][var119 + 1][var123] & var89) == 0) {
                                        break label459;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field78[var91][var118][var120];
                                class90.method1979(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field763[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.l(IIIB)I")
    public static int method2818(int arg0, int arg1, int arg2) {
        if ((field79[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field79[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ds.j(IIIB)I")
    public static final int method2309(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method756(var3, var5);
        int var8 = method756(var3 + 1, var5);
        int var9 = method756(var3, var5 + 1);
        int var10 = method756(var3 + 1, var5 + 1);
        int var11 = method617(var7, var8, var4, arg2);
        int var12 = method617(var9, var10, var4, arg2);
        int var13 = 65536 - class95.field1662[var6 * 1024 / arg2] >> 1;
        return ((65536 - var13) * var11 >> 16) + (var12 * var13 >> 16);
    }

    @ObfuscatedName("an.r(IIIII)I")
    public static final int method617(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class95.field1662[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ay.x(III)I")
    public static final int method756(int arg0, int arg1) {
        int var2 = method1046(arg0 - 1, arg1 - 1) + method1046(arg0 + 1, arg1 - 1) + method1046(arg0 - 1, arg1 + 1) + method1046(arg0 + 1, arg1 + 1);
        int var3 = method1046(arg0 - 1, arg1) + method1046(arg0 + 1, arg1) + method1046(arg0, arg1 - 1) + method1046(arg0, arg1 + 1);
        int var4 = method1046(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ae.k(III)I")
    public static final int method1046(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dh.v(IIB)I")
    public static final int method2349(int arg0, int arg1) {
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

    @ObfuscatedName("er.h(III)I")
    public static final int method2870(int arg0, int arg1) {
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

    @ObfuscatedName("r.u(IIIS)I")
    public static final int method100(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("eo.y(III)Z")
    public static final boolean method2765(int arg0, int arg1) {
        class43 var2 = class43.method96(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method799(arg1);
    }

    @ObfuscatedName("w.p(IIIIIIILcu;Lds;I)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class90 arg7, class112 arg8) {
        class43 var9 = class43.method96(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field981;
            var11 = var9.field977;
        } else {
            var10 = var9.field977;
            var11 = var9.field981;
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
        int[][] var16 = field78[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field975 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field983 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class89 var22;
            if (var9.field943 == -1 && var9.field984 == null) {
                var22 = var9.method830(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method1875(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field960 == 1) {
                arg8.method2317(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var45;
            if (var9.field943 == -1 && var9.field984 == null) {
                var45 = var9.method830(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            if (var45 != null) {
                arg7.method1909(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field960 != 0) {
                arg8.method2297(arg2, arg3, var10, var11, var9.field961);
            }
        } else if (arg6 >= 12) {
            class89 var23;
            if (var9.field943 == -1 && var9.field984 == null) {
                var23 = var9.method830(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method1909(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field960 != 0) {
                arg8.method2297(arg2, arg3, var10, var11, var9.field961);
            }
        } else if (arg6 == 0) {
            class89 var24;
            if (var9.field943 == -1 && var9.field984 == null) {
                var24 = var9.method830(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method2000(arg0, arg2, arg3, var17, var24, (class89) null, field83[arg5], 0, var20, var21);
            if (var9.field960 != 0) {
                arg8.method2298(arg2, arg3, arg6, arg5, var9.field961);
            }
        } else if (arg6 == 1) {
            class89 var25;
            if (var9.field943 == -1 && var9.field984 == null) {
                var25 = var9.method830(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method2000(arg0, arg2, arg3, var17, var25, (class89) null, field84[arg5], 0, var20, var21);
            if (var9.field960 != 0) {
                arg8.method2298(arg2, arg3, arg6, arg5, var9.field961);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class89 var27;
            class89 var28;
            if (var9.field943 == -1 && var9.field984 == null) {
                var27 = var9.method830(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method830(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field943, true, (class89) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method2000(arg0, arg2, arg3, var17, var27, var28, field83[arg5], field83[var26], var20, var21);
            if (var9.field960 != 0) {
                arg8.method2298(arg2, arg3, arg6, arg5, var9.field961);
            }
        } else if (arg6 == 3) {
            class89 var29;
            if (var9.field943 == -1 && var9.field984 == null) {
                var29 = var9.method830(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method2000(arg0, arg2, arg3, var17, var29, (class89) null, field84[arg5], 0, var20, var21);
            if (var9.field960 != 0) {
                arg8.method2298(arg2, arg3, arg6, arg5, var9.field961);
            }
        } else if (arg6 == 9) {
            class89 var30;
            if (var9.field943 == -1 && var9.field984 == null) {
                var30 = var9.method830(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method1909(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field960 != 0) {
                arg8.method2297(arg2, arg3, var10, var11, var9.field961);
            }
        } else if (arg6 == 4) {
            class89 var31;
            if (var9.field943 == -1 && var9.field984 == null) {
                var31 = var9.method830(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method1878(arg0, arg2, arg3, var17, var31, (class89) null, field83[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1895(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class43.method96(var33 >> 14 & 0x7FFF).field967;
            }
            class89 var34;
            if (var9.field943 == -1 && var9.field984 == null) {
                var34 = var9.method830(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method1878(arg0, arg2, arg3, var17, var34, (class89) null, field83[arg5], 0, field91[arg5] * var32, field85[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1895(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class43.method96(var36 >> 14 & 0x7FFF).field967 / 2;
            }
            class89 var37;
            if (var9.field943 == -1 && var9.field984 == null) {
                var37 = var9.method830(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method1878(arg0, arg2, arg3, var17, var37, (class89) null, 256, arg5, field87[arg5] * var35, field80[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class89 var39;
            if (var9.field943 == -1 && var9.field984 == null) {
                var39 = var9.method830(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method1878(arg0, arg2, arg3, var17, var39, (class89) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1895(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class43.method96(var41 >> 14 & 0x7FFF).field967 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class89 var43;
            class89 var44;
            if (var9.field943 == -1 && var9.field984 == null) {
                var43 = var9.method830(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method830(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field943, true, (class89) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field943, true, (class89) null);
            }
            arg7.method1878(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field87[arg5] * var40, field80[arg5] * var40, var20, var21);
        }
    }
}
