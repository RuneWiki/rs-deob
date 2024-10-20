package deob;

@ObfuscatedName("bk")
public final class class62 {

    @ObfuscatedName("bk.b")
    public static int[][][] field709 = new int[4][105][105];

    @ObfuscatedName("bk.s")
    public static byte[][][] field713 = new byte[4][104][104];

    @ObfuscatedName("bk.r")
    public static int field706 = 99;

    @ObfuscatedName("bk.y")
    public static final int[] field710 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bk.p")
    public static final int[] field711 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bk.i")
    public static final int[] field705 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bk.l")
    public static final int[] field722 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bk.z")
    public static final int[] field714 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bk.e")
    public static final int[] field715 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bk.v")
    public static int field716 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bk.w")
    public static int field717 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.b(IIIII)V")
    public static final void method1618(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2441[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field709[0][var5][var4] = field709[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field709[0][var5][var4] = field709[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field709[0][var5][var4] = field709[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field709[0][var5][var4] = field709[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.s(Lfs;IIIIIIB)V")
    public static final void method596(class181 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2945();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2945();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2945();
                }
            }
            return;
        }
        field713[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2945();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field709[0][arg2][arg3] = -Statics.method639(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field709[arg1][arg2][arg3] = field709[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2945();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field709[0][arg2][arg3] = -var8 * 8;
                } else {
                    field709[arg1][arg2][arg3] = field709[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field475[arg1][arg2][arg3] = arg0.method2946();
                Statics.field703[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field297[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field713[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3205[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("hr.r([BIII)Z")
    public static final boolean method3658(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class181 var4 = new class181(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3086();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3086();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2945() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class263 var16 = class263.method2851(var5);
                        if (var13 != 22 || !client.field868 || var16.field3487 != 0 || var16.field3515 == 1 || var16.field3525) {
                            if (!var16.method4244()) {
                                client.field915++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3086();
                if (var9 == 0) {
                    break;
                }
                var4.method2945();
            }
        }
    }

    @ObfuscatedName("x.g([BIIIIIIILeo;[Lfy;I)V")
    public static final void method7(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class139 arg8, class163[] arg9) {
        class181 var10 = new class181(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3086();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3086();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2945();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class263 var21 = class263.method2851(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3502;
                    int var27 = var21.field3503;
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
                    int var33 = var16 & 0x7;
                    int var34 = var15 & 0x7;
                    int var36 = var21.field3502;
                    int var37 = var21.field3503;
                    if ((var20 & 0x1) == 1) {
                        int var38 = var36;
                        var36 = var37;
                        var37 = var38;
                    }
                    int var39 = arg7 & 0x3;
                    int var40;
                    if (var39 == 0) {
                        var40 = var34;
                    } else if (var39 == 1) {
                        var40 = 7 - var33 - (var36 - 1);
                    } else if (var39 == 2) {
                        var40 = 7 - var34 - (var37 - 1);
                    } else {
                        var40 = var33;
                    }
                    int var41 = arg3 + var40;
                    if (var31 > 0 && var41 > 0 && var31 < 103 && var41 < 103) {
                        int var42 = arg1;
                        if ((field713[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class163 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method153(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.x(IIIIIILeo;Lfy;B)V")
    public static final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class139 arg6, class163 arg7) {
        if (client.field868 && (field713[0][arg1][arg2] & 0x2) == 0 && (field713[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field706) {
            field706 = arg0;
        }
        class263 var8 = class263.method2851(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3503;
            var10 = var8.field3502;
        } else {
            var9 = var8.field3502;
            var10 = var8.field3503;
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
        int[][] var15 = field709[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3487 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3522 == 1) {
            var20 += 256;
        }
        if (var8.method4236()) {
            class82.method599(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field868 || var8.field3487 != 0 || var8.field3515 == 1 || var8.field3525) {
                class141 var21;
                if (var8.field3498 == -1 && var8.field3528 == null) {
                    var21 = var8.method4214(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class99(arg3, 22, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
                }
                arg6.method2495(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3515 == 1 && arg7 != null) {
                    arg7.method2819(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class141 var44;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var44 = var8.method4214(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class99(arg3, 10, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            if (var44 != null && arg6.method2499(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3518) {
                int var45 = 15;
                if (var44 instanceof class133) {
                    var45 = ((class133) var44).method2314() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2441[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2441[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3515 != 0 && arg7 != null) {
                arg7.method2806(arg1, arg2, var9, var10, var8.field3505);
            }
        } else if (arg5 >= 12) {
            class141 var22;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var22 = var8.method4214(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2499(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field369[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3515 != 0 && arg7 != null) {
                arg7.method2806(arg1, arg2, var9, var10, var8.field3505);
            }
        } else if (arg5 == 0) {
            class141 var23;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var23 = var8.method4214(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class99(arg3, 0, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2497(arg0, arg1, arg2, var16, var23, (class141) null, field710[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3518) {
                    Statics.field2441[arg0][arg1][arg2] = 50;
                    Statics.field2441[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3509) {
                    Statics.field369[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3518) {
                    Statics.field2441[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2441[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3509) {
                    Statics.field369[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3518) {
                    Statics.field2441[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2441[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3509) {
                    Statics.field369[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3518) {
                    Statics.field2441[arg0][arg1][arg2] = 50;
                    Statics.field2441[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3509) {
                    Statics.field369[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3515 != 0 && arg7 != null) {
                arg7.method2814(arg1, arg2, arg5, arg4, var8.field3505);
            }
            if (var8.field3516 != 16) {
                arg6.method2505(arg0, arg1, arg2, var8.field3516);
            }
        } else if (arg5 == 1) {
            class141 var24;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var24 = var8.method4214(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class99(arg3, 1, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2497(arg0, arg1, arg2, var16, var24, (class141) null, field711[arg4], 0, var19, var20);
            if (var8.field3518) {
                if (arg4 == 0) {
                    Statics.field2441[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2441[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2441[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2441[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3515 != 0 && arg7 != null) {
                arg7.method2814(arg1, arg2, arg5, arg4, var8.field3505);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class141 var26;
            class141 var27;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var26 = var8.method4214(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4214(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class99(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
                var27 = new class99(arg3, 2, var25, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2497(arg0, arg1, arg2, var16, var26, var27, field710[arg4], field710[var25], var19, var20);
            if (var8.field3509) {
                if (arg4 == 0) {
                    Statics.field369[arg0][arg1][arg2] |= 0x249;
                    Statics.field369[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field369[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field369[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field369[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field369[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field369[arg0][arg1][arg2] |= 0x492;
                    Statics.field369[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3515 != 0 && arg7 != null) {
                arg7.method2814(arg1, arg2, arg5, arg4, var8.field3505);
            }
            if (var8.field3516 != 16) {
                arg6.method2505(arg0, arg1, arg2, var8.field3516);
            }
        } else if (arg5 == 3) {
            class141 var28;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var28 = var8.method4214(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class99(arg3, 3, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2497(arg0, arg1, arg2, var16, var28, (class141) null, field711[arg4], 0, var19, var20);
            if (var8.field3518) {
                if (arg4 == 0) {
                    Statics.field2441[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2441[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2441[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2441[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3515 != 0 && arg7 != null) {
                arg7.method2814(arg1, arg2, arg5, arg4, var8.field3505);
            }
        } else if (arg5 == 9) {
            class141 var29;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var29 = var8.method4214(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2499(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3515 != 0 && arg7 != null) {
                arg7.method2806(arg1, arg2, var9, var10, var8.field3505);
            }
            if (var8.field3516 != 16) {
                arg6.method2505(arg0, arg1, arg2, var8.field3516);
            }
        } else if (arg5 == 4) {
            class141 var30;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var30 = var8.method4214(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2498(arg0, arg1, arg2, var16, var30, (class141) null, field710[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2515(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class263.method2851(var32 >> 14 & 0x7FFF).field3516;
            }
            class141 var33;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var33 = var8.method4214(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2498(arg0, arg1, arg2, var16, var33, (class141) null, field710[arg4], 0, field705[arg4] * var31, field722[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2515(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class263.method2851(var35 >> 14 & 0x7FFF).field3516 / 2;
            }
            class141 var36;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var36 = var8.method4214(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2498(arg0, arg1, arg2, var16, var36, (class141) null, 256, arg4, field714[arg4] * var34, field715[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class141 var38;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var38 = var8.method4214(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class99(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2498(arg0, arg1, arg2, var16, var38, (class141) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2515(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class263.method2851(var40 >> 14 & 0x7FFF).field3516 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class141 var42;
            class141 var43;
            if (var8.field3498 == -1 && var8.field3528 == null) {
                var42 = var8.method4214(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4214(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
                var43 = new class99(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3498, true, (class141) null);
            }
            arg6.method2498(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field714[arg4] * var39, field715[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("e.f(Leo;[Lfy;I)V")
    public static final void method155(class139 arg0, class163[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field713[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field713[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2808(var3, var4);
                        }
                    }
                }
            }
        }
        field716 += (int) (Math.random() * 5.0D) - 2;
        if (field716 < -8) {
            field716 = -8;
        }
        if (field716 > 8) {
            field716 = 8;
        }
        field717 += (int) (Math.random() * 5.0D) - 2;
        if (field717 < -16) {
            field717 = -16;
        }
        if (field717 > 16) {
            field717 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2441[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field709[var6][var11 + 1][var10] - field709[var6][var11 - 1][var10];
                    int var13 = field709[var6][var11][var10 + 1] - field709[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field704[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field707[var20] = 0;
                Statics.field708[var20] = 0;
                Statics.field720[var20] = 0;
                Statics.field556[var20] = 0;
                Statics.field1681[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field3205[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class254 var25 = class254.method3676(var24 - 1);
                            Statics.field707[var22] += var25.field3394;
                            Statics.field708[var22] += var25.field3395;
                            Statics.field720[var22] += var25.field3399;
                            Statics.field556[var22] += var25.field3397;
                            var10002 = Statics.field1681[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field3205[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class254 var28 = class254.method3676(var27 - 1);
                            Statics.field707[var22] -= var28.field3394;
                            Statics.field708[var22] -= var28.field3395;
                            Statics.field720[var22] -= var28.field3399;
                            Statics.field556[var22] -= var28.field3397;
                            var10002 = Statics.field1681[var22]--;
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
                            var29 += Statics.field707[var35];
                            var30 += Statics.field708[var35];
                            var31 += Statics.field720[var35];
                            var32 += Statics.field556[var35];
                            var33 += Statics.field1681[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field707[var36];
                            var30 -= Statics.field708[var36];
                            var31 -= Statics.field720[var36];
                            var32 -= Statics.field556[var36];
                            var33 -= Statics.field1681[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field868 || (field713[0][var21][var34] & 0x2) != 0 || (field713[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field706) {
                                field706 = var6;
                            }
                            int var37 = Statics.field3205[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field475[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field709[var6][var21][var34];
                                int var40 = field709[var6][var21 + 1][var34];
                                int var41 = field709[var6][var21 + 1][var34 + 1];
                                int var42 = field709[var6][var21][var34 + 1];
                                int var43 = Statics.field704[var21][var34];
                                int var44 = Statics.field704[var21 + 1][var34];
                                int var45 = Statics.field704[var21 + 1][var34 + 1];
                                int var46 = Statics.field704[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method134(var49, var50, var51);
                                    int var52 = field716 + var49 & 0xFF;
                                    int var53 = field717 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method134(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field703[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class267.method2853(var38 - 1).field3642) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field369[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class136.field1937[method1941(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2597(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method1941(var47, var43), method1941(var47, var44), method1941(var47, var45), method1941(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field703[var6][var21][var34] + 1;
                                    byte var57 = Statics.field297[var6][var21][var34];
                                    class267 var58 = class267.method2853(var38 - 1);
                                    int var59 = var58.field3641;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1938.method2192(var59);
                                        var61 = -1;
                                    } else if (var58.field3640 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method134(var58.field3644, var58.field3638, var58.field3643);
                                        int var62 = field716 + var58.field3644 & 0xFF;
                                        int var63 = field717 + var58.field3643;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method134(var62, var58.field3638, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class136.field1937[method3793(var60, 96)];
                                    }
                                    if (var58.field3645 != -1) {
                                        int var65 = field716 + var58.field3647 & 0xFF;
                                        int var66 = field717 + var58.field3649;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method134(var65, var58.field3648, var66);
                                        var64 = class136.field1937[method3793(var67, 96)];
                                    }
                                    arg0.method2597(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method1941(var47, var43), method1941(var47, var44), method1941(var47, var45), method1941(var47, var46), method3793(var61, var43), method3793(var61, var44), method3793(var61, var45), method3793(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field713[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field713[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2537(var6, var69, var68, var74);
                }
            }
            Statics.field3205[var6] = (byte[][]) null;
            Statics.field475[var6] = (byte[][]) null;
            Statics.field703[var6] = (byte[][]) null;
            Statics.field297[var6] = (byte[][]) null;
            Statics.field2441[var6] = (byte[][]) null;
        }
        arg0.method2549(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field713[1][var75][var76] & 0x2) == 2) {
                    arg0.method2557(var75, var76);
                }
            }
        }
        int var77 = 1;
        int var78 = 2;
        int var79 = 4;
        for (int var80 = 0; var80 < 4; var80++) {
            if (var80 > 0) {
                var77 <<= 0x3;
                var78 <<= 0x3;
                var79 <<= 0x3;
            }
            for (int var81 = 0; var81 <= var80; var81++) {
                for (int var82 = 0; var82 <= 104; var82++) {
                    for (int var83 = 0; var83 <= 104; var83++) {
                        if ((Statics.field369[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field369[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field369[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field369[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field369[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field709[var87][var83][var84] - var91;
                                int var93 = field709[var86][var83][var84];
                                class139.method2492(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field369[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field369[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field369[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field369[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field369[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field369[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field709[var99][var96][var82] - var103;
                                int var105 = field709[var98][var96][var82];
                                class139.method2492(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field369[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field369[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field369[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field369[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field369[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field369[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field709[var81][var108][var110];
                                class139.method2492(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field369[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.t(IIIB)I")
    public static final int method142(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method143(var3, var5);
        int var8 = method143(var3 + 1, var5);
        int var9 = method143(var3, var5 + 1);
        int var10 = method143(var3 + 1, var5 + 1);
        int var11 = method2487(var7, var8, var4, arg2);
        int var12 = method2487(var9, var10, var4, arg2);
        return method2487(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ei.k(IIIII)I")
    public static final int method2487(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class136.field1942[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("l.n(IIB)I")
    public static final int method143(int arg0, int arg1) {
        int var2 = Statics.method11(arg0 - 1, arg1 - 1) + Statics.method11(arg0 + 1, arg1 - 1) + Statics.method11(arg0 - 1, arg1 + 1) + Statics.method11(arg0 + 1, arg1 + 1);
        int var3 = Statics.method11(arg0 - 1, arg1) + Statics.method11(arg0 + 1, arg1) + Statics.method11(arg0, arg1 - 1) + Statics.method11(arg0, arg1 + 1);
        int var4 = Statics.method11(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dg.o(III)I")
    public static final int method1941(int arg0, int arg1) {
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

    @ObfuscatedName("hf.a(III)I")
    public static final int method3793(int arg0, int arg1) {
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

    @ObfuscatedName("p.q(IIII)I")
    public static final int method134(int arg0, int arg1, int arg2) {
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
