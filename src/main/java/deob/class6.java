package deob;

@ObfuscatedName("j")
public final class class6 {

    @ObfuscatedName("j.n")
    public static int[][][] field95 = new int[4][105][105];

    @ObfuscatedName("j.g")
    public static byte[][][] field83 = new byte[4][104][104];

    @ObfuscatedName("j.a")
    public static int field84 = 99;

    @ObfuscatedName("j.h")
    public static final int[] field92 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.p")
    public static final int[] field90 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.y")
    public static final int[] field94 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.z")
    public static final int[] field97 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.u")
    public static final int[] field96 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.w")
    public static final int[] field88 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.d")
    public static int field98 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.l")
    public static int field99 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.n(I)V")
    public static void method9() {
        field84 = 99;
        Statics.field85 = new byte[4][104][104];
        Statics.field1710 = new byte[4][104][104];
        Statics.field1854 = new byte[4][104][104];
        Statics.field1510 = new byte[4][104][104];
        Statics.field89 = new int[4][105][105];
        Statics.field2798 = new byte[4][105][105];
        Statics.field86 = new int[105][105];
        Statics.field91 = new int[104];
        Statics.field1878 = new int[104];
        Statics.field226 = new int[104];
        Statics.field82 = new int[104];
        Statics.field253 = new int[104];
    }

    @ObfuscatedName("g.g(I)V")
    public static void method12() {
        Statics.field85 = (byte[][][]) null;
        Statics.field1710 = (byte[][][]) null;
        Statics.field1854 = (byte[][][]) null;
        Statics.field1510 = (byte[][][]) null;
        Statics.field89 = (int[][][]) null;
        Statics.field2798 = (byte[][][]) null;
        Statics.field86 = (int[][]) null;
        Statics.field91 = null;
        Statics.field1878 = null;
        Statics.field226 = null;
        Statics.field82 = null;
        Statics.field253 = null;
    }

    @ObfuscatedName("cw.a(IIIII)V")
    public static final void method2047(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2798[0][var5][var4] = 127;
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

    @ObfuscatedName("et.m([BIIII[Lhq;B)V")
    public static final void method2824(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class220[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3137[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class111 var9 = new class111(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2052(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("db.s(IIII)V")
    public static final void method2522(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cw.j(Ldp;IIIIIII)V")
    public static final void method2052(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2211();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2211();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2211();
                }
            }
            return;
        }
        field83[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2211();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field95[0][arg2][arg3] = -method2796(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field95[arg1][arg2][arg3] = field95[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2211();
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
                Statics.field1710[arg1][arg2][arg3] = arg0.method2217();
                Statics.field1854[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1510[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field83[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field85[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("n.f(IIIIIILcz;Lhq;I)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class220 arg7) {
        if (client.field285 && (field83[0][arg1][arg2] & 0x2) == 0) {
            if ((field83[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2485(arg0, arg1, arg2) != client.field388) {
                return;
            }
        }
        if (arg0 < field84) {
            field84 = arg0;
        }
        class38 var8 = class38.method879(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field905;
            var10 = var8.field904;
        } else {
            var9 = var8.field904;
            var10 = var8.field905;
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
        if (var8.field903 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field929 == 1) {
            var20 += 256;
        }
        if (var8.method693()) {
            class22 var21 = new class22();
            var21.field601 = arg0;
            var21.field607 = arg1 * 128;
            var21.field603 = arg2 * 128;
            int var22 = var8.field904;
            int var23 = var8.field905;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field905;
                var23 = var8.field904;
            }
            var21.field604 = (arg1 + var22) * 128;
            var21.field605 = (arg2 + var23) * 128;
            var21.field606 = var8.field933;
            var21.field612 = var8.field888 * 128;
            var21.field609 = var8.field935;
            var21.field600 = var8.field907;
            var21.field602 = var8.field937;
            if (var8.field930 != null) {
                var21.field614 = var8;
                var21.method515();
            }
            class22.field611.method3463(var21);
            if (var21.field602 != null) {
                var21.field617 = var21.field609 + (int) (Math.random() * (double) (var21.field600 - var21.field609));
            }
        }
        if (arg5 == 22) {
            if (!client.field285 || var8.field903 != 0 || var8.field934 == 1 || var8.field922) {
                class80 var24;
                if (var8.field908 == -1 && var8.field930 == null) {
                    var24 = var8.method700(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
                }
                arg6.method1699(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field934 == 1 && arg7 != null) {
                    arg7.method3804(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var47;
            if (var8.field908 == -1 && var8.field930 == null) {
                var47 = var8.method700(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            if (var47 != null && arg6.method1695(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field927) {
                int var48 = 15;
                if (var47 instanceof class100) {
                    var48 = ((class100) var47).method2071() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2798[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2798[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field934 != 0 && arg7 != null) {
                arg7.method3799(arg1, arg2, var9, var10, var8.field936);
            }
        } else if (arg5 >= 12) {
            class80 var25;
            if (var8.field908 == -1 && var8.field930 == null) {
                var25 = var8.method700(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1695(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field89[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field934 != 0 && arg7 != null) {
                arg7.method3799(arg1, arg2, var9, var10, var8.field936);
            }
        } else if (arg5 == 0) {
            class80 var26;
            if (var8.field908 == -1 && var8.field930 == null) {
                var26 = var8.method700(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1705(arg0, arg1, arg2, var16, var26, (class80) null, field92[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field927) {
                    Statics.field2798[arg0][arg1][arg2] = 50;
                    Statics.field2798[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field913) {
                    Statics.field89[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field927) {
                    Statics.field2798[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2798[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field913) {
                    Statics.field89[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field927) {
                    Statics.field2798[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2798[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field913) {
                    Statics.field89[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field927) {
                    Statics.field2798[arg0][arg1][arg2] = 50;
                    Statics.field2798[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field913) {
                    Statics.field89[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field934 != 0 && arg7 != null) {
                arg7.method3801(arg1, arg2, arg5, arg4, var8.field936);
            }
            if (var8.field912 != 16) {
                arg6.method1709(arg0, arg1, arg2, var8.field912);
            }
        } else if (arg5 == 1) {
            class80 var27;
            if (var8.field908 == -1 && var8.field930 == null) {
                var27 = var8.method700(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1705(arg0, arg1, arg2, var16, var27, (class80) null, field90[arg4], 0, var19, var20);
            if (var8.field927) {
                if (arg4 == 0) {
                    Statics.field2798[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2798[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2798[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2798[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field934 != 0 && arg7 != null) {
                arg7.method3801(arg1, arg2, arg5, arg4, var8.field936);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class80 var29;
            class80 var30;
            if (var8.field908 == -1 && var8.field930 == null) {
                var29 = var8.method700(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method700(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field908, true, (class80) null);
                var30 = new class12(arg3, 2, var28, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1705(arg0, arg1, arg2, var16, var29, var30, field92[arg4], field92[var28], var19, var20);
            if (var8.field913) {
                if (arg4 == 0) {
                    Statics.field89[arg0][arg1][arg2] |= 0x249;
                    Statics.field89[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field89[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field89[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field89[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field89[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field89[arg0][arg1][arg2] |= 0x492;
                    Statics.field89[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field934 != 0 && arg7 != null) {
                arg7.method3801(arg1, arg2, arg5, arg4, var8.field936);
            }
            if (var8.field912 != 16) {
                arg6.method1709(arg0, arg1, arg2, var8.field912);
            }
        } else if (arg5 == 3) {
            class80 var31;
            if (var8.field908 == -1 && var8.field930 == null) {
                var31 = var8.method700(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1705(arg0, arg1, arg2, var16, var31, (class80) null, field90[arg4], 0, var19, var20);
            if (var8.field927) {
                if (arg4 == 0) {
                    Statics.field2798[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2798[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2798[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2798[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field934 != 0 && arg7 != null) {
                arg7.method3801(arg1, arg2, arg5, arg4, var8.field936);
            }
        } else if (arg5 == 9) {
            class80 var32;
            if (var8.field908 == -1 && var8.field930 == null) {
                var32 = var8.method700(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1695(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field934 != 0 && arg7 != null) {
                arg7.method3799(arg1, arg2, var9, var10, var8.field936);
            }
            if (var8.field912 != 16) {
                arg6.method1709(arg0, arg1, arg2, var8.field912);
            }
        } else if (arg5 == 4) {
            class80 var33;
            if (var8.field908 == -1 && var8.field930 == null) {
                var33 = var8.method700(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1832(arg0, arg1, arg2, var16, var33, (class80) null, field92[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1719(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class38.method879(var35 >> 14 & 0x7FFF).field912;
            }
            class80 var36;
            if (var8.field908 == -1 && var8.field930 == null) {
                var36 = var8.method700(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1832(arg0, arg1, arg2, var16, var36, (class80) null, field92[arg4], 0, field94[arg4] * var34, field97[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1719(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class38.method879(var38 >> 14 & 0x7FFF).field912 / 2;
            }
            class80 var39;
            if (var8.field908 == -1 && var8.field930 == null) {
                var39 = var8.method700(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1832(arg0, arg1, arg2, var16, var39, (class80) null, 256, arg4, field96[arg4] * var37, field88[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class80 var41;
            if (var8.field908 == -1 && var8.field930 == null) {
                var41 = var8.method700(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class12(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1832(arg0, arg1, arg2, var16, var41, (class80) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1719(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class38.method879(var43 >> 14 & 0x7FFF).field912 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class80 var45;
            class80 var46;
            if (var8.field908 == -1 && var8.field930 == null) {
                var45 = var8.method700(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method700(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field908, true, (class80) null);
                var46 = new class12(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field908, true, (class80) null);
            }
            arg6.method1832(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field96[arg4] * var42, field88[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cn.b(Lcz;[Lhq;I)V")
    public static final void method1942(class81 arg0, class220[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field83[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field83[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3803(var3, var4);
                        }
                    }
                }
            }
        }
        field98 += (int) (Math.random() * 5.0D) - 2;
        if (field98 < -8) {
            field98 = -8;
        }
        if (field98 > 8) {
            field98 = 8;
        }
        field99 += (int) (Math.random() * 5.0D) - 2;
        if (field99 < -16) {
            field99 = -16;
        }
        if (field99 > 16) {
            field99 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2798[var6];
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
                    Statics.field86[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field91[var20] = 0;
                Statics.field1878[var20] = 0;
                Statics.field226[var20] = 0;
                Statics.field82[var20] = 0;
                Statics.field253[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field85[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class39 var26 = (class39) class39.field942.method3388((long) var25);
                            class39 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field948.method2929(1, var25);
                                class39 var29 = new class39();
                                if (var28 != null) {
                                    var29.method726(new class111(var28), var25);
                                }
                                var29.method725();
                                class39.field942.method3396(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field91[var22] += var27.field949;
                            Statics.field1878[var22] += var27.field944;
                            Statics.field226[var22] += var27.field946;
                            Statics.field82[var22] += var27.field947;
                            var10002 = Statics.field253[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field85[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class39 var34 = (class39) class39.field942.method3388((long) var33);
                            class39 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field948.method2929(1, var33);
                                class39 var37 = new class39();
                                if (var36 != null) {
                                    var37.method726(new class111(var36), var33);
                                }
                                var37.method725();
                                class39.field942.method3396(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field91[var22] -= var35.field949;
                            Statics.field1878[var22] -= var35.field944;
                            Statics.field226[var22] -= var35.field946;
                            Statics.field82[var22] -= var35.field947;
                            var10002 = Statics.field253[var22]--;
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
                            var39 += Statics.field91[var45];
                            var40 += Statics.field1878[var45];
                            var41 += Statics.field226[var45];
                            var42 += Statics.field82[var45];
                            var43 += Statics.field253[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field91[var46];
                            var40 -= Statics.field1878[var46];
                            var41 -= Statics.field226[var46];
                            var42 -= Statics.field82[var46];
                            var43 -= Statics.field253[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field285 || (field83[0][var21][var44] & 0x2) != 0 || (field83[var6][var21][var44] & 0x10) == 0 && method2485(var6, var21, var44) == client.field388)) {
                            if (var6 < field84) {
                                field84 = var6;
                            }
                            int var47 = Statics.field85[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field1710[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field95[var6][var21][var44];
                                int var50 = field95[var6][var21 + 1][var44];
                                int var51 = field95[var6][var21 + 1][var44 + 1];
                                int var52 = field95[var6][var21][var44 + 1];
                                int var53 = Statics.field86[var21][var44];
                                int var54 = Statics.field86[var21 + 1][var44];
                                int var55 = Statics.field86[var21 + 1][var44 + 1];
                                int var56 = Statics.field86[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method2128(var59, var60, var61);
                                    int var62 = field98 + var59 & 0xFF;
                                    int var63 = field99 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method2128(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field1854[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class43 var66 = (class43) class43.field1033.method3388((long) var65);
                                        class43 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field1021.method2929(4, var65);
                                            class43 var69 = new class43();
                                            if (var68 != null) {
                                                var69.method831(new class111(var68), var65);
                                            }
                                            var69.method845();
                                            class43.field1033.method3396(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field1024) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field89[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class86.field1536[method150(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1698(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method150(var57, var53), method150(var57, var54), method150(var57, var55), method150(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field1854[var6][var21][var44] + 1;
                                    byte var72 = Statics.field1510[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class43 var74 = (class43) class43.field1033.method3388((long) var73);
                                    class43 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field1021.method2929(4, var73);
                                        class43 var77 = new class43();
                                        if (var76 != null) {
                                            var77.method831(new class111(var76), var73);
                                        }
                                        var77.method845();
                                        class43.field1033.method3396(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field1027;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1522.method1929(var79);
                                        var81 = -1;
                                    } else if (var75.field1022 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method2128(var75.field1026, var75.field1023, var75.field1020);
                                        int var82 = field98 + var75.field1026 & 0xFF;
                                        int var83 = field99 + var75.field1020;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method2128(var82, var75.field1023, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class86.field1536[method871(var80, 96)];
                                    }
                                    if (var75.field1025 != -1) {
                                        int var85 = field98 + var75.field1029 & 0xFF;
                                        int var86 = field99 + var75.field1031;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method2128(var85, var75.field1030, var86);
                                        var84 = class86.field1536[method871(var87, 96)];
                                    }
                                    arg0.method1698(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method150(var57, var53), method150(var57, var54), method150(var57, var55), method150(var57, var56), method871(var81, var53), method871(var81, var54), method871(var81, var55), method871(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1770(var6, var89, var88, method2485(var6, var89, var88));
                }
            }
            Statics.field85[var6] = (byte[][]) null;
            Statics.field1710[var6] = (byte[][]) null;
            Statics.field1854[var6] = (byte[][]) null;
            Statics.field1510[var6] = (byte[][]) null;
            Statics.field2798[var6] = (byte[][]) null;
        }
        arg0.method1800(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field83[1][var90][var91] & 0x2) == 2) {
                    arg0.method1765(var90, var91);
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
                        if ((Statics.field89[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field89[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field89[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label375: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field89[var101 - 1][var98][var103] & var92) == 0) {
                                        break label375;
                                    }
                                }
                                var101--;
                            }
                            label364: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field89[var102 + 1][var98][var104] & var92) == 0) {
                                        break label364;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field95[var102][var98][var99] - var106;
                                int var108 = field95[var101][var98][var99];
                                class81.method1723(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field89[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field89[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field89[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field89[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label428: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field89[var113 - 1][var115][var97] & var93) == 0) {
                                        break label428;
                                    }
                                }
                                var113--;
                            }
                            label417: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field89[var114 + 1][var116][var97] & var93) == 0) {
                                        break label417;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field95[var114][var111][var97] - var118;
                                int var120 = field95[var113][var111][var97];
                                class81.method1723(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field89[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field89[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field89[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field89[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label481: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field89[var96][var123 - 1][var127] & var94) == 0) {
                                        break label481;
                                    }
                                }
                                var123--;
                            }
                            label470: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field89[var96][var124 + 1][var128] & var94) == 0) {
                                        break label470;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field95[var96][var123][var125];
                                class81.method1723(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field89[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.t(IIII)I")
    public static int method2485(int arg0, int arg1, int arg2) {
        if ((field83[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field83[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("eg.i(III)I")
    public static final int method2796(int arg0, int arg1) {
        int var2 = method111(arg0 + 45365, arg1 + 91923, 4) - 128 + (method111(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method111(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("c.c(IIII)I")
    public static final int method111(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method168(var3, var5);
        int var8 = method168(var3 + 1, var5);
        int var9 = method168(var3, var5 + 1);
        int var10 = method168(var3 + 1, var5 + 1);
        int var11 = method2568(var7, var8, var4, arg2);
        int var12 = method2568(var9, var10, var4, arg2);
        return method2568(var11, var12, var6, arg2);
    }

    @ObfuscatedName("dm.k(IIIII)I")
    public static final int method2568(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class86.field1540[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("v.x(III)I")
    public static final int method168(int arg0, int arg1) {
        int var2 = method616(arg0 - 1, arg1 - 1) + method616(arg0 + 1, arg1 - 1) + method616(arg0 - 1, arg1 + 1) + method616(arg0 + 1, arg1 + 1);
        int var3 = method616(arg0 - 1, arg1) + method616(arg0 + 1, arg1) + method616(arg0, arg1 - 1) + method616(arg0, arg1 + 1);
        int var4 = method616(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ag.e(III)I")
    public static final int method616(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("q.q(IIB)I")
    public static final int method150(int arg0, int arg1) {
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

    @ObfuscatedName("ae.o(III)I")
    public static final int method871(int arg0, int arg1) {
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

    @ObfuscatedName("cb.r(IIIB)I")
    public static final int method2128(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("f.v(IIIIIIILcz;Lhq;I)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class81 arg7, class220 arg8) {
        class38 var9 = class38.method879(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field905;
            var11 = var9.field904;
        } else {
            var10 = var9.field904;
            var11 = var9.field905;
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
        int[][] var16 = field95[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field903 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field929 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class80 var22;
            if (var9.field908 == -1 && var9.field930 == null) {
                var22 = var9.method689(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class12(arg4, 22, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1699(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field934 == 1) {
                arg8.method3804(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var45;
            if (var9.field908 == -1 && var9.field930 == null) {
                var45 = var9.method689(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class12(arg4, 10, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            if (var45 != null) {
                arg7.method1695(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field934 != 0) {
                arg8.method3799(arg2, arg3, var10, var11, var9.field936);
            }
        } else if (arg6 >= 12) {
            class80 var23;
            if (var9.field908 == -1 && var9.field930 == null) {
                var23 = var9.method689(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1695(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field934 != 0) {
                arg8.method3799(arg2, arg3, var10, var11, var9.field936);
            }
        } else if (arg6 == 0) {
            class80 var24;
            if (var9.field908 == -1 && var9.field930 == null) {
                var24 = var9.method689(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class12(arg4, 0, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1705(arg0, arg2, arg3, var17, var24, (class80) null, field92[arg5], 0, var20, var21);
            if (var9.field934 != 0) {
                arg8.method3801(arg2, arg3, arg6, arg5, var9.field936);
            }
        } else if (arg6 == 1) {
            class80 var25;
            if (var9.field908 == -1 && var9.field930 == null) {
                var25 = var9.method689(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class12(arg4, 1, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1705(arg0, arg2, arg3, var17, var25, (class80) null, field90[arg5], 0, var20, var21);
            if (var9.field934 != 0) {
                arg8.method3801(arg2, arg3, arg6, arg5, var9.field936);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class80 var27;
            class80 var28;
            if (var9.field908 == -1 && var9.field930 == null) {
                var27 = var9.method689(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method689(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field908, true, (class80) null);
                var28 = new class12(arg4, 2, var26, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1705(arg0, arg2, arg3, var17, var27, var28, field92[arg5], field92[var26], var20, var21);
            if (var9.field934 != 0) {
                arg8.method3801(arg2, arg3, arg6, arg5, var9.field936);
            }
        } else if (arg6 == 3) {
            class80 var29;
            if (var9.field908 == -1 && var9.field930 == null) {
                var29 = var9.method689(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class12(arg4, 3, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1705(arg0, arg2, arg3, var17, var29, (class80) null, field90[arg5], 0, var20, var21);
            if (var9.field934 != 0) {
                arg8.method3801(arg2, arg3, arg6, arg5, var9.field936);
            }
        } else if (arg6 == 9) {
            class80 var30;
            if (var9.field908 == -1 && var9.field930 == null) {
                var30 = var9.method689(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1695(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field934 != 0) {
                arg8.method3799(arg2, arg3, var10, var11, var9.field936);
            }
        } else if (arg6 == 4) {
            class80 var31;
            if (var9.field908 == -1 && var9.field930 == null) {
                var31 = var9.method689(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1832(arg0, arg2, arg3, var17, var31, (class80) null, field92[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1719(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class38.method879(var33 >> 14 & 0x7FFF).field912;
            }
            class80 var34;
            if (var9.field908 == -1 && var9.field930 == null) {
                var34 = var9.method689(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1832(arg0, arg2, arg3, var17, var34, (class80) null, field92[arg5], 0, field94[arg5] * var32, field97[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1719(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class38.method879(var36 >> 14 & 0x7FFF).field912 / 2;
            }
            class80 var37;
            if (var9.field908 == -1 && var9.field930 == null) {
                var37 = var9.method689(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1832(arg0, arg2, arg3, var17, var37, (class80) null, 256, arg5, field96[arg5] * var35, field88[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class80 var39;
            if (var9.field908 == -1 && var9.field930 == null) {
                var39 = var9.method689(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class12(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1832(arg0, arg2, arg3, var17, var39, (class80) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1719(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class38.method879(var41 >> 14 & 0x7FFF).field912 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class80 var43;
            class80 var44;
            if (var9.field908 == -1 && var9.field930 == null) {
                var43 = var9.method689(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method689(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field908, true, (class80) null);
                var44 = new class12(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field908, true, (class80) null);
            }
            arg7.method1832(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field96[arg5] * var40, field88[arg5] * var40, var20, var21);
        }
    }
}
