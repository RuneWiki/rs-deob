package deob;

@ObfuscatedName("fr")
public class class168 {

    @ObfuscatedName("fr.o")
    public static int[][] field2089 = new int[128][128];

    @ObfuscatedName("fr.k")
    public static int[][] field2088 = new int[128][128];

    @ObfuscatedName("fr.p")
    public static int[] field2091 = new int[4096];

    @ObfuscatedName("fr.l")
    public static int[] field2092 = new int[4096];

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.v(IIILfz;Lfn;Z[I[II)I")
    public static int method2953(int arg0, int arg1, int arg2, class169 arg3, class167 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field2089[var8][var9] = 0;
                field2088[var8][var9] = 99999999;
            }
        }
        boolean var25;
        if (arg2 == 1) {
            int var10 = arg0;
            int var11 = arg1;
            byte var12 = 64;
            byte var13 = 64;
            int var14 = arg0 - var12;
            int var15 = arg1 - var13;
            field2089[var12][var13] = 99;
            field2088[var12][var13] = 0;
            byte var16 = 0;
            int var17 = 0;
            field2091[var16] = arg0;
            int var71 = var16 + 1;
            field2092[var16] = arg1;
            int[][] var18 = arg4.field2079;
            boolean var23;
            while (true) {
                if (var71 == var17) {
                    Statics.field2085 = var10;
                    Statics.field2776 = var11;
                    var23 = false;
                    break;
                }
                var10 = field2091[var17];
                var11 = field2092[var17];
                var17 = var17 + 1 & 0xFFF;
                int var19 = var10 - var14;
                int var20 = var11 - var15;
                int var21 = var10 - arg4.field2076;
                int var22 = var11 - arg4.field2077;
                if (arg3.method1027(1, var10, var11, arg4)) {
                    Statics.field2085 = var10;
                    Statics.field2776 = var11;
                    var23 = true;
                    break;
                }
                int var24 = field2088[var19][var20] + 1;
                if (var19 > 0 && field2089[var19 - 1][var20] == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0) {
                    field2091[var71] = var10 - 1;
                    field2092[var71] = var11;
                    var71 = var71 + 1 & 0xFFF;
                    field2089[var19 - 1][var20] = 2;
                    field2088[var19 - 1][var20] = var24;
                }
                if (var19 < 127 && field2089[var19 + 1][var20] == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0) {
                    field2091[var71] = var10 + 1;
                    field2092[var71] = var11;
                    var71 = var71 + 1 & 0xFFF;
                    field2089[var19 + 1][var20] = 8;
                    field2088[var19 + 1][var20] = var24;
                }
                if (var20 > 0 && field2089[var19][var20 - 1] == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2091[var71] = var10;
                    field2092[var71] = var11 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    field2089[var19][var20 - 1] = 1;
                    field2088[var19][var20 - 1] = var24;
                }
                if (var20 < 127 && field2089[var19][var20 + 1] == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2091[var71] = var10;
                    field2092[var71] = var11 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    field2089[var19][var20 + 1] = 4;
                    field2088[var19][var20 + 1] = var24;
                }
                if (var19 > 0 && var20 > 0 && field2089[var19 - 1][var20 - 1] == 0 && (var18[var21 - 1][var22 - 1] & 0x124010E) == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2091[var71] = var10 - 1;
                    field2092[var71] = var11 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    field2089[var19 - 1][var20 - 1] = 3;
                    field2088[var19 - 1][var20 - 1] = var24;
                }
                if (var19 < 127 && var20 > 0 && field2089[var19 + 1][var20 - 1] == 0 && (var18[var21 + 1][var22 - 1] & 0x1240183) == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2091[var71] = var10 + 1;
                    field2092[var71] = var11 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    field2089[var19 + 1][var20 - 1] = 9;
                    field2088[var19 + 1][var20 - 1] = var24;
                }
                if (var19 > 0 && var20 < 127 && field2089[var19 - 1][var20 + 1] == 0 && (var18[var21 - 1][var22 + 1] & 0x1240138) == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2091[var71] = var10 - 1;
                    field2092[var71] = var11 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    field2089[var19 - 1][var20 + 1] = 6;
                    field2088[var19 - 1][var20 + 1] = var24;
                }
                if (var19 < 127 && var20 < 127 && field2089[var19 + 1][var20 + 1] == 0 && (var18[var21 + 1][var22 + 1] & 0x12401E0) == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2091[var71] = var10 + 1;
                    field2092[var71] = var11 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    field2089[var19 + 1][var20 + 1] = 12;
                    field2088[var19 + 1][var20 + 1] = var24;
                }
            }
            var25 = var23;
        } else if (arg2 == 2) {
            var25 = method1070(arg0, arg1, arg3, arg4);
        } else {
            int var26 = arg0;
            int var27 = arg1;
            byte var28 = 64;
            byte var29 = 64;
            int var30 = arg0 - var28;
            int var31 = arg1 - var29;
            field2089[var28][var29] = 99;
            field2088[var28][var29] = 0;
            byte var32 = 0;
            int var33 = 0;
            field2091[var32] = arg0;
            int var72 = var32 + 1;
            field2092[var32] = arg1;
            int[][] var34 = arg4.field2079;
            boolean var39;
            label488: while (true) {
                label486: while (true) {
                    int var35;
                    int var36;
                    int var37;
                    int var38;
                    int var40;
                    do {
                        do {
                            do {
                                label463: do {
                                    if (var72 == var33) {
                                        Statics.field2085 = var26;
                                        Statics.field2776 = var27;
                                        var39 = false;
                                        break label488;
                                    }
                                    var26 = field2091[var33];
                                    var27 = field2092[var33];
                                    var33 = var33 + 1 & 0xFFF;
                                    var35 = var26 - var30;
                                    var36 = var27 - var31;
                                    var37 = var26 - arg4.field2076;
                                    var38 = var27 - arg4.field2077;
                                    if (arg3.method1027(arg2, var26, var27, arg4)) {
                                        Statics.field2085 = var26;
                                        Statics.field2776 = var27;
                                        var39 = true;
                                        break label488;
                                    }
                                    var40 = field2088[var35][var36] + 1;
                                    if (var35 > 0 && field2089[var35 - 1][var36] == 0 && (var34[var37 - 1][var38] & 0x124010E) == 0 && (var34[var37 - 1][arg2 + var38 - 1] & 0x1240138) == 0) {
                                        int var41 = 1;
                                        while (true) {
                                            if (var41 >= arg2 - 1) {
                                                field2091[var72] = var26 - 1;
                                                field2092[var72] = var27;
                                                var72 = var72 + 1 & 0xFFF;
                                                field2089[var35 - 1][var36] = 2;
                                                field2088[var35 - 1][var36] = var40;
                                                break;
                                            }
                                            if ((var34[var37 - 1][var38 + var41] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var41++;
                                        }
                                    }
                                    if (var35 < 128 - arg2 && field2089[var35 + 1][var36] == 0 && (var34[arg2 + var37][var38] & 0x1240183) == 0 && (var34[arg2 + var37][arg2 + var38 - 1] & 0x12401E0) == 0) {
                                        int var42 = 1;
                                        while (true) {
                                            if (var42 >= arg2 - 1) {
                                                field2091[var72] = var26 + 1;
                                                field2092[var72] = var27;
                                                var72 = var72 + 1 & 0xFFF;
                                                field2089[var35 + 1][var36] = 8;
                                                field2088[var35 + 1][var36] = var40;
                                                break;
                                            }
                                            if ((var34[arg2 + var37][var38 + var42] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var42++;
                                        }
                                    }
                                    if (var36 > 0 && field2089[var35][var36 - 1] == 0 && (var34[var37][var38 - 1] & 0x124010E) == 0 && (var34[arg2 + var37 - 1][var38 - 1] & 0x1240183) == 0) {
                                        int var43 = 1;
                                        while (true) {
                                            if (var43 >= arg2 - 1) {
                                                field2091[var72] = var26;
                                                field2092[var72] = var27 - 1;
                                                var72 = var72 + 1 & 0xFFF;
                                                field2089[var35][var36 - 1] = 1;
                                                field2088[var35][var36 - 1] = var40;
                                                break;
                                            }
                                            if ((var34[var37 + var43][var38 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var43++;
                                        }
                                    }
                                    if (var36 < 128 - arg2 && field2089[var35][var36 + 1] == 0 && (var34[var37][arg2 + var38] & 0x1240138) == 0 && (var34[arg2 + var37 - 1][arg2 + var38] & 0x12401E0) == 0) {
                                        int var44 = 1;
                                        while (true) {
                                            if (var44 >= arg2 - 1) {
                                                field2091[var72] = var26;
                                                field2092[var72] = var27 + 1;
                                                var72 = var72 + 1 & 0xFFF;
                                                field2089[var35][var36 + 1] = 4;
                                                field2088[var35][var36 + 1] = var40;
                                                break;
                                            }
                                            if ((var34[var37 + var44][arg2 + var38] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var44++;
                                        }
                                    }
                                    if (var35 > 0 && var36 > 0 && field2089[var35 - 1][var36 - 1] == 0 && (var34[var37 - 1][var38 - 1] & 0x124010E) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= arg2) {
                                                field2091[var72] = var26 - 1;
                                                field2092[var72] = var27 - 1;
                                                var72 = var72 + 1 & 0xFFF;
                                                field2089[var35 - 1][var36 - 1] = 3;
                                                field2088[var35 - 1][var36 - 1] = var40;
                                                break;
                                            }
                                            if ((var34[var37 - 1][var38 - 1 + var45] & 0x124013E) != 0 || (var34[var37 - 1 + var45][var38 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var35 < 128 - arg2 && var36 > 0 && field2089[var35 + 1][var36 - 1] == 0 && (var34[arg2 + var37][var38 - 1] & 0x1240183) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= arg2) {
                                                field2091[var72] = var26 + 1;
                                                field2092[var72] = var27 - 1;
                                                var72 = var72 + 1 & 0xFFF;
                                                field2089[var35 + 1][var36 - 1] = 9;
                                                field2088[var35 + 1][var36 - 1] = var40;
                                                break;
                                            }
                                            if ((var34[arg2 + var37][var38 - 1 + var46] & 0x12401E3) != 0 || (var34[var37 + var46][var38 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var35 > 0 && var36 < 128 - arg2 && field2089[var35 - 1][var36 + 1] == 0 && (var34[var37 - 1][arg2 + var38] & 0x1240138) == 0) {
                                        for (int var47 = 1; var47 < arg2; var47++) {
                                            if ((var34[var37 - 1][var38 + var47] & 0x124013E) != 0 || (var34[var37 - 1 + var47][arg2 + var38] & 0x12401F8) != 0) {
                                                continue label463;
                                            }
                                        }
                                        field2091[var72] = var26 - 1;
                                        field2092[var72] = var27 + 1;
                                        var72 = var72 + 1 & 0xFFF;
                                        field2089[var35 - 1][var36 + 1] = 6;
                                        field2088[var35 - 1][var36 + 1] = var40;
                                    }
                                } while (var35 >= 128 - arg2);
                            } while (var36 >= 128 - arg2);
                        } while (field2089[var35 + 1][var36 + 1] != 0);
                    } while ((var34[arg2 + var37][arg2 + var38] & 0x12401E0) != 0);
                    for (int var48 = 1; var48 < arg2; var48++) {
                        if ((var34[var37 + var48][arg2 + var38] & 0x12401F8) != 0 || (var34[arg2 + var37][var38 + var48] & 0x12401E3) != 0) {
                            continue label486;
                        }
                    }
                    field2091[var72] = var26 + 1;
                    field2092[var72] = var27 + 1;
                    var72 = var72 + 1 & 0xFFF;
                    field2089[var35 + 1][var36 + 1] = 12;
                    field2088[var35 + 1][var36 + 1] = var40;
                }
            }
            var25 = var39;
        }
        int var49 = arg0 - 64;
        int var50 = arg1 - 64;
        int var51 = Statics.field2085;
        int var52 = Statics.field2776;
        if (!var25) {
            if (!arg5) {
                return -1;
            }
            int var53 = Integer.MAX_VALUE;
            int var54 = Integer.MAX_VALUE;
            byte var55 = 10;
            int var56 = arg3.field2094;
            int var57 = arg3.field2093;
            int var58 = arg3.field2095;
            int var59 = arg3.field2096;
            for (int var60 = var56 - var55; var60 <= var55 + var56; var60++) {
                for (int var61 = var57 - var55; var61 <= var55 + var57; var61++) {
                    int var62 = var60 - var49;
                    int var63 = var61 - var50;
                    if (var62 >= 0 && var63 >= 0 && var62 < 128 && var63 < 128 && field2088[var62][var63] < 100) {
                        int var64 = 0;
                        if (var60 < var56) {
                            var64 = var56 - var60;
                        } else if (var60 > var56 + var58 - 1) {
                            var64 = var60 - (var56 + var58 - 1);
                        }
                        int var65 = 0;
                        if (var61 < var57) {
                            var65 = var57 - var61;
                        } else if (var61 > var57 + var59 - 1) {
                            var65 = var61 - (var57 + var59 - 1);
                        }
                        int var66 = var64 * var64 + var65 * var65;
                        if (var66 < var53 || var53 == var66 && field2088[var62][var63] < var54) {
                            var53 = var66;
                            var54 = field2088[var62][var63];
                            var51 = var60;
                            var52 = var61;
                        }
                    }
                }
            }
            if (var53 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var51 && arg1 == var52) {
            return 0;
        }
        byte var67 = 0;
        field2091[var67] = var51;
        int var73 = var67 + 1;
        field2092[var67] = var52;
        int var68;
        int var69 = var68 = field2089[var51 - var49][var52 - var50];
        while (arg0 != var51 || arg1 != var52) {
            if (var68 != var69) {
                var68 = var69;
                field2091[var73] = var51;
                field2092[var73++] = var52;
            }
            if ((var69 & 0x2) != 0) {
                var51++;
            } else if ((var69 & 0x8) != 0) {
                var51--;
            }
            if ((var69 & 0x1) != 0) {
                var52++;
            } else if ((var69 & 0x4) != 0) {
                var52--;
            }
            var69 = field2089[var51 - var49][var52 - var50];
        }
        int var70 = 0;
        while (var73-- > 0) {
            arg6[var70] = field2091[var73];
            arg7[var70++] = field2092[var73];
            if (var70 >= arg6.length) {
                break;
            }
        }
        return var70;
    }

    @ObfuscatedName("bp.s(IILfz;Lfn;I)Z")
    public static final boolean method1070(int arg0, int arg1, class169 arg2, class167 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2089[var6][var7] = 99;
        field2088[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2091[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2092[var10001] = arg1;
        int[][] var12 = arg3.field2079;
        while (var18 != var11) {
            var4 = field2091[var11];
            var5 = field2092[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2076;
            int var16 = var5 - arg3.field2077;
            if (arg2.method1027(2, var4, var5, arg3)) {
                Statics.field2085 = var4;
                Statics.field2776 = var5;
                return true;
            }
            int var17 = field2088[var13][var14] + 1;
            if (var13 > 0 && field2089[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field2091[var18] = var4 - 1;
                field2092[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2089[var13 - 1][var14] = 2;
                field2088[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field2089[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field2091[var18] = var4 + 1;
                field2092[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2089[var13 + 1][var14] = 8;
                field2088[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2089[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field2091[var18] = var4;
                field2092[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2089[var13][var14 - 1] = 1;
                field2088[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field2089[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field2091[var18] = var4;
                field2092[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2089[var13][var14 + 1] = 4;
                field2088[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2089[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field2091[var18] = var4 - 1;
                field2092[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2089[var13 - 1][var14 - 1] = 3;
                field2088[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field2089[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field2091[var18] = var4 + 1;
                field2092[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2089[var13 + 1][var14 - 1] = 9;
                field2088[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field2089[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field2091[var18] = var4 - 1;
                field2092[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2089[var13 - 1][var14 + 1] = 6;
                field2088[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field2089[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field2091[var18] = var4 + 1;
                field2092[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2089[var13 + 1][var14 + 1] = 12;
                field2088[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field2085 = var4;
        Statics.field2776 = var5;
        return false;
    }
}
