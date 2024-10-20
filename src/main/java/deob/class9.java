package deob;

@ObfuscatedName("u")
public final class class9 {

    @ObfuscatedName("u.v")
    public static int[][][] field135 = new int[4][105][105];

    @ObfuscatedName("u.f")
    public static byte[][][] field133 = new byte[4][104][104];

    @ObfuscatedName("u.n")
    public static int field148 = 99;

    @ObfuscatedName("u.i")
    public static final int[] field140 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("u.j")
    public static final int[] field141 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("u.a")
    public static final int[] field142 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("u.g")
    public static final int[] field143 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("u.x")
    public static final int[] field144 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("u.b")
    public static final int[] field145 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("u.w")
    public static int field152 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("u.y")
    public static int field147 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.v(B)V")
    public static void method1428() {
        Statics.field156 = (byte[][][]) null;
        Statics.field136 = (byte[][][]) null;
        Statics.field137 = (byte[][][]) null;
        Statics.field1922 = (byte[][][]) null;
        Statics.field1998 = (int[][][]) null;
        Statics.field146 = (byte[][][]) null;
        Statics.field83 = (int[][]) null;
        Statics.field1501 = null;
        Statics.field77 = null;
        Statics.field2034 = null;
        Statics.field736 = null;
        Statics.field1607 = null;
    }

    @ObfuscatedName("ah.f(IIIII)V")
    public static final void method637(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field146[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field135[0][var5][var4] = field135[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field135[0][var5][var4] = field135[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field135[0][var5][var4] = field135[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field135[0][var5][var4] = field135[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ca.n(IIIS)V")
    public static final void method2051(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field135[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field135[arg0][arg1][arg2 + var5] = field135[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field135[arg0][arg1 + var6][arg2] = field135[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field135[arg0][arg1 - 1][arg2] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field135[arg0][arg1][arg2 - 1] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field135[arg0][arg1 - 1][arg2 - 1] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("x.c(Ldr;IIIIIII)V")
    public static final void method210(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2466();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2466();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2466();
                }
            }
            return;
        }
        field133[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2466();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field135[0][arg2][arg3] = -method2056(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field135[arg1][arg2][arg3] = field135[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2466();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field135[0][arg2][arg3] = -var8 * 8;
                } else {
                    field135[arg1][arg2][arg3] = field135[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field136[arg1][arg2][arg3] = arg0.method2499();
                Statics.field137[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1922[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field133[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field156[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cm.r([BIIS)Z")
    public static final boolean method1877(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class126 var4 = new class126(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2479();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2479();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2466() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class31 var16 = class31.method195(var5);
                        if (var13 != 22 || !client.field617 || var16.field818 != 0 || var16.field811 == 1 || var16.field833) {
                            if (!var16.method643()) {
                                client.field515++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2479();
                if (var9 == 0) {
                    break;
                }
                var4.method2466();
            }
        }
    }

    @ObfuscatedName("bc.k([BIILcx;[Lfu;I)V")
    public static final void method1382(byte[] arg0, int arg1, int arg2, class94 arg3, class163[] arg4) {
        class126 var5 = new class126(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2479();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2479();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2466();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field133[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class163 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method636(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ah.e(IIIIIILcx;Lfu;B)V")
    public static final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class94 arg6, class163 arg7) {
        if (client.field617 && (field133[0][arg1][arg2] & 0x2) == 0) {
            if ((field133[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1623(arg0, arg1, arg2) != client.field512) {
                return;
            }
        }
        if (arg0 < field148) {
            field148 = arg0;
        }
        class31 var8 = class31.method195(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field810;
            var10 = var8.field809;
        } else {
            var9 = var8.field809;
            var10 = var8.field810;
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
        int[][] var15 = field135[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field818 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field835 == 1) {
            var20 += 256;
        }
        if (var8.method673()) {
            class7 var21 = new class7();
            var21.field93 = arg0;
            var21.field94 = arg1 * 128;
            var21.field95 = arg2 * 128;
            int var22 = var8.field809;
            int var23 = var8.field810;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field810;
                var23 = var8.field809;
            }
            var21.field96 = (arg1 + var22) * 128;
            var21.field111 = (arg2 + var23) * 128;
            var21.field108 = var8.field825;
            var21.field98 = var8.field828 * 128;
            var21.field110 = var8.field841;
            var21.field97 = var8.field842;
            var21.field103 = var8.field795;
            if (var8.field794 != null) {
                var21.field106 = var8;
                var21.method39();
            }
            class7.field101.method3316(var21);
            if (var21.field103 != null) {
                var21.field104 = var21.field110 + (int) (Math.random() * (double) (var21.field97 - var21.field110));
            }
        }
        if (arg5 == 22) {
            if (!client.field617 || var8.field818 != 0 || var8.field811 == 1 || var8.field833) {
                class93 var24;
                if (var8.field817 == -1 && var8.field794 == null) {
                    var24 = var8.method644(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
                }
                arg6.method1988(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field811 == 1 && arg7 != null) {
                    arg7.method3210(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class93 var47;
            if (var8.field817 == -1 && var8.field794 == null) {
                var47 = var8.method644(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            if (var47 != null && arg6.method1894(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field829) {
                int var48 = 15;
                if (var47 instanceof class111) {
                    var48 = ((class111) var47).method2269() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field146[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field146[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field811 != 0 && arg7 != null) {
                arg7.method3182(arg1, arg2, var9, var10, var8.field812);
            }
        } else if (arg5 >= 12) {
            class93 var25;
            if (var8.field817 == -1 && var8.field794 == null) {
                var25 = var8.method644(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1894(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1998[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field811 != 0 && arg7 != null) {
                arg7.method3182(arg1, arg2, var9, var10, var8.field812);
            }
        } else if (arg5 == 0) {
            class93 var26;
            if (var8.field817 == -1 && var8.field794 == null) {
                var26 = var8.method644(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1953(arg0, arg1, arg2, var16, var26, (class93) null, field140[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field829) {
                    Statics.field146[arg0][arg1][arg2] = 50;
                    Statics.field146[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field816) {
                    Statics.field1998[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field829) {
                    Statics.field146[arg0][arg1][arg2 + 1] = 50;
                    Statics.field146[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field816) {
                    Statics.field1998[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field829) {
                    Statics.field146[arg0][arg1 + 1][arg2] = 50;
                    Statics.field146[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field816) {
                    Statics.field1998[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field829) {
                    Statics.field146[arg0][arg1][arg2] = 50;
                    Statics.field146[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field816) {
                    Statics.field1998[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field811 != 0 && arg7 != null) {
                arg7.method3181(arg1, arg2, arg5, arg4, var8.field812);
            }
            if (var8.field806 != 16) {
                arg6.method1939(arg0, arg1, arg2, var8.field806);
            }
        } else if (arg5 == 1) {
            class93 var27;
            if (var8.field817 == -1 && var8.field794 == null) {
                var27 = var8.method644(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1953(arg0, arg1, arg2, var16, var27, (class93) null, field141[arg4], 0, var19, var20);
            if (var8.field829) {
                if (arg4 == 0) {
                    Statics.field146[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field146[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field146[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field146[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field811 != 0 && arg7 != null) {
                arg7.method3181(arg1, arg2, arg5, arg4, var8.field812);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class93 var29;
            class93 var30;
            if (var8.field817 == -1 && var8.field794 == null) {
                var29 = var8.method644(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method644(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field817, true, (class93) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1953(arg0, arg1, arg2, var16, var29, var30, field140[arg4], field140[var28], var19, var20);
            if (var8.field816) {
                if (arg4 == 0) {
                    Statics.field1998[arg0][arg1][arg2] |= 0x249;
                    Statics.field1998[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1998[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1998[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1998[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1998[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1998[arg0][arg1][arg2] |= 0x492;
                    Statics.field1998[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field811 != 0 && arg7 != null) {
                arg7.method3181(arg1, arg2, arg5, arg4, var8.field812);
            }
            if (var8.field806 != 16) {
                arg6.method1939(arg0, arg1, arg2, var8.field806);
            }
        } else if (arg5 == 3) {
            class93 var31;
            if (var8.field817 == -1 && var8.field794 == null) {
                var31 = var8.method644(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1953(arg0, arg1, arg2, var16, var31, (class93) null, field141[arg4], 0, var19, var20);
            if (var8.field829) {
                if (arg4 == 0) {
                    Statics.field146[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field146[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field146[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field146[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field811 != 0 && arg7 != null) {
                arg7.method3181(arg1, arg2, arg5, arg4, var8.field812);
            }
        } else if (arg5 == 9) {
            class93 var32;
            if (var8.field817 == -1 && var8.field794 == null) {
                var32 = var8.method644(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1894(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field811 != 0 && arg7 != null) {
                arg7.method3182(arg1, arg2, var9, var10, var8.field812);
            }
            if (var8.field806 != 16) {
                arg6.method1939(arg0, arg1, arg2, var8.field806);
            }
        } else if (arg5 == 4) {
            class93 var33;
            if (var8.field817 == -1 && var8.field794 == null) {
                var33 = var8.method644(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var33, (class93) null, field140[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1909(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class31.method195(var35 >> 14 & 0x7FFF).field806;
            }
            class93 var36;
            if (var8.field817 == -1 && var8.field794 == null) {
                var36 = var8.method644(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var36, (class93) null, field140[arg4], 0, field142[arg4] * var34, field143[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1909(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class31.method195(var38 >> 14 & 0x7FFF).field806 / 2;
            }
            class93 var39;
            if (var8.field817 == -1 && var8.field794 == null) {
                var39 = var8.method644(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var39, (class93) null, 256, arg4, field144[arg4] * var37, field145[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class93 var41;
            if (var8.field817 == -1 && var8.field794 == null) {
                var41 = var8.method644(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var41, (class93) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1909(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class31.method195(var43 >> 14 & 0x7FFF).field806 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class93 var45;
            class93 var46;
            if (var8.field817 == -1 && var8.field794 == null) {
                var45 = var8.method644(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method644(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field817, true, (class93) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field817, true, (class93) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field144[arg4] * var42, field145[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cl.q(IIIB)I")
    public static int method1623(int arg0, int arg1, int arg2) {
        if ((field133[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field133[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cd.u(III)I")
    public static final int method2056(int arg0, int arg1) {
        int var2 = method573(arg0 + 45365, arg1 + 91923, 4) - 128 + (method573(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method573(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("az.s(IIII)I")
    public static final int method573(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method585(var3, var5);
        int var8 = method585(var3 + 1, var5);
        int var9 = method585(var3, var5 + 1);
        int var10 = method585(var3 + 1, var5 + 1);
        int var11 = 65536 - class103.field1771[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = method2224(var9, var10, var4, arg2);
        return method2224(var12, var14, var6, arg2);
    }

    @ObfuscatedName("dg.l(IIIIB)I")
    public static final int method2224(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class103.field1771[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ak.o(IIB)I")
    public static final int method585(int arg0, int arg1) {
        int var2 = method706(arg0 - 1, arg1 - 1) + method706(arg0 + 1, arg1 - 1) + method706(arg0 - 1, arg1 + 1) + method706(arg0 + 1, arg1 + 1);
        int var3 = method706(arg0 - 1, arg1) + method706(arg0 + 1, arg1) + method706(arg0, arg1 - 1) + method706(arg0, arg1 + 1);
        int var4 = method706(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("al.h(III)I")
    public static final int method706(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("f.p(III)I")
    public static final int method8(int arg0, int arg1) {
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

    @ObfuscatedName("at.m(IIIB)I")
    public static final int method1210(int arg0, int arg1, int arg2) {
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
