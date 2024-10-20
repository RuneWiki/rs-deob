package deob;

@ObfuscatedName("ba")
public final class class65 {

    @ObfuscatedName("ba.x")
    public static int[][][] field550 = new int[4][105][105];

    @ObfuscatedName("ba.m")
    public static byte[][][] field536 = new byte[4][104][104];

    @ObfuscatedName("ba.k")
    public static int field538 = 99;

    @ObfuscatedName("ba.b")
    public static final int[] field545 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("ba.l")
    public static final int[] field543 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("ba.r")
    public static final int[] field542 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("ba.o")
    public static final int[] field548 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("ba.c")
    public static final int[] field547 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("ba.j")
    public static final int[] field553 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("ba.y")
    public static int field551 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("ba.f")
    public static int field549 = (int) (Math.random() * 33.0D) - 16;

    public class65() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fd.x(I)V")
    public static void method3200() {
        field538 = 99;
        Statics.field539 = new byte[4][104][104];
        Statics.field4062 = new byte[4][104][104];
        Statics.field540 = new byte[4][104][104];
        Statics.field541 = new byte[4][104][104];
        Statics.field405 = new int[4][105][105];
        Statics.field1463 = new byte[4][105][105];
        Statics.field546 = new int[105][105];
        Statics.field117 = new int[104];
        Statics.field2006 = new int[104];
        Statics.field3307 = new int[104];
        Statics.field555 = new int[104];
        Statics.field1087 = new int[104];
    }

    @ObfuscatedName("am.m(IIIII)V")
    public static final void method442(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1463[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field550[0][var5][var4] = field550[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field550[0][var5][var4] = field550[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field550[0][var5][var4] = field550[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field550[0][var5][var4] = field550[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.k([BIIII[Lfm;B)V")
    public static final void method245(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class182[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2093[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class310 var9 = new class310(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3442(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ka.d(IIII)V")
    public static final void method4956(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field550[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field550[arg0][arg1][arg2 + var5] = field550[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field550[arg0][arg1 + var6][arg2] = field550[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field550[arg0][arg1 - 1][arg2] != 0) {
            field550[arg0][arg1][arg2] = field550[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field550[arg0][arg1][arg2 - 1] != 0) {
            field550[arg0][arg1][arg2] = field550[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field550[arg0][arg1 - 1][arg2 - 1] != 0) {
            field550[arg0][arg1][arg2] = field550[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("gf.w(Lkb;IIIIIIB)V")
    public static final void method3442(class310 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method5137();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method5137();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method5137();
                }
            }
            return;
        }
        field536[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5137();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field550[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method801(var10 + 45365, var11 + 91923, 4) - 128 + (method801(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method801(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field550[arg1][arg2][arg3] = field550[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method5137();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field550[0][arg2][arg3] = -var15 * 8;
                } else {
                    field550[arg1][arg2][arg3] = field550[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field4062[arg1][arg2][arg3] = arg0.method5138();
                Statics.field540[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field541[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field536[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field539[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("kj.v(IIIIIILej;Lfm;S)V")
    public static final void method5117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class143 arg6, class182 arg7) {
        if (client.field685 && (field536[0][arg1][arg2] & 0x2) == 0 && (field536[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field538) {
            field538 = arg0;
        }
        class264 var8 = class264.method363(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3361;
            var10 = var8.field3360;
        } else {
            var9 = var8.field3360;
            var10 = var8.field3361;
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
        int[][] var15 = field550[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class138.method5881(arg1, arg2, 2, var8.field3364 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3372 == 1) {
            var21 += 256;
        }
        if (var8.method4278()) {
            class85 var22 = new class85();
            var22.field1097 = arg0;
            var22.field1100 = arg1 * 128;
            var22.field1099 = arg2 * 128;
            int var23 = var8.field3360;
            int var24 = var8.field3361;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3361;
                var24 = var8.field3360;
            }
            var22.field1111 = (arg1 + var23) * 128;
            var22.field1101 = (arg2 + var24) * 128;
            var22.field1103 = var8.field3351;
            var22.field1107 = var8.field3389 * 128;
            var22.field1105 = var8.field3391;
            var22.field1106 = var8.field3367;
            var22.field1096 = var8.field3393;
            if (var8.field3386 != null) {
                var22.field1110 = var8;
                var22.method1839();
            }
            class85.field1098.method4580(var22);
            if (var22.field1096 != null) {
                var22.field1108 = var22.field1105 + (int) (Math.random() * (double) (var22.field1106 - var22.field1105));
            }
        }
        if (arg5 == 22) {
            if (!client.field685 || var8.field3364 != 0 || var8.field3362 == 1 || var8.field3383) {
                class145 var25;
                if (var8.field3368 == -1 && var8.field3386 == null) {
                    var25 = var8.method4286(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class103(arg3, 22, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
                }
                arg6.method2912(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3362 == 1 && arg7 != null) {
                    arg7.method3317(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class145 var51;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var51 = var8.method4286(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class103(arg3, 10, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            if (var51 != null && arg6.method2923(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3376) {
                int var52 = 15;
                if (var51 instanceof class137) {
                    var52 = ((class137) var51).method2729() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field1463[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field1463[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3315(arg1, arg2, var9, var10, var8.field3385);
            }
        } else if (arg5 >= 12) {
            class145 var26;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var26 = var8.method4286(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method2923(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field405[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3315(arg1, arg2, var9, var10, var8.field3385);
            }
        } else if (arg5 == 0) {
            class145 var27;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var27 = var8.method4286(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class103(arg3, 0, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3019(arg0, arg1, arg2, var16, var27, (class145) null, field545[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3376) {
                    Statics.field1463[arg0][arg1][arg2] = 50;
                    Statics.field1463[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3344) {
                    Statics.field405[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3376) {
                    Statics.field1463[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1463[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3344) {
                    Statics.field405[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3376) {
                    Statics.field1463[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1463[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3344) {
                    Statics.field405[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3376) {
                    Statics.field1463[arg0][arg1][arg2] = 50;
                    Statics.field1463[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3344) {
                    Statics.field405[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3314(arg1, arg2, arg5, arg4, var8.field3385);
            }
            if (var8.field3394 != 16) {
                arg6.method2946(arg0, arg1, arg2, var8.field3394);
            }
        } else if (arg5 == 1) {
            class145 var28;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var28 = var8.method4286(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class103(arg3, 1, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3019(arg0, arg1, arg2, var16, var28, (class145) null, field543[arg4], 0, var19, var21);
            if (var8.field3376) {
                if (arg4 == 0) {
                    Statics.field1463[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1463[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1463[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1463[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3314(arg1, arg2, arg5, arg4, var8.field3385);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class145 var30;
            class145 var31;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var30 = var8.method4286(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4286(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class103(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
                var31 = new class103(arg3, 2, var29, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3019(arg0, arg1, arg2, var16, var30, var31, field545[arg4], field545[var29], var19, var21);
            if (var8.field3344) {
                if (arg4 == 0) {
                    Statics.field405[arg0][arg1][arg2] |= 0x249;
                    Statics.field405[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field405[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field405[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field405[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field405[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field405[arg0][arg1][arg2] |= 0x492;
                    Statics.field405[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3314(arg1, arg2, arg5, arg4, var8.field3385);
            }
            if (var8.field3394 != 16) {
                arg6.method2946(arg0, arg1, arg2, var8.field3394);
            }
        } else if (arg5 == 3) {
            class145 var32;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var32 = var8.method4286(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class103(arg3, 3, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3019(arg0, arg1, arg2, var16, var32, (class145) null, field543[arg4], 0, var19, var21);
            if (var8.field3376) {
                if (arg4 == 0) {
                    Statics.field1463[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1463[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1463[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1463[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3314(arg1, arg2, arg5, arg4, var8.field3385);
            }
        } else if (arg5 == 9) {
            class145 var33;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var33 = var8.method4286(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method2923(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3315(arg1, arg2, var9, var10, var8.field3385);
            }
            if (var8.field3394 != 16) {
                arg6.method2946(arg0, arg1, arg2, var8.field3394);
            }
        } else if (arg5 == 4) {
            class145 var34;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var34 = var8.method4286(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3035(arg0, arg1, arg2, var16, var34, (class145) null, field545[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2939(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class264.method363(class138.method351(var36)).field3394;
            }
            class145 var38;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var38 = var8.method4286(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3035(arg0, arg1, arg2, var16, var38, (class145) null, field545[arg4], 0, field542[arg4] * var35, field548[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2939(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class264.method363(class138.method351(var40)).field3394 / 2;
            }
            class145 var42;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var42 = var8.method4286(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3035(arg0, arg1, arg2, var16, var42, (class145) null, 256, arg4, field547[arg4] * var39, field553[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class145 var44;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var44 = var8.method4286(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class103(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3035(arg0, arg1, arg2, var16, var44, (class145) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2939(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class264.method363(class138.method351(var46)).field3394 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class145 var49;
            class145 var50;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var49 = var8.method4286(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4286(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
                var50 = new class103(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3368, true, (class145) null);
            }
            arg6.method3035(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field547[arg4] * var45, field553[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("o.q(Lej;[Lfm;I)V")
    public static final void method218(class143 arg0, class182[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field536[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field536[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3316(var3, var4);
                        }
                    }
                }
            }
        }
        field551 += (int) (Math.random() * 5.0D) - 2;
        if (field551 < -8) {
            field551 = -8;
        }
        if (field551 > 8) {
            field551 = 8;
        }
        field549 += (int) (Math.random() * 5.0D) - 2;
        if (field549 < -16) {
            field549 = -16;
        }
        if (field549 > 16) {
            field549 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1463[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field550[var6][var11 + 1][var10] - field550[var6][var11 - 1][var10];
                    int var13 = field550[var6][var11][var10 + 1] - field550[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field546[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field117[var20] = 0;
                Statics.field2006[var20] = 0;
                Statics.field3307[var20] = 0;
                Statics.field555[var20] = 0;
                Statics.field1087[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field539[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class255 var25 = class255.method839(var24 - 1);
                            Statics.field117[var22] += var25.field3256;
                            Statics.field2006[var22] += var25.field3257;
                            Statics.field3307[var22] += var25.field3253;
                            Statics.field555[var22] += var25.field3254;
                            var10002 = Statics.field1087[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field539[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class255 var28 = class255.method839(var27 - 1);
                            Statics.field117[var22] -= var28.field3256;
                            Statics.field2006[var22] -= var28.field3257;
                            Statics.field3307[var22] -= var28.field3253;
                            Statics.field555[var22] -= var28.field3254;
                            var10002 = Statics.field1087[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var29 = 0;
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = 0;
                    for (int var34 = -5; var34 < 109; var34++) {
                        int var35 = var34 + 5;
                        if (var35 >= 0 && var35 < 104) {
                            var29 += Statics.field117[var35];
                            var30 += Statics.field2006[var35];
                            var31 += Statics.field3307[var35];
                            var32 += Statics.field555[var35];
                            var33 += Statics.field1087[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field117[var36];
                            var30 -= Statics.field2006[var36];
                            var31 -= Statics.field3307[var36];
                            var32 -= Statics.field555[var36];
                            var33 -= Statics.field1087[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field685 || (field536[0][var21][var34] & 0x2) != 0 || (field536[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field538) {
                                field538 = var6;
                            }
                            int var37 = Statics.field539[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field4062[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field550[var6][var21][var34];
                                int var40 = field550[var6][var21 + 1][var34];
                                int var41 = field550[var6][var21 + 1][var34 + 1];
                                int var42 = field550[var6][var21][var34 + 1];
                                int var43 = Statics.field546[var21][var34];
                                int var44 = Statics.field546[var21 + 1][var34];
                                int var45 = Statics.field546[var21 + 1][var34 + 1];
                                int var46 = Statics.field546[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method791(var49, var50, var51);
                                    int var52 = field551 + var49 & 0xFF;
                                    int var53 = field549 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method791(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field540[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class268.method3193(var38 - 1).field3502) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field405[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class140.field1791[method3849(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2918(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method3849(var47, var43), method3849(var47, var44), method3849(var47, var45), method3849(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field540[var6][var21][var34] + 1;
                                    byte var57 = Statics.field541[var6][var21][var34];
                                    class268 var58 = class268.method3193(var38 - 1);
                                    int var59 = var58.field3510;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1782.method2591(var59);
                                        var61 = -1;
                                    } else if (var58.field3498 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method791(var58.field3503, var58.field3504, var58.field3506);
                                        int var62 = field551 + var58.field3503 & 0xFF;
                                        int var63 = field549 + var58.field3506;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method791(var62, var58.field3504, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class140.field1791[Statics.method4903(var60, 96)];
                                    }
                                    if (var58.field3509 != -1) {
                                        int var65 = field551 + var58.field3507 & 0xFF;
                                        int var66 = field549 + var58.field3501;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method791(var65, var58.field3508, var66);
                                        var64 = class140.field1791[Statics.method4903(var67, 96)];
                                    }
                                    arg0.method2918(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method3849(var47, var43), method3849(var47, var44), method3849(var47, var45), method3849(var47, var46), Statics.method4903(var61, var43), Statics.method4903(var61, var44), Statics.method4903(var61, var45), Statics.method4903(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field536[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field536[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2917(var6, var69, var68, var74);
                }
            }
            Statics.field539[var6] = (byte[][]) null;
            Statics.field4062[var6] = (byte[][]) null;
            Statics.field540[var6] = (byte[][]) null;
            Statics.field541[var6] = (byte[][]) null;
            Statics.field1463[var6] = (byte[][]) null;
        }
        arg0.method2998(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field536[1][var75][var76] & 0x2) == 2) {
                    arg0.method2915(var75, var76);
                }
            }
        }
        int var77 = 1;
        int var78 = 2;
        int var79 = 4;
        for (int var80 = 0; var80 < 4; var80++) {
            if (var80 > 0) {
                var77 <<= 0x3;
                var78 <<= 0x3;
                var79 <<= 0x3;
            }
            for (int var81 = 0; var81 <= var80; var81++) {
                for (int var82 = 0; var82 <= 104; var82++) {
                    for (int var83 = 0; var83 <= 104; var83++) {
                        if ((Statics.field405[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field405[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field405[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field405[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field405[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field550[var87][var83][var84] - var91;
                                int var93 = field550[var86][var83][var84];
                                class143.method3013(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field405[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field405[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field405[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field405[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field405[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field405[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field550[var99][var96][var82] - var103;
                                int var105 = field550[var98][var96][var82];
                                class143.method3013(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field405[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field405[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field405[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field405[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field405[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field405[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field550[var81][var108][var110];
                                class143.method3013(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field405[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bu.z(IIIS)I")
    public static final int method801(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3847(var3, var5);
        int var8 = method3847(var3 + 1, var5);
        int var9 = method3847(var3, var5 + 1);
        int var10 = method3847(var3 + 1, var5 + 1);
        int var11 = method3375(var7, var8, var4, arg2);
        int var12 = method3375(var9, var10, var4, arg2);
        return method3375(var11, var12, var6, arg2);
    }

    @ObfuscatedName("gm.t(IIIIB)I")
    public static final int method3375(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class140.field1796[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("hv.e(III)I")
    public static final int method3847(int arg0, int arg1) {
        int var2 = Statics.method47(arg0 - 1, arg1 - 1) + Statics.method47(arg0 + 1, arg1 - 1) + Statics.method47(arg0 - 1, arg1 + 1) + Statics.method47(arg0 + 1, arg1 + 1);
        int var3 = Statics.method47(arg0 - 1, arg1) + Statics.method47(arg0 + 1, arg1) + Statics.method47(arg0, arg1 - 1) + Statics.method47(arg0, arg1 + 1);
        int var4 = Statics.method47(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("hx.p(III)I")
    public static final int method3849(int arg0, int arg1) {
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

    @ObfuscatedName("bd.u(IIII)I")
    public static final int method791(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("fe.h(IIB)Z")
    public static final boolean method3278(int arg0, int arg1) {
        class264 var2 = class264.method363(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4269(arg1);
    }
}
