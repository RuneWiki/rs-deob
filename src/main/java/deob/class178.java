package deob;

@ObfuscatedName("fq")
public class class178 {

    @ObfuscatedName("fq.o")
    public static int[][] field2275 = new int[128][128];

    @ObfuscatedName("fq.j")
    public static int[][] field2276 = new int[128][128];

    @ObfuscatedName("fq.p")
    public static int[] field2273 = new int[4096];

    @ObfuscatedName("fq.w")
    public static int[] field2277 = new int[4096];

    public class178() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.c(IIILfn;Lfk;Z[I[IB)I")
    public static int method134(int arg0, int arg1, int arg2, class179 arg3, class177 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field2275[var8][var9] = 0;
                field2276[var8][var9] = 99999999;
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
            field2275[var12][var13] = 99;
            field2276[var12][var13] = 0;
            byte var16 = 0;
            int var17 = 0;
            field2273[var16] = arg0;
            int var63 = var16 + 1;
            field2277[var16] = arg1;
            int[][] var18 = arg4.field2271;
            boolean var23;
            while (true) {
                if (var63 == var17) {
                    Statics.field1687 = var10;
                    Statics.field2278 = var11;
                    var23 = false;
                    break;
                }
                var10 = field2273[var17];
                var11 = field2277[var17];
                var17 = var17 + 1 & 0xFFF;
                int var19 = var10 - var14;
                int var20 = var11 - var15;
                int var21 = var10 - arg4.field2267;
                int var22 = var11 - arg4.field2268;
                if (arg3.method1030(1, var10, var11, arg4)) {
                    Statics.field1687 = var10;
                    Statics.field2278 = var11;
                    var23 = true;
                    break;
                }
                int var24 = field2276[var19][var20] + 1;
                if (var19 > 0 && field2275[var19 - 1][var20] == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0) {
                    field2273[var63] = var10 - 1;
                    field2277[var63] = var11;
                    var63 = var63 + 1 & 0xFFF;
                    field2275[var19 - 1][var20] = 2;
                    field2276[var19 - 1][var20] = var24;
                }
                if (var19 < 127 && field2275[var19 + 1][var20] == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0) {
                    field2273[var63] = var10 + 1;
                    field2277[var63] = var11;
                    var63 = var63 + 1 & 0xFFF;
                    field2275[var19 + 1][var20] = 8;
                    field2276[var19 + 1][var20] = var24;
                }
                if (var20 > 0 && field2275[var19][var20 - 1] == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2273[var63] = var10;
                    field2277[var63] = var11 - 1;
                    var63 = var63 + 1 & 0xFFF;
                    field2275[var19][var20 - 1] = 1;
                    field2276[var19][var20 - 1] = var24;
                }
                if (var20 < 127 && field2275[var19][var20 + 1] == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2273[var63] = var10;
                    field2277[var63] = var11 + 1;
                    var63 = var63 + 1 & 0xFFF;
                    field2275[var19][var20 + 1] = 4;
                    field2276[var19][var20 + 1] = var24;
                }
                if (var19 > 0 && var20 > 0 && field2275[var19 - 1][var20 - 1] == 0 && (var18[var21 - 1][var22 - 1] & 0x124010E) == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2273[var63] = var10 - 1;
                    field2277[var63] = var11 - 1;
                    var63 = var63 + 1 & 0xFFF;
                    field2275[var19 - 1][var20 - 1] = 3;
                    field2276[var19 - 1][var20 - 1] = var24;
                }
                if (var19 < 127 && var20 > 0 && field2275[var19 + 1][var20 - 1] == 0 && (var18[var21 + 1][var22 - 1] & 0x1240183) == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0 && (var18[var21][var22 - 1] & 0x1240102) == 0) {
                    field2273[var63] = var10 + 1;
                    field2277[var63] = var11 - 1;
                    var63 = var63 + 1 & 0xFFF;
                    field2275[var19 + 1][var20 - 1] = 9;
                    field2276[var19 + 1][var20 - 1] = var24;
                }
                if (var19 > 0 && var20 < 127 && field2275[var19 - 1][var20 + 1] == 0 && (var18[var21 - 1][var22 + 1] & 0x1240138) == 0 && (var18[var21 - 1][var22] & 0x1240108) == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2273[var63] = var10 - 1;
                    field2277[var63] = var11 + 1;
                    var63 = var63 + 1 & 0xFFF;
                    field2275[var19 - 1][var20 + 1] = 6;
                    field2276[var19 - 1][var20 + 1] = var24;
                }
                if (var19 < 127 && var20 < 127 && field2275[var19 + 1][var20 + 1] == 0 && (var18[var21 + 1][var22 + 1] & 0x12401E0) == 0 && (var18[var21 + 1][var22] & 0x1240180) == 0 && (var18[var21][var22 + 1] & 0x1240120) == 0) {
                    field2273[var63] = var10 + 1;
                    field2277[var63] = var11 + 1;
                    var63 = var63 + 1 & 0xFFF;
                    field2275[var19 + 1][var20 + 1] = 12;
                    field2276[var19 + 1][var20 + 1] = var24;
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
            field2275[var28][var29] = 99;
            field2276[var28][var29] = 0;
            byte var32 = 0;
            int var33 = 0;
            field2273[var32] = arg0;
            int var64 = var32 + 1;
            field2277[var32] = arg1;
            int[][] var34 = arg4.field2271;
            boolean var39;
            while (true) {
                if (var64 == var33) {
                    Statics.field1687 = var26;
                    Statics.field2278 = var27;
                    var39 = false;
                    break;
                }
                var26 = field2273[var33];
                var27 = field2277[var33];
                var33 = var33 + 1 & 0xFFF;
                int var35 = var26 - var30;
                int var36 = var27 - var31;
                int var37 = var26 - arg4.field2267;
                int var38 = var27 - arg4.field2268;
                if (arg3.method1030(2, var26, var27, arg4)) {
                    Statics.field1687 = var26;
                    Statics.field2278 = var27;
                    var39 = true;
                    break;
                }
                int var40 = field2276[var35][var36] + 1;
                if (var35 > 0 && field2275[var35 - 1][var36] == 0 && (var34[var37 - 1][var38] & 0x124010E) == 0 && (var34[var37 - 1][var38 + 1] & 0x1240138) == 0) {
                    field2273[var64] = var26 - 1;
                    field2277[var64] = var27;
                    var64 = var64 + 1 & 0xFFF;
                    field2275[var35 - 1][var36] = 2;
                    field2276[var35 - 1][var36] = var40;
                }
                if (var35 < 126 && field2275[var35 + 1][var36] == 0 && (var34[var37 + 2][var38] & 0x1240183) == 0 && (var34[var37 + 2][var38 + 1] & 0x12401E0) == 0) {
                    field2273[var64] = var26 + 1;
                    field2277[var64] = var27;
                    var64 = var64 + 1 & 0xFFF;
                    field2275[var35 + 1][var36] = 8;
                    field2276[var35 + 1][var36] = var40;
                }
                if (var36 > 0 && field2275[var35][var36 - 1] == 0 && (var34[var37][var38 - 1] & 0x124010E) == 0 && (var34[var37 + 1][var38 - 1] & 0x1240183) == 0) {
                    field2273[var64] = var26;
                    field2277[var64] = var27 - 1;
                    var64 = var64 + 1 & 0xFFF;
                    field2275[var35][var36 - 1] = 1;
                    field2276[var35][var36 - 1] = var40;
                }
                if (var36 < 126 && field2275[var35][var36 + 1] == 0 && (var34[var37][var38 + 2] & 0x1240138) == 0 && (var34[var37 + 1][var38 + 2] & 0x12401E0) == 0) {
                    field2273[var64] = var26;
                    field2277[var64] = var27 + 1;
                    var64 = var64 + 1 & 0xFFF;
                    field2275[var35][var36 + 1] = 4;
                    field2276[var35][var36 + 1] = var40;
                }
                if (var35 > 0 && var36 > 0 && field2275[var35 - 1][var36 - 1] == 0 && (var34[var37 - 1][var38] & 0x124013E) == 0 && (var34[var37 - 1][var38 - 1] & 0x124010E) == 0 && (var34[var37][var38 - 1] & 0x124018F) == 0) {
                    field2273[var64] = var26 - 1;
                    field2277[var64] = var27 - 1;
                    var64 = var64 + 1 & 0xFFF;
                    field2275[var35 - 1][var36 - 1] = 3;
                    field2276[var35 - 1][var36 - 1] = var40;
                }
                if (var35 < 126 && var36 > 0 && field2275[var35 + 1][var36 - 1] == 0 && (var34[var37 + 1][var38 - 1] & 0x124018F) == 0 && (var34[var37 + 2][var38 - 1] & 0x1240183) == 0 && (var34[var37 + 2][var38] & 0x12401E3) == 0) {
                    field2273[var64] = var26 + 1;
                    field2277[var64] = var27 - 1;
                    var64 = var64 + 1 & 0xFFF;
                    field2275[var35 + 1][var36 - 1] = 9;
                    field2276[var35 + 1][var36 - 1] = var40;
                }
                if (var35 > 0 && var36 < 126 && field2275[var35 - 1][var36 + 1] == 0 && (var34[var37 - 1][var38 + 1] & 0x124013E) == 0 && (var34[var37 - 1][var38 + 2] & 0x1240138) == 0 && (var34[var37][var38 + 2] & 0x12401F8) == 0) {
                    field2273[var64] = var26 - 1;
                    field2277[var64] = var27 + 1;
                    var64 = var64 + 1 & 0xFFF;
                    field2275[var35 - 1][var36 + 1] = 6;
                    field2276[var35 - 1][var36 + 1] = var40;
                }
                if (var35 < 126 && var36 < 126 && field2275[var35 + 1][var36 + 1] == 0 && (var34[var37 + 1][var38 + 2] & 0x12401F8) == 0 && (var34[var37 + 2][var38 + 2] & 0x12401E0) == 0 && (var34[var37 + 2][var38 + 1] & 0x12401E3) == 0) {
                    field2273[var64] = var26 + 1;
                    field2277[var64] = var27 + 1;
                    var64 = var64 + 1 & 0xFFF;
                    field2275[var35 + 1][var36 + 1] = 12;
                    field2276[var35 + 1][var36 + 1] = var40;
                }
            }
            var25 = var39;
        } else {
            var25 = method615(arg0, arg1, arg2, arg3, arg4);
        }
        int var41 = arg0 - 64;
        int var42 = arg1 - 64;
        int var43 = Statics.field1687;
        int var44 = Statics.field2278;
        if (!var25) {
            if (!arg5) {
                return -1;
            }
            int var45 = Integer.MAX_VALUE;
            int var46 = Integer.MAX_VALUE;
            byte var47 = 10;
            int var48 = arg3.field2284;
            int var49 = arg3.field2283;
            int var50 = arg3.field2281;
            int var51 = arg3.field2282;
            for (int var52 = var48 - var47; var52 <= var47 + var48; var52++) {
                for (int var53 = var49 - var47; var53 <= var47 + var49; var53++) {
                    int var54 = var52 - var41;
                    int var55 = var53 - var42;
                    if (var54 >= 0 && var55 >= 0 && var54 < 128 && var55 < 128 && field2276[var54][var55] < 100) {
                        int var56 = 0;
                        if (var52 < var48) {
                            var56 = var48 - var52;
                        } else if (var52 > var48 + var50 - 1) {
                            var56 = var52 - (var48 + var50 - 1);
                        }
                        int var57 = 0;
                        if (var53 < var49) {
                            var57 = var49 - var53;
                        } else if (var53 > var49 + var51 - 1) {
                            var57 = var53 - (var49 + var51 - 1);
                        }
                        int var58 = var56 * var56 + var57 * var57;
                        if (var58 < var45 || var45 == var58 && field2276[var54][var55] < var46) {
                            var45 = var58;
                            var46 = field2276[var54][var55];
                            var43 = var52;
                            var44 = var53;
                        }
                    }
                }
            }
            if (var45 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var43 && arg1 == var44) {
            return 0;
        }
        byte var59 = 0;
        field2273[var59] = var43;
        int var65 = var59 + 1;
        field2277[var59] = var44;
        int var60;
        int var61 = var60 = field2275[var43 - var41][var44 - var42];
        while (arg0 != var43 || arg1 != var44) {
            if (var60 != var61) {
                var60 = var61;
                field2273[var65] = var43;
                field2277[var65++] = var44;
            }
            if ((var61 & 0x2) != 0) {
                var43++;
            } else if ((var61 & 0x8) != 0) {
                var43--;
            }
            if ((var61 & 0x1) != 0) {
                var44++;
            } else if ((var61 & 0x4) != 0) {
                var44--;
            }
            var61 = field2275[var43 - var41][var44 - var42];
        }
        int var62 = 0;
        while (var65-- > 0) {
            arg6[var62] = field2273[var65];
            arg7[var62++] = field2277[var65];
            if (var62 >= arg6.length) {
                break;
            }
        }
        return var62;
    }

    @ObfuscatedName("av.i(IIILfn;Lfk;I)Z")
    public static final boolean method615(int arg0, int arg1, int arg2, class179 arg3, class177 arg4) {
        int var5 = arg0;
        int var6 = arg1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = arg0 - var7;
        int var10 = arg1 - var8;
        field2275[var7][var8] = 99;
        field2276[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        field2273[var11] = arg0;
        int var27 = var11 + 1;
        field2277[var11] = arg1;
        int[][] var13 = arg4.field2271;
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
                                    Statics.field1687 = var5;
                                    Statics.field2278 = var6;
                                    return false;
                                }
                                var5 = field2273[var12];
                                var6 = field2277[var12];
                                var12 = var12 + 1 & 0xFFF;
                                var14 = var5 - var9;
                                var15 = var6 - var10;
                                var16 = var5 - arg4.field2267;
                                var17 = var6 - arg4.field2268;
                                if (arg3.method1030(arg2, var5, var6, arg4)) {
                                    Statics.field1687 = var5;
                                    Statics.field2278 = var6;
                                    return true;
                                }
                                var18 = field2276[var14][var15] + 1;
                                if (var14 > 0 && field2275[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 0x124010E) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 0x1240138) == 0) {
                                    int var19 = 1;
                                    while (true) {
                                        if (var19 >= arg2 - 1) {
                                            field2273[var27] = var5 - 1;
                                            field2277[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2275[var14 - 1][var15] = 2;
                                            field2276[var14 - 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 + var19] & 0x124013E) != 0) {
                                            break;
                                        }
                                        var19++;
                                    }
                                }
                                if (var14 < 128 - arg2 && field2275[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 0x1240183) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 0x12401E0) == 0) {
                                    int var20 = 1;
                                    while (true) {
                                        if (var20 >= arg2 - 1) {
                                            field2273[var27] = var5 + 1;
                                            field2277[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2275[var14 + 1][var15] = 8;
                                            field2276[var14 + 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 + var20] & 0x12401E3) != 0) {
                                            break;
                                        }
                                        var20++;
                                    }
                                }
                                if (var15 > 0 && field2275[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 0x124010E) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 0x1240183) == 0) {
                                    int var21 = 1;
                                    while (true) {
                                        if (var21 >= arg2 - 1) {
                                            field2273[var27] = var5;
                                            field2277[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2275[var14][var15 - 1] = 1;
                                            field2276[var14][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var21][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var21++;
                                    }
                                }
                                if (var15 < 128 - arg2 && field2275[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 0x1240138) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 0x12401E0) == 0) {
                                    int var22 = 1;
                                    while (true) {
                                        if (var22 >= arg2 - 1) {
                                            field2273[var27] = var5;
                                            field2277[var27] = var6 + 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2275[var14][var15 + 1] = 4;
                                            field2276[var14][var15 + 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var22][arg2 + var17] & 0x12401F8) != 0) {
                                            break;
                                        }
                                        var22++;
                                    }
                                }
                                if (var14 > 0 && var15 > 0 && field2275[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 0x124010E) == 0) {
                                    int var23 = 1;
                                    while (true) {
                                        if (var23 >= arg2) {
                                            field2273[var27] = var5 - 1;
                                            field2277[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2275[var14 - 1][var15 - 1] = 3;
                                            field2276[var14 - 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 - 1 + var23] & 0x124013E) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var23++;
                                    }
                                }
                                if (var14 < 128 - arg2 && var15 > 0 && field2275[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 0x1240183) == 0) {
                                    int var24 = 1;
                                    while (true) {
                                        if (var24 >= arg2) {
                                            field2273[var27] = var5 + 1;
                                            field2277[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field2275[var14 + 1][var15 - 1] = 9;
                                            field2276[var14 + 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 - 1 + var24] & 0x12401E3) != 0 || (var13[var16 + var24][var17 - 1] & 0x124018F) != 0) {
                                            break;
                                        }
                                        var24++;
                                    }
                                }
                                if (var14 > 0 && var15 < 128 - arg2 && field2275[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 0x1240138) == 0) {
                                    for (int var25 = 1; var25 < arg2; var25++) {
                                        if ((var13[var16 - 1][var17 + var25] & 0x124013E) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 0x12401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    field2273[var27] = var5 - 1;
                                    field2277[var27] = var6 + 1;
                                    var27 = var27 + 1 & 0xFFF;
                                    field2275[var14 - 1][var15 + 1] = 6;
                                    field2276[var14 - 1][var15 + 1] = var18;
                                }
                            } while (var14 >= 128 - arg2);
                        } while (var15 >= 128 - arg2);
                    } while (field2275[var14 + 1][var15 + 1] != 0);
                } while ((var13[arg2 + var16][arg2 + var17] & 0x12401E0) != 0);
                for (int var26 = 1; var26 < arg2; var26++) {
                    if ((var13[var16 + var26][arg2 + var17] & 0x12401F8) != 0 || (var13[arg2 + var16][var17 + var26] & 0x12401E3) != 0) {
                        continue label265;
                    }
                }
                field2273[var27] = var5 + 1;
                field2277[var27] = var6 + 1;
                var27 = var27 + 1 & 0xFFF;
                field2275[var14 + 1][var15 + 1] = 12;
                field2276[var14 + 1][var15 + 1] = var18;
            }
        }
    }
}
