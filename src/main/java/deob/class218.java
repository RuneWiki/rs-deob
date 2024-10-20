package deob;

@ObfuscatedName("iy")
public class class218 {

    public class218() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mj.at(IIILig;Lic;Z[I[ILis;I)I")
    public static int method5770(int arg0, int arg1, int arg2, class215 arg3, class213 arg4, boolean arg5, int[] arg6, int[] arg7, class216 arg8) {
        arg8.method3899();
        int var9 = arg8.method3876();
        int var10 = arg8.method3873();
        int[][] var11 = arg8.method3875();
        int[][] var12 = arg8.method3891();
        int[] var13 = arg8.method3871();
        int[] var14 = arg8.method3867();
        boolean var37;
        if (arg2 == 1) {
            int var15 = arg8.method3876();
            int var16 = arg8.method3873();
            int[][] var17 = arg8.method3875();
            int[][] var18 = arg8.method3891();
            int[] var19 = arg8.method3871();
            int[] var20 = arg8.method3867();
            int var21 = arg8.method3878();
            int var22 = arg0;
            int var23 = arg1;
            int var24 = var15 >> 1;
            int var25 = var16 >> 1;
            int var26 = arg0 - var24;
            int var27 = arg1 - var25;
            var18[var24][var25] = 99;
            var17[var24][var25] = 0;
            byte var28 = 0;
            int var29 = 0;
            var19[var28] = arg0;
            int var112 = var28 + 1;
            var20[var28] = arg1;
            int[][] var30 = arg4.field2366;
            boolean var35;
            while (true) {
                if (var112 == var29) {
                    arg8.method3869(var22, var23);
                    var35 = false;
                    break;
                }
                var22 = var19[var29];
                var23 = var20[var29];
                var29 = var29 + 1 & var21;
                int var31 = var22 - var26;
                int var32 = var23 - var27;
                int var33 = var22 - arg4.field2354;
                int var34 = var23 - arg4.field2365;
                if (arg3.method1113(1, var22, var23, arg4)) {
                    arg8.method3869(var22, var23);
                    var35 = true;
                    break;
                }
                int var36 = var17[var31][var32] + 1;
                if (var31 > 0 && var18[var31 - 1][var32] == 0 && (var30[var33 - 1][var34] & 0x1240108) == 0) {
                    var19[var112] = var22 - 1;
                    var20[var112] = var23;
                    var112 = var112 + 1 & var21;
                    var18[var31 - 1][var32] = 2;
                    var17[var31 - 1][var32] = var36;
                }
                if (var31 < var15 - 1 && var18[var31 + 1][var32] == 0 && (var30[var33 + 1][var34] & 0x1240180) == 0) {
                    var19[var112] = var22 + 1;
                    var20[var112] = var23;
                    var112 = var112 + 1 & var21;
                    var18[var31 + 1][var32] = 8;
                    var17[var31 + 1][var32] = var36;
                }
                if (var32 > 0 && var18[var31][var32 - 1] == 0 && (var30[var33][var34 - 1] & 0x1240102) == 0) {
                    var19[var112] = var22;
                    var20[var112] = var23 - 1;
                    var112 = var112 + 1 & var21;
                    var18[var31][var32 - 1] = 1;
                    var17[var31][var32 - 1] = var36;
                }
                if (var32 < var16 - 1 && var18[var31][var32 + 1] == 0 && (var30[var33][var34 + 1] & 0x1240120) == 0) {
                    var19[var112] = var22;
                    var20[var112] = var23 + 1;
                    var112 = var112 + 1 & var21;
                    var18[var31][var32 + 1] = 4;
                    var17[var31][var32 + 1] = var36;
                }
                if (var31 > 0 && var32 > 0 && var18[var31 - 1][var32 - 1] == 0 && (var30[var33 - 1][var34 - 1] & 0x124010E) == 0 && (var30[var33 - 1][var34] & 0x1240108) == 0 && (var30[var33][var34 - 1] & 0x1240102) == 0) {
                    var19[var112] = var22 - 1;
                    var20[var112] = var23 - 1;
                    var112 = var112 + 1 & var21;
                    var18[var31 - 1][var32 - 1] = 3;
                    var17[var31 - 1][var32 - 1] = var36;
                }
                if (var31 < var15 - 1 && var32 > 0 && var18[var31 + 1][var32 - 1] == 0 && (var30[var33 + 1][var34 - 1] & 0x1240183) == 0 && (var30[var33 + 1][var34] & 0x1240180) == 0 && (var30[var33][var34 - 1] & 0x1240102) == 0) {
                    var19[var112] = var22 + 1;
                    var20[var112] = var23 - 1;
                    var112 = var112 + 1 & var21;
                    var18[var31 + 1][var32 - 1] = 9;
                    var17[var31 + 1][var32 - 1] = var36;
                }
                if (var31 > 0 && var32 < var16 - 1 && var18[var31 - 1][var32 + 1] == 0 && (var30[var33 - 1][var34 + 1] & 0x1240138) == 0 && (var30[var33 - 1][var34] & 0x1240108) == 0 && (var30[var33][var34 + 1] & 0x1240120) == 0) {
                    var19[var112] = var22 - 1;
                    var20[var112] = var23 + 1;
                    var112 = var112 + 1 & var21;
                    var18[var31 - 1][var32 + 1] = 6;
                    var17[var31 - 1][var32 + 1] = var36;
                }
                if (var31 < var15 - 1 && var32 < var16 - 1 && var18[var31 + 1][var32 + 1] == 0 && (var30[var33 + 1][var34 + 1] & 0x12401E0) == 0 && (var30[var33 + 1][var34] & 0x1240180) == 0 && (var30[var33][var34 + 1] & 0x1240120) == 0) {
                    var19[var112] = var22 + 1;
                    var20[var112] = var23 + 1;
                    var112 = var112 + 1 & var21;
                    var18[var31 + 1][var32 + 1] = 12;
                    var17[var31 + 1][var32 + 1] = var36;
                }
            }
            var37 = var35;
        } else if (arg2 == 2) {
            int var38 = arg8.method3876();
            int var39 = arg8.method3873();
            int[][] var40 = arg8.method3875();
            int[][] var41 = arg8.method3891();
            int[] var42 = arg8.method3871();
            int[] var43 = arg8.method3867();
            int var44 = arg8.method3878();
            int var45 = arg0;
            int var46 = arg1;
            int var47 = var38 >> 1;
            int var48 = var39 >> 1;
            int var49 = arg0 - var47;
            int var50 = arg1 - var48;
            var41[var47][var48] = 99;
            var40[var47][var48] = 0;
            byte var51 = 0;
            int var52 = 0;
            var42[var51] = arg0;
            int var113 = var51 + 1;
            var43[var51] = arg1;
            int[][] var53 = arg4.field2366;
            boolean var58;
            while (true) {
                if (var113 == var52) {
                    arg8.method3869(var45, var46);
                    var58 = false;
                    break;
                }
                var45 = var42[var52];
                var46 = var43[var52];
                var52 = var52 + 1 & var44;
                int var54 = var45 - var49;
                int var55 = var46 - var50;
                int var56 = var45 - arg4.field2354;
                int var57 = var46 - arg4.field2365;
                if (arg3.method1113(2, var45, var46, arg4)) {
                    arg8.method3869(var45, var46);
                    var58 = true;
                    break;
                }
                int var59 = var40[var54][var55] + 1;
                if (var54 > 0 && var41[var54 - 1][var55] == 0 && (var53[var56 - 1][var57] & 0x124010E) == 0 && (var53[var56 - 1][var57 + 1] & 0x1240138) == 0) {
                    var42[var113] = var45 - 1;
                    var43[var113] = var46;
                    var113 = var113 + 1 & var44;
                    var41[var54 - 1][var55] = 2;
                    var40[var54 - 1][var55] = var59;
                }
                if (var54 < var38 - 2 && var41[var54 + 1][var55] == 0 && (var53[var56 + 2][var57] & 0x1240183) == 0 && (var53[var56 + 2][var57 + 1] & 0x12401E0) == 0) {
                    var42[var113] = var45 + 1;
                    var43[var113] = var46;
                    var113 = var113 + 1 & var44;
                    var41[var54 + 1][var55] = 8;
                    var40[var54 + 1][var55] = var59;
                }
                if (var55 > 0 && var41[var54][var55 - 1] == 0 && (var53[var56][var57 - 1] & 0x124010E) == 0 && (var53[var56 + 1][var57 - 1] & 0x1240183) == 0) {
                    var42[var113] = var45;
                    var43[var113] = var46 - 1;
                    var113 = var113 + 1 & var44;
                    var41[var54][var55 - 1] = 1;
                    var40[var54][var55 - 1] = var59;
                }
                if (var55 < var39 - 2 && var41[var54][var55 + 1] == 0 && (var53[var56][var57 + 2] & 0x1240138) == 0 && (var53[var56 + 1][var57 + 2] & 0x12401E0) == 0) {
                    var42[var113] = var45;
                    var43[var113] = var46 + 1;
                    var113 = var113 + 1 & var44;
                    var41[var54][var55 + 1] = 4;
                    var40[var54][var55 + 1] = var59;
                }
                if (var54 > 0 && var55 > 0 && var41[var54 - 1][var55 - 1] == 0 && (var53[var56 - 1][var57] & 0x124013E) == 0 && (var53[var56 - 1][var57 - 1] & 0x124010E) == 0 && (var53[var56][var57 - 1] & 0x124018F) == 0) {
                    var42[var113] = var45 - 1;
                    var43[var113] = var46 - 1;
                    var113 = var113 + 1 & var44;
                    var41[var54 - 1][var55 - 1] = 3;
                    var40[var54 - 1][var55 - 1] = var59;
                }
                if (var54 < var38 - 2 && var55 > 0 && var41[var54 + 1][var55 - 1] == 0 && (var53[var56 + 1][var57 - 1] & 0x124018F) == 0 && (var53[var56 + 2][var57 - 1] & 0x1240183) == 0 && (var53[var56 + 2][var57] & 0x12401E3) == 0) {
                    var42[var113] = var45 + 1;
                    var43[var113] = var46 - 1;
                    var113 = var113 + 1 & var44;
                    var41[var54 + 1][var55 - 1] = 9;
                    var40[var54 + 1][var55 - 1] = var59;
                }
                if (var54 > 0 && var55 < var39 - 2 && var41[var54 - 1][var55 + 1] == 0 && (var53[var56 - 1][var57 + 1] & 0x124013E) == 0 && (var53[var56 - 1][var57 + 2] & 0x1240138) == 0 && (var53[var56][var57 + 2] & 0x12401F8) == 0) {
                    var42[var113] = var45 - 1;
                    var43[var113] = var46 + 1;
                    var113 = var113 + 1 & var44;
                    var41[var54 - 1][var55 + 1] = 6;
                    var40[var54 - 1][var55 + 1] = var59;
                }
                if (var54 < var38 - 2 && var55 < var39 - 2 && var41[var54 + 1][var55 + 1] == 0 && (var53[var56 + 1][var57 + 2] & 0x12401F8) == 0 && (var53[var56 + 2][var57 + 2] & 0x12401E0) == 0 && (var53[var56 + 2][var57 + 1] & 0x12401E3) == 0) {
                    var42[var113] = var45 + 1;
                    var43[var113] = var46 + 1;
                    var113 = var113 + 1 & var44;
                    var41[var54 + 1][var55 + 1] = 12;
                    var40[var54 + 1][var55 + 1] = var59;
                }
            }
            var37 = var58;
        } else {
            int var60 = arg8.method3876();
            int var61 = arg8.method3873();
            int[][] var62 = arg8.method3875();
            int[][] var63 = arg8.method3891();
            int[] var64 = arg8.method3871();
            int[] var65 = arg8.method3867();
            int var66 = arg8.method3878();
            int var67 = arg0;
            int var68 = arg1;
            int var69 = var60 >> 1;
            int var70 = var61 >> 1;
            int var71 = arg0 - var69;
            int var72 = arg1 - var70;
            var63[var69][var70] = 99;
            var62[var69][var70] = 0;
            byte var73 = 0;
            int var74 = 0;
            var64[var73] = arg0;
            int var114 = var73 + 1;
            var65[var73] = arg1;
            int[][] var75 = arg4.field2366;
            boolean var80;
            label611: while (true) {
                label609: while (true) {
                    int var76;
                    int var77;
                    int var78;
                    int var79;
                    int var81;
                    do {
                        do {
                            do {
                                label586: do {
                                    if (var114 == var74) {
                                        arg8.method3869(var67, var68);
                                        var80 = false;
                                        break label611;
                                    }
                                    var67 = var64[var74];
                                    var68 = var65[var74];
                                    var74 = var74 + 1 & var66;
                                    var76 = var67 - var71;
                                    var77 = var68 - var72;
                                    var78 = var67 - arg4.field2354;
                                    var79 = var68 - arg4.field2365;
                                    if (arg3.method1113(arg2, var67, var68, arg4)) {
                                        arg8.method3869(var67, var68);
                                        var80 = true;
                                        break label611;
                                    }
                                    var81 = var62[var76][var77] + 1;
                                    if (var76 > 0 && var63[var76 - 1][var77] == 0 && (var75[var78 - 1][var79] & 0x124010E) == 0 && (var75[var78 - 1][arg2 + var79 - 1] & 0x1240138) == 0) {
                                        int var82 = 1;
                                        while (true) {
                                            if (var82 >= arg2 - 1) {
                                                var64[var114] = var67 - 1;
                                                var65[var114] = var68;
                                                var114 = var114 + 1 & var66;
                                                var63[var76 - 1][var77] = 2;
                                                var62[var76 - 1][var77] = var81;
                                                break;
                                            }
                                            if ((var75[var78 - 1][var79 + var82] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var82++;
                                        }
                                    }
                                    if (var76 < var60 - arg2 && var63[var76 + 1][var77] == 0 && (var75[arg2 + var78][var79] & 0x1240183) == 0 && (var75[arg2 + var78][arg2 + var79 - 1] & 0x12401E0) == 0) {
                                        int var83 = 1;
                                        while (true) {
                                            if (var83 >= arg2 - 1) {
                                                var64[var114] = var67 + 1;
                                                var65[var114] = var68;
                                                var114 = var114 + 1 & var66;
                                                var63[var76 + 1][var77] = 8;
                                                var62[var76 + 1][var77] = var81;
                                                break;
                                            }
                                            if ((var75[arg2 + var78][var79 + var83] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var83++;
                                        }
                                    }
                                    if (var77 > 0 && var63[var76][var77 - 1] == 0 && (var75[var78][var79 - 1] & 0x124010E) == 0 && (var75[arg2 + var78 - 1][var79 - 1] & 0x1240183) == 0) {
                                        int var84 = 1;
                                        while (true) {
                                            if (var84 >= arg2 - 1) {
                                                var64[var114] = var67;
                                                var65[var114] = var68 - 1;
                                                var114 = var114 + 1 & var66;
                                                var63[var76][var77 - 1] = 1;
                                                var62[var76][var77 - 1] = var81;
                                                break;
                                            }
                                            if ((var75[var78 + var84][var79 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var84++;
                                        }
                                    }
                                    if (var77 < var61 - arg2 && var63[var76][var77 + 1] == 0 && (var75[var78][arg2 + var79] & 0x1240138) == 0 && (var75[arg2 + var78 - 1][arg2 + var79] & 0x12401E0) == 0) {
                                        int var85 = 1;
                                        while (true) {
                                            if (var85 >= arg2 - 1) {
                                                var64[var114] = var67;
                                                var65[var114] = var68 + 1;
                                                var114 = var114 + 1 & var66;
                                                var63[var76][var77 + 1] = 4;
                                                var62[var76][var77 + 1] = var81;
                                                break;
                                            }
                                            if ((var75[var78 + var85][arg2 + var79] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var85++;
                                        }
                                    }
                                    if (var76 > 0 && var77 > 0 && var63[var76 - 1][var77 - 1] == 0 && (var75[var78 - 1][var79 - 1] & 0x124010E) == 0) {
                                        int var86 = 1;
                                        while (true) {
                                            if (var86 >= arg2) {
                                                var64[var114] = var67 - 1;
                                                var65[var114] = var68 - 1;
                                                var114 = var114 + 1 & var66;
                                                var63[var76 - 1][var77 - 1] = 3;
                                                var62[var76 - 1][var77 - 1] = var81;
                                                break;
                                            }
                                            if ((var75[var78 - 1][var79 - 1 + var86] & 0x124013E) != 0 || (var75[var78 - 1 + var86][var79 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var86++;
                                        }
                                    }
                                    if (var76 < var60 - arg2 && var77 > 0 && var63[var76 + 1][var77 - 1] == 0 && (var75[arg2 + var78][var79 - 1] & 0x1240183) == 0) {
                                        int var87 = 1;
                                        while (true) {
                                            if (var87 >= arg2) {
                                                var64[var114] = var67 + 1;
                                                var65[var114] = var68 - 1;
                                                var114 = var114 + 1 & var66;
                                                var63[var76 + 1][var77 - 1] = 9;
                                                var62[var76 + 1][var77 - 1] = var81;
                                                break;
                                            }
                                            if ((var75[arg2 + var78][var79 - 1 + var87] & 0x12401E3) != 0 || (var75[var78 + var87][var79 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var87++;
                                        }
                                    }
                                    if (var76 > 0 && var77 < var61 - arg2 && var63[var76 - 1][var77 + 1] == 0 && (var75[var78 - 1][arg2 + var79] & 0x1240138) == 0) {
                                        for (int var88 = 1; var88 < arg2; var88++) {
                                            if ((var75[var78 - 1][var79 + var88] & 0x124013E) != 0 || (var75[var78 - 1 + var88][arg2 + var79] & 0x12401F8) != 0) {
                                                continue label586;
                                            }
                                        }
                                        var64[var114] = var67 - 1;
                                        var65[var114] = var68 + 1;
                                        var114 = var114 + 1 & var66;
                                        var63[var76 - 1][var77 + 1] = 6;
                                        var62[var76 - 1][var77 + 1] = var81;
                                    }
                                } while (var76 >= var60 - arg2);
                            } while (var77 >= var61 - arg2);
                        } while (var63[var76 + 1][var77 + 1] != 0);
                    } while ((var75[arg2 + var78][arg2 + var79] & 0x12401E0) != 0);
                    for (int var89 = 1; var89 < arg2; var89++) {
                        if ((var75[var78 + var89][arg2 + var79] & 0x12401F8) != 0 || (var75[arg2 + var78][var79 + var89] & 0x12401E3) != 0) {
                            continue label609;
                        }
                    }
                    var64[var114] = var67 + 1;
                    var65[var114] = var68 + 1;
                    var114 = var114 + 1 & var66;
                    var63[var76 + 1][var77 + 1] = 12;
                    var62[var76 + 1][var77 + 1] = var81;
                }
            }
            var37 = var80;
        }
        int var90 = arg0 - (var9 >> 1);
        int var91 = arg1 - (var10 >> 1);
        int var92 = arg8.method3889();
        int var93 = arg8.method3897();
        if (!var37) {
            if (!arg5) {
                return -1;
            }
            int var94 = Integer.MAX_VALUE;
            int var95 = Integer.MAX_VALUE;
            byte var96 = 10;
            int var97 = arg3.field2386;
            int var98 = arg3.field2384;
            int var99 = arg3.field2385;
            int var100 = arg3.field2383;
            for (int var101 = var97 - var96; var101 <= var96 + var97; var101++) {
                for (int var102 = var98 - var96; var102 <= var96 + var98; var102++) {
                    int var103 = var101 - var90;
                    int var104 = var102 - var91;
                    if (var103 >= 0 && var104 >= 0 && var103 < var9 && var104 < var10 && var11[var103][var104] < 100) {
                        int var105 = 0;
                        if (var101 < var97) {
                            var105 = var97 - var101;
                        } else if (var101 > var97 + var99 - 1) {
                            var105 = var101 - (var97 + var99 - 1);
                        }
                        int var106 = 0;
                        if (var102 < var98) {
                            var106 = var98 - var102;
                        } else if (var102 > var98 + var100 - 1) {
                            var106 = var102 - (var98 + var100 - 1);
                        }
                        int var107 = var105 * var105 + var106 * var106;
                        if (var107 < var94 || var94 == var107 && var11[var103][var104] < var95) {
                            var94 = var107;
                            var95 = var11[var103][var104];
                            var92 = var101;
                            var93 = var102;
                        }
                    }
                }
            }
            if (var94 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var92 && arg1 == var93) {
            arg6[0] = var92;
            arg7[0] = var93;
            return 0;
        }
        byte var108 = 0;
        var13[var108] = var92;
        int var116 = var108 + 1;
        var14[var108] = var93;
        int var109;
        int var110 = var109 = var12[var92 - var90][var93 - var91];
        while (arg0 != var92 || arg1 != var93) {
            if (var109 != var110) {
                var109 = var110;
                var13[var116] = var92;
                var14[var116++] = var93;
            }
            if ((var110 & 0x2) != 0) {
                var92++;
            } else if ((var110 & 0x8) != 0) {
                var92--;
            }
            if ((var110 & 0x1) != 0) {
                var93++;
            } else if ((var110 & 0x4) != 0) {
                var93--;
            }
            var110 = var12[var92 - var90][var93 - var91];
        }
        int var111 = 0;
        while (var116-- > 0) {
            arg6[var111] = var13[var116];
            arg7[var111++] = var14[var116];
            if (var111 >= arg6.length) {
                break;
            }
        }
        return var111;
    }
}
