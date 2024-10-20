package deob;

@ObfuscatedName("l")
public final class class9 {

    @ObfuscatedName("l.x")
    public static int[][][] field130 = new int[4][105][105];

    @ObfuscatedName("l.p")
    public static byte[][][] field119 = new byte[4][104][104];

    @ObfuscatedName("l.k")
    public static int field121 = 99;

    @ObfuscatedName("l.g")
    public static final int[] field138 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.m")
    public static final int[] field128 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.o")
    public static final int[] field129 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.e")
    public static final int[] field118 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.f")
    public static final int[] field131 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.i")
    public static final int[] field132 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.d")
    public static int field133 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.z")
    public static int field134 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.x(I)V")
    public static void method164() {
        Statics.field141 = (byte[][][]) null;
        Statics.field359 = (byte[][][]) null;
        Statics.field122 = (byte[][][]) null;
        Statics.field2383 = (byte[][][]) null;
        Statics.field1627 = (int[][][]) null;
        Statics.field1155 = (byte[][][]) null;
        Statics.field76 = (int[][]) null;
        Statics.field310 = null;
        Statics.field123 = null;
        Statics.field2706 = null;
        Statics.field1910 = null;
        Statics.field1971 = null;
    }

    @ObfuscatedName("dd.p(IIIII)V")
    public static final void method2167(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1155[0][var5][var4] = 127;
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

    @ObfuscatedName("eb.k(Ldg;IIIIIII)V")
    public static final void method3032(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2484();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2484();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2484();
                }
            }
            return;
        }
        field119[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2484();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field130[0][arg2][arg3] = -method29(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field130[arg1][arg2][arg3] = field130[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2484();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field130[0][arg2][arg3] = -var8 * 8;
                } else {
                    field130[arg1][arg2][arg3] = field130[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field359[arg1][arg2][arg3] = arg0.method2411();
                Statics.field122[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2383[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field119[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field141[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("k.a([BIII)Z")
    public static final boolean method18(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class127 var4 = new class127(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2437();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2437();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2484() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method1131(var5);
                        if (var13 != 22 || !client.field450 || var16.field800 != 0 || var16.field798 == 1 || var16.field820) {
                            if (!var16.method620()) {
                                client.field501++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2437();
                if (var9 == 0) {
                    break;
                }
                var4.method2484();
            }
        }
    }

    @ObfuscatedName("ac.q([BIIIIIIILcz;[Lfc;B)V")
    public static final void method732(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class164[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2437();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2437();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2484();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method1131(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field796;
                    int var27 = var21.field807;
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
                    int var32 = arg3 + class160.method1616(var16 & 0x7, var15 & 0x7, arg7, var21.field796, var21.field807, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field119[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class164 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method22(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.j(IIIIIILcz;Lfc;I)V")
    public static final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field450 && (field119[0][arg1][arg2] & 0x2) == 0) {
            if ((field119[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field119[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field119[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field616 != var8) {
                return;
            }
        }
        if (arg0 < field121) {
            field121 = arg0;
        }
        class32 var9 = class32.method1131(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field807;
            var11 = var9.field796;
        } else {
            var10 = var9.field796;
            var11 = var9.field807;
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
        int[][] var16 = field130[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field800 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field805 == 1) {
            var21 += 256;
        }
        if (var9.method624()) {
            Statics.method1506(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field450 || var9.field800 != 0 || var9.field798 == 1 || var9.field820) {
                class94 var22;
                if (var9.field804 == -1 && var9.field823 == null) {
                    var22 = var9.method625(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
                }
                arg6.method1823(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field798 == 1 && arg7 != null) {
                    arg7.method3157(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var45;
            if (var9.field804 == -1 && var9.field823 == null) {
                var45 = var9.method625(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            if (var45 != null && arg6.method1827(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field812) {
                int var46 = 15;
                if (var45 instanceof class112) {
                    var46 = ((class112) var45).method2196() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field1155[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field1155[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field798 != 0 && arg7 != null) {
                arg7.method3178(arg1, arg2, var10, var11, var9.field799);
            }
        } else if (arg5 >= 12) {
            class94 var23;
            if (var9.field804 == -1 && var9.field823 == null) {
                var23 = var9.method625(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1827(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1627[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field798 != 0 && arg7 != null) {
                arg7.method3178(arg1, arg2, var10, var11, var9.field799);
            }
        } else if (arg5 == 0) {
            class94 var24;
            if (var9.field804 == -1 && var9.field823 == null) {
                var24 = var9.method625(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var24, (class94) null, field138[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field812) {
                    Statics.field1155[arg0][arg1][arg2] = 50;
                    Statics.field1155[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field785) {
                    Statics.field1627[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field812) {
                    Statics.field1155[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1155[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field785) {
                    Statics.field1627[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field812) {
                    Statics.field1155[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1155[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field785) {
                    Statics.field1627[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field812) {
                    Statics.field1155[arg0][arg1][arg2] = 50;
                    Statics.field1155[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field785) {
                    Statics.field1627[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field798 != 0 && arg7 != null) {
                arg7.method3154(arg1, arg2, arg5, arg4, var9.field799);
            }
            if (var9.field782 != 16) {
                arg6.method1833(arg0, arg1, arg2, var9.field782);
            }
        } else if (arg5 == 1) {
            class94 var25;
            if (var9.field804 == -1 && var9.field823 == null) {
                var25 = var9.method625(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var25, (class94) null, field128[arg4], 0, var20, var21);
            if (var9.field812) {
                if (arg4 == 0) {
                    Statics.field1155[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1155[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1155[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1155[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field798 != 0 && arg7 != null) {
                arg7.method3154(arg1, arg2, arg5, arg4, var9.field799);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field804 == -1 && var9.field823 == null) {
                var27 = var9.method625(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method625(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field804, true, (class94) null);
                var28 = new class14(arg3, 2, var26, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var27, var28, field138[arg4], field138[var26], var20, var21);
            if (var9.field785) {
                if (arg4 == 0) {
                    Statics.field1627[arg0][arg1][arg2] |= 0x249;
                    Statics.field1627[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1627[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1627[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1627[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1627[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1627[arg0][arg1][arg2] |= 0x492;
                    Statics.field1627[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field798 != 0 && arg7 != null) {
                arg7.method3154(arg1, arg2, arg5, arg4, var9.field799);
            }
            if (var9.field782 != 16) {
                arg6.method1833(arg0, arg1, arg2, var9.field782);
            }
        } else if (arg5 == 3) {
            class94 var29;
            if (var9.field804 == -1 && var9.field823 == null) {
                var29 = var9.method625(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var17, var29, (class94) null, field128[arg4], 0, var20, var21);
            if (var9.field812) {
                if (arg4 == 0) {
                    Statics.field1155[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1155[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1155[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1155[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field798 != 0 && arg7 != null) {
                arg7.method3154(arg1, arg2, arg5, arg4, var9.field799);
            }
        } else if (arg5 == 9) {
            class94 var30;
            if (var9.field804 == -1 && var9.field823 == null) {
                var30 = var9.method625(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1827(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field798 != 0 && arg7 != null) {
                arg7.method3178(arg1, arg2, var10, var11, var9.field799);
            }
            if (var9.field782 != 16) {
                arg6.method1833(arg0, arg1, arg2, var9.field782);
            }
        } else if (arg5 == 4) {
            class94 var31;
            if (var9.field804 == -1 && var9.field823 == null) {
                var31 = var9.method625(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1826(arg0, arg1, arg2, var17, var31, (class94) null, field138[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1842(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class32.method1131(var33 >> 14 & 0x7FFF).field782;
            }
            class94 var34;
            if (var9.field804 == -1 && var9.field823 == null) {
                var34 = var9.method625(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1826(arg0, arg1, arg2, var17, var34, (class94) null, field138[arg4], 0, field129[arg4] * var32, field118[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1842(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method1131(var36 >> 14 & 0x7FFF).field782 / 2;
            }
            class94 var37;
            if (var9.field804 == -1 && var9.field823 == null) {
                var37 = var9.method625(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1826(arg0, arg1, arg2, var17, var37, (class94) null, 256, arg4, field131[arg4] * var35, field132[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class94 var39;
            if (var9.field804 == -1 && var9.field823 == null) {
                var39 = var9.method625(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1826(arg0, arg1, arg2, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1842(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class32.method1131(var41 >> 14 & 0x7FFF).field782 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field804 == -1 && var9.field823 == null) {
                var43 = var9.method625(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method625(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field804, true, (class94) null);
                var44 = new class14(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field804, true, (class94) null);
            }
            arg6.method1826(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field131[arg4] * var40, field132[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("q.v(III)I")
    public static final int method29(int arg0, int arg1) {
        int var2 = method53(arg0 + 45365, arg1 + 91923, 4) - 128 + (method53(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method53(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("w.w(IIII)I")
    public static final int method53(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2850(var3, var5);
        int var8 = method2850(var3 + 1, var5);
        int var9 = method2850(var3, var5 + 1);
        int var10 = method2850(var3 + 1, var5 + 1);
        int var11 = method1587(var7, var8, var4, arg2);
        int var12 = method1587(var9, var10, var4, arg2);
        return method1587(var11, var12, var6, arg2);
    }

    @ObfuscatedName("co.l(IIIII)I")
    public static final int method1587(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1731[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ef.s(III)I")
    public static final int method2850(int arg0, int arg1) {
        int var2 = method1504(arg0 - 1, arg1 - 1) + method1504(arg0 + 1, arg1 - 1) + method1504(arg0 - 1, arg1 + 1) + method1504(arg0 + 1, arg1 + 1);
        int var3 = method1504(arg0 - 1, arg1) + method1504(arg0 + 1, arg1) + method1504(arg0, arg1 - 1) + method1504(arg0, arg1 + 1);
        int var4 = method1504(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("by.n(IIB)I")
    public static final int method1504(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("t.c(III)I")
    public static final int method141(int arg0, int arg1) {
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

    @ObfuscatedName("k.h(III)I")
    public static final int method20(int arg0, int arg1) {
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

    @ObfuscatedName("bo.u(IIIB)I")
    public static final int method1457(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("v.y(III)Z")
    public static final boolean method38(int arg0, int arg1) {
        class32 var2 = class32.method1131(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method619(arg1);
    }
}
