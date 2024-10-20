package deob;

@ObfuscatedName("k")
public final class class6 {

    @ObfuscatedName("k.a")
    public static int[][][] field95 = new int[4][105][105];

    @ObfuscatedName("k.w")
    public static byte[][][] field83 = new byte[4][104][104];

    @ObfuscatedName("k.d")
    public static int field88 = 99;

    @ObfuscatedName("k.j")
    public static final int[] field89 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("k.h")
    public static final int[] field90 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("k.s")
    public static final int[] field91 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("k.f")
    public static final int[] field92 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("k.b")
    public static final int[] field93 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("k.l")
    public static final int[] field84 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("k.o")
    public static int field97 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("k.v")
    public static int field103 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.a(I)V")
    public static void method3309() {
        field88 = 99;
        Statics.field1054 = new byte[4][104][104];
        Statics.field85 = new byte[4][104][104];
        Statics.field86 = new byte[4][104][104];
        Statics.field1464 = new byte[4][104][104];
        Statics.field78 = new int[4][105][105];
        Statics.field986 = new byte[4][105][105];
        Statics.field3127 = new int[105][105];
        Statics.field87 = new int[104];
        Statics.field2078 = new int[104];
        Statics.field2171 = new int[104];
        Statics.field96 = new int[104];
        Statics.field2036 = new int[104];
    }

    @ObfuscatedName("w.w(IIIII)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field986[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field95[0][var5][var4] = field95[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field95[0][var5][var4] = field95[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field95[0][var5][var4] = field95[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field95[0][var5][var4] = field95[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.d([BIIII[Lde;I)V")
    public static final void method124(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class109[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1897[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class120 var9 = new class120(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method168(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("et.c([BIIIIIII[Lde;I)V")
    public static final void method2964(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class109[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1897[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class120 var11 = new class120(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method168(var11, arg1, arg2 + class178.method2145(var13 & 0x7, var14 & 0x7, arg7), arg3 + class178.method189(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method168(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.y(IIIS)V")
    public static final void method2031(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field95[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field95[arg0][arg1][arg2 + var5] = field95[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field95[arg0][arg1 + var6][arg2] = field95[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field95[arg0][arg1 - 1][arg2] != 0) {
            field95[arg0][arg1][arg2] = field95[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field95[arg0][arg1][arg2 - 1] != 0) {
            field95[arg0][arg1][arg2] = field95[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field95[arg0][arg1 - 1][arg2 - 1] != 0) {
            field95[arg0][arg1][arg2] = field95[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("e.k(Ldx;IIIIIII)V")
    public static final void method168(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2462();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2462();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2462();
                }
            }
            return;
        }
        field83[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2462();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field95[0][arg2][arg3] = -method3036(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field95[arg1][arg2][arg3] = field95[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2462();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field95[0][arg2][arg3] = -var8 * 8;
                } else {
                    field95[arg1][arg2][arg3] = field95[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field85[arg1][arg2][arg3] = arg0.method2548();
                Statics.field86[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1464[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field83[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1054[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dk.r([BIII)Z")
    public static final boolean method2393(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class120 var4 = new class120(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2661();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2661();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2462() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method2809(var5);
                        if (var13 != 22 || !client.field303 || var16.field943 != 0 || var16.field941 == 1 || var16.field962) {
                            if (!var16.method891()) {
                                client.field334++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2661();
                if (var9 == 0) {
                    break;
                }
                var4.method2462();
            }
        }
    }

    @ObfuscatedName("ak.p(IIIIIILcp;Lde;I)V")
    public static final void method1061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, class109 arg7) {
        if (client.field303 && (field83[0][arg1][arg2] & 0x2) == 0 && (field83[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field88) {
            field88 = arg0;
        }
        class41 var8 = class41.method2809(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field940;
            var10 = var8.field939;
        } else {
            var9 = var8.field939;
            var10 = var8.field940;
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
        int[][] var15 = field95[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field943 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field964 == 1) {
            var20 += 256;
        }
        if (var8.method878()) {
            class24.method173(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field303 || var8.field943 != 0 || var8.field941 == 1 || var8.field962) {
                class86 var21;
                if (var8.field960 == -1 && var8.field926 == null) {
                    var21 = var8.method873(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
                }
                arg6.method1885(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field941 == 1 && arg7 != null) {
                    arg7.method2344(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class86 var44;
            if (var8.field960 == -1 && var8.field926 == null) {
                var44 = var8.method873(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            if (var44 != null && arg6.method1926(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field955) {
                int var45 = 15;
                if (var44 instanceof class106) {
                    var45 = ((class106) var44).method2282() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field986[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field986[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2342(arg1, arg2, var9, var10, var8.field942);
            }
        } else if (arg5 >= 12) {
            class86 var22;
            if (var8.field960 == -1 && var8.field926 == null) {
                var22 = var8.method873(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field78[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2342(arg1, arg2, var9, var10, var8.field942);
            }
        } else if (arg5 == 0) {
            class86 var23;
            if (var8.field960 == -1 && var8.field926 == null) {
                var23 = var8.method873(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var23, (class86) null, field89[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field955) {
                    Statics.field986[arg0][arg1][arg2] = 50;
                    Statics.field986[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field78[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field955) {
                    Statics.field986[arg0][arg1][arg2 + 1] = 50;
                    Statics.field986[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field78[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field955) {
                    Statics.field986[arg0][arg1 + 1][arg2] = 50;
                    Statics.field986[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field78[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field955) {
                    Statics.field986[arg0][arg1][arg2] = 50;
                    Statics.field986[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field946) {
                    Statics.field78[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2341(arg1, arg2, arg5, arg4, var8.field942);
            }
            if (var8.field948 != 16) {
                arg6.method1957(arg0, arg1, arg2, var8.field948);
            }
        } else if (arg5 == 1) {
            class86 var24;
            if (var8.field960 == -1 && var8.field926 == null) {
                var24 = var8.method873(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var24, (class86) null, field90[arg4], 0, var19, var20);
            if (var8.field955) {
                if (arg4 == 0) {
                    Statics.field986[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field986[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field986[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field986[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2341(arg1, arg2, arg5, arg4, var8.field942);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class86 var26;
            class86 var27;
            if (var8.field960 == -1 && var8.field926 == null) {
                var26 = var8.method873(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method873(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var26, var27, field89[arg4], field89[var25], var19, var20);
            if (var8.field946) {
                if (arg4 == 0) {
                    Statics.field78[arg0][arg1][arg2] |= 0x249;
                    Statics.field78[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field78[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field78[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field78[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field78[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field78[arg0][arg1][arg2] |= 0x492;
                    Statics.field78[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2341(arg1, arg2, arg5, arg4, var8.field942);
            }
            if (var8.field948 != 16) {
                arg6.method1957(arg0, arg1, arg2, var8.field948);
            }
        } else if (arg5 == 3) {
            class86 var28;
            if (var8.field960 == -1 && var8.field926 == null) {
                var28 = var8.method873(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var28, (class86) null, field90[arg4], 0, var19, var20);
            if (var8.field955) {
                if (arg4 == 0) {
                    Statics.field986[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field986[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field986[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field986[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2341(arg1, arg2, arg5, arg4, var8.field942);
            }
        } else if (arg5 == 9) {
            class86 var29;
            if (var8.field960 == -1 && var8.field926 == null) {
                var29 = var8.method873(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2342(arg1, arg2, var9, var10, var8.field942);
            }
            if (var8.field948 != 16) {
                arg6.method1957(arg0, arg1, arg2, var8.field948);
            }
        } else if (arg5 == 4) {
            class86 var30;
            if (var8.field960 == -1 && var8.field926 == null) {
                var30 = var8.method873(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var30, (class86) null, field89[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1905(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method2809(var32 >> 14 & 0x7FFF).field948;
            }
            class86 var33;
            if (var8.field960 == -1 && var8.field926 == null) {
                var33 = var8.method873(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var33, (class86) null, field89[arg4], 0, field91[arg4] * var31, field92[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1905(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method2809(var35 >> 14 & 0x7FFF).field948 / 2;
            }
            class86 var36;
            if (var8.field960 == -1 && var8.field926 == null) {
                var36 = var8.method873(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var36, (class86) null, 256, arg4, field93[arg4] * var34, field84[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class86 var38;
            if (var8.field960 == -1 && var8.field926 == null) {
                var38 = var8.method873(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var38, (class86) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1905(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method2809(var40 >> 14 & 0x7FFF).field948 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class86 var42;
            class86 var43;
            if (var8.field960 == -1 && var8.field926 == null) {
                var42 = var8.method873(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method873(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field93[arg4] * var39, field84[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("az.q(Lcp;[Lde;I)V")
    public static final void method802(class87 arg0, class109[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field83[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field83[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2348(var3, var4);
                        }
                    }
                }
            }
        }
        field97 += (int) (Math.random() * 5.0D) - 2;
        if (field97 < -8) {
            field97 = -8;
        }
        if (field97 > 8) {
            field97 = 8;
        }
        field103 += (int) (Math.random() * 5.0D) - 2;
        if (field103 < -16) {
            field103 = -16;
        }
        if (field103 > 16) {
            field103 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field986[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field95[var6][var11 + 1][var10] - field95[var6][var11 - 1][var10];
                    int var13 = field95[var6][var11][var10 + 1] - field95[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field3127[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field87[var20] = 0;
                Statics.field2078[var20] = 0;
                Statics.field2171[var20] = 0;
                Statics.field96[var20] = 0;
                Statics.field2036[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field1054[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class42 var26 = (class42) class42.field979.method3579((long) var25);
                            class42 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field2640.method3188(1, var25);
                                class42 var29 = new class42();
                                if (var28 != null) {
                                    var29.method915(new class120(var28), var25);
                                }
                                var29.method914();
                                class42.field979.method3581(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field87[var22] += var27.field982;
                            Statics.field2078[var22] += var27.field981;
                            Statics.field2171[var22] += var27.field984;
                            Statics.field96[var22] += var27.field983;
                            var10002 = Statics.field2036[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field1054[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class42 var34 = (class42) class42.field979.method3579((long) var33);
                            class42 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field2640.method3188(1, var33);
                                class42 var37 = new class42();
                                if (var36 != null) {
                                    var37.method915(new class120(var36), var33);
                                }
                                var37.method914();
                                class42.field979.method3581(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field87[var22] -= var35.field982;
                            Statics.field2078[var22] -= var35.field981;
                            Statics.field2171[var22] -= var35.field984;
                            Statics.field96[var22] -= var35.field983;
                            var10002 = Statics.field2036[var22]--;
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
                            var39 += Statics.field87[var45];
                            var40 += Statics.field2078[var45];
                            var41 += Statics.field2171[var45];
                            var42 += Statics.field96[var45];
                            var43 += Statics.field2036[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field87[var46];
                            var40 -= Statics.field2078[var46];
                            var41 -= Statics.field2171[var46];
                            var42 -= Statics.field96[var46];
                            var43 -= Statics.field2036[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field303 || (field83[0][var21][var44] & 0x2) != 0 || (field83[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field88) {
                                field88 = var6;
                            }
                            int var47 = Statics.field1054[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field85[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field95[var6][var21][var44];
                                int var50 = field95[var6][var21 + 1][var44];
                                int var51 = field95[var6][var21 + 1][var44 + 1];
                                int var52 = field95[var6][var21][var44 + 1];
                                int var53 = Statics.field3127[var21][var44];
                                int var54 = Statics.field3127[var21 + 1][var44];
                                int var55 = Statics.field3127[var21 + 1][var44 + 1];
                                int var56 = Statics.field3127[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method212(var59, var60, var61);
                                    int var62 = field97 + var59 & 0xFF;
                                    int var63 = field103 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method212(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field86[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class47 var66 = (class47) class47.field1066.method3579((long) var65);
                                        class47 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field2659.method3188(4, var65);
                                            class47 var69 = new class47();
                                            if (var68 != null) {
                                                var69.method1042(new class120(var68), var65);
                                            }
                                            var69.method1031();
                                            class47.field1066.method3581(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field1059) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field78[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class92.field1590[method130(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method2001(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method130(var57, var53), method130(var57, var54), method130(var57, var55), method130(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field86[var6][var21][var44] + 1;
                                    byte var72 = Statics.field1464[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class47 var74 = (class47) class47.field1066.method3579((long) var73);
                                    class47 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field2659.method3188(4, var73);
                                        class47 var77 = new class47();
                                        if (var76 != null) {
                                            var77.method1042(new class120(var76), var73);
                                        }
                                        var77.method1031();
                                        class47.field1066.method3581(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field1061;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1576.method2107(var79);
                                        var81 = -1;
                                    } else if (var75.field1060 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method212(var75.field1064, var75.field1069, var75.field1062);
                                        int var82 = field97 + var75.field1064 & 0xFF;
                                        int var83 = field103 + var75.field1062;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method212(var82, var75.field1069, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class92.field1590[method633(var80, 96)];
                                    }
                                    if (var75.field1063 != -1) {
                                        int var85 = field97 + var75.field1072 & 0xFF;
                                        int var86 = field103 + var75.field1065;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method212(var85, var75.field1068, var86);
                                        var84 = class92.field1590[method633(var87, 96)];
                                    }
                                    arg0.method2001(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method130(var57, var53), method130(var57, var54), method130(var57, var55), method130(var57, var56), method633(var81, var53), method633(var81, var54), method633(var81, var55), method633(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1976(var6, var89, var88, method1157(var6, var89, var88));
                }
            }
            Statics.field1054[var6] = (byte[][]) null;
            Statics.field85[var6] = (byte[][]) null;
            Statics.field86[var6] = (byte[][]) null;
            Statics.field1464[var6] = (byte[][]) null;
            Statics.field986[var6] = (byte[][]) null;
        }
        arg0.method1910(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field83[1][var90][var91] & 0x2) == 2) {
                    arg0.method1881(var90, var91);
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
                        if ((Statics.field78[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field78[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field78[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label373: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field78[var101 - 1][var98][var103] & var92) == 0) {
                                        break label373;
                                    }
                                }
                                var101--;
                            }
                            label362: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field78[var102 + 1][var98][var104] & var92) == 0) {
                                        break label362;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field95[var102][var98][var99] - var106;
                                int var108 = field95[var101][var98][var99];
                                class87.method1928(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field78[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field78[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field78[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field78[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label426: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field78[var113 - 1][var115][var97] & var93) == 0) {
                                        break label426;
                                    }
                                }
                                var113--;
                            }
                            label415: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field78[var114 + 1][var116][var97] & var93) == 0) {
                                        break label415;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field95[var114][var111][var97] - var118;
                                int var120 = field95[var113][var111][var97];
                                class87.method1928(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field78[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field78[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field78[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field78[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label479: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field78[var96][var123 - 1][var127] & var94) == 0) {
                                        break label479;
                                    }
                                }
                                var123--;
                            }
                            label468: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field78[var96][var124 + 1][var128] & var94) == 0) {
                                        break label468;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field95[var96][var123][var125];
                                class87.method1928(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field78[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.m(IIIB)I")
    public static int method1157(int arg0, int arg1, int arg2) {
        if ((field83[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field83[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("eu.e(III)I")
    public static final int method3036(int arg0, int arg1) {
        int var2 = method2147(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2147(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2147(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("cf.x(IIII)I")
    public static final int method2147(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1672(var3, var5);
        int var8 = method1672(var3 + 1, var5);
        int var9 = method1672(var3, var5 + 1);
        int var10 = method1672(var3 + 1, var5 + 1);
        int var11 = 65536 - class92.field1595[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class92.field1595[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class92.field1595[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("br.z(III)I")
    public static final int method1672(int arg0, int arg1) {
        int var2 = method10(arg0 - 1, arg1 - 1) + method10(arg0 + 1, arg1 - 1) + method10(arg0 - 1, arg1 + 1) + method10(arg0 + 1, arg1 + 1);
        int var3 = method10(arg0 - 1, arg1) + method10(arg0 + 1, arg1) + method10(arg0, arg1 - 1) + method10(arg0, arg1 + 1);
        int var4 = method10(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("w.i(III)I")
    public static final int method10(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("r.t(IIB)I")
    public static final int method130(int arg0, int arg1) {
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

    @ObfuscatedName("s.n(III)I")
    public static final int method633(int arg0, int arg1) {
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

    @ObfuscatedName("g.u(IIII)I")
    public static final int method212(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cj.g(III)Z")
    public static final boolean method2033(int arg0, int arg1) {
        class41 var2 = class41.method2809(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method871(arg1);
    }
}
