package deob;

@ObfuscatedName("q")
public final class class9 {

    @ObfuscatedName("q.b")
    public static int[][][] field130 = new int[4][105][105];

    @ObfuscatedName("q.e")
    public static byte[][][] field148 = new byte[4][104][104];

    @ObfuscatedName("q.g")
    public static int field129 = 99;

    @ObfuscatedName("q.y")
    public static final int[] field136 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("q.k")
    public static final int[] field147 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("q.p")
    public static final int[] field138 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("q.s")
    public static final int[] field139 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("q.m")
    public static final int[] field140 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("q.c")
    public static final int[] field141 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("q.i")
    public static int field142 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("q.u")
    public static int field137 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.b(I)V")
    public static void method1339() {
        Statics.field128 = (byte[][][]) null;
        Statics.field131 = (byte[][][]) null;
        Statics.field132 = (byte[][][]) null;
        Statics.field1015 = (byte[][][]) null;
        Statics.field1921 = (int[][][]) null;
        Statics.field133 = (byte[][][]) null;
        Statics.field2461 = (int[][]) null;
        Statics.field2004 = null;
        Statics.field127 = null;
        Statics.field1214 = null;
        Statics.field135 = null;
        Statics.field2409 = null;
    }

    @ObfuscatedName("al.e(IIIII)V")
    public static final void method690(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field133[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field130[0][var5][var4] = field130[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field130[0][var5][var4] = field130[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field130[0][var5][var4] = field130[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field130[0][var5][var4] = field130[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("co.g([BIIII[Ldt;I)V")
    public static final void method2020(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class130[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2058[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class126 var9 = new class126(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1469(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("bs.a(Ldv;IIIIIII)V")
    public static final void method1469(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2436();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2436();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2436();
                }
            }
            return;
        }
        field148[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2436();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field130[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = Statics.method1566(var10 + 45365, var11 + 91923, 4) - 128 + (Statics.method1566(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (Statics.method1566(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field130[arg1][arg2][arg3] = field130[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2436();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field130[0][arg2][arg3] = -var15 * 8;
                } else {
                    field130[arg1][arg2][arg3] = field130[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field131[arg1][arg2][arg3] = arg0.method2437();
                Statics.field132[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1015[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field148[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field128[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("a.h([BIII)Z")
    public static final boolean method34(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class126 var4 = new class126(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2560();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2560();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2436() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method48(var5);
                        if (var13 != 22 || !client.field473 || var16.field831 != 0 || var16.field823 == 1 || var16.field839) {
                            if (!var16.method638()) {
                                client.field674++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2560();
                if (var9 == 0) {
                    break;
                }
                var4.method2436();
            }
        }
    }

    @ObfuscatedName("az.j([BIILcq;[Ldt;I)V")
    public static final void method853(byte[] arg0, int arg1, int arg2, class95 arg3, class130[] arg4) {
        class126 var5 = new class126(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2560();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2560();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2436();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field148[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class130 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method798(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ay.f(IIIIIILcq;Ldt;S)V")
    public static final void method798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field473 && (field148[0][arg1][arg2] & 0x2) == 0) {
            if ((field148[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2113(arg0, arg1, arg2) != client.field521) {
                return;
            }
        }
        if (arg0 < field129) {
            field129 = arg0;
        }
        class32 var8 = class32.method48(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field817;
            var10 = var8.field809;
        } else {
            var9 = var8.field809;
            var10 = var8.field817;
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
        int[][] var15 = field130[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field831 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field814 == 1) {
            var20 += 256;
        }
        if (var8.method642()) {
            class7.method1358(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field473 || var8.field831 != 0 || var8.field823 == 1 || var8.field839) {
                class94 var21;
                if (var8.field830 == -1 && var8.field842 == null) {
                    var21 = var8.method637(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
                }
                arg6.method1845(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field823 == 1 && arg7 != null) {
                    arg7.method2691(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var44;
            if (var8.field830 == -1 && var8.field842 == null) {
                var44 = var8.method637(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            if (var44 != null && arg6.method1902(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field832) {
                int var45 = 15;
                if (var44 instanceof class112) {
                    var45 = ((class112) var44).method2228() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field133[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field133[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field823 != 0 && arg7 != null) {
                arg7.method2664(arg1, arg2, var9, var10, var8.field819);
            }
        } else if (arg5 >= 12) {
            class94 var22;
            if (var8.field830 == -1 && var8.field842 == null) {
                var22 = var8.method637(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1902(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1921[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field823 != 0 && arg7 != null) {
                arg7.method2664(arg1, arg2, var9, var10, var8.field819);
            }
        } else if (arg5 == 0) {
            class94 var23;
            if (var8.field830 == -1 && var8.field842 == null) {
                var23 = var8.method637(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1847(arg0, arg1, arg2, var16, var23, (class94) null, field136[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field832) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field824) {
                    Statics.field1921[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field832) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field824) {
                    Statics.field1921[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field832) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field824) {
                    Statics.field1921[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field832) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field824) {
                    Statics.field1921[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field823 != 0 && arg7 != null) {
                arg7.method2666(arg1, arg2, arg5, arg4, var8.field819);
            }
            if (var8.field834 != 16) {
                arg6.method1882(arg0, arg1, arg2, var8.field834);
            }
        } else if (arg5 == 1) {
            class94 var24;
            if (var8.field830 == -1 && var8.field842 == null) {
                var24 = var8.method637(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1847(arg0, arg1, arg2, var16, var24, (class94) null, field147[arg4], 0, var19, var20);
            if (var8.field832) {
                if (arg4 == 0) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field823 != 0 && arg7 != null) {
                arg7.method2666(arg1, arg2, arg5, arg4, var8.field819);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class94 var26;
            class94 var27;
            if (var8.field830 == -1 && var8.field842 == null) {
                var26 = var8.method637(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method637(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field830, true, (class94) null);
                var27 = new class14(arg3, 2, var25, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1847(arg0, arg1, arg2, var16, var26, var27, field136[arg4], field136[var25], var19, var20);
            if (var8.field824) {
                if (arg4 == 0) {
                    Statics.field1921[arg0][arg1][arg2] |= 0x249;
                    Statics.field1921[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1921[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1921[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1921[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1921[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1921[arg0][arg1][arg2] |= 0x492;
                    Statics.field1921[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field823 != 0 && arg7 != null) {
                arg7.method2666(arg1, arg2, arg5, arg4, var8.field819);
            }
            if (var8.field834 != 16) {
                arg6.method1882(arg0, arg1, arg2, var8.field834);
            }
        } else if (arg5 == 3) {
            class94 var28;
            if (var8.field830 == -1 && var8.field842 == null) {
                var28 = var8.method637(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1847(arg0, arg1, arg2, var16, var28, (class94) null, field147[arg4], 0, var19, var20);
            if (var8.field832) {
                if (arg4 == 0) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field823 != 0 && arg7 != null) {
                arg7.method2666(arg1, arg2, arg5, arg4, var8.field819);
            }
        } else if (arg5 == 9) {
            class94 var29;
            if (var8.field830 == -1 && var8.field842 == null) {
                var29 = var8.method637(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1902(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field823 != 0 && arg7 != null) {
                arg7.method2664(arg1, arg2, var9, var10, var8.field819);
            }
            if (var8.field834 != 16) {
                arg6.method1882(arg0, arg1, arg2, var8.field834);
            }
        } else if (arg5 == 4) {
            class94 var30;
            if (var8.field830 == -1 && var8.field842 == null) {
                var30 = var8.method637(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1848(arg0, arg1, arg2, var16, var30, (class94) null, field136[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1865(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class32.method48(var32 >> 14 & 0x7FFF).field834;
            }
            class94 var33;
            if (var8.field830 == -1 && var8.field842 == null) {
                var33 = var8.method637(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1848(arg0, arg1, arg2, var16, var33, (class94) null, field136[arg4], 0, field138[arg4] * var31, field139[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1865(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method48(var35 >> 14 & 0x7FFF).field834 / 2;
            }
            class94 var36;
            if (var8.field830 == -1 && var8.field842 == null) {
                var36 = var8.method637(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1848(arg0, arg1, arg2, var16, var36, (class94) null, 256, arg4, field140[arg4] * var34, field141[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class94 var38;
            if (var8.field830 == -1 && var8.field842 == null) {
                var38 = var8.method637(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class14(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1848(arg0, arg1, arg2, var16, var38, (class94) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1865(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class32.method48(var40 >> 14 & 0x7FFF).field834 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            class94 var43;
            if (var8.field830 == -1 && var8.field842 == null) {
                var42 = var8.method637(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method637(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field830, true, (class94) null);
                var43 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field830, true, (class94) null);
            }
            arg6.method1848(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field140[arg4] * var39, field141[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ck.q(IIII)I")
    public static int method2113(int arg0, int arg1, int arg2) {
        if ((field148[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field148[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cm.d(IIIII)I")
    public static final int method2029(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1750[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ew.z(IIB)I")
    public static final int method3100(int arg0, int arg1) {
        int var2 = method2701(arg0 - 1, arg1 - 1) + method2701(arg0 + 1, arg1 - 1) + method2701(arg0 - 1, arg1 + 1) + method2701(arg0 + 1, arg1 + 1);
        int var3 = method2701(arg0 - 1, arg1) + method2701(arg0 + 1, arg1) + method2701(arg0, arg1 - 1) + method2701(arg0, arg1 + 1);
        int var4 = method2701(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ee.n(III)I")
    public static final int method2701(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ap.t(III)I")
    public static final int method864(int arg0, int arg1) {
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

    @ObfuscatedName("l.w(III)I")
    public static final int method94(int arg0, int arg1) {
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

    @ObfuscatedName("ey.r(IIII)I")
    public static final int method2717(int arg0, int arg1, int arg2) {
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
