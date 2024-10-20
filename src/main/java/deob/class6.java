package deob;

@ObfuscatedName("l")
public final class class6 {

    @ObfuscatedName("l.b")
    public static int[][][] field73 = new int[4][105][105];

    @ObfuscatedName("l.e")
    public static byte[][][] field81 = new byte[4][104][104];

    @ObfuscatedName("l.a")
    public static int field85 = 99;

    @ObfuscatedName("l.h")
    public static final int[] field68 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.w")
    public static final int[] field76 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.g")
    public static final int[] field77 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.f")
    public static final int[] field78 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.y")
    public static final int[] field79 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.j")
    public static final int[] field80 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.x")
    public static int field69 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.d")
    public static int field82 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.b(B)V")
    public static void method538() {
        field85 = 99;
        Statics.field74 = new byte[4][104][104];
        Statics.field70 = new byte[4][104][104];
        Statics.field3040 = new byte[4][104][104];
        Statics.field1148 = new byte[4][104][104];
        Statics.field709 = new int[4][105][105];
        Statics.field71 = new byte[4][105][105];
        Statics.field72 = new int[105][105];
        Statics.field1554 = new int[104];
        Statics.field1458 = new int[104];
        Statics.field3039 = new int[104];
        Statics.field999 = new int[104];
        Statics.field83 = new int[104];
    }

    @ObfuscatedName("d.e(I)V")
    public static void method553() {
        Statics.field74 = (byte[][][]) null;
        Statics.field70 = (byte[][][]) null;
        Statics.field3040 = (byte[][][]) null;
        Statics.field1148 = (byte[][][]) null;
        Statics.field709 = (int[][][]) null;
        Statics.field71 = (byte[][][]) null;
        Statics.field72 = (int[][]) null;
        Statics.field1554 = null;
        Statics.field1458 = null;
        Statics.field3039 = null;
        Statics.field999 = null;
        Statics.field83 = null;
    }

    @ObfuscatedName("et.a(IIIII)V")
    public static final void method2742(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field71[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field73[0][var5][var4] = field73[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field73[0][var5][var4] = field73[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field73[0][var5][var4] = field73[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field73[0][var5][var4] = field73[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.k([BIIII[Lhd;B)V")
    public static final void method552(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class220[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3134[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class111 var9 = new class111(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method12(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("t.p([BIIIIIII[Lhd;I)V")
    public static final void method177(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class220[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3134[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class111 var11 = new class111(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class168.method2500(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
                        int var22 = arg7 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var20;
                        } else if (var22 == 1) {
                            var23 = 7 - var19;
                        } else if (var22 == 2) {
                            var23 = 7 - var20;
                        } else {
                            var23 = var19;
                        }
                        method12(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method12(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.l(Ldj;IIIIIII)V")
    public static final void method12(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2127();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2127();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2127();
                }
            }
            return;
        }
        field81[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2127();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field73[0][arg2][arg3] = -method807(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field73[arg1][arg2][arg3] = field73[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2127();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field73[0][arg2][arg3] = -var8 * 8;
                } else {
                    field73[arg1][arg2][arg3] = field73[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field70[arg1][arg2][arg3] = arg0.method2267();
                Statics.field3040[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1148[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field81[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field74[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("aa.u([BIIB)Z")
    public static final boolean method727(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class111 var4 = new class111(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2140();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2140();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2127() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class38 var16 = class38.method1770(var5);
                        if (var13 != 22 || !client.field254 || var16.field868 != 0 || var16.field866 == 1 || var16.field887) {
                            if (!var16.method694()) {
                                client.field307++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2140();
                if (var9 == 0) {
                    break;
                }
                var4.method2127();
            }
        }
    }

    @ObfuscatedName("fg.o([BIILcb;[Lhd;S)V")
    public static final void method2938(byte[] arg0, int arg1, int arg2, class81 arg3, class220[] arg4) {
        class111 var5 = new class111(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2140();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2140();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2127();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field81[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class220 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method923(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("df.m([BIIIIIIILcb;[Lhd;S)V")
    public static final void method2490(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class81 arg8, class220[] arg9) {
        class111 var10 = new class111(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2140();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2140();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2127();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class38 var21 = class38.method1770(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field864;
                    int var27 = var21.field852;
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
                    int var32 = arg3 + class168.method2446(var16 & 0x7, var15 & 0x7, arg7, var21.field864, var21.field852, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field81[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class220 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method923(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.q(IIIIIILcb;Lhd;B)V")
    public static final void method923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class220 arg7) {
        if (client.field254 && (field81[0][arg1][arg2] & 0x2) == 0) {
            if ((field81[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field81[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field81[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field323 != var8) {
                return;
            }
        }
        if (arg0 < field85) {
            field85 = arg0;
        }
        class38 var9 = class38.method1770(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field852;
            var11 = var9.field864;
        } else {
            var10 = var9.field864;
            var11 = var9.field852;
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
        int[][] var16 = field73[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field868 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field889 == 1) {
            var21 += 256;
        }
        if (var9.method710()) {
            class22.method1766(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field254 || var9.field868 != 0 || var9.field866 == 1 || var9.field887) {
                class80 var22;
                if (var9.field849 == -1 && var9.field890 == null) {
                    var22 = var9.method675(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
                }
                arg6.method1599(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field866 == 1 && arg7 != null) {
                    arg7.method3677(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var45;
            if (var9.field849 == -1 && var9.field890 == null) {
                var45 = var9.method675(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            if (var45 != null && arg6.method1598(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field880) {
                int var46 = 15;
                if (var45 instanceof class100) {
                    var46 = ((class100) var45).method1976() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field71[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field71[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field866 != 0 && arg7 != null) {
                arg7.method3675(arg1, arg2, var10, var11, var9.field867);
            }
        } else if (arg5 >= 12) {
            class80 var23;
            if (var9.field849 == -1 && var9.field890 == null) {
                var23 = var9.method675(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1598(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field709[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field866 != 0 && arg7 != null) {
                arg7.method3675(arg1, arg2, var10, var11, var9.field867);
            }
        } else if (arg5 == 0) {
            class80 var24;
            if (var9.field849 == -1 && var9.field890 == null) {
                var24 = var9.method675(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1630(arg0, arg1, arg2, var17, var24, (class80) null, field68[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field880) {
                    Statics.field71[arg0][arg1][arg2] = 50;
                    Statics.field71[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field848) {
                    Statics.field709[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field880) {
                    Statics.field71[arg0][arg1][arg2 + 1] = 50;
                    Statics.field71[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field848) {
                    Statics.field709[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field880) {
                    Statics.field71[arg0][arg1 + 1][arg2] = 50;
                    Statics.field71[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field848) {
                    Statics.field709[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field880) {
                    Statics.field71[arg0][arg1][arg2] = 50;
                    Statics.field71[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field848) {
                    Statics.field709[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field866 != 0 && arg7 != null) {
                arg7.method3674(arg1, arg2, arg5, arg4, var9.field867);
            }
            if (var9.field861 != 16) {
                arg6.method1604(arg0, arg1, arg2, var9.field861);
            }
        } else if (arg5 == 1) {
            class80 var25;
            if (var9.field849 == -1 && var9.field890 == null) {
                var25 = var9.method675(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1630(arg0, arg1, arg2, var17, var25, (class80) null, field76[arg4], 0, var20, var21);
            if (var9.field880) {
                if (arg4 == 0) {
                    Statics.field71[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field71[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field71[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field71[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field866 != 0 && arg7 != null) {
                arg7.method3674(arg1, arg2, arg5, arg4, var9.field867);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class80 var27;
            class80 var28;
            if (var9.field849 == -1 && var9.field890 == null) {
                var27 = var9.method675(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method675(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field849, true, (class80) null);
                var28 = new class12(arg3, 2, var26, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1630(arg0, arg1, arg2, var17, var27, var28, field68[arg4], field68[var26], var20, var21);
            if (var9.field848) {
                if (arg4 == 0) {
                    Statics.field709[arg0][arg1][arg2] |= 0x249;
                    Statics.field709[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field709[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field709[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field709[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field709[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field709[arg0][arg1][arg2] |= 0x492;
                    Statics.field709[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field866 != 0 && arg7 != null) {
                arg7.method3674(arg1, arg2, arg5, arg4, var9.field867);
            }
            if (var9.field861 != 16) {
                arg6.method1604(arg0, arg1, arg2, var9.field861);
            }
        } else if (arg5 == 3) {
            class80 var29;
            if (var9.field849 == -1 && var9.field890 == null) {
                var29 = var9.method675(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1630(arg0, arg1, arg2, var17, var29, (class80) null, field76[arg4], 0, var20, var21);
            if (var9.field880) {
                if (arg4 == 0) {
                    Statics.field71[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field71[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field71[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field71[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field866 != 0 && arg7 != null) {
                arg7.method3674(arg1, arg2, arg5, arg4, var9.field867);
            }
        } else if (arg5 == 9) {
            class80 var30;
            if (var9.field849 == -1 && var9.field890 == null) {
                var30 = var9.method675(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1598(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field866 != 0 && arg7 != null) {
                arg7.method3675(arg1, arg2, var10, var11, var9.field867);
            }
            if (var9.field861 != 16) {
                arg6.method1604(arg0, arg1, arg2, var9.field861);
            }
        } else if (arg5 == 4) {
            class80 var31;
            if (var9.field849 == -1 && var9.field890 == null) {
                var31 = var9.method675(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1597(arg0, arg1, arg2, var17, var31, (class80) null, field68[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1614(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class38.method1770(var33 >> 14 & 0x7FFF).field861;
            }
            class80 var34;
            if (var9.field849 == -1 && var9.field890 == null) {
                var34 = var9.method675(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1597(arg0, arg1, arg2, var17, var34, (class80) null, field68[arg4], 0, field77[arg4] * var32, field78[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1614(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class38.method1770(var36 >> 14 & 0x7FFF).field861 / 2;
            }
            class80 var37;
            if (var9.field849 == -1 && var9.field890 == null) {
                var37 = var9.method675(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1597(arg0, arg1, arg2, var17, var37, (class80) null, 256, arg4, field79[arg4] * var35, field80[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class80 var39;
            if (var9.field849 == -1 && var9.field890 == null) {
                var39 = var9.method675(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class12(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1597(arg0, arg1, arg2, var17, var39, (class80) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1614(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class38.method1770(var41 >> 14 & 0x7FFF).field861 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class80 var43;
            class80 var44;
            if (var9.field849 == -1 && var9.field890 == null) {
                var43 = var9.method675(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method675(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field849, true, (class80) null);
                var44 = new class12(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field849, true, (class80) null);
            }
            arg6.method1597(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field79[arg4] * var40, field80[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("ev.v(Lcb;[Lhd;B)V")
    public static final void method2764(class81 arg0, class220[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field81[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field81[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3690(var3, var4);
                        }
                    }
                }
            }
        }
        field69 += (int) (Math.random() * 5.0D) - 2;
        if (field69 < -8) {
            field69 = -8;
        }
        if (field69 > 8) {
            field69 = 8;
        }
        field82 += (int) (Math.random() * 5.0D) - 2;
        if (field82 < -16) {
            field82 = -16;
        }
        if (field82 > 16) {
            field82 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field71[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field73[var6][var11 + 1][var10] - field73[var6][var11 - 1][var10];
                    int var13 = field73[var6][var11][var10 + 1] - field73[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field72[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1554[var20] = 0;
                Statics.field1458[var20] = 0;
                Statics.field3039[var20] = 0;
                Statics.field999[var20] = 0;
                Statics.field83[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field74[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class39 var25 = class39.method2586(var24 - 1);
                            Statics.field1554[var22] += var25.field906;
                            Statics.field1458[var22] += var25.field907;
                            Statics.field3039[var22] += var25.field908;
                            Statics.field999[var22] += var25.field904;
                            var10002 = Statics.field83[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field74[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class39 var28 = class39.method2586(var27 - 1);
                            Statics.field1554[var22] -= var28.field906;
                            Statics.field1458[var22] -= var28.field907;
                            Statics.field3039[var22] -= var28.field908;
                            Statics.field999[var22] -= var28.field904;
                            var10002 = Statics.field83[var22]--;
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
                            var29 += Statics.field1554[var35];
                            var30 += Statics.field1458[var35];
                            var31 += Statics.field3039[var35];
                            var32 += Statics.field999[var35];
                            var33 += Statics.field83[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field1554[var36];
                            var30 -= Statics.field1458[var36];
                            var31 -= Statics.field3039[var36];
                            var32 -= Statics.field999[var36];
                            var33 -= Statics.field83[var36];
                        }
                        if (var34 >= 1 && var34 < 103) {
                            if (client.field254 && (field81[0][var21][var34] & 0x2) == 0) {
                                if ((field81[var6][var21][var34] & 0x10) != 0) {
                                    continue;
                                }
                                int var37;
                                if ((field81[var6][var21][var34] & 0x8) != 0) {
                                    var37 = 0;
                                } else if (var6 <= 0 || (field81[1][var21][var34] & 0x2) == 0) {
                                    var37 = var6;
                                } else {
                                    var37 = var6 - 1;
                                }
                                if (client.field323 != var37) {
                                    continue;
                                }
                            }
                            if (var6 < field85) {
                                field85 = var6;
                            }
                            int var38 = Statics.field74[var6][var21][var34] & 0xFF;
                            int var39 = Statics.field70[var6][var21][var34] & 0xFF;
                            if (var38 > 0 || var39 > 0) {
                                int var40 = field73[var6][var21][var34];
                                int var41 = field73[var6][var21 + 1][var34];
                                int var42 = field73[var6][var21 + 1][var34 + 1];
                                int var43 = field73[var6][var21][var34 + 1];
                                int var44 = Statics.field72[var21][var34];
                                int var45 = Statics.field72[var21 + 1][var34];
                                int var46 = Statics.field72[var21 + 1][var34 + 1];
                                int var47 = Statics.field72[var21][var34 + 1];
                                int var48 = -1;
                                int var49 = -1;
                                if (var38 > 0) {
                                    int var50 = var29 * 256 / var32;
                                    int var51 = var30 / var33;
                                    int var52 = var31 / var33;
                                    var48 = method1368(var50, var51, var52);
                                    int var53 = field69 + var50 & 0xFF;
                                    int var54 = field82 + var52;
                                    if (var54 < 0) {
                                        var54 = 0;
                                    } else if (var54 > 255) {
                                        var54 = 255;
                                    }
                                    var49 = method1368(var53, var51, var54);
                                }
                                if (var6 > 0) {
                                    boolean var55 = true;
                                    if (var38 == 0 && Statics.field3040[var6][var21][var34] != 0) {
                                        var55 = false;
                                    }
                                    if (var39 > 0) {
                                        int var56 = var39 - 1;
                                        class43 var57 = (class43) class43.field972.method3254((long) var56);
                                        class43 var58;
                                        if (var57 == null) {
                                            byte[] var59 = Statics.field970.method2819(4, var56);
                                            class43 var60 = new class43();
                                            if (var59 != null) {
                                                var60.method808(new class111(var59), var56);
                                            }
                                            var60.method809();
                                            class43.field972.method3256(var60, (long) var56);
                                            var58 = var60;
                                        } else {
                                            var58 = var57;
                                        }
                                        if (!var58.field982) {
                                            var55 = false;
                                        }
                                    }
                                    if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
                                        Statics.field709[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var61 = 0;
                                if (var49 != -1) {
                                    var61 = class86.field1511[method921(var49, 96)];
                                }
                                if (var39 == 0) {
                                    arg0.method1593(var6, var21, var34, 0, 0, -1, var40, var41, var42, var43, method921(var48, var44), method921(var48, var45), method921(var48, var46), method921(var48, var47), 0, 0, 0, 0, var61, 0);
                                } else {
                                    int var62 = Statics.field3040[var6][var21][var34] + 1;
                                    byte var63 = Statics.field1148[var6][var21][var34];
                                    int var64 = var39 - 1;
                                    class43 var65 = (class43) class43.field972.method3254((long) var64);
                                    class43 var66;
                                    if (var65 == null) {
                                        byte[] var67 = Statics.field970.method2819(4, var64);
                                        class43 var68 = new class43();
                                        if (var67 != null) {
                                            var68.method808(new class111(var67), var64);
                                        }
                                        var68.method809();
                                        class43.field972.method3256(var68, (long) var64);
                                        var66 = var68;
                                    } else {
                                        var66 = var65;
                                    }
                                    int var70 = var66.field971;
                                    int var71;
                                    int var72;
                                    if (var70 >= 0) {
                                        var71 = Statics.field1500.method1842(var70);
                                        var72 = -1;
                                    } else if (var66.field980 == 16711935) {
                                        var72 = -2;
                                        var70 = -1;
                                        var71 = -2;
                                    } else {
                                        var72 = method1368(var66.field974, var66.field975, var66.field969);
                                        int var73 = field69 + var66.field974 & 0xFF;
                                        int var74 = field82 + var66.field969;
                                        if (var74 < 0) {
                                            var74 = 0;
                                        } else if (var74 > 255) {
                                            var74 = 255;
                                        }
                                        var71 = method1368(var73, var66.field975, var74);
                                    }
                                    int var75 = 0;
                                    if (var71 != -2) {
                                        var75 = class86.field1511[method2558(var71, 96)];
                                    }
                                    if (var66.field973 != -1) {
                                        int var76 = field69 + var66.field977 & 0xFF;
                                        int var77 = field82 + var66.field979;
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = method1368(var76, var66.field968, var77);
                                        var75 = class86.field1511[method2558(var78, 96)];
                                    }
                                    arg0.method1593(var6, var21, var34, var62, var63, var70, var40, var41, var42, var43, method921(var48, var44), method921(var48, var45), method921(var48, var46), method921(var48, var47), method2558(var72, var44), method2558(var72, var45), method2558(var72, var46), method2558(var72, var47), var61, var75);
                                }
                            }
                        }
                    }
                }
            }
            for (int var79 = 1; var79 < 103; var79++) {
                for (int var80 = 1; var80 < 103; var80++) {
                    int var85;
                    if ((field81[var6][var80][var79] & 0x8) != 0) {
                        var85 = 0;
                    } else if (var6 <= 0 || (field81[1][var80][var79] & 0x2) == 0) {
                        var85 = var6;
                    } else {
                        var85 = var6 - 1;
                    }
                    arg0.method1735(var6, var80, var79, var85);
                }
            }
            Statics.field74[var6] = (byte[][]) null;
            Statics.field70[var6] = (byte[][]) null;
            Statics.field3040[var6] = (byte[][]) null;
            Statics.field1148[var6] = (byte[][]) null;
            Statics.field71[var6] = (byte[][]) null;
        }
        arg0.method1619(-50, -10, -50);
        for (int var86 = 0; var86 < 104; var86++) {
            for (int var87 = 0; var87 < 104; var87++) {
                if ((field81[1][var86][var87] & 0x2) == 2) {
                    arg0.method1590(var86, var87);
                }
            }
        }
        int var88 = 1;
        int var89 = 2;
        int var90 = 4;
        for (int var91 = 0; var91 < 4; var91++) {
            if (var91 > 0) {
                var88 <<= 0x3;
                var89 <<= 0x3;
                var90 <<= 0x3;
            }
            for (int var92 = 0; var92 <= var91; var92++) {
                for (int var93 = 0; var93 <= 104; var93++) {
                    for (int var94 = 0; var94 <= 104; var94++) {
                        if ((Statics.field709[var92][var94][var93] & var88) != 0) {
                            int var95 = var93;
                            int var96 = var93;
                            int var97 = var92;
                            int var98 = var92;
                            while (var95 > 0 && (Statics.field709[var92][var94][var95 - 1] & var88) != 0) {
                                var95--;
                            }
                            while (var96 < 104 && (Statics.field709[var92][var94][var96 + 1] & var88) != 0) {
                                var96++;
                            }
                            label369: while (var97 > 0) {
                                for (int var99 = var95; var99 <= var96; var99++) {
                                    if ((Statics.field709[var97 - 1][var94][var99] & var88) == 0) {
                                        break label369;
                                    }
                                }
                                var97--;
                            }
                            label358: while (var98 < var91) {
                                for (int var100 = var95; var100 <= var96; var100++) {
                                    if ((Statics.field709[var98 + 1][var94][var100] & var88) == 0) {
                                        break label358;
                                    }
                                }
                                var98++;
                            }
                            int var101 = (var98 + 1 - var97) * (var96 - var95 + 1);
                            if (var101 >= 8) {
                                short var102 = 240;
                                int var103 = field73[var98][var94][var95] - var102;
                                int var104 = field73[var97][var94][var95];
                                class81.method1601(var91, 1, var94 * 128, var94 * 128, var95 * 128, var96 * 128 + 128, var103, var104);
                                for (int var105 = var97; var105 <= var98; var105++) {
                                    for (int var106 = var95; var106 <= var96; var106++) {
                                        Statics.field709[var105][var94][var106] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field709[var92][var94][var93] & var89) != 0) {
                            int var107 = var94;
                            int var108 = var94;
                            int var109 = var92;
                            int var110 = var92;
                            while (var107 > 0 && (Statics.field709[var92][var107 - 1][var93] & var89) != 0) {
                                var107--;
                            }
                            while (var108 < 104 && (Statics.field709[var92][var108 + 1][var93] & var89) != 0) {
                                var108++;
                            }
                            label422: while (var109 > 0) {
                                for (int var111 = var107; var111 <= var108; var111++) {
                                    if ((Statics.field709[var109 - 1][var111][var93] & var89) == 0) {
                                        break label422;
                                    }
                                }
                                var109--;
                            }
                            label411: while (var110 < var91) {
                                for (int var112 = var107; var112 <= var108; var112++) {
                                    if ((Statics.field709[var110 + 1][var112][var93] & var89) == 0) {
                                        break label411;
                                    }
                                }
                                var110++;
                            }
                            int var113 = (var110 + 1 - var109) * (var108 - var107 + 1);
                            if (var113 >= 8) {
                                short var114 = 240;
                                int var115 = field73[var110][var107][var93] - var114;
                                int var116 = field73[var109][var107][var93];
                                class81.method1601(var91, 2, var107 * 128, var108 * 128 + 128, var93 * 128, var93 * 128, var115, var116);
                                for (int var117 = var109; var117 <= var110; var117++) {
                                    for (int var118 = var107; var118 <= var108; var118++) {
                                        Statics.field709[var117][var118][var93] &= ~var89;
                                    }
                                }
                            }
                        }
                        if ((Statics.field709[var92][var94][var93] & var90) != 0) {
                            int var119 = var94;
                            int var120 = var94;
                            int var121 = var93;
                            int var122 = var93;
                            while (var121 > 0 && (Statics.field709[var92][var94][var121 - 1] & var90) != 0) {
                                var121--;
                            }
                            while (var122 < 104 && (Statics.field709[var92][var94][var122 + 1] & var90) != 0) {
                                var122++;
                            }
                            label475: while (var119 > 0) {
                                for (int var123 = var121; var123 <= var122; var123++) {
                                    if ((Statics.field709[var92][var119 - 1][var123] & var90) == 0) {
                                        break label475;
                                    }
                                }
                                var119--;
                            }
                            label464: while (var120 < 104) {
                                for (int var124 = var121; var124 <= var122; var124++) {
                                    if ((Statics.field709[var92][var120 + 1][var124] & var90) == 0) {
                                        break label464;
                                    }
                                }
                                var120++;
                            }
                            if ((var120 - var119 + 1) * (var122 - var121 + 1) >= 4) {
                                int var125 = field73[var92][var119][var121];
                                class81.method1601(var91, 4, var119 * 128, var120 * 128 + 128, var121 * 128, var122 * 128 + 128, var125, var125);
                                for (int var126 = var119; var126 <= var120; var126++) {
                                    for (int var127 = var121; var127 <= var122; var127++) {
                                        Statics.field709[var92][var126][var127] &= ~var90;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.n(III)I")
    public static final int method807(int arg0, int arg1) {
        int var2 = method922(arg0 + 45365, arg1 + 91923, 4) - 128 + (method922(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method922(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ad.z(IIIS)I")
    public static final int method922(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1082(var3, var5);
        int var8 = method1082(var3 + 1, var5);
        int var9 = method1082(var3, var5 + 1);
        int var10 = method1082(var3 + 1, var5 + 1);
        int var11 = 65536 - class86.field1516[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class86.field1516[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class86.field1516[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("bw.r(III)I")
    public static final int method1082(int arg0, int arg1) {
        int var2 = method2491(arg0 - 1, arg1 - 1) + method2491(arg0 + 1, arg1 - 1) + method2491(arg0 - 1, arg1 + 1) + method2491(arg0 + 1, arg1 + 1);
        int var3 = method2491(arg0 - 1, arg1) + method2491(arg0 + 1, arg1) + method2491(arg0, arg1 - 1) + method2491(arg0, arg1 + 1);
        int var4 = method2491(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("df.i(III)I")
    public static final int method2491(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ad.s(III)I")
    public static final int method921(int arg0, int arg1) {
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

    @ObfuscatedName("ez.c(III)I")
    public static final int method2558(int arg0, int arg1) {
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

    @ObfuscatedName("bz.t(IIIB)I")
    public static final int method1368(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ac.h(IIIIIIILcb;Lhd;B)V")
    public static final void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class81 arg7, class220 arg8) {
        class38 var9 = class38.method1770(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field852;
            var11 = var9.field864;
        } else {
            var10 = var9.field864;
            var11 = var9.field852;
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
        int[][] var16 = field73[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field868 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field889 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class80 var22;
            if (var9.field849 == -1 && var9.field890 == null) {
                var22 = var9.method676(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class12(arg4, 22, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1599(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field866 == 1) {
                arg8.method3677(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var45;
            if (var9.field849 == -1 && var9.field890 == null) {
                var45 = var9.method676(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class12(arg4, 10, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            if (var45 != null) {
                arg7.method1598(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field866 != 0) {
                arg8.method3675(arg2, arg3, var10, var11, var9.field867);
            }
        } else if (arg6 >= 12) {
            class80 var23;
            if (var9.field849 == -1 && var9.field890 == null) {
                var23 = var9.method676(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1598(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field866 != 0) {
                arg8.method3675(arg2, arg3, var10, var11, var9.field867);
            }
        } else if (arg6 == 0) {
            class80 var24;
            if (var9.field849 == -1 && var9.field890 == null) {
                var24 = var9.method676(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class12(arg4, 0, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1630(arg0, arg2, arg3, var17, var24, (class80) null, field68[arg5], 0, var20, var21);
            if (var9.field866 != 0) {
                arg8.method3674(arg2, arg3, arg6, arg5, var9.field867);
            }
        } else if (arg6 == 1) {
            class80 var25;
            if (var9.field849 == -1 && var9.field890 == null) {
                var25 = var9.method676(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class12(arg4, 1, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1630(arg0, arg2, arg3, var17, var25, (class80) null, field76[arg5], 0, var20, var21);
            if (var9.field866 != 0) {
                arg8.method3674(arg2, arg3, arg6, arg5, var9.field867);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class80 var27;
            class80 var28;
            if (var9.field849 == -1 && var9.field890 == null) {
                var27 = var9.method676(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method676(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field849, true, (class80) null);
                var28 = new class12(arg4, 2, var26, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1630(arg0, arg2, arg3, var17, var27, var28, field68[arg5], field68[var26], var20, var21);
            if (var9.field866 != 0) {
                arg8.method3674(arg2, arg3, arg6, arg5, var9.field867);
            }
        } else if (arg6 == 3) {
            class80 var29;
            if (var9.field849 == -1 && var9.field890 == null) {
                var29 = var9.method676(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class12(arg4, 3, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1630(arg0, arg2, arg3, var17, var29, (class80) null, field76[arg5], 0, var20, var21);
            if (var9.field866 != 0) {
                arg8.method3674(arg2, arg3, arg6, arg5, var9.field867);
            }
        } else if (arg6 == 9) {
            class80 var30;
            if (var9.field849 == -1 && var9.field890 == null) {
                var30 = var9.method676(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1598(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field866 != 0) {
                arg8.method3675(arg2, arg3, var10, var11, var9.field867);
            }
        } else if (arg6 == 4) {
            class80 var31;
            if (var9.field849 == -1 && var9.field890 == null) {
                var31 = var9.method676(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1597(arg0, arg2, arg3, var17, var31, (class80) null, field68[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1614(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class38.method1770(var33 >> 14 & 0x7FFF).field861;
            }
            class80 var34;
            if (var9.field849 == -1 && var9.field890 == null) {
                var34 = var9.method676(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1597(arg0, arg2, arg3, var17, var34, (class80) null, field68[arg5], 0, field77[arg5] * var32, field78[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1614(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class38.method1770(var36 >> 14 & 0x7FFF).field861 / 2;
            }
            class80 var37;
            if (var9.field849 == -1 && var9.field890 == null) {
                var37 = var9.method676(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1597(arg0, arg2, arg3, var17, var37, (class80) null, 256, arg5, field79[arg5] * var35, field80[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class80 var39;
            if (var9.field849 == -1 && var9.field890 == null) {
                var39 = var9.method676(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class12(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1597(arg0, arg2, arg3, var17, var39, (class80) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1614(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class38.method1770(var41 >> 14 & 0x7FFF).field861 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class80 var43;
            class80 var44;
            if (var9.field849 == -1 && var9.field890 == null) {
                var43 = var9.method676(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method676(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field849, true, (class80) null);
                var44 = new class12(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field849, true, (class80) null);
            }
            arg7.method1597(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field79[arg5] * var40, field80[arg5] * var40, var20, var21);
        }
    }
}
