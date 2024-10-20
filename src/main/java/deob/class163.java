package deob;

@ObfuscatedName("fm")
public class class163 {

    @ObfuscatedName("fm.e")
    public static int[][] field2310 = new int[128][128];

    @ObfuscatedName("fm.p")
    public static int[][] field2308 = new int[128][128];

    @ObfuscatedName("fm.g")
    public static int[] field2314 = new int[4096];

    @ObfuscatedName("fm.v")
    public static int[] field2315 = new int[4096];

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.d(IIILfy;Lfq;Z[I[II)I")
    public static int method589(int arg0, int arg1, int arg2, class164 arg3, class162 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field2310[var8][var9] = 0;
                field2308[var8][var9] = 99999999;
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
            field2310[var12][var13] = 99;
            field2308[var12][var13] = 0;
            byte var16 = 0;
            int var17 = 0;
            field2314[var16] = arg0;
            int var86 = var16 + 1;
            field2315[var16] = arg1;
            int[][] var18 = arg4.field2298;
            boolean var23;
            while (true) {
                if (var86 == var17) {
                    Statics.field2312 = var10;
                    Statics.field2313 = var11;
                    var23 = false;
                    break;
                }
                var10 = field2314[var17];
                var11 = field2315[var17];
                var17 = var17 + 1 & 0xFFF;
                int var19 = var10 - var14;
                int var20 = var11 - var15;
                int var21 = var10 - arg4.field2294;
                int var22 = var11 - arg4.field2302;
                if (arg3.method1059(1, var10, var11, arg4)) {
                    Statics.field2312 = var10;
                    Statics.field2313 = var11;
                    var23 = true;
                    break;
                }
                int var24 = field2308[var19][var20] + 1;
                if (var19 > 0 && field2310[var19 - 1][var20] == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0) {
                    field2314[var86] = var10 - 1;
                    field2315[var86] = var11;
                    var86 = var86 + 1 & 0xFFF;
                    field2310[var19 - 1][var20] = 2;
                    field2308[var19 - 1][var20] = var24;
                }
                if (var19 < 127 && field2310[var19 + 1][var20] == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0) {
                    field2314[var86] = var10 + 1;
                    field2315[var86] = var11;
                    var86 = var86 + 1 & 0xFFF;
                    field2310[var19 + 1][var20] = 8;
                    field2308[var19 + 1][var20] = var24;
                }
                if (var20 > 0 && field2310[var19][var20 - 1] == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2314[var86] = var10;
                    field2315[var86] = var11 - 1;
                    var86 = var86 + 1 & 0xFFF;
                    field2310[var19][var20 - 1] = 1;
                    field2308[var19][var20 - 1] = var24;
                }
                if (var20 < 127 && field2310[var19][var20 + 1] == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2314[var86] = var10;
                    field2315[var86] = var11 + 1;
                    var86 = var86 + 1 & 0xFFF;
                    field2310[var19][var20 + 1] = 4;
                    field2308[var19][var20 + 1] = var24;
                }
                if (var19 > 0 && var20 > 0 && field2310[var19 - 1][var20 - 1] == 0 && (var18[var21 - 1][var22 - 1] & 0x124010E) == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2314[var86] = var10 - 1;
                    field2315[var86] = var11 - 1;
                    var86 = var86 + 1 & 0xFFF;
                    field2310[var19 - 1][var20 - 1] = 3;
                    field2308[var19 - 1][var20 - 1] = var24;
                }
                if (var19 < 127 && var20 > 0 && field2310[var19 + 1][var20 - 1] == 0 && (var18[var21 + 1][var22 - 1] & 0x1240183) == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2314[var86] = var10 + 1;
                    field2315[var86] = var11 - 1;
                    var86 = var86 + 1 & 0xFFF;
                    field2310[var19 + 1][var20 - 1] = 9;
                    field2308[var19 + 1][var20 - 1] = var24;
                }
                if (var19 > 0 && var20 < 127 && field2310[var19 - 1][var20 + 1] == 0 && (var18[var21 - 1][var22 + 1] & 0x1240138) == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2314[var86] = var10 - 1;
                    field2315[var86] = var11 + 1;
                    var86 = var86 + 1 & 0xFFF;
                    field2310[var19 - 1][var20 + 1] = 6;
                    field2308[var19 - 1][var20 + 1] = var24;
                }
                if (var19 < 127 && var20 < 127 && field2310[var19 + 1][var20 + 1] == 0 && (var18[var21 + 1][var22 + 1] & 0x12401E0) == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2314[var86] = var10 + 1;
                    field2315[var86] = var11 + 1;
                    var86 = var86 + 1 & 0xFFF;
                    field2310[var19 + 1][var20 + 1] = 12;
                    field2308[var19 + 1][var20 + 1] = var24;
                }
            }
            var25 = var23;
        } else if (arg2 == 2) {
            int var26 = arg0;
            int var27 = arg1;
            byte var28 = 64;
            byte var29 = 64;
            int var30 = arg0 - var28;
            int var31 = arg1 - var29;
            field2310[var28][var29] = 99;
            field2308[var28][var29] = 0;
            byte var32 = 0;
            int var33 = 0;
            field2314[var32] = arg0;
            int var87 = var32 + 1;
            field2315[var32] = arg1;
            int[][] var34 = arg4.field2298;
            boolean var39;
            while (true) {
                if (var87 == var33) {
                    Statics.field2312 = var26;
                    Statics.field2313 = var27;
                    var39 = false;
                    break;
                }
                var26 = field2314[var33];
                var27 = field2315[var33];
                var33 = var33 + 1 & 0xFFF;
                int var35 = var26 - var30;
                int var36 = var27 - var31;
                int var37 = var26 - arg4.field2294;
                int var38 = var27 - arg4.field2302;
                if (arg3.method1059(2, var26, var27, arg4)) {
                    Statics.field2312 = var26;
                    Statics.field2313 = var27;
                    var39 = true;
                    break;
                }
                int var40 = field2308[var35][var36] + 1;
                if (var35 > 0 && field2310[var35 - 1][var36] == 0 && (var34[var37 - 1][var38] & 0x124010E) == 0 && (var34[var37 - 1][var38 + 1] & 0x1240138) == 0) {
                    field2314[var87] = var26 - 1;
                    field2315[var87] = var27;
                    var87 = var87 + 1 & 0xFFF;
                    field2310[var35 - 1][var36] = 2;
                    field2308[var35 - 1][var36] = var40;
                }
                if (var35 < 126 && field2310[var35 + 1][var36] == 0 && (var34[var37 + 2][var38] & 0x1240183) == 0 && (var34[var37 + 2][var38 + 1] & 0x12401E0) == 0) {
                    field2314[var87] = var26 + 1;
                    field2315[var87] = var27;
                    var87 = var87 + 1 & 0xFFF;
                    field2310[var35 + 1][var36] = 8;
                    field2308[var35 + 1][var36] = var40;
                }
                if (var36 > 0 && field2310[var35][var36 - 1] == 0 && (var34[var37][var38 - 1] & 0x124010E) == 0 && (var34[var37 + 1][var38 - 1] & 0x1240183) == 0) {
                    field2314[var87] = var26;
                    field2315[var87] = var27 - 1;
                    var87 = var87 + 1 & 0xFFF;
                    field2310[var35][var36 - 1] = 1;
                    field2308[var35][var36 - 1] = var40;
                }
                if (var36 < 126 && field2310[var35][var36 + 1] == 0 && (var34[var37][var38 + 2] & 0x1240138) == 0 && (var34[var37 + 1][var38 + 2] & 0x12401E0) == 0) {
                    field2314[var87] = var26;
                    field2315[var87] = var27 + 1;
                    var87 = var87 + 1 & 0xFFF;
                    field2310[var35][var36 + 1] = 4;
                    field2308[var35][var36 + 1] = var40;
                }
                if (var35 > 0 && var36 > 0 && field2310[var35 - 1][var36 - 1] == 0 && (var34[var37 - 1][var38] & 0x124013E) == 0 && (var34[var37 - 1][var38 - 1] & 0x124010E) == 0 && (var34[var37][var38 - 1] & 0x124018F) == 0) {
                    field2314[var87] = var26 - 1;
                    field2315[var87] = var27 - 1;
                    var87 = var87 + 1 & 0xFFF;
                    field2310[var35 - 1][var36 - 1] = 3;
                    field2308[var35 - 1][var36 - 1] = var40;
                }
                if (var35 < 126 && var36 > 0 && field2310[var35 + 1][var36 - 1] == 0 && (var34[var37 + 1][var38 - 1] & 0x124018F) == 0 && (var34[var37 + 2][var38 - 1] & 0x1240183) == 0 && (var34[var37 + 2][var38] & 0x12401E3) == 0) {
                    field2314[var87] = var26 + 1;
                    field2315[var87] = var27 - 1;
                    var87 = var87 + 1 & 0xFFF;
                    field2310[var35 + 1][var36 - 1] = 9;
                    field2308[var35 + 1][var36 - 1] = var40;
                }
                if (var35 > 0 && var36 < 126 && field2310[var35 - 1][var36 + 1] == 0 && (var34[var37 - 1][var38 + 1] & 0x124013E) == 0 && (var34[var37 - 1][var38 + 2] & 0x1240138) == 0 && (var34[var37][var38 + 2] & 0x12401F8) == 0) {
                    field2314[var87] = var26 - 1;
                    field2315[var87] = var27 + 1;
                    var87 = var87 + 1 & 0xFFF;
                    field2310[var35 - 1][var36 + 1] = 6;
                    field2308[var35 - 1][var36 + 1] = var40;
                }
                if (var35 < 126 && var36 < 126 && field2310[var35 + 1][var36 + 1] == 0 && (var34[var37 + 1][var38 + 2] & 0x12401F8) == 0 && (var34[var37 + 2][var38 + 2] & 0x12401E0) == 0 && (var34[var37 + 2][var38 + 1] & 0x12401E3) == 0) {
                    field2314[var87] = var26 + 1;
                    field2315[var87] = var27 + 1;
                    var87 = var87 + 1 & 0xFFF;
                    field2310[var35 + 1][var36 + 1] = 12;
                    field2308[var35 + 1][var36 + 1] = var40;
                }
            }
            var25 = var39;
        } else {
            int var41 = arg0;
            int var42 = arg1;
            byte var43 = 64;
            byte var44 = 64;
            int var45 = arg0 - var43;
            int var46 = arg1 - var44;
            field2310[var43][var44] = 99;
            field2308[var43][var44] = 0;
            byte var47 = 0;
            int var48 = 0;
            field2314[var47] = arg0;
            int var88 = var47 + 1;
            field2315[var47] = arg1;
            int[][] var49 = arg4.field2298;
            boolean var54;
            label617: while (true) {
                label615: while (true) {
                    int var50;
                    int var51;
                    int var52;
                    int var53;
                    int var55;
                    do {
                        do {
                            do {
                                label592: do {
                                    if (var88 == var48) {
                                        Statics.field2312 = var41;
                                        Statics.field2313 = var42;
                                        var54 = false;
                                        break label617;
                                    }
                                    var41 = field2314[var48];
                                    var42 = field2315[var48];
                                    var48 = var48 + 1 & 0xFFF;
                                    var50 = var41 - var45;
                                    var51 = var42 - var46;
                                    var52 = var41 - arg4.field2294;
                                    var53 = var42 - arg4.field2302;
                                    if (arg3.method1059(arg2, var41, var42, arg4)) {
                                        Statics.field2312 = var41;
                                        Statics.field2313 = var42;
                                        var54 = true;
                                        break label617;
                                    }
                                    var55 = field2308[var50][var51] + 1;
                                    if (var50 > 0 && field2310[var50 - 1][var51] == 0 && (var49[var52 - 1][var53] & 0x124010E) == 0 && (var49[var52 - 1][arg2 + var53 - 1] & 0x1240138) == 0) {
                                        int var56 = 1;
                                        while (true) {
                                            if (var56 >= arg2 - 1) {
                                                field2314[var88] = var41 - 1;
                                                field2315[var88] = var42;
                                                var88 = var88 + 1 & 0xFFF;
                                                field2310[var50 - 1][var51] = 2;
                                                field2308[var50 - 1][var51] = var55;
                                                break;
                                            }
                                            if ((var49[var52 - 1][var53 + var56] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var56++;
                                        }
                                    }
                                    if (var50 < 128 - arg2 && field2310[var50 + 1][var51] == 0 && (var49[arg2 + var52][var53] & 0x1240183) == 0 && (var49[arg2 + var52][arg2 + var53 - 1] & 0x12401E0) == 0) {
                                        int var57 = 1;
                                        while (true) {
                                            if (var57 >= arg2 - 1) {
                                                field2314[var88] = var41 + 1;
                                                field2315[var88] = var42;
                                                var88 = var88 + 1 & 0xFFF;
                                                field2310[var50 + 1][var51] = 8;
                                                field2308[var50 + 1][var51] = var55;
                                                break;
                                            }
                                            if ((var49[arg2 + var52][var53 + var57] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var57++;
                                        }
                                    }
                                    if (var51 > 0 && field2310[var50][var51 - 1] == 0 && (var49[var52][var53 - 1] & 0x124010E) == 0 && (var49[arg2 + var52 - 1][var53 - 1] & 0x1240183) == 0) {
                                        int var58 = 1;
                                        while (true) {
                                            if (var58 >= arg2 - 1) {
                                                field2314[var88] = var41;
                                                field2315[var88] = var42 - 1;
                                                var88 = var88 + 1 & 0xFFF;
                                                field2310[var50][var51 - 1] = 1;
                                                field2308[var50][var51 - 1] = var55;
                                                break;
                                            }
                                            if ((var49[var52 + var58][var53 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var58++;
                                        }
                                    }
                                    if (var51 < 128 - arg2 && field2310[var50][var51 + 1] == 0 && (var49[var52][arg2 + var53] & 0x1240138) == 0 && (var49[arg2 + var52 - 1][arg2 + var53] & 0x12401E0) == 0) {
                                        int var59 = 1;
                                        while (true) {
                                            if (var59 >= arg2 - 1) {
                                                field2314[var88] = var41;
                                                field2315[var88] = var42 + 1;
                                                var88 = var88 + 1 & 0xFFF;
                                                field2310[var50][var51 + 1] = 4;
                                                field2308[var50][var51 + 1] = var55;
                                                break;
                                            }
                                            if ((var49[var52 + var59][arg2 + var53] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var59++;
                                        }
                                    }
                                    if (var50 > 0 && var51 > 0 && field2310[var50 - 1][var51 - 1] == 0 && (var49[var52 - 1][var53 - 1] & 0x124010E) == 0) {
                                        int var60 = 1;
                                        while (true) {
                                            if (var60 >= arg2) {
                                                field2314[var88] = var41 - 1;
                                                field2315[var88] = var42 - 1;
                                                var88 = var88 + 1 & 0xFFF;
                                                field2310[var50 - 1][var51 - 1] = 3;
                                                field2308[var50 - 1][var51 - 1] = var55;
                                                break;
                                            }
                                            if ((var49[var52 - 1][var53 - 1 + var60] & 0x124013E) != 0 || (var49[var52 - 1 + var60][var53 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var60++;
                                        }
                                    }
                                    if (var50 < 128 - arg2 && var51 > 0 && field2310[var50 + 1][var51 - 1] == 0 && (var49[arg2 + var52][var53 - 1] & 0x1240183) == 0) {
                                        int var61 = 1;
                                        while (true) {
                                            if (var61 >= arg2) {
                                                field2314[var88] = var41 + 1;
                                                field2315[var88] = var42 - 1;
                                                var88 = var88 + 1 & 0xFFF;
                                                field2310[var50 + 1][var51 - 1] = 9;
                                                field2308[var50 + 1][var51 - 1] = var55;
                                                break;
                                            }
                                            if ((var49[arg2 + var52][var53 - 1 + var61] & 0x12401E3) != 0 || (var49[var52 + var61][var53 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var61++;
                                        }
                                    }
                                    if (var50 > 0 && var51 < 128 - arg2 && field2310[var50 - 1][var51 + 1] == 0 && (var49[var52 - 1][arg2 + var53] & 0x1240138) == 0) {
                                        for (int var62 = 1; var62 < arg2; var62++) {
                                            if ((var49[var52 - 1][var53 + var62] & 0x124013E) != 0 || (var49[var52 - 1 + var62][arg2 + var53] & 0x12401F8) != 0) {
                                                continue label592;
                                            }
                                        }
                                        field2314[var88] = var41 - 1;
                                        field2315[var88] = var42 + 1;
                                        var88 = var88 + 1 & 0xFFF;
                                        field2310[var50 - 1][var51 + 1] = 6;
                                        field2308[var50 - 1][var51 + 1] = var55;
                                    }
                                } while (var50 >= 128 - arg2);
                            } while (var51 >= 128 - arg2);
                        } while (field2310[var50 + 1][var51 + 1] != 0);
                    } while ((var49[arg2 + var52][arg2 + var53] & 0x12401E0) != 0);
                    for (int var63 = 1; var63 < arg2; var63++) {
                        if ((var49[var52 + var63][arg2 + var53] & 0x12401F8) != 0 || (var49[arg2 + var52][var53 + var63] & 0x12401E3) != 0) {
                            continue label615;
                        }
                    }
                    field2314[var88] = var41 + 1;
                    field2315[var88] = var42 + 1;
                    var88 = var88 + 1 & 0xFFF;
                    field2310[var50 + 1][var51 + 1] = 12;
                    field2308[var50 + 1][var51 + 1] = var55;
                }
            }
            var25 = var54;
        }
        int var64 = arg0 - 64;
        int var65 = arg1 - 64;
        int var66 = Statics.field2312;
        int var67 = Statics.field2313;
        if (!var25) {
            if (!arg5) {
                return -1;
            }
            int var68 = Integer.MAX_VALUE;
            int var69 = Integer.MAX_VALUE;
            byte var70 = 10;
            int var71 = arg3.field2318;
            int var72 = arg3.field2319;
            int var73 = arg3.field2320;
            int var74 = arg3.field2321;
            for (int var75 = var71 - var70; var75 <= var70 + var71; var75++) {
                for (int var76 = var72 - var70; var76 <= var70 + var72; var76++) {
                    int var77 = var75 - var64;
                    int var78 = var76 - var65;
                    if (var77 >= 0 && var78 >= 0 && var77 < 128 && var78 < 128 && field2308[var77][var78] < 100) {
                        int var79 = 0;
                        if (var75 < var71) {
                            var79 = var71 - var75;
                        } else if (var75 > var71 + var73 - 1) {
                            var79 = var75 - (var71 + var73 - 1);
                        }
                        int var80 = 0;
                        if (var76 < var72) {
                            var80 = var72 - var76;
                        } else if (var76 > var72 + var74 - 1) {
                            var80 = var76 - (var72 + var74 - 1);
                        }
                        int var81 = var79 * var79 + var80 * var80;
                        if (var81 < var68 || var68 == var81 && field2308[var77][var78] < var69) {
                            var68 = var81;
                            var69 = field2308[var77][var78];
                            var66 = var75;
                            var67 = var76;
                        }
                    }
                }
            }
            if (var68 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var66 && arg1 == var67) {
            return 0;
        }
        byte var82 = 0;
        field2314[var82] = var66;
        int var89 = var82 + 1;
        field2315[var82] = var67;
        int var83;
        int var84 = var83 = field2310[var66 - var64][var67 - var65];
        while (arg0 != var66 || arg1 != var67) {
            if (var83 != var84) {
                var83 = var84;
                field2314[var89] = var66;
                field2315[var89++] = var67;
            }
            if ((var84 & 0x2) != 0) {
                var66++;
            } else if ((var84 & 0x8) != 0) {
                var66--;
            }
            if ((var84 & 0x1) != 0) {
                var67++;
            } else if ((var84 & 0x4) != 0) {
                var67--;
            }
            var84 = field2310[var66 - var64][var67 - var65];
        }
        int var85 = 0;
        while (var89-- > 0) {
            arg6[var85] = field2314[var89];
            arg7[var85++] = field2315[var89];
            if (var85 >= arg6.length) {
                break;
            }
        }
        return var85;
    }
}
