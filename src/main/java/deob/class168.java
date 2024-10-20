package deob;

@ObfuscatedName("fl")
public class class168 {

    @ObfuscatedName("fl.n")
    public static int[][] field2075 = new int[128][128];

    @ObfuscatedName("fl.u")
    public static int[][] field2074 = new int[128][128];

    @ObfuscatedName("fl.p")
    public static int[] field2072 = new int[4096];

    @ObfuscatedName("fl.e")
    public static int[] field2079 = new int[4096];

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.y(IIILfo;Lfw;Z[I[II)I")
    public static int method2583(int arg0, int arg1, int arg2, class169 arg3, class167 arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field2075[var8][var9] = 0;
                field2074[var8][var9] = 99999999;
            }
        }
        boolean var10;
        if (arg2 == 1) {
            var10 = method913(arg0, arg1, arg3, arg4);
        } else if (arg2 == 2) {
            var10 = Statics.method1831(arg0, arg1, arg3, arg4);
        } else {
            var10 = Statics.method187(arg0, arg1, arg2, arg3, arg4);
        }
        int var11 = arg0 - 64;
        int var12 = arg1 - 64;
        int var13 = Statics.field2076;
        int var14 = Statics.field381;
        if (!var10) {
            if (!arg5) {
                return -1;
            }
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MAX_VALUE;
            byte var17 = 10;
            int var18 = arg3.field2089;
            int var19 = arg3.field2085;
            int var20 = arg3.field2086;
            int var21 = arg3.field2087;
            for (int var22 = var18 - var17; var22 <= var17 + var18; var22++) {
                for (int var23 = var19 - var17; var23 <= var17 + var19; var23++) {
                    int var24 = var22 - var11;
                    int var25 = var23 - var12;
                    if (var24 >= 0 && var25 >= 0 && var24 < 128 && var25 < 128 && field2074[var24][var25] < 100) {
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
                        if (var28 < var15 || var15 == var28 && field2074[var24][var25] < var16) {
                            var15 = var28;
                            var16 = field2074[var24][var25];
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
        field2072[var29] = var13;
        int var34 = var29 + 1;
        field2079[var29] = var14;
        int var30;
        int var31 = var30 = field2075[var13 - var11][var14 - var12];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field2072[var34] = var13;
                field2079[var34++] = var14;
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
            var31 = field2075[var13 - var11][var14 - var12];
        }
        int var32 = 0;
        while (var34-- > 0) {
            arg6[var32] = field2072[var34];
            arg7[var32++] = field2079[var34];
            if (var32 >= arg6.length) {
                break;
            }
        }
        return var32;
    }

    @ObfuscatedName("at.c(IILfo;Lfw;I)Z")
    public static final boolean method913(int arg0, int arg1, class169 arg2, class167 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field2075[var6][var7] = 99;
        field2074[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field2072[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field2079[var10001] = arg1;
        int[][] var12 = arg3.field2071;
        while (var18 != var11) {
            var4 = field2072[var11];
            var5 = field2079[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2067;
            int var16 = var5 - arg3.field2068;
            if (arg2.method1046(1, var4, var5, arg3)) {
                Statics.field2076 = var4;
                Statics.field381 = var5;
                return true;
            }
            int var17 = field2074[var13][var14] + 1;
            if (var13 > 0 && field2075[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                field2072[var18] = var4 - 1;
                field2079[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2075[var13 - 1][var14] = 2;
                field2074[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && field2075[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                field2072[var18] = var4 + 1;
                field2079[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field2075[var13 + 1][var14] = 8;
                field2074[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field2075[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2072[var18] = var4;
                field2079[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2075[var13][var14 - 1] = 1;
                field2074[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && field2075[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2072[var18] = var4;
                field2079[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2075[var13][var14 + 1] = 4;
                field2074[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field2075[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2072[var18] = var4 - 1;
                field2079[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2075[var13 - 1][var14 - 1] = 3;
                field2074[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && field2075[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                field2072[var18] = var4 + 1;
                field2079[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field2075[var13 + 1][var14 - 1] = 9;
                field2074[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && field2075[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2072[var18] = var4 - 1;
                field2079[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2075[var13 - 1][var14 + 1] = 6;
                field2074[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && field2075[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                field2072[var18] = var4 + 1;
                field2079[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field2075[var13 + 1][var14 + 1] = 12;
                field2074[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field2076 = var4;
        Statics.field381 = var5;
        return false;
    }
}
