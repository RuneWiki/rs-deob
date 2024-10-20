package deob;

@ObfuscatedName("j")
public final class class6 {

    @ObfuscatedName("j.k")
    public static int[][][] field87 = new int[4][105][105];

    @ObfuscatedName("j.q")
    public static byte[][][] field81 = new byte[4][104][104];

    @ObfuscatedName("j.f")
    public static int field78 = 99;

    @ObfuscatedName("j.r")
    public static final int[] field84 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.a")
    public static final int[] field85 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.n")
    public static final int[] field86 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.z")
    public static final int[] field80 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.x")
    public static final int[] field96 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.d")
    public static final int[] field89 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.t")
    public static int field90 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.o")
    public static int field91 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.k(IIIII)V")
    public static final void method93(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1156[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field87[0][var5][var4] = field87[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field87[0][var5][var4] = field87[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field87[0][var5][var4] = field87[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field87[0][var5][var4] = field87[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.q(Lde;IIIIIII)V")
    public static final void method164(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2427();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2427();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2427();
                }
            }
            return;
        }
        field81[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2427();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field87[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2807(var10 + 45365, var11 + 91923, 4) - 128 + (method2807(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2807(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field87[arg1][arg2][arg3] = field87[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2427();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field87[0][arg2][arg3] = -var15 * 8;
                } else {
                    field87[arg1][arg2][arg3] = field87[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field76[arg1][arg2][arg3] = arg0.method2428();
                Statics.field3170[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field200[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field81[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field79[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("al.f([BIII)Z")
    public static final boolean method637(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class123 var4 = new class123(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2410();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2410();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2427() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class43 var16 = class43.method91(var5);
                        if (var13 != 22 || !client.field283 || var16.field983 != 0 || var16.field953 == 1 || var16.field974) {
                            if (!var16.method805()) {
                                client.field515++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2410();
                if (var9 == 0) {
                    break;
                }
                var4.method2427();
            }
        }
    }

    @ObfuscatedName("dn.c([BIILcp;[Lda;B)V")
    public static final void method2348(byte[] arg0, int arg1, int arg2, class90 arg3, class112[] arg4) {
        class123 var5 = new class123(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2410();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2410();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2427();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field81[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class112 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method719(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dr.v([BIIIIIIILcp;[Lda;I)V")
    public static final void method2365(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class90 arg8, class112[] arg9) {
        class123 var10 = new class123(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2410();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2410();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2427();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class43 var21 = class43.method91(var11);
                    int var22 = arg2 + class181.method2369(var16 & 0x7, var15 & 0x7, arg7, var21.field951, var21.field949, var20);
                    int var23 = arg3 + class181.method582(var16 & 0x7, var15 & 0x7, arg7, var21.field951, var21.field949, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field81[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class112 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method719(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.j(IIIIIILcp;Lda;B)V")
    public static final void method719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field283 && (field81[0][arg1][arg2] & 0x2) == 0 && (field81[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field78) {
            field78 = arg0;
        }
        class43 var8 = class43.method91(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field949;
            var10 = var8.field951;
        } else {
            var9 = var8.field951;
            var10 = var8.field949;
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
        int[][] var15 = field87[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field983 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field941 == 1) {
            var20 += 256;
        }
        if (var8.method811()) {
            class25.method109(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field283 || var8.field983 != 0 || var8.field953 == 1 || var8.field974) {
                class89 var21;
                if (var8.field965 == -1 && var8.field977 == null) {
                    var21 = var8.method841(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
                }
                arg6.method1846(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field953 == 1 && arg7 != null) {
                    arg7.method2314(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var44;
            if (var8.field965 == -1 && var8.field977 == null) {
                var44 = var8.method841(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            if (var44 != null && arg6.method1850(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field972) {
                int var45 = 15;
                if (var44 instanceof class109) {
                    var45 = ((class109) var44).method2282() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field1156[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field1156[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2311(arg1, arg2, var9, var10, var8.field954);
            }
        } else if (arg5 >= 12) {
            class89 var22;
            if (var8.field965 == -1 && var8.field977 == null) {
                var22 = var8.method841(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1850(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field83[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2311(arg1, arg2, var9, var10, var8.field954);
            }
        } else if (arg5 == 0) {
            class89 var23;
            if (var8.field965 == -1 && var8.field977 == null) {
                var23 = var8.method841(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1841(arg0, arg1, arg2, var16, var23, (class89) null, field84[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field972) {
                    Statics.field1156[arg0][arg1][arg2] = 50;
                    Statics.field1156[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field952) {
                    Statics.field83[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field972) {
                    Statics.field1156[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1156[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field952) {
                    Statics.field83[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field972) {
                    Statics.field1156[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1156[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field952) {
                    Statics.field83[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field972) {
                    Statics.field1156[arg0][arg1][arg2] = 50;
                    Statics.field1156[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field952) {
                    Statics.field83[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2310(arg1, arg2, arg5, arg4, var8.field954);
            }
            if (var8.field960 != 16) {
                arg6.method1856(arg0, arg1, arg2, var8.field960);
            }
        } else if (arg5 == 1) {
            class89 var24;
            if (var8.field965 == -1 && var8.field977 == null) {
                var24 = var8.method841(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1841(arg0, arg1, arg2, var16, var24, (class89) null, field85[arg4], 0, var19, var20);
            if (var8.field972) {
                if (arg4 == 0) {
                    Statics.field1156[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1156[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1156[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1156[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2310(arg1, arg2, arg5, arg4, var8.field954);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class89 var26;
            class89 var27;
            if (var8.field965 == -1 && var8.field977 == null) {
                var26 = var8.method841(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method841(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field965, true, (class89) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1841(arg0, arg1, arg2, var16, var26, var27, field84[arg4], field84[var25], var19, var20);
            if (var8.field952) {
                if (arg4 == 0) {
                    Statics.field83[arg0][arg1][arg2] |= 0x249;
                    Statics.field83[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field83[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field83[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field83[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field83[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field83[arg0][arg1][arg2] |= 0x492;
                    Statics.field83[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2310(arg1, arg2, arg5, arg4, var8.field954);
            }
            if (var8.field960 != 16) {
                arg6.method1856(arg0, arg1, arg2, var8.field960);
            }
        } else if (arg5 == 3) {
            class89 var28;
            if (var8.field965 == -1 && var8.field977 == null) {
                var28 = var8.method841(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1841(arg0, arg1, arg2, var16, var28, (class89) null, field85[arg4], 0, var19, var20);
            if (var8.field972) {
                if (arg4 == 0) {
                    Statics.field1156[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1156[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1156[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1156[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2310(arg1, arg2, arg5, arg4, var8.field954);
            }
        } else if (arg5 == 9) {
            class89 var29;
            if (var8.field965 == -1 && var8.field977 == null) {
                var29 = var8.method841(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1850(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2311(arg1, arg2, var9, var10, var8.field954);
            }
            if (var8.field960 != 16) {
                arg6.method1856(arg0, arg1, arg2, var8.field960);
            }
        } else if (arg5 == 4) {
            class89 var30;
            if (var8.field965 == -1 && var8.field977 == null) {
                var30 = var8.method841(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1849(arg0, arg1, arg2, var16, var30, (class89) null, field84[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1865(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class43.method91(var32 >> 14 & 0x7FFF).field960;
            }
            class89 var33;
            if (var8.field965 == -1 && var8.field977 == null) {
                var33 = var8.method841(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1849(arg0, arg1, arg2, var16, var33, (class89) null, field84[arg4], 0, field86[arg4] * var31, field80[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1865(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method91(var35 >> 14 & 0x7FFF).field960 / 2;
            }
            class89 var36;
            if (var8.field965 == -1 && var8.field977 == null) {
                var36 = var8.method841(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1849(arg0, arg1, arg2, var16, var36, (class89) null, 256, arg4, field96[arg4] * var34, field89[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class89 var38;
            if (var8.field965 == -1 && var8.field977 == null) {
                var38 = var8.method841(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1849(arg0, arg1, arg2, var16, var38, (class89) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1865(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class43.method91(var40 >> 14 & 0x7FFF).field960 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class89 var42;
            class89 var43;
            if (var8.field965 == -1 && var8.field977 == null) {
                var42 = var8.method841(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method841(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field965, true, (class89) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field965, true, (class89) null);
            }
            arg6.method1849(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field96[arg4] * var39, field89[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ao.m(Lcp;[Lda;I)V")
    public static final void method760(class90 arg0, class112[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field81[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field81[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2312(var3, var4);
                        }
                    }
                }
            }
        }
        field90 += (int) (Math.random() * 5.0D) - 2;
        if (field90 < -8) {
            field90 = -8;
        }
        if (field90 > 8) {
            field90 = 8;
        }
        field91 += (int) (Math.random() * 5.0D) - 2;
        if (field91 < -16) {
            field91 = -16;
        }
        if (field91 > 16) {
            field91 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1156[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field87[var6][var11 + 1][var10] - field87[var6][var11 - 1][var10];
                    int var13 = field87[var6][var11][var10 + 1] - field87[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field3279[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field92[var20] = 0;
                Statics.field2123[var20] = 0;
                Statics.field88[var20] = 0;
                Statics.field131[var20] = 0;
                Statics.field2295[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field79[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class44 var26 = (class44) class44.field988.method3535((long) var25);
                            class44 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field1000.method3097(1, var25);
                                class44 var29 = new class44();
                                if (var28 != null) {
                                    var29.method847(new class123(var28), var25);
                                }
                                var29.method850();
                                class44.field988.method3537(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field92[var22] += var27.field990;
                            Statics.field2123[var22] += var27.field996;
                            Statics.field88[var22] += var27.field991;
                            Statics.field131[var22] += var27.field999;
                            var10002 = Statics.field2295[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field79[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class44 var34 = (class44) class44.field988.method3535((long) var33);
                            class44 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field1000.method3097(1, var33);
                                class44 var37 = new class44();
                                if (var36 != null) {
                                    var37.method847(new class123(var36), var33);
                                }
                                var37.method850();
                                class44.field988.method3537(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field92[var22] -= var35.field990;
                            Statics.field2123[var22] -= var35.field996;
                            Statics.field88[var22] -= var35.field991;
                            Statics.field131[var22] -= var35.field999;
                            var10002 = Statics.field2295[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    for (int var44 = -5; var44 < 109; var44++) {
                        int var45 = var44 + 5;
                        if (var45 >= 0 && var45 < 104) {
                            var39 += Statics.field92[var45];
                            var40 += Statics.field2123[var45];
                            var41 += Statics.field88[var45];
                            var42 += Statics.field131[var45];
                            var43 += Statics.field2295[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field92[var46];
                            var40 -= Statics.field2123[var46];
                            var41 -= Statics.field88[var46];
                            var42 -= Statics.field131[var46];
                            var43 -= Statics.field2295[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field283 || (field81[0][var21][var44] & 0x2) != 0 || (field81[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field78) {
                                field78 = var6;
                            }
                            int var47 = Statics.field79[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field76[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field87[var6][var21][var44];
                                int var50 = field87[var6][var21 + 1][var44];
                                int var51 = field87[var6][var21 + 1][var44 + 1];
                                int var52 = field87[var6][var21][var44 + 1];
                                int var53 = Statics.field3279[var21][var44];
                                int var54 = Statics.field3279[var21 + 1][var44];
                                int var55 = Statics.field3279[var21 + 1][var44 + 1];
                                int var56 = Statics.field3279[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method137(var59, var60, var61);
                                    int var62 = field90 + var59 & 0xFF;
                                    int var63 = field91 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method137(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field3170[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class49.method2949(var48 - 1).field1076) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field83[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class95.field1647[method795(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1845(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method795(var57, var53), method795(var57, var54), method795(var57, var55), method795(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field3170[var6][var21][var44] + 1;
                                    byte var67 = Statics.field200[var6][var21][var44];
                                    class49 var68 = class49.method2949(var48 - 1);
                                    int var69 = var68.field1074;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1648.method2104(var69);
                                        var71 = -1;
                                    } else if (var68.field1083 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method137(var68.field1078, var68.field1079, var68.field1080);
                                        int var72 = field90 + var68.field1078 & 0xFF;
                                        int var73 = field91 + var68.field1080;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method137(var72, var68.field1079, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class95.field1647[method2028(var70, 96)];
                                    }
                                    if (var68.field1075 != -1) {
                                        int var75 = field90 + var68.field1073 & 0xFF;
                                        int var76 = field91 + var68.field1081;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method137(var75, var68.field1082, var76);
                                        var74 = class95.field1647[method2028(var77, 96)];
                                    }
                                    arg0.method1845(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method795(var57, var53), method795(var57, var54), method795(var57, var55), method795(var57, var56), method2028(var71, var53), method2028(var71, var54), method2028(var71, var55), method2028(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field81[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field81[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method1844(var6, var79, var78, var84);
                }
            }
            Statics.field79[var6] = (byte[][]) null;
            Statics.field76[var6] = (byte[][]) null;
            Statics.field3170[var6] = (byte[][]) null;
            Statics.field200[var6] = (byte[][]) null;
            Statics.field1156[var6] = (byte[][]) null;
        }
        arg0.method1988(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field81[1][var85][var86] & 0x2) == 2) {
                    arg0.method1951(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field83[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field83[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field83[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field83[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field83[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field87[var97][var93][var94] - var101;
                                int var103 = field87[var96][var93][var94];
                                class90.method1843(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field83[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field83[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field83[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field83[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field83[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field83[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field87[var109][var106][var92] - var113;
                                int var115 = field87[var108][var106][var92];
                                class90.method1843(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field83[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field83[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field83[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field83[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field83[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field83[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field87[var91][var118][var120];
                                class90.method1843(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field83[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ey.y(IIII)I")
    public static final int method2807(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method859(var3, var5);
        int var8 = method859(var3 + 1, var5);
        int var9 = method859(var3, var5 + 1);
        int var10 = method859(var3 + 1, var5 + 1);
        int var11 = method981(var7, var8, var4, arg2);
        int var12 = method981(var9, var10, var4, arg2);
        return method981(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ah.u(IIIII)I")
    public static final int method981(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class95.field1652[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("af.h(III)I")
    public static final int method859(int arg0, int arg1) {
        int var2 = method604(arg0 - 1, arg1 - 1) + method604(arg0 + 1, arg1 - 1) + method604(arg0 - 1, arg1 + 1) + method604(arg0 + 1, arg1 + 1);
        int var3 = method604(arg0 - 1, arg1) + method604(arg0 + 1, arg1) + method604(arg0, arg1 - 1) + method604(arg0, arg1 + 1);
        int var4 = method604(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("aq.l(III)I")
    public static final int method604(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("aw.b(IIS)I")
    public static final int method795(int arg0, int arg1) {
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

    @ObfuscatedName("cd.g(III)I")
    public static final int method2028(int arg0, int arg1) {
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

    @ObfuscatedName("g.e(IIIB)I")
    public static final int method137(int arg0, int arg1, int arg2) {
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
