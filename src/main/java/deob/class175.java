package deob;

@ObfuscatedName("fp")
public class class175 {

    @ObfuscatedName("fp.m")
    public static int[][] field1987 = new int[128][128];

    @ObfuscatedName("fp.k")
    public static int[][] field1986 = new int[128][128];

    @ObfuscatedName("fp.a")
    public static int[] field1989 = new int[4096];

    @ObfuscatedName("fp.u")
    public static int[] field1990 = new int[4096];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gp.n(IIILfw;Lfk;Z[I[II)I")
    public static int method3602(int arg0, int arg1, int arg2, class174 arg3, class173 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field1987[var8][var9] = 0;
                field1986[var8][var9] = 99999999;
            }
        }
        boolean var10;
        if (arg2 == 1) {
            var10 = method1771(arg0, arg1, arg3, arg4);
        } else if (arg2 == 2) {
            var10 = method2572(arg0, arg1, arg3, arg4);
        } else {
            var10 = method2342(arg0, arg1, arg2, arg3, arg4);
        }
        int var11 = arg0 - 64;
        int var12 = arg1 - 64;
        int var13 = Statics.field1602;
        int var14 = Statics.field1992;
        if (!var10) {
            if (!arg5) {
                return -1;
            }
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MAX_VALUE;
            byte var17 = 10;
            int var18 = arg3.field1980;
            int var19 = arg3.field1982;
            int var20 = arg3.field1981;
            int var21 = arg3.field1979;
            for (int var22 = var18 - var17; var22 <= var17 + var18; var22++) {
                for (int var23 = var19 - var17; var23 <= var17 + var19; var23++) {
                    int var24 = var22 - var11;
                    int var25 = var23 - var12;
                    if (var24 >= 0 && var25 >= 0 && var24 < 128 && var25 < 128 && field1986[var24][var25] < 100) {
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
                        if (var28 < var15 || var15 == var28 && field1986[var24][var25] < var16) {
                            var15 = var28;
                            var16 = field1986[var24][var25];
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
        field1989[var29] = var13;
        int var34 = var29 + 1;
        field1990[var29] = var14;
        int var30;
        int var31 = var30 = field1987[var13 - var11][var14 - var12];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field1989[var34] = var13;
                field1990[var34++] = var14;
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
            var31 = field1987[var13 - var11][var14 - var12];
        }
        int var32 = 0;
        while (var34-- > 0) {
            arg6[var32] = field1989[var34];
            arg7[var32++] = field1990[var34];
            if (var32 >= arg6.length) {
                break;
            }
        }
        return var32;
    }

    @ObfuscatedName("bu.c(IILfw;Lfk;I)Z")
    public static final boolean method1771(int arg0, int arg1, class174 arg2, class173 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field1987[var6][var7] = 99;
        field1986[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field1989[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field1990[var10001] = arg1;
        int[][] var12 = arg3.field1969;
        while (var18 != var11) {
            var4 = field1989[var11];
            var5 = field1990[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1973;
            int var16 = var5 - arg3.field1972;
            if (arg2.method1047(1, var4, var5, arg3)) {
                Statics.field1602 = var4;
                Statics.field1992 = var5;
                return true;
            }
            int var17 = field1986[var13][var14] + 1;
            if (var13 > 0 && field1987[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                field1989[var18] = var4 - 1;
                field1990[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 - 1][var14] = 2;
                field1986[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && field1987[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                field1989[var18] = var4 + 1;
                field1990[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 + 1][var14] = 8;
                field1986[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field1987[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1989[var18] = var4;
                field1990[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13][var14 - 1] = 1;
                field1986[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && field1987[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1989[var18] = var4;
                field1990[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13][var14 + 1] = 4;
                field1986[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field1987[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1989[var18] = var4 - 1;
                field1990[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 - 1][var14 - 1] = 3;
                field1986[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && field1987[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field1989[var18] = var4 + 1;
                field1990[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 + 1][var14 - 1] = 9;
                field1986[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && field1987[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1989[var18] = var4 - 1;
                field1990[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 - 1][var14 + 1] = 6;
                field1986[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && field1987[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field1989[var18] = var4 + 1;
                field1990[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 + 1][var14 + 1] = 12;
                field1986[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field1602 = var4;
        Statics.field1992 = var5;
        return false;
    }

    @ObfuscatedName("es.m(IILfw;Lfk;I)Z")
    public static final boolean method2572(int arg0, int arg1, class174 arg2, class173 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field1987[var6][var7] = 99;
        field1986[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field1989[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field1990[var10001] = arg1;
        int[][] var12 = arg3.field1969;
        while (var18 != var11) {
            var4 = field1989[var11];
            var5 = field1990[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1973;
            int var16 = var5 - arg3.field1972;
            if (arg2.method1047(2, var4, var5, arg3)) {
                Statics.field1602 = var4;
                Statics.field1992 = var5;
                return true;
            }
            int var17 = field1986[var13][var14] + 1;
            if (var13 > 0 && field1987[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field1989[var18] = var4 - 1;
                field1990[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 - 1][var14] = 2;
                field1986[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field1987[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field1989[var18] = var4 + 1;
                field1990[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 + 1][var14] = 8;
                field1986[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field1987[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field1989[var18] = var4;
                field1990[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13][var14 - 1] = 1;
                field1986[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field1987[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field1989[var18] = var4;
                field1990[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13][var14 + 1] = 4;
                field1986[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field1987[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field1989[var18] = var4 - 1;
                field1990[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 - 1][var14 - 1] = 3;
                field1986[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field1987[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field1989[var18] = var4 + 1;
                field1990[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 + 1][var14 - 1] = 9;
                field1986[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field1987[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field1989[var18] = var4 - 1;
                field1990[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 - 1][var14 + 1] = 6;
                field1986[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field1987[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field1989[var18] = var4 + 1;
                field1990[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1987[var13 + 1][var14 + 1] = 12;
                field1986[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field1602 = var4;
        Statics.field1992 = var5;
        return false;
    }

    @ObfuscatedName("do.k(IIILfw;Lfk;B)Z")
    public static final boolean method2342(int arg0, int arg1, int arg2, class174 arg3, class173 arg4) {
        int var5 = arg0;
        int var6 = arg1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = arg0 - var7;
        int var10 = arg1 - var8;
        field1987[var7][var8] = 99;
        field1986[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        field1989[var11] = arg0;
        int var27 = var11 + 1;
        field1990[var11] = arg1;
        int[][] var13 = arg4.field1969;
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
                                    Statics.field1602 = var5;
                                    Statics.field1992 = var6;
                                    return false;
                                }
                                var5 = field1989[var12];
                                var6 = field1990[var12];
                                var12 = var12 + 1 & 0xFFF;
                                var14 = var5 - var9;
                                var15 = var6 - var10;
                                var16 = var5 - arg4.field1973;
                                var17 = var6 - arg4.field1972;
                                if (arg3.method1047(arg2, var5, var6, arg4)) {
                                    Statics.field1602 = var5;
                                    Statics.field1992 = var6;
                                    return true;
                                }
                                var18 = field1986[var14][var15] + 1;
                                if (var14 > 0 && field1987[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 0x124010E) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 0x1240138) == 0) {
                                    int var19 = 1;
                                    while (true) {
                                        if (var19 >= arg2 - 1) {
                                            field1989[var27] = var5 - 1;
                                            field1990[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1987[var14 - 1][var15] = 2;
                                            field1986[var14 - 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 + var19] & 0x124013E) != 0) {
                                            break;
                                        }
                                        var19++;
                                    }
                                }
                                if (var14 < 128 - arg2 && field1987[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 0x1240183) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 0x12401E0) == 0) {
                                    int var20 = 1;
                                    while (true) {
                                        if (var20 >= arg2 - 1) {
                                            field1989[var27] = var5 + 1;
                                            field1990[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1987[var14 + 1][var15] = 8;
                                            field1986[var14 + 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 + var20] & 0x12401E3) != 0) {
                                            break;
                                        }
                                        var20++;
                                    }
                                }
                                if (var15 > 0 && field1987[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 0x124010E) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 0x1240183) == 0) {
                                    int var21 = 1;
                                    while (true) {
                                        if (var21 >= arg2 - 1) {
                                            field1989[var27] = var5;
                                            field1990[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1987[var14][var15 - 1] = 1;
                                            field1986[var14][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var21][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var21++;
                                    }
                                }
                                if (var15 < 128 - arg2 && field1987[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 0x1240138) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 0x12401E0) == 0) {
                                    int var22 = 1;
                                    while (true) {
                                        if (var22 >= arg2 - 1) {
                                            field1989[var27] = var5;
                                            field1990[var27] = var6 + 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1987[var14][var15 + 1] = 4;
                                            field1986[var14][var15 + 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var22][arg2 + var17] & 0x12401F8) != 0) {
                                            break;
                                        }
                                        var22++;
                                    }
                                }
                                if (var14 > 0 && var15 > 0 && field1987[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 0x124010E) == 0) {
                                    int var23 = 1;
                                    while (true) {
                                        if (var23 >= arg2) {
                                            field1989[var27] = var5 - 1;
                                            field1990[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1987[var14 - 1][var15 - 1] = 3;
                                            field1986[var14 - 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 - 1 + var23] & 0x124013E) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var23++;
                                    }
                                }
                                if (var14 < 128 - arg2 && var15 > 0 && field1987[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 0x1240183) == 0) {
                                    int var24 = 1;
                                    while (true) {
                                        if (var24 >= arg2) {
                                            field1989[var27] = var5 + 1;
                                            field1990[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1987[var14 + 1][var15 - 1] = 9;
                                            field1986[var14 + 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 - 1 + var24] & 0x12401E3) != 0 || (var13[var16 + var24][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var24++;
                                    }
                                }
                                if (var14 > 0 && var15 < 128 - arg2 && field1987[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 0x1240138) == 0) {
                                    for (int var25 = 1; var25 < arg2; var25++) {
                                        if ((var13[var16 - 1][var17 + var25] & 0x124013E) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 0x12401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    field1989[var27] = var5 - 1;
                                    field1990[var27] = var6 + 1;
                                    var27 = var27 + 1 & 0xFFF;
                                    field1987[var14 - 1][var15 + 1] = 6;
                                    field1986[var14 - 1][var15 + 1] = var18;
                                }
                            } while (var14 >= 128 - arg2);
                        } while (var15 >= 128 - arg2);
                    } while (field1987[var14 + 1][var15 + 1] != 0);
                } while ((var13[arg2 + var16][arg2 + var17] & 0x12401E0) != 0);
                for (int var26 = 1; var26 < arg2; var26++) {
                    if ((var13[var16 + var26][arg2 + var17] & 0x12401F8) != 0 || (var13[arg2 + var16][var17 + var26] & 0x12401E3) != 0) {
                        continue label265;
                    }
                }
                field1989[var27] = var5 + 1;
                field1990[var27] = var6 + 1;
                var27 = var27 + 1 & 0xFFF;
                field1987[var14 + 1][var15 + 1] = 12;
                field1986[var14 + 1][var15 + 1] = var18;
            }
        }
    }
}
