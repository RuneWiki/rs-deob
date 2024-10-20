package deob;

@ObfuscatedName("ib")
public class class220 {

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kw.aw(IIILin;Lij;Z[I[ILiq;I)I")
    public static int method5028(int arg0, int arg1, int arg2, class217 arg3, class215 arg4, boolean arg5, int[] arg6, int[] arg7, class218 arg8) {
        arg8.method3869();
        int var9 = arg8.method3873();
        int var10 = arg8.method3874();
        int[][] var11 = arg8.method3897();
        int[][] var12 = arg8.method3875();
        int[] var13 = arg8.method3877();
        int[] var14 = arg8.method3878();
        boolean var15;
        if (arg2 == 1) {
            var15 = method3219(arg0, arg1, arg3, arg4, arg8);
        } else if (arg2 == 2) {
            int var16 = arg8.method3873();
            int var17 = arg8.method3874();
            int[][] var18 = arg8.method3897();
            int[][] var19 = arg8.method3875();
            int[] var20 = arg8.method3877();
            int[] var21 = arg8.method3878();
            int var22 = arg8.method3879();
            int var23 = arg0;
            int var24 = arg1;
            int var25 = var16 >> 1;
            int var26 = var17 >> 1;
            int var27 = arg0 - var25;
            int var28 = arg1 - var26;
            var19[var25][var26] = 99;
            var18[var25][var26] = 0;
            byte var29 = 0;
            int var30 = 0;
            var20[var29] = arg0;
            int var90 = var29 + 1;
            var21[var29] = arg1;
            int[][] var31 = arg4.field2345;
            boolean var36;
            while (true) {
                if (var90 == var30) {
                    arg8.method3870(var23, var24);
                    var36 = false;
                    break;
                }
                var23 = var20[var30];
                var24 = var21[var30];
                var30 = var30 + 1 & var22;
                int var32 = var23 - var27;
                int var33 = var24 - var28;
                int var34 = var23 - arg4.field2349;
                int var35 = var24 - arg4.field2344;
                if (arg3.method1173(2, var23, var24, arg4)) {
                    arg8.method3870(var23, var24);
                    var36 = true;
                    break;
                }
                int var37 = var18[var32][var33] + 1;
                if (var32 > 0 && var19[var32 - 1][var33] == 0 && (var31[var34 - 1][var35] & 0x124010E) == 0 && (var31[var34 - 1][var35 + 1] & 0x1240138) == 0) {
                    var20[var90] = var23 - 1;
                    var21[var90] = var24;
                    var90 = var90 + 1 & var22;
                    var19[var32 - 1][var33] = 2;
                    var18[var32 - 1][var33] = var37;
                }
                if (var32 < var16 - 2 && var19[var32 + 1][var33] == 0 && (var31[var34 + 2][var35] & 0x1240183) == 0 && (var31[var34 + 2][var35 + 1] & 0x12401E0) == 0) {
                    var20[var90] = var23 + 1;
                    var21[var90] = var24;
                    var90 = var90 + 1 & var22;
                    var19[var32 + 1][var33] = 8;
                    var18[var32 + 1][var33] = var37;
                }
                if (var33 > 0 && var19[var32][var33 - 1] == 0 && (var31[var34][var35 - 1] & 0x124010E) == 0 && (var31[var34 + 1][var35 - 1] & 0x1240183) == 0) {
                    var20[var90] = var23;
                    var21[var90] = var24 - 1;
                    var90 = var90 + 1 & var22;
                    var19[var32][var33 - 1] = 1;
                    var18[var32][var33 - 1] = var37;
                }
                if (var33 < var17 - 2 && var19[var32][var33 + 1] == 0 && (var31[var34][var35 + 2] & 0x1240138) == 0 && (var31[var34 + 1][var35 + 2] & 0x12401E0) == 0) {
                    var20[var90] = var23;
                    var21[var90] = var24 + 1;
                    var90 = var90 + 1 & var22;
                    var19[var32][var33 + 1] = 4;
                    var18[var32][var33 + 1] = var37;
                }
                if (var32 > 0 && var33 > 0 && var19[var32 - 1][var33 - 1] == 0 && (var31[var34 - 1][var35] & 0x124013E) == 0 && (var31[var34 - 1][var35 - 1] & 0x124010E) == 0 && (var31[var34][var35 - 1] & 0x124018F) == 0) {
                    var20[var90] = var23 - 1;
                    var21[var90] = var24 - 1;
                    var90 = var90 + 1 & var22;
                    var19[var32 - 1][var33 - 1] = 3;
                    var18[var32 - 1][var33 - 1] = var37;
                }
                if (var32 < var16 - 2 && var33 > 0 && var19[var32 + 1][var33 - 1] == 0 && (var31[var34 + 1][var35 - 1] & 0x124018F) == 0 && (var31[var34 + 2][var35 - 1] & 0x1240183) == 0 && (var31[var34 + 2][var35] & 0x12401E3) == 0) {
                    var20[var90] = var23 + 1;
                    var21[var90] = var24 - 1;
                    var90 = var90 + 1 & var22;
                    var19[var32 + 1][var33 - 1] = 9;
                    var18[var32 + 1][var33 - 1] = var37;
                }
                if (var32 > 0 && var33 < var17 - 2 && var19[var32 - 1][var33 + 1] == 0 && (var31[var34 - 1][var35 + 1] & 0x124013E) == 0 && (var31[var34 - 1][var35 + 2] & 0x1240138) == 0 && (var31[var34][var35 + 2] & 0x12401F8) == 0) {
                    var20[var90] = var23 - 1;
                    var21[var90] = var24 + 1;
                    var90 = var90 + 1 & var22;
                    var19[var32 - 1][var33 + 1] = 6;
                    var18[var32 - 1][var33 + 1] = var37;
                }
                if (var32 < var16 - 2 && var33 < var17 - 2 && var19[var32 + 1][var33 + 1] == 0 && (var31[var34 + 1][var35 + 2] & 0x12401F8) == 0 && (var31[var34 + 2][var35 + 2] & 0x12401E0) == 0 && (var31[var34 + 2][var35 + 1] & 0x12401E3) == 0) {
                    var20[var90] = var23 + 1;
                    var21[var90] = var24 + 1;
                    var90 = var90 + 1 & var22;
                    var19[var32 + 1][var33 + 1] = 12;
                    var18[var32 + 1][var33 + 1] = var37;
                }
            }
            var15 = var36;
        } else {
            int var38 = arg8.method3873();
            int var39 = arg8.method3874();
            int[][] var40 = arg8.method3897();
            int[][] var41 = arg8.method3875();
            int[] var42 = arg8.method3877();
            int[] var43 = arg8.method3878();
            int var44 = arg8.method3879();
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
            int var91 = var51 + 1;
            var43[var51] = arg1;
            int[][] var53 = arg4.field2345;
            boolean var58;
            label518: while (true) {
                label516: while (true) {
                    int var54;
                    int var55;
                    int var56;
                    int var57;
                    int var59;
                    do {
                        do {
                            do {
                                label493: do {
                                    if (var91 == var52) {
                                        arg8.method3870(var45, var46);
                                        var58 = false;
                                        break label518;
                                    }
                                    var45 = var42[var52];
                                    var46 = var43[var52];
                                    var52 = var52 + 1 & var44;
                                    var54 = var45 - var49;
                                    var55 = var46 - var50;
                                    var56 = var45 - arg4.field2349;
                                    var57 = var46 - arg4.field2344;
                                    if (arg3.method1173(arg2, var45, var46, arg4)) {
                                        arg8.method3870(var45, var46);
                                        var58 = true;
                                        break label518;
                                    }
                                    var59 = var40[var54][var55] + 1;
                                    if (var54 > 0 && var41[var54 - 1][var55] == 0 && (var53[var56 - 1][var57] & 0x124010E) == 0 && (var53[var56 - 1][arg2 + var57 - 1] & 0x1240138) == 0) {
                                        int var60 = 1;
                                        while (true) {
                                            if (var60 >= arg2 - 1) {
                                                var42[var91] = var45 - 1;
                                                var43[var91] = var46;
                                                var91 = var91 + 1 & var44;
                                                var41[var54 - 1][var55] = 2;
                                                var40[var54 - 1][var55] = var59;
                                                break;
                                            }
                                            if ((var53[var56 - 1][var57 + var60] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var60++;
                                        }
                                    }
                                    if (var54 < var38 - arg2 && var41[var54 + 1][var55] == 0 && (var53[arg2 + var56][var57] & 0x1240183) == 0 && (var53[arg2 + var56][arg2 + var57 - 1] & 0x12401E0) == 0) {
                                        int var61 = 1;
                                        while (true) {
                                            if (var61 >= arg2 - 1) {
                                                var42[var91] = var45 + 1;
                                                var43[var91] = var46;
                                                var91 = var91 + 1 & var44;
                                                var41[var54 + 1][var55] = 8;
                                                var40[var54 + 1][var55] = var59;
                                                break;
                                            }
                                            if ((var53[arg2 + var56][var57 + var61] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var61++;
                                        }
                                    }
                                    if (var55 > 0 && var41[var54][var55 - 1] == 0 && (var53[var56][var57 - 1] & 0x124010E) == 0 && (var53[arg2 + var56 - 1][var57 - 1] & 0x1240183) == 0) {
                                        int var62 = 1;
                                        while (true) {
                                            if (var62 >= arg2 - 1) {
                                                var42[var91] = var45;
                                                var43[var91] = var46 - 1;
                                                var91 = var91 + 1 & var44;
                                                var41[var54][var55 - 1] = 1;
                                                var40[var54][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 + var62][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var62++;
                                        }
                                    }
                                    if (var55 < var39 - arg2 && var41[var54][var55 + 1] == 0 && (var53[var56][arg2 + var57] & 0x1240138) == 0 && (var53[arg2 + var56 - 1][arg2 + var57] & 0x12401E0) == 0) {
                                        int var63 = 1;
                                        while (true) {
                                            if (var63 >= arg2 - 1) {
                                                var42[var91] = var45;
                                                var43[var91] = var46 + 1;
                                                var91 = var91 + 1 & var44;
                                                var41[var54][var55 + 1] = 4;
                                                var40[var54][var55 + 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 + var63][arg2 + var57] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var63++;
                                        }
                                    }
                                    if (var54 > 0 && var55 > 0 && var41[var54 - 1][var55 - 1] == 0 && (var53[var56 - 1][var57 - 1] & 0x124010E) == 0) {
                                        int var64 = 1;
                                        while (true) {
                                            if (var64 >= arg2) {
                                                var42[var91] = var45 - 1;
                                                var43[var91] = var46 - 1;
                                                var91 = var91 + 1 & var44;
                                                var41[var54 - 1][var55 - 1] = 3;
                                                var40[var54 - 1][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 - 1][var57 - 1 + var64] & 0x124013E) != 0 || (var53[var56 - 1 + var64][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var64++;
                                        }
                                    }
                                    if (var54 < var38 - arg2 && var55 > 0 && var41[var54 + 1][var55 - 1] == 0 && (var53[arg2 + var56][var57 - 1] & 0x1240183) == 0) {
                                        int var65 = 1;
                                        while (true) {
                                            if (var65 >= arg2) {
                                                var42[var91] = var45 + 1;
                                                var43[var91] = var46 - 1;
                                                var91 = var91 + 1 & var44;
                                                var41[var54 + 1][var55 - 1] = 9;
                                                var40[var54 + 1][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[arg2 + var56][var57 - 1 + var65] & 0x12401E3) != 0 || (var53[var56 + var65][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var65++;
                                        }
                                    }
                                    if (var54 > 0 && var55 < var39 - arg2 && var41[var54 - 1][var55 + 1] == 0 && (var53[var56 - 1][arg2 + var57] & 0x1240138) == 0) {
                                        for (int var66 = 1; var66 < arg2; var66++) {
                                            if ((var53[var56 - 1][var57 + var66] & 0x124013E) != 0 || (var53[var56 - 1 + var66][arg2 + var57] & 0x12401F8) != 0) {
                                                continue label493;
                                            }
                                        }
                                        var42[var91] = var45 - 1;
                                        var43[var91] = var46 + 1;
                                        var91 = var91 + 1 & var44;
                                        var41[var54 - 1][var55 + 1] = 6;
                                        var40[var54 - 1][var55 + 1] = var59;
                                    }
                                } while (var54 >= var38 - arg2);
                            } while (var55 >= var39 - arg2);
                        } while (var41[var54 + 1][var55 + 1] != 0);
                    } while ((var53[arg2 + var56][arg2 + var57] & 0x12401E0) != 0);
                    for (int var67 = 1; var67 < arg2; var67++) {
                        if ((var53[var56 + var67][arg2 + var57] & 0x12401F8) != 0 || (var53[arg2 + var56][var57 + var67] & 0x12401E3) != 0) {
                            continue label516;
                        }
                    }
                    var42[var91] = var45 + 1;
                    var43[var91] = var46 + 1;
                    var91 = var91 + 1 & var44;
                    var41[var54 + 1][var55 + 1] = 12;
                    var40[var54 + 1][var55 + 1] = var59;
                }
            }
            var15 = var58;
        }
        int var68 = arg0 - (var9 >> 1);
        int var69 = arg1 - (var10 >> 1);
        int var70 = arg8.method3871();
        int var71 = arg8.method3894();
        if (!var15) {
            if (!arg5) {
                return -1;
            }
            int var72 = Integer.MAX_VALUE;
            int var73 = Integer.MAX_VALUE;
            byte var74 = 10;
            int var75 = arg3.field2366;
            int var76 = arg3.field2364;
            int var77 = arg3.field2365;
            int var78 = arg3.field2363;
            for (int var79 = var75 - var74; var79 <= var74 + var75; var79++) {
                for (int var80 = var76 - var74; var80 <= var74 + var76; var80++) {
                    int var81 = var79 - var68;
                    int var82 = var80 - var69;
                    if (var81 >= 0 && var82 >= 0 && var81 < var9 && var82 < var10 && var11[var81][var82] < 100) {
                        int var83 = 0;
                        if (var79 < var75) {
                            var83 = var75 - var79;
                        } else if (var79 > var75 + var77 - 1) {
                            var83 = var79 - (var75 + var77 - 1);
                        }
                        int var84 = 0;
                        if (var80 < var76) {
                            var84 = var76 - var80;
                        } else if (var80 > var76 + var78 - 1) {
                            var84 = var80 - (var76 + var78 - 1);
                        }
                        int var85 = var83 * var83 + var84 * var84;
                        if (var85 < var72 || var72 == var85 && var11[var81][var82] < var73) {
                            var72 = var85;
                            var73 = var11[var81][var82];
                            var70 = var79;
                            var71 = var80;
                        }
                    }
                }
            }
            if (var72 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var70 && arg1 == var71) {
            arg6[0] = var70;
            arg7[0] = var71;
            return 0;
        }
        byte var86 = 0;
        var13[var86] = var70;
        int var92 = var86 + 1;
        var14[var86] = var71;
        int var87;
        int var88 = var87 = var12[var70 - var68][var71 - var69];
        while (arg0 != var70 || arg1 != var71) {
            if (var87 != var88) {
                var87 = var88;
                var13[var92] = var70;
                var14[var92++] = var71;
            }
            if ((var88 & 0x2) != 0) {
                var70++;
            } else if ((var88 & 0x8) != 0) {
                var70--;
            }
            if ((var88 & 0x1) != 0) {
                var71++;
            } else if ((var88 & 0x4) != 0) {
                var71--;
            }
            var88 = var12[var70 - var68][var71 - var69];
        }
        int var89 = 0;
        while (var92-- > 0) {
            arg6[var89] = var13[var92];
            arg7[var89++] = var14[var92];
            if (var89 >= arg6.length) {
                break;
            }
        }
        return var89;
    }

    @ObfuscatedName("gl.ay(IILin;Lij;Liq;I)Z")
    public static final boolean method3219(int arg0, int arg1, class217 arg2, class215 arg3, class218 arg4) {
        int var5 = arg4.method3873();
        int var6 = arg4.method3874();
        int[][] var7 = arg4.method3897();
        int[][] var8 = arg4.method3875();
        int[] var9 = arg4.method3877();
        int[] var10 = arg4.method3878();
        int var11 = arg4.method3879();
        int var12 = arg0;
        int var13 = arg1;
        int var14 = var5 >> 1;
        int var15 = var6 >> 1;
        int var16 = arg0 - var14;
        int var17 = arg1 - var15;
        var8[var14][var15] = 99;
        var7[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        var9[var18] = arg0;
        byte var10001 = var18;
        int var26 = var18 + 1;
        var10[var10001] = arg1;
        int[][] var20 = arg3.field2345;
        while (var26 != var19) {
            var12 = var9[var19];
            var13 = var10[var19];
            var19 = var19 + 1 & var11;
            int var21 = var12 - var16;
            int var22 = var13 - var17;
            int var23 = var12 - arg3.field2349;
            int var24 = var13 - arg3.field2344;
            if (arg2.method1173(1, var12, var13, arg3)) {
                arg4.method3870(var12, var13);
                return true;
            }
            int var25 = var7[var21][var22] + 1;
            if (var21 > 0 && var8[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x1240108) == 0) {
                var9[var26] = var12 - 1;
                var10[var26] = var13;
                var26 = var26 + 1 & var11;
                var8[var21 - 1][var22] = 2;
                var7[var21 - 1][var22] = var25;
            }
            if (var21 < var5 - 1 && var8[var21 + 1][var22] == 0 && (var20[var23 + 1][var24] & 0x1240180) == 0) {
                var9[var26] = var12 + 1;
                var10[var26] = var13;
                var26 = var26 + 1 & var11;
                var8[var21 + 1][var22] = 8;
                var7[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && var8[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x1240102) == 0) {
                var9[var26] = var12;
                var10[var26] = var13 - 1;
                var26 = var26 + 1 & var11;
                var8[var21][var22 - 1] = 1;
                var7[var21][var22 - 1] = var25;
            }
            if (var22 < var6 - 1 && var8[var21][var22 + 1] == 0 && (var20[var23][var24 + 1] & 0x1240120) == 0) {
                var9[var26] = var12;
                var10[var26] = var13 + 1;
                var26 = var26 + 1 & var11;
                var8[var21][var22 + 1] = 4;
                var7[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && var8[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x124010E) == 0 && (var20[var23 - 1][var24] & 0x1240108) == 0 && (var20[var23][var24 - 1] & 0x1240102) == 0) {
                var9[var26] = var12 - 1;
                var10[var26] = var13 - 1;
                var26 = var26 + 1 & var11;
                var8[var21 - 1][var22 - 1] = 3;
                var7[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < var5 - 1 && var22 > 0 && var8[var21 + 1][var22 - 1] == 0 && (var20[var23 + 1][var24 - 1] & 0x1240183) == 0 && (var20[var23 + 1][var24] & 0x1240180) == 0 && (var20[var23][var24 - 1] & 0x1240102) == 0) {
                var9[var26] = var12 + 1;
                var10[var26] = var13 - 1;
                var26 = var26 + 1 & var11;
                var8[var21 + 1][var22 - 1] = 9;
                var7[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < var6 - 1 && var8[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + 1] & 0x1240138) == 0 && (var20[var23 - 1][var24] & 0x1240108) == 0 && (var20[var23][var24 + 1] & 0x1240120) == 0) {
                var9[var26] = var12 - 1;
                var10[var26] = var13 + 1;
                var26 = var26 + 1 & var11;
                var8[var21 - 1][var22 + 1] = 6;
                var7[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < var5 - 1 && var22 < var6 - 1 && var8[var21 + 1][var22 + 1] == 0 && (var20[var23 + 1][var24 + 1] & 0x12401E0) == 0 && (var20[var23 + 1][var24] & 0x1240180) == 0 && (var20[var23][var24 + 1] & 0x1240120) == 0) {
                var9[var26] = var12 + 1;
                var10[var26] = var13 + 1;
                var26 = var26 + 1 & var11;
                var8[var21 + 1][var22 + 1] = 12;
                var7[var21 + 1][var22 + 1] = var25;
            }
        }
        arg4.method3870(var12, var13);
        return false;
    }
}
