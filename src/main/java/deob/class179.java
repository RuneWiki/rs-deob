package deob;

@ObfuscatedName("fi")
public class class179 {

    @ObfuscatedName("fi.q")
    public static int[][] field2117 = new int[128][128];

    @ObfuscatedName("fi.w")
    public static int[][] field2118 = new int[128][128];

    @ObfuscatedName("fi.l")
    public static int[] field2116 = new int[4096];

    @ObfuscatedName("fi.e")
    public static int[] field2120 = new int[4096];

    public class179() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.m(IIILfe;Lfy;Z[I[IB)I")
    public static int method3224(int arg0, int arg1, int arg2, class180 arg3, class178 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field2117[var8][var9] = 0;
                field2118[var8][var9] = 99999999;
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
            field2117[var12][var13] = 99;
            field2118[var12][var13] = 0;
            byte var16 = 0;
            int var17 = 0;
            field2116[var16] = arg0;
            int var48 = var16 + 1;
            field2120[var16] = arg1;
            int[][] var18 = arg4.field2104;
            boolean var23;
            while (true) {
                if (var48 == var17) {
                    Statics.field536 = var10;
                    Statics.field1921 = var11;
                    var23 = false;
                    break;
                }
                var10 = field2116[var17];
                var11 = field2120[var17];
                var17 = var17 + 1 & 0xFFF;
                int var19 = var10 - var14;
                int var20 = var11 - var15;
                int var21 = var10 - arg4.field2114;
                int var22 = var11 - arg4.field2109;
                if (arg3.method1092(1, var10, var11, arg4)) {
                    Statics.field536 = var10;
                    Statics.field1921 = var11;
                    var23 = true;
                    break;
                }
                int var24 = field2118[var19][var20] + 1;
                if (var19 > 0 && field2117[var19 - 1][var20] == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0) {
                    field2116[var48] = var10 - 1;
                    field2120[var48] = var11;
                    var48 = var48 + 1 & 0xFFF;
                    field2117[var19 - 1][var20] = 2;
                    field2118[var19 - 1][var20] = var24;
                }
                if (var19 < 127 && field2117[var19 + 1][var20] == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0) {
                    field2116[var48] = var10 + 1;
                    field2120[var48] = var11;
                    var48 = var48 + 1 & 0xFFF;
                    field2117[var19 + 1][var20] = 8;
                    field2118[var19 + 1][var20] = var24;
                }
                if (var20 > 0 && field2117[var19][var20 - 1] == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2116[var48] = var10;
                    field2120[var48] = var11 - 1;
                    var48 = var48 + 1 & 0xFFF;
                    field2117[var19][var20 - 1] = 1;
                    field2118[var19][var20 - 1] = var24;
                }
                if (var20 < 127 && field2117[var19][var20 + 1] == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2116[var48] = var10;
                    field2120[var48] = var11 + 1;
                    var48 = var48 + 1 & 0xFFF;
                    field2117[var19][var20 + 1] = 4;
                    field2118[var19][var20 + 1] = var24;
                }
                if (var19 > 0 && var20 > 0 && field2117[var19 - 1][var20 - 1] == 0 && (var18[var21 - 1][var22 - 1] & 0x124010E) == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2116[var48] = var10 - 1;
                    field2120[var48] = var11 - 1;
                    var48 = var48 + 1 & 0xFFF;
                    field2117[var19 - 1][var20 - 1] = 3;
                    field2118[var19 - 1][var20 - 1] = var24;
                }
                if (var19 < 127 && var20 > 0 && field2117[var19 + 1][var20 - 1] == 0 && (var18[var21 + 1][var22 - 1] & 0x1240183) == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2116[var48] = var10 + 1;
                    field2120[var48] = var11 - 1;
                    var48 = var48 + 1 & 0xFFF;
                    field2117[var19 + 1][var20 - 1] = 9;
                    field2118[var19 + 1][var20 - 1] = var24;
                }
                if (var19 > 0 && var20 < 127 && field2117[var19 - 1][var20 + 1] == 0 && (var18[var21 - 1][var22 + 1] & 0x1240138) == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2116[var48] = var10 - 1;
                    field2120[var48] = var11 + 1;
                    var48 = var48 + 1 & 0xFFF;
                    field2117[var19 - 1][var20 + 1] = 6;
                    field2118[var19 - 1][var20 + 1] = var24;
                }
                if (var19 < 127 && var20 < 127 && field2117[var19 + 1][var20 + 1] == 0 && (var18[var21 + 1][var22 + 1] & 0x12401E0) == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2116[var48] = var10 + 1;
                    field2120[var48] = var11 + 1;
                    var48 = var48 + 1 & 0xFFF;
                    field2117[var19 + 1][var20 + 1] = 12;
                    field2118[var19 + 1][var20 + 1] = var24;
                }
            }
            var25 = var23;
        } else if (arg2 == 2) {
            var25 = method525(arg0, arg1, arg3, arg4);
        } else {
            var25 = method3237(arg0, arg1, arg2, arg3, arg4);
        }
        int var26 = arg0 - 64;
        int var27 = arg1 - 64;
        int var28 = Statics.field536;
        int var29 = Statics.field1921;
        if (!var25) {
            if (!arg5) {
                return -1;
            }
            int var30 = Integer.MAX_VALUE;
            int var31 = Integer.MAX_VALUE;
            byte var32 = 10;
            int var33 = arg3.field2121;
            int var34 = arg3.field2122;
            int var35 = arg3.field2123;
            int var36 = arg3.field2124;
            for (int var37 = var33 - var32; var37 <= var32 + var33; var37++) {
                for (int var38 = var34 - var32; var38 <= var32 + var34; var38++) {
                    int var39 = var37 - var26;
                    int var40 = var38 - var27;
                    if (var39 >= 0 && var40 >= 0 && var39 < 128 && var40 < 128 && field2118[var39][var40] < 100) {
                        int var41 = 0;
                        if (var37 < var33) {
                            var41 = var33 - var37;
                        } else if (var37 > var33 + var35 - 1) {
                            var41 = var37 - (var33 + var35 - 1);
                        }
                        int var42 = 0;
                        if (var38 < var34) {
                            var42 = var34 - var38;
                        } else if (var38 > var34 + var36 - 1) {
                            var42 = var38 - (var34 + var36 - 1);
                        }
                        int var43 = var41 * var41 + var42 * var42;
                        if (var43 < var30 || var30 == var43 && field2118[var39][var40] < var31) {
                            var30 = var43;
                            var31 = field2118[var39][var40];
                            var28 = var37;
                            var29 = var38;
                        }
                    }
                }
            }
            if (var30 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var28 && arg1 == var29) {
            return 0;
        }
        byte var44 = 0;
        field2116[var44] = var28;
        int var49 = var44 + 1;
        field2120[var44] = var29;
        int var45;
        int var46 = var45 = field2117[var28 - var26][var29 - var27];
        while (arg0 != var28 || arg1 != var29) {
            if (var45 != var46) {
                var45 = var46;
                field2116[var49] = var28;
                field2120[var49++] = var29;
            }
            if ((var46 & 0x2) != 0) {
                var28++;
            } else if ((var46 & 0x8) != 0) {
                var28--;
            }
            if ((var46 & 0x1) != 0) {
                var29++;
            } else if ((var46 & 0x4) != 0) {
                var29--;
            }
            var46 = field2117[var28 - var26][var29 - var27];
        }
        int var47 = 0;
        while (var49-- > 0) {
            arg6[var47] = field2116[var49];
            arg7[var47++] = field2120[var49];
            if (var47 >= arg6.length) {
                break;
            }
        }
        return var47;
    }

    @ObfuscatedName("ah.f(IILfe;Lfy;I)Z")
    public static final boolean method525(int arg0, int arg1, class180 arg2, class178 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2117[var6][var7] = 99;
        field2118[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2116[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2120[var10001] = arg1;
        int[][] var12 = arg3.field2104;
        while (var18 != var11) {
            var4 = field2116[var11];
            var5 = field2120[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2114;
            int var16 = var5 - arg3.field2109;
            if (arg2.method1092(2, var4, var5, arg3)) {
                Statics.field536 = var4;
                Statics.field1921 = var5;
                return true;
            }
            int var17 = field2118[var13][var14] + 1;
            if (var13 > 0 && field2117[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x124010E) == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0) {
                field2116[var18] = var4 - 1;
                field2120[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2117[var13 - 1][var14] = 2;
                field2118[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field2117[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x1240183) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E0) == 0) {
                field2116[var18] = var4 + 1;
                field2120[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2117[var13 + 1][var14] = 8;
                field2118[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2117[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x124010E) == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0) {
                field2116[var18] = var4;
                field2120[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2117[var13][var14 - 1] = 1;
                field2118[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field2117[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x1240138) == 0 && (var12[var15 + 1][var16 + 2] & 0x12401E0) == 0) {
                field2116[var18] = var4;
                field2120[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2117[var13][var14 + 1] = 4;
                field2118[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2117[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x124013E) == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15][var16 - 1] & 0x124018F) == 0) {
                field2116[var18] = var4 - 1;
                field2120[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2117[var13 - 1][var14 - 1] = 3;
                field2118[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field2117[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x124018F) == 0 && (var12[var15 + 2][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 2][var16] & 0x12401E3) == 0) {
                field2116[var18] = var4 + 1;
                field2120[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2117[var13 + 1][var14 - 1] = 9;
                field2118[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field2117[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x124013E) == 0 && (var12[var15 - 1][var16 + 2] & 0x1240138) == 0 && (var12[var15][var16 + 2] & 0x12401F8) == 0) {
                field2116[var18] = var4 - 1;
                field2120[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2117[var13 - 1][var14 + 1] = 6;
                field2118[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field2117[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x12401F8) == 0 && (var12[var15 + 2][var16 + 2] & 0x12401E0) == 0 && (var12[var15 + 2][var16 + 1] & 0x12401E3) == 0) {
                field2116[var18] = var4 + 1;
                field2120[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2117[var13 + 1][var14 + 1] = 12;
                field2118[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field536 = var4;
        Statics.field1921 = var5;
        return false;
    }

    @ObfuscatedName("ff.q(IIILfe;Lfy;B)Z")
    public static final boolean method3237(int arg0, int arg1, int arg2, class180 arg3, class178 arg4) {
        int var5 = arg0;
        int var6 = arg1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = arg0 - var7;
        int var10 = arg1 - var8;
        field2117[var7][var8] = 99;
        field2118[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        field2116[var11] = arg0;
        int var27 = var11 + 1;
        field2120[var11] = arg1;
        int[][] var13 = arg4.field2104;
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
                                    Statics.field536 = var5;
                                    Statics.field1921 = var6;
                                    return false;
                                }
                                var5 = field2116[var12];
                                var6 = field2120[var12];
                                var12 = var12 + 1 & 0xFFF;
                                var14 = var5 - var9;
                                var15 = var6 - var10;
                                var16 = var5 - arg4.field2114;
                                var17 = var6 - arg4.field2109;
                                if (arg3.method1092(arg2, var5, var6, arg4)) {
                                    Statics.field536 = var5;
                                    Statics.field1921 = var6;
                                    return true;
                                }
                                var18 = field2118[var14][var15] + 1;
                                if (var14 > 0 && field2117[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 0x124010E) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 0x1240138) == 0) {
                                    int var19 = 1;
                                    while (true) {
                                        if (var19 >= arg2 - 1) {
                                            field2116[var27] = var5 - 1;
                                            field2120[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2117[var14 - 1][var15] = 2;
                                            field2118[var14 - 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 + var19] & 0x124013E) != 0) {
                                            break;
                                        }
                                        var19++;
                                    }
                                }
                                if (var14 < 128 - arg2 && field2117[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 0x1240183) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 0x12401E0) == 0) {
                                    int var20 = 1;
                                    while (true) {
                                        if (var20 >= arg2 - 1) {
                                            field2116[var27] = var5 + 1;
                                            field2120[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2117[var14 + 1][var15] = 8;
                                            field2118[var14 + 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 + var20] & 0x12401E3) != 0) {
                                            break;
                                        }
                                        var20++;
                                    }
                                }
                                if (var15 > 0 && field2117[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 0x124010E) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 0x1240183) == 0) {
                                    int var21 = 1;
                                    while (true) {
                                        if (var21 >= arg2 - 1) {
                                            field2116[var27] = var5;
                                            field2120[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2117[var14][var15 - 1] = 1;
                                            field2118[var14][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var21][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var21++;
                                    }
                                }
                                if (var15 < 128 - arg2 && field2117[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 0x1240138) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 0x12401E0) == 0) {
                                    int var22 = 1;
                                    while (true) {
                                        if (var22 >= arg2 - 1) {
                                            field2116[var27] = var5;
                                            field2120[var27] = var6 + 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2117[var14][var15 + 1] = 4;
                                            field2118[var14][var15 + 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var22][arg2 + var17] & 0x12401F8) != 0) {
                                            break;
                                        }
                                        var22++;
                                    }
                                }
                                if (var14 > 0 && var15 > 0 && field2117[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 0x124010E) == 0) {
                                    int var23 = 1;
                                    while (true) {
                                        if (var23 >= arg2) {
                                            field2116[var27] = var5 - 1;
                                            field2120[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2117[var14 - 1][var15 - 1] = 3;
                                            field2118[var14 - 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 - 1 + var23] & 0x124013E) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var23++;
                                    }
                                }
                                if (var14 < 128 - arg2 && var15 > 0 && field2117[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 0x1240183) == 0) {
                                    int var24 = 1;
                                    while (true) {
                                        if (var24 >= arg2) {
                                            field2116[var27] = var5 + 1;
                                            field2120[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2117[var14 + 1][var15 - 1] = 9;
                                            field2118[var14 + 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 - 1 + var24] & 0x12401E3) != 0 || (var13[var16 + var24][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var24++;
                                    }
                                }
                                if (var14 > 0 && var15 < 128 - arg2 && field2117[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 0x1240138) == 0) {
                                    for (int var25 = 1; var25 < arg2; var25++) {
                                        if ((var13[var16 - 1][var17 + var25] & 0x124013E) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 0x12401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    field2116[var27] = var5 - 1;
                                    field2120[var27] = var6 + 1;
                                    var27 = var27 + 1 & 0xFFF;
                                    field2117[var14 - 1][var15 + 1] = 6;
                                    field2118[var14 - 1][var15 + 1] = var18;
                                }
                            } while (var14 >= 128 - arg2);
                        } while (var15 >= 128 - arg2);
                    } while (field2117[var14 + 1][var15 + 1] != 0);
                } while ((var13[arg2 + var16][arg2 + var17] & 0x12401E0) != 0);
                for (int var26 = 1; var26 < arg2; var26++) {
                    if ((var13[var16 + var26][arg2 + var17] & 0x12401F8) != 0 || (var13[arg2 + var16][var17 + var26] & 0x12401E3) != 0) {
                        continue label265;
                    }
                }
                field2116[var27] = var5 + 1;
                field2120[var27] = var6 + 1;
                var27 = var27 + 1 & 0xFFF;
                field2117[var14 + 1][var15 + 1] = 12;
                field2118[var14 + 1][var15 + 1] = var18;
            }
        }
    }
}
