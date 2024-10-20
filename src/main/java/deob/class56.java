package deob;

@ObfuscatedName("bg")
public final class class56 {

    @ObfuscatedName("bg.q")
    public static int[][][] field517 = new int[4][105][105];

    @ObfuscatedName("bg.w")
    public static byte[][][] field503 = new byte[4][104][104];

    @ObfuscatedName("bg.e")
    public static int field504 = 99;

    @ObfuscatedName("bg.j")
    public static final int[] field513 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bg.t")
    public static final int[] field514 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bg.h")
    public static final int[] field515 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bg.o")
    public static final int[] field521 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bg.n")
    public static final int[] field510 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bg.d")
    public static final int[] field518 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bg.s")
    public static int field520 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bg.z")
    public static int field511 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.q(I)V")
    public static void method649() {
        Statics.field505 = (byte[][][]) null;
        Statics.field506 = (byte[][][]) null;
        Statics.field507 = (byte[][][]) null;
        Statics.field3562 = (byte[][][]) null;
        Statics.field1888 = (int[][][]) null;
        Statics.field283 = (byte[][][]) null;
        Statics.field516 = (int[][]) null;
        Statics.field3104 = null;
        Statics.field509 = null;
        Statics.field508 = null;
        Statics.field1302 = null;
        Statics.field3690 = null;
    }

    @ObfuscatedName("cw.w(IIIIB)V")
    public static final void method1901(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field283[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field517[0][var5][var4] = field517[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field517[0][var5][var4] = field517[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field517[0][var5][var4] = field517[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field517[0][var5][var4] = field517[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bh.e([BIIIIIII[Lfv;B)V")
    public static final void method950(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class173[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2086[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class301 var11 = new class301(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method363(var11, arg1, arg2 + class217.method3375(var13 & 0x7, var14 & 0x7, arg7), arg3 + class217.method533(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method363(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.p(Lkf;IIIIIII)V")
    public static final void method363(class301 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5077();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5077();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5077();
                }
            }
            return;
        }
        field503[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5077();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field517[0][arg2][arg3] = -method12(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field517[arg1][arg2][arg3] = field517[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5077();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field517[0][arg2][arg3] = -var8 * 8;
                } else {
                    field517[arg1][arg2][arg3] = field517[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field506[arg1][arg2][arg3] = arg0.method5068();
                Statics.field507[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3562[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field503[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field505[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("hk.k([BIII)Z")
    public static final boolean method3584(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class301 var4 = new class301(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5082();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5081();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5077() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class254 var16 = class254.method2713(var5);
                        if (var13 != 22 || !client.field657 || var16.field3370 != 0 || var16.field3383 == 1 || var16.field3389) {
                            if (!var16.method4225()) {
                                client.field708++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5081();
                if (var9 == 0) {
                    break;
                }
                var4.method5077();
            }
        }
    }

    @ObfuscatedName("gz.l([BIILer;[Lfv;I)V")
    public static final void method3574(byte[] arg0, int arg1, int arg2, class134 arg3, class173[] arg4) {
        class301 var5 = new class301(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method5082();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method5081();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method5077();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field503[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class173 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1098(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("by.b(IIIIIILer;Lfv;S)V")
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class173 arg7) {
        if (client.field657 && (field503[0][arg1][arg2] & 0x2) == 0 && (field503[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field504) {
            field504 = arg0;
        }
        class254 var8 = class254.method2713(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3367;
            var10 = var8.field3366;
        } else {
            var9 = var8.field3366;
            var10 = var8.field3367;
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
        int[][] var15 = field517[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method2597(arg1, arg2, 2, var8.field3370 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3362 == 1) {
            var21 += 256;
        }
        if (var8.method4215()) {
            class76.method1817(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field657 || var8.field3370 != 0 || var8.field3383 == 1 || var8.field3389) {
                class136 var22;
                if (var8.field3374 == -1 && var8.field3392 == null) {
                    var22 = var8.method4208(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
                }
                arg6.method2815(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3383 == 1 && arg7 != null) {
                    arg7.method3244(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var48;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var48 = var8.method4208(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            if (var48 != null && arg6.method2819(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3357) {
                int var49 = 15;
                if (var48 instanceof class128) {
                    var49 = ((class128) var48).method2607() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field283[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field283[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3383 != 0 && arg7 != null) {
                arg7.method3242(arg1, arg2, var9, var10, var8.field3369);
            }
        } else if (arg5 >= 12) {
            class136 var23;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var23 = var8.method4208(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2819(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1888[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3383 != 0 && arg7 != null) {
                arg7.method3242(arg1, arg2, var9, var10, var8.field3369);
            }
        } else if (arg5 == 0) {
            class136 var24;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var24 = var8.method4208(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2836(arg0, arg1, arg2, var16, var24, (class136) null, field513[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3357) {
                    Statics.field283[arg0][arg1][arg2] = 50;
                    Statics.field283[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3373) {
                    Statics.field1888[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3357) {
                    Statics.field283[arg0][arg1][arg2 + 1] = 50;
                    Statics.field283[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3373) {
                    Statics.field1888[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3357) {
                    Statics.field283[arg0][arg1 + 1][arg2] = 50;
                    Statics.field283[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3373) {
                    Statics.field1888[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3357) {
                    Statics.field283[arg0][arg1][arg2] = 50;
                    Statics.field283[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3373) {
                    Statics.field1888[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3383 != 0 && arg7 != null) {
                arg7.method3241(arg1, arg2, arg5, arg4, var8.field3369);
            }
            if (var8.field3375 != 16) {
                arg6.method2825(arg0, arg1, arg2, var8.field3375);
            }
        } else if (arg5 == 1) {
            class136 var25;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var25 = var8.method4208(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2836(arg0, arg1, arg2, var16, var25, (class136) null, field514[arg4], 0, var19, var21);
            if (var8.field3357) {
                if (arg4 == 0) {
                    Statics.field283[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field283[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field283[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field283[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3383 != 0 && arg7 != null) {
                arg7.method3241(arg1, arg2, arg5, arg4, var8.field3369);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class136 var27;
            class136 var28;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var27 = var8.method4208(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4208(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
                var28 = new class94(arg3, 2, var26, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2836(arg0, arg1, arg2, var16, var27, var28, field513[arg4], field513[var26], var19, var21);
            if (var8.field3373) {
                if (arg4 == 0) {
                    Statics.field1888[arg0][arg1][arg2] |= 0x249;
                    Statics.field1888[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1888[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1888[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1888[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1888[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1888[arg0][arg1][arg2] |= 0x492;
                    Statics.field1888[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3383 != 0 && arg7 != null) {
                arg7.method3241(arg1, arg2, arg5, arg4, var8.field3369);
            }
            if (var8.field3375 != 16) {
                arg6.method2825(arg0, arg1, arg2, var8.field3375);
            }
        } else if (arg5 == 3) {
            class136 var29;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var29 = var8.method4208(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2836(arg0, arg1, arg2, var16, var29, (class136) null, field514[arg4], 0, var19, var21);
            if (var8.field3357) {
                if (arg4 == 0) {
                    Statics.field283[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field283[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field283[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field283[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3383 != 0 && arg7 != null) {
                arg7.method3241(arg1, arg2, arg5, arg4, var8.field3369);
            }
        } else if (arg5 == 9) {
            class136 var30;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var30 = var8.method4208(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2819(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3383 != 0 && arg7 != null) {
                arg7.method3242(arg1, arg2, var9, var10, var8.field3369);
            }
            if (var8.field3375 != 16) {
                arg6.method2825(arg0, arg1, arg2, var8.field3375);
            }
        } else if (arg5 == 4) {
            class136 var31;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var31 = var8.method4208(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2885(arg0, arg1, arg2, var16, var31, (class136) null, field513[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2873(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class254.method2713(class129.method632(var33)).field3375;
            }
            class136 var35;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var35 = var8.method4208(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2885(arg0, arg1, arg2, var16, var35, (class136) null, field513[arg4], 0, field515[arg4] * var32, field521[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2873(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class254.method2713(class129.method632(var37)).field3375 / 2;
            }
            class136 var39;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var39 = var8.method4208(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2885(arg0, arg1, arg2, var16, var39, (class136) null, 256, arg4, field510[arg4] * var36, field518[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class136 var41;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var41 = var8.method4208(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class94(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2885(arg0, arg1, arg2, var16, var41, (class136) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2873(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class254.method2713(class129.method632(var43)).field3375 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class136 var46;
            class136 var47;
            if (var8.field3374 == -1 && var8.field3392 == null) {
                var46 = var8.method4208(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4208(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
                var47 = new class94(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3374, true, (class136) null);
            }
            arg6.method2885(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field510[arg4] * var42, field518[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("b.i(Ler;[Lfv;I)V")
    public static final void method58(class134 arg0, class173[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field503[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field503[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3243(var3, var4);
                        }
                    }
                }
            }
        }
        field520 += (int) (Math.random() * 5.0D) - 2;
        if (field520 < -8) {
            field520 = -8;
        }
        if (field520 > 8) {
            field520 = 8;
        }
        field511 += (int) (Math.random() * 5.0D) - 2;
        if (field511 < -16) {
            field511 = -16;
        }
        if (field511 > 16) {
            field511 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field283[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field517[var6][var11 + 1][var10] - field517[var6][var11 - 1][var10];
                    int var13 = field517[var6][var11][var10 + 1] - field517[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field516[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field3104[var20] = 0;
                Statics.field509[var20] = 0;
                Statics.field508[var20] = 0;
                Statics.field1302[var20] = 0;
                Statics.field3690[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field505[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class245 var25 = class245.method979(var24 - 1);
                            Statics.field3104[var22] += var25.field3258;
                            Statics.field509[var22] += var25.field3259;
                            Statics.field508[var22] += var25.field3260;
                            Statics.field1302[var22] += var25.field3261;
                            var10002 = Statics.field3690[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field505[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            int var28 = var27 - 1;
                            class245 var29 = (class245) class245.field3255.method3039((long) var28);
                            class245 var30;
                            if (var29 == null) {
                                byte[] var31 = Statics.field3256.method3775(1, var28);
                                class245 var32 = new class245();
                                if (var31 != null) {
                                    var32.method4035(new class301(var31), var28);
                                }
                                var32.method4034();
                                class245.field3255.method3041(var32, (long) var28);
                                var30 = var32;
                            } else {
                                var30 = var29;
                            }
                            Statics.field3104[var22] -= var30.field3258;
                            Statics.field509[var22] -= var30.field3259;
                            Statics.field508[var22] -= var30.field3260;
                            Statics.field1302[var22] -= var30.field3261;
                            var10002 = Statics.field3690[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var34 = 0;
                    int var35 = 0;
                    int var36 = 0;
                    int var37 = 0;
                    int var38 = 0;
                    for (int var39 = -5; var39 < 109; var39++) {
                        int var40 = var39 + 5;
                        if (var40 >= 0 && var40 < 104) {
                            var34 += Statics.field3104[var40];
                            var35 += Statics.field509[var40];
                            var36 += Statics.field508[var40];
                            var37 += Statics.field1302[var40];
                            var38 += Statics.field3690[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field3104[var41];
                            var35 -= Statics.field509[var41];
                            var36 -= Statics.field508[var41];
                            var37 -= Statics.field1302[var41];
                            var38 -= Statics.field3690[var41];
                        }
                        if (var39 >= 1 && var39 < 103 && (!client.field657 || (field503[0][var21][var39] & 0x2) != 0 || (field503[var6][var21][var39] & 0x10) == 0)) {
                            if (var6 < field504) {
                                field504 = var6;
                            }
                            int var42 = Statics.field505[var6][var21][var39] & 0xFF;
                            int var43 = Statics.field506[var6][var21][var39] & 0xFF;
                            if (var42 > 0 || var43 > 0) {
                                int var44 = field517[var6][var21][var39];
                                int var45 = field517[var6][var21 + 1][var39];
                                int var46 = field517[var6][var21 + 1][var39 + 1];
                                int var47 = field517[var6][var21][var39 + 1];
                                int var48 = Statics.field516[var21][var39];
                                int var49 = Statics.field516[var21 + 1][var39];
                                int var50 = Statics.field516[var21 + 1][var39 + 1];
                                int var51 = Statics.field516[var21][var39 + 1];
                                int var52 = -1;
                                int var53 = -1;
                                if (var42 > 0) {
                                    int var54 = var34 * 256 / var37;
                                    int var55 = var35 / var38;
                                    int var56 = var36 / var38;
                                    var52 = Statics.method5764(var54, var55, var56);
                                    int var57 = field520 + var54 & 0xFF;
                                    int var58 = field511 + var56;
                                    if (var58 < 0) {
                                        var58 = 0;
                                    } else if (var58 > 255) {
                                        var58 = 255;
                                    }
                                    var53 = Statics.method5764(var57, var55, var58);
                                }
                                if (var6 > 0) {
                                    boolean var59 = true;
                                    if (var42 == 0 && Statics.field507[var6][var21][var39] != 0) {
                                        var59 = false;
                                    }
                                    if (var43 > 0) {
                                        int var60 = var43 - 1;
                                        class258 var61 = (class258) class258.field3504.method3039((long) var60);
                                        class258 var62;
                                        if (var61 == null) {
                                            byte[] var63 = Statics.field3506.method3775(4, var60);
                                            class258 var64 = new class258();
                                            if (var63 != null) {
                                                var64.method4359(new class301(var63), var60);
                                            }
                                            var64.method4358();
                                            class258.field3504.method3041(var64, (long) var60);
                                            var62 = var64;
                                        } else {
                                            var62 = var61;
                                        }
                                        if (!var62.field3507) {
                                            var59 = false;
                                        }
                                    }
                                    if (var59 && var44 == var45 && var44 == var46 && var44 == var47) {
                                        Statics.field1888[var6][var21][var39] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var53 != -1) {
                                    var65 = class131.field1784[method1778(var53, 96)];
                                }
                                if (var43 == 0) {
                                    arg0.method2814(var6, var21, var39, 0, 0, -1, var44, var45, var46, var47, method1778(var52, var48), method1778(var52, var49), method1778(var52, var50), method1778(var52, var51), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field507[var6][var21][var39] + 1;
                                    byte var67 = Statics.field3562[var6][var21][var39];
                                    int var68 = var43 - 1;
                                    class258 var69 = (class258) class258.field3504.method3039((long) var68);
                                    class258 var70;
                                    if (var69 == null) {
                                        byte[] var71 = Statics.field3506.method3775(4, var68);
                                        class258 var72 = new class258();
                                        if (var71 != null) {
                                            var72.method4359(new class301(var71), var68);
                                        }
                                        var72.method4358();
                                        class258.field3504.method3041(var72, (long) var68);
                                        var70 = var72;
                                    } else {
                                        var70 = var69;
                                    }
                                    int var74 = var70.field3509;
                                    int var75;
                                    int var76;
                                    if (var74 >= 0) {
                                        var75 = Statics.field1782.method2491(var74);
                                        var76 = -1;
                                    } else if (var70.field3513 == 16711935) {
                                        var76 = -2;
                                        var74 = -1;
                                        var75 = -2;
                                    } else {
                                        var76 = Statics.method5764(var70.field3514, var70.field3510, var70.field3511);
                                        int var77 = field520 + var70.field3514 & 0xFF;
                                        int var78 = field511 + var70.field3511;
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        var75 = Statics.method5764(var77, var70.field3510, var78);
                                    }
                                    int var79 = 0;
                                    if (var75 != -2) {
                                        var79 = class131.field1784[method2298(var75, 96)];
                                    }
                                    if (var70.field3508 != -1) {
                                        int var80 = field520 + var70.field3512 & 0xFF;
                                        int var81 = field511 + var70.field3515;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        int var82 = Statics.method5764(var80, var70.field3505, var81);
                                        var79 = class131.field1784[method2298(var82, 96)];
                                    }
                                    arg0.method2814(var6, var21, var39, var66, var67, var74, var44, var45, var46, var47, method1778(var52, var48), method1778(var52, var49), method1778(var52, var50), method1778(var52, var51), method2298(var76, var48), method2298(var76, var49), method2298(var76, var50), method2298(var76, var51), var65, var79);
                                }
                            }
                        }
                    }
                }
            }
            for (int var83 = 1; var83 < 103; var83++) {
                for (int var84 = 1; var84 < 103; var84++) {
                    arg0.method2817(var6, var84, var83, method3166(var6, var84, var83));
                }
            }
            Statics.field505[var6] = (byte[][]) null;
            Statics.field506[var6] = (byte[][]) null;
            Statics.field507[var6] = (byte[][]) null;
            Statics.field3562[var6] = (byte[][]) null;
            Statics.field283[var6] = (byte[][]) null;
        }
        arg0.method2840(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field503[1][var85][var86] & 0x2) == 2) {
                    arg0.method2811(var85, var86);
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
                        if ((Statics.field1888[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field1888[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field1888[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label364: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field1888[var96 - 1][var93][var98] & var87) == 0) {
                                        break label364;
                                    }
                                }
                                var96--;
                            }
                            label353: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field1888[var97 + 1][var93][var99] & var87) == 0) {
                                        break label353;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field517[var97][var93][var94] - var101;
                                int var103 = field517[var96][var93][var94];
                                class134.method2855(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field1888[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1888[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field1888[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field1888[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label417: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field1888[var108 - 1][var110][var92] & var88) == 0) {
                                        break label417;
                                    }
                                }
                                var108--;
                            }
                            label406: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field1888[var109 + 1][var111][var92] & var88) == 0) {
                                        break label406;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field517[var109][var106][var92] - var113;
                                int var115 = field517[var108][var106][var92];
                                class134.method2855(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field1888[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1888[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field1888[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field1888[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label470: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field1888[var91][var118 - 1][var122] & var89) == 0) {
                                        break label470;
                                    }
                                }
                                var118--;
                            }
                            label459: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field1888[var91][var119 + 1][var123] & var89) == 0) {
                                        break label459;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field517[var91][var118][var120];
                                class134.method2855(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field1888[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fe.c(IIIB)I")
    public static int method3166(int arg0, int arg1, int arg2) {
        if ((field503[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field503[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("w.u(IIB)I")
    public static final int method12(int arg0, int arg1) {
        int var2 = method4372(arg0 + 45365, arg1 + 91923, 4) - 128 + (method4372(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4372(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("it.x(IIIB)I")
    public static final int method4372(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2508(var3, var5);
        int var8 = method2508(var3 + 1, var5);
        int var9 = method2508(var3, var5 + 1);
        int var10 = method2508(var3 + 1, var5 + 1);
        int var11 = method35(var7, var8, var4, arg2);
        int var12 = method35(var9, var10, var4, arg2);
        return method35(var11, var12, var6, arg2);
    }

    @ObfuscatedName("k.r(IIIII)I")
    public static final int method35(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class131.field1785[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("dc.v(III)I")
    public static final int method2508(int arg0, int arg1) {
        int var2 = method883(arg0 - 1, arg1 - 1) + method883(arg0 + 1, arg1 - 1) + method883(arg0 - 1, arg1 + 1) + method883(arg0 + 1, arg1 + 1);
        int var3 = method883(arg0 - 1, arg1) + method883(arg0 + 1, arg1) + method883(arg0, arg1 - 1) + method883(arg0, arg1 + 1);
        int var4 = method883(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bi.y(III)I")
    public static final int method883(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ba.g(III)I")
    public static final int method1778(int arg0, int arg1) {
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

    @ObfuscatedName("dz.a(IIB)I")
    public static final int method2298(int arg0, int arg1) {
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

    @ObfuscatedName("cw.o(III)Z")
    public static final boolean method1900(int arg0, int arg1) {
        class254 var2 = class254.method2713(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4206(arg1);
    }

    @ObfuscatedName("gx.d(IIIIIIILer;Lfv;I)V")
    public static final void method3290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7, class173 arg8) {
        class254 var9 = class254.method2713(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3367;
            var11 = var9.field3366;
        } else {
            var10 = var9.field3366;
            var11 = var9.field3367;
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
        int[][] var16 = field517[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class129.method2597(arg2, arg3, 2, var9.field3370 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3362 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class136 var23;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var23 = var9.method4209(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class94(arg4, 22, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2815(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3383 == 1) {
                arg8.method3244(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var49;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var49 = var9.method4209(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class94(arg4, 10, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            if (var49 != null) {
                arg7.method2819(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3383 != 0) {
                arg8.method3242(arg2, arg3, var10, var11, var9.field3369);
            }
        } else if (arg6 >= 12) {
            class136 var24;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var24 = var9.method4209(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2819(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3383 != 0) {
                arg8.method3242(arg2, arg3, var10, var11, var9.field3369);
            }
        } else if (arg6 == 0) {
            class136 var25;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var25 = var9.method4209(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class94(arg4, 0, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2836(arg0, arg2, arg3, var17, var25, (class136) null, field513[arg5], 0, var20, var22);
            if (var9.field3383 != 0) {
                arg8.method3241(arg2, arg3, arg6, arg5, var9.field3369);
            }
        } else if (arg6 == 1) {
            class136 var26;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var26 = var9.method4209(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class94(arg4, 1, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2836(arg0, arg2, arg3, var17, var26, (class136) null, field514[arg5], 0, var20, var22);
            if (var9.field3383 != 0) {
                arg8.method3241(arg2, arg3, arg6, arg5, var9.field3369);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class136 var28;
            class136 var29;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var28 = var9.method4209(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4209(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class94(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3374, true, (class136) null);
                var29 = new class94(arg4, 2, var27, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2836(arg0, arg2, arg3, var17, var28, var29, field513[arg5], field513[var27], var20, var22);
            if (var9.field3383 != 0) {
                arg8.method3241(arg2, arg3, arg6, arg5, var9.field3369);
            }
        } else if (arg6 == 3) {
            class136 var30;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var30 = var9.method4209(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class94(arg4, 3, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2836(arg0, arg2, arg3, var17, var30, (class136) null, field514[arg5], 0, var20, var22);
            if (var9.field3383 != 0) {
                arg8.method3241(arg2, arg3, arg6, arg5, var9.field3369);
            }
        } else if (arg6 == 9) {
            class136 var31;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var31 = var9.method4209(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2819(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3383 != 0) {
                arg8.method3242(arg2, arg3, var10, var11, var9.field3369);
            }
        } else if (arg6 == 4) {
            class136 var32;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var32 = var9.method4209(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2885(arg0, arg2, arg3, var17, var32, (class136) null, field513[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2873(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class254.method2713(class129.method632(var34)).field3375;
            }
            class136 var36;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var36 = var9.method4209(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2885(arg0, arg2, arg3, var17, var36, (class136) null, field513[arg5], 0, field515[arg5] * var33, field521[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2873(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class254.method2713(class129.method632(var38)).field3375 / 2;
            }
            class136 var40;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var40 = var9.method4209(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2885(arg0, arg2, arg3, var17, var40, (class136) null, 256, arg5, field510[arg5] * var37, field518[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class136 var42;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var42 = var9.method4209(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class94(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2885(arg0, arg2, arg3, var17, var42, (class136) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2873(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class254.method2713(class129.method632(var44)).field3375 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class136 var47;
            class136 var48;
            if (var9.field3374 == -1 && var9.field3392 == null) {
                var47 = var9.method4209(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4209(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3374, true, (class136) null);
                var48 = new class94(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3374, true, (class136) null);
            }
            arg7.method2885(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field510[arg5] * var43, field518[arg5] * var43, var20, var22);
        }
    }
}
