package deob;

@ObfuscatedName("gv")
public class class183 {

    @ObfuscatedName("gv.q")
    public static int[][] field2129 = new int[128][128];

    @ObfuscatedName("gv.j")
    public static int[][] field2127 = new int[128][128];

    @ObfuscatedName("gv.u")
    public static int[] field2132 = new int[4096];

    @ObfuscatedName("gv.a")
    public static int[] field2128 = new int[4096];

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.m(IIILga;Lfz;Z[I[IB)I")
    public static int method2023(int arg0, int arg1, int arg2, class184 arg3, class182 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field2129[var8][var9] = 0;
                field2127[var8][var9] = 99999999;
            }
        }
        boolean var10;
        if (arg2 == 1) {
            var10 = method1918(arg0, arg1, arg3, arg4);
        } else if (arg2 == 2) {
            var10 = method2022(arg0, arg1, arg3, arg4);
        } else {
            var10 = method1662(arg0, arg1, arg2, arg3, arg4);
        }
        int var11 = arg0 - 64;
        int var12 = arg1 - 64;
        int var13 = Statics.field2133;
        int var14 = Statics.field667;
        if (!var10) {
            if (!arg5) {
                return -1;
            }
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MAX_VALUE;
            byte var17 = 10;
            int var18 = arg3.field2138;
            int var19 = arg3.field2141;
            int var20 = arg3.field2137;
            int var21 = arg3.field2140;
            for (int var22 = var18 - var17; var22 <= var17 + var18; var22++) {
                for (int var23 = var19 - var17; var23 <= var17 + var19; var23++) {
                    int var24 = var22 - var11;
                    int var25 = var23 - var12;
                    if (var24 >= 0 && var25 >= 0 && var24 < 128 && var25 < 128 && field2127[var24][var25] < 100) {
                        int var26 = 0;
                        if (var22 < var18) {
                            var26 = var18 - var22;
                        } else if (var22 > var18 + var20 - 1) {
                            var26 = var22 - (var18 + var20 - 1);
                        }
                        int var27 = 0;
                        if (var23 < var19) {
                            var27 = var19 - var23;
                        } else if (var23 > var19 + var21 - 1) {
                            var27 = var23 - (var19 + var21 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var15 || var15 == var28 && field2127[var24][var25] < var16) {
                            var15 = var28;
                            var16 = field2127[var24][var25];
                            var13 = var22;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var15 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var13 && arg1 == var14) {
            return 0;
        }
        byte var29 = 0;
        field2132[var29] = var13;
        int var34 = var29 + 1;
        field2128[var29] = var14;
        int var30;
        int var31 = var30 = field2129[var13 - var11][var14 - var12];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field2132[var34] = var13;
                field2128[var34++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = field2129[var13 - var11][var14 - var12];
        }
        int var32 = 0;
        while (var34-- > 0) {
            arg6[var32] = field2132[var34];
            arg7[var32++] = field2128[var34];
            if (var32 >= arg6.length) {
                break;
            }
        }
        return var32;
    }

    @ObfuscatedName("ce.o(IILga;Lfz;S)Z")
    public static final boolean method1918(int arg0, int arg1, class184 arg2, class182 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2129[var6][var7] = 99;
        field2127[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2132[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2128[var10001] = arg1;
        int[][] var12 = arg3.field2123;
        while (var18 != var11) {
            var4 = field2132[var11];
            var5 = field2128[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2122;
            int var16 = var5 - arg3.field2120;
            if (arg2.method1121(1, var4, var5, arg3)) {
                Statics.field2133 = var4;
                Statics.field667 = var5;
                return true;
            }
            int var17 = field2127[var13][var14] + 1;
            if (var13 > 0 && field2129[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                field2132[var18] = var4 - 1;
                field2128[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 - 1][var14] = 2;
                field2127[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && field2129[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                field2132[var18] = var4 + 1;
                field2128[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 + 1][var14] = 8;
                field2127[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2129[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2132[var18] = var4;
                field2128[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13][var14 - 1] = 1;
                field2127[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && field2129[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2132[var18] = var4;
                field2128[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13][var14 + 1] = 4;
                field2127[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2129[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2132[var18] = var4 - 1;
                field2128[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 - 1][var14 - 1] = 3;
                field2127[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && field2129[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2132[var18] = var4 + 1;
                field2128[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 + 1][var14 - 1] = 9;
                field2127[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && field2129[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2132[var18] = var4 - 1;
                field2128[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 - 1][var14 + 1] = 6;
                field2127[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && field2129[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2132[var18] = var4 + 1;
                field2128[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 + 1][var14 + 1] = 12;
                field2127[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field2133 = var4;
        Statics.field667 = var5;
        return false;
    }

    @ObfuscatedName("ca.q(IILga;Lfz;I)Z")
    public static final boolean method2022(int arg0, int arg1, class184 arg2, class182 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2129[var6][var7] = 99;
        field2127[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2132[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2128[var10001] = arg1;
        int[][] var12 = arg3.field2123;
        while (var18 != var11) {
            var4 = field2132[var11];
            var5 = field2128[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2122;
            int var16 = var5 - arg3.field2120;
            if (arg2.method1121(2, var4, var5, arg3)) {
                Statics.field2133 = var4;
                Statics.field667 = var5;
                return true;
            }
            int var17 = field2127[var13][var14] + 1;
            if (var13 > 0 && field2129[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field2132[var18] = var4 - 1;
                field2128[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 - 1][var14] = 2;
                field2127[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field2129[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field2132[var18] = var4 + 1;
                field2128[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 + 1][var14] = 8;
                field2127[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2129[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field2132[var18] = var4;
                field2128[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13][var14 - 1] = 1;
                field2127[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field2129[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field2132[var18] = var4;
                field2128[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13][var14 + 1] = 4;
                field2127[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2129[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field2132[var18] = var4 - 1;
                field2128[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 - 1][var14 - 1] = 3;
                field2127[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field2129[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field2132[var18] = var4 + 1;
                field2128[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 + 1][var14 - 1] = 9;
                field2127[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field2129[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field2132[var18] = var4 - 1;
                field2128[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 - 1][var14 + 1] = 6;
                field2127[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field2129[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field2132[var18] = var4 + 1;
                field2128[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2129[var13 + 1][var14 + 1] = 12;
                field2127[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field2133 = var4;
        Statics.field667 = var5;
        return false;
    }

    @ObfuscatedName("ch.j(IIILga;Lfz;I)Z")
    public static final boolean method1662(int arg0, int arg1, int arg2, class184 arg3, class182 arg4) {
        int var5 = arg0;
        int var6 = arg1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = arg0 - var7;
        int var10 = arg1 - var8;
        field2129[var7][var8] = 99;
        field2127[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        field2132[var11] = arg0;
        int var27 = var11 + 1;
        field2128[var11] = arg1;
        int[][] var13 = arg4.field2123;
        while (true) {
            label265: while (true) {
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                do {
                    do {
                        do {
                            label242: do {
                                if (var27 == var12) {
                                    Statics.field2133 = var5;
                                    Statics.field667 = var6;
                                    return false;
                                }
                                var5 = field2132[var12];
                                var6 = field2128[var12];
                                var12 = var12 + 1 & 0xFFF;
                                var14 = var5 - var9;
                                var15 = var6 - var10;
                                var16 = var5 - arg4.field2122;
                                var17 = var6 - arg4.field2120;
                                if (arg3.method1121(arg2, var5, var6, arg4)) {
                                    Statics.field2133 = var5;
                                    Statics.field667 = var6;
                                    return true;
                                }
                                var18 = field2127[var14][var15] + 1;
                                if (var14 > 0 && field2129[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 0x124010E) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 0x1240138) == 0) {
                                    int var19 = 1;
                                    while (true) {
                                        if (var19 >= arg2 - 1) {
                                            field2132[var27] = var5 - 1;
                                            field2128[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2129[var14 - 1][var15] = 2;
                                            field2127[var14 - 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 + var19] & 0x124013E) != 0) {
                                            break;
                                        }
                                        var19++;
                                    }
                                }
                                if (var14 < 128 - arg2 && field2129[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 0x1240183) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 0x12401E0) == 0) {
                                    int var20 = 1;
                                    while (true) {
                                        if (var20 >= arg2 - 1) {
                                            field2132[var27] = var5 + 1;
                                            field2128[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2129[var14 + 1][var15] = 8;
                                            field2127[var14 + 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 + var20] & 0x12401E3) != 0) {
                                            break;
                                        }
                                        var20++;
                                    }
                                }
                                if (var15 > 0 && field2129[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 0x124010E) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 0x1240183) == 0) {
                                    int var21 = 1;
                                    while (true) {
                                        if (var21 >= arg2 - 1) {
                                            field2132[var27] = var5;
                                            field2128[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2129[var14][var15 - 1] = 1;
                                            field2127[var14][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var21][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var21++;
                                    }
                                }
                                if (var15 < 128 - arg2 && field2129[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 0x1240138) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 0x12401E0) == 0) {
                                    int var22 = 1;
                                    while (true) {
                                        if (var22 >= arg2 - 1) {
                                            field2132[var27] = var5;
                                            field2128[var27] = var6 + 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2129[var14][var15 + 1] = 4;
                                            field2127[var14][var15 + 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var22][arg2 + var17] & 0x12401F8) != 0) {
                                            break;
                                        }
                                        var22++;
                                    }
                                }
                                if (var14 > 0 && var15 > 0 && field2129[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 0x124010E) == 0) {
                                    int var23 = 1;
                                    while (true) {
                                        if (var23 >= arg2) {
                                            field2132[var27] = var5 - 1;
                                            field2128[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2129[var14 - 1][var15 - 1] = 3;
                                            field2127[var14 - 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 - 1 + var23] & 0x124013E) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var23++;
                                    }
                                }
                                if (var14 < 128 - arg2 && var15 > 0 && field2129[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 0x1240183) == 0) {
                                    int var24 = 1;
                                    while (true) {
                                        if (var24 >= arg2) {
                                            field2132[var27] = var5 + 1;
                                            field2128[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2129[var14 + 1][var15 - 1] = 9;
                                            field2127[var14 + 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 - 1 + var24] & 0x12401E3) != 0 || (var13[var16 + var24][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var24++;
                                    }
                                }
                                if (var14 > 0 && var15 < 128 - arg2 && field2129[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 0x1240138) == 0) {
                                    for (int var25 = 1; var25 < arg2; var25++) {
                                        if ((var13[var16 - 1][var17 + var25] & 0x124013E) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 0x12401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    field2132[var27] = var5 - 1;
                                    field2128[var27] = var6 + 1;
                                    var27 = var27 + 1 & 0xFFF;
                                    field2129[var14 - 1][var15 + 1] = 6;
                                    field2127[var14 - 1][var15 + 1] = var18;
                                }
                            } while (var14 >= 128 - arg2);
                        } while (var15 >= 128 - arg2);
                    } while (field2129[var14 + 1][var15 + 1] != 0);
                } while ((var13[arg2 + var16][arg2 + var17] & 0x12401E0) != 0);
                for (int var26 = 1; var26 < arg2; var26++) {
                    if ((var13[var16 + var26][arg2 + var17] & 0x12401F8) != 0 || (var13[arg2 + var16][var17 + var26] & 0x12401E3) != 0) {
                        continue label265;
                    }
                }
                field2132[var27] = var5 + 1;
                field2128[var27] = var6 + 1;
                var27 = var27 + 1 & 0xFFF;
                field2129[var14 + 1][var15 + 1] = 12;
                field2127[var14 + 1][var15 + 1] = var18;
            }
        }
    }
}
