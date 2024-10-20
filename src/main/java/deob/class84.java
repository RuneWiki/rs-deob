package deob;

@ObfuscatedName("de")
public final class class84 {

    @ObfuscatedName("de.ab")
    public static int field1025 = 99;

    @ObfuscatedName("de.aa")
    public static final int[] field1016 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("de.ah")
    public static final int[] field1024 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("de.ag")
    public static final int[] field1018 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("de.av")
    public static final int[] field1026 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("de.ar")
    public static final int[] field1027 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("de.ap")
    public static final int[] field1023 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("de.ak")
    public static int field1029 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("de.ai")
    public static int field1021 = (int) (Math.random() * 33.0D) - 16;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ho.ab(I)V")
    public static void method3839() {
        field1025 = 99;
        Statics.field1030 = new short[4][104][104];
        Statics.field1017 = new short[4][104][104];
        Statics.field2349 = new byte[4][104][104];
        Statics.field7 = new byte[4][104][104];
        Statics.field3178 = new int[4][105][105];
        Statics.field4723 = new byte[4][105][105];
        Statics.field1033 = new int[105][105];
        Statics.field1028 = new int[104];
        Statics.field3963 = new int[104];
        Statics.field1020 = new int[104];
        Statics.field3957 = new int[104];
        Statics.field219 = new int[104];
    }

    @ObfuscatedName("ce.ay(I)V")
    public static void method1158() {
        Statics.field1030 = (short[][][]) null;
        Statics.field1017 = (short[][][]) null;
        Statics.field2349 = (byte[][][]) null;
        Statics.field7 = (byte[][][]) null;
        Statics.field3178 = (int[][][]) null;
        Statics.field4723 = (byte[][][]) null;
        Statics.field1033 = (int[][]) null;
        Statics.field1028 = null;
        Statics.field3963 = null;
        Statics.field1020 = null;
        Statics.field3957 = null;
        Statics.field219 = null;
    }

    @ObfuscatedName("id.an(Ldy;IIIIB)V")
    public static final void method4357(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        int[][][] var5 = arg0.field1314;
        int var6 = arg0.field1309 - 1;
        int var7 = arg0.field1310 - 1;
        for (int var8 = arg2; var8 <= arg2 + arg4; var8++) {
            for (int var9 = arg1; var9 <= arg1 + arg3; var9++) {
                if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
                    Statics.field4723[0][var9][var8] = 127;
                    if (arg1 == var9 && var9 > 0) {
                        var5[0][var9][var8] = var5[0][var9 - 1][var8];
                    }
                    if (arg1 + arg3 == var9 && var9 < var6) {
                        var5[0][var9][var8] = var5[0][var9 + 1][var8];
                    }
                    if (arg2 == var8 && var8 > 0) {
                        var5[0][var9][var8] = var5[0][var9][var8 - 1];
                    }
                    if (arg2 + arg4 == var8 && var8 < var7) {
                        var5[0][var9][var8] = var5[0][var9][var8 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.au(Ldy;[BIIIII)V")
    public static final void method1851(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0.field1305 != null) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 64; var7++) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        if (arg2 + var7 > 0 && arg2 + var7 < arg0.field1305[var6].field2938.length && arg3 + var8 > 0 && arg3 + var8 < arg0.field1305[var6].field2938[arg2 + var7].length) {
                            arg0.field1305[var6].field2938[arg2 + var7][arg3 + var8] &= 0xBFFFFFFF;
                        }
                    }
                }
            }
        }
        class549 var9 = new class549(arg1);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg2 + var11;
                    int var14 = arg3 + var12;
                    method4485(arg0, var9, var10, var13, var14, arg4 + var13, arg5 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ig.ax(Ldy;[BIIIIIIIIIS)V")
    public static final void method4210(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class269[] var11 = arg0.field1305;
        if (var11 != null) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < var11[arg2].field2938.length && arg4 + var13 > 0 && arg4 + var13 < var11[arg2].field2938[arg3 + var12].length) {
                        var11[arg2].field2938[arg3 + var12][arg4 + var13] &= 0xBFFFFFFF;
                    }
                }
            }
        }
        class549 var14 = new class549(arg1);
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg5 == var15 && var16 >= arg6 && var16 < arg6 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                        int var18 = arg3 + class354.method1935(var16 & 0x7, var17 & 0x7, arg8);
                        int var20 = var16 & 0x7;
                        int var21 = var17 & 0x7;
                        int var23 = arg8 & 0x3;
                        int var24;
                        if (var23 == 0) {
                            var24 = var21;
                        } else if (var23 == 1) {
                            var24 = 7 - var20;
                        } else if (var23 == 2) {
                            var24 = 7 - var21;
                        } else {
                            var24 = var20;
                        }
                        int var25 = arg4 + var24;
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        int var27 = (var17 & 0x7) + arg4 + arg10;
                        method4485(arg0, var14, arg2, var18, var25, var26, var27, arg8);
                    } else {
                        method4485(arg0, var14, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eu.ao([[[IIIII)V")
    public static final void method2948(int[][][] arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var5 = 0; var5 < 8; var5++) {
                arg0[arg1][arg2 + var4][arg3 + var5] = 0;
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                arg0[arg1][arg2][arg3 + var6] = arg0[arg1][arg2 - 1][arg3 + var6];
            }
        }
        if (arg3 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                arg0[arg1][arg2 + var7][arg3] = arg0[arg1][arg2 + var7][arg3 - 1];
            }
        }
        if (arg2 > 0 && arg0[arg1][arg2 - 1][arg3] != 0) {
            arg0[arg1][arg2][arg3] = arg0[arg1][arg2 - 1][arg3];
        } else if (arg3 > 0 && arg0[arg1][arg2][arg3 - 1] != 0) {
            arg0[arg1][arg2][arg3] = arg0[arg1][arg2][arg3 - 1];
        } else if (arg2 > 0 && arg3 > 0 && arg0[arg1][arg2 - 1][arg3 - 1] != 0) {
            arg0[arg1][arg2][arg3] = arg0[arg1][arg2 - 1][arg3 - 1];
        }
    }

    @ObfuscatedName("je.am(Ldy;Lvg;IIIIIII)V")
    public static final void method4485(class102 arg0, class549 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[][][] var8 = arg0.field1314;
        byte[][][] var9 = arg0.field1315;
        if (arg2 < 0 || arg2 >= 4 || arg3 < 0 || arg3 >= var8[0].length - 1 || arg4 < 0 || arg4 >= var8[0][0].length - 1) {
            while (true) {
                int var19 = arg1.method8968();
                if (var19 == 0) {
                    break;
                }
                if (var19 == 1) {
                    arg1.method9025();
                    break;
                }
                if (var19 <= 49) {
                    arg1.method8919();
                }
            }
            return;
        }
        var9[arg2][arg3][arg4] = 0;
        while (true) {
            int var10 = arg1.method8968();
            if (var10 == 0) {
                if (arg2 == 0) {
                    int[] var11 = var8[0][arg3];
                    int var13 = arg5 + 932731;
                    int var14 = arg6 + 556238;
                    int var15 = method3214(var13 + 45365, var14 + 91923, 4) - 128 + (method3214(var13 + 10294, var14 + 37821, 2) - 128 >> 1) + (method3214(var13, var14, 1) - 128 >> 2);
                    int var16 = (int) ((double) var15 * 0.3D) + 35;
                    if (var16 < 10) {
                        var16 = 10;
                    } else if (var16 > 60) {
                        var16 = 60;
                    }
                    var11[arg4] = -var16 * 8;
                } else {
                    var8[arg2][arg3][arg4] = var8[arg2 - 1][arg3][arg4] - 240;
                }
                break;
            }
            if (var10 == 1) {
                int var18 = arg1.method9025();
                if (var18 == 1) {
                    var18 = 0;
                }
                if (arg2 == 0) {
                    var8[0][arg3][arg4] = -var18 * 8;
                } else {
                    var8[arg2][arg3][arg4] = var8[arg2 - 1][arg3][arg4] - var18 * 8;
                }
                break;
            }
            if (var10 <= 49) {
                Statics.field1017[arg2][arg3][arg4] = (short) arg1.method8919();
                Statics.field2349[arg2][arg3][arg4] = (byte) ((var10 - 2) / 4);
                Statics.field7[arg2][arg3][arg4] = (byte) (var10 - 2 + arg7 & 0x3);
            } else if (var10 <= 81) {
                var9[arg2][arg3][arg4] = (byte) (var10 - 49);
            } else {
                Statics.field1030[arg2][arg3][arg4] = (short) (var10 - 81);
            }
        }
    }

    @ObfuscatedName("aa.ac([BIII)Z")
    public static final boolean method185(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class549 var4 = new class549(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8815();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8813();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method9025() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class261 var16 = class261.method4328(var5);
                        if (var13 != 22 || !client.field548 || var16.field2750 != 0 || var16.field2748 == 1 || var16.field2769) {
                            if (!var16.method4715()) {
                                client.field576++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8813();
                if (var9 == 0) {
                    break;
                }
                var4.method9025();
            }
        }
    }

    @ObfuscatedName("fw.ae(Ldy;[BIII)V")
    public static final void method3211(class102 arg0, byte[] arg1, int arg2, int arg3) {
        class549 var4 = new class549(arg1);
        int var5 = -1;
        while (true) {
            int var6 = var4.method8815();
            if (var6 == 0) {
                return;
            }
            var5 += var6;
            int var7 = 0;
            while (true) {
                int var8 = var4.method8813();
                if (var8 == 0) {
                    break;
                }
                var7 += var8 - 1;
                int var9 = var7 & 0x3F;
                int var10 = var7 >> 6 & 0x3F;
                int var11 = var7 >> 12;
                int var12 = var4.method9025();
                int var13 = var12 >> 2;
                int var14 = var12 & 0x3;
                int var15 = arg2 + var10;
                int var16 = arg3 + var9;
                if (var15 > 0 && var16 > 0 && var15 < arg0.field1314[0].length - 2 && var16 < arg0.field1314[0][0].length - 2) {
                    int var17 = var11;
                    if ((arg0.field1315[1][var15][var16] & 0x2) == 2) {
                        var17 = var11 - 1;
                    }
                    class269 var18 = null;
                    if (var17 >= 0 && arg0.field1305 != null) {
                        var18 = arg0.field1305[var17];
                    }
                    method3435(arg0, var11, var15, var16, var5, var14, var13, var18);
                }
            }
        }
    }

    @ObfuscatedName("de.ad(Ldy;[BIIIIIII)V")
    public static final void method2260(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class549 var9 = new class549(arg1);
        int var10 = -1;
        while (true) {
            int var11 = var9.method8815();
            if (var11 == 0) {
                return;
            }
            var10 += var11;
            int var12 = 0;
            while (true) {
                int var13 = var9.method8813();
                if (var13 == 0) {
                    break;
                }
                var12 += var13 - 1;
                int var14 = var12 & 0x3F;
                int var15 = var12 >> 6 & 0x3F;
                int var16 = var12 >> 12;
                int var17 = var9.method9025();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                if (arg5 == var16 && var15 >= arg6 && var15 < arg6 + 8 && var14 >= arg7 && var14 < arg7 + 8) {
                    class261 var20 = class261.method4328(var10);
                    int var22 = var15 & 0x7;
                    int var23 = var14 & 0x7;
                    int var25 = var20.field2746;
                    int var26 = var20.field2759;
                    if ((var19 & 0x1) == 1) {
                        int var27 = var25;
                        var25 = var26;
                        var26 = var27;
                    }
                    int var28 = arg8 & 0x3;
                    int var29;
                    if (var28 == 0) {
                        var29 = var22;
                    } else if (var28 == 1) {
                        var29 = var23;
                    } else if (var28 == 2) {
                        var29 = 7 - var22 - (var25 - 1);
                    } else {
                        var29 = 7 - var23 - (var26 - 1);
                    }
                    int var30 = arg3 + var29;
                    int var32 = var15 & 0x7;
                    int var33 = var14 & 0x7;
                    int var35 = var20.field2746;
                    int var36 = var20.field2759;
                    if ((var19 & 0x1) == 1) {
                        int var37 = var35;
                        var35 = var36;
                        var36 = var37;
                    }
                    int var38 = arg8 & 0x3;
                    int var39;
                    if (var38 == 0) {
                        var39 = var33;
                    } else if (var38 == 1) {
                        var39 = 7 - var32 - (var35 - 1);
                    } else if (var38 == 2) {
                        var39 = 7 - var33 - (var36 - 1);
                    } else {
                        var39 = var32;
                    }
                    int var40 = arg4 + var39;
                    if (var30 > 0 && var40 > 0 && var30 < arg0.field1309 - 1 && var40 < arg0.field1310 - 1) {
                        int var41 = arg2;
                        if ((arg0.field1315[1][var30][var40] & 0x2) == 2) {
                            var41 = arg2 - 1;
                        }
                        class269 var42 = null;
                        if (var41 >= 0 && arg0.field1305 != null) {
                            var42 = arg0.field1305[var41];
                        }
                        method3435(arg0, arg2, var30, var40, var10, arg8 + var19 & 0x3, var18, var42);
                    }
                }
            }
        }
    }

    @ObfuscatedName("go.aq(Ldy;IIIIIILkd;B)V")
    public static final void method3435(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class269 arg7) {
        if (client.field548 && (arg0.field1315[0][arg2][arg3] & 0x2) == 0 && (arg0.field1315[arg1][arg2][arg3] & 0x10) != 0) {
            return;
        }
        if (arg1 < field1025) {
            field1025 = arg1;
        }
        class261 var8 = class261.method4328(arg4);
        int var9;
        int var10;
        if (arg5 == 1 || arg5 == 3) {
            var9 = var8.field2759;
            var10 = var8.field2746;
        } else {
            var9 = var8.field2746;
            var10 = var8.field2759;
        }
        int var11;
        int var12;
        if (arg2 + var9 <= arg0.field1309) {
            var11 = (var9 >> 1) + arg2;
            var12 = (var9 + 1 >> 1) + arg2;
        } else {
            var11 = arg2;
            var12 = arg2 + 1;
        }
        int var13;
        int var14;
        if (arg3 + var10 <= arg0.field1310) {
            var13 = (var10 >> 1) + arg3;
            var14 = (var10 + 1 >> 1) + arg3;
        } else {
            var13 = arg3;
            var14 = arg3 + 1;
        }
        int[][] var15 = arg0.field1314[arg1];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg2 << 7) + (var9 << 6);
        int var18 = (arg3 << 7) + (var10 << 6);
        long var19 = class198.method4242(arg2, arg3, 2, var8.field2750 == 0, arg4, arg0.field1312);
        int var21 = (arg5 << 6) + arg6;
        if (var8.field2771 == 1) {
            var21 += 256;
        }
        if (var8.method4734()) {
            class72.method4349(arg1, arg2, arg3, var8, arg5);
        }
        class186 var22 = arg0.field1328;
        if (arg6 == 22) {
            if (!client.field548 || var8.field2750 != 0 || var8.field2748 == 1 || var8.field2769) {
                class189 var23;
                if (var8.field2754 == -1 && var8.field2783 == null) {
                    var23 = var8.method4716(22, arg5, var15, var17, var16, var18);
                } else {
                    var23 = new class82(arg0, arg4, 22, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
                }
                var22.method3604(arg1, arg2, arg3, var16, var23, var19, var21);
                if (var8.field2748 == 1 && arg7 != null) {
                    arg7.method4973(arg2, arg3);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class189 var49;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var49 = var8.method4716(10, arg5, var15, var17, var16, var18);
            } else {
                var49 = new class82(arg0, arg4, 10, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            if (var49 != null && var22.method3629(arg1, arg2, arg3, var16, var9, var10, var49, arg6 == 11 ? 256 : 0, var19, var21) && var8.field2762) {
                int var50 = 15;
                if (var49 instanceof class197) {
                    var50 = ((class197) var49).method3910() / 4;
                    if (var50 > 30) {
                        var50 = 30;
                    }
                }
                for (int var51 = 0; var51 <= var9; var51++) {
                    for (int var52 = 0; var52 <= var10; var52++) {
                        if (var50 > Statics.field4723[arg1][arg2 + var51][arg3 + var52]) {
                            Statics.field4723[arg1][arg2 + var51][arg3 + var52] = (byte) var50;
                        }
                    }
                }
            }
            if (var8.field2748 != 0 && arg7 != null) {
                arg7.method4961(arg2, arg3, var9, var10, var8.field2749);
            }
        } else if (arg6 >= 12) {
            class189 var24;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var24 = var8.method4716(arg6, arg5, var15, var17, var16, var18);
            } else {
                var24 = new class82(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3629(arg1, arg2, arg3, var16, 1, 1, var24, 0, var19, var21);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
                Statics.field3178[arg1][arg2][arg3] |= 0x924;
            }
            if (var8.field2748 != 0 && arg7 != null) {
                arg7.method4961(arg2, arg3, var9, var10, var8.field2749);
            }
        } else if (arg6 == 0) {
            class189 var25;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var25 = var8.method4716(0, arg5, var15, var17, var16, var18);
            } else {
                var25 = new class82(arg0, arg4, 0, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3606(arg1, arg2, arg3, var16, var25, (class189) null, field1016[arg5], 0, var19, var21);
            if (arg5 == 0) {
                if (var8.field2762) {
                    Statics.field4723[arg1][arg2][arg3] = 50;
                    Statics.field4723[arg1][arg2][arg3 + 1] = 50;
                }
                if (var8.field2778) {
                    Statics.field3178[arg1][arg2][arg3] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var8.field2762) {
                    Statics.field4723[arg1][arg2][arg3 + 1] = 50;
                    Statics.field4723[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2778) {
                    Statics.field3178[arg1][arg2][arg3 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var8.field2762) {
                    Statics.field4723[arg1][arg2 + 1][arg3] = 50;
                    Statics.field4723[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2778) {
                    Statics.field3178[arg1][arg2 + 1][arg3] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var8.field2762) {
                    Statics.field4723[arg1][arg2][arg3] = 50;
                    Statics.field4723[arg1][arg2 + 1][arg3] = 50;
                }
                if (var8.field2778) {
                    Statics.field3178[arg1][arg2][arg3] |= 0x492;
                }
            }
            if (var8.field2748 != 0 && arg7 != null) {
                arg7.method4960(arg2, arg3, arg6, arg5, var8.field2749);
            }
            if (var8.field2755 != 16) {
                var22.method3614(arg1, arg2, arg3, var8.field2755);
            }
        } else if (arg6 == 1) {
            class189 var26;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var26 = var8.method4716(1, arg5, var15, var17, var16, var18);
            } else {
                var26 = new class82(arg0, arg4, 1, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3606(arg1, arg2, arg3, var16, var26, (class189) null, field1024[arg5], 0, var19, var21);
            if (var8.field2762) {
                if (arg5 == 0) {
                    Statics.field4723[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field4723[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field4723[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field4723[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2748 != 0 && arg7 != null) {
                arg7.method4960(arg2, arg3, arg6, arg5, var8.field2749);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class189 var28;
            class189 var29;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var28 = var8.method4716(2, arg5 + 4, var15, var17, var16, var18);
                var29 = var8.method4716(2, var27, var15, var17, var16, var18);
            } else {
                var28 = new class82(arg0, arg4, 2, arg5 + 4, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
                var29 = new class82(arg0, arg4, 2, var27, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3606(arg1, arg2, arg3, var16, var28, var29, field1016[arg5], field1016[var27], var19, var21);
            if (var8.field2778) {
                if (arg5 == 0) {
                    Statics.field3178[arg1][arg2][arg3] |= 0x249;
                    Statics.field3178[arg1][arg2][arg3 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    Statics.field3178[arg1][arg2][arg3 + 1] |= 0x492;
                    Statics.field3178[arg1][arg2 + 1][arg3] |= 0x249;
                } else if (arg5 == 2) {
                    Statics.field3178[arg1][arg2 + 1][arg3] |= 0x249;
                    Statics.field3178[arg1][arg2][arg3] |= 0x492;
                } else if (arg5 == 3) {
                    Statics.field3178[arg1][arg2][arg3] |= 0x492;
                    Statics.field3178[arg1][arg2][arg3] |= 0x249;
                }
            }
            if (var8.field2748 != 0 && arg7 != null) {
                arg7.method4960(arg2, arg3, arg6, arg5, var8.field2749);
            }
            if (var8.field2755 != 16) {
                var22.method3614(arg1, arg2, arg3, var8.field2755);
            }
        } else if (arg6 == 3) {
            class189 var30;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var30 = var8.method4716(3, arg5, var15, var17, var16, var18);
            } else {
                var30 = new class82(arg0, arg4, 3, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3606(arg1, arg2, arg3, var16, var30, (class189) null, field1024[arg5], 0, var19, var21);
            if (var8.field2762) {
                if (arg5 == 0) {
                    Statics.field4723[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field4723[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field4723[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field4723[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2748 != 0 && arg7 != null) {
                arg7.method4960(arg2, arg3, arg6, arg5, var8.field2749);
            }
        } else if (arg6 == 9) {
            class189 var31;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var31 = var8.method4716(arg6, arg5, var15, var17, var16, var18);
            } else {
                var31 = new class82(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3629(arg1, arg2, arg3, var16, 1, 1, var31, 0, var19, var21);
            if (var8.field2748 != 0 && arg7 != null) {
                arg7.method4961(arg2, arg3, var9, var10, var8.field2749);
            }
            if (var8.field2755 != 16) {
                var22.method3614(arg1, arg2, arg3, var8.field2755);
            }
        } else if (arg6 == 4) {
            class189 var32;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var32 = var8.method4716(4, arg5, var15, var17, var16, var18);
            } else {
                var32 = new class82(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3607(arg1, arg2, arg3, var16, var32, (class189) null, field1016[arg5], 0, 0, 0, var19, var21);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = var22.method3819(arg1, arg2, arg3);
            if (var34 != 0L) {
                var33 = class261.method4328(class198.method8270(var34)).field2755;
            }
            class189 var36;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var36 = var8.method4716(4, arg5, var15, var17, var16, var18);
            } else {
                var36 = new class82(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3607(arg1, arg2, arg3, var16, var36, (class189) null, field1016[arg5], 0, field1018[arg5] * var33, field1026[arg5] * var33, var19, var21);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = var22.method3819(arg1, arg2, arg3);
            if (var38 != 0L) {
                var37 = class261.method4328(class198.method8270(var38)).field2755 / 2;
            }
            class189 var40;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var40 = var8.method4716(4, arg5 + 4, var15, var17, var16, var18);
            } else {
                var40 = new class82(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3607(arg1, arg2, arg3, var16, var40, (class189) null, 256, arg5, field1027[arg5] * var37, field1023[arg5] * var37, var19, var21);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class189 var42;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var42 = var8.method4716(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class82(arg0, arg4, 4, var41 + 4, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3607(arg1, arg2, arg3, var16, var42, (class189) null, 256, var41, 0, 0, var19, var21);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = var22.method3819(arg1, arg2, arg3);
            if (var44 != 0L) {
                var43 = class261.method4328(class198.method8270(var44)).field2755 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class189 var47;
            class189 var48;
            if (var8.field2754 == -1 && var8.field2783 == null) {
                var47 = var8.method4716(4, arg5 + 4, var15, var17, var16, var18);
                var48 = var8.method4716(4, var46 + 4, var15, var17, var16, var18);
            } else {
                var47 = new class82(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
                var48 = new class82(arg0, arg4, 4, var46 + 4, arg1, arg2, arg3, var8.field2754, var8.field2781, (class189) null);
            }
            var22.method3607(arg1, arg2, arg3, var16, var47, var48, 256, arg5, field1027[arg5] * var43, field1023[arg5] * var43, var19, var21);
        }
    }

    @ObfuscatedName("qq.al(Ldy;B)V")
    public static final void method7350(class102 arg0) {
        int var1 = arg0.field1309;
        int var2 = arg0.field1310;
        int[][][] var3 = arg0.field1314;
        byte[][][] var4 = arg0.field1315;
        class186 var5 = arg0.field1328;
        class269[] var6 = arg0.field1305;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
                for (int var9 = 0; var9 < var2; var9++) {
                    if ((arg0.field1315[var7][var8][var9] & 0x1) == 1) {
                        int var10 = var7;
                        if ((arg0.field1315[1][var8][var9] & 0x2) == 2) {
                            var10 = var7 - 1;
                        }
                        if (var10 >= 0 && var6 != null) {
                            var6[var10].method4962(var8, var9);
                        }
                    }
                }
            }
        }
        field1029 += (int) (Math.random() * 5.0D) - 2;
        if (field1029 < -8) {
            field1029 = -8;
        }
        if (field1029 > 8) {
            field1029 = 8;
        }
        field1021 += (int) (Math.random() * 5.0D) - 2;
        if (field1021 < -16) {
            field1021 = -16;
        }
        if (field1021 > 16) {
            field1021 = 16;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            byte[][] var12 = Statics.field4723[var11];
            boolean var13 = true;
            boolean var14 = true;
            boolean var15 = true;
            boolean var16 = true;
            boolean var17 = true;
            int var18 = (int) Math.sqrt(5100.0D);
            int var19 = var18 * 768 >> 8;
            for (int var20 = 1; var20 < var2 - 1; var20++) {
                for (int var21 = 1; var21 < var1 - 1; var21++) {
                    int var22 = var3[var11][var21 + 1][var20] - var3[var11][var21 - 1][var20];
                    int var23 = var3[var11][var21][var20 + 1] - var3[var11][var21][var20 - 1];
                    int var24 = (int) Math.sqrt((double) (var23 * var23 + var22 * var22 + 65536));
                    int var25 = (var22 << 8) / var24;
                    int var26 = 65536 / var24;
                    int var27 = (var23 << 8) / var24;
                    int var28 = (var27 * -50 + var25 * -50 + var26 * -10) / var19 + 96;
                    int var29 = (var12[var21][var20] >> 1) + (var12[var21][var20 + 1] >> 3) + (var12[var21][var20 - 1] >> 2) + (var12[var21 - 1][var20] >> 2) + (var12[var21 + 1][var20] >> 3);
                    Statics.field1033[var21][var20] = var28 - var29;
                }
            }
            for (int var30 = 0; var30 < var2; var30++) {
                Statics.field1028[var30] = 0;
                Statics.field3963[var30] = 0;
                Statics.field1020[var30] = 0;
                Statics.field3957[var30] = 0;
                Statics.field219[var30] = 0;
            }
            for (int var31 = -5; var31 < var1 + 5; var31++) {
                for (int var32 = 0; var32 < var2; var32++) {
                    int var33 = var31 + 5;
                    int var10002;
                    if (var33 >= 0 && var33 < var1) {
                        long var34 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var36 = (int) var34;
                        int var37 = Statics.field1030[var11][var33][var32] & var36;
                        if (var37 > 0) {
                            class252 var38 = class252.method3281(var37 - 1);
                            Statics.field1028[var32] += var38.field2663;
                            Statics.field3963[var32] += var38.field2661;
                            Statics.field1020[var32] += var38.field2666;
                            Statics.field3957[var32] += var38.field2665;
                            var10002 = Statics.field219[var32]++;
                        }
                    }
                    int var39 = var31 - 5;
                    if (var39 >= 0 && var39 < var1) {
                        int var40 = (int) class331.method5069(15);
                        int var41 = Statics.field1030[var11][var39][var32] & var40;
                        if (var41 > 0) {
                            class252 var42 = class252.method3281(var41 - 1);
                            Statics.field1028[var32] -= var42.field2663;
                            Statics.field3963[var32] -= var42.field2661;
                            Statics.field1020[var32] -= var42.field2666;
                            Statics.field3957[var32] -= var42.field2665;
                            var10002 = Statics.field219[var32]--;
                        }
                    }
                }
                if (var31 >= 1 && var31 < var1 - 1) {
                    int var43 = 0;
                    int var44 = 0;
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    for (int var48 = -5; var48 < var2 + 5; var48++) {
                        int var49 = var48 + 5;
                        if (var49 >= 0 && var49 < var2) {
                            var43 += Statics.field1028[var49];
                            var44 += Statics.field3963[var49];
                            var45 += Statics.field1020[var49];
                            var46 += Statics.field3957[var49];
                            var47 += Statics.field219[var49];
                        }
                        int var50 = var48 - 5;
                        if (var50 >= 0 && var50 < var2) {
                            var43 -= Statics.field1028[var50];
                            var44 -= Statics.field3963[var50];
                            var45 -= Statics.field1020[var50];
                            var46 -= Statics.field3957[var50];
                            var47 -= Statics.field219[var50];
                        }
                        if (var48 >= 1 && var48 < var2 - 1 && (!client.field548 || (var4[0][var31][var48] & 0x2) != 0 || (var4[var11][var31][var48] & 0x10) == 0)) {
                            if (var11 < field1025) {
                                field1025 = var11;
                            }
                            long var51 = (long) Math.pow(2.0D, 15.0D) - 1L;
                            int var53 = (int) var51;
                            int var54 = Statics.field1030[var11][var31][var48] & var53;
                            int var55 = Statics.field1017[var11][var31][var48] & var53;
                            if (var54 > 0 || var55 > 0) {
                                int var56 = var3[var11][var31][var48];
                                int var57 = var3[var11][var31 + 1][var48];
                                int var58 = var3[var11][var31 + 1][var48 + 1];
                                int var59 = var3[var11][var31][var48 + 1];
                                int var60 = Statics.field1033[var31][var48];
                                int var61 = Statics.field1033[var31 + 1][var48];
                                int var62 = Statics.field1033[var31 + 1][var48 + 1];
                                int var63 = Statics.field1033[var31][var48 + 1];
                                int var64 = -1;
                                int var65 = -1;
                                if (var54 > 0) {
                                    int var66 = var43 * 256 / var46;
                                    int var67 = var44 / var47;
                                    int var68 = var45 / var47;
                                    var64 = Statics.method1029(var66, var67, var68);
                                    int var69 = field1029 + var66 & 0xFF;
                                    int var70 = field1021 + var68;
                                    if (var70 < 0) {
                                        var70 = 0;
                                    } else if (var70 > 255) {
                                        var70 = 255;
                                    }
                                    var65 = Statics.method1029(var69, var67, var70);
                                }
                                if (var11 > 0) {
                                    boolean var71 = true;
                                    if (var54 == 0 && Statics.field2349[var11][var31][var48] != 0) {
                                        var71 = false;
                                    }
                                    if (var55 > 0) {
                                        int var72 = var55 - 1;
                                        class263 var73 = (class263) class263.field2850.method5586((long) var72);
                                        class263 var74;
                                        if (var73 == null) {
                                            byte[] var75 = Statics.field2849.method6670(4, var72);
                                            class263 var76 = new class263();
                                            if (var75 != null) {
                                                var76.method4841(new class549(var75), var72);
                                            }
                                            var76.method4840();
                                            class263.field2850.method5589(var76, (long) var72);
                                            var74 = var76;
                                        } else {
                                            var74 = var73;
                                        }
                                        if (!var74.field2852) {
                                            var71 = false;
                                        }
                                    }
                                    if (var71 && var56 == var57 && var56 == var58 && var56 == var59) {
                                        Statics.field3178[var11][var31][var48] |= 0x924;
                                    }
                                }
                                int var77 = 0;
                                if (var65 != -1) {
                                    var77 = class181.field1940[method4477(var65, 96)];
                                }
                                if (var55 == 0) {
                                    var5.method3657(var11, var31, var48, 0, 0, -1, var56, var57, var58, var59, method4477(var64, var60), method4477(var64, var61), method4477(var64, var62), method4477(var64, var63), 0, 0, 0, 0, var77, 0);
                                } else {
                                    int var78 = Statics.field2349[var11][var31][var48] + 1;
                                    byte var79 = Statics.field7[var11][var31][var48];
                                    class263 var80 = class263.method4476(var55 - 1);
                                    int var81 = var80.field2856;
                                    int var82;
                                    int var83;
                                    if (var81 >= 0) {
                                        var82 = class181.field1943.field2264.method3846(var81);
                                        var83 = -1;
                                    } else if (var80.field2851 == 16711935) {
                                        var83 = -2;
                                        var81 = -1;
                                        var82 = -2;
                                    } else {
                                        var83 = Statics.method1029(var80.field2854, var80.field2855, var80.field2848);
                                        int var84 = field1029 + var80.field2854 & 0xFF;
                                        int var85 = field1021 + var80.field2848;
                                        if (var85 < 0) {
                                            var85 = 0;
                                        } else if (var85 > 255) {
                                            var85 = 255;
                                        }
                                        var82 = Statics.method1029(var84, var80.field2855, var85);
                                    }
                                    int var86 = 0;
                                    if (var82 != -2) {
                                        var86 = class181.field1940[method2101(var82, 96)];
                                    }
                                    if (var80.field2853 != -1) {
                                        int var87 = field1029 + var80.field2857 & 0xFF;
                                        int var88 = field1021 + var80.field2859;
                                        if (var88 < 0) {
                                            var88 = 0;
                                        } else if (var88 > 255) {
                                            var88 = 255;
                                        }
                                        int var89 = Statics.method1029(var87, var80.field2858, var88);
                                        var86 = class181.field1940[method2101(var89, 96)];
                                    }
                                    var5.method3657(var11, var31, var48, var78, var79, var81, var56, var57, var58, var59, method4477(var64, var60), method4477(var64, var61), method4477(var64, var62), method4477(var64, var63), method2101(var83, var60), method2101(var83, var61), method2101(var83, var62), method2101(var83, var63), var77, var86);
                                }
                            }
                        }
                    }
                }
            }
            for (int var90 = 1; var90 < var2 - 1; var90++) {
                for (int var91 = 1; var91 < var1 - 1; var91++) {
                    var5.method3602(var11, var91, var90, method6637(arg0, var11, var91, var90));
                }
            }
            Statics.field1030[var11] = (short[][]) null;
            Statics.field1017[var11] = (short[][]) null;
            Statics.field2349[var11] = (byte[][]) null;
            Statics.field7[var11] = (byte[][]) null;
            Statics.field4723[var11] = (byte[][]) null;
        }
        var5.method3612(-50, -10, -50);
        for (int var92 = 0; var92 < var1; var92++) {
            for (int var93 = 0; var93 < var2; var93++) {
                if ((var4[1][var92][var93] & 0x2) == 2) {
                    var5.method3600(var92, var93);
                }
            }
        }
        int var94 = 1;
        int var95 = 2;
        int var96 = 4;
        for (int var97 = 0; var97 < 4; var97++) {
            if (var97 > 0) {
                var94 <<= 0x3;
                var95 <<= 0x3;
                var96 <<= 0x3;
            }
            for (int var98 = 0; var98 <= var97; var98++) {
                for (int var99 = 0; var99 <= var2; var99++) {
                    for (int var100 = 0; var100 <= var1; var100++) {
                        if ((Statics.field3178[var98][var100][var99] & var94) != 0) {
                            int var101 = var99;
                            int var102 = var99;
                            int var103 = var98;
                            int var104 = var98;
                            while (var101 > 0 && (Statics.field3178[var98][var100][var101 - 1] & var94) != 0) {
                                var101--;
                            }
                            while (var102 < var2 && (Statics.field3178[var98][var100][var102 + 1] & var94) != 0) {
                                var102++;
                            }
                            label348: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field3178[var103 - 1][var100][var105] & var94) == 0) {
                                        break label348;
                                    }
                                }
                                var103--;
                            }
                            label337: while (var104 < var97) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field3178[var104 + 1][var100][var106] & var94) == 0) {
                                        break label337;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = var3[var104][var100][var101] - var108;
                                int var110 = var3[var103][var100][var101];
                                var5.method3601(var97, 1, var100 * 128, var100 * 128, var101 * 128, var102 * 128 + 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field3178[var111][var100][var112] &= ~var94;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3178[var98][var100][var99] & var95) != 0) {
                            int var113 = var100;
                            int var114 = var100;
                            int var115 = var98;
                            int var116 = var98;
                            while (var113 > 0 && (Statics.field3178[var98][var113 - 1][var99] & var95) != 0) {
                                var113--;
                            }
                            while (var114 < var1 && (Statics.field3178[var98][var114 + 1][var99] & var95) != 0) {
                                var114++;
                            }
                            label401: while (var115 > 0) {
                                for (int var117 = var113; var117 <= var114; var117++) {
                                    if ((Statics.field3178[var115 - 1][var117][var99] & var95) == 0) {
                                        break label401;
                                    }
                                }
                                var115--;
                            }
                            label390: while (var116 < var97) {
                                for (int var118 = var113; var118 <= var114; var118++) {
                                    if ((Statics.field3178[var116 + 1][var118][var99] & var95) == 0) {
                                        break label390;
                                    }
                                }
                                var116++;
                            }
                            int var119 = (var116 + 1 - var115) * (var114 - var113 + 1);
                            if (var119 >= 8) {
                                short var120 = 240;
                                int var121 = var3[var116][var113][var99] - var120;
                                int var122 = var3[var115][var113][var99];
                                var5.method3601(var97, 2, var113 * 128, var114 * 128 + 128, var99 * 128, var99 * 128, var121, var122);
                                for (int var123 = var115; var123 <= var116; var123++) {
                                    for (int var124 = var113; var124 <= var114; var124++) {
                                        Statics.field3178[var123][var124][var99] &= ~var95;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3178[var98][var100][var99] & var96) != 0) {
                            int var125 = var100;
                            int var126 = var100;
                            int var127 = var99;
                            int var128 = var99;
                            while (var127 > 0 && (Statics.field3178[var98][var100][var127 - 1] & var96) != 0) {
                                var127--;
                            }
                            while (var128 < var2 && (Statics.field3178[var98][var100][var128 + 1] & var96) != 0) {
                                var128++;
                            }
                            label454: while (var125 > 0) {
                                for (int var129 = var127; var129 <= var128; var129++) {
                                    if ((Statics.field3178[var98][var125 - 1][var129] & var96) == 0) {
                                        break label454;
                                    }
                                }
                                var125--;
                            }
                            label443: while (var126 < var1) {
                                for (int var130 = var127; var130 <= var128; var130++) {
                                    if ((Statics.field3178[var98][var126 + 1][var130] & var96) == 0) {
                                        break label443;
                                    }
                                }
                                var126++;
                            }
                            if ((var126 - var125 + 1) * (var128 - var127 + 1) >= 4) {
                                int var131 = var3[var98][var125][var127];
                                var5.method3601(var97, 4, var125 * 128, var126 * 128 + 128, var127 * 128, var128 * 128 + 128, var131, var131);
                                for (int var132 = var125; var132 <= var126; var132++) {
                                    for (int var133 = var127; var133 <= var128; var133++) {
                                        Statics.field3178[var98][var132][var133] &= ~var96;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("on.aj(Ldy;IIII)I")
    public static int method6637(class102 arg0, int arg1, int arg2, int arg3) {
        if ((arg0.field1315[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (arg0.field1315[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fw.as(IIIB)I")
    public static final int method3214(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method5605(var3, var5);
        int var8 = method5605(var3 + 1, var5);
        int var9 = method5605(var3, var5 + 1);
        int var10 = method5605(var3 + 1, var5 + 1);
        int var11 = method8650(var7, var8, var4, arg2);
        int var12 = method8650(var9, var10, var4, arg2);
        return method8650(var11, var12, var6, arg2);
    }

    @ObfuscatedName("uy.aw(IIIII)I")
    public static final int method8650(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class181.field1942[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("my.af(IIB)I")
    public static final int method5605(int arg0, int arg1) {
        int var2 = method2954(arg0 - 1, arg1 - 1) + method2954(arg0 + 1, arg1 - 1) + method2954(arg0 - 1, arg1 + 1) + method2954(arg0 + 1, arg1 + 1);
        int var3 = method2954(arg0 - 1, arg1) + method2954(arg0 + 1, arg1) + method2954(arg0, arg1 - 1) + method2954(arg0, arg1 + 1);
        int var4 = method2954(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ef.aa(III)I")
    public static final int method2954(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("je.ah(IIB)I")
    public static final int method4477(int arg0, int arg1) {
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

    @ObfuscatedName("ch.ag(III)I")
    public static final int method2101(int arg0, int arg1) {
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
}
