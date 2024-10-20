package deob;

@ObfuscatedName("q")
public final class class3 {

    @ObfuscatedName("q.t")
    public static int[][][] field22 = new int[4][105][105];

    @ObfuscatedName("q.n")
    public static byte[][][] field18 = new byte[4][104][104];

    @ObfuscatedName("q.q")
    public static int field26 = 99;

    @ObfuscatedName("q.x")
    public static final int[] field29 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("q.z")
    public static final int[] field31 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("q.o")
    public static final int[] field32 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("q.c")
    public static final int[] field36 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("q.y")
    public static final int[] field34 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("q.j")
    public static final int[] field35 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("q.s")
    public static int field17 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("q.p")
    public static int field37 = (int) (Math.random() * 33.0D) - 16;

    public class3() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.t(IIIIB)V")
    public static final void method868(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field16[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field22[0][var5][var4] = field22[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field22[0][var5][var4] = field22[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field22[0][var5][var4] = field22[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field22[0][var5][var4] = field22[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.n([BIIII[Lcf;B)V")
    public static final void method694(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class94[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1264[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class135 var9 = new class135(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.method366(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("au.q(IIIB)V")
    public static final void method437(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field22[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field22[arg0][arg1][arg2 + var5] = field22[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field22[arg0][arg1 + var6][arg2] = field22[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field22[arg0][arg1 - 1][arg2] != 0) {
            field22[arg0][arg1][arg2] = field22[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field22[arg0][arg1][arg2 - 1] != 0) {
            field22[arg0][arg1][arg2] = field22[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field22[arg0][arg1 - 1][arg2 - 1] != 0) {
            field22[arg0][arg1][arg2] = field22[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("t.k([BIII)Z")
    public static final boolean method7(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class135 var4 = new class135(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method1603();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method1603();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method1571() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class153 var16 = Statics.method1460(var5);
                        if (var13 != 22 || !client.field1912 || var16.field2340 != 0 || var16.field2317 == 1 || var16.field2327) {
                            if (!var16.method2348()) {
                                client.field1949++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method1603();
                if (var9 == 0) {
                    break;
                }
                var4.method1571();
            }
        }
    }

    @ObfuscatedName("q.r([BIILal;[Lcf;I)V")
    public static final void method46(byte[] arg0, int arg1, int arg2, class44 arg3, class94[] arg4) {
        class135 var5 = new class135(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method1603();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method1603();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method1571();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field18[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class94 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method369(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ey.l([BIIIIIIILal;[Lcf;I)V")
    public static final void method1556(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8, class94[] arg9) {
        class135 var10 = new class135(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method1603();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method1603();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method1571();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class153 var21 = Statics.method1460(var11);
                    int var22 = arg2 + class90.method397(var16 & 0x7, var15 & 0x7, arg7, var21.field2315, var21.field2312, var20);
                    int var23 = arg3 + Statics.method781(var16 & 0x7, var15 & 0x7, arg7, var21.field2315, var21.field2312, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field18[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class94 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method369(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.i(IIIIIILal;Lcf;I)V")
    public static final void method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class44 arg6, class94 arg7) {
        if (client.field1912 && (field18[0][arg1][arg2] & 0x2) == 0) {
            if ((field18[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method880(arg0, arg1, arg2) != client.field2174) {
                return;
            }
        }
        if (arg0 < field26) {
            field26 = arg0;
        }
        class153 var8 = Statics.method1460(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2312;
            var10 = var8.field2315;
        } else {
            var9 = var8.field2315;
            var10 = var8.field2312;
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
        int[][] var15 = field22[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2340 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2341 == 1) {
            var20 += 256;
        }
        if (var8.method2356()) {
            class124.method547(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field1912 || var8.field2340 != 0 || var8.field2317 == 1 || var8.field2327) {
                class165 var21;
                if (var8.field2323 == -1 && var8.field2301 == null) {
                    var21 = var8.method2343(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class175(arg3, 22, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
                }
                arg6.method555(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field2317 == 1 && arg7 != null) {
                    arg7.method1191(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class165 var44;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var44 = var8.method2343(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class175(arg3, 10, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            if (var44 != null && arg6.method559(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2331) {
                int var45 = 15;
                if (var44 instanceof class180) {
                    var45 = ((class180) var44).method2973() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field16[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field16[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field2317 != 0 && arg7 != null) {
                arg7.method1158(arg1, arg2, var9, var10, var8.field2318);
            }
        } else if (arg5 >= 12) {
            class165 var22;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var22 = var8.method2343(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class175(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method559(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field30[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2317 != 0 && arg7 != null) {
                arg7.method1158(arg1, arg2, var9, var10, var8.field2318);
            }
        } else if (arg5 == 0) {
            class165 var23;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var23 = var8.method2343(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class175(arg3, 0, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method593(arg0, arg1, arg2, var16, var23, (class165) null, field29[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2331) {
                    Statics.field16[arg0][arg1][arg2] = 50;
                    Statics.field16[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2322) {
                    Statics.field30[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2331) {
                    Statics.field16[arg0][arg1][arg2 + 1] = 50;
                    Statics.field16[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2322) {
                    Statics.field30[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2331) {
                    Statics.field16[arg0][arg1 + 1][arg2] = 50;
                    Statics.field16[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2322) {
                    Statics.field30[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2331) {
                    Statics.field16[arg0][arg1][arg2] = 50;
                    Statics.field16[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2322) {
                    Statics.field30[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2317 != 0 && arg7 != null) {
                arg7.method1157(arg1, arg2, arg5, arg4, var8.field2318);
            }
            if (var8.field2324 != 16) {
                arg6.method565(arg0, arg1, arg2, var8.field2324);
            }
        } else if (arg5 == 1) {
            class165 var24;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var24 = var8.method2343(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class175(arg3, 1, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method593(arg0, arg1, arg2, var16, var24, (class165) null, field31[arg4], 0, var19, var20);
            if (var8.field2331) {
                if (arg4 == 0) {
                    Statics.field16[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field16[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field16[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field16[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2317 != 0 && arg7 != null) {
                arg7.method1157(arg1, arg2, arg5, arg4, var8.field2318);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class165 var26;
            class165 var27;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var26 = var8.method2343(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method2343(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class175(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
                var27 = new class175(arg3, 2, var25, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method593(arg0, arg1, arg2, var16, var26, var27, field29[arg4], field29[var25], var19, var20);
            if (var8.field2322) {
                if (arg4 == 0) {
                    Statics.field30[arg0][arg1][arg2] |= 0x249;
                    Statics.field30[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field30[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field30[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field30[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field30[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field30[arg0][arg1][arg2] |= 0x492;
                    Statics.field30[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2317 != 0 && arg7 != null) {
                arg7.method1157(arg1, arg2, arg5, arg4, var8.field2318);
            }
            if (var8.field2324 != 16) {
                arg6.method565(arg0, arg1, arg2, var8.field2324);
            }
        } else if (arg5 == 3) {
            class165 var28;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var28 = var8.method2343(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class175(arg3, 3, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method593(arg0, arg1, arg2, var16, var28, (class165) null, field31[arg4], 0, var19, var20);
            if (var8.field2331) {
                if (arg4 == 0) {
                    Statics.field16[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field16[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field16[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field16[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2317 != 0 && arg7 != null) {
                arg7.method1157(arg1, arg2, arg5, arg4, var8.field2318);
            }
        } else if (arg5 == 9) {
            class165 var29;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var29 = var8.method2343(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class175(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method559(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field2317 != 0 && arg7 != null) {
                arg7.method1158(arg1, arg2, var9, var10, var8.field2318);
            }
            if (var8.field2324 != 16) {
                arg6.method565(arg0, arg1, arg2, var8.field2324);
            }
        } else if (arg5 == 4) {
            class165 var30;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var30 = var8.method2343(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class175(arg3, 4, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method658(arg0, arg1, arg2, var16, var30, (class165) null, field29[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method575(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = Statics.method1460(var32 >> 14 & 0x7FFF).field2324;
            }
            class165 var33;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var33 = var8.method2343(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class175(arg3, 4, arg4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method658(arg0, arg1, arg2, var16, var33, (class165) null, field29[arg4], 0, field32[arg4] * var31, field36[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method575(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = Statics.method1460(var35 >> 14 & 0x7FFF).field2324 / 2;
            }
            class165 var36;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var36 = var8.method2343(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class175(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method658(arg0, arg1, arg2, var16, var36, (class165) null, 256, arg4, field34[arg4] * var34, field35[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class165 var38;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var38 = var8.method2343(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class175(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method658(arg0, arg1, arg2, var16, var38, (class165) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method575(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = Statics.method1460(var40 >> 14 & 0x7FFF).field2324 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class165 var42;
            class165 var43;
            if (var8.field2323 == -1 && var8.field2301 == null) {
                var42 = var8.method2343(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method2343(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class175(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
                var43 = new class175(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field2323, true, (class165) null);
            }
            arg6.method658(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field34[arg4] * var39, field35[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("aa.e(Lal;[Lcf;I)V")
    public static final void method525(class44 arg0, class94[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field18[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field18[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method1159(var3, var4);
                        }
                    }
                }
            }
        }
        field17 += (int) (Math.random() * 5.0D) - 2;
        if (field17 < -8) {
            field17 = -8;
        }
        if (field17 > 8) {
            field17 = 8;
        }
        field37 += (int) (Math.random() * 5.0D) - 2;
        if (field37 < -16) {
            field37 = -16;
        }
        if (field37 > 16) {
            field37 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field16[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field22[var6][var11 + 1][var10] - field22[var6][var11 - 1][var10];
                    int var13 = field22[var6][var11][var10 + 1] - field22[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1216[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field33[var20] = 0;
                Statics.field686[var20] = 0;
                Statics.field24[var20] = 0;
                Statics.field2487[var20] = 0;
                Statics.field25[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field19[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class154 var26 = (class154) class154.field2351.method1231((long) var25);
                            class154 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field2350.method1015(1, var25);
                                class154 var29 = new class154();
                                if (var28 != null) {
                                    var29.method2377(new class135(var28), var25);
                                }
                                var29.method2372();
                                class154.field2351.method1232(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field33[var22] += var27.field2353;
                            Statics.field686[var22] += var27.field2354;
                            Statics.field24[var22] += var27.field2355;
                            Statics.field2487[var22] += var27.field2356;
                            var10002 = Statics.field25[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field19[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class154 var34 = (class154) class154.field2351.method1231((long) var33);
                            class154 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field2350.method1015(1, var33);
                                class154 var37 = new class154();
                                if (var36 != null) {
                                    var37.method2377(new class135(var36), var33);
                                }
                                var37.method2372();
                                class154.field2351.method1232(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field33[var22] -= var35.field2353;
                            Statics.field686[var22] -= var35.field2354;
                            Statics.field24[var22] -= var35.field2355;
                            Statics.field2487[var22] -= var35.field2356;
                            var10002 = Statics.field25[var22]--;
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
                            var39 += Statics.field33[var45];
                            var40 += Statics.field686[var45];
                            var41 += Statics.field24[var45];
                            var42 += Statics.field2487[var45];
                            var43 += Statics.field25[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field33[var46];
                            var40 -= Statics.field686[var46];
                            var41 -= Statics.field24[var46];
                            var42 -= Statics.field2487[var46];
                            var43 -= Statics.field25[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field1912 || (field18[0][var21][var44] & 0x2) != 0 || (field18[var6][var21][var44] & 0x10) == 0 && method880(var6, var21, var44) == client.field2174)) {
                            if (var6 < field26) {
                                field26 = var6;
                            }
                            int var47 = Statics.field19[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field20[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field22[var6][var21][var44];
                                int var50 = field22[var6][var21 + 1][var44];
                                int var51 = field22[var6][var21 + 1][var44 + 1];
                                int var52 = field22[var6][var21][var44 + 1];
                                int var53 = Statics.field1216[var21][var44];
                                int var54 = Statics.field1216[var21 + 1][var44];
                                int var55 = Statics.field1216[var21 + 1][var44 + 1];
                                int var56 = Statics.field1216[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method160(var59, var60, var61);
                                    int var62 = field17 + var59 & 0xFF;
                                    int var63 = field37 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method160(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field21[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class158 var66 = (class158) class158.field2399.method1231((long) var65);
                                        class158 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field1098.method1015(4, var65);
                                            class158 var69 = new class158();
                                            if (var68 != null) {
                                                var69.method2460(new class135(var68), var65);
                                            }
                                            var69.method2459();
                                            class158.field2399.method1232(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field2402) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field30[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class172.field2539[method1103(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method554(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1103(var57, var53), method1103(var57, var54), method1103(var57, var55), method1103(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field21[var6][var21][var44] + 1;
                                    byte var72 = Statics.field39[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class158 var74 = (class158) class158.field2399.method1231((long) var73);
                                    class158 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field1098.method1015(4, var73);
                                        class158 var77 = new class158();
                                        if (var76 != null) {
                                            var77.method2460(new class135(var76), var73);
                                        }
                                        var77.method2459();
                                        class158.field2399.method1232(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field2401;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field2540.method703(var79);
                                        var81 = -1;
                                    } else if (var75.field2400 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method160(var75.field2408, var75.field2405, var75.field2406);
                                        int var82 = field17 + var75.field2408 & 0xFF;
                                        int var83 = field37 + var75.field2406;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method160(var82, var75.field2405, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class172.field2539[method493(var80, 96)];
                                    }
                                    if (var75.field2403 != -1) {
                                        int var85 = field17 + var75.field2407 & 0xFF;
                                        int var86 = field37 + var75.field2409;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method160(var85, var75.field2404, var86);
                                        var84 = class172.field2539[method493(var87, 96)];
                                    }
                                    arg0.method554(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method1103(var57, var53), method1103(var57, var54), method1103(var57, var55), method1103(var57, var56), method493(var81, var53), method493(var81, var54), method493(var81, var55), method493(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method553(var6, var89, var88, method880(var6, var89, var88));
                }
            }
            Statics.field19[var6] = (byte[][]) null;
            Statics.field20[var6] = (byte[][]) null;
            Statics.field21[var6] = (byte[][]) null;
            Statics.field39[var6] = (byte[][]) null;
            Statics.field16[var6] = (byte[][]) null;
        }
        arg0.method579(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field18[1][var90][var91] & 0x2) == 2) {
                    arg0.method647(var90, var91);
                }
            }
        }
        int var92 = 1;
        int var93 = 2;
        int var94 = 4;
        for (int var95 = 0; var95 < 4; var95++) {
            if (var95 > 0) {
                var92 <<= 0x3;
                var93 <<= 0x3;
                var94 <<= 0x3;
            }
            for (int var96 = 0; var96 <= var95; var96++) {
                for (int var97 = 0; var97 <= 104; var97++) {
                    for (int var98 = 0; var98 <= 104; var98++) {
                        if ((Statics.field30[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field30[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field30[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label375: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field30[var101 - 1][var98][var103] & var92) == 0) {
                                        break label375;
                                    }
                                }
                                var101--;
                            }
                            label364: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field30[var102 + 1][var98][var104] & var92) == 0) {
                                        break label364;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field22[var102][var98][var99] - var106;
                                int var108 = field22[var101][var98][var99];
                                class44.method552(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field30[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field30[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field30[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field30[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label428: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field30[var113 - 1][var115][var97] & var93) == 0) {
                                        break label428;
                                    }
                                }
                                var113--;
                            }
                            label417: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field30[var114 + 1][var116][var97] & var93) == 0) {
                                        break label417;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field22[var114][var111][var97] - var118;
                                int var120 = field22[var113][var111][var97];
                                class44.method552(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field30[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field30[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field30[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field30[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label481: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field30[var96][var123 - 1][var127] & var94) == 0) {
                                        break label481;
                                    }
                                }
                                var123--;
                            }
                            label470: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field30[var96][var124 + 1][var128] & var94) == 0) {
                                        break label470;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field22[var96][var123][var125];
                                class44.method552(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field30[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.a(IIIB)I")
    public static int method880(int arg0, int arg1, int arg2) {
        if ((field18[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field18[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cs.g(IIII)I")
    public static final int method1115(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1205(var3, var5);
        int var8 = method1205(var3 + 1, var5);
        int var9 = method1205(var3, var5 + 1);
        int var10 = method1205(var3 + 1, var5 + 1);
        int var11 = 65536 - class172.field2544[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class172.field2544[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class172.field2544[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ch.w(III)I")
    public static final int method1205(int arg0, int arg1) {
        int var2 = method543(arg0 - 1, arg1 - 1) + method543(arg0 + 1, arg1 - 1) + method543(arg0 - 1, arg1 + 1) + method543(arg0 + 1, arg1 + 1);
        int var3 = method543(arg0 - 1, arg1) + method543(arg0 + 1, arg1) + method543(arg0, arg1 - 1) + method543(arg0, arg1 + 1);
        int var4 = method543(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("av.v(III)I")
    public static final int method543(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cv.u(III)I")
    public static final int method1103(int arg0, int arg1) {
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

    @ObfuscatedName("at.m(III)I")
    public static final int method493(int arg0, int arg1) {
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

    @ObfuscatedName("u.b(IIIB)I")
    public static final int method160(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("da.f(IIIIIIILal;Lcf;S)V")
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class44 arg7, class94 arg8) {
        class153 var9 = Statics.method1460(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2312;
            var11 = var9.field2315;
        } else {
            var10 = var9.field2315;
            var11 = var9.field2312;
        }
        int var12;
        int var13;
        if (arg2 + var10 <= 104) {
            var12 = (var10 >> 1) + arg2;
            var13 = (var10 + 1 >> 1) + arg2;
        } else {
            var12 = arg2;
            var13 = arg2 + 1;
        }
        int var14;
        int var15;
        if (arg3 + var11 <= 104) {
            var14 = (var11 >> 1) + arg3;
            var15 = (var11 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int[][] var16 = field22[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field2340 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field2341 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class165 var22;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var22 = var9.method2344(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class175(arg4, 22, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method555(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field2317 == 1) {
                arg8.method1191(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class165 var45;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var45 = var9.method2344(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class175(arg4, 10, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            if (var45 != null) {
                arg7.method559(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field2317 != 0) {
                arg8.method1158(arg2, arg3, var10, var11, var9.field2318);
            }
        } else if (arg6 >= 12) {
            class165 var23;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var23 = var9.method2344(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class175(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method559(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field2317 != 0) {
                arg8.method1158(arg2, arg3, var10, var11, var9.field2318);
            }
        } else if (arg6 == 0) {
            class165 var24;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var24 = var9.method2344(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class175(arg4, 0, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method593(arg0, arg2, arg3, var17, var24, (class165) null, field29[arg5], 0, var20, var21);
            if (var9.field2317 != 0) {
                arg8.method1157(arg2, arg3, arg6, arg5, var9.field2318);
            }
        } else if (arg6 == 1) {
            class165 var25;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var25 = var9.method2344(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class175(arg4, 1, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method593(arg0, arg2, arg3, var17, var25, (class165) null, field31[arg5], 0, var20, var21);
            if (var9.field2317 != 0) {
                arg8.method1157(arg2, arg3, arg6, arg5, var9.field2318);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class165 var27;
            class165 var28;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var27 = var9.method2344(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method2344(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class175(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2323, true, (class165) null);
                var28 = new class175(arg4, 2, var26, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method593(arg0, arg2, arg3, var17, var27, var28, field29[arg5], field29[var26], var20, var21);
            if (var9.field2317 != 0) {
                arg8.method1157(arg2, arg3, arg6, arg5, var9.field2318);
            }
        } else if (arg6 == 3) {
            class165 var29;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var29 = var9.method2344(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class175(arg4, 3, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method593(arg0, arg2, arg3, var17, var29, (class165) null, field31[arg5], 0, var20, var21);
            if (var9.field2317 != 0) {
                arg8.method1157(arg2, arg3, arg6, arg5, var9.field2318);
            }
        } else if (arg6 == 9) {
            class165 var30;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var30 = var9.method2344(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class175(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method559(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2317 != 0) {
                arg8.method1158(arg2, arg3, var10, var11, var9.field2318);
            }
        } else if (arg6 == 4) {
            class165 var31;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var31 = var9.method2344(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class175(arg4, 4, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method658(arg0, arg2, arg3, var17, var31, (class165) null, field29[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method575(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = Statics.method1460(var33 >> 14 & 0x7FFF).field2324;
            }
            class165 var34;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var34 = var9.method2344(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class175(arg4, 4, arg5, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method658(arg0, arg2, arg3, var17, var34, (class165) null, field29[arg5], 0, field32[arg5] * var32, field36[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method575(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = Statics.method1460(var36 >> 14 & 0x7FFF).field2324 / 2;
            }
            class165 var37;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var37 = var9.method2344(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class175(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method658(arg0, arg2, arg3, var17, var37, (class165) null, 256, arg5, field34[arg5] * var35, field35[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class165 var39;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var39 = var9.method2344(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class175(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method658(arg0, arg2, arg3, var17, var39, (class165) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method575(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = Statics.method1460(var41 >> 14 & 0x7FFF).field2324 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class165 var43;
            class165 var44;
            if (var9.field2323 == -1 && var9.field2301 == null) {
                var43 = var9.method2344(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method2344(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class175(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2323, true, (class165) null);
                var44 = new class175(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field2323, true, (class165) null);
            }
            arg7.method658(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field34[arg5] * var40, field35[arg5] * var40, var20, var21);
        }
    }
}
