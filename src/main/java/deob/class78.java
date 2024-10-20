package deob;

@ObfuscatedName("cd")
public final class class78 {

    @ObfuscatedName("cd.af")
    public static int[][][] field1002 = new int[4][105][105];

    @ObfuscatedName("cd.an")
    public static byte[][][] field1006 = new byte[4][104][104];

    @ObfuscatedName("cd.aw")
    public static int field999 = 99;

    @ObfuscatedName("cd.am")
    public static final int[] field996 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("cd.as")
    public static final int[] field1007 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("cd.aj")
    public static final int[] field1008 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("cd.ak")
    public static final int[] field1004 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("cd.az")
    public static final int[] field1010 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("cd.ad")
    public static final int[] field1011 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("cd.ae")
    public static int field1012 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("cd.ap")
    public static int field1013 = (int) (Math.random() * 33.0D) - 16;

    public class78() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fx.af(I)V")
    public static void method3027() {
        field999 = 99;
        Statics.field1977 = new short[4][104][104];
        Statics.field998 = new short[4][104][104];
        Statics.field1009 = new byte[4][104][104];
        Statics.field1000 = new byte[4][104][104];
        Statics.field1783 = new int[4][105][105];
        Statics.field995 = new byte[4][105][105];
        Statics.field997 = new int[105][105];
        Statics.field1847 = new int[104];
        Statics.field1003 = new int[104];
        Statics.field3093 = new int[104];
        Statics.field1417 = new int[104];
        Statics.field177 = new int[104];
    }

    @ObfuscatedName("iv.an(I)V")
    public static void method4344() {
        Statics.field1977 = (short[][][]) null;
        Statics.field998 = (short[][][]) null;
        Statics.field1009 = (byte[][][]) null;
        Statics.field1000 = (byte[][][]) null;
        Statics.field1783 = (int[][][]) null;
        Statics.field995 = (byte[][][]) null;
        Statics.field997 = (int[][]) null;
        Statics.field1847 = null;
        Statics.field1003 = null;
        Statics.field3093 = null;
        Statics.field1417 = null;
        Statics.field177 = null;
    }

    @ObfuscatedName("ew.aw(IIIII)V")
    public static final void method2896(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field995[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1002[0][var5][var4] = field1002[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1002[0][var5][var4] = field1002[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1002[0][var5][var4] = field1002[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1002[0][var5][var4] = field1002[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("je.ac([BIIII[Lif;I)V")
    public static final void method4618(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class209[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2380[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class489 var9 = new class489(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method6553(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("as.au([BIIIIIIIII[Lif;I)V")
    public static final void method287(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class209[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2380[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class489 var13 = new class489(arg0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
                        int var17 = arg2 + class311.method5400(var15 & 0x7, var16 & 0x7, arg7);
                        int var19 = var15 & 0x7;
                        int var20 = var16 & 0x7;
                        int var22 = arg7 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var20;
                        } else if (var22 == 1) {
                            var23 = 7 - var19;
                        } else if (var22 == 2) {
                            var23 = 7 - var20;
                        } else {
                            var23 = var19;
                        }
                        int var24 = arg3 + var23;
                        int var25 = (var15 & 0x7) + arg2 + arg8;
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        method6553(var13, arg1, var17, var24, var25, var26, arg7);
                    } else {
                        method6553(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("im.ab(IIII)V")
    public static final void method4380(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1002[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1002[arg0][arg1][arg2 + var5] = field1002[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1002[arg0][arg1 + var6][arg2] = field1002[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1002[arg0][arg1 - 1][arg2] != 0) {
            field1002[arg0][arg1][arg2] = field1002[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1002[arg0][arg1][arg2 - 1] != 0) {
            field1002[arg0][arg1][arg2] = field1002[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1002[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1002[arg0][arg1][arg2] = field1002[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("of.aq(Lsg;IIIIIIB)V")
    public static final void method6553(class489 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = arg1 >= 0 && arg1 < 4 && arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104;
        if (!var7) {
            while (true) {
                int var17 = arg0.method8250();
                if (var17 == 0) {
                    break;
                }
                if (var17 == 1) {
                    arg0.method8248();
                    break;
                }
                if (var17 <= 49) {
                    arg0.method8445();
                }
            }
            return;
        }
        field1006[arg1][arg2][arg3] = 0;
        while (true) {
            int var8 = arg0.method8250();
            if (var8 == 0) {
                if (arg1 == 0) {
                    int[] var9 = field1002[0][arg2];
                    int var11 = arg4 + 932731;
                    int var12 = arg5 + 556238;
                    int var13 = method2547(var11 + 45365, var12 + 91923, 4) - 128 + (method2547(var11 + 10294, var12 + 37821, 2) - 128 >> 1) + (method2547(var11, var12, 1) - 128 >> 2);
                    int var14 = (int) ((double) var13 * 0.3D) + 35;
                    if (var14 < 10) {
                        var14 = 10;
                    } else if (var14 > 60) {
                        var14 = 60;
                    }
                    var9[arg3] = -var14 * 8;
                } else {
                    field1002[arg1][arg2][arg3] = field1002[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var8 == 1) {
                int var16 = arg0.method8248();
                if (var16 == 1) {
                    var16 = 0;
                }
                if (arg1 == 0) {
                    field1002[0][arg2][arg3] = -var16 * 8;
                } else {
                    field1002[arg1][arg2][arg3] = field1002[arg1 - 1][arg2][arg3] - var16 * 8;
                }
                break;
            }
            if (var8 <= 49) {
                Statics.field998[arg1][arg2][arg3] = (short) arg0.method8445();
                Statics.field1009[arg1][arg2][arg3] = (byte) ((var8 - 2) / 4);
                Statics.field1000[arg1][arg2][arg3] = (byte) (var8 - 2 + arg6 & 0x3);
            } else if (var8 <= 81) {
                field1006[arg1][arg2][arg3] = (byte) (var8 - 49);
            } else {
                Statics.field1977[arg1][arg2][arg3] = (short) (var8 - 81);
            }
        }
    }

    @ObfuscatedName("hj.al([BIII)Z")
    public static final boolean method3375(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class489 var4 = new class489(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8370();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8417();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8248() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class201 var16 = Statics.method3057(var5);
                        if (var13 != 22 || !client.field493 || var16.field2176 != 0 || var16.field2178 == 1 || var16.field2195) {
                            if (!var16.method3676()) {
                                client.field558++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8417();
                if (var9 == 0) {
                    break;
                }
                var4.method8248();
            }
        }
    }

    @ObfuscatedName("fq.at([BIILie;[Lif;I)V")
    public static final void method3071(byte[] arg0, int arg1, int arg2, class223 arg3, class209[] arg4) {
        class489 var5 = new class489(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8370();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8417();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method8248();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1006[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class209 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method3879(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("cd.aa([BIIIIIIILie;[Lif;)V")
    public static final void method2060(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class223 arg8, class209[] arg9) {
        class489 var10 = new class489(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8370();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8417();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method8248();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class201 var21 = Statics.method3057(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2172;
                    int var27 = var21.field2173;
                    if ((var20 & 0x1) == 1) {
                        int var28 = var26;
                        var26 = var27;
                        var27 = var28;
                    }
                    int var29 = arg7 & 0x3;
                    int var30;
                    if (var29 == 0) {
                        var30 = var23;
                    } else if (var29 == 1) {
                        var30 = var24;
                    } else if (var29 == 2) {
                        var30 = 7 - var23 - (var26 - 1);
                    } else {
                        var30 = 7 - var24 - (var27 - 1);
                    }
                    int var31 = arg2 + var30;
                    int var33 = var16 & 0x7;
                    int var34 = var15 & 0x7;
                    int var36 = var21.field2172;
                    int var37 = var21.field2173;
                    if ((var20 & 0x1) == 1) {
                        int var38 = var36;
                        var36 = var37;
                        var37 = var38;
                    }
                    int var39 = arg7 & 0x3;
                    int var40;
                    if (var39 == 0) {
                        var40 = var34;
                    } else if (var39 == 1) {
                        var40 = 7 - var33 - (var36 - 1);
                    } else if (var39 == 2) {
                        var40 = 7 - var34 - (var37 - 1);
                    } else {
                        var40 = var33;
                    }
                    int var41 = arg3 + var40;
                    if (var31 > 0 && var41 > 0 && var31 < 103 && var41 < 103) {
                        int var42 = arg1;
                        if ((field1006[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class209 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method3879(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hy.ay(IIIIIILie;Lif;I)V")
    public static final void method3879(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class223 arg6, class209 arg7) {
        if (client.field493 && (field1006[0][arg1][arg2] & 0x2) == 0 && (field1006[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field999) {
            field999 = arg0;
        }
        class201 var8 = Statics.method3057(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2173;
            var10 = var8.field2172;
        } else {
            var9 = var8.field2172;
            var10 = var8.field2173;
        }
        int var11;
        int var12;
        if (arg1 + var9 <= 104) {
            var11 = (var9 >> 1) + arg1;
            var12 = (var9 + 1 >> 1) + arg1;
        } else {
            var11 = arg1;
            var12 = arg1 + 1;
        }
        int var13;
        int var14;
        if (arg2 + var10 <= 104) {
            var13 = (var10 >> 1) + arg2;
            var14 = (var10 + 1 >> 1) + arg2;
        } else {
            var13 = arg2;
            var14 = arg2 + 1;
        }
        int[][] var15 = field1002[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class233.method4346(arg1, arg2, 2, var8.field2176 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2207 == 1) {
            var21 += 256;
        }
        if (var8.method3672()) {
            class66.method677(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field493 || var8.field2176 != 0 || var8.field2178 == 1 || var8.field2195) {
                class225 var22;
                if (var8.field2167 == -1 && var8.field2198 == null) {
                    var22 = var8.method3665(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class76(arg3, 22, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
                }
                arg6.method4176(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2178 == 1 && arg7 != null) {
                    arg7.method3908(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class225 var48;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var48 = var8.method3665(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class76(arg3, 10, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            if (var48 != null && arg6.method4335(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2188) {
                int var49 = 15;
                if (var48 instanceof class232) {
                    var49 = ((class232) var48).method4405() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field995[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field995[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2178 != 0 && arg7 != null) {
                arg7.method3914(arg1, arg2, var9, var10, var8.field2175);
            }
        } else if (arg5 >= 12) {
            class225 var23;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var23 = var8.method3665(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class76(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4335(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1783[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2178 != 0 && arg7 != null) {
                arg7.method3914(arg1, arg2, var9, var10, var8.field2175);
            }
        } else if (arg5 == 0) {
            class225 var24;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var24 = var8.method3665(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class76(arg3, 0, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4178(arg0, arg1, arg2, var16, var24, (class225) null, field996[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2188) {
                    Statics.field995[arg0][arg1][arg2] = 50;
                    Statics.field995[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2179) {
                    Statics.field1783[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2188) {
                    Statics.field995[arg0][arg1][arg2 + 1] = 50;
                    Statics.field995[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2179) {
                    Statics.field1783[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2188) {
                    Statics.field995[arg0][arg1 + 1][arg2] = 50;
                    Statics.field995[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2179) {
                    Statics.field1783[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2188) {
                    Statics.field995[arg0][arg1][arg2] = 50;
                    Statics.field995[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2179) {
                    Statics.field1783[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2178 != 0 && arg7 != null) {
                arg7.method3905(arg1, arg2, arg5, arg4, var8.field2175);
            }
            if (var8.field2181 != 16) {
                arg6.method4206(arg0, arg1, arg2, var8.field2181);
            }
        } else if (arg5 == 1) {
            class225 var25;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var25 = var8.method3665(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class76(arg3, 1, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4178(arg0, arg1, arg2, var16, var25, (class225) null, field1007[arg4], 0, var19, var21);
            if (var8.field2188) {
                if (arg4 == 0) {
                    Statics.field995[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field995[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field995[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field995[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2178 != 0 && arg7 != null) {
                arg7.method3905(arg1, arg2, arg5, arg4, var8.field2175);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class225 var27;
            class225 var28;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var27 = var8.method3665(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3665(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class76(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
                var28 = new class76(arg3, 2, var26, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4178(arg0, arg1, arg2, var16, var27, var28, field996[arg4], field996[var26], var19, var21);
            if (var8.field2179) {
                if (arg4 == 0) {
                    Statics.field1783[arg0][arg1][arg2] |= 0x249;
                    Statics.field1783[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1783[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1783[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1783[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1783[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1783[arg0][arg1][arg2] |= 0x492;
                    Statics.field1783[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2178 != 0 && arg7 != null) {
                arg7.method3905(arg1, arg2, arg5, arg4, var8.field2175);
            }
            if (var8.field2181 != 16) {
                arg6.method4206(arg0, arg1, arg2, var8.field2181);
            }
        } else if (arg5 == 3) {
            class225 var29;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var29 = var8.method3665(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class76(arg3, 3, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4178(arg0, arg1, arg2, var16, var29, (class225) null, field1007[arg4], 0, var19, var21);
            if (var8.field2188) {
                if (arg4 == 0) {
                    Statics.field995[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field995[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field995[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field995[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2178 != 0 && arg7 != null) {
                arg7.method3905(arg1, arg2, arg5, arg4, var8.field2175);
            }
        } else if (arg5 == 9) {
            class225 var30;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var30 = var8.method3665(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class76(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4335(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2178 != 0 && arg7 != null) {
                arg7.method3914(arg1, arg2, var9, var10, var8.field2175);
            }
            if (var8.field2181 != 16) {
                arg6.method4206(arg0, arg1, arg2, var8.field2181);
            }
        } else if (arg5 == 4) {
            class225 var31;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var31 = var8.method3665(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class76(arg3, 4, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4179(arg0, arg1, arg2, var16, var31, (class225) null, field996[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4196(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = Statics.method3057(class233.method2144(var33)).field2181;
            }
            class225 var35;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var35 = var8.method3665(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class76(arg3, 4, arg4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4179(arg0, arg1, arg2, var16, var35, (class225) null, field996[arg4], 0, field1008[arg4] * var32, field1004[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4196(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = Statics.method3057(class233.method2144(var37)).field2181 / 2;
            }
            class225 var39;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var39 = var8.method3665(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class76(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4179(arg0, arg1, arg2, var16, var39, (class225) null, 256, arg4, field1010[arg4] * var36, field1011[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class225 var41;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var41 = var8.method3665(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class76(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4179(arg0, arg1, arg2, var16, var41, (class225) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4196(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = Statics.method3057(class233.method2144(var43)).field2181 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class225 var46;
            class225 var47;
            if (var8.field2167 == -1 && var8.field2198 == null) {
                var46 = var8.method3665(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3665(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class76(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
                var47 = new class76(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2167, var8.field2206, (class225) null);
            }
            arg6.method4179(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1010[arg4] * var42, field1011[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("ay.ao(Lie;[Lif;I)V")
    public static final void method91(class223 arg0, class209[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1006[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1006[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3907(var3, var4);
                        }
                    }
                }
            }
        }
        field1012 += (int) (Math.random() * 5.0D) - 2;
        if (field1012 < -8) {
            field1012 = -8;
        }
        if (field1012 > 8) {
            field1012 = 8;
        }
        field1013 += (int) (Math.random() * 5.0D) - 2;
        if (field1013 < -16) {
            field1013 = -16;
        }
        if (field1013 > 16) {
            field1013 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field995[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1002[var6][var16 + 1][var15] - field1002[var6][var16 - 1][var15];
                    int var18 = field1002[var6][var16][var15 + 1] - field1002[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field997[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field1847[var25] = 0;
                Statics.field1003[var25] = 0;
                Statics.field3093[var25] = 0;
                Statics.field1417[var25] = 0;
                Statics.field177[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = (int) class296.method2045(15);
                        int var30 = Statics.field1977[var6][var28][var27] & var29;
                        if (var30 > 0) {
                            int var31 = var30 - 1;
                            class195 var32 = (class195) class195.field2094.method5119((long) var31);
                            class195 var33;
                            if (var32 == null) {
                                byte[] var34 = Statics.field2092.method6090(1, var31);
                                class195 var35 = new class195();
                                if (var34 != null) {
                                    var35.method3544(new class489(var34), var31);
                                }
                                var35.method3534();
                                class195.field2094.method5121(var35, (long) var31);
                                var33 = var35;
                            } else {
                                var33 = var32;
                            }
                            Statics.field1847[var27] += var33.field2091;
                            Statics.field1003[var27] += var33.field2093;
                            Statics.field3093[var27] += var33.field2096;
                            Statics.field1417[var27] += var33.field2095;
                            var10002 = Statics.field177[var27]++;
                        }
                    }
                    int var37 = var26 - 5;
                    if (var37 >= 0 && var37 < 104) {
                        int var38 = (int) class296.method2045(15);
                        int var39 = Statics.field1977[var6][var37][var27] & var38;
                        if (var39 > 0) {
                            int var40 = var39 - 1;
                            class195 var41 = (class195) class195.field2094.method5119((long) var40);
                            class195 var42;
                            if (var41 == null) {
                                byte[] var43 = Statics.field2092.method6090(1, var40);
                                class195 var44 = new class195();
                                if (var43 != null) {
                                    var44.method3544(new class489(var43), var40);
                                }
                                var44.method3534();
                                class195.field2094.method5121(var44, (long) var40);
                                var42 = var44;
                            } else {
                                var42 = var41;
                            }
                            Statics.field1847[var27] -= var42.field2091;
                            Statics.field1003[var27] -= var42.field2093;
                            Statics.field3093[var27] -= var42.field2096;
                            Statics.field1417[var27] -= var42.field2095;
                            var10002 = Statics.field177[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var46 = 0;
                    int var47 = 0;
                    int var48 = 0;
                    int var49 = 0;
                    int var50 = 0;
                    for (int var51 = -5; var51 < 109; var51++) {
                        int var52 = var51 + 5;
                        if (var52 >= 0 && var52 < 104) {
                            var46 += Statics.field1847[var52];
                            var47 += Statics.field1003[var52];
                            var48 += Statics.field3093[var52];
                            var49 += Statics.field1417[var52];
                            var50 += Statics.field177[var52];
                        }
                        int var53 = var51 - 5;
                        if (var53 >= 0 && var53 < 104) {
                            var46 -= Statics.field1847[var53];
                            var47 -= Statics.field1003[var53];
                            var48 -= Statics.field3093[var53];
                            var49 -= Statics.field1417[var53];
                            var50 -= Statics.field177[var53];
                        }
                        if (var51 >= 1 && var51 < 103 && (!client.field493 || (field1006[0][var26][var51] & 0x2) != 0 || (field1006[var6][var26][var51] & 0x10) == 0)) {
                            if (var6 < field999) {
                                field999 = var6;
                            }
                            int var54 = (int) class296.method2045(15);
                            int var55 = Statics.field1977[var6][var26][var51] & var54;
                            int var56 = Statics.field998[var6][var26][var51] & var54;
                            if (var55 > 0 || var56 > 0) {
                                int var57 = field1002[var6][var26][var51];
                                int var58 = field1002[var6][var26 + 1][var51];
                                int var59 = field1002[var6][var26 + 1][var51 + 1];
                                int var60 = field1002[var6][var26][var51 + 1];
                                int var61 = Statics.field997[var26][var51];
                                int var62 = Statics.field997[var26 + 1][var51];
                                int var63 = Statics.field997[var26 + 1][var51 + 1];
                                int var64 = Statics.field997[var26][var51 + 1];
                                int var65 = -1;
                                int var66 = -1;
                                if (var55 > 0) {
                                    int var67 = var46 * 256 / var49;
                                    int var68 = var47 / var50;
                                    int var69 = var48 / var50;
                                    var65 = method5976(var67, var68, var69);
                                    int var70 = field1012 + var67 & 0xFF;
                                    int var71 = field1013 + var69;
                                    if (var71 < 0) {
                                        var71 = 0;
                                    } else if (var71 > 255) {
                                        var71 = 255;
                                    }
                                    var66 = method5976(var70, var68, var71);
                                }
                                if (var6 > 0) {
                                    boolean var72 = true;
                                    if (var55 == 0 && Statics.field1009[var6][var26][var51] != 0) {
                                        var72 = false;
                                    }
                                    if (var56 > 0) {
                                        int var73 = var56 - 1;
                                        class203 var74 = (class203) class203.field2271.method5119((long) var73);
                                        class203 var75;
                                        if (var74 == null) {
                                            byte[] var76 = Statics.field2273.method6090(4, var73);
                                            class203 var77 = new class203();
                                            if (var76 != null) {
                                                var77.method3788(new class489(var76), var73);
                                            }
                                            var77.method3787();
                                            class203.field2271.method5121(var77, (long) var73);
                                            var75 = var77;
                                        } else {
                                            var75 = var74;
                                        }
                                        if (!var75.field2275) {
                                            var72 = false;
                                        }
                                    }
                                    if (var72 && var57 == var58 && var57 == var59 && var57 == var60) {
                                        Statics.field1783[var6][var26][var51] |= 0x924;
                                    }
                                }
                                int var78 = 0;
                                if (var66 != -1) {
                                    var78 = class219.field2517[method93(var66, 96)];
                                }
                                if (var56 == 0) {
                                    arg0.method4175(var6, var26, var51, 0, 0, -1, var57, var58, var59, var60, method93(var65, var61), method93(var65, var62), method93(var65, var63), method93(var65, var64), 0, 0, 0, 0, var78, 0);
                                } else {
                                    int var79 = Statics.field1009[var6][var26][var51] + 1;
                                    byte var80 = Statics.field1000[var6][var26][var51];
                                    int var81 = var56 - 1;
                                    class203 var82 = (class203) class203.field2271.method5119((long) var81);
                                    class203 var83;
                                    if (var82 == null) {
                                        byte[] var84 = Statics.field2273.method6090(4, var81);
                                        class203 var85 = new class203();
                                        if (var84 != null) {
                                            var85.method3788(new class489(var84), var81);
                                        }
                                        var85.method3787();
                                        class203.field2271.method5121(var85, (long) var81);
                                        var83 = var85;
                                    } else {
                                        var83 = var82;
                                    }
                                    int var87 = var83.field2281;
                                    int var88;
                                    int var89;
                                    if (var87 >= 0) {
                                        var88 = class219.field2515.field2795.method4359(var87);
                                        var89 = -1;
                                    } else if (var83.field2283 == 16711935) {
                                        var89 = -2;
                                        var87 = -1;
                                        var88 = -2;
                                    } else {
                                        var89 = method5976(var83.field2277, var83.field2278, var83.field2279);
                                        int var90 = field1012 + var83.field2277 & 0xFF;
                                        int var91 = field1013 + var83.field2279;
                                        if (var91 < 0) {
                                            var91 = 0;
                                        } else if (var91 > 255) {
                                            var91 = 255;
                                        }
                                        var88 = method5976(var90, var83.field2278, var91);
                                    }
                                    int var92 = 0;
                                    if (var88 != -2) {
                                        var92 = class219.field2517[method8107(var88, 96)];
                                    }
                                    if (var83.field2272 != -1) {
                                        int var93 = field1012 + var83.field2274 & 0xFF;
                                        int var94 = field1013 + var83.field2282;
                                        if (var94 < 0) {
                                            var94 = 0;
                                        } else if (var94 > 255) {
                                            var94 = 255;
                                        }
                                        int var95 = method5976(var93, var83.field2285, var94);
                                        var92 = class219.field2517[method8107(var95, 96)];
                                    }
                                    arg0.method4175(var6, var26, var51, var79, var80, var87, var57, var58, var59, var60, method93(var65, var61), method93(var65, var62), method93(var65, var63), method93(var65, var64), method8107(var89, var61), method8107(var89, var62), method8107(var89, var63), method8107(var89, var64), var78, var92);
                                }
                            }
                        }
                    }
                }
            }
            for (int var96 = 1; var96 < 103; var96++) {
                for (int var97 = 1; var97 < 103; var97++) {
                    arg0.method4174(var6, var97, var96, method823(var6, var97, var96));
                }
            }
            Statics.field1977[var6] = (short[][]) null;
            Statics.field998[var6] = (short[][]) null;
            Statics.field1009[var6] = (byte[][]) null;
            Statics.field1000[var6] = (byte[][]) null;
            Statics.field995[var6] = (byte[][]) null;
        }
        arg0.method4238(-50, -10, -50);
        for (int var98 = 0; var98 < 104; var98++) {
            for (int var99 = 0; var99 < 104; var99++) {
                if ((field1006[1][var98][var99] & 0x2) == 2) {
                    arg0.method4288(var98, var99);
                }
            }
        }
        int var100 = 1;
        int var101 = 2;
        int var102 = 4;
        for (int var103 = 0; var103 < 4; var103++) {
            if (var103 > 0) {
                var100 <<= 0x3;
                var101 <<= 0x3;
                var102 <<= 0x3;
            }
            for (int var104 = 0; var104 <= var103; var104++) {
                for (int var105 = 0; var105 <= 104; var105++) {
                    for (int var106 = 0; var106 <= 104; var106++) {
                        if ((Statics.field1783[var104][var106][var105] & var100) != 0) {
                            int var107 = var105;
                            int var108 = var105;
                            int var109 = var104;
                            int var110 = var104;
                            while (var107 > 0 && (Statics.field1783[var104][var106][var107 - 1] & var100) != 0) {
                                var107--;
                            }
                            while (var108 < 104 && (Statics.field1783[var104][var106][var108 + 1] & var100) != 0) {
                                var108++;
                            }
                            label373: while (var109 > 0) {
                                for (int var111 = var107; var111 <= var108; var111++) {
                                    if ((Statics.field1783[var109 - 1][var106][var111] & var100) == 0) {
                                        break label373;
                                    }
                                }
                                var109--;
                            }
                            label362: while (var110 < var103) {
                                for (int var112 = var107; var112 <= var108; var112++) {
                                    if ((Statics.field1783[var110 + 1][var106][var112] & var100) == 0) {
                                        break label362;
                                    }
                                }
                                var110++;
                            }
                            int var113 = (var110 + 1 - var109) * (var108 - var107 + 1);
                            if (var113 >= 8) {
                                short var114 = 240;
                                int var115 = field1002[var110][var106][var107] - var114;
                                int var116 = field1002[var109][var106][var107];
                                class223.method4173(var103, 1, var106 * 128, var106 * 128, var107 * 128, var108 * 128 + 128, var115, var116);
                                for (int var117 = var109; var117 <= var110; var117++) {
                                    for (int var118 = var107; var118 <= var108; var118++) {
                                        Statics.field1783[var117][var106][var118] &= ~var100;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1783[var104][var106][var105] & var101) != 0) {
                            int var119 = var106;
                            int var120 = var106;
                            int var121 = var104;
                            int var122 = var104;
                            while (var119 > 0 && (Statics.field1783[var104][var119 - 1][var105] & var101) != 0) {
                                var119--;
                            }
                            while (var120 < 104 && (Statics.field1783[var104][var120 + 1][var105] & var101) != 0) {
                                var120++;
                            }
                            label426: while (var121 > 0) {
                                for (int var123 = var119; var123 <= var120; var123++) {
                                    if ((Statics.field1783[var121 - 1][var123][var105] & var101) == 0) {
                                        break label426;
                                    }
                                }
                                var121--;
                            }
                            label415: while (var122 < var103) {
                                for (int var124 = var119; var124 <= var120; var124++) {
                                    if ((Statics.field1783[var122 + 1][var124][var105] & var101) == 0) {
                                        break label415;
                                    }
                                }
                                var122++;
                            }
                            int var125 = (var122 + 1 - var121) * (var120 - var119 + 1);
                            if (var125 >= 8) {
                                short var126 = 240;
                                int var127 = field1002[var122][var119][var105] - var126;
                                int var128 = field1002[var121][var119][var105];
                                class223.method4173(var103, 2, var119 * 128, var120 * 128 + 128, var105 * 128, var105 * 128, var127, var128);
                                for (int var129 = var121; var129 <= var122; var129++) {
                                    for (int var130 = var119; var130 <= var120; var130++) {
                                        Statics.field1783[var129][var130][var105] &= ~var101;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1783[var104][var106][var105] & var102) != 0) {
                            int var131 = var106;
                            int var132 = var106;
                            int var133 = var105;
                            int var134 = var105;
                            while (var133 > 0 && (Statics.field1783[var104][var106][var133 - 1] & var102) != 0) {
                                var133--;
                            }
                            while (var134 < 104 && (Statics.field1783[var104][var106][var134 + 1] & var102) != 0) {
                                var134++;
                            }
                            label479: while (var131 > 0) {
                                for (int var135 = var133; var135 <= var134; var135++) {
                                    if ((Statics.field1783[var104][var131 - 1][var135] & var102) == 0) {
                                        break label479;
                                    }
                                }
                                var131--;
                            }
                            label468: while (var132 < 104) {
                                for (int var136 = var133; var136 <= var134; var136++) {
                                    if ((Statics.field1783[var104][var132 + 1][var136] & var102) == 0) {
                                        break label468;
                                    }
                                }
                                var132++;
                            }
                            if ((var132 - var131 + 1) * (var134 - var133 + 1) >= 4) {
                                int var137 = field1002[var104][var131][var133];
                                class223.method4173(var103, 4, var131 * 128, var132 * 128 + 128, var133 * 128, var134 * 128 + 128, var137, var137);
                                for (int var138 = var131; var138 <= var132; var138++) {
                                    for (int var139 = var133; var139 <= var134; var139++) {
                                        Statics.field1783[var104][var138][var139] &= ~var102;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bu.ax(IIII)I")
    public static int method823(int arg0, int arg1, int arg2) {
        if ((field1006[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field1006[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dy.ai(IIIB)I")
    public static final int method2547(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = Statics.method6890(var3, var5);
        int var8 = Statics.method6890(var3 + 1, var5);
        int var9 = Statics.method6890(var3, var5 + 1);
        int var10 = Statics.method6890(var3 + 1, var5 + 1);
        int var11 = method3300(var7, var8, var4, arg2);
        int var12 = method3300(var9, var10, var4, arg2);
        return method3300(var11, var12, var6, arg2);
    }

    @ObfuscatedName("gc.ag(IIIIB)I")
    public static final int method3300(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class219.field2516[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("de.av(III)I")
    public static final int method2276(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ay.ar(III)I")
    public static final int method93(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("sh.am(IIB)I")
    public static final int method8107(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var2 = (arg0 & 0x7F) * arg1 / 128;
            if (var2 < 2) {
                var2 = 2;
            } else if (var2 > 126) {
                var2 = 126;
            }
            return (arg0 & 0xFF80) + var2;
        }
    }

    @ObfuscatedName("md.as(IIII)I")
    public static final int method5976(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("hc.aj(III)Z")
    public static final boolean method3556(int arg0, int arg1) {
        class201 var2 = Statics.method3057(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3664(arg1);
    }

    @ObfuscatedName("gh.ak(IIIIIIIILie;Lif;I)V")
    public static final void method3202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class223 arg8, class209 arg9) {
        class201 var10 = Statics.method3057(arg4);
        int var11 = arg7 >= 0 ? arg7 : var10.field2167;
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var10.field2173;
            var13 = var10.field2172;
        } else {
            var12 = var10.field2172;
            var13 = var10.field2173;
        }
        int var14;
        int var15;
        if (arg2 + var12 <= 104) {
            var14 = (var12 >> 1) + arg2;
            var15 = (var12 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int var16;
        int var17;
        if (arg3 + var13 <= 104) {
            var16 = (var13 >> 1) + arg3;
            var17 = (var13 + 1 >> 1) + arg3;
        } else {
            var16 = arg3;
            var17 = arg3 + 1;
        }
        int[][] var18 = field1002[arg1];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg2 << 7) + (var12 << 6);
        int var21 = (arg3 << 7) + (var13 << 6);
        long var22 = class233.method4346(arg2, arg3, 2, var10.field2176 == 0, arg4);
        int var24 = (arg5 << 6) + arg6;
        if (var10.field2207 == 1) {
            var24 += 256;
        }
        if (arg6 == 22) {
            class225 var25;
            if (var11 == -1 && var10.field2198 == null) {
                var25 = var10.method3670(22, arg5, var18, var20, var19, var21);
            } else {
                var25 = new class76(arg4, 22, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4176(arg0, arg2, arg3, var19, var25, var22, var24);
            if (var10.field2178 == 1) {
                arg9.method3908(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class225 var51;
            if (var11 == -1 && var10.field2198 == null) {
                var51 = var10.method3670(10, arg5, var18, var20, var19, var21);
            } else {
                var51 = new class76(arg4, 10, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            if (var51 != null) {
                arg8.method4335(arg0, arg2, arg3, var19, var12, var13, var51, arg6 == 11 ? 256 : 0, var22, var24);
            }
            if (var10.field2178 != 0) {
                arg9.method3914(arg2, arg3, var12, var13, var10.field2175);
            }
        } else if (arg6 >= 12) {
            class225 var26;
            if (var11 == -1 && var10.field2198 == null) {
                var26 = var10.method3670(arg6, arg5, var18, var20, var19, var21);
            } else {
                var26 = new class76(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4335(arg0, arg2, arg3, var19, 1, 1, var26, 0, var22, var24);
            if (var10.field2178 != 0) {
                arg9.method3914(arg2, arg3, var12, var13, var10.field2175);
            }
        } else if (arg6 == 0) {
            class225 var27;
            if (var11 == -1 && var10.field2198 == null) {
                var27 = var10.method3670(0, arg5, var18, var20, var19, var21);
            } else {
                var27 = new class76(arg4, 0, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4178(arg0, arg2, arg3, var19, var27, (class225) null, field996[arg5], 0, var22, var24);
            if (var10.field2178 != 0) {
                arg9.method3905(arg2, arg3, arg6, arg5, var10.field2175);
            }
        } else if (arg6 == 1) {
            class225 var28;
            if (var11 == -1 && var10.field2198 == null) {
                var28 = var10.method3670(1, arg5, var18, var20, var19, var21);
            } else {
                var28 = new class76(arg4, 1, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4178(arg0, arg2, arg3, var19, var28, (class225) null, field1007[arg5], 0, var22, var24);
            if (var10.field2178 != 0) {
                arg9.method3905(arg2, arg3, arg6, arg5, var10.field2175);
            }
        } else if (arg6 == 2) {
            int var29 = arg5 + 1 & 0x3;
            class225 var30;
            class225 var31;
            if (var11 == -1 && var10.field2198 == null) {
                var30 = var10.method3670(2, arg5 + 4, var18, var20, var19, var21);
                var31 = var10.method3670(2, var29, var18, var20, var19, var21);
            } else {
                var30 = new class76(arg4, 2, arg5 + 4, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
                var31 = new class76(arg4, 2, var29, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4178(arg0, arg2, arg3, var19, var30, var31, field996[arg5], field996[var29], var22, var24);
            if (var10.field2178 != 0) {
                arg9.method3905(arg2, arg3, arg6, arg5, var10.field2175);
            }
        } else if (arg6 == 3) {
            class225 var32;
            if (var11 == -1 && var10.field2198 == null) {
                var32 = var10.method3670(3, arg5, var18, var20, var19, var21);
            } else {
                var32 = new class76(arg4, 3, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4178(arg0, arg2, arg3, var19, var32, (class225) null, field1007[arg5], 0, var22, var24);
            if (var10.field2178 != 0) {
                arg9.method3905(arg2, arg3, arg6, arg5, var10.field2175);
            }
        } else if (arg6 == 9) {
            class225 var33;
            if (var11 == -1 && var10.field2198 == null) {
                var33 = var10.method3670(arg6, arg5, var18, var20, var19, var21);
            } else {
                var33 = new class76(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4335(arg0, arg2, arg3, var19, 1, 1, var33, 0, var22, var24);
            if (var10.field2178 != 0) {
                arg9.method3914(arg2, arg3, var12, var13, var10.field2175);
            }
        } else if (arg6 == 4) {
            class225 var34;
            if (var11 == -1 && var10.field2198 == null) {
                var34 = var10.method3670(4, arg5, var18, var20, var19, var21);
            } else {
                var34 = new class76(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4179(arg0, arg2, arg3, var19, var34, (class225) null, field996[arg5], 0, 0, 0, var22, var24);
        } else if (arg6 == 5) {
            int var35 = 16;
            long var36 = arg8.method4196(arg0, arg2, arg3);
            if (var36 != 0L) {
                var35 = Statics.method3057(class233.method2144(var36)).field2181;
            }
            class225 var38;
            if (var11 == -1 && var10.field2198 == null) {
                var38 = var10.method3670(4, arg5, var18, var20, var19, var21);
            } else {
                var38 = new class76(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4179(arg0, arg2, arg3, var19, var38, (class225) null, field996[arg5], 0, field1008[arg5] * var35, field1004[arg5] * var35, var22, var24);
        } else if (arg6 == 6) {
            int var39 = 8;
            long var40 = arg8.method4196(arg0, arg2, arg3);
            if (var40 != 0L) {
                var39 = Statics.method3057(class233.method2144(var40)).field2181 / 2;
            }
            class225 var42;
            if (var11 == -1 && var10.field2198 == null) {
                var42 = var10.method3670(4, arg5 + 4, var18, var20, var19, var21);
            } else {
                var42 = new class76(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4179(arg0, arg2, arg3, var19, var42, (class225) null, 256, arg5, field1010[arg5] * var39, field1011[arg5] * var39, var22, var24);
        } else if (arg6 == 7) {
            int var43 = arg5 + 2 & 0x3;
            class225 var44;
            if (var11 == -1 && var10.field2198 == null) {
                var44 = var10.method3670(4, var43 + 4, var18, var20, var19, var21);
            } else {
                var44 = new class76(arg4, 4, var43 + 4, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4179(arg0, arg2, arg3, var19, var44, (class225) null, 256, var43, 0, 0, var22, var24);
        } else if (arg6 == 8) {
            int var45 = 8;
            long var46 = arg8.method4196(arg0, arg2, arg3);
            if (var46 != 0L) {
                var45 = Statics.method3057(class233.method2144(var46)).field2181 / 2;
            }
            int var48 = arg5 + 2 & 0x3;
            class225 var49;
            class225 var50;
            if (var11 == -1 && var10.field2198 == null) {
                var49 = var10.method3670(4, arg5 + 4, var18, var20, var19, var21);
                var50 = var10.method3670(4, var48 + 4, var18, var20, var19, var21);
            } else {
                var49 = new class76(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
                var50 = new class76(arg4, 4, var48 + 4, arg1, arg2, arg3, var11, var10.field2206, (class225) null);
            }
            arg8.method4179(arg0, arg2, arg3, var19, var49, var50, 256, arg5, field1010[arg5] * var45, field1011[arg5] * var45, var22, var24);
        }
    }
}
