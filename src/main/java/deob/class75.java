package deob;

@ObfuscatedName("bk")
public final class class75 {

    @ObfuscatedName("bk.c")
    public static int[][][] field972 = new int[4][105][105];

    @ObfuscatedName("bk.b")
    public static byte[][][] field962 = new byte[4][104][104];

    @ObfuscatedName("bk.p")
    public static int field973 = 99;

    @ObfuscatedName("bk.k")
    public static final int[] field970 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bk.f")
    public static final int[] field971 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bk.l")
    public static final int[] field977 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bk.q")
    public static final int[] field967 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bk.x")
    public static final int[] field974 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bk.z")
    public static final int[] field975 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bk.i")
    public static int field976 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bk.y")
    public static int field961 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.c(I)V")
    public static void method2548() {
        field973 = 99;
        Statics.field964 = new byte[4][104][104];
        Statics.field968 = new byte[4][104][104];
        Statics.field965 = new byte[4][104][104];
        Statics.field2581 = new byte[4][104][104];
        Statics.field1505 = new int[4][105][105];
        Statics.field322 = new byte[4][105][105];
        Statics.field2281 = new int[105][105];
        Statics.field966 = new int[104];
        Statics.field4105 = new int[104];
        Statics.field978 = new int[104];
        Statics.field1326 = new int[104];
        Statics.field1875 = new int[104];
    }

    @ObfuscatedName("dq.b(I)V")
    public static void method2551() {
        Statics.field964 = (byte[][][]) null;
        Statics.field968 = (byte[][][]) null;
        Statics.field965 = (byte[][][]) null;
        Statics.field2581 = (byte[][][]) null;
        Statics.field1505 = (int[][][]) null;
        Statics.field322 = (byte[][][]) null;
        Statics.field2281 = (int[][]) null;
        Statics.field966 = null;
        Statics.field4105 = null;
        Statics.field978 = null;
        Statics.field1326 = null;
        Statics.field1875 = null;
    }

    @ObfuscatedName("de.p(IIIII)V")
    public static final void method2449(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field322[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field972[0][var5][var4] = field972[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field972[0][var5][var4] = field972[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field972[0][var5][var4] = field972[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field972[0][var5][var4] = field972[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.m([BIIII[Lgf;I)V")
    public static final void method111(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class184[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2107[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class419 var9 = new class419(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1046(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("bb.t(IIII)V")
    public static final void method1872(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field972[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field972[arg0][arg1][arg2 + var5] = field972[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field972[arg0][arg1 + var6][arg2] = field972[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field972[arg0][arg1 - 1][arg2] != 0) {
            field972[arg0][arg1][arg2] = field972[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field972[arg0][arg1][arg2 - 1] != 0) {
            field972[arg0][arg1][arg2] = field972[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field972[arg0][arg1 - 1][arg2 - 1] != 0) {
            field972[arg0][arg1][arg2] = field972[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bg.s(Lpi;IIIIIII)V")
    public static final void method1046(class419 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method6781();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method6781();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method6781();
                }
            }
            return;
        }
        field962[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method6781();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field972[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method4592(var10 + 45365, var11 + 91923, 4) - 128 + (method4592(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method4592(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field972[arg1][arg2][arg3] = field972[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method6781();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field972[0][arg2][arg3] = -var15 * 8;
                } else {
                    field972[arg1][arg2][arg3] = field972[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field968[arg1][arg2][arg3] = arg0.method6846();
                Statics.field965[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2581[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field962[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field964[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ei.j(IIIIIILgy;Lgf;B)V")
    public static final void method2742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class197 arg6, class184 arg7) {
        if (client.field473 && (field962[0][arg1][arg2] & 0x2) == 0 && (field962[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field973) {
            field973 = arg0;
        }
        class180 var8 = class180.method2760(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field1968;
            var10 = var8.field1967;
        } else {
            var9 = var8.field1967;
            var10 = var8.field1968;
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
        int[][] var15 = field972[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class205.method1932(arg1, arg2, 2, var8.field1956 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2002 == 1) {
            var21 += 256;
        }
        if (var8.method3189()) {
            class63 var22 = new class63();
            var22.field789 = arg0;
            var22.field793 = arg1 * 128;
            var22.field791 = arg2 * 128;
            int var23 = var8.field1967;
            int var24 = var8.field1968;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field1968;
                var24 = var8.field1967;
            }
            var22.field803 = (arg1 + var23) * 128;
            var22.field795 = (arg2 + var24) * 128;
            var22.field800 = var8.field1996;
            var22.field794 = var8.field1997 * 128;
            var22.field797 = var8.field1989;
            var22.field798 = var8.field1999;
            var22.field799 = var8.field2000;
            if (var8.field1981 != null) {
                var22.field792 = var8;
                var22.method1708();
            }
            class63.field802.method5296(var22);
            if (var22.field799 != null) {
                var22.field790 = var22.field797 + (int) (Math.random() * (double) (var22.field798 - var22.field797));
            }
        }
        if (arg5 == 22) {
            if (!client.field473 || var8.field1956 != 0 || var8.field1973 == 1 || var8.field1990) {
                class198 var25;
                if (var8.field1964 == -1 && var8.field1981 == null) {
                    var25 = var8.method3186(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
                }
                arg6.method3640(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field1973 == 1 && arg7 != null) {
                    arg7.method3387(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class198 var51;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var51 = var8.method3186(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            if (var51 != null && arg6.method3644(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field1983) {
                int var52 = 15;
                if (var51 instanceof class204) {
                    var52 = ((class204) var51).method3900() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field322[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field322[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field1973 != 0 && arg7 != null) {
                arg7.method3382(arg1, arg2, var9, var10, var8.field1987);
            }
        } else if (arg5 >= 12) {
            class198 var26;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var26 = var8.method3186(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3644(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1505[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field1973 != 0 && arg7 != null) {
                arg7.method3382(arg1, arg2, var9, var10, var8.field1987);
            }
        } else if (arg5 == 0) {
            class198 var27;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var27 = var8.method3186(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3687(arg0, arg1, arg2, var16, var27, (class198) null, field970[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field1983) {
                    Statics.field322[arg0][arg1][arg2] = 50;
                    Statics.field322[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field1974) {
                    Statics.field1505[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field1983) {
                    Statics.field322[arg0][arg1][arg2 + 1] = 50;
                    Statics.field322[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1974) {
                    Statics.field1505[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field1983) {
                    Statics.field322[arg0][arg1 + 1][arg2] = 50;
                    Statics.field322[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1974) {
                    Statics.field1505[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field1983) {
                    Statics.field322[arg0][arg1][arg2] = 50;
                    Statics.field322[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field1974) {
                    Statics.field1505[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field1973 != 0 && arg7 != null) {
                arg7.method3412(arg1, arg2, arg5, arg4, var8.field1987);
            }
            if (var8.field1976 != 16) {
                arg6.method3650(arg0, arg1, arg2, var8.field1976);
            }
        } else if (arg5 == 1) {
            class198 var28;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var28 = var8.method3186(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3687(arg0, arg1, arg2, var16, var28, (class198) null, field971[arg4], 0, var19, var21);
            if (var8.field1983) {
                if (arg4 == 0) {
                    Statics.field322[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field322[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field322[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field322[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1973 != 0 && arg7 != null) {
                arg7.method3412(arg1, arg2, arg5, arg4, var8.field1987);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class198 var30;
            class198 var31;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var30 = var8.method3186(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method3186(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
                var31 = new class73(arg3, 2, var29, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3687(arg0, arg1, arg2, var16, var30, var31, field970[arg4], field970[var29], var19, var21);
            if (var8.field1974) {
                if (arg4 == 0) {
                    Statics.field1505[arg0][arg1][arg2] |= 0x249;
                    Statics.field1505[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1505[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1505[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1505[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1505[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1505[arg0][arg1][arg2] |= 0x492;
                    Statics.field1505[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field1973 != 0 && arg7 != null) {
                arg7.method3412(arg1, arg2, arg5, arg4, var8.field1987);
            }
            if (var8.field1976 != 16) {
                arg6.method3650(arg0, arg1, arg2, var8.field1976);
            }
        } else if (arg5 == 3) {
            class198 var32;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var32 = var8.method3186(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3687(arg0, arg1, arg2, var16, var32, (class198) null, field971[arg4], 0, var19, var21);
            if (var8.field1983) {
                if (arg4 == 0) {
                    Statics.field322[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field322[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field322[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field322[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1973 != 0 && arg7 != null) {
                arg7.method3412(arg1, arg2, arg5, arg4, var8.field1987);
            }
        } else if (arg5 == 9) {
            class198 var33;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var33 = var8.method3186(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3644(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field1973 != 0 && arg7 != null) {
                arg7.method3382(arg1, arg2, var9, var10, var8.field1987);
            }
            if (var8.field1976 != 16) {
                arg6.method3650(arg0, arg1, arg2, var8.field1976);
            }
        } else if (arg5 == 4) {
            class198 var34;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var34 = var8.method3186(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3766(arg0, arg1, arg2, var16, var34, (class198) null, field970[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method3746(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class180.method2760(class205.method2352(var36)).field1976;
            }
            class198 var38;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var38 = var8.method3186(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3766(arg0, arg1, arg2, var16, var38, (class198) null, field970[arg4], 0, field977[arg4] * var35, field967[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method3746(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class180.method2760(class205.method2352(var40)).field1976 / 2;
            }
            class198 var42;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var42 = var8.method3186(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3766(arg0, arg1, arg2, var16, var42, (class198) null, 256, arg4, field974[arg4] * var39, field975[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class198 var44;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var44 = var8.method3186(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class73(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3766(arg0, arg1, arg2, var16, var44, (class198) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method3746(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class180.method2760(class205.method2352(var46)).field1976 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class198 var49;
            class198 var50;
            if (var8.field1964 == -1 && var8.field1981 == null) {
                var49 = var8.method3186(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method3186(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
                var50 = new class73(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field1964, var8.field2001, (class198) null);
            }
            arg6.method3766(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field974[arg4] * var45, field975[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("bx.w(IIII)I")
    public static int method1906(int arg0, int arg1, int arg2) {
        if ((field962[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field962[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("jd.n(IIII)I")
    public static final int method4592(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2710(var3, var5);
        int var8 = method2710(var3 + 1, var5);
        int var9 = method2710(var3, var5 + 1);
        int var10 = method2710(var3 + 1, var5 + 1);
        int var11 = method2618(var7, var8, var4, arg2);
        int var12 = method2618(var9, var10, var4, arg2);
        return method2618(var11, var12, var6, arg2);
    }

    @ObfuscatedName("et.r(IIIIB)I")
    public static final int method2618(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class194.field2271[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("em.o(III)I")
    public static final int method2710(int arg0, int arg1) {
        int var2 = method359(arg0 - 1, arg1 - 1) + method359(arg0 + 1, arg1 - 1) + method359(arg0 - 1, arg1 + 1) + method359(arg0 + 1, arg1 + 1);
        int var3 = method359(arg0 - 1, arg1) + method359(arg0 + 1, arg1) + method359(arg0, arg1 - 1) + method359(arg0, arg1 + 1);
        int var4 = method359(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("z.v(IIB)I")
    public static final int method359(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bx.d(III)I")
    public static final int method1908(int arg0, int arg1) {
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

    @ObfuscatedName("cg.h(III)I")
    public static final int method2121(int arg0, int arg1) {
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

    @ObfuscatedName("il.g(IIIS)I")
    public static final int method4572(int arg0, int arg1, int arg2) {
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
}
