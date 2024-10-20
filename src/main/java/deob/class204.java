package deob;

@ObfuscatedName("gi")
public class class204 {

    @ObfuscatedName("gi.c")
    public static int[][] field2296 = new int[128][128];

    @ObfuscatedName("gi.x")
    public static int[][] field2293 = new int[128][128];

    @ObfuscatedName("gi.d")
    public static int[] field2290 = new int[4096];

    @ObfuscatedName("gi.n")
    public static int[] field2294 = new int[4096];

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.a(IIILgv;Lgr;I)Z")
    public static final boolean method497(int arg0, int arg1, int arg2, class202 arg3, class201 arg4) {
        int var5 = arg0;
        int var6 = arg1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = arg0 - var7;
        int var10 = arg1 - var8;
        field2296[var7][var8] = 99;
        field2293[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        field2290[var11] = arg0;
        int var27 = var11 + 1;
        field2294[var11] = arg1;
        int[][] var13 = arg4.field2273;
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
                                    Statics.field2292 = var5;
                                    Statics.field2295 = var6;
                                    return false;
                                }
                                var5 = field2290[var12];
                                var6 = field2294[var12];
                                var12 = var12 + 1 & 0xFFF;
                                var14 = var5 - var9;
                                var15 = var6 - var10;
                                var16 = var5 - arg4.field2265;
                                var17 = var6 - arg4.field2270;
                                if (arg3.method1105(arg2, var5, var6, arg4)) {
                                    Statics.field2292 = var5;
                                    Statics.field2295 = var6;
                                    return true;
                                }
                                var18 = field2293[var14][var15] + 1;
                                if (var14 > 0 && field2296[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 0x124010E) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 0x1240138) == 0) {
                                    int var19 = 1;
                                    while (true) {
                                        if (var19 >= arg2 - 1) {
                                            field2290[var27] = var5 - 1;
                                            field2294[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2296[var14 - 1][var15] = 2;
                                            field2293[var14 - 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 + var19] & 0x124013E) != 0) {
                                            break;
                                        }
                                        var19++;
                                    }
                                }
                                if (var14 < 128 - arg2 && field2296[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 0x1240183) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 0x12401E0) == 0) {
                                    int var20 = 1;
                                    while (true) {
                                        if (var20 >= arg2 - 1) {
                                            field2290[var27] = var5 + 1;
                                            field2294[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2296[var14 + 1][var15] = 8;
                                            field2293[var14 + 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 + var20] & 0x12401E3) != 0) {
                                            break;
                                        }
                                        var20++;
                                    }
                                }
                                if (var15 > 0 && field2296[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 0x124010E) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 0x1240183) == 0) {
                                    int var21 = 1;
                                    while (true) {
                                        if (var21 >= arg2 - 1) {
                                            field2290[var27] = var5;
                                            field2294[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2296[var14][var15 - 1] = 1;
                                            field2293[var14][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var21][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var21++;
                                    }
                                }
                                if (var15 < 128 - arg2 && field2296[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 0x1240138) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 0x12401E0) == 0) {
                                    int var22 = 1;
                                    while (true) {
                                        if (var22 >= arg2 - 1) {
                                            field2290[var27] = var5;
                                            field2294[var27] = var6 + 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2296[var14][var15 + 1] = 4;
                                            field2293[var14][var15 + 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var22][arg2 + var17] & 0x12401F8) != 0) {
                                            break;
                                        }
                                        var22++;
                                    }
                                }
                                if (var14 > 0 && var15 > 0 && field2296[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 0x124010E) == 0) {
                                    int var23 = 1;
                                    while (true) {
                                        if (var23 >= arg2) {
                                            field2290[var27] = var5 - 1;
                                            field2294[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2296[var14 - 1][var15 - 1] = 3;
                                            field2293[var14 - 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 - 1 + var23] & 0x124013E) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var23++;
                                    }
                                }
                                if (var14 < 128 - arg2 && var15 > 0 && field2296[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 0x1240183) == 0) {
                                    int var24 = 1;
                                    while (true) {
                                        if (var24 >= arg2) {
                                            field2290[var27] = var5 + 1;
                                            field2294[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2296[var14 + 1][var15 - 1] = 9;
                                            field2293[var14 + 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 - 1 + var24] & 0x12401E3) != 0 || (var13[var16 + var24][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var24++;
                                    }
                                }
                                if (var14 > 0 && var15 < 128 - arg2 && field2296[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 0x1240138) == 0) {
                                    for (int var25 = 1; var25 < arg2; var25++) {
                                        if ((var13[var16 - 1][var17 + var25] & 0x124013E) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 0x12401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    field2290[var27] = var5 - 1;
                                    field2294[var27] = var6 + 1;
                                    var27 = var27 + 1 & 0xFFF;
                                    field2296[var14 - 1][var15 + 1] = 6;
                                    field2293[var14 - 1][var15 + 1] = var18;
                                }
                            } while (var14 >= 128 - arg2);
                        } while (var15 >= 128 - arg2);
                    } while (field2296[var14 + 1][var15 + 1] != 0);
                } while ((var13[arg2 + var16][arg2 + var17] & 0x12401E0) != 0);
                for (int var26 = 1; var26 < arg2; var26++) {
                    if ((var13[var16 + var26][arg2 + var17] & 0x12401F8) != 0 || (var13[arg2 + var16][var17 + var26] & 0x12401E3) != 0) {
                        continue label265;
                    }
                }
                field2290[var27] = var5 + 1;
                field2294[var27] = var6 + 1;
                var27 = var27 + 1 & 0xFFF;
                field2296[var14 + 1][var15 + 1] = 12;
                field2293[var14 + 1][var15 + 1] = var18;
            }
        }
    }
}
