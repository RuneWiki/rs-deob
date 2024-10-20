package deob;

@ObfuscatedName("w")
public final class class6 {

    @ObfuscatedName("w.d")
    public static int[][][] field92 = new int[4][105][105];

    @ObfuscatedName("w.p")
    public static byte[][][] field91 = new byte[4][104][104];

    @ObfuscatedName("w.v")
    public static int field95 = 99;

    @ObfuscatedName("w.h")
    public static final int[] field89 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("w.i")
    public static final int[] field90 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("w.q")
    public static final int[] field80 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("w.r")
    public static final int[] field93 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("w.s")
    public static final int[] field97 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("w.g")
    public static final int[] field94 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("w.f")
    public static int field85 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("w.c")
    public static int field96 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.d(I)V")
    public static void method1959() {
        Statics.field3215 = (byte[][][]) null;
        Statics.field83 = (byte[][][]) null;
        Statics.field1096 = (byte[][][]) null;
        Statics.field1950 = (byte[][][]) null;
        Statics.field87 = (int[][][]) null;
        Statics.field84 = (byte[][][]) null;
        Statics.field99 = (int[][]) null;
        Statics.field2239 = null;
        Statics.field2037 = null;
        Statics.field86 = null;
        Statics.field2895 = null;
        Statics.field596 = null;
    }

    @ObfuscatedName("i.p(IIIII)V")
    public static final void method240(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field84[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field92[0][var5][var4] = field92[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field92[0][var5][var4] = field92[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field92[0][var5][var4] = field92[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field92[0][var5][var4] = field92[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bo.l(IIII)V")
    public static final void method1543(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field92[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field92[arg0][arg1][arg2 + var5] = field92[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field92[arg0][arg1 + var6][arg2] = field92[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field92[arg0][arg1 - 1][arg2] != 0) {
            field92[arg0][arg1][arg2] = field92[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field92[arg0][arg1][arg2 - 1] != 0) {
            field92[arg0][arg1][arg2] = field92[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field92[arg0][arg1 - 1][arg2 - 1] != 0) {
            field92[arg0][arg1][arg2] = field92[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("hp.y(Ldf;IIIIIIB)V")
    public static final void method3749(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2357();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2357();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2357();
                }
            }
            return;
        }
        field91[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2357();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field92[0][arg2][arg3] = -method720(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field92[arg1][arg2][arg3] = field92[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2357();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field92[0][arg2][arg3] = -var8 * 8;
                } else {
                    field92[arg1][arg2][arg3] = field92[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field83[arg1][arg2][arg3] = arg0.method2477();
                Statics.field1096[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1950[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field91[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3215[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cd.w([BIIB)Z")
    public static final boolean method2055(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2370();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2370();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2357() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method551(var5);
                        if (var13 != 22 || !client.field293 || var16.field942 != 0 || var16.field938 == 1 || var16.field966) {
                            if (!var16.method787()) {
                                client.field348++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2370();
                if (var9 == 0) {
                    break;
                }
                var4.method2357();
            }
        }
    }

    @ObfuscatedName("cj.u([BIILcc;[Ldl;I)V")
    public static final void method2042(byte[] arg0, int arg1, int arg2, class86 arg3, class108[] arg4) {
        class119 var5 = new class119(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2370();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2370();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2357();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field91[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class108 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("fy.a([BIIIIIIILcc;[Ldl;I)V")
    public static final void method3287(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class86 arg8, class108[] arg9) {
        class119 var10 = new class119(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2370();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2370();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2357();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class41 var21 = class41.method551(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field927;
                    int var27 = var21.field944;
                    if ((var20 & 0x1) == 1) {
                        int var28 = var26;
                        var26 = var27;
                        var27 = var28;
                    }
                    int var29 = arg7 & 0x3;
                    int var30;
                    if (var29 == 0) {
                        var30 = var23;
                    } else if (var29 == 1) {
                        var30 = var24;
                    } else if (var29 == 2) {
                        var30 = 7 - var23 - (var26 - 1);
                    } else {
                        var30 = 7 - var24 - (var27 - 1);
                    }
                    int var31 = arg2 + var30;
                    int var32 = arg3 + class177.method721(var16 & 0x7, var15 & 0x7, arg7, var21.field927, var21.field944, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field91[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class108 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method1(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.e(IIIIIILcc;Ldl;B)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field293 && (field91[0][arg1][arg2] & 0x2) == 0 && (field91[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field95) {
            field95 = arg0;
        }
        class41 var8 = class41.method551(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field944;
            var10 = var8.field927;
        } else {
            var9 = var8.field927;
            var10 = var8.field944;
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
        int[][] var15 = field92[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field942 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field968 == 1) {
            var20 += 256;
        }
        if (var8.method778()) {
            class24 var21 = new class24();
            var21.field603 = arg0;
            var21.field604 = arg1 * 128;
            var21.field605 = arg2 * 128;
            int var22 = var8.field927;
            int var23 = var8.field944;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field944;
                var23 = var8.field927;
            }
            var21.field602 = (arg1 + var22) * 128;
            var21.field608 = (arg2 + var23) * 128;
            var21.field616 = var8.field972;
            var21.field617 = var8.field973 * 128;
            var21.field611 = var8.field934;
            var21.field612 = var8.field975;
            var21.field606 = var8.field950;
            if (var8.field945 != null) {
                var21.field619 = var8;
                var21.method570();
            }
            class24.field614.method3633(var21);
            if (var21.field606 != null) {
                var21.field607 = var21.field611 + (int) (Math.random() * (double) (var21.field612 - var21.field611));
            }
        }
        if (arg5 == 22) {
            if (!client.field293 || var8.field942 != 0 || var8.field938 == 1 || var8.field966) {
                class85 var24;
                if (var8.field951 == -1 && var8.field945 == null) {
                    var24 = var8.method772(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
                }
                arg6.method1775(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field938 == 1 && arg7 != null) {
                    arg7.method2245(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field951 == -1 && var8.field945 == null) {
                var47 = var8.method772(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            if (var47 != null && arg6.method1779(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field959) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2159() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field84[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field84[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2243(arg1, arg2, var9, var10, var8.field969);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field951 == -1 && var8.field945 == null) {
                var25 = var8.method772(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1779(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field87[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2243(arg1, arg2, var9, var10, var8.field969);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field951 == -1 && var8.field945 == null) {
                var26 = var8.method772(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1777(arg0, arg1, arg2, var16, var26, (class85) null, field89[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field959) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field930) {
                    Statics.field87[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field959) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field930) {
                    Statics.field87[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field959) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field930) {
                    Statics.field87[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field959) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field930) {
                    Statics.field87[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2252(arg1, arg2, arg5, arg4, var8.field969);
            }
            if (var8.field952 != 16) {
                arg6.method1785(arg0, arg1, arg2, var8.field952);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field951 == -1 && var8.field945 == null) {
                var27 = var8.method772(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1777(arg0, arg1, arg2, var16, var27, (class85) null, field90[arg4], 0, var19, var20);
            if (var8.field959) {
                if (arg4 == 0) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2252(arg1, arg2, arg5, arg4, var8.field969);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field951 == -1 && var8.field945 == null) {
                var29 = var8.method772(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method772(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field951, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1777(arg0, arg1, arg2, var16, var29, var30, field89[arg4], field89[var28], var19, var20);
            if (var8.field930) {
                if (arg4 == 0) {
                    Statics.field87[arg0][arg1][arg2] |= 0x249;
                    Statics.field87[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field87[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field87[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field87[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field87[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field87[arg0][arg1][arg2] |= 0x492;
                    Statics.field87[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2252(arg1, arg2, arg5, arg4, var8.field969);
            }
            if (var8.field952 != 16) {
                arg6.method1785(arg0, arg1, arg2, var8.field952);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field951 == -1 && var8.field945 == null) {
                var31 = var8.method772(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1777(arg0, arg1, arg2, var16, var31, (class85) null, field90[arg4], 0, var19, var20);
            if (var8.field959) {
                if (arg4 == 0) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2252(arg1, arg2, arg5, arg4, var8.field969);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field951 == -1 && var8.field945 == null) {
                var32 = var8.method772(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1779(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2243(arg1, arg2, var9, var10, var8.field969);
            }
            if (var8.field952 != 16) {
                arg6.method1785(arg0, arg1, arg2, var8.field952);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field951 == -1 && var8.field945 == null) {
                var33 = var8.method772(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var33, (class85) null, field89[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1876(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method551(var35 >> 14 & 0x7FFF).field952;
            }
            class85 var36;
            if (var8.field951 == -1 && var8.field945 == null) {
                var36 = var8.method772(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var36, (class85) null, field89[arg4], 0, field80[arg4] * var34, field93[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1876(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method551(var38 >> 14 & 0x7FFF).field952 / 2;
            }
            class85 var39;
            if (var8.field951 == -1 && var8.field945 == null) {
                var39 = var8.method772(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field97[arg4] * var37, field94[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field951 == -1 && var8.field945 == null) {
                var41 = var8.method772(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1876(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method551(var43 >> 14 & 0x7FFF).field952 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field951 == -1 && var8.field945 == null) {
                var45 = var8.method772(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method772(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field951, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field951, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field97[arg4] * var42, field94[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("eo.b(IIII)I")
    public static int method2962(int arg0, int arg1, int arg2) {
        if ((field91[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field91[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("aj.o(III)I")
    public static final int method720(int arg0, int arg1) {
        int var2 = method3244(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3244(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3244(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("fg.m(IIII)I")
    public static final int method3244(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method165(var3, var5);
        int var8 = method165(var3 + 1, var5);
        int var9 = method165(var3, var5 + 1);
        int var10 = method165(var3 + 1, var5 + 1);
        int var11 = method40(var7, var8, var4, arg2);
        int var12 = method40(var9, var10, var4, arg2);
        return method40(var11, var12, var6, arg2);
    }

    @ObfuscatedName("l.x(IIIII)I")
    public static final int method40(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1575[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("n.k(III)I")
    public static final int method165(int arg0, int arg1) {
        int var2 = method939(arg0 - 1, arg1 - 1) + method939(arg0 + 1, arg1 - 1) + method939(arg0 - 1, arg1 + 1) + method939(arg0 + 1, arg1 + 1);
        int var3 = method939(arg0 - 1, arg1) + method939(arg0 + 1, arg1) + method939(arg0, arg1 - 1) + method939(arg0, arg1 + 1);
        int var4 = method939(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("av.n(IIB)I")
    public static final int method939(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("fm.j(IIB)I")
    public static final int method3084(int arg0, int arg1) {
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

    @ObfuscatedName("n.t(III)I")
    public static final int method168(int arg0, int arg1) {
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

    @ObfuscatedName("ed.z(IIII)I")
    public static final int method2727(int arg0, int arg1, int arg2) {
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
