package deob;

@ObfuscatedName("bo")
public final class class75 {

    @ObfuscatedName("bo.c")
    public static int[][][] field1005 = new int[4][105][105];

    @ObfuscatedName("bo.l")
    public static byte[][][] field994 = new byte[4][104][104];

    @ObfuscatedName("bo.s")
    public static int field995 = 99;

    @ObfuscatedName("bo.d")
    public static final int[] field1000 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bo.j")
    public static final int[] field1001 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bo.f")
    public static final int[] field1002 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bo.g")
    public static final int[] field1003 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bo.t")
    public static final int[] field1004 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bo.k")
    public static final int[] field1006 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bo.b")
    public static int field998 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bo.z")
    public static int field996 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.c(B)V")
    public static void method2351() {
        field995 = 99;
        Statics.field993 = new byte[4][104][104];
        Statics.field997 = new byte[4][104][104];
        Statics.field1007 = new byte[4][104][104];
        Statics.field999 = new byte[4][104][104];
        Statics.field1034 = new int[4][105][105];
        Statics.field3079 = new byte[4][105][105];
        Statics.field107 = new int[105][105];
        Statics.field29 = new int[104];
        Statics.field2125 = new int[104];
        Statics.field3201 = new int[104];
        Statics.field3 = new int[104];
        Statics.field1790 = new int[104];
    }

    @ObfuscatedName("dz.l(I)V")
    public static void method2401() {
        Statics.field993 = (byte[][][]) null;
        Statics.field997 = (byte[][][]) null;
        Statics.field1007 = (byte[][][]) null;
        Statics.field999 = (byte[][][]) null;
        Statics.field1034 = (int[][][]) null;
        Statics.field3079 = (byte[][][]) null;
        Statics.field107 = (int[][]) null;
        Statics.field29 = null;
        Statics.field2125 = null;
        Statics.field3201 = null;
        Statics.field3 = null;
        Statics.field1790 = null;
    }

    @ObfuscatedName("w.s(IIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3079[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1005[0][var5][var4] = field1005[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1005[0][var5][var4] = field1005[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1005[0][var5][var4] = field1005[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1005[0][var5][var4] = field1005[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("jv.e([BIIII[Lgi;I)V")
    public static final void method4802(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class184[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2112[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class421 var9 = new class421(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2369(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("gv.r([BIIIIIII[Lgi;I)V")
    public static final void method3933(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class184[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2112[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class421 var11 = new class421(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class283.method2731(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
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
                        method2369(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method2369(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.o(IIII)V")
    public static final void method366(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1005[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1005[arg0][arg1][arg2 + var5] = field1005[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1005[arg0][arg1 + var6][arg2] = field1005[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1005[arg0][arg1 - 1][arg2] != 0) {
            field1005[arg0][arg1][arg2] = field1005[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1005[arg0][arg1][arg2 - 1] != 0) {
            field1005[arg0][arg1][arg2] = field1005[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1005[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1005[arg0][arg1][arg2] = field1005[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("df.i(Lpi;IIIIIII)V")
    public static final void method2369(class421 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method6686();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method6686();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method6686();
                }
            }
            return;
        }
        field994[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method6686();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field1005[0][arg2][arg3] = -method4934(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field1005[arg1][arg2][arg3] = field1005[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method6686();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field1005[0][arg2][arg3] = -var8 * 8;
                } else {
                    field1005[arg1][arg2][arg3] = field1005[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field997[arg1][arg2][arg3] = arg0.method6664();
                Statics.field1007[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field999[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field994[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field993[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bw.w([BIII)Z")
    public static final boolean method1596(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class421 var4 = new class421(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method6680();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method6679();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method6686() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class180 var16 = class180.method3056(var5);
                        if (var13 != 22 || !client.field500 || var16.field1984 != 0 || var16.field1996 == 1 || var16.field2008) {
                            if (!var16.method3191()) {
                                client.field560++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method6679();
                if (var9 == 0) {
                    break;
                }
                var4.method6686();
            }
        }
    }

    @ObfuscatedName("ch.v([BIILgn;[Lgi;I)V")
    public static final void method1982(byte[] arg0, int arg1, int arg2, class197 arg3, class184[] arg4) {
        class421 var5 = new class421(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method6680();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method6679();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method6686();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field994[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class184 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method4350(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bo.a([BIIIIIIILgn;[Lgi;)V")
    public static final void method1930(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class197 arg8, class184[] arg9) {
        class421 var10 = new class421(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method6680();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method6679();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method6686();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class180 var21 = class180.method3056(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field1995;
                    int var27 = var21.field1985;
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
                    int var32 = arg3 + class283.method4515(var16 & 0x7, var15 & 0x7, arg7, var21.field1995, var21.field1985, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field994[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class184 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method4350(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ho.y(IIIIIILgn;Lgi;B)V")
    public static final void method4350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class197 arg6, class184 arg7) {
        if (client.field500 && (field994[0][arg1][arg2] & 0x2) == 0 && (field994[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field995) {
            field995 = arg0;
        }
        class180 var8 = class180.method3056(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field1985;
            var10 = var8.field1995;
        } else {
            var9 = var8.field1995;
            var10 = var8.field1985;
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
        int[][] var15 = field1005[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class205.method1993(arg1, arg2, 2, var8.field1984 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field1988 == 1) {
            var21 += 256;
        }
        if (var8.method3162()) {
            class63.method3140(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field500 || var8.field1984 != 0 || var8.field1996 == 1 || var8.field2008) {
                class198 var22;
                if (var8.field1969 == -1 && var8.field2010 == null) {
                    var22 = var8.method3147(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
                }
                arg6.method3666(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field1996 == 1 && arg7 != null) {
                    arg7.method3351(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class198 var48;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var48 = var8.method3147(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            if (var48 != null && arg6.method3703(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field1979) {
                int var49 = 15;
                if (var48 instanceof class204) {
                    var49 = ((class204) var48).method3809() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field3079[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field3079[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field1996 != 0 && arg7 != null) {
                arg7.method3333(arg1, arg2, var9, var10, var8.field1983);
            }
        } else if (arg5 >= 12) {
            class198 var23;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var23 = var8.method3147(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3703(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1034[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field1996 != 0 && arg7 != null) {
                arg7.method3333(arg1, arg2, var9, var10, var8.field1983);
            }
        } else if (arg5 == 0) {
            class198 var24;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var24 = var8.method3147(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3632(arg0, arg1, arg2, var16, var24, (class198) null, field1000[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field1979) {
                    Statics.field3079[arg0][arg1][arg2] = 50;
                    Statics.field3079[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field1991) {
                    Statics.field1034[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field1979) {
                    Statics.field3079[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3079[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1991) {
                    Statics.field1034[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field1979) {
                    Statics.field3079[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3079[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1991) {
                    Statics.field1034[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field1979) {
                    Statics.field3079[arg0][arg1][arg2] = 50;
                    Statics.field3079[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field1991) {
                    Statics.field1034[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field1996 != 0 && arg7 != null) {
                arg7.method3335(arg1, arg2, arg5, arg4, var8.field1983);
            }
            if (var8.field1986 != 16) {
                arg6.method3588(arg0, arg1, arg2, var8.field1986);
            }
        } else if (arg5 == 1) {
            class198 var25;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var25 = var8.method3147(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3632(arg0, arg1, arg2, var16, var25, (class198) null, field1001[arg4], 0, var19, var21);
            if (var8.field1979) {
                if (arg4 == 0) {
                    Statics.field3079[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3079[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3079[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3079[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1996 != 0 && arg7 != null) {
                arg7.method3335(arg1, arg2, arg5, arg4, var8.field1983);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class198 var27;
            class198 var28;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var27 = var8.method3147(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3147(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
                var28 = new class73(arg3, 2, var26, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3632(arg0, arg1, arg2, var16, var27, var28, field1000[arg4], field1000[var26], var19, var21);
            if (var8.field1991) {
                if (arg4 == 0) {
                    Statics.field1034[arg0][arg1][arg2] |= 0x249;
                    Statics.field1034[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1034[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1034[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1034[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1034[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1034[arg0][arg1][arg2] |= 0x492;
                    Statics.field1034[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field1996 != 0 && arg7 != null) {
                arg7.method3335(arg1, arg2, arg5, arg4, var8.field1983);
            }
            if (var8.field1986 != 16) {
                arg6.method3588(arg0, arg1, arg2, var8.field1986);
            }
        } else if (arg5 == 3) {
            class198 var29;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var29 = var8.method3147(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3632(arg0, arg1, arg2, var16, var29, (class198) null, field1001[arg4], 0, var19, var21);
            if (var8.field1979) {
                if (arg4 == 0) {
                    Statics.field3079[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3079[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3079[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3079[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1996 != 0 && arg7 != null) {
                arg7.method3335(arg1, arg2, arg5, arg4, var8.field1983);
            }
        } else if (arg5 == 9) {
            class198 var30;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var30 = var8.method3147(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3703(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field1996 != 0 && arg7 != null) {
                arg7.method3333(arg1, arg2, var9, var10, var8.field1983);
            }
            if (var8.field1986 != 16) {
                arg6.method3588(arg0, arg1, arg2, var8.field1986);
            }
        } else if (arg5 == 4) {
            class198 var31;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var31 = var8.method3147(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3581(arg0, arg1, arg2, var16, var31, (class198) null, field1000[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3598(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class180.method3056(class205.method3561(var33)).field1986;
            }
            class198 var35;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var35 = var8.method3147(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3581(arg0, arg1, arg2, var16, var35, (class198) null, field1000[arg4], 0, field1002[arg4] * var32, field1003[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3598(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class180.method3056(class205.method3561(var37)).field1986 / 2;
            }
            class198 var39;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var39 = var8.method3147(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3581(arg0, arg1, arg2, var16, var39, (class198) null, 256, arg4, field1004[arg4] * var36, field1006[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class198 var41;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var41 = var8.method3147(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class73(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3581(arg0, arg1, arg2, var16, var41, (class198) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3598(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class180.method3056(class205.method3561(var43)).field1986 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class198 var46;
            class198 var47;
            if (var8.field1969 == -1 && var8.field2010 == null) {
                var46 = var8.method3147(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3147(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
                var47 = new class73(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field1969, var8.field2018, (class198) null);
            }
            arg6.method3581(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1004[arg4] * var42, field1006[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("kn.h(IIII)I")
    public static int method4945(int arg0, int arg1, int arg2) {
        if ((field994[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field994[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ka.q(III)I")
    public static final int method4934(int arg0, int arg1) {
        int var2 = method99(arg0 + 45365, arg1 + 91923, 4) - 128 + (method99(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method99(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("y.x(IIIB)I")
    public static final int method99(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2521(var3, var5);
        int var8 = method2521(var3 + 1, var5);
        int var9 = method2521(var3, var5 + 1);
        int var10 = method2521(var3 + 1, var5 + 1);
        int var11 = method4147(var7, var8, var4, arg2);
        int var12 = method4147(var9, var10, var4, arg2);
        return method4147(var11, var12, var6, arg2);
    }

    @ObfuscatedName("hw.p(IIIII)I")
    public static final int method4147(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class194.field2280[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("do.n(III)I")
    public static final int method2521(int arg0, int arg1) {
        int var2 = method5675(arg0 - 1, arg1 - 1) + method5675(arg0 + 1, arg1 - 1) + method5675(arg0 - 1, arg1 + 1) + method5675(arg0 + 1, arg1 + 1);
        int var3 = method5675(arg0 - 1, arg1) + method5675(arg0 + 1, arg1) + method5675(arg0, arg1 - 1) + method5675(arg0, arg1 + 1);
        int var4 = method5675(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("me.m(IIB)I")
    public static final int method5675(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("fn.d(IIB)I")
    public static final int method3255(int arg0, int arg1) {
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

    @ObfuscatedName("fb.f(IIIB)I")
    public static final int method2914(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("hf.g(III)Z")
    public static final boolean method4308(int arg0, int arg1) {
        class180 var2 = class180.method3056(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3159(arg1);
    }
}
