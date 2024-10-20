package deob;

@ObfuscatedName("db")
public final class class85 {

    @ObfuscatedName("db.ac")
    public static int field1054 = 99;

    @ObfuscatedName("db.aa")
    public static final int[] field1058 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("db.ai")
    public static final int[] field1059 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("db.ao")
    public static final int[] field1062 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("db.as")
    public static final int[] field1061 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("db.ay")
    public static final int[] field1064 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("db.aj")
    public static final int[] field1063 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("db.av")
    public static int field1055 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("db.aw")
    public static int field1065 = (int) (Math.random() * 33.0D) - 16;

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.ac(I)V")
    public static void method2871() {
        field1054 = 99;
        Statics.field4832 = new short[4][104][104];
        Statics.field4021 = new short[4][104][104];
        Statics.field5479 = new byte[4][104][104];
        Statics.field1066 = new byte[4][104][104];
        Statics.field295 = new int[4][105][105];
        Statics.field5004 = new byte[4][105][105];
        Statics.field5172 = new int[105][105];
        Statics.field3588 = new int[104];
        Statics.field1379 = new int[104];
        Statics.field1056 = new int[104];
        Statics.field943 = new int[104];
        Statics.field1057 = new int[104];
    }

    @ObfuscatedName("ex.ae(I)V")
    public static void method2831() {
        Statics.field4832 = (short[][][]) null;
        Statics.field4021 = (short[][][]) null;
        Statics.field5479 = (byte[][][]) null;
        Statics.field1066 = (byte[][][]) null;
        Statics.field295 = (int[][][]) null;
        Statics.field5004 = (byte[][][]) null;
        Statics.field5172 = (int[][]) null;
        Statics.field3588 = null;
        Statics.field1379 = null;
        Statics.field1056 = null;
        Statics.field943 = null;
        Statics.field1057 = null;
    }

    @ObfuscatedName("lr.ag(Ldd;IIIII)V")
    public static final void method5612(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        int[][][] var5 = arg0.field1371;
        int var6 = arg0.field1359 - 1;
        int var7 = arg0.field1355 - 1;
        for (int var8 = arg2; var8 <= arg2 + arg4; var8++) {
            for (int var9 = arg1; var9 <= arg1 + arg3; var9++) {
                if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
                    Statics.field5004[0][var9][var8] = 127;
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

    @ObfuscatedName("hz.am(Ldd;[BIIIII)V")
    public static final void method3658(class104 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0.field1352 != null) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 64; var7++) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        if (arg2 + var7 > 0 && arg2 + var7 < arg0.field1352[var6].field3004.length && arg3 + var8 > 0 && arg3 + var8 < arg0.field1352[var6].field3004[arg2 + var7].length) {
                            arg0.field1352[var6].field3004[arg2 + var7][arg3 + var8] &= 0xBFFFFFFF;
                        }
                    }
                }
            }
        }
        class551 var9 = new class551(arg1);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg2 + var11;
                    int var14 = arg3 + var12;
                    method8820(arg0, var9, var10, var13, var14, arg4 + var13, arg5 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ll.ax(Ldd;[BIIIIIIIIIB)V")
    public static final void method5557(class104 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class271[] var11 = arg0.field1352;
        if (var11 != null) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < var11[arg2].field3004.length && arg4 + var13 > 0 && arg4 + var13 < var11[arg2].field3004[arg3 + var12].length) {
                        var11[arg2].field3004[arg3 + var12][arg4 + var13] &= 0xBFFFFFFF;
                    }
                }
            }
        }
        class551 var14 = new class551(arg1);
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg5 == var15 && var16 >= arg6 && var16 < arg6 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                        int var18 = arg3 + class356.method3444(var16 & 0x7, var17 & 0x7, arg8);
                        int var19 = arg4 + class356.method5129(var16 & 0x7, var17 & 0x7, arg8);
                        int var20 = (var16 & 0x7) + arg3 + arg9;
                        int var21 = (var17 & 0x7) + arg4 + arg10;
                        method8820(arg0, var14, arg2, var18, var19, var20, var21, arg8);
                    } else {
                        method8820(arg0, var14, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.aq([[[IIIII)V")
    public static final void method2704(int[][][] arg0, int arg1, int arg2, int arg3) {
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

    @ObfuscatedName("ux.af(Ldd;Lvf;IIIIIII)V")
    public static final void method8820(class104 arg0, class551 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[][][] var8 = arg0.field1371;
        byte[][][] var9 = arg0.field1360;
        if (arg2 < 0 || arg2 >= 4 || arg3 < 0 || arg3 >= var8[0].length - 1 || arg4 < 0 || arg4 >= var8[0][0].length - 1) {
            while (true) {
                int var19 = arg1.method9119();
                if (var19 == 0) {
                    break;
                }
                if (var19 == 1) {
                    arg1.method8955();
                    break;
                }
                if (var19 <= 49) {
                    arg1.method8977();
                }
            }
            return;
        }
        var9[arg2][arg3][arg4] = 0;
        while (true) {
            int var10 = arg1.method9119();
            if (var10 == 0) {
                if (arg2 == 0) {
                    int[] var11 = var8[0][arg3];
                    int var13 = arg5 + 932731;
                    int var14 = arg6 + 556238;
                    int var15 = method2869(var13 + 45365, var14 + 91923, 4) - 128 + (method2869(var13 + 10294, var14 + 37821, 2) - 128 >> 1) + (method2869(var13, var14, 1) - 128 >> 2);
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
                int var18 = arg1.method8955();
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
                Statics.field4021[arg2][arg3][arg4] = (short) arg1.method8977();
                Statics.field5479[arg2][arg3][arg4] = (byte) ((var10 - 2) / 4);
                Statics.field1066[arg2][arg3][arg4] = (byte) (var10 - 2 + arg7 & 0x3);
            } else if (var10 <= 81) {
                var9[arg2][arg3][arg4] = (byte) (var10 - 49);
            } else {
                Statics.field4832[arg2][arg3][arg4] = (short) (var10 - 81);
            }
        }
    }

    @ObfuscatedName("iq.at([BIII)Z")
    public static final boolean method4233(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class551 var4 = new class551(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8991();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8989();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8955() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class210 var16 = class210.method5152(var5);
                        if (var13 != 22 || !client.field520 || var16.field2194 != 0 || var16.field2179 == 1 || var16.field2209) {
                            if (!var16.method3837()) {
                                client.field627++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8989();
                if (var9 == 0) {
                    break;
                }
                var4.method8955();
            }
        }
    }

    @ObfuscatedName("eq.au(Ldd;[BIII)V")
    public static final void method3052(class104 arg0, byte[] arg1, int arg2, int arg3) {
        class551 var4 = new class551(arg1);
        int var5 = -1;
        while (true) {
            int var6 = var4.method8991();
            if (var6 == 0) {
                return;
            }
            var5 += var6;
            int var7 = 0;
            while (true) {
                int var8 = var4.method8989();
                if (var8 == 0) {
                    break;
                }
                var7 += var8 - 1;
                int var9 = var7 & 0x3F;
                int var10 = var7 >> 6 & 0x3F;
                int var11 = var7 >> 12;
                int var12 = var4.method8955();
                int var13 = var12 >> 2;
                int var14 = var12 & 0x3;
                int var15 = arg2 + var10;
                int var16 = arg3 + var9;
                if (var15 > 0 && var16 > 0 && var15 < arg0.field1371[0].length - 2 && var16 < arg0.field1371[0][0].length - 2) {
                    int var17 = var11;
                    if ((arg0.field1360[1][var15][var16] & 0x2) == 2) {
                        var17 = var11 - 1;
                    }
                    class271 var18 = null;
                    if (var17 >= 0 && arg0.field1352 != null) {
                        var18 = arg0.field1352[var17];
                    }
                    method6698(arg0, var11, var15, var16, var5, var14, var13, var18);
                }
            }
        }
    }

    @ObfuscatedName("db.ar(Ldd;[BIIIIIII)V")
    public static final void method2312(class104 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class551 var9 = new class551(arg1);
        int var10 = -1;
        while (true) {
            int var11 = var9.method8991();
            if (var11 == 0) {
                return;
            }
            var10 += var11;
            int var12 = 0;
            while (true) {
                int var13 = var9.method8989();
                if (var13 == 0) {
                    break;
                }
                var12 += var13 - 1;
                int var14 = var12 & 0x3F;
                int var15 = var12 >> 6 & 0x3F;
                int var16 = var12 >> 12;
                int var17 = var9.method8955();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                if (arg5 == var16 && var15 >= arg6 && var15 < arg6 + 8 && var14 >= arg7 && var14 < arg7 + 8) {
                    class210 var20 = class210.method5152(var10);
                    int var21 = arg3 + class356.method4314(var15 & 0x7, var14 & 0x7, arg8, var20.field2189, var20.field2187, var19);
                    int var22 = arg4 + class356.method5547(var15 & 0x7, var14 & 0x7, arg8, var20.field2189, var20.field2187, var19);
                    if (var21 > 0 && var22 > 0 && var21 < arg0.field1359 - 1 && var22 < arg0.field1355 - 1) {
                        int var23 = arg2;
                        if ((arg0.field1360[1][var21][var22] & 0x2) == 2) {
                            var23 = arg2 - 1;
                        }
                        class271 var24 = null;
                        if (var23 >= 0 && arg0.field1352 != null) {
                            var24 = arg0.field1352[var23];
                        }
                        method6698(arg0, arg2, var21, var22, var10, arg8 + var19 & 0x3, var18, var24);
                    }
                }
            }
        }
    }

    @ObfuscatedName("or.al(Ldd;IIIIIILkd;I)V")
    public static final void method6698(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class271 arg7) {
        if (client.field520 && (arg0.field1360[0][arg2][arg3] & 0x2) == 0 && (arg0.field1360[arg1][arg2][arg3] & 0x10) != 0) {
            return;
        }
        if (arg1 < field1054) {
            field1054 = arg1;
        }
        class210 var8 = class210.method5152(arg4);
        int var9;
        int var10;
        if (arg5 == 1 || arg5 == 3) {
            var9 = var8.field2187;
            var10 = var8.field2189;
        } else {
            var9 = var8.field2189;
            var10 = var8.field2187;
        }
        int var11;
        int var12;
        if (arg2 + var9 <= arg0.field1359) {
            var11 = (var9 >> 1) + arg2;
            var12 = (var9 + 1 >> 1) + arg2;
        } else {
            var11 = arg2;
            var12 = arg2 + 1;
        }
        int var13;
        int var14;
        if (arg3 + var10 <= arg0.field1355) {
            var13 = (var10 >> 1) + arg3;
            var14 = (var10 + 1 >> 1) + arg3;
        } else {
            var13 = arg3;
            var14 = arg3 + 1;
        }
        int[][] var15 = arg0.field1371[arg1];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg2 << 7) + (var9 << 6);
        int var18 = (arg3 << 7) + (var10 << 6);
        long var19 = Statics.method5153(arg2, arg3, 2, var8.field2194 == 0, arg4, arg0.field1354);
        int var21 = (arg5 << 6) + arg6;
        if (var8.field2211 == 1) {
            var21 += 256;
        }
        if (var8.method3797()) {
            Statics.method5552(arg1, arg2, arg3, var8, arg5);
        }
        class245 var22 = arg0.field1372;
        if (arg6 == 22) {
            if (!client.field520 || var8.field2194 != 0 || var8.field2179 == 1 || var8.field2209) {
                class248 var23;
                if (var8.field2172 == -1 && var8.field2212 == null) {
                    var23 = var8.method3796(22, arg5, var15, var17, var16, var18);
                } else {
                    var23 = new class83(arg0, arg4, 22, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
                }
                var22.method4513(arg1, arg2, arg3, var16, var23, var19, var21);
                if (var8.field2179 == 1 && arg7 != null) {
                    arg7.method5102(arg2, arg3);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class248 var49;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var49 = var8.method3796(10, arg5, var15, var17, var16, var18);
            } else {
                var49 = new class83(arg0, arg4, 10, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            if (var49 != null && var22.method4507(arg1, arg2, arg3, var16, var9, var10, var49, arg6 == 11 ? 256 : 0, var19, var21) && var8.field2202) {
                int var50 = 15;
                if (var49 instanceof class256) {
                    var50 = ((class256) var49).method4816() / 4;
                    if (var50 > 30) {
                        var50 = 30;
                    }
                }
                for (int var51 = 0; var51 <= var9; var51++) {
                    for (int var52 = 0; var52 <= var10; var52++) {
                        if (var50 > Statics.field5004[arg1][arg2 + var51][arg3 + var52]) {
                            Statics.field5004[arg1][arg2 + var51][arg3 + var52] = (byte) var50;
                        }
                    }
                }
            }
            if (var8.field2179 != 0 && arg7 != null) {
                arg7.method5100(arg2, arg3, var9, var10, var8.field2213);
            }
        } else if (arg6 >= 12) {
            class248 var24;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var24 = var8.method3796(arg6, arg5, var15, var17, var16, var18);
            } else {
                var24 = new class83(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4507(arg1, arg2, arg3, var16, 1, 1, var24, 0, var19, var21);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
                Statics.field295[arg1][arg2][arg3] |= 0x924;
            }
            if (var8.field2179 != 0 && arg7 != null) {
                arg7.method5100(arg2, arg3, var9, var10, var8.field2213);
            }
        } else if (arg6 == 0) {
            class248 var25;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var25 = var8.method3796(0, arg5, var15, var17, var16, var18);
            } else {
                var25 = new class83(arg0, arg4, 0, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4505(arg1, arg2, arg3, var16, var25, (class248) null, field1058[arg5], 0, var19, var21);
            if (arg5 == 0) {
                if (var8.field2202) {
                    Statics.field5004[arg1][arg2][arg3] = 50;
                    Statics.field5004[arg1][arg2][arg3 + 1] = 50;
                }
                if (var8.field2193) {
                    Statics.field295[arg1][arg2][arg3] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var8.field2202) {
                    Statics.field5004[arg1][arg2][arg3 + 1] = 50;
                    Statics.field5004[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2193) {
                    Statics.field295[arg1][arg2][arg3 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var8.field2202) {
                    Statics.field5004[arg1][arg2 + 1][arg3] = 50;
                    Statics.field5004[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2193) {
                    Statics.field295[arg1][arg2 + 1][arg3] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var8.field2202) {
                    Statics.field5004[arg1][arg2][arg3] = 50;
                    Statics.field5004[arg1][arg2 + 1][arg3] = 50;
                }
                if (var8.field2193) {
                    Statics.field295[arg1][arg2][arg3] |= 0x492;
                }
            }
            if (var8.field2179 != 0 && arg7 != null) {
                arg7.method5099(arg2, arg3, arg6, arg5, var8.field2213);
            }
            if (var8.field2195 != 16) {
                var22.method4526(arg1, arg2, arg3, var8.field2195);
            }
        } else if (arg6 == 1) {
            class248 var26;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var26 = var8.method3796(1, arg5, var15, var17, var16, var18);
            } else {
                var26 = new class83(arg0, arg4, 1, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4505(arg1, arg2, arg3, var16, var26, (class248) null, field1059[arg5], 0, var19, var21);
            if (var8.field2202) {
                if (arg5 == 0) {
                    Statics.field5004[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field5004[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field5004[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field5004[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2179 != 0 && arg7 != null) {
                arg7.method5099(arg2, arg3, arg6, arg5, var8.field2213);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class248 var28;
            class248 var29;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var28 = var8.method3796(2, arg5 + 4, var15, var17, var16, var18);
                var29 = var8.method3796(2, var27, var15, var17, var16, var18);
            } else {
                var28 = new class83(arg0, arg4, 2, arg5 + 4, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
                var29 = new class83(arg0, arg4, 2, var27, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4505(arg1, arg2, arg3, var16, var28, var29, field1058[arg5], field1058[var27], var19, var21);
            if (var8.field2193) {
                if (arg5 == 0) {
                    Statics.field295[arg1][arg2][arg3] |= 0x249;
                    Statics.field295[arg1][arg2][arg3 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    Statics.field295[arg1][arg2][arg3 + 1] |= 0x492;
                    Statics.field295[arg1][arg2 + 1][arg3] |= 0x249;
                } else if (arg5 == 2) {
                    Statics.field295[arg1][arg2 + 1][arg3] |= 0x249;
                    Statics.field295[arg1][arg2][arg3] |= 0x492;
                } else if (arg5 == 3) {
                    Statics.field295[arg1][arg2][arg3] |= 0x492;
                    Statics.field295[arg1][arg2][arg3] |= 0x249;
                }
            }
            if (var8.field2179 != 0 && arg7 != null) {
                arg7.method5099(arg2, arg3, arg6, arg5, var8.field2213);
            }
            if (var8.field2195 != 16) {
                var22.method4526(arg1, arg2, arg3, var8.field2195);
            }
        } else if (arg6 == 3) {
            class248 var30;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var30 = var8.method3796(3, arg5, var15, var17, var16, var18);
            } else {
                var30 = new class83(arg0, arg4, 3, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4505(arg1, arg2, arg3, var16, var30, (class248) null, field1059[arg5], 0, var19, var21);
            if (var8.field2202) {
                if (arg5 == 0) {
                    Statics.field5004[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field5004[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field5004[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field5004[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2179 != 0 && arg7 != null) {
                arg7.method5099(arg2, arg3, arg6, arg5, var8.field2213);
            }
        } else if (arg6 == 9) {
            class248 var31;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var31 = var8.method3796(arg6, arg5, var15, var17, var16, var18);
            } else {
                var31 = new class83(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4507(arg1, arg2, arg3, var16, 1, 1, var31, 0, var19, var21);
            if (var8.field2179 != 0 && arg7 != null) {
                arg7.method5100(arg2, arg3, var9, var10, var8.field2213);
            }
            if (var8.field2195 != 16) {
                var22.method4526(arg1, arg2, arg3, var8.field2195);
            }
        } else if (arg6 == 4) {
            class248 var32;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var32 = var8.method3796(4, arg5, var15, var17, var16, var18);
            } else {
                var32 = new class83(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4506(arg1, arg2, arg3, var16, var32, (class248) null, field1058[arg5], 0, 0, 0, var19, var21);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = var22.method4523(arg1, arg2, arg3);
            if (var34 != 0L) {
                var33 = class210.method5152(class257.method4010(var34)).field2195;
            }
            class248 var36;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var36 = var8.method3796(4, arg5, var15, var17, var16, var18);
            } else {
                var36 = new class83(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4506(arg1, arg2, arg3, var16, var36, (class248) null, field1058[arg5], 0, field1062[arg5] * var33, field1061[arg5] * var33, var19, var21);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = var22.method4523(arg1, arg2, arg3);
            if (var38 != 0L) {
                var37 = class210.method5152(class257.method4010(var38)).field2195 / 2;
            }
            class248 var40;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var40 = var8.method3796(4, arg5 + 4, var15, var17, var16, var18);
            } else {
                var40 = new class83(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4506(arg1, arg2, arg3, var16, var40, (class248) null, 256, arg5, field1064[arg5] * var37, field1063[arg5] * var37, var19, var21);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class248 var42;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var42 = var8.method3796(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class83(arg0, arg4, 4, var41 + 4, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4506(arg1, arg2, arg3, var16, var42, (class248) null, 256, var41, 0, 0, var19, var21);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = var22.method4523(arg1, arg2, arg3);
            if (var44 != 0L) {
                var43 = class210.method5152(class257.method4010(var44)).field2195 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class248 var47;
            class248 var48;
            if (var8.field2172 == -1 && var8.field2212 == null) {
                var47 = var8.method3796(4, arg5 + 4, var15, var17, var16, var18);
                var48 = var8.method3796(4, var46 + 4, var15, var17, var16, var18);
            } else {
                var47 = new class83(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
                var48 = new class83(arg0, arg4, 4, var46 + 4, arg1, arg2, arg3, var8.field2172, var8.field2221, (class248) null);
            }
            var22.method4506(arg1, arg2, arg3, var16, var47, var48, 256, arg5, field1064[arg5] * var43, field1063[arg5] * var43, var19, var21);
        }
    }

    @ObfuscatedName("bw.ad(Ldd;I)V")
    public static final void method472(class104 arg0) {
        int var1 = arg0.field1359;
        int var2 = arg0.field1355;
        int[][][] var3 = arg0.field1371;
        byte[][][] var4 = arg0.field1360;
        class245 var5 = arg0.field1372;
        class271[] var6 = arg0.field1352;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
                for (int var9 = 0; var9 < var2; var9++) {
                    if ((arg0.field1360[var7][var8][var9] & 0x1) == 1) {
                        int var10 = var7;
                        if ((arg0.field1360[1][var8][var9] & 0x2) == 2) {
                            var10 = var7 - 1;
                        }
                        if (var10 >= 0 && var6 != null) {
                            var6[var10].method5101(var8, var9);
                        }
                    }
                }
            }
        }
        field1055 += (int) (Math.random() * 5.0D) - 2;
        if (field1055 < -8) {
            field1055 = -8;
        }
        if (field1055 > 8) {
            field1055 = 8;
        }
        field1065 += (int) (Math.random() * 5.0D) - 2;
        if (field1065 < -16) {
            field1065 = -16;
        }
        if (field1065 > 16) {
            field1065 = 16;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            byte[][] var12 = Statics.field5004[var11];
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
                    Statics.field5172[var21][var20] = var28 - var29;
                }
            }
            for (int var30 = 0; var30 < var2; var30++) {
                Statics.field3588[var30] = 0;
                Statics.field1379[var30] = 0;
                Statics.field1056[var30] = 0;
                Statics.field943[var30] = 0;
                Statics.field1057[var30] = 0;
            }
            for (int var31 = -5; var31 < var1 + 5; var31++) {
                for (int var32 = 0; var32 < var2; var32++) {
                    int var33 = var31 + 5;
                    int var10002;
                    if (var33 >= 0 && var33 < var1) {
                        int var34 = (int) class333.method3433(15);
                        int var35 = Statics.field4832[var11][var33][var32] & var34;
                        if (var35 > 0) {
                            int var36 = var35 - 1;
                            class201 var37 = (class201) class201.field2098.method5733((long) var36);
                            class201 var38;
                            if (var37 == null) {
                                byte[] var39 = Statics.field2102.method6782(1, var36);
                                class201 var40 = new class201();
                                if (var39 != null) {
                                    var40.method3682(new class551(var39), var36);
                                }
                                var40.method3681();
                                class201.field2098.method5735(var40, (long) var36);
                                var38 = var40;
                            } else {
                                var38 = var37;
                            }
                            Statics.field3588[var32] += var38.field2097;
                            Statics.field1379[var32] += var38.field2100;
                            Statics.field1056[var32] += var38.field2101;
                            Statics.field943[var32] += var38.field2103;
                            var10002 = Statics.field1057[var32]++;
                        }
                    }
                    int var42 = var31 - 5;
                    if (var42 >= 0 && var42 < var1) {
                        int var43 = (int) class333.method3433(15);
                        int var44 = Statics.field4832[var11][var42][var32] & var43;
                        if (var44 > 0) {
                            int var45 = var44 - 1;
                            class201 var46 = (class201) class201.field2098.method5733((long) var45);
                            class201 var47;
                            if (var46 == null) {
                                byte[] var48 = Statics.field2102.method6782(1, var45);
                                class201 var49 = new class201();
                                if (var48 != null) {
                                    var49.method3682(new class551(var48), var45);
                                }
                                var49.method3681();
                                class201.field2098.method5735(var49, (long) var45);
                                var47 = var49;
                            } else {
                                var47 = var46;
                            }
                            Statics.field3588[var32] -= var47.field2097;
                            Statics.field1379[var32] -= var47.field2100;
                            Statics.field1056[var32] -= var47.field2101;
                            Statics.field943[var32] -= var47.field2103;
                            var10002 = Statics.field1057[var32]--;
                        }
                    }
                }
                if (var31 >= 1 && var31 < var1 - 1) {
                    int var51 = 0;
                    int var52 = 0;
                    int var53 = 0;
                    int var54 = 0;
                    int var55 = 0;
                    for (int var56 = -5; var56 < var2 + 5; var56++) {
                        int var57 = var56 + 5;
                        if (var57 >= 0 && var57 < var2) {
                            var51 += Statics.field3588[var57];
                            var52 += Statics.field1379[var57];
                            var53 += Statics.field1056[var57];
                            var54 += Statics.field943[var57];
                            var55 += Statics.field1057[var57];
                        }
                        int var58 = var56 - 5;
                        if (var58 >= 0 && var58 < var2) {
                            var51 -= Statics.field3588[var58];
                            var52 -= Statics.field1379[var58];
                            var53 -= Statics.field1056[var58];
                            var54 -= Statics.field943[var58];
                            var55 -= Statics.field1057[var58];
                        }
                        if (var56 >= 1 && var56 < var2 - 1 && (!client.field520 || (var4[0][var31][var56] & 0x2) != 0 || (var4[var11][var31][var56] & 0x10) == 0)) {
                            if (var11 < field1054) {
                                field1054 = var11;
                            }
                            int var59 = (int) class333.method3433(15);
                            int var60 = Statics.field4832[var11][var31][var56] & var59;
                            int var61 = Statics.field4021[var11][var31][var56] & var59;
                            if (var60 > 0 || var61 > 0) {
                                int var62 = var3[var11][var31][var56];
                                int var63 = var3[var11][var31 + 1][var56];
                                int var64 = var3[var11][var31 + 1][var56 + 1];
                                int var65 = var3[var11][var31][var56 + 1];
                                int var66 = Statics.field5172[var31][var56];
                                int var67 = Statics.field5172[var31 + 1][var56];
                                int var68 = Statics.field5172[var31 + 1][var56 + 1];
                                int var69 = Statics.field5172[var31][var56 + 1];
                                int var70 = -1;
                                int var71 = -1;
                                if (var60 > 0) {
                                    int var72 = var51 * 256 / var54;
                                    int var73 = var52 / var55;
                                    int var74 = var53 / var55;
                                    var70 = Statics.method5053(var72, var73, var74);
                                    int var75 = field1055 + var72 & 0xFF;
                                    int var76 = field1065 + var74;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                    var71 = Statics.method5053(var75, var73, var76);
                                }
                                if (var11 > 0) {
                                    boolean var77 = true;
                                    if (var60 == 0 && Statics.field5479[var11][var31][var56] != 0) {
                                        var77 = false;
                                    }
                                    if (var61 > 0) {
                                        int var78 = var61 - 1;
                                        class212 var79 = (class212) class212.field2289.method5733((long) var78);
                                        class212 var80;
                                        if (var79 == null) {
                                            byte[] var81 = Statics.field2290.method6782(4, var78);
                                            class212 var82 = new class212();
                                            if (var81 != null) {
                                                var82.method3933(new class551(var81), var78);
                                            }
                                            var82.method3927();
                                            class212.field2289.method5735(var82, (long) var78);
                                            var80 = var82;
                                        } else {
                                            var80 = var79;
                                        }
                                        if (!var80.field2292) {
                                            var77 = false;
                                        }
                                    }
                                    if (var77 && var62 == var63 && var62 == var64 && var62 == var65) {
                                        Statics.field295[var11][var31][var56] |= 0x924;
                                    }
                                }
                                int var83 = 0;
                                if (var71 != -1) {
                                    var83 = class240.field2587[method6658(var71, 96)];
                                }
                                if (var61 == 0) {
                                    var5.method4512(var11, var31, var56, 0, 0, -1, var62, var63, var64, var65, method6658(var70, var66), method6658(var70, var67), method6658(var70, var68), method6658(var70, var69), 0, 0, 0, 0, var83, 0);
                                } else {
                                    int var84 = Statics.field5479[var11][var31][var56] + 1;
                                    byte var85 = Statics.field1066[var11][var31][var56];
                                    int var86 = var61 - 1;
                                    class212 var87 = (class212) class212.field2289.method5733((long) var86);
                                    class212 var88;
                                    if (var87 == null) {
                                        byte[] var89 = Statics.field2290.method6782(4, var86);
                                        class212 var90 = new class212();
                                        if (var89 != null) {
                                            var90.method3933(new class551(var89), var86);
                                        }
                                        var90.method3927();
                                        class212.field2289.method5735(var90, (long) var86);
                                        var88 = var90;
                                    } else {
                                        var88 = var87;
                                    }
                                    int var92 = var88.field2291;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class240.field2589.field2905.method4753(var92);
                                        var94 = -1;
                                    } else if (var88.field2294 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = -2;
                                    } else {
                                        var94 = Statics.method5053(var88.field2288, var88.field2297, var88.field2296);
                                        int var95 = field1055 + var88.field2288 & 0xFF;
                                        int var96 = field1065 + var88.field2296;
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        var93 = Statics.method5053(var95, var88.field2297, var96);
                                    }
                                    int var97 = 0;
                                    if (var93 != -2) {
                                        var97 = class240.field2587[method3461(var93, 96)];
                                    }
                                    if (var88.field2293 != -1) {
                                        int var98 = field1055 + var88.field2295 & 0xFF;
                                        int var99 = field1065 + var88.field2299;
                                        if (var99 < 0) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        int var100 = Statics.method5053(var98, var88.field2298, var99);
                                        var97 = class240.field2587[method3461(var100, 96)];
                                    }
                                    var5.method4512(var11, var31, var56, var84, var85, var92, var62, var63, var64, var65, method6658(var70, var66), method6658(var70, var67), method6658(var70, var68), method6658(var70, var69), method3461(var94, var66), method3461(var94, var67), method3461(var94, var68), method3461(var94, var69), var83, var97);
                                }
                            }
                        }
                    }
                }
            }
            for (int var101 = 1; var101 < var2 - 1; var101++) {
                for (int var102 = 1; var102 < var1 - 1; var102++) {
                    int var107;
                    if ((arg0.field1360[var11][var102][var101] & 0x8) != 0) {
                        var107 = 0;
                    } else if (var11 <= 0 || (arg0.field1360[1][var102][var101] & 0x2) == 0) {
                        var107 = var11;
                    } else {
                        var107 = var11 - 1;
                    }
                    var5.method4501(var11, var102, var101, var107);
                }
            }
            Statics.field4832[var11] = (short[][]) null;
            Statics.field4021[var11] = (short[][]) null;
            Statics.field5479[var11] = (byte[][]) null;
            Statics.field1066[var11] = (byte[][]) null;
            Statics.field5004[var11] = (byte[][]) null;
        }
        var5.method4528(-50, -10, -50);
        for (int var108 = 0; var108 < var1; var108++) {
            for (int var109 = 0; var109 < var2; var109++) {
                if ((var4[1][var108][var109] & 0x2) == 2) {
                    var5.method4499(var108, var109);
                }
            }
        }
        int var110 = 1;
        int var111 = 2;
        int var112 = 4;
        for (int var113 = 0; var113 < 4; var113++) {
            if (var113 > 0) {
                var110 <<= 0x3;
                var111 <<= 0x3;
                var112 <<= 0x3;
            }
            for (int var114 = 0; var114 <= var113; var114++) {
                for (int var115 = 0; var115 <= var2; var115++) {
                    for (int var116 = 0; var116 <= var1; var116++) {
                        if ((Statics.field295[var114][var116][var115] & var110) != 0) {
                            int var117 = var115;
                            int var118 = var115;
                            int var119 = var114;
                            int var120 = var114;
                            while (var117 > 0 && (Statics.field295[var114][var116][var117 - 1] & var110) != 0) {
                                var117--;
                            }
                            while (var118 < var2 && (Statics.field295[var114][var116][var118 + 1] & var110) != 0) {
                                var118++;
                            }
                            label381: while (var119 > 0) {
                                for (int var121 = var117; var121 <= var118; var121++) {
                                    if ((Statics.field295[var119 - 1][var116][var121] & var110) == 0) {
                                        break label381;
                                    }
                                }
                                var119--;
                            }
                            label370: while (var120 < var113) {
                                for (int var122 = var117; var122 <= var118; var122++) {
                                    if ((Statics.field295[var120 + 1][var116][var122] & var110) == 0) {
                                        break label370;
                                    }
                                }
                                var120++;
                            }
                            int var123 = (var120 + 1 - var119) * (var118 - var117 + 1);
                            if (var123 >= 8) {
                                short var124 = 240;
                                int var125 = var3[var120][var116][var117] - var124;
                                int var126 = var3[var119][var116][var117];
                                var5.method4496(var113, 1, var116 * 128, var116 * 128, var117 * 128, var118 * 128 + 128, var125, var126);
                                for (int var127 = var119; var127 <= var120; var127++) {
                                    for (int var128 = var117; var128 <= var118; var128++) {
                                        Statics.field295[var127][var116][var128] &= ~var110;
                                    }
                                }
                            }
                        }
                        if ((Statics.field295[var114][var116][var115] & var111) != 0) {
                            int var129 = var116;
                            int var130 = var116;
                            int var131 = var114;
                            int var132 = var114;
                            while (var129 > 0 && (Statics.field295[var114][var129 - 1][var115] & var111) != 0) {
                                var129--;
                            }
                            while (var130 < var1 && (Statics.field295[var114][var130 + 1][var115] & var111) != 0) {
                                var130++;
                            }
                            label434: while (var131 > 0) {
                                for (int var133 = var129; var133 <= var130; var133++) {
                                    if ((Statics.field295[var131 - 1][var133][var115] & var111) == 0) {
                                        break label434;
                                    }
                                }
                                var131--;
                            }
                            label423: while (var132 < var113) {
                                for (int var134 = var129; var134 <= var130; var134++) {
                                    if ((Statics.field295[var132 + 1][var134][var115] & var111) == 0) {
                                        break label423;
                                    }
                                }
                                var132++;
                            }
                            int var135 = (var132 + 1 - var131) * (var130 - var129 + 1);
                            if (var135 >= 8) {
                                short var136 = 240;
                                int var137 = var3[var132][var129][var115] - var136;
                                int var138 = var3[var131][var129][var115];
                                var5.method4496(var113, 2, var129 * 128, var130 * 128 + 128, var115 * 128, var115 * 128, var137, var138);
                                for (int var139 = var131; var139 <= var132; var139++) {
                                    for (int var140 = var129; var140 <= var130; var140++) {
                                        Statics.field295[var139][var140][var115] &= ~var111;
                                    }
                                }
                            }
                        }
                        if ((Statics.field295[var114][var116][var115] & var112) != 0) {
                            int var141 = var116;
                            int var142 = var116;
                            int var143 = var115;
                            int var144 = var115;
                            while (var143 > 0 && (Statics.field295[var114][var116][var143 - 1] & var112) != 0) {
                                var143--;
                            }
                            while (var144 < var2 && (Statics.field295[var114][var116][var144 + 1] & var112) != 0) {
                                var144++;
                            }
                            label487: while (var141 > 0) {
                                for (int var145 = var143; var145 <= var144; var145++) {
                                    if ((Statics.field295[var114][var141 - 1][var145] & var112) == 0) {
                                        break label487;
                                    }
                                }
                                var141--;
                            }
                            label476: while (var142 < var1) {
                                for (int var146 = var143; var146 <= var144; var146++) {
                                    if ((Statics.field295[var114][var142 + 1][var146] & var112) == 0) {
                                        break label476;
                                    }
                                }
                                var142++;
                            }
                            if ((var142 - var141 + 1) * (var144 - var143 + 1) >= 4) {
                                int var147 = var3[var114][var141][var143];
                                var5.method4496(var113, 4, var141 * 128, var142 * 128 + 128, var143 * 128, var144 * 128 + 128, var147, var147);
                                for (int var148 = var141; var148 <= var142; var148++) {
                                    for (int var149 = var143; var149 <= var144; var149++) {
                                        Statics.field295[var114][var148][var149] &= ~var112;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.ah(IIII)I")
    public static final int method2869(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method279(var3, var5);
        int var8 = method279(var3 + 1, var5);
        int var9 = method279(var3, var5 + 1);
        int var10 = method279(var3 + 1, var5 + 1);
        int var11 = method6697(var7, var8, var4, arg2);
        int var12 = method6697(var9, var10, var4, arg2);
        return method6697(var11, var12, var6, arg2);
    }

    @ObfuscatedName("om.ap(IIIIB)I")
    public static final int method6697(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class240.field2588[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("as.ab(III)I")
    public static final int method279(int arg0, int arg1) {
        int var2 = method3650(arg0 - 1, arg1 - 1) + method3650(arg0 + 1, arg1 - 1) + method3650(arg0 - 1, arg1 + 1) + method3650(arg0 + 1, arg1 + 1);
        int var3 = method3650(arg0 - 1, arg1) + method3650(arg0 + 1, arg1) + method3650(arg0, arg1 - 1) + method3650(arg0, arg1 + 1);
        int var4 = method3650(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("hb.az(III)I")
    public static final int method3650(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ny.aa(III)I")
    public static final int method6658(int arg0, int arg1) {
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

    @ObfuscatedName("hc.ai(IIB)I")
    public static final int method3461(int arg0, int arg1) {
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

    @ObfuscatedName("fq.as(IIB)Z")
    public static final boolean method3206(int arg0, int arg1) {
        class210 var2 = class210.method5152(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3791(arg1);
    }
}
