package deob;

@ObfuscatedName("b")
public final class class6 {

    @ObfuscatedName("b.e")
    public static int[][][] field83 = new int[4][105][105];

    @ObfuscatedName("b.v")
    public static byte[][][] field100 = new byte[4][104][104];

    @ObfuscatedName("b.i")
    public static int field85 = 99;

    @ObfuscatedName("b.d")
    public static final int[] field91 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("b.a")
    public static final int[] field96 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("b.o")
    public static final int[] field86 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("b.r")
    public static final int[] field94 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("b.t")
    public static final int[] field95 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("b.k")
    public static final int[] field98 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("b.n")
    public static int field97 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("b.z")
    public static int field93 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.e(I)V")
    public static void method135() {
        Statics.field84 = (byte[][][]) null;
        Statics.field1763 = (byte[][][]) null;
        Statics.field87 = (byte[][][]) null;
        Statics.field2892 = (byte[][][]) null;
        Statics.field90 = (int[][][]) null;
        Statics.field88 = (byte[][][]) null;
        Statics.field530 = (int[][]) null;
        Statics.field101 = null;
        Statics.field89 = null;
        Statics.field2868 = null;
        Statics.field134 = null;
        Statics.field2681 = null;
    }

    @ObfuscatedName("e.v(IIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field88[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field83[0][var5][var4] = field83[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field83[0][var5][var4] = field83[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field83[0][var5][var4] = field83[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field83[0][var5][var4] = field83[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.i(Ldk;IIIIIIB)V")
    public static final void method1873(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2226();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2226();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2226();
                }
            }
            return;
        }
        field100[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2226();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field83[0][arg2][arg3] = -method593(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field83[arg1][arg2][arg3] = field83[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2226();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field83[0][arg2][arg3] = -var8 * 8;
                } else {
                    field83[arg1][arg2][arg3] = field83[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1763[arg1][arg2][arg3] = arg0.method2292();
                Statics.field87[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2892[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field100[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field84[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("es.g([BIILcj;[Lgb;I)V")
    public static final void method2770(byte[] arg0, int arg1, int arg2, class79 arg3, class197[] arg4) {
        class107 var5 = new class107(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2129();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2129();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2226();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field100[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class197 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method3112(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dz.x([BIIIIIIILcj;[Lgb;I)V")
    public static final void method2355(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8, class197[] arg9) {
        class107 var10 = new class107(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2129();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2129();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2226();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class36 var21 = class36.method12(var11);
                    int var22 = arg2 + class155.method2823(var16 & 0x7, var15 & 0x7, arg7, var21.field877, var21.field848, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field877;
                    int var28 = var21.field848;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field100[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class197 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method3112(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.b(IIIIIILcj;Lgb;I)V")
    public static final void method3112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class197 arg7) {
        if (client.field433 && (field100[0][arg1][arg2] & 0x2) == 0) {
            if ((field100[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field100[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field100[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field315 != var8) {
                return;
            }
        }
        if (arg0 < field85) {
            field85 = arg0;
        }
        class36 var9 = class36.method12(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field848;
            var11 = var9.field877;
        } else {
            var10 = var9.field877;
            var11 = var9.field848;
        }
        int var12;
        int var13;
        if (arg1 + var10 <= 104) {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        } else {
            var12 = arg1;
            var13 = arg1 + 1;
        }
        int var14;
        int var15;
        if (arg2 + var11 <= 104) {
            var14 = (var11 >> 1) + arg2;
            var15 = (var11 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int[][] var16 = field83[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field853 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field872 == 1) {
            var21 += 256;
        }
        if (var9.method632()) {
            class20.method1874(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field433 || var9.field853 != 0 || var9.field859 == 1 || var9.field870) {
                class78 var22;
                if (var9.field842 == -1 && var9.field873 == null) {
                    var22 = var9.method636(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
                }
                arg6.method1614(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field859 == 1 && arg7 != null) {
                    arg7.method3441(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var45;
            if (var9.field842 == -1 && var9.field873 == null) {
                var45 = var9.method636(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            if (var45 != null && arg6.method1618(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field838) {
                int var46 = 15;
                if (var45 instanceof class98) {
                    var46 = ((class98) var45).method1971() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field88[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field88[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3439(arg1, arg2, var10, var11, var9.field850);
            }
        } else if (arg5 >= 12) {
            class78 var23;
            if (var9.field842 == -1 && var9.field873 == null) {
                var23 = var9.method636(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1618(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field90[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3439(arg1, arg2, var10, var11, var9.field850);
            }
        } else if (arg5 == 0) {
            class78 var24;
            if (var9.field842 == -1 && var9.field873 == null) {
                var24 = var9.method636(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var24, (class78) null, field91[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field838) {
                    Statics.field88[arg0][arg1][arg2] = 50;
                    Statics.field88[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field854) {
                    Statics.field90[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field838) {
                    Statics.field88[arg0][arg1][arg2 + 1] = 50;
                    Statics.field88[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field854) {
                    Statics.field90[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field838) {
                    Statics.field88[arg0][arg1 + 1][arg2] = 50;
                    Statics.field88[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field854) {
                    Statics.field90[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field838) {
                    Statics.field88[arg0][arg1][arg2] = 50;
                    Statics.field88[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field854) {
                    Statics.field90[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3449(arg1, arg2, arg5, arg4, var9.field850);
            }
            if (var9.field856 != 16) {
                arg6.method1624(arg0, arg1, arg2, var9.field856);
            }
        } else if (arg5 == 1) {
            class78 var25;
            if (var9.field842 == -1 && var9.field873 == null) {
                var25 = var9.method636(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var25, (class78) null, field96[arg4], 0, var20, var21);
            if (var9.field838) {
                if (arg4 == 0) {
                    Statics.field88[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field88[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field88[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field88[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3449(arg1, arg2, arg5, arg4, var9.field850);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class78 var27;
            class78 var28;
            if (var9.field842 == -1 && var9.field873 == null) {
                var27 = var9.method636(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method636(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field842, true, (class78) null);
                var28 = new class11(arg3, 2, var26, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var27, var28, field91[arg4], field91[var26], var20, var21);
            if (var9.field854) {
                if (arg4 == 0) {
                    Statics.field90[arg0][arg1][arg2] |= 0x249;
                    Statics.field90[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field90[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field90[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field90[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field90[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field90[arg0][arg1][arg2] |= 0x492;
                    Statics.field90[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3449(arg1, arg2, arg5, arg4, var9.field850);
            }
            if (var9.field856 != 16) {
                arg6.method1624(arg0, arg1, arg2, var9.field856);
            }
        } else if (arg5 == 3) {
            class78 var29;
            if (var9.field842 == -1 && var9.field873 == null) {
                var29 = var9.method636(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var29, (class78) null, field96[arg4], 0, var20, var21);
            if (var9.field838) {
                if (arg4 == 0) {
                    Statics.field88[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field88[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field88[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field88[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3449(arg1, arg2, arg5, arg4, var9.field850);
            }
        } else if (arg5 == 9) {
            class78 var30;
            if (var9.field842 == -1 && var9.field873 == null) {
                var30 = var9.method636(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1618(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3439(arg1, arg2, var10, var11, var9.field850);
            }
            if (var9.field856 != 16) {
                arg6.method1624(arg0, arg1, arg2, var9.field856);
            }
        } else if (arg5 == 4) {
            class78 var31;
            if (var9.field842 == -1 && var9.field873 == null) {
                var31 = var9.method636(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, var31, (class78) null, field91[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1634(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class36.method12(var33 >> 14 & 0x7FFF).field856;
            }
            class78 var34;
            if (var9.field842 == -1 && var9.field873 == null) {
                var34 = var9.method636(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, var34, (class78) null, field91[arg4], 0, field86[arg4] * var32, field94[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1634(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class36.method12(var36 >> 14 & 0x7FFF).field856 / 2;
            }
            class78 var37;
            if (var9.field842 == -1 && var9.field873 == null) {
                var37 = var9.method636(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, var37, (class78) null, 256, arg4, field95[arg4] * var35, field98[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class78 var39;
            if (var9.field842 == -1 && var9.field873 == null) {
                var39 = var9.method636(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, var39, (class78) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1634(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class36.method12(var41 >> 14 & 0x7FFF).field856 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class78 var43;
            class78 var44;
            if (var9.field842 == -1 && var9.field873 == null) {
                var43 = var9.method636(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method636(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field842, true, (class78) null);
                var44 = new class11(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field842, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field95[arg4] * var40, field98[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("ah.q(III)I")
    public static final int method593(int arg0, int arg1) {
        int var2 = method2667(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2667(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2667(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ez.l(IIII)I")
    public static final int method2667(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method744(var3, var5);
        int var8 = method744(var3 + 1, var5);
        int var9 = method744(var3, var5 + 1);
        int var10 = method744(var3 + 1, var5 + 1);
        int var11 = method1772(var7, var8, var4, arg2);
        int var12 = method1772(var9, var10, var4, arg2);
        return method1772(var11, var12, var6, arg2);
    }

    @ObfuscatedName("cn.m(IIIII)I")
    public static final int method1772(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1464[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("aj.u(IIB)I")
    public static final int method744(int arg0, int arg1) {
        int var2 = method138(arg0 - 1, arg1 - 1) + method138(arg0 + 1, arg1 - 1) + method138(arg0 - 1, arg1 + 1) + method138(arg0 + 1, arg1 + 1);
        int var3 = method138(arg0 - 1, arg1) + method138(arg0 + 1, arg1) + method138(arg0, arg1 - 1) + method138(arg0, arg1 + 1);
        int var4 = method138(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("p.s(IIB)I")
    public static final int method138(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("af.f(III)I")
    public static final int method691(int arg0, int arg1) {
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

    @ObfuscatedName("cd.p(III)I")
    public static final int method1964(int arg0, int arg1) {
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

    @ObfuscatedName("ew.w(IIII)I")
    public static final int method2691(int arg0, int arg1, int arg2) {
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
