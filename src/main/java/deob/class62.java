package deob;

@ObfuscatedName("bp")
public final class class62 {

    @ObfuscatedName("bp.j")
    public static int[][][] field763 = new int[4][105][105];

    @ObfuscatedName("bp.h")
    public static byte[][][] field761 = new byte[4][104][104];

    @ObfuscatedName("bp.f")
    public static int field762 = 99;

    @ObfuscatedName("bp.t")
    public static final int[] field768 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bp.y")
    public static final int[] field771 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bp.z")
    public static final int[] field770 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bp.u")
    public static final int[] field773 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bp.k")
    public static final int[] field772 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bp.q")
    public static final int[] field782 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bp.n")
    public static int field774 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bp.d")
    public static int field775 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.j(I)V")
    public static void method1575() {
        Statics.field767 = (byte[][][]) null;
        Statics.field764 = (byte[][][]) null;
        Statics.field765 = (byte[][][]) null;
        Statics.field781 = (byte[][][]) null;
        Statics.field3260 = (int[][][]) null;
        Statics.field785 = (byte[][][]) null;
        Statics.field531 = (int[][]) null;
        Statics.field769 = null;
        Statics.field441 = null;
        Statics.field457 = null;
        Statics.field2326 = null;
        Statics.field662 = null;
    }

    @ObfuscatedName("m.h(IIIII)V")
    public static final void method43(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field785[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field763[0][var5][var4] = field763[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field763[0][var5][var4] = field763[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field763[0][var5][var4] = field763[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field763[0][var5][var4] = field763[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.f([BIIII[Lfc;I)V")
    public static final void method29(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class163[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2305[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class175 var9 = new class175(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method554(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("u.p([BIIIIIII[Lfc;I)V")
    public static final void method158(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class163[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2305[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class175 var11 = new class175(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method554(var11, arg1, arg2 + class217.method2678(var13 & 0x7, var14 & 0x7, arg7), arg3 + class217.method1413(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method554(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cm.x(IIII)V")
    public static final void method1486(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field763[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field763[arg0][arg1][arg2 + var5] = field763[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field763[arg0][arg1 + var6][arg2] = field763[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field763[arg0][arg1 - 1][arg2] != 0) {
            field763[arg0][arg1][arg2] = field763[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field763[arg0][arg1][arg2 - 1] != 0) {
            field763[arg0][arg1][arg2] = field763[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field763[arg0][arg1 - 1][arg2 - 1] != 0) {
            field763[arg0][arg1][arg2] = field763[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("am.g(Lfb;IIIIIII)V")
    public static final void method554(class175 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2903();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2903();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2903();
                }
            }
            return;
        }
        field761[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2903();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field763[0][arg2][arg3] = -method2835(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field763[arg1][arg2][arg3] = field763[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2903();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field763[0][arg2][arg3] = -var8 * 8;
                } else {
                    field763[arg1][arg2][arg3] = field763[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field764[arg1][arg2][arg3] = arg0.method2980();
                Statics.field765[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field781[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field761[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field767[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ao.c([BIII)Z")
    public static final boolean method216(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class175 var4 = new class175(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3013();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3013();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2903() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class257 var16 = class257.method483(var5);
                        if (var13 != 22 || !client.field939 || var16.field3446 != 0 || var16.field3449 == 1 || var16.field3431) {
                            if (!var16.method4218()) {
                                client.field982++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3013();
                if (var9 == 0) {
                    break;
                }
                var4.method2903();
            }
        }
    }

    @ObfuscatedName("cv.b(IIIIIILez;Lfc;B)V")
    public static final void method1567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class141 arg6, class163 arg7) {
        if (client.field939 && (field761[0][arg1][arg2] & 0x2) == 0 && (field761[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field762) {
            field762 = arg0;
        }
        class257 var8 = class257.method483(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3443;
            var10 = var8.field3442;
        } else {
            var9 = var8.field3442;
            var10 = var8.field3443;
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
        int[][] var15 = field763[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3446 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3467 == 1) {
            var20 += 256;
        }
        if (var8.method4224()) {
            class83.method2783(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field939 || var8.field3446 != 0 || var8.field3449 == 1 || var8.field3431) {
                class143 var21;
                if (var8.field3450 == -1 && var8.field3468 == null) {
                    var21 = var8.method4206(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class102(arg3, 22, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
                }
                arg6.method2485(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3449 == 1 && arg7 != null) {
                    arg7.method2803(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class143 var44;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var44 = var8.method4206(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class102(arg3, 10, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            if (var44 != null && arg6.method2489(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3458) {
                int var45 = 15;
                if (var44 instanceof class135) {
                    var45 = ((class135) var44).method2307() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field785[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field785[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3449 != 0 && arg7 != null) {
                arg7.method2778(arg1, arg2, var9, var10, var8.field3445);
            }
        } else if (arg5 >= 12) {
            class143 var22;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var22 = var8.method4206(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class102(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2489(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3260[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3449 != 0 && arg7 != null) {
                arg7.method2778(arg1, arg2, var9, var10, var8.field3445);
            }
        } else if (arg5 == 0) {
            class143 var23;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var23 = var8.method4206(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class102(arg3, 0, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2617(arg0, arg1, arg2, var16, var23, (class143) null, field768[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3458) {
                    Statics.field785[arg0][arg1][arg2] = 50;
                    Statics.field785[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3453) {
                    Statics.field3260[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3458) {
                    Statics.field785[arg0][arg1][arg2 + 1] = 50;
                    Statics.field785[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3453) {
                    Statics.field3260[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3458) {
                    Statics.field785[arg0][arg1 + 1][arg2] = 50;
                    Statics.field785[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3453) {
                    Statics.field3260[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3458) {
                    Statics.field785[arg0][arg1][arg2] = 50;
                    Statics.field785[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3453) {
                    Statics.field3260[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3449 != 0 && arg7 != null) {
                arg7.method2775(arg1, arg2, arg5, arg4, var8.field3445);
            }
            if (var8.field3451 != 16) {
                arg6.method2495(arg0, arg1, arg2, var8.field3451);
            }
        } else if (arg5 == 1) {
            class143 var24;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var24 = var8.method4206(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class102(arg3, 1, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2617(arg0, arg1, arg2, var16, var24, (class143) null, field771[arg4], 0, var19, var20);
            if (var8.field3458) {
                if (arg4 == 0) {
                    Statics.field785[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field785[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field785[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field785[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3449 != 0 && arg7 != null) {
                arg7.method2775(arg1, arg2, arg5, arg4, var8.field3445);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class143 var26;
            class143 var27;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var26 = var8.method4206(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4206(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class102(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
                var27 = new class102(arg3, 2, var25, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2617(arg0, arg1, arg2, var16, var26, var27, field768[arg4], field768[var25], var19, var20);
            if (var8.field3453) {
                if (arg4 == 0) {
                    Statics.field3260[arg0][arg1][arg2] |= 0x249;
                    Statics.field3260[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3260[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3260[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3260[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3260[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3260[arg0][arg1][arg2] |= 0x492;
                    Statics.field3260[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3449 != 0 && arg7 != null) {
                arg7.method2775(arg1, arg2, arg5, arg4, var8.field3445);
            }
            if (var8.field3451 != 16) {
                arg6.method2495(arg0, arg1, arg2, var8.field3451);
            }
        } else if (arg5 == 3) {
            class143 var28;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var28 = var8.method4206(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class102(arg3, 3, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2617(arg0, arg1, arg2, var16, var28, (class143) null, field771[arg4], 0, var19, var20);
            if (var8.field3458) {
                if (arg4 == 0) {
                    Statics.field785[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field785[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field785[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field785[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3449 != 0 && arg7 != null) {
                arg7.method2775(arg1, arg2, arg5, arg4, var8.field3445);
            }
        } else if (arg5 == 9) {
            class143 var29;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var29 = var8.method4206(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class102(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2489(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3449 != 0 && arg7 != null) {
                arg7.method2778(arg1, arg2, var9, var10, var8.field3445);
            }
            if (var8.field3451 != 16) {
                arg6.method2495(arg0, arg1, arg2, var8.field3451);
            }
        } else if (arg5 == 4) {
            class143 var30;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var30 = var8.method4206(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class102(arg3, 4, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2618(arg0, arg1, arg2, var16, var30, (class143) null, field768[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2505(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class257.method483(var32 >> 14 & 0x7FFF).field3451;
            }
            class143 var33;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var33 = var8.method4206(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class102(arg3, 4, arg4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2618(arg0, arg1, arg2, var16, var33, (class143) null, field768[arg4], 0, field770[arg4] * var31, field773[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2505(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class257.method483(var35 >> 14 & 0x7FFF).field3451 / 2;
            }
            class143 var36;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var36 = var8.method4206(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class102(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2618(arg0, arg1, arg2, var16, var36, (class143) null, 256, arg4, field772[arg4] * var34, field782[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class143 var38;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var38 = var8.method4206(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class102(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2618(arg0, arg1, arg2, var16, var38, (class143) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2505(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class257.method483(var40 >> 14 & 0x7FFF).field3451 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class143 var42;
            class143 var43;
            if (var8.field3450 == -1 && var8.field3468 == null) {
                var42 = var8.method4206(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4206(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class102(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
                var43 = new class102(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3450, true, (class143) null);
            }
            arg6.method2618(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field772[arg4] * var39, field782[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("bs.o(Lez;[Lfc;I)V")
    public static final void method1390(class141 arg0, class163[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field761[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field761[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2779(var3, var4);
                        }
                    }
                }
            }
        }
        field774 += (int) (Math.random() * 5.0D) - 2;
        if (field774 < -8) {
            field774 = -8;
        }
        if (field774 > 8) {
            field774 = 8;
        }
        field775 += (int) (Math.random() * 5.0D) - 2;
        if (field775 < -16) {
            field775 = -16;
        }
        if (field775 > 16) {
            field775 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field785[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field763[var6][var11 + 1][var10] - field763[var6][var11 - 1][var10];
                    int var13 = field763[var6][var11][var10 + 1] - field763[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field531[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field769[var20] = 0;
                Statics.field441[var20] = 0;
                Statics.field457[var20] = 0;
                Statics.field2326[var20] = 0;
                Statics.field662[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field767[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class248 var25 = class248.method960(var24 - 1);
                            Statics.field769[var22] += var25.field3333;
                            Statics.field441[var22] += var25.field3328;
                            Statics.field457[var22] += var25.field3332;
                            Statics.field2326[var22] += var25.field3334;
                            var10002 = Statics.field662[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field767[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class248 var28 = class248.method960(var27 - 1);
                            Statics.field769[var22] -= var28.field3333;
                            Statics.field441[var22] -= var28.field3328;
                            Statics.field457[var22] -= var28.field3332;
                            Statics.field2326[var22] -= var28.field3334;
                            var10002 = Statics.field662[var22]--;
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
                            var29 += Statics.field769[var35];
                            var30 += Statics.field441[var35];
                            var31 += Statics.field457[var35];
                            var32 += Statics.field2326[var35];
                            var33 += Statics.field662[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field769[var36];
                            var30 -= Statics.field441[var36];
                            var31 -= Statics.field457[var36];
                            var32 -= Statics.field2326[var36];
                            var33 -= Statics.field662[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field939 || (field761[0][var21][var34] & 0x2) != 0 || (field761[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field762) {
                                field762 = var6;
                            }
                            int var37 = Statics.field767[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field764[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field763[var6][var21][var34];
                                int var40 = field763[var6][var21 + 1][var34];
                                int var41 = field763[var6][var21 + 1][var34 + 1];
                                int var42 = field763[var6][var21][var34 + 1];
                                int var43 = Statics.field531[var21][var34];
                                int var44 = Statics.field531[var21 + 1][var34];
                                int var45 = Statics.field531[var21 + 1][var34 + 1];
                                int var46 = Statics.field531[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method2755(var49, var50, var51);
                                    int var52 = field774 + var49 & 0xFF;
                                    int var53 = field775 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method2755(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field765[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class261.method4305(var38 - 1).field3580) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field3260[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class138.field2036[Statics.method1580(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2533(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, Statics.method1580(var47, var43), Statics.method1580(var47, var44), Statics.method1580(var47, var45), Statics.method1580(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field765[var6][var21][var34] + 1;
                                    byte var57 = Statics.field781[var6][var21][var34];
                                    class261 var58 = class261.method4305(var38 - 1);
                                    int var59 = var58.field3587;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field2038.method2186(var59);
                                        var61 = -1;
                                    } else if (var58.field3582 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method2755(var58.field3577, var58.field3583, var58.field3584);
                                        int var62 = field774 + var58.field3577 & 0xFF;
                                        int var63 = field775 + var58.field3584;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method2755(var62, var58.field3583, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class138.field2036[method1572(var60, 96)];
                                    }
                                    if (var58.field3581 != -1) {
                                        int var65 = field774 + var58.field3585 & 0xFF;
                                        int var66 = field775 + var58.field3579;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method2755(var65, var58.field3586, var66);
                                        var64 = class138.field2036[method1572(var67, 96)];
                                    }
                                    arg0.method2533(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, Statics.method1580(var47, var43), Statics.method1580(var47, var44), Statics.method1580(var47, var45), Statics.method1580(var47, var46), method1572(var61, var43), method1572(var61, var44), method1572(var61, var45), method1572(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field761[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field761[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2483(var6, var69, var68, var74);
                }
            }
            Statics.field767[var6] = (byte[][]) null;
            Statics.field764[var6] = (byte[][]) null;
            Statics.field765[var6] = (byte[][]) null;
            Statics.field781[var6] = (byte[][]) null;
            Statics.field785[var6] = (byte[][]) null;
        }
        arg0.method2510(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field761[1][var75][var76] & 0x2) == 2) {
                    arg0.method2481(var75, var76);
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
                        if ((Statics.field3260[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field3260[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field3260[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field3260[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field3260[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field763[var87][var83][var84] - var91;
                                int var93 = field763[var86][var83][var84];
                                class141.method2482(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field3260[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3260[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field3260[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field3260[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field3260[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field3260[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field763[var99][var96][var82] - var103;
                                int var105 = field763[var98][var96][var82];
                                class141.method2482(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field3260[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3260[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field3260[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field3260[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field3260[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field3260[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field763[var81][var108][var110];
                                class141.method2482(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field3260[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.m(III)I")
    public static final int method2835(int arg0, int arg1) {
        int var2 = method2179(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2179(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2179(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("dr.e(IIII)I")
    public static final int method2179(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method248(var3, var5);
        int var8 = method248(var3 + 1, var5);
        int var9 = method248(var3, var5 + 1);
        int var10 = method248(var3 + 1, var5 + 1);
        int var11 = 65536 - class138.field2030[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class138.field2030[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class138.field2030[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ag.a(IIB)I")
    public static final int method248(int arg0, int arg1) {
        int var2 = method3722(arg0 - 1, arg1 - 1) + method3722(arg0 + 1, arg1 - 1) + method3722(arg0 - 1, arg1 + 1) + method3722(arg0 + 1, arg1 + 1);
        int var3 = method3722(arg0 - 1, arg1) + method3722(arg0 + 1, arg1) + method3722(arg0, arg1 - 1) + method3722(arg0, arg1 + 1);
        int var4 = method3722(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("hi.v(III)I")
    public static final int method3722(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cv.y(III)I")
    public static final int method1572(int arg0, int arg1) {
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

    @ObfuscatedName("fv.u(IIII)I")
    public static final int method2755(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bv.n(IIB)Z")
    public static final boolean method1066(int arg0, int arg1) {
        class257 var2 = class257.method483(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4204(arg1);
    }

    @ObfuscatedName("v.d(IIIIIIILez;Lfc;B)V")
    public static final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class141 arg7, class163 arg8) {
        class257 var9 = class257.method483(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3443;
            var11 = var9.field3442;
        } else {
            var10 = var9.field3442;
            var11 = var9.field3443;
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
        int[][] var16 = field763[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field3446 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field3467 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class143 var22;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var22 = var9.method4205(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class102(arg4, 22, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2485(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field3449 == 1) {
                arg8.method2803(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class143 var45;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var45 = var9.method4205(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class102(arg4, 10, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            if (var45 != null) {
                arg7.method2489(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field3449 != 0) {
                arg8.method2778(arg2, arg3, var10, var11, var9.field3445);
            }
        } else if (arg6 >= 12) {
            class143 var23;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var23 = var9.method4205(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class102(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2489(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field3449 != 0) {
                arg8.method2778(arg2, arg3, var10, var11, var9.field3445);
            }
        } else if (arg6 == 0) {
            class143 var24;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var24 = var9.method4205(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class102(arg4, 0, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2617(arg0, arg2, arg3, var17, var24, (class143) null, field768[arg5], 0, var20, var21);
            if (var9.field3449 != 0) {
                arg8.method2775(arg2, arg3, arg6, arg5, var9.field3445);
            }
        } else if (arg6 == 1) {
            class143 var25;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var25 = var9.method4205(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class102(arg4, 1, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2617(arg0, arg2, arg3, var17, var25, (class143) null, field771[arg5], 0, var20, var21);
            if (var9.field3449 != 0) {
                arg8.method2775(arg2, arg3, arg6, arg5, var9.field3445);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class143 var27;
            class143 var28;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var27 = var9.method4205(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method4205(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class102(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3450, true, (class143) null);
                var28 = new class102(arg4, 2, var26, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2617(arg0, arg2, arg3, var17, var27, var28, field768[arg5], field768[var26], var20, var21);
            if (var9.field3449 != 0) {
                arg8.method2775(arg2, arg3, arg6, arg5, var9.field3445);
            }
        } else if (arg6 == 3) {
            class143 var29;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var29 = var9.method4205(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class102(arg4, 3, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2617(arg0, arg2, arg3, var17, var29, (class143) null, field771[arg5], 0, var20, var21);
            if (var9.field3449 != 0) {
                arg8.method2775(arg2, arg3, arg6, arg5, var9.field3445);
            }
        } else if (arg6 == 9) {
            class143 var30;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var30 = var9.method4205(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class102(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2489(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3449 != 0) {
                arg8.method2778(arg2, arg3, var10, var11, var9.field3445);
            }
        } else if (arg6 == 4) {
            class143 var31;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var31 = var9.method4205(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class102(arg4, 4, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2618(arg0, arg2, arg3, var17, var31, (class143) null, field768[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2505(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class257.method483(var33 >> 14 & 0x7FFF).field3451;
            }
            class143 var34;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var34 = var9.method4205(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class102(arg4, 4, arg5, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2618(arg0, arg2, arg3, var17, var34, (class143) null, field768[arg5], 0, field770[arg5] * var32, field773[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2505(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class257.method483(var36 >> 14 & 0x7FFF).field3451 / 2;
            }
            class143 var37;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var37 = var9.method4205(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class102(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2618(arg0, arg2, arg3, var17, var37, (class143) null, 256, arg5, field772[arg5] * var35, field782[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class143 var39;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var39 = var9.method4205(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class102(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2618(arg0, arg2, arg3, var17, var39, (class143) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2505(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class257.method483(var41 >> 14 & 0x7FFF).field3451 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class143 var43;
            class143 var44;
            if (var9.field3450 == -1 && var9.field3468 == null) {
                var43 = var9.method4205(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method4205(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class102(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3450, true, (class143) null);
                var44 = new class102(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field3450, true, (class143) null);
            }
            arg7.method2618(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field772[arg5] * var40, field782[arg5] * var40, var20, var21);
        }
    }
}
