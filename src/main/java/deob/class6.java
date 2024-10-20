package deob;

@ObfuscatedName("y")
public final class class6 {

    @ObfuscatedName("y.w")
    public static int[][][] field97 = new int[4][105][105];

    @ObfuscatedName("y.x")
    public static byte[][][] field110 = new byte[4][104][104];

    @ObfuscatedName("y.t")
    public static int field109 = 99;

    @ObfuscatedName("y.o")
    public static final int[] field101 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("y.h")
    public static final int[] field102 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("y.k")
    public static final int[] field103 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("y.f")
    public static final int[] field104 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("y.r")
    public static final int[] field99 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("y.n")
    public static final int[] field106 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("y.g")
    public static int field107 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("y.b")
    public static int field108 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.w(I)V")
    public static void method1094() {
        field109 = 99;
        Statics.field783 = new byte[4][104][104];
        Statics.field94 = new byte[4][104][104];
        Statics.field2148 = new byte[4][104][104];
        Statics.field1986 = new byte[4][104][104];
        Statics.field73 = new int[4][105][105];
        Statics.field2063 = new byte[4][105][105];
        Statics.field98 = new int[105][105];
        Statics.field95 = new int[104];
        Statics.field2668 = new int[104];
        Statics.field2091 = new int[104];
        Statics.field1636 = new int[104];
        Statics.field1638 = new int[104];
    }

    @ObfuscatedName("ac.x(IIIII)V")
    public static final void method723(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2063[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field97[0][var5][var4] = field97[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field97[0][var5][var4] = field97[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field97[0][var5][var4] = field97[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field97[0][var5][var4] = field97[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.t([BIIIIIII[Ldf;I)V")
    public static final void method658(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class109[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1895[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class120 var11 = new class120(arg0);
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
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method2976(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method2976(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.p(Lde;IIIIIII)V")
    public static final void method2976(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2363();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2363();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2363();
                }
            }
            return;
        }
        field110[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2363();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field97[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2295(var10 + 45365, var11 + 91923, 4) - 128 + (method2295(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2295(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field97[arg1][arg2][arg3] = field97[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2363();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field97[0][arg2][arg3] = -var15 * 8;
                } else {
                    field97[arg1][arg2][arg3] = field97[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field94[arg1][arg2][arg3] = arg0.method2381();
                Statics.field2148[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1986[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field110[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field783[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("em.e([BIII)Z")
    public static final boolean method2797(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class120 var4 = new class120(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2428();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2428();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2363() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method589(var5);
                        if (var13 != 22 || !client.field414 || var16.field976 != 0 || var16.field932 == 1 || var16.field942) {
                            if (!var16.method802()) {
                                client.field564++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2428();
                if (var9 == 0) {
                    break;
                }
                var4.method2363();
            }
        }
    }

    @ObfuscatedName("dn.y([BIILcy;[Ldf;I)V")
    public static final void method2305(byte[] arg0, int arg1, int arg2, class87 arg3, class109[] arg4) {
        class120 var5 = new class120(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2428();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2428();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2363();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field110[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class109 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2635(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ds.c(IIIIIILcy;Ldf;I)V")
    public static final void method2635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, class109 arg7) {
        if (client.field414 && (field110[0][arg1][arg2] & 0x2) == 0 && (field110[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field109) {
            field109 = arg0;
        }
        class41 var8 = class41.method589(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field943;
            var10 = var8.field980;
        } else {
            var9 = var8.field980;
            var10 = var8.field943;
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
        int[][] var15 = field97[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field976 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field967 == 1) {
            var20 += 256;
        }
        if (var8.method813()) {
            class24 var21 = new class24();
            var21.field611 = arg0;
            var21.field612 = arg1 * 128;
            var21.field613 = arg2 * 128;
            int var22 = var8.field980;
            int var23 = var8.field943;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field943;
                var23 = var8.field980;
            }
            var21.field614 = (arg1 + var22) * 128;
            var21.field615 = (arg2 + var23) * 128;
            var21.field617 = var8.field964;
            var21.field624 = var8.field972 * 128;
            var21.field610 = var8.field973;
            var21.field620 = var8.field961;
            var21.field622 = var8.field975;
            if (var8.field944 != null) {
                var21.field627 = var8;
                var21.method598();
            }
            class24.field619.method3583(var21);
            if (var21.field622 != null) {
                var21.field616 = var21.field610 + (int) (Math.random() * (double) (var21.field620 - var21.field610));
            }
        }
        if (arg5 == 22) {
            if (!client.field414 || var8.field976 != 0 || var8.field932 == 1 || var8.field942) {
                class86 var24;
                if (var8.field950 == -1 && var8.field944 == null) {
                    var24 = var8.method808(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
                }
                arg6.method1793(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field932 == 1 && arg7 != null) {
                    arg7.method2256(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class86 var47;
            if (var8.field950 == -1 && var8.field944 == null) {
                var47 = var8.method808(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            if (var47 != null && arg6.method1797(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field958) {
                int var48 = 15;
                if (var47 instanceof class106) {
                    var48 = ((class106) var47).method2173() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2063[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2063[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2268(arg1, arg2, var9, var10, var8.field978);
            }
        } else if (arg5 >= 12) {
            class86 var25;
            if (var8.field950 == -1 && var8.field944 == null) {
                var25 = var8.method808(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field73[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2268(arg1, arg2, var9, var10, var8.field978);
            }
        } else if (arg5 == 0) {
            class86 var26;
            if (var8.field950 == -1 && var8.field944 == null) {
                var26 = var8.method808(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var26, (class86) null, field101[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field958) {
                    Statics.field2063[arg0][arg1][arg2] = 50;
                    Statics.field2063[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field939) {
                    Statics.field73[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field958) {
                    Statics.field2063[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2063[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field939) {
                    Statics.field73[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field958) {
                    Statics.field2063[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2063[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field939) {
                    Statics.field73[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field958) {
                    Statics.field2063[arg0][arg1][arg2] = 50;
                    Statics.field2063[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field939) {
                    Statics.field73[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, arg5, arg4, var8.field978);
            }
            if (var8.field951 != 16) {
                arg6.method1816(arg0, arg1, arg2, var8.field951);
            }
        } else if (arg5 == 1) {
            class86 var27;
            if (var8.field950 == -1 && var8.field944 == null) {
                var27 = var8.method808(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var27, (class86) null, field102[arg4], 0, var19, var20);
            if (var8.field958) {
                if (arg4 == 0) {
                    Statics.field2063[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2063[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2063[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2063[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, arg5, arg4, var8.field978);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class86 var29;
            class86 var30;
            if (var8.field950 == -1 && var8.field944 == null) {
                var29 = var8.method808(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method808(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field950, true, (class86) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var29, var30, field101[arg4], field101[var28], var19, var20);
            if (var8.field939) {
                if (arg4 == 0) {
                    Statics.field73[arg0][arg1][arg2] |= 0x249;
                    Statics.field73[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field73[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field73[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field73[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field73[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field73[arg0][arg1][arg2] |= 0x492;
                    Statics.field73[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, arg5, arg4, var8.field978);
            }
            if (var8.field951 != 16) {
                arg6.method1816(arg0, arg1, arg2, var8.field951);
            }
        } else if (arg5 == 3) {
            class86 var31;
            if (var8.field950 == -1 && var8.field944 == null) {
                var31 = var8.method808(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var31, (class86) null, field102[arg4], 0, var19, var20);
            if (var8.field958) {
                if (arg4 == 0) {
                    Statics.field2063[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2063[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2063[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2063[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, arg5, arg4, var8.field978);
            }
        } else if (arg5 == 9) {
            class86 var32;
            if (var8.field950 == -1 && var8.field944 == null) {
                var32 = var8.method808(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2268(arg1, arg2, var9, var10, var8.field978);
            }
            if (var8.field951 != 16) {
                arg6.method1816(arg0, arg1, arg2, var8.field951);
            }
        } else if (arg5 == 4) {
            class86 var33;
            if (var8.field950 == -1 && var8.field944 == null) {
                var33 = var8.method808(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var33, (class86) null, field101[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1806(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method589(var35 >> 14 & 0x7FFF).field951;
            }
            class86 var36;
            if (var8.field950 == -1 && var8.field944 == null) {
                var36 = var8.method808(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var36, (class86) null, field101[arg4], 0, field103[arg4] * var34, field104[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1806(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method589(var38 >> 14 & 0x7FFF).field951 / 2;
            }
            class86 var39;
            if (var8.field950 == -1 && var8.field944 == null) {
                var39 = var8.method808(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var39, (class86) null, 256, arg4, field99[arg4] * var37, field106[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class86 var41;
            if (var8.field950 == -1 && var8.field944 == null) {
                var41 = var8.method808(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var41, (class86) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1806(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method589(var43 >> 14 & 0x7FFF).field951 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class86 var45;
            class86 var46;
            if (var8.field950 == -1 && var8.field944 == null) {
                var45 = var8.method808(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method808(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field950, true, (class86) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field950, true, (class86) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field99[arg4] * var42, field106[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cp.v(Lcy;[Ldf;I)V")
    public static final void method2052(class87 arg0, class109[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field110[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field110[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2255(var3, var4);
                        }
                    }
                }
            }
        }
        field107 += (int) (Math.random() * 5.0D) - 2;
        if (field107 < -8) {
            field107 = -8;
        }
        if (field107 > 8) {
            field107 = 8;
        }
        field108 += (int) (Math.random() * 5.0D) - 2;
        if (field108 < -16) {
            field108 = -16;
        }
        if (field108 > 16) {
            field108 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2063[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field97[var6][var11 + 1][var10] - field97[var6][var11 - 1][var10];
                    int var13 = field97[var6][var11][var10 + 1] - field97[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field98[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field95[var20] = 0;
                Statics.field2668[var20] = 0;
                Statics.field2091[var20] = 0;
                Statics.field1636[var20] = 0;
                Statics.field1638[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field783[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class42 var25 = class42.method750(var24 - 1);
                            Statics.field95[var22] += var25.field984;
                            Statics.field2668[var22] += var25.field985;
                            Statics.field2091[var22] += var25.field986;
                            Statics.field1636[var22] += var25.field987;
                            var10002 = Statics.field1638[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field783[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class42 var28 = class42.method750(var27 - 1);
                            Statics.field95[var22] -= var28.field984;
                            Statics.field2668[var22] -= var28.field985;
                            Statics.field2091[var22] -= var28.field986;
                            Statics.field1636[var22] -= var28.field987;
                            var10002 = Statics.field1638[var22]--;
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
                            var29 += Statics.field95[var35];
                            var30 += Statics.field2668[var35];
                            var31 += Statics.field2091[var35];
                            var32 += Statics.field1636[var35];
                            var33 += Statics.field1638[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field95[var36];
                            var30 -= Statics.field2668[var36];
                            var31 -= Statics.field2091[var36];
                            var32 -= Statics.field1636[var36];
                            var33 -= Statics.field1638[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field414 || (field110[0][var21][var34] & 0x2) != 0 || (field110[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field109) {
                                field109 = var6;
                            }
                            int var37 = Statics.field783[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field94[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field97[var6][var21][var34];
                                int var40 = field97[var6][var21 + 1][var34];
                                int var41 = field97[var6][var21 + 1][var34 + 1];
                                int var42 = field97[var6][var21][var34 + 1];
                                int var43 = Statics.field98[var21][var34];
                                int var44 = Statics.field98[var21 + 1][var34];
                                int var45 = Statics.field98[var21 + 1][var34 + 1];
                                int var46 = Statics.field98[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method604(var49, var50, var51);
                                    int var52 = field107 + var49 & 0xFF;
                                    int var53 = field108 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method604(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field2148[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class47 var56 = (class47) class47.field1061.method3520((long) var55);
                                        class47 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field1062.method3127(4, var55);
                                            class47 var59 = new class47();
                                            if (var58 != null) {
                                                var59.method976(new class120(var58), var55);
                                            }
                                            var59.method982();
                                            class47.field1061.method3522(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field1068) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field73[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class92.field1591[method959(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1821(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method959(var47, var43), method959(var47, var44), method959(var47, var45), method959(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field2148[var6][var21][var34] + 1;
                                    byte var62 = Statics.field1986[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class47 var64 = (class47) class47.field1061.method3520((long) var63);
                                    class47 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field1062.method3127(4, var63);
                                        class47 var67 = new class47();
                                        if (var66 != null) {
                                            var67.method976(new class120(var66), var63);
                                        }
                                        var67.method982();
                                        class47.field1061.method3522(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field1063;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1592.method2030(var69);
                                        var71 = -1;
                                    } else if (var65.field1076 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method604(var65.field1067, var65.field1073, var65.field1078);
                                        int var72 = field107 + var65.field1067 & 0xFF;
                                        int var73 = field108 + var65.field1078;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method604(var72, var65.field1073, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class92.field1591[method699(var70, 96)];
                                    }
                                    if (var65.field1065 != -1) {
                                        int var75 = field107 + var65.field1069 & 0xFF;
                                        int var76 = field108 + var65.field1071;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method604(var75, var65.field1070, var76);
                                        var74 = class92.field1591[method699(var77, 96)];
                                    }
                                    arg0.method1821(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, method959(var47, var43), method959(var47, var44), method959(var47, var45), method959(var47, var46), method699(var71, var43), method699(var71, var44), method699(var71, var45), method699(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1791(var6, var79, var78, method50(var6, var79, var78));
                }
            }
            Statics.field783[var6] = (byte[][]) null;
            Statics.field94[var6] = (byte[][]) null;
            Statics.field2148[var6] = (byte[][]) null;
            Statics.field1986[var6] = (byte[][]) null;
            Statics.field2063[var6] = (byte[][]) null;
        }
        arg0.method1818(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field110[1][var80][var81] & 0x2) == 2) {
                    arg0.method1789(var80, var81);
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
                        if ((Statics.field73[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field73[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field73[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label355: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field73[var91 - 1][var88][var93] & var82) == 0) {
                                        break label355;
                                    }
                                }
                                var91--;
                            }
                            label344: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field73[var92 + 1][var88][var94] & var82) == 0) {
                                        break label344;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field97[var92][var88][var89] - var96;
                                int var98 = field97[var91][var88][var89];
                                class87.method1790(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field73[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field73[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field73[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field73[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label408: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field73[var103 - 1][var105][var87] & var83) == 0) {
                                        break label408;
                                    }
                                }
                                var103--;
                            }
                            label397: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field73[var104 + 1][var106][var87] & var83) == 0) {
                                        break label397;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field97[var104][var101][var87] - var108;
                                int var110 = field97[var103][var101][var87];
                                class87.method1790(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field73[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field73[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field73[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field73[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label461: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field73[var86][var113 - 1][var117] & var84) == 0) {
                                        break label461;
                                    }
                                }
                                var113--;
                            }
                            label450: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field73[var86][var114 + 1][var118] & var84) == 0) {
                                        break label450;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field97[var86][var113][var115];
                                class87.method1790(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field73[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.l(IIIS)I")
    public static int method50(int arg0, int arg1, int arg2) {
        if ((field110[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field110[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dq.z(IIII)I")
    public static final int method2295(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method868(var3, var5);
        int var8 = method868(var3 + 1, var5);
        int var9 = method868(var3, var5 + 1);
        int var10 = method868(var3 + 1, var5 + 1);
        int var11 = method1953(var7, var8, var4, arg2);
        int var12 = method1953(var9, var10, var4, arg2);
        return method1953(var11, var12, var6, arg2);
    }

    @ObfuscatedName("cm.s(IIIII)I")
    public static final int method1953(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class92.field1596[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("au.j(III)I")
    public static final int method868(int arg0, int arg1) {
        int var2 = method206(arg0 - 1, arg1 - 1) + method206(arg0 + 1, arg1 - 1) + method206(arg0 - 1, arg1 + 1) + method206(arg0 + 1, arg1 + 1);
        int var3 = method206(arg0 - 1, arg1) + method206(arg0 + 1, arg1) + method206(arg0, arg1 - 1) + method206(arg0, arg1 + 1);
        int var4 = method206(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("h.q(III)I")
    public static final int method206(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("at.a(III)I")
    public static final int method959(int arg0, int arg1) {
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

    @ObfuscatedName("ab.d(III)I")
    public static final int method699(int arg0, int arg1) {
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

    @ObfuscatedName("g.u(IIIB)I")
    public static final int method604(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ez.i(III)Z")
    public static final boolean method2862(int arg0, int arg1) {
        class41 var2 = class41.method589(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method806(arg1);
    }
}
