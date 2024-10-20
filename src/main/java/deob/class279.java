package deob;

@ObfuscatedName("kz")
public class class279 {

    @ObfuscatedName("kz.ac")
    public class276[] field3058;

    @ObfuscatedName("kz.ac(I)V")
    public void method5198() {
        this.field3058 = new class276[1];
        class272 var1 = class272.field3008;
        this.field3058[0] = new class276(var1.field3014, var1.field3015);
    }

    @ObfuscatedName("kz.ae(IIILks;Lkd;Z[I[II)I")
    public int method5199(int arg0, int arg1, int arg2, class275 arg3, class271 arg4, boolean arg5, int[] arg6, int[] arg7) {
        return this.method5200(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, this.field3058[0]);
    }

    @ObfuscatedName("kz.ag(IIILks;Lkd;Z[I[ILkt;I)I")
    public int method5200(int arg0, int arg1, int arg2, class275 arg3, class271 arg4, boolean arg5, int[] arg6, int[] arg7, class276 arg8) {
        arg8.method5178();
        int var10 = arg8.method5164();
        int var11 = arg8.method5163();
        int[][] var12 = arg8.method5162();
        int[][] var13 = arg8.method5180();
        int[] var14 = arg8.method5186();
        int[] var15 = arg8.method5166();
        boolean var16;
        if (arg2 == 1) {
            var16 = this.method5201(arg0, arg1, arg3, arg4, arg8);
        } else if (arg2 == 2) {
            var16 = this.method5212(arg0, arg1, arg3, arg4, arg8);
        } else {
            var16 = this.method5206(arg0, arg1, arg2, arg3, arg4, arg8);
        }
        int var17 = arg0 - (var10 >> 1);
        int var18 = arg1 - (var11 >> 1);
        int var19 = arg8.method5160();
        int var20 = arg8.method5161();
        if (!var16) {
            if (!arg5) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            int var24 = arg3.field3025;
            int var25 = arg3.field3023;
            int var26 = arg3.field3026;
            int var27 = arg3.field3024;
            for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
                for (int var29 = var25 - var23; var29 <= var23 + var25; var29++) {
                    int var30 = var28 - var17;
                    int var31 = var29 - var18;
                    if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
                        int var32 = 0;
                        if (var28 < var24) {
                            var32 = var24 - var28;
                        } else if (var28 > var24 + var26 - 1) {
                            var32 = var28 - (var24 + var26 - 1);
                        }
                        int var33 = 0;
                        if (var29 < var25) {
                            var33 = var25 - var29;
                        } else if (var29 > var25 + var27 - 1) {
                            var33 = var29 - (var25 + var27 - 1);
                        }
                        int var34 = var32 * var32 + var33 * var33;
                        if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) {
                            var21 = var34;
                            var22 = var12[var30][var31];
                            var19 = var28;
                            var20 = var29;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var19 && arg1 == var20) {
            arg6[0] = var19;
            arg7[0] = var20;
            return 0;
        }
        byte var35 = 0;
        var14[var35] = var19;
        int var40 = var35 + 1;
        var15[var35] = var20;
        int var36;
        int var37 = var36 = var13[var19 - var17][var20 - var18];
        while (arg0 != var19 || arg1 != var20) {
            if (var36 != var37) {
                var36 = var37;
                var14[var40] = var19;
                var15[var40++] = var20;
            }
            if ((var37 & 0x2) != 0) {
                var19++;
            } else if ((var37 & 0x8) != 0) {
                var19--;
            }
            if ((var37 & 0x1) != 0) {
                var20++;
            } else if ((var37 & 0x4) != 0) {
                var20--;
            }
            var37 = var13[var19 - var17][var20 - var18];
        }
        int var38 = 0;
        while (var40-- > 0) {
            arg6[var38] = var14[var40];
            arg7[var38++] = var15[var40];
            if (var38 >= arg6.length) {
                break;
            }
        }
        return var38;
    }

    @ObfuscatedName("kz.am(IILks;Lkd;Lkt;I)Z")
    public final boolean method5201(int arg0, int arg1, class275 arg2, class271 arg3, class276 arg4) {
        int var6 = arg4.method5164();
        int var7 = arg4.method5163();
        int[][] var8 = arg4.method5162();
        int[][] var9 = arg4.method5180();
        int[] var10 = arg4.method5186();
        int[] var11 = arg4.method5166();
        int var12 = arg4.method5157();
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
        byte var10001 = var19;
        int var27 = var19 + 1;
        var11[var10001] = arg1;
        int[][] var21 = arg3.field3004;
        while (var27 != var20) {
            var13 = var10[var20];
            var14 = var11[var20];
            var20 = var20 + 1 & var12;
            int var22 = var13 - var17;
            int var23 = var14 - var18;
            int var24 = var13 - arg3.field2999;
            int var25 = var14 - arg3.field3000;
            if (arg2.method1179(1, var13, var14, arg3)) {
                arg4.method5159(var13, var14);
                return true;
            }
            int var26 = var8[var22][var23] + 1;
            if (var22 > 0 && var9[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x40240108) == 0) {
                var10[var27] = var13 - 1;
                var11[var27] = var14;
                var27 = var27 + 1 & var12;
                var9[var22 - 1][var23] = 2;
                var8[var22 - 1][var23] = var26;
            }
            if (var22 < var6 - 1 && var9[var22 + 1][var23] == 0 && (var21[var24 + 1][var25] & 0x40240180) == 0) {
                var10[var27] = var13 + 1;
                var11[var27] = var14;
                var27 = var27 + 1 & var12;
                var9[var22 + 1][var23] = 8;
                var8[var22 + 1][var23] = var26;
            }
            if (var23 > 0 && var9[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x40240102) == 0) {
                var10[var27] = var13;
                var11[var27] = var14 - 1;
                var27 = var27 + 1 & var12;
                var9[var22][var23 - 1] = 1;
                var8[var22][var23 - 1] = var26;
            }
            if (var23 < var7 - 1 && var9[var22][var23 + 1] == 0 && (var21[var24][var25 + 1] & 0x40240120) == 0) {
                var10[var27] = var13;
                var11[var27] = var14 + 1;
                var27 = var27 + 1 & var12;
                var9[var22][var23 + 1] = 4;
                var8[var22][var23 + 1] = var26;
            }
            if (var22 > 0 && var23 > 0 && var9[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x4024010E) == 0 && (var21[var24 - 1][var25] & 0x40240108) == 0 && (var21[var24][var25 - 1] & 0x40240102) == 0) {
                var10[var27] = var13 - 1;
                var11[var27] = var14 - 1;
                var27 = var27 + 1 & var12;
                var9[var22 - 1][var23 - 1] = 3;
                var8[var22 - 1][var23 - 1] = var26;
            }
            if (var22 < var6 - 1 && var23 > 0 && var9[var22 + 1][var23 - 1] == 0 && (var21[var24 + 1][var25 - 1] & 0x40240183) == 0 && (var21[var24 + 1][var25] & 0x40240180) == 0 && (var21[var24][var25 - 1] & 0x40240102) == 0) {
                var10[var27] = var13 + 1;
                var11[var27] = var14 - 1;
                var27 = var27 + 1 & var12;
                var9[var22 + 1][var23 - 1] = 9;
                var8[var22 + 1][var23 - 1] = var26;
            }
            if (var22 > 0 && var23 < var7 - 1 && var9[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][var25 + 1] & 0x40240138) == 0 && (var21[var24 - 1][var25] & 0x40240108) == 0 && (var21[var24][var25 + 1] & 0x40240120) == 0) {
                var10[var27] = var13 - 1;
                var11[var27] = var14 + 1;
                var27 = var27 + 1 & var12;
                var9[var22 - 1][var23 + 1] = 6;
                var8[var22 - 1][var23 + 1] = var26;
            }
            if (var22 < var6 - 1 && var23 < var7 - 1 && var9[var22 + 1][var23 + 1] == 0 && (var21[var24 + 1][var25 + 1] & 0x402401E0) == 0 && (var21[var24 + 1][var25] & 0x40240180) == 0 && (var21[var24][var25 + 1] & 0x40240120) == 0) {
                var10[var27] = var13 + 1;
                var11[var27] = var14 + 1;
                var27 = var27 + 1 & var12;
                var9[var22 + 1][var23 + 1] = 12;
                var8[var22 + 1][var23 + 1] = var26;
            }
        }
        arg4.method5159(var13, var14);
        return false;
    }

    @ObfuscatedName("kz.ax(IILks;Lkd;Lkt;I)Z")
    public final boolean method5212(int arg0, int arg1, class275 arg2, class271 arg3, class276 arg4) {
        int var6 = arg4.method5164();
        int var7 = arg4.method5163();
        int[][] var8 = arg4.method5162();
        int[][] var9 = arg4.method5180();
        int[] var10 = arg4.method5186();
        int[] var11 = arg4.method5166();
        int var12 = arg4.method5157();
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
        byte var10001 = var19;
        int var27 = var19 + 1;
        var11[var10001] = arg1;
        int[][] var21 = arg3.field3004;
        while (var27 != var20) {
            var13 = var10[var20];
            var14 = var11[var20];
            var20 = var20 + 1 & var12;
            int var22 = var13 - var17;
            int var23 = var14 - var18;
            int var24 = var13 - arg3.field2999;
            int var25 = var14 - arg3.field3000;
            if (arg2.method1179(2, var13, var14, arg3)) {
                arg4.method5159(var13, var14);
                return true;
            }
            int var26 = var8[var22][var23] + 1;
            if (var22 > 0 && var9[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x4024010E) == 0 && (var21[var24 - 1][var25 + 1] & 0x40240138) == 0) {
                var10[var27] = var13 - 1;
                var11[var27] = var14;
                var27 = var27 + 1 & var12;
                var9[var22 - 1][var23] = 2;
                var8[var22 - 1][var23] = var26;
            }
            if (var22 < var6 - 2 && var9[var22 + 1][var23] == 0 && (var21[var24 + 2][var25] & 0x40240183) == 0 && (var21[var24 + 2][var25 + 1] & 0x402401E0) == 0) {
                var10[var27] = var13 + 1;
                var11[var27] = var14;
                var27 = var27 + 1 & var12;
                var9[var22 + 1][var23] = 8;
                var8[var22 + 1][var23] = var26;
            }
            if (var23 > 0 && var9[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x4024010E) == 0 && (var21[var24 + 1][var25 - 1] & 0x40240183) == 0) {
                var10[var27] = var13;
                var11[var27] = var14 - 1;
                var27 = var27 + 1 & var12;
                var9[var22][var23 - 1] = 1;
                var8[var22][var23 - 1] = var26;
            }
            if (var23 < var7 - 2 && var9[var22][var23 + 1] == 0 && (var21[var24][var25 + 2] & 0x40240138) == 0 && (var21[var24 + 1][var25 + 2] & 0x402401E0) == 0) {
                var10[var27] = var13;
                var11[var27] = var14 + 1;
                var27 = var27 + 1 & var12;
                var9[var22][var23 + 1] = 4;
                var8[var22][var23 + 1] = var26;
            }
            if (var22 > 0 && var23 > 0 && var9[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25] & 0x4024013E) == 0 && (var21[var24 - 1][var25 - 1] & 0x4024010E) == 0 && (var21[var24][var25 - 1] & 0x4024018F) == 0) {
                var10[var27] = var13 - 1;
                var11[var27] = var14 - 1;
                var27 = var27 + 1 & var12;
                var9[var22 - 1][var23 - 1] = 3;
                var8[var22 - 1][var23 - 1] = var26;
            }
            if (var22 < var6 - 2 && var23 > 0 && var9[var22 + 1][var23 - 1] == 0 && (var21[var24 + 1][var25 - 1] & 0x4024018F) == 0 && (var21[var24 + 2][var25 - 1] & 0x40240183) == 0 && (var21[var24 + 2][var25] & 0x402401E3) == 0) {
                var10[var27] = var13 + 1;
                var11[var27] = var14 - 1;
                var27 = var27 + 1 & var12;
                var9[var22 + 1][var23 - 1] = 9;
                var8[var22 + 1][var23 - 1] = var26;
            }
            if (var22 > 0 && var23 < var7 - 2 && var9[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][var25 + 1] & 0x4024013E) == 0 && (var21[var24 - 1][var25 + 2] & 0x40240138) == 0 && (var21[var24][var25 + 2] & 0x402401F8) == 0) {
                var10[var27] = var13 - 1;
                var11[var27] = var14 + 1;
                var27 = var27 + 1 & var12;
                var9[var22 - 1][var23 + 1] = 6;
                var8[var22 - 1][var23 + 1] = var26;
            }
            if (var22 < var6 - 2 && var23 < var7 - 2 && var9[var22 + 1][var23 + 1] == 0 && (var21[var24 + 1][var25 + 2] & 0x402401F8) == 0 && (var21[var24 + 2][var25 + 2] & 0x402401E0) == 0 && (var21[var24 + 2][var25 + 1] & 0x402401E3) == 0) {
                var10[var27] = var13 + 1;
                var11[var27] = var14 + 1;
                var27 = var27 + 1 & var12;
                var9[var22 + 1][var23 + 1] = 12;
                var8[var22 + 1][var23 + 1] = var26;
            }
        }
        arg4.method5159(var13, var14);
        return false;
    }

    @ObfuscatedName("kz.aq(IIILks;Lkd;Lkt;B)Z")
    public final boolean method5206(int arg0, int arg1, int arg2, class275 arg3, class271 arg4, class276 arg5) {
        int var7 = arg5.method5164();
        int var8 = arg5.method5163();
        int[][] var9 = arg5.method5162();
        int[][] var10 = arg5.method5180();
        int[] var11 = arg5.method5186();
        int[] var12 = arg5.method5166();
        int var13 = arg5.method5157();
        int var14 = arg0;
        int var15 = arg1;
        int var16 = var7 >> 1;
        int var17 = var8 >> 1;
        int var18 = arg0 - var16;
        int var19 = arg1 - var17;
        var10[var16][var17] = 99;
        var9[var16][var17] = 0;
        byte var20 = 0;
        int var21 = 0;
        var11[var20] = arg0;
        int var36 = var20 + 1;
        var12[var20] = arg1;
        int[][] var22 = arg4.field3004;
        while (true) {
            label265: while (true) {
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                do {
                    do {
                        do {
                            label242: do {
                                if (var36 == var21) {
                                    arg5.method5159(var14, var15);
                                    return false;
                                }
                                var14 = var11[var21];
                                var15 = var12[var21];
                                var21 = var21 + 1 & var13;
                                var23 = var14 - var18;
                                var24 = var15 - var19;
                                var25 = var14 - arg4.field2999;
                                var26 = var15 - arg4.field3000;
                                if (arg3.method1179(arg2, var14, var15, arg4)) {
                                    arg5.method5159(var14, var15);
                                    return true;
                                }
                                var27 = var9[var23][var24] + 1;
                                if (var23 > 0 && var10[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x4024010E) == 0 && (var22[var25 - 1][arg2 + var26 - 1] & 0x40240138) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg2 - 1) {
                                            var11[var36] = var14 - 1;
                                            var12[var36] = var15;
                                            var36 = var36 + 1 & var13;
                                            var10[var23 - 1][var24] = 2;
                                            var9[var23 - 1][var24] = var27;
                                            break;
                                        }
                                        if ((var22[var25 - 1][var26 + var28] & 0x4024013E) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var23 < var7 - arg2 && var10[var23 + 1][var24] == 0 && (var22[arg2 + var25][var26] & 0x40240183) == 0 && (var22[arg2 + var25][arg2 + var26 - 1] & 0x402401E0) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg2 - 1) {
                                            var11[var36] = var14 + 1;
                                            var12[var36] = var15;
                                            var36 = var36 + 1 & var13;
                                            var10[var23 + 1][var24] = 8;
                                            var9[var23 + 1][var24] = var27;
                                            break;
                                        }
                                        if ((var22[arg2 + var25][var26 + var29] & 0x402401E3) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var24 > 0 && var10[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x4024010E) == 0 && (var22[arg2 + var25 - 1][var26 - 1] & 0x40240183) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg2 - 1) {
                                            var11[var36] = var14;
                                            var12[var36] = var15 - 1;
                                            var36 = var36 + 1 & var13;
                                            var10[var23][var24 - 1] = 1;
                                            var9[var23][var24 - 1] = var27;
                                            break;
                                        }
                                        if ((var22[var25 + var30][var26 - 1] & 0x4024018F) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var24 < var8 - arg2 && var10[var23][var24 + 1] == 0 && (var22[var25][arg2 + var26] & 0x40240138) == 0 && (var22[arg2 + var25 - 1][arg2 + var26] & 0x402401E0) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg2 - 1) {
                                            var11[var36] = var14;
                                            var12[var36] = var15 + 1;
                                            var36 = var36 + 1 & var13;
                                            var10[var23][var24 + 1] = 4;
                                            var9[var23][var24 + 1] = var27;
                                            break;
                                        }
                                        if ((var22[var25 + var31][arg2 + var26] & 0x402401F8) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var23 > 0 && var24 > 0 && var10[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x4024010E) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg2) {
                                            var11[var36] = var14 - 1;
                                            var12[var36] = var15 - 1;
                                            var36 = var36 + 1 & var13;
                                            var10[var23 - 1][var24 - 1] = 3;
                                            var9[var23 - 1][var24 - 1] = var27;
                                            break;
                                        }
                                        if ((var22[var25 - 1][var26 - 1 + var32] & 0x4024013E) != 0 || (var22[var25 - 1 + var32][var26 - 1] & 0x4024018F) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var23 < var7 - arg2 && var24 > 0 && var10[var23 + 1][var24 - 1] == 0 && (var22[arg2 + var25][var26 - 1] & 0x40240183) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (var33 >= arg2) {
                                            var11[var36] = var14 + 1;
                                            var12[var36] = var15 - 1;
                                            var36 = var36 + 1 & var13;
                                            var10[var23 + 1][var24 - 1] = 9;
                                            var9[var23 + 1][var24 - 1] = var27;
                                            break;
                                        }
                                        if ((var22[arg2 + var25][var26 - 1 + var33] & 0x402401E3) != 0 || (var22[var25 + var33][var26 - 1] & 0x4024018F) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var23 > 0 && var24 < var8 - arg2 && var10[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][arg2 + var26] & 0x40240138) == 0) {
                                    for (int var34 = 1; var34 < arg2; var34++) {
                                        if ((var22[var25 - 1][var26 + var34] & 0x4024013E) != 0 || (var22[var25 - 1 + var34][arg2 + var26] & 0x402401F8) != 0) {
                                            continue label242;
                                        }
                                    }
                                    var11[var36] = var14 - 1;
                                    var12[var36] = var15 + 1;
                                    var36 = var36 + 1 & var13;
                                    var10[var23 - 1][var24 + 1] = 6;
                                    var9[var23 - 1][var24 + 1] = var27;
                                }
                            } while (var23 >= var7 - arg2);
                        } while (var24 >= var8 - arg2);
                    } while (var10[var23 + 1][var24 + 1] != 0);
                } while ((var22[arg2 + var25][arg2 + var26] & 0x402401E0) != 0);
                for (int var35 = 1; var35 < arg2; var35++) {
                    if ((var22[var25 + var35][arg2 + var26] & 0x402401F8) != 0 || (var22[arg2 + var25][var26 + var35] & 0x402401E3) != 0) {
                        continue label265;
                    }
                }
                var11[var36] = var14 + 1;
                var12[var36] = var15 + 1;
                var36 = var36 + 1 & var13;
                var10[var23 + 1][var24 + 1] = 12;
                var9[var23 + 1][var24 + 1] = var27;
            }
        }
    }
}
