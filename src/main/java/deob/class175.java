package deob;

@ObfuscatedName("fs")
public class class175 {

    @ObfuscatedName("fs.s")
    public static int[][] field1990 = new int[128][128];

    @ObfuscatedName("fs.a")
    public static int[][] field1989 = new int[128][128];

    @ObfuscatedName("fs.p")
    public static int[] field1993 = new int[4096];

    @ObfuscatedName("fs.j")
    public static int[] field1994 = new int[4096];

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gb.i(IILfc;Lfq;I)Z")
    public static final boolean method3566(int arg0, int arg1, class174 arg2, class173 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field1990[var6][var7] = 99;
        field1989[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field1993[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field1994[var10001] = arg1;
        int[][] var12 = arg3.field1979;
        while (var18 != var11) {
            var4 = field1993[var11];
            var5 = field1994[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1975;
            int var16 = var5 - arg3.field1976;
            if (arg2.method1075(2, var4, var5, arg3)) {
                Statics.field1980 = var4;
                Statics.field846 = var5;
                return true;
            }
            int var17 = field1989[var13][var14] + 1;
            if (var13 > 0 && field1990[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field1993[var18] = var4 - 1;
                field1994[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1990[var13 - 1][var14] = 2;
                field1989[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field1990[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field1993[var18] = var4 + 1;
                field1994[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field1990[var13 + 1][var14] = 8;
                field1989[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field1990[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field1993[var18] = var4;
                field1994[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1990[var13][var14 - 1] = 1;
                field1989[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field1990[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field1993[var18] = var4;
                field1994[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1990[var13][var14 + 1] = 4;
                field1989[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field1990[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field1993[var18] = var4 - 1;
                field1994[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1990[var13 - 1][var14 - 1] = 3;
                field1989[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field1990[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field1993[var18] = var4 + 1;
                field1994[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field1990[var13 + 1][var14 - 1] = 9;
                field1989[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field1990[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field1993[var18] = var4 - 1;
                field1994[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1990[var13 - 1][var14 + 1] = 6;
                field1989[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field1990[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field1993[var18] = var4 + 1;
                field1994[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field1990[var13 + 1][var14 + 1] = 12;
                field1989[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field1980 = var4;
        Statics.field846 = var5;
        return false;
    }

    @ObfuscatedName("lq.w(IIILfc;Lfq;S)Z")
    public static final boolean method5283(int arg0, int arg1, int arg2, class174 arg3, class173 arg4) {
        int var5 = arg0;
        int var6 = arg1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = arg0 - var7;
        int var10 = arg1 - var8;
        field1990[var7][var8] = 99;
        field1989[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        field1993[var11] = arg0;
        int var27 = var11 + 1;
        field1994[var11] = arg1;
        int[][] var13 = arg4.field1979;
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
                                    Statics.field1980 = var5;
                                    Statics.field846 = var6;
                                    return false;
                                }
                                var5 = field1993[var12];
                                var6 = field1994[var12];
                                var12 = var12 + 1 & 0xFFF;
                                var14 = var5 - var9;
                                var15 = var6 - var10;
                                var16 = var5 - arg4.field1975;
                                var17 = var6 - arg4.field1976;
                                if (arg3.method1075(arg2, var5, var6, arg4)) {
                                    Statics.field1980 = var5;
                                    Statics.field846 = var6;
                                    return true;
                                }
                                var18 = field1989[var14][var15] + 1;
                                if (var14 > 0 && field1990[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 0x124010E) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 0x1240138) == 0) {
                                    int var19 = 1;
                                    while (true) {
                                        if (var19 >= arg2 - 1) {
                                            field1993[var27] = var5 - 1;
                                            field1994[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1990[var14 - 1][var15] = 2;
                                            field1989[var14 - 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 + var19] & 0x124013E) != 0) {
                                            break;
                                        }
                                        var19++;
                                    }
                                }
                                if (var14 < 128 - arg2 && field1990[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 0x1240183) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 0x12401E0) == 0) {
                                    int var20 = 1;
                                    while (true) {
                                        if (var20 >= arg2 - 1) {
                                            field1993[var27] = var5 + 1;
                                            field1994[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1990[var14 + 1][var15] = 8;
                                            field1989[var14 + 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 + var20] & 0x12401E3) != 0) {
                                            break;
                                        }
                                        var20++;
                                    }
                                }
                                if (var15 > 0 && field1990[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 0x124010E) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 0x1240183) == 0) {
                                    int var21 = 1;
                                    while (true) {
                                        if (var21 >= arg2 - 1) {
                                            field1993[var27] = var5;
                                            field1994[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1990[var14][var15 - 1] = 1;
                                            field1989[var14][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var21][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var21++;
                                    }
                                }
                                if (var15 < 128 - arg2 && field1990[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 0x1240138) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 0x12401E0) == 0) {
                                    int var22 = 1;
                                    while (true) {
                                        if (var22 >= arg2 - 1) {
                                            field1993[var27] = var5;
                                            field1994[var27] = var6 + 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1990[var14][var15 + 1] = 4;
                                            field1989[var14][var15 + 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var22][arg2 + var17] & 0x12401F8) != 0) {
                                            break;
                                        }
                                        var22++;
                                    }
                                }
                                if (var14 > 0 && var15 > 0 && field1990[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 0x124010E) == 0) {
                                    int var23 = 1;
                                    while (true) {
                                        if (var23 >= arg2) {
                                            field1993[var27] = var5 - 1;
                                            field1994[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1990[var14 - 1][var15 - 1] = 3;
                                            field1989[var14 - 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 - 1 + var23] & 0x124013E) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var23++;
                                    }
                                }
                                if (var14 < 128 - arg2 && var15 > 0 && field1990[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 0x1240183) == 0) {
                                    int var24 = 1;
                                    while (true) {
                                        if (var24 >= arg2) {
                                            field1993[var27] = var5 + 1;
                                            field1994[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field1990[var14 + 1][var15 - 1] = 9;
                                            field1989[var14 + 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 - 1 + var24] & 0x12401E3) != 0 || (var13[var16 + var24][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var24++;
                                    }
                                }
                                if (var14 > 0 && var15 < 128 - arg2 && field1990[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 0x1240138) == 0) {
                                    for (int var25 = 1; var25 < arg2; var25++) {
                                        if ((var13[var16 - 1][var17 + var25] & 0x124013E) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 0x12401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    field1993[var27] = var5 - 1;
                                    field1994[var27] = var6 + 1;
                                    var27 = var27 + 1 & 0xFFF;
                                    field1990[var14 - 1][var15 + 1] = 6;
                                    field1989[var14 - 1][var15 + 1] = var18;
                                }
                            } while (var14 >= 128 - arg2);
                        } while (var15 >= 128 - arg2);
                    } while (field1990[var14 + 1][var15 + 1] != 0);
                } while ((var13[arg2 + var16][arg2 + var17] & 0x12401E0) != 0);
                for (int var26 = 1; var26 < arg2; var26++) {
                    if ((var13[var16 + var26][arg2 + var17] & 0x12401F8) != 0 || (var13[arg2 + var16][var17 + var26] & 0x12401E3) != 0) {
                        continue label265;
                    }
                }
                field1993[var27] = var5 + 1;
                field1994[var27] = var6 + 1;
                var27 = var27 + 1 & 0xFFF;
                field1990[var14 + 1][var15 + 1] = 12;
                field1989[var14 + 1][var15 + 1] = var18;
            }
        }
    }
}
