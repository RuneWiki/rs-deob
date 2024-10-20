package deob;

@ObfuscatedName("c")
public final class class6 {

    @ObfuscatedName("c.y")
    public static int[][][] field86 = new int[4][105][105];

    @ObfuscatedName("c.d")
    public static byte[][][] field80 = new byte[4][104][104];

    @ObfuscatedName("c.g")
    public static int field98 = 99;

    @ObfuscatedName("c.x")
    public static final int[] field88 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.h")
    public static final int[] field79 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.j")
    public static final int[] field90 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.v")
    public static final int[] field91 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.l")
    public static final int[] field89 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.u")
    public static final int[] field83 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.t")
    public static int field94 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.i")
    public static int field95 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.y(B)V")
    public static void method1925() {
        field98 = 99;
        Statics.field82 = new byte[4][104][104];
        Statics.field2687 = new byte[4][104][104];
        Statics.field2031 = new byte[4][104][104];
        Statics.field869 = new byte[4][104][104];
        Statics.field93 = new int[4][105][105];
        Statics.field87 = new byte[4][105][105];
        Statics.field2232 = new int[105][105];
        Statics.field64 = new int[104];
        Statics.field84 = new int[104];
        Statics.field85 = new int[104];
        Statics.field258 = new int[104];
        Statics.field2152 = new int[104];
    }

    @ObfuscatedName("al.d(I)V")
    public static void method722() {
        Statics.field82 = (byte[][][]) null;
        Statics.field2687 = (byte[][][]) null;
        Statics.field2031 = (byte[][][]) null;
        Statics.field869 = (byte[][][]) null;
        Statics.field93 = (int[][][]) null;
        Statics.field87 = (byte[][][]) null;
        Statics.field2232 = (int[][]) null;
        Statics.field64 = null;
        Statics.field84 = null;
        Statics.field85 = null;
        Statics.field258 = null;
        Statics.field2152 = null;
    }

    @ObfuscatedName("av.g(IIIIB)V")
    public static final void method923(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field87[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field86[0][var5][var4] = field86[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field86[0][var5][var4] = field86[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field86[0][var5][var4] = field86[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field86[0][var5][var4] = field86[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.w([BIIII[Ldu;B)V")
    public static final void method100(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class108[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1892[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class119 var9 = new class119(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2641(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("eq.e(Ldd;IIIIIII)V")
    public static final void method2641(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2326();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2326();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2326();
                }
            }
            return;
        }
        field80[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2326();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field86[0][arg2][arg3] = -method587(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field86[arg1][arg2][arg3] = field86[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2326();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field86[0][arg2][arg3] = -var8 * 8;
                } else {
                    field86[arg1][arg2][arg3] = field86[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2687[arg1][arg2][arg3] = arg0.method2461();
                Statics.field2031[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field869[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field80[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field82[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ct.c([BIII)Z")
    public static final boolean method1928(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2321();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2321();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2326() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method2614(var5);
                        if (var13 != 22 || !client.field429 || var16.field933 != 0 || var16.field931 == 1 || var16.field952) {
                            if (!var16.method809()) {
                                client.field348++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2321();
                if (var9 == 0) {
                    break;
                }
                var4.method2326();
            }
        }
    }

    @ObfuscatedName("af.a([BIILch;[Ldu;I)V")
    public static final void method712(byte[] arg0, int arg1, int arg2, class86 arg3, class108[] arg4) {
        class119 var5 = new class119(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2321();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2321();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2326();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field80[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class108 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2123(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("l.q([BIIIIIIILch;[Ldu;B)V")
    public static final void method574(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class86 arg8, class108[] arg9) {
        class119 var10 = new class119(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2321();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2321();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2326();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class41 var21 = class41.method2614(var11);
                    int var22 = arg2 + class177.method946(var16 & 0x7, var15 & 0x7, arg7, var21.field929, var21.field930, var20);
                    int var23 = arg3 + Statics.method127(var16 & 0x7, var15 & 0x7, arg7, var21.field929, var21.field930, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field80[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class108 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method2123(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.m(IIIIIILch;Ldu;I)V")
    public static final void method2123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field429 && (field80[0][arg1][arg2] & 0x2) == 0 && (field80[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field98) {
            field98 = arg0;
        }
        class41 var8 = class41.method2614(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field930;
            var10 = var8.field929;
        } else {
            var9 = var8.field929;
            var10 = var8.field930;
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
        int[][] var15 = field86[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field933 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field924 == 1) {
            var20 += 256;
        }
        if (var8.method807()) {
            class24 var21 = new class24();
            var21.field609 = arg0;
            var21.field608 = arg1 * 128;
            var21.field613 = arg2 * 128;
            int var22 = var8.field929;
            int var23 = var8.field930;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field930;
                var23 = var8.field929;
            }
            var21.field616 = (arg1 + var22) * 128;
            var21.field611 = (arg2 + var23) * 128;
            var21.field610 = var8.field958;
            var21.field612 = var8.field959 * 128;
            var21.field615 = var8.field940;
            var21.field606 = var8.field961;
            var21.field618 = var8.field939;
            if (var8.field962 != null) {
                var21.field620 = var8;
                var21.method581();
            }
            class24.field617.method3488(var21);
            if (var21.field618 != null) {
                var21.field607 = var21.field615 + (int) (Math.random() * (double) (var21.field606 - var21.field615));
            }
        }
        if (arg5 == 22) {
            if (!client.field429 || var8.field933 != 0 || var8.field931 == 1 || var8.field952) {
                class85 var24;
                if (var8.field937 == -1 && var8.field962 == null) {
                    var24 = var8.method770(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                }
                arg6.method1761(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field931 == 1 && arg7 != null) {
                    arg7.method2212(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field937 == -1 && var8.field962 == null) {
                var47 = var8.method770(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            if (var47 != null && arg6.method1765(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field945) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2142() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field87[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field87[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2210(arg1, arg2, var9, var10, var8.field932);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field937 == -1 && var8.field962 == null) {
                var25 = var8.method770(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field93[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2210(arg1, arg2, var9, var10, var8.field932);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field937 == -1 && var8.field962 == null) {
                var26 = var8.method770(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1763(arg0, arg1, arg2, var16, var26, (class85) null, field88[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field945) {
                    Statics.field87[arg0][arg1][arg2] = 50;
                    Statics.field87[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field936) {
                    Statics.field93[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field945) {
                    Statics.field87[arg0][arg1][arg2 + 1] = 50;
                    Statics.field87[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field936) {
                    Statics.field93[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field945) {
                    Statics.field87[arg0][arg1 + 1][arg2] = 50;
                    Statics.field87[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field936) {
                    Statics.field93[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field945) {
                    Statics.field87[arg0][arg1][arg2] = 50;
                    Statics.field87[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field936) {
                    Statics.field93[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2209(arg1, arg2, arg5, arg4, var8.field932);
            }
            if (var8.field938 != 16) {
                arg6.method1886(arg0, arg1, arg2, var8.field938);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field937 == -1 && var8.field962 == null) {
                var27 = var8.method770(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1763(arg0, arg1, arg2, var16, var27, (class85) null, field79[arg4], 0, var19, var20);
            if (var8.field945) {
                if (arg4 == 0) {
                    Statics.field87[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field87[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field87[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field87[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2209(arg1, arg2, arg5, arg4, var8.field932);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field937 == -1 && var8.field962 == null) {
                var29 = var8.method770(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method770(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1763(arg0, arg1, arg2, var16, var29, var30, field88[arg4], field88[var28], var19, var20);
            if (var8.field936) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2] |= 0x249;
                    Statics.field93[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field93[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field93[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] |= 0x492;
                    Statics.field93[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2209(arg1, arg2, arg5, arg4, var8.field932);
            }
            if (var8.field938 != 16) {
                arg6.method1886(arg0, arg1, arg2, var8.field938);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field937 == -1 && var8.field962 == null) {
                var31 = var8.method770(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1763(arg0, arg1, arg2, var16, var31, (class85) null, field79[arg4], 0, var19, var20);
            if (var8.field945) {
                if (arg4 == 0) {
                    Statics.field87[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field87[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field87[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field87[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2209(arg1, arg2, arg5, arg4, var8.field932);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field937 == -1 && var8.field962 == null) {
                var32 = var8.method770(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2210(arg1, arg2, var9, var10, var8.field932);
            }
            if (var8.field938 != 16) {
                arg6.method1886(arg0, arg1, arg2, var8.field938);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field937 == -1 && var8.field962 == null) {
                var33 = var8.method770(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var33, (class85) null, field88[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1804(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method2614(var35 >> 14 & 0x7FFF).field938;
            }
            class85 var36;
            if (var8.field937 == -1 && var8.field962 == null) {
                var36 = var8.method770(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var36, (class85) null, field88[arg4], 0, field90[arg4] * var34, field91[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1804(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method2614(var38 >> 14 & 0x7FFF).field938 / 2;
            }
            class85 var39;
            if (var8.field937 == -1 && var8.field962 == null) {
                var39 = var8.method770(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field89[arg4] * var37, field83[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field937 == -1 && var8.field962 == null) {
                var41 = var8.method770(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1804(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method2614(var43 >> 14 & 0x7FFF).field938 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field937 == -1 && var8.field962 == null) {
                var45 = var8.method770(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method770(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field89[arg4] * var42, field83[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("t.n(IIB)I")
    public static final int method587(int arg0, int arg1) {
        int var2 = method1049(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1049(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1049(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("at.k(IIII)I")
    public static final int method1049(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method93(var3, var5);
        int var8 = method93(var3 + 1, var5);
        int var9 = method93(var3, var5 + 1);
        int var10 = method93(var3 + 1, var5 + 1);
        int var11 = 65536 - class91.field1585[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class91.field1585[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class91.field1585[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("c.o(III)I")
    public static final int method93(int arg0, int arg1) {
        int var2 = method2910(arg0 - 1, arg1 - 1) + method2910(arg0 + 1, arg1 - 1) + method2910(arg0 - 1, arg1 + 1) + method2910(arg0 + 1, arg1 + 1);
        int var3 = method2910(arg0 - 1, arg1) + method2910(arg0 + 1, arg1) + method2910(arg0, arg1 - 1) + method2910(arg0, arg1 + 1);
        int var4 = method2910(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("eu.f(III)I")
    public static final int method2910(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("q.s(III)I")
    public static final int method112(int arg0, int arg1) {
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

    @ObfuscatedName("u.z(III)I")
    public static final int method585(int arg0, int arg1) {
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

    @ObfuscatedName("br.b(IIII)I")
    public static final int method1502(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ds.p(IIB)Z")
    public static final boolean method2599(int arg0, int arg1) {
        class41 var2 = class41.method2614(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method768(arg1);
    }
}
