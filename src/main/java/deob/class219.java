package deob;

@ObfuscatedName("ih")
public class class219 {

    public class219() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.au(IIILiw;Lis;Z[I[ILij;I)I")
    public static int method10(int arg0, int arg1, int arg2, class216 arg3, class214 arg4, boolean arg5, int[] arg6, int[] arg7, class217 arg8) {
        arg8.method3913();
        int var9 = arg8.method3878();
        int var10 = arg8.method3895();
        int[][] var11 = arg8.method3881();
        int[][] var12 = arg8.method3901();
        int[] var13 = arg8.method3882();
        int[] var14 = arg8.method3883();
        boolean var37;
        if (arg2 == 1) {
            int var15 = arg8.method3878();
            int var16 = arg8.method3895();
            int[][] var17 = arg8.method3881();
            int[][] var18 = arg8.method3901();
            int[] var19 = arg8.method3882();
            int[] var20 = arg8.method3883();
            int var21 = arg8.method3884();
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
            int var60 = var28 + 1;
            var20[var28] = arg1;
            int[][] var30 = arg4.field2379;
            boolean var35;
            while (true) {
                if (var60 == var29) {
                    arg8.method3875(var22, var23);
                    var35 = false;
                    break;
                }
                var22 = var19[var29];
                var23 = var20[var29];
                var29 = var29 + 1 & var21;
                int var31 = var22 - var26;
                int var32 = var23 - var27;
                int var33 = var22 - arg4.field2375;
                int var34 = var23 - arg4.field2376;
                if (arg3.method1159(1, var22, var23, arg4)) {
                    arg8.method3875(var22, var23);
                    var35 = true;
                    break;
                }
                int var36 = var17[var31][var32] + 1;
                if (var31 > 0 && var18[var31 - 1][var32] == 0 && (var30[var33 - 1][var34] & 0x1240108) == 0) {
                    var19[var60] = var22 - 1;
                    var20[var60] = var23;
                    var60 = var60 + 1 & var21;
                    var18[var31 - 1][var32] = 2;
                    var17[var31 - 1][var32] = var36;
                }
                if (var31 < var15 - 1 && var18[var31 + 1][var32] == 0 && (var30[var33 + 1][var34] & 0x1240180) == 0) {
                    var19[var60] = var22 + 1;
                    var20[var60] = var23;
                    var60 = var60 + 1 & var21;
                    var18[var31 + 1][var32] = 8;
                    var17[var31 + 1][var32] = var36;
                }
                if (var32 > 0 && var18[var31][var32 - 1] == 0 && (var30[var33][var34 - 1] & 0x1240102) == 0) {
                    var19[var60] = var22;
                    var20[var60] = var23 - 1;
                    var60 = var60 + 1 & var21;
                    var18[var31][var32 - 1] = 1;
                    var17[var31][var32 - 1] = var36;
                }
                if (var32 < var16 - 1 && var18[var31][var32 + 1] == 0 && (var30[var33][var34 + 1] & 0x1240120) == 0) {
                    var19[var60] = var22;
                    var20[var60] = var23 + 1;
                    var60 = var60 + 1 & var21;
                    var18[var31][var32 + 1] = 4;
                    var17[var31][var32 + 1] = var36;
                }
                if (var31 > 0 && var32 > 0 && var18[var31 - 1][var32 - 1] == 0 && (var30[var33 - 1][var34 - 1] & 0x124010E) == 0 && (var30[var33 - 1][var34] & 0x1240108) == 0 && (var30[var33][var34 - 1] & 0x1240102) == 0) {
                    var19[var60] = var22 - 1;
                    var20[var60] = var23 - 1;
                    var60 = var60 + 1 & var21;
                    var18[var31 - 1][var32 - 1] = 3;
                    var17[var31 - 1][var32 - 1] = var36;
                }
                if (var31 < var15 - 1 && var32 > 0 && var18[var31 + 1][var32 - 1] == 0 && (var30[var33 + 1][var34 - 1] & 0x1240183) == 0 && (var30[var33 + 1][var34] & 0x1240180) == 0 && (var30[var33][var34 - 1] & 0x1240102) == 0) {
                    var19[var60] = var22 + 1;
                    var20[var60] = var23 - 1;
                    var60 = var60 + 1 & var21;
                    var18[var31 + 1][var32 - 1] = 9;
                    var17[var31 + 1][var32 - 1] = var36;
                }
                if (var31 > 0 && var32 < var16 - 1 && var18[var31 - 1][var32 + 1] == 0 && (var30[var33 - 1][var34 + 1] & 0x1240138) == 0 && (var30[var33 - 1][var34] & 0x1240108) == 0 && (var30[var33][var34 + 1] & 0x1240120) == 0) {
                    var19[var60] = var22 - 1;
                    var20[var60] = var23 + 1;
                    var60 = var60 + 1 & var21;
                    var18[var31 - 1][var32 + 1] = 6;
                    var17[var31 - 1][var32 + 1] = var36;
                }
                if (var31 < var15 - 1 && var32 < var16 - 1 && var18[var31 + 1][var32 + 1] == 0 && (var30[var33 + 1][var34 + 1] & 0x12401E0) == 0 && (var30[var33 + 1][var34] & 0x1240180) == 0 && (var30[var33][var34 + 1] & 0x1240120) == 0) {
                    var19[var60] = var22 + 1;
                    var20[var60] = var23 + 1;
                    var60 = var60 + 1 & var21;
                    var18[var31 + 1][var32 + 1] = 12;
                    var17[var31 + 1][var32 + 1] = var36;
                }
            }
            var37 = var35;
        } else if (arg2 == 2) {
            var37 = method5207(arg0, arg1, arg3, arg4, arg8);
        } else {
            var37 = method7980(arg0, arg1, arg2, arg3, arg4, arg8);
        }
        int var38 = arg0 - (var9 >> 1);
        int var39 = arg1 - (var10 >> 1);
        int var40 = arg8.method3876();
        int var41 = arg8.method3877();
        if (!var37) {
            if (!arg5) {
                return -1;
            }
            int var42 = Integer.MAX_VALUE;
            int var43 = Integer.MAX_VALUE;
            byte var44 = 10;
            int var45 = arg3.field2393;
            int var46 = arg3.field2392;
            int var47 = arg3.field2394;
            int var48 = arg3.field2395;
            for (int var49 = var45 - var44; var49 <= var44 + var45; var49++) {
                for (int var50 = var46 - var44; var50 <= var44 + var46; var50++) {
                    int var51 = var49 - var38;
                    int var52 = var50 - var39;
                    if (var51 >= 0 && var52 >= 0 && var51 < var9 && var52 < var10 && var11[var51][var52] < 100) {
                        int var53 = 0;
                        if (var49 < var45) {
                            var53 = var45 - var49;
                        } else if (var49 > var45 + var47 - 1) {
                            var53 = var49 - (var45 + var47 - 1);
                        }
                        int var54 = 0;
                        if (var50 < var46) {
                            var54 = var46 - var50;
                        } else if (var50 > var46 + var48 - 1) {
                            var54 = var50 - (var46 + var48 - 1);
                        }
                        int var55 = var53 * var53 + var54 * var54;
                        if (var55 < var42 || var42 == var55 && var11[var51][var52] < var43) {
                            var42 = var55;
                            var43 = var11[var51][var52];
                            var40 = var49;
                            var41 = var50;
                        }
                    }
                }
            }
            if (var42 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var40 && arg1 == var41) {
            arg6[0] = var40;
            arg7[0] = var41;
            return 0;
        }
        byte var56 = 0;
        var13[var56] = var40;
        int var61 = var56 + 1;
        var14[var56] = var41;
        int var57;
        int var58 = var57 = var12[var40 - var38][var41 - var39];
        while (arg0 != var40 || arg1 != var41) {
            if (var57 != var58) {
                var57 = var58;
                var13[var61] = var40;
                var14[var61++] = var41;
            }
            if ((var58 & 0x2) != 0) {
                var40++;
            } else if ((var58 & 0x8) != 0) {
                var40--;
            }
            if ((var58 & 0x1) != 0) {
                var41++;
            } else if ((var58 & 0x4) != 0) {
                var41--;
            }
            var58 = var12[var40 - var38][var41 - var39];
        }
        int var59 = 0;
        while (var61-- > 0) {
            arg6[var59] = var13[var61];
            arg7[var59++] = var14[var61];
            if (var59 >= arg6.length) {
                break;
            }
        }
        return var59;
    }

    @ObfuscatedName("lk.ae(IILiw;Lis;Lij;S)Z")
    public static final boolean method5207(int arg0, int arg1, class216 arg2, class214 arg3, class217 arg4) {
        int var5 = arg4.method3878();
        int var6 = arg4.method3895();
        int[][] var7 = arg4.method3881();
        int[][] var8 = arg4.method3901();
        int[] var9 = arg4.method3882();
        int[] var10 = arg4.method3883();
        int var11 = arg4.method3884();
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
        int[][] var20 = arg3.field2379;
        while (var26 != var19) {
            var12 = var9[var19];
            var13 = var10[var19];
            var19 = var19 + 1 & var11;
            int var21 = var12 - var16;
            int var22 = var13 - var17;
            int var23 = var12 - arg3.field2375;
            int var24 = var13 - arg3.field2376;
            if (arg2.method1159(2, var12, var13, arg3)) {
                arg4.method3875(var12, var13);
                return true;
            }
            int var25 = var7[var21][var22] + 1;
            if (var21 > 0 && var8[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x124010E) == 0 && (var20[var23 - 1][var24 + 1] & 0x1240138) == 0) {
                var9[var26] = var12 - 1;
                var10[var26] = var13;
                var26 = var26 + 1 & var11;
                var8[var21 - 1][var22] = 2;
                var7[var21 - 1][var22] = var25;
            }
            if (var21 < var5 - 2 && var8[var21 + 1][var22] == 0 && (var20[var23 + 2][var24] & 0x1240183) == 0 && (var20[var23 + 2][var24 + 1] & 0x12401E0) == 0) {
                var9[var26] = var12 + 1;
                var10[var26] = var13;
                var26 = var26 + 1 & var11;
                var8[var21 + 1][var22] = 8;
                var7[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && var8[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x124010E) == 0 && (var20[var23 + 1][var24 - 1] & 0x1240183) == 0) {
                var9[var26] = var12;
                var10[var26] = var13 - 1;
                var26 = var26 + 1 & var11;
                var8[var21][var22 - 1] = 1;
                var7[var21][var22 - 1] = var25;
            }
            if (var22 < var6 - 2 && var8[var21][var22 + 1] == 0 && (var20[var23][var24 + 2] & 0x1240138) == 0 && (var20[var23 + 1][var24 + 2] & 0x12401E0) == 0) {
                var9[var26] = var12;
                var10[var26] = var13 + 1;
                var26 = var26 + 1 & var11;
                var8[var21][var22 + 1] = 4;
                var7[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && var8[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24] & 0x124013E) == 0 && (var20[var23 - 1][var24 - 1] & 0x124010E) == 0 && (var20[var23][var24 - 1] & 0x124018F) == 0) {
                var9[var26] = var12 - 1;
                var10[var26] = var13 - 1;
                var26 = var26 + 1 & var11;
                var8[var21 - 1][var22 - 1] = 3;
                var7[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < var5 - 2 && var22 > 0 && var8[var21 + 1][var22 - 1] == 0 && (var20[var23 + 1][var24 - 1] & 0x124018F) == 0 && (var20[var23 + 2][var24 - 1] & 0x1240183) == 0 && (var20[var23 + 2][var24] & 0x12401E3) == 0) {
                var9[var26] = var12 + 1;
                var10[var26] = var13 - 1;
                var26 = var26 + 1 & var11;
                var8[var21 + 1][var22 - 1] = 9;
                var7[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < var6 - 2 && var8[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + 1] & 0x124013E) == 0 && (var20[var23 - 1][var24 + 2] & 0x1240138) == 0 && (var20[var23][var24 + 2] & 0x12401F8) == 0) {
                var9[var26] = var12 - 1;
                var10[var26] = var13 + 1;
                var26 = var26 + 1 & var11;
                var8[var21 - 1][var22 + 1] = 6;
                var7[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < var5 - 2 && var22 < var6 - 2 && var8[var21 + 1][var22 + 1] == 0 && (var20[var23 + 1][var24 + 2] & 0x12401F8) == 0 && (var20[var23 + 2][var24 + 2] & 0x12401E0) == 0 && (var20[var23 + 2][var24 + 1] & 0x12401E3) == 0) {
                var9[var26] = var12 + 1;
                var10[var26] = var13 + 1;
                var26 = var26 + 1 & var11;
                var8[var21 + 1][var22 + 1] = 12;
                var7[var21 + 1][var22 + 1] = var25;
            }
        }
        arg4.method3875(var12, var13);
        return false;
    }

    @ObfuscatedName("sp.ao(IIILiw;Lis;Lij;I)Z")
    public static final boolean method7980(int arg0, int arg1, int arg2, class216 arg3, class214 arg4, class217 arg5) {
        int var6 = arg5.method3878();
        int var7 = arg5.method3895();
        int[][] var8 = arg5.method3881();
        int[][] var9 = arg5.method3901();
        int[] var10 = arg5.method3882();
        int[] var11 = arg5.method3883();
        int var12 = arg5.method3884();
        int var13 = arg0;
        int var14 = arg1;
        int var15 = var6 >> 1;
        int var16 = var7 >> 1;
        int var17 = arg0 - var15;
        int var18 = arg1 - var16;
        var9[var15][var16] = 99;
        var8[var15][var16] = 0;
        byte var19 = 0;
        int var20 = 0;
        var10[var19] = arg0;
        int var35 = var19 + 1;
        var11[var19] = arg1;
        int[][] var21 = arg4.field2379;
        while (true) {
            label265: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                do {
                    do {
                        do {
                            label242: do {
                                if (var35 == var20) {
                                    arg5.method3875(var13, var14);
                                    return false;
                                }
                                var13 = var10[var20];
                                var14 = var11[var20];
                                var20 = var20 + 1 & var12;
                                var22 = var13 - var17;
                                var23 = var14 - var18;
                                var24 = var13 - arg4.field2375;
                                var25 = var14 - arg4.field2376;
                                if (arg3.method1159(arg2, var13, var14, arg4)) {
                                    arg5.method3875(var13, var14);
                                    return true;
                                }
                                var26 = var8[var22][var23] + 1;
                                if (var22 > 0 && var9[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x124010E) == 0 && (var21[var24 - 1][arg2 + var25 - 1] & 0x1240138) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg2 - 1) {
                                            var10[var35] = var13 - 1;
                                            var11[var35] = var14;
                                            var35 = var35 + 1 & var12;
                                            var9[var22 - 1][var23] = 2;
                                            var8[var22 - 1][var23] = var26;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var27] & 0x124013E) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < var6 - arg2 && var9[var22 + 1][var23] == 0 && (var21[arg2 + var24][var25] & 0x1240183) == 0 && (var21[arg2 + var24][arg2 + var25 - 1] & 0x12401E0) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg2 - 1) {
                                            var10[var35] = var13 + 1;
                                            var11[var35] = var14;
                                            var35 = var35 + 1 & var12;
                                            var9[var22 + 1][var23] = 8;
                                            var8[var22 + 1][var23] = var26;
                                            break;
                                        }
                                        if ((var21[arg2 + var24][var25 + var28] & 0x12401E3) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var23 > 0 && var9[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x124010E) == 0 && (var21[arg2 + var24 - 1][var25 - 1] & 0x1240183) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg2 - 1) {
                                            var10[var35] = var13;
                                            var11[var35] = var14 - 1;
                                            var35 = var35 + 1 & var12;
                                            var9[var22][var23 - 1] = 1;
                                            var8[var22][var23 - 1] = var26;
                                            break;
                                        }
                                        if ((var21[var24 + var29][var25 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var23 < var7 - arg2 && var9[var22][var23 + 1] == 0 && (var21[var24][arg2 + var25] & 0x1240138) == 0 && (var21[arg2 + var24 - 1][arg2 + var25] & 0x12401E0) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg2 - 1) {
                                            var10[var35] = var13;
                                            var11[var35] = var14 + 1;
                                            var35 = var35 + 1 & var12;
                                            var9[var22][var23 + 1] = 4;
                                            var8[var22][var23 + 1] = var26;
                                            break;
                                        }
                                        if ((var21[var24 + var30][arg2 + var25] & 0x12401F8) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var23 > 0 && var9[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x124010E) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg2) {
                                            var10[var35] = var13 - 1;
                                            var11[var35] = var14 - 1;
                                            var35 = var35 + 1 & var12;
                                            var9[var22 - 1][var23 - 1] = 3;
                                            var8[var22 - 1][var23 - 1] = var26;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 - 1 + var31] & 0x124013E) != 0 || (var21[var24 - 1 + var31][var25 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < var6 - arg2 && var23 > 0 && var9[var22 + 1][var23 - 1] == 0 && (var21[arg2 + var24][var25 - 1] & 0x1240183) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg2) {
                                            var10[var35] = var13 + 1;
                                            var11[var35] = var14 - 1;
                                            var35 = var35 + 1 & var12;
                                            var9[var22 + 1][var23 - 1] = 9;
                                            var8[var22 + 1][var23 - 1] = var26;
                                            break;
                                        }
                                        if ((var21[arg2 + var24][var25 - 1 + var32] & 0x12401E3) != 0 || (var21[var24 + var32][var25 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var23 < var7 - arg2 && var9[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][arg2 + var25] & 0x1240138) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var21[var24 - 1][var25 + var33] & 0x124013E) != 0 || (var21[var24 - 1 + var33][arg2 + var25] & 0x12401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    var10[var35] = var13 - 1;
                                    var11[var35] = var14 + 1;
                                    var35 = var35 + 1 & var12;
                                    var9[var22 - 1][var23 + 1] = 6;
                                    var8[var22 - 1][var23 + 1] = var26;
                                }
                            } while (var22 >= var6 - arg2);
                        } while (var23 >= var7 - arg2);
                    } while (var9[var22 + 1][var23 + 1] != 0);
                } while ((var21[arg2 + var24][arg2 + var25] & 0x12401E0) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var21[var24 + var34][arg2 + var25] & 0x12401F8) != 0 || (var21[arg2 + var24][var25 + var34] & 0x12401E3) != 0) {
                        continue label265;
                    }
                }
                var10[var35] = var13 + 1;
                var11[var35] = var14 + 1;
                var35 = var35 + 1 & var12;
                var9[var22 + 1][var23 + 1] = 12;
                var8[var22 + 1][var23 + 1] = var26;
            }
        }
    }
}
