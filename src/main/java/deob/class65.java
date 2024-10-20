package deob;

@ObfuscatedName("bi")
public final class class65 {

    @ObfuscatedName("bi.h")
    public static int[][][] field520 = new int[4][105][105];

    @ObfuscatedName("bi.v")
    public static byte[][][] field508 = new byte[4][104][104];

    @ObfuscatedName("bi.x")
    public static int field507 = 99;

    @ObfuscatedName("bi.y")
    public static final int[] field513 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bi.r")
    public static final int[] field514 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bi.q")
    public static final int[] field519 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bi.g")
    public static final int[] field516 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bi.s")
    public static final int[] field510 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bi.o")
    public static final int[] field518 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bi.k")
    public static int field517 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bi.d")
    public static int field511 = (int) (Math.random() * 33.0D) - 16;

    public class65() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hv.h(B)V")
    public static void method3634() {
        field507 = 99;
        Statics.field515 = new byte[4][104][104];
        Statics.field509 = new byte[4][104][104];
        Statics.field41 = new byte[4][104][104];
        Statics.field3664 = new byte[4][104][104];
        Statics.field53 = new int[4][105][105];
        Statics.field512 = new byte[4][105][105];
        Statics.field1174 = new int[105][105];
        Statics.field3326 = new int[104];
        Statics.field3182 = new int[104];
        Statics.field1173 = new int[104];
        Statics.field1999 = new int[104];
        Statics.field1284 = new int[104];
    }

    @ObfuscatedName("aa.v(IIIII)V")
    public static final void method536(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field512[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field520[0][var5][var4] = field520[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field520[0][var5][var4] = field520[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field520[0][var5][var4] = field520[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field520[0][var5][var4] = field520[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bu.x([BIIII[Lfo;B)V")
    public static final void method1131(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class182[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2108[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class311 var9 = new class311(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3646(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ak.w([BIIIIIII[Lfo;B)V")
    public static final void method323(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class182[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2108[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class311 var11 = new class311(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class226.method705(var13 & 0x7, var14 & 0x7, arg7);
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
                        method3646(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method3646(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.t(IIII)V")
    public static final void method2182(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field520[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field520[arg0][arg1][arg2 + var5] = field520[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field520[arg0][arg1 + var6][arg2] = field520[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field520[arg0][arg1 - 1][arg2] != 0) {
            field520[arg0][arg1][arg2] = field520[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field520[arg0][arg1][arg2 - 1] != 0) {
            field520[arg0][arg1][arg2] = field520[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field520[arg0][arg1 - 1][arg2 - 1] != 0) {
            field520[arg0][arg1][arg2] = field520[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("hu.j(Lkj;IIIIIII)V")
    public static final void method3646(class311 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5274();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5274();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5274();
                }
            }
            return;
        }
        field508[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5274();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field520[0][arg2][arg3] = -method2352(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field520[arg1][arg2][arg3] = field520[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5274();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field520[0][arg2][arg3] = -var8 * 8;
                } else {
                    field520[arg1][arg2][arg3] = field520[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field509[arg1][arg2][arg3] = arg0.method5148();
                Statics.field41[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3664[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field508[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field515[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fq.n([BIILeo;[Lfo;I)V")
    public static final void method3255(byte[] arg0, int arg1, int arg2, class143 arg3, class182[] arg4) {
        class311 var5 = new class311(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method5130();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method5096();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method5274();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field508[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class182 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method73(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("p.p(IIIIIILeo;Lfo;B)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class143 arg6, class182 arg7) {
        if (client.field911 && (field508[0][arg1][arg2] & 0x2) == 0 && (field508[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field507) {
            field507 = arg0;
        }
        class265 var8 = class265.method325(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3397;
            var10 = var8.field3419;
        } else {
            var9 = var8.field3419;
            var10 = var8.field3397;
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
        int[][] var15 = field520[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class138.method1957(arg1, arg2, 2, var8.field3424 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3418 == 1) {
            var21 += 256;
        }
        if (var8.method4255()) {
            class85 var22 = new class85();
            var22.field1075 = arg0;
            var22.field1080 = arg1 * 128;
            var22.field1077 = arg2 * 128;
            int var23 = var8.field3419;
            int var24 = var8.field3397;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3397;
                var24 = var8.field3419;
            }
            var22.field1074 = (arg1 + var23) * 128;
            var22.field1079 = (arg2 + var24) * 128;
            var22.field1081 = var8.field3425;
            var22.field1087 = var8.field3409 * 128;
            var22.field1086 = var8.field3427;
            var22.field1084 = var8.field3389;
            var22.field1085 = var8.field3429;
            if (var8.field3422 != null) {
                var22.field1088 = var8;
                var22.method1839();
            }
            class85.field1076.method4549(var22);
            if (var22.field1085 != null) {
                var22.field1082 = var22.field1086 + (int) (Math.random() * (double) (var22.field1084 - var22.field1086));
            }
        }
        if (arg5 == 22) {
            if (!client.field911 || var8.field3424 != 0 || var8.field3398 == 1 || var8.field3381) {
                class145 var25;
                if (var8.field3412 == -1 && var8.field3422 == null) {
                    var25 = var8.method4287(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class103(arg3, 22, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
                }
                arg6.method2935(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3398 == 1 && arg7 != null) {
                    arg7.method3331(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class145 var51;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var51 = var8.method4287(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class103(arg3, 10, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            if (var51 != null && arg6.method2930(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3426) {
                int var52 = 15;
                if (var51 instanceof class137) {
                    var52 = ((class137) var51).method2761() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field512[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field512[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3321(arg1, arg2, var9, var10, var8.field3399);
            }
        } else if (arg5 >= 12) {
            class145 var26;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var26 = var8.method4287(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method2930(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field53[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3321(arg1, arg2, var9, var10, var8.field3399);
            }
        } else if (arg5 == 0) {
            class145 var27;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var27 = var8.method4287(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class103(arg3, 0, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method3056(arg0, arg1, arg2, var16, var27, (class145) null, field513[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3426) {
                    Statics.field512[arg0][arg1][arg2] = 50;
                    Statics.field512[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3403) {
                    Statics.field53[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3426) {
                    Statics.field512[arg0][arg1][arg2 + 1] = 50;
                    Statics.field512[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3403) {
                    Statics.field53[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3426) {
                    Statics.field512[arg0][arg1 + 1][arg2] = 50;
                    Statics.field512[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3403) {
                    Statics.field53[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3426) {
                    Statics.field512[arg0][arg1][arg2] = 50;
                    Statics.field512[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3403) {
                    Statics.field53[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3317(arg1, arg2, arg5, arg4, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method2945(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 1) {
            class145 var28;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var28 = var8.method4287(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class103(arg3, 1, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method3056(arg0, arg1, arg2, var16, var28, (class145) null, field514[arg4], 0, var19, var21);
            if (var8.field3426) {
                if (arg4 == 0) {
                    Statics.field512[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field512[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field512[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field512[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3317(arg1, arg2, arg5, arg4, var8.field3399);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class145 var30;
            class145 var31;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var30 = var8.method4287(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4287(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class103(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
                var31 = new class103(arg3, 2, var29, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method3056(arg0, arg1, arg2, var16, var30, var31, field513[arg4], field513[var29], var19, var21);
            if (var8.field3403) {
                if (arg4 == 0) {
                    Statics.field53[arg0][arg1][arg2] |= 0x249;
                    Statics.field53[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field53[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field53[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field53[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field53[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field53[arg0][arg1][arg2] |= 0x492;
                    Statics.field53[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3317(arg1, arg2, arg5, arg4, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method2945(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 3) {
            class145 var32;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var32 = var8.method4287(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class103(arg3, 3, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method3056(arg0, arg1, arg2, var16, var32, (class145) null, field514[arg4], 0, var19, var21);
            if (var8.field3426) {
                if (arg4 == 0) {
                    Statics.field512[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field512[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field512[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field512[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3317(arg1, arg2, arg5, arg4, var8.field3399);
            }
        } else if (arg5 == 9) {
            class145 var33;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var33 = var8.method4287(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method2930(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3321(arg1, arg2, var9, var10, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method2945(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 4) {
            class145 var34;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var34 = var8.method4287(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method2938(arg0, arg1, arg2, var16, var34, (class145) null, field513[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2936(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class265.method325(class138.method3119(var36)).field3405;
            }
            class145 var38;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var38 = var8.method4287(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method2938(arg0, arg1, arg2, var16, var38, (class145) null, field513[arg4], 0, field519[arg4] * var35, field516[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2936(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class265.method325(class138.method3119(var40)).field3405 / 2;
            }
            class145 var42;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var42 = var8.method4287(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method2938(arg0, arg1, arg2, var16, var42, (class145) null, 256, arg4, field510[arg4] * var39, field518[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class145 var44;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var44 = var8.method4287(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class103(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method2938(arg0, arg1, arg2, var16, var44, (class145) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2936(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class265.method325(class138.method3119(var46)).field3405 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class145 var49;
            class145 var50;
            if (var8.field3412 == -1 && var8.field3422 == null) {
                var49 = var8.method4287(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4287(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
                var50 = new class103(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3412, var8.field3430, (class145) null);
            }
            arg6.method2938(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field510[arg4] * var45, field518[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("gw.l(Leo;[Lfo;I)V")
    public static final void method3375(class143 arg0, class182[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field508[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field508[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3319(var3, var4);
                        }
                    }
                }
            }
        }
        field517 += (int) (Math.random() * 5.0D) - 2;
        if (field517 < -8) {
            field517 = -8;
        }
        if (field517 > 8) {
            field517 = 8;
        }
        field511 += (int) (Math.random() * 5.0D) - 2;
        if (field511 < -16) {
            field511 = -16;
        }
        if (field511 > 16) {
            field511 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field512[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field520[var6][var11 + 1][var10] - field520[var6][var11 - 1][var10];
                    int var13 = field520[var6][var11][var10 + 1] - field520[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1174[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field3326[var20] = 0;
                Statics.field3182[var20] = 0;
                Statics.field1173[var20] = 0;
                Statics.field1999[var20] = 0;
                Statics.field1284[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field515[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class256 var25 = class256.method4036(var24 - 1);
                            Statics.field3326[var22] += var25.field3291;
                            Statics.field3182[var22] += var25.field3293;
                            Statics.field1173[var22] += var25.field3292;
                            Statics.field1999[var22] += var25.field3294;
                            var10002 = Statics.field1284[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field515[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class256 var28 = class256.method4036(var27 - 1);
                            Statics.field3326[var22] -= var28.field3291;
                            Statics.field3182[var22] -= var28.field3293;
                            Statics.field1173[var22] -= var28.field3292;
                            Statics.field1999[var22] -= var28.field3294;
                            var10002 = Statics.field1284[var22]--;
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
                            var29 += Statics.field3326[var35];
                            var30 += Statics.field3182[var35];
                            var31 += Statics.field1173[var35];
                            var32 += Statics.field1999[var35];
                            var33 += Statics.field1284[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field3326[var36];
                            var30 -= Statics.field3182[var36];
                            var31 -= Statics.field1173[var36];
                            var32 -= Statics.field1999[var36];
                            var33 -= Statics.field1284[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field911 || (field508[0][var21][var34] & 0x2) != 0 || (field508[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field507) {
                                field507 = var6;
                            }
                            int var37 = Statics.field515[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field509[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field520[var6][var21][var34];
                                int var40 = field520[var6][var21 + 1][var34];
                                int var41 = field520[var6][var21 + 1][var34 + 1];
                                int var42 = field520[var6][var21][var34 + 1];
                                int var43 = Statics.field1174[var21][var34];
                                int var44 = Statics.field1174[var21 + 1][var34];
                                int var45 = Statics.field1174[var21 + 1][var34 + 1];
                                int var46 = Statics.field1174[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method233(var49, var50, var51);
                                    int var52 = field517 + var49 & 0xFF;
                                    int var53 = field511 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method233(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field41[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class269.method3350(var38 - 1).field3539) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field53[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class140.field1801[method2716(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2934(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2716(var47, var43), method2716(var47, var44), method2716(var47, var45), method2716(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field41[var6][var21][var34] + 1;
                                    byte var57 = Statics.field3664[var6][var21][var34];
                                    class269 var58 = class269.method3350(var38 - 1);
                                    int var59 = var58.field3543;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1802.method2589(var59);
                                        var61 = -1;
                                    } else if (var58.field3535 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method233(var58.field3533, var58.field3540, var58.field3541);
                                        int var62 = field517 + var58.field3533 & 0xFF;
                                        int var63 = field511 + var58.field3541;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method233(var62, var58.field3540, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class140.field1801[method84(var60, 96)];
                                    }
                                    if (var58.field3538 != -1) {
                                        int var65 = field517 + var58.field3542 & 0xFF;
                                        int var66 = field511 + var58.field3537;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method233(var65, var58.field3536, var66);
                                        var64 = class140.field1801[method84(var67, 96)];
                                    }
                                    arg0.method2934(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method2716(var47, var43), method2716(var47, var44), method2716(var47, var45), method2716(var47, var46), method84(var61, var43), method84(var61, var44), method84(var61, var45), method84(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field508[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field508[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method3007(var6, var69, var68, var74);
                }
            }
            Statics.field515[var6] = (byte[][]) null;
            Statics.field509[var6] = (byte[][]) null;
            Statics.field41[var6] = (byte[][]) null;
            Statics.field3664[var6] = (byte[][]) null;
            Statics.field512[var6] = (byte[][]) null;
        }
        arg0.method2960(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field508[1][var75][var76] & 0x2) == 2) {
                    arg0.method3055(var75, var76);
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
                        if ((Statics.field53[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field53[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field53[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field53[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field53[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field520[var87][var83][var84] - var91;
                                int var93 = field520[var86][var83][var84];
                                class143.method2932(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field53[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field53[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field53[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field53[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field53[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field53[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field520[var99][var96][var82] - var103;
                                int var105 = field520[var98][var96][var82];
                                class143.method2932(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field53[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field53[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field53[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field53[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field53[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field53[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field520[var81][var108][var110];
                                class143.method2932(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field53[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.z(III)I")
    public static final int method2352(int arg0, int arg1) {
        int var2 = method42(arg0 + 45365, arg1 + 91923, 4) - 128 + (method42(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method42(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("t.u(IIIB)I")
    public static final int method42(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method410(var3, var5);
        int var8 = method410(var3 + 1, var5);
        int var9 = method410(var3, var5 + 1);
        int var10 = method410(var3 + 1, var5 + 1);
        int var11 = 65536 - class140.field1781[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class140.field1781[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class140.field1781[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("aq.e(III)I")
    public static final int method410(int arg0, int arg1) {
        int var2 = method168(arg0 - 1, arg1 - 1) + method168(arg0 + 1, arg1 - 1) + method168(arg0 - 1, arg1 + 1) + method168(arg0 + 1, arg1 + 1);
        int var3 = method168(arg0 - 1, arg1) + method168(arg0 + 1, arg1) + method168(arg0, arg1 - 1) + method168(arg0, arg1 + 1);
        int var4 = method168(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("y.m(IIB)I")
    public static final int method168(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ec.c(IIB)I")
    public static final int method2716(int arg0, int arg1) {
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

    @ObfuscatedName("z.i(IIB)I")
    public static final int method84(int arg0, int arg1) {
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

    @ObfuscatedName("an.f(IIIB)I")
    public static final int method233(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("iq.y(III)Z")
    public static final boolean method3806(int arg0, int arg1) {
        class265 var2 = class265.method325(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4245(arg1);
    }

    @ObfuscatedName("bb.r(IIIIIIILeo;Lfo;B)V")
    public static final void method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class143 arg7, class182 arg8) {
        class265 var9 = class265.method325(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3397;
            var11 = var9.field3419;
        } else {
            var10 = var9.field3419;
            var11 = var9.field3397;
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
        int[][] var16 = field520[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class138.method1957(arg2, arg3, 2, var9.field3424 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3418 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class145 var23;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var23 = var9.method4250(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class103(arg4, 22, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method2935(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3398 == 1) {
                arg8.method3331(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class145 var49;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var49 = var9.method4250(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class103(arg4, 10, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            if (var49 != null) {
                arg7.method2930(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3398 != 0) {
                arg8.method3321(arg2, arg3, var10, var11, var9.field3399);
            }
        } else if (arg6 >= 12) {
            class145 var24;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var24 = var9.method4250(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class103(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method2930(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3398 != 0) {
                arg8.method3321(arg2, arg3, var10, var11, var9.field3399);
            }
        } else if (arg6 == 0) {
            class145 var25;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var25 = var9.method4250(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class103(arg4, 0, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method3056(arg0, arg2, arg3, var17, var25, (class145) null, field513[arg5], 0, var20, var22);
            if (var9.field3398 != 0) {
                arg8.method3317(arg2, arg3, arg6, arg5, var9.field3399);
            }
        } else if (arg6 == 1) {
            class145 var26;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var26 = var9.method4250(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class103(arg4, 1, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method3056(arg0, arg2, arg3, var17, var26, (class145) null, field514[arg5], 0, var20, var22);
            if (var9.field3398 != 0) {
                arg8.method3317(arg2, arg3, arg6, arg5, var9.field3399);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class145 var28;
            class145 var29;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var28 = var9.method4250(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4250(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class103(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
                var29 = new class103(arg4, 2, var27, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method3056(arg0, arg2, arg3, var17, var28, var29, field513[arg5], field513[var27], var20, var22);
            if (var9.field3398 != 0) {
                arg8.method3317(arg2, arg3, arg6, arg5, var9.field3399);
            }
        } else if (arg6 == 3) {
            class145 var30;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var30 = var9.method4250(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class103(arg4, 3, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method3056(arg0, arg2, arg3, var17, var30, (class145) null, field514[arg5], 0, var20, var22);
            if (var9.field3398 != 0) {
                arg8.method3317(arg2, arg3, arg6, arg5, var9.field3399);
            }
        } else if (arg6 == 9) {
            class145 var31;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var31 = var9.method4250(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class103(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method2930(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3398 != 0) {
                arg8.method3321(arg2, arg3, var10, var11, var9.field3399);
            }
        } else if (arg6 == 4) {
            class145 var32;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var32 = var9.method4250(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class103(arg4, 4, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method2938(arg0, arg2, arg3, var17, var32, (class145) null, field513[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2936(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class265.method325(class138.method3119(var34)).field3405;
            }
            class145 var36;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var36 = var9.method4250(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class103(arg4, 4, arg5, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method2938(arg0, arg2, arg3, var17, var36, (class145) null, field513[arg5], 0, field519[arg5] * var33, field516[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2936(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class265.method325(class138.method3119(var38)).field3405 / 2;
            }
            class145 var40;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var40 = var9.method4250(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class103(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method2938(arg0, arg2, arg3, var17, var40, (class145) null, 256, arg5, field510[arg5] * var37, field518[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class145 var42;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var42 = var9.method4250(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class103(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method2938(arg0, arg2, arg3, var17, var42, (class145) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2936(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class265.method325(class138.method3119(var44)).field3405 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class145 var47;
            class145 var48;
            if (var9.field3412 == -1 && var9.field3422 == null) {
                var47 = var9.method4250(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4250(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class103(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
                var48 = new class103(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3412, var9.field3430, (class145) null);
            }
            arg7.method2938(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field510[arg5] * var43, field518[arg5] * var43, var20, var22);
        }
    }
}
