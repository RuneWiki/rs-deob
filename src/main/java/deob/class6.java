package deob;

@ObfuscatedName("c")
public final class class6 {

    @ObfuscatedName("c.h")
    public static int[][][] field80 = new int[4][105][105];

    @ObfuscatedName("c.m")
    public static byte[][][] field79 = new byte[4][104][104];

    @ObfuscatedName("c.i")
    public static int field94 = 99;

    @ObfuscatedName("c.t")
    public static final int[] field78 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.z")
    public static final int[] field88 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.r")
    public static final int[] field89 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.d")
    public static final int[] field90 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.n")
    public static final int[] field91 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.j")
    public static final int[] field83 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.b")
    public static int field93 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.e")
    public static int field87 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.h(IIIIB)V")
    public static final void method180(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field84[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field80[0][var5][var4] = field80[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field80[0][var5][var4] = field80[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field80[0][var5][var4] = field80[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field80[0][var5][var4] = field80[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cz.m(IIIB)V")
    public static final void method1750(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field80[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field80[arg0][arg1][arg2 + var5] = field80[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field80[arg0][arg1 + var6][arg2] = field80[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field80[arg0][arg1 - 1][arg2] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field80[arg0][arg1][arg2 - 1] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field80[arg0][arg1 - 1][arg2 - 1] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("fx.i(Ldp;IIIIIII)V")
    public static final void method3208(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2320();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2320();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2320();
                }
            }
            return;
        }
        field79[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2320();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field80[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method154(var10 + 45365, var11 + 91923, 4) - 128 + (method154(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method154(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field80[arg1][arg2][arg3] = field80[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2320();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field80[0][arg2][arg3] = -var15 * 8;
                } else {
                    field80[arg1][arg2][arg3] = field80[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field82[arg1][arg2][arg3] = arg0.method2425();
                Statics.field2089[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field85[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field79[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field81[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("gn.q([BIIS)Z")
    public static final boolean method3455(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2332();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2332();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2320() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method961(var5);
                        if (var13 != 22 || !client.field291 || var16.field948 != 0 || var16.field946 == 1 || var16.field939) {
                            if (!var16.method762()) {
                                client.field343++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2332();
                if (var9 == 0) {
                    break;
                }
                var4.method2320();
            }
        }
    }

    @ObfuscatedName("i.p([BIILci;[Ldl;I)V")
    public static final void method32(byte[] arg0, int arg1, int arg2, class86 arg3, class108[] arg4) {
        class119 var5 = new class119(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2332();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2332();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2320();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field79[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class108 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1559(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bn.c(IIIIIILci;Ldl;B)V")
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field291 && (field79[0][arg1][arg2] & 0x2) == 0 && (field79[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field94) {
            field94 = arg0;
        }
        class41 var8 = class41.method961(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field945;
            var10 = var8.field962;
        } else {
            var9 = var8.field962;
            var10 = var8.field945;
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
        int[][] var15 = field80[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field948 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field967 == 1) {
            var20 += 256;
        }
        if (var8.method767()) {
            class24 var21 = new class24();
            var21.field602 = arg0;
            var21.field603 = arg1 * 128;
            var21.field614 = arg2 * 128;
            int var22 = var8.field962;
            int var23 = var8.field945;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field945;
                var23 = var8.field962;
            }
            var21.field608 = (arg1 + var22) * 128;
            var21.field604 = (arg2 + var23) * 128;
            var21.field619 = var8.field973;
            var21.field605 = var8.field941 * 128;
            var21.field610 = var8.field953;
            var21.field611 = var8.field937;
            var21.field615 = var8.field977;
            if (var8.field970 != null) {
                var21.field606 = var8;
                var21.method568();
            }
            class24.field607.method3541(var21);
            if (var21.field615 != null) {
                var21.field613 = var21.field610 + (int) (Math.random() * (double) (var21.field611 - var21.field610));
            }
        }
        if (arg5 == 22) {
            if (!client.field291 || var8.field948 != 0 || var8.field946 == 1 || var8.field939) {
                class85 var24;
                if (var8.field976 == -1 && var8.field970 == null) {
                    var24 = var8.method763(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
                }
                arg6.method1840(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field946 == 1 && arg7 != null) {
                    arg7.method2206(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field976 == -1 && var8.field970 == null) {
                var47 = var8.method763(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            if (var47 != null && arg6.method1765(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field960) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2123() / 4;
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
            if (var8.field946 != 0 && arg7 != null) {
                arg7.method2220(arg1, arg2, var9, var10, var8.field947);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field976 == -1 && var8.field970 == null) {
                var25 = var8.method763(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2174[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field946 != 0 && arg7 != null) {
                arg7.method2220(arg1, arg2, var9, var10, var8.field947);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field976 == -1 && var8.field970 == null) {
                var26 = var8.method763(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1891(arg0, arg1, arg2, var16, var26, (class85) null, field78[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field960) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field951) {
                    Statics.field2174[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field960) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field951) {
                    Statics.field2174[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field960) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field951) {
                    Statics.field2174[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field960) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field951) {
                    Statics.field2174[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field946 != 0 && arg7 != null) {
                arg7.method2203(arg1, arg2, arg5, arg4, var8.field947);
            }
            if (var8.field969 != 16) {
                arg6.method1771(arg0, arg1, arg2, var8.field969);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field976 == -1 && var8.field970 == null) {
                var27 = var8.method763(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1891(arg0, arg1, arg2, var16, var27, (class85) null, field88[arg4], 0, var19, var20);
            if (var8.field960) {
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
            if (var8.field946 != 0 && arg7 != null) {
                arg7.method2203(arg1, arg2, arg5, arg4, var8.field947);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field976 == -1 && var8.field970 == null) {
                var29 = var8.method763(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method763(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field976, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1891(arg0, arg1, arg2, var16, var29, var30, field78[arg4], field78[var28], var19, var20);
            if (var8.field951) {
                if (arg4 == 0) {
                    Statics.field2174[arg0][arg1][arg2] |= 0x249;
                    Statics.field2174[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2174[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2174[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2174[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2174[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2174[arg0][arg1][arg2] |= 0x492;
                    Statics.field2174[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field946 != 0 && arg7 != null) {
                arg7.method2203(arg1, arg2, arg5, arg4, var8.field947);
            }
            if (var8.field969 != 16) {
                arg6.method1771(arg0, arg1, arg2, var8.field969);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field976 == -1 && var8.field970 == null) {
                var31 = var8.method763(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1891(arg0, arg1, arg2, var16, var31, (class85) null, field88[arg4], 0, var19, var20);
            if (var8.field960) {
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
            if (var8.field946 != 0 && arg7 != null) {
                arg7.method2203(arg1, arg2, arg5, arg4, var8.field947);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field976 == -1 && var8.field970 == null) {
                var32 = var8.method763(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field946 != 0 && arg7 != null) {
                arg7.method2220(arg1, arg2, var9, var10, var8.field947);
            }
            if (var8.field969 != 16) {
                arg6.method1771(arg0, arg1, arg2, var8.field969);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field976 == -1 && var8.field970 == null) {
                var33 = var8.method763(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1869(arg0, arg1, arg2, var16, var33, (class85) null, field78[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1781(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method961(var35 >> 14 & 0x7FFF).field969;
            }
            class85 var36;
            if (var8.field976 == -1 && var8.field970 == null) {
                var36 = var8.method763(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1869(arg0, arg1, arg2, var16, var36, (class85) null, field78[arg4], 0, field89[arg4] * var34, field90[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1781(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method961(var38 >> 14 & 0x7FFF).field969 / 2;
            }
            class85 var39;
            if (var8.field976 == -1 && var8.field970 == null) {
                var39 = var8.method763(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1869(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field91[arg4] * var37, field83[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field976 == -1 && var8.field970 == null) {
                var41 = var8.method763(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1869(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1781(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method961(var43 >> 14 & 0x7FFF).field969 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field976 == -1 && var8.field970 == null) {
                var45 = var8.method763(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method763(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field976, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field976, true, (class85) null);
            }
            arg6.method1869(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field91[arg4] * var42, field83[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cs.f(Lci;[Ldl;I)V")
    public static final void method1938(class86 arg0, class108[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field79[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field79[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2205(var3, var4);
                        }
                    }
                }
            }
        }
        field93 += (int) (Math.random() * 5.0D) - 2;
        if (field93 < -8) {
            field93 = -8;
        }
        if (field93 > 8) {
            field93 = 8;
        }
        field87 += (int) (Math.random() * 5.0D) - 2;
        if (field87 < -16) {
            field87 = -16;
        }
        if (field87 > 16) {
            field87 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field84[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field80[var6][var11 + 1][var10] - field80[var6][var11 - 1][var10];
                    int var13 = field80[var6][var11][var10 + 1] - field80[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1363[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field190[var20] = 0;
                Statics.field2049[var20] = 0;
                Statics.field92[var20] = 0;
                Statics.field86[var20] = 0;
                Statics.field1966[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field81[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class42 var26 = (class42) class42.field980.method3472((long) var25);
                            class42 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field981.method3051(1, var25);
                                class42 var29 = new class42();
                                if (var28 != null) {
                                    var29.method804(new class119(var28), var25);
                                }
                                var29.method803();
                                class42.field980.method3474(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field190[var22] += var27.field984;
                            Statics.field2049[var22] += var27.field983;
                            Statics.field92[var22] += var27.field985;
                            Statics.field86[var22] += var27.field986;
                            var10002 = Statics.field1966[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field81[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class42 var34 = (class42) class42.field980.method3472((long) var33);
                            class42 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field981.method3051(1, var33);
                                class42 var37 = new class42();
                                if (var36 != null) {
                                    var37.method804(new class119(var36), var33);
                                }
                                var37.method803();
                                class42.field980.method3474(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field190[var22] -= var35.field984;
                            Statics.field2049[var22] -= var35.field983;
                            Statics.field92[var22] -= var35.field985;
                            Statics.field86[var22] -= var35.field986;
                            var10002 = Statics.field1966[var22]--;
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
                            var39 += Statics.field190[var45];
                            var40 += Statics.field2049[var45];
                            var41 += Statics.field92[var45];
                            var42 += Statics.field86[var45];
                            var43 += Statics.field1966[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field190[var46];
                            var40 -= Statics.field2049[var46];
                            var41 -= Statics.field92[var46];
                            var42 -= Statics.field86[var46];
                            var43 -= Statics.field1966[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field291 || (field79[0][var21][var44] & 0x2) != 0 || (field79[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field94) {
                                field94 = var6;
                            }
                            int var47 = Statics.field81[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field82[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field80[var6][var21][var44];
                                int var50 = field80[var6][var21 + 1][var44];
                                int var51 = field80[var6][var21 + 1][var44 + 1];
                                int var52 = field80[var6][var21][var44 + 1];
                                int var53 = Statics.field1363[var21][var44];
                                int var54 = Statics.field1363[var21 + 1][var44];
                                int var55 = Statics.field1363[var21 + 1][var44 + 1];
                                int var56 = Statics.field1363[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method615(var59, var60, var61);
                                    int var62 = field93 + var59 & 0xFF;
                                    int var63 = field87 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method615(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field2089[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class47 var66 = (class47) class47.field1065.method3472((long) var65);
                                        class47 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field1055.method3051(4, var65);
                                            class47 var69 = new class47();
                                            if (var68 != null) {
                                                var69.method913(new class119(var68), var65);
                                            }
                                            var69.method912();
                                            class47.field1065.method3474(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field1060) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field2174[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class91.field1580[method620(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1814(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method620(var57, var53), method620(var57, var54), method620(var57, var55), method620(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field2089[var6][var21][var44] + 1;
                                    byte var72 = Statics.field85[var6][var21][var44];
                                    class47 var73 = class47.method801(var48 - 1);
                                    int var74 = var73.field1057;
                                    int var75;
                                    int var76;
                                    if (var74 >= 0) {
                                        var75 = Statics.field1576.method1994(var74);
                                        var76 = -1;
                                    } else if (var73.field1056 == 16711935) {
                                        var76 = -2;
                                        var74 = -1;
                                        var75 = -2;
                                    } else {
                                        var76 = method615(var73.field1068, var73.field1061, var73.field1062);
                                        int var77 = field93 + var73.field1068 & 0xFF;
                                        int var78 = field87 + var73.field1062;
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        var75 = method615(var77, var73.field1061, var78);
                                    }
                                    int var79 = 0;
                                    if (var75 != -2) {
                                        var79 = class91.field1580[method38(var75, 96)];
                                    }
                                    if (var73.field1059 != -1) {
                                        int var80 = field93 + var73.field1054 & 0xFF;
                                        int var81 = field87 + var73.field1058;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        int var82 = method615(var80, var73.field1064, var81);
                                        var79 = class91.field1580[method38(var82, 96)];
                                    }
                                    arg0.method1814(var6, var21, var44, var71, var72, var74, var49, var50, var51, var52, method620(var57, var53), method620(var57, var54), method620(var57, var55), method620(var57, var56), method38(var76, var53), method38(var76, var54), method38(var76, var55), method38(var76, var56), var70, var79);
                                }
                            }
                        }
                    }
                }
            }
            for (int var83 = 1; var83 < 103; var83++) {
                for (int var84 = 1; var84 < 103; var84++) {
                    int var89;
                    if ((field79[var6][var84][var83] & 0x8) != 0) {
                        var89 = 0;
                    } else if (var6 <= 0 || (field79[1][var84][var83] & 0x2) == 0) {
                        var89 = var6;
                    } else {
                        var89 = var6 - 1;
                    }
                    arg0.method1759(var6, var84, var83, var89);
                }
            }
            Statics.field81[var6] = (byte[][]) null;
            Statics.field82[var6] = (byte[][]) null;
            Statics.field2089[var6] = (byte[][]) null;
            Statics.field85[var6] = (byte[][]) null;
            Statics.field84[var6] = (byte[][]) null;
        }
        arg0.method1786(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field79[1][var90][var91] & 0x2) == 2) {
                    arg0.method1825(var90, var91);
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
                        if ((Statics.field2174[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field2174[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field2174[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label370: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field2174[var101 - 1][var98][var103] & var92) == 0) {
                                        break label370;
                                    }
                                }
                                var101--;
                            }
                            label359: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field2174[var102 + 1][var98][var104] & var92) == 0) {
                                        break label359;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field80[var102][var98][var99] - var106;
                                int var108 = field80[var101][var98][var99];
                                class86.method1758(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field2174[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2174[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field2174[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field2174[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label423: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field2174[var113 - 1][var115][var97] & var93) == 0) {
                                        break label423;
                                    }
                                }
                                var113--;
                            }
                            label412: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field2174[var114 + 1][var116][var97] & var93) == 0) {
                                        break label412;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field80[var114][var111][var97] - var118;
                                int var120 = field80[var113][var111][var97];
                                class86.method1758(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field2174[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2174[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field2174[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field2174[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label476: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field2174[var96][var123 - 1][var127] & var94) == 0) {
                                        break label476;
                                    }
                                }
                                var123--;
                            }
                            label465: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field2174[var96][var124 + 1][var128] & var94) == 0) {
                                        break label465;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field80[var96][var123][var125];
                                class86.method1758(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field2174[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.y(IIIB)I")
    public static final int method154(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method799(var3, var5);
        int var8 = method799(var3 + 1, var5);
        int var9 = method799(var3, var5 + 1);
        int var10 = method799(var3 + 1, var5 + 1);
        int var11 = method2793(var7, var8, var4, arg2);
        int var12 = method2793(var9, var10, var4, arg2);
        return method2793(var11, var12, var6, arg2);
    }

    @ObfuscatedName("em.w(IIIIB)I")
    public static final int method2793(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1585[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ae.l(III)I")
    public static final int method799(int arg0, int arg1) {
        int var2 = method668(arg0 - 1, arg1 - 1) + method668(arg0 + 1, arg1 - 1) + method668(arg0 - 1, arg1 + 1) + method668(arg0 + 1, arg1 + 1);
        int var3 = method668(arg0 - 1, arg1) + method668(arg0 + 1, arg1) + method668(arg0, arg1 - 1) + method668(arg0, arg1 + 1);
        int var4 = method668(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ap.v(III)I")
    public static final int method668(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ab.k(III)I")
    public static final int method620(int arg0, int arg1) {
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

    @ObfuscatedName("q.o(IIB)I")
    public static final int method38(int arg0, int arg1) {
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

    @ObfuscatedName("af.u(IIII)I")
    public static final int method615(int arg0, int arg1, int arg2) {
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
