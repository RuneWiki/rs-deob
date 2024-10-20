package deob;

@ObfuscatedName("ay")
public final class class51 {

    @ObfuscatedName("ay.z")
    public static int[][][] field460 = new int[4][105][105];

    @ObfuscatedName("ay.w")
    public static byte[][][] field444 = new byte[4][104][104];

    @ObfuscatedName("ay.s")
    public static int field443 = 99;

    @ObfuscatedName("ay.o")
    public static final int[] field451 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("ay.y")
    public static final int[] field452 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("ay.a")
    public static final int[] field453 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("ay.j")
    public static final int[] field454 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("ay.d")
    public static final int[] field459 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("ay.h")
    public static final int[] field450 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("ay.c")
    public static int field458 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("ay.v")
    public static int field456 = (int) (Math.random() * 33.0D) - 16;

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.z(B)V")
    public static void method616() {
        field443 = 99;
        Statics.field446 = new byte[4][104][104];
        Statics.field2034 = new byte[4][104][104];
        Statics.field447 = new byte[4][104][104];
        Statics.field160 = new byte[4][104][104];
        Statics.field326 = new int[4][105][105];
        Statics.field448 = new byte[4][105][105];
        Statics.field449 = new int[105][105];
        Statics.field455 = new int[104];
        Statics.field3726 = new int[104];
        Statics.field1036 = new int[104];
        Statics.field3326 = new int[104];
        Statics.field3138 = new int[104];
    }

    @ObfuscatedName("fm.s(IIIII)V")
    public static final void method3213(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field448[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field460[0][var5][var4] = field460[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field460[0][var5][var4] = field460[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field460[0][var5][var4] = field460[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field460[0][var5][var4] = field460[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fu.l(IIII)V")
    public static final void method3067(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field460[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field460[arg0][arg1][arg2 + var5] = field460[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field460[arg0][arg1 + var6][arg2] = field460[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field460[arg0][arg1 - 1][arg2] != 0) {
            field460[arg0][arg1][arg2] = field460[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field460[arg0][arg1][arg2 - 1] != 0) {
            field460[arg0][arg1][arg2] = field460[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field460[arg0][arg1 - 1][arg2 - 1] != 0) {
            field460[arg0][arg1][arg2] = field460[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bb.u(Lgk;IIIIIIS)V")
    public static final void method1496(class183 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3247();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3247();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3247();
                }
            }
            return;
        }
        field444[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3247();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field460[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method490(var10 + 45365, var11 + 91923, 4) - 128 + (method490(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method490(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field460[arg1][arg2][arg3] = field460[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3247();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field460[0][arg2][arg3] = -var15 * 8;
                } else {
                    field460[arg1][arg2][arg3] = field460[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2034[arg1][arg2][arg3] = arg0.method3384();
                Statics.field447[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field160[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field444[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field446[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ao.q([BIII)Z")
    public static final boolean method498(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class183 var4 = new class183(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3266();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3265();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3247() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class269 var16 = class269.method2323(var5);
                        if (var13 != 22 || !client.field586 || var16.field3389 != 0 || var16.field3387 == 1 || var16.field3408) {
                            if (!var16.method4660()) {
                                client.field636++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3265();
                if (var9 == 0) {
                    break;
                }
                var4.method3247();
            }
        }
    }

    @ObfuscatedName("fl.i(IIIIIILdm;Lfk;I)V")
    public static final void method3153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class126 arg6, class165 arg7) {
        if (client.field586 && (field444[0][arg1][arg2] & 0x2) == 0 && (field444[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field443) {
            field443 = arg0;
        }
        class269 var8 = class269.method2323(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3386;
            var10 = var8.field3385;
        } else {
            var9 = var8.field3385;
            var10 = var8.field3386;
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
        int[][] var15 = field460[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class121.method1686(arg1, arg2, 2, var8.field3389 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3410 == 1) {
            var21 += 256;
        }
        if (var8.method4633()) {
            class69.method3231(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field586 || var8.field3389 != 0 || var8.field3387 == 1 || var8.field3408) {
                class128 var22;
                if (var8.field3373 == -1 && var8.field3411 == null) {
                    var22 = var8.method4688(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class86(arg3, 22, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
                }
                arg6.method2805(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3387 == 1 && arg7 != null) {
                    arg7.method3116(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class128 var48;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var48 = var8.method4688(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class86(arg3, 10, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            if (var48 != null && arg6.method2678(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3401) {
                int var49 = 15;
                if (var48 instanceof class120) {
                    var49 = ((class120) var48).method2468() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field448[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field448[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3387 != 0 && arg7 != null) {
                arg7.method3100(arg1, arg2, var9, var10, var8.field3405);
            }
        } else if (arg5 >= 12) {
            class128 var23;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var23 = var8.method4688(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class86(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2678(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field326[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3387 != 0 && arg7 != null) {
                arg7.method3100(arg1, arg2, var9, var10, var8.field3405);
            }
        } else if (arg5 == 0) {
            class128 var24;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var24 = var8.method4688(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class86(arg3, 0, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2723(arg0, arg1, arg2, var16, var24, (class128) null, field451[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3401) {
                    Statics.field448[arg0][arg1][arg2] = 50;
                    Statics.field448[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3384) {
                    Statics.field326[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3401) {
                    Statics.field448[arg0][arg1][arg2 + 1] = 50;
                    Statics.field448[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3384) {
                    Statics.field326[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3401) {
                    Statics.field448[arg0][arg1 + 1][arg2] = 50;
                    Statics.field448[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3384) {
                    Statics.field326[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3401) {
                    Statics.field448[arg0][arg1][arg2] = 50;
                    Statics.field448[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3384) {
                    Statics.field326[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3387 != 0 && arg7 != null) {
                arg7.method3099(arg1, arg2, arg5, arg4, var8.field3405);
            }
            if (var8.field3380 != 16) {
                arg6.method2849(arg0, arg1, arg2, var8.field3380);
            }
        } else if (arg5 == 1) {
            class128 var25;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var25 = var8.method4688(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class86(arg3, 1, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2723(arg0, arg1, arg2, var16, var25, (class128) null, field452[arg4], 0, var19, var21);
            if (var8.field3401) {
                if (arg4 == 0) {
                    Statics.field448[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field448[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field448[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field448[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3387 != 0 && arg7 != null) {
                arg7.method3099(arg1, arg2, arg5, arg4, var8.field3405);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class128 var27;
            class128 var28;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var27 = var8.method4688(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4688(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class86(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
                var28 = new class86(arg3, 2, var26, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2723(arg0, arg1, arg2, var16, var27, var28, field451[arg4], field451[var26], var19, var21);
            if (var8.field3384) {
                if (arg4 == 0) {
                    Statics.field326[arg0][arg1][arg2] |= 0x249;
                    Statics.field326[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field326[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field326[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field326[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field326[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field326[arg0][arg1][arg2] |= 0x492;
                    Statics.field326[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3387 != 0 && arg7 != null) {
                arg7.method3099(arg1, arg2, arg5, arg4, var8.field3405);
            }
            if (var8.field3380 != 16) {
                arg6.method2849(arg0, arg1, arg2, var8.field3380);
            }
        } else if (arg5 == 3) {
            class128 var29;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var29 = var8.method4688(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class86(arg3, 3, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2723(arg0, arg1, arg2, var16, var29, (class128) null, field452[arg4], 0, var19, var21);
            if (var8.field3401) {
                if (arg4 == 0) {
                    Statics.field448[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field448[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field448[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field448[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3387 != 0 && arg7 != null) {
                arg7.method3099(arg1, arg2, arg5, arg4, var8.field3405);
            }
        } else if (arg5 == 9) {
            class128 var30;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var30 = var8.method4688(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class86(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2678(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3387 != 0 && arg7 != null) {
                arg7.method3100(arg1, arg2, var9, var10, var8.field3405);
            }
            if (var8.field3380 != 16) {
                arg6.method2849(arg0, arg1, arg2, var8.field3380);
            }
        } else if (arg5 == 4) {
            class128 var31;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var31 = var8.method4688(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class86(arg3, 4, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2677(arg0, arg1, arg2, var16, var31, (class128) null, field451[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2694(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class269.method2323(class121.method594(var33)).field3380;
            }
            class128 var35;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var35 = var8.method4688(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class86(arg3, 4, arg4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2677(arg0, arg1, arg2, var16, var35, (class128) null, field451[arg4], 0, field453[arg4] * var32, field454[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2694(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class269.method2323(class121.method594(var37)).field3380 / 2;
            }
            class128 var39;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var39 = var8.method4688(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class86(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2677(arg0, arg1, arg2, var16, var39, (class128) null, 256, arg4, field459[arg4] * var36, field450[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class128 var41;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var41 = var8.method4688(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class86(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2677(arg0, arg1, arg2, var16, var41, (class128) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2694(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class269.method2323(class121.method594(var43)).field3380 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class128 var46;
            class128 var47;
            if (var8.field3373 == -1 && var8.field3411 == null) {
                var46 = var8.method4688(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4688(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class86(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
                var47 = new class86(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3373, true, (class128) null);
            }
            arg6.method2677(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field459[arg4] * var42, field450[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("an.x(IIII)I")
    public static final int method490(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3500(var3, var5);
        int var8 = method3500(var3 + 1, var5);
        int var9 = method3500(var3, var5 + 1);
        int var10 = method3500(var3 + 1, var5 + 1);
        int var11 = method2666(var7, var8, var4, arg2);
        int var12 = method2666(var9, var10, var4, arg2);
        return method2666(var11, var12, var6, arg2);
    }

    @ObfuscatedName("di.e(IIIII)I")
    public static final int method2666(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class123.field1694[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("gv.p(III)I")
    public static final int method3500(int arg0, int arg1) {
        int var2 = method2307(arg0 - 1, arg1 - 1) + method2307(arg0 + 1, arg1 - 1) + method2307(arg0 - 1, arg1 + 1) + method2307(arg0 + 1, arg1 + 1);
        int var3 = method2307(arg0 - 1, arg1) + method2307(arg0 + 1, arg1) + method2307(arg0, arg1 - 1) + method2307(arg0, arg1 + 1);
        int var4 = method2307(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dv.b(III)I")
    public static final int method2307(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cu.n(III)I")
    public static final int method2092(int arg0, int arg1) {
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

    @ObfuscatedName("ak.f(III)I")
    public static final int method480(int arg0, int arg1) {
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

    @ObfuscatedName("at.g(IIIB)I")
    public static final int method501(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ju.m(IIIIIIILdm;Lfk;S)V")
    public static final void method4548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class126 arg7, class165 arg8) {
        class269 var9 = class269.method2323(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3386;
            var11 = var9.field3385;
        } else {
            var10 = var9.field3385;
            var11 = var9.field3386;
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
        int[][] var16 = field460[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class121.method1686(arg2, arg3, 2, var9.field3389 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3410 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class128 var23;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var23 = var9.method4640(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class86(arg4, 22, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2805(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3387 == 1) {
                arg8.method3116(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class128 var49;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var49 = var9.method4640(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class86(arg4, 10, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            if (var49 != null) {
                arg7.method2678(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3387 != 0) {
                arg8.method3100(arg2, arg3, var10, var11, var9.field3405);
            }
        } else if (arg6 >= 12) {
            class128 var24;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var24 = var9.method4640(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class86(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2678(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3387 != 0) {
                arg8.method3100(arg2, arg3, var10, var11, var9.field3405);
            }
        } else if (arg6 == 0) {
            class128 var25;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var25 = var9.method4640(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class86(arg4, 0, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2723(arg0, arg2, arg3, var17, var25, (class128) null, field451[arg5], 0, var20, var22);
            if (var9.field3387 != 0) {
                arg8.method3099(arg2, arg3, arg6, arg5, var9.field3405);
            }
        } else if (arg6 == 1) {
            class128 var26;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var26 = var9.method4640(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class86(arg4, 1, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2723(arg0, arg2, arg3, var17, var26, (class128) null, field452[arg5], 0, var20, var22);
            if (var9.field3387 != 0) {
                arg8.method3099(arg2, arg3, arg6, arg5, var9.field3405);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class128 var28;
            class128 var29;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var28 = var9.method4640(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4640(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class86(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3373, true, (class128) null);
                var29 = new class86(arg4, 2, var27, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2723(arg0, arg2, arg3, var17, var28, var29, field451[arg5], field451[var27], var20, var22);
            if (var9.field3387 != 0) {
                arg8.method3099(arg2, arg3, arg6, arg5, var9.field3405);
            }
        } else if (arg6 == 3) {
            class128 var30;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var30 = var9.method4640(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class86(arg4, 3, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2723(arg0, arg2, arg3, var17, var30, (class128) null, field452[arg5], 0, var20, var22);
            if (var9.field3387 != 0) {
                arg8.method3099(arg2, arg3, arg6, arg5, var9.field3405);
            }
        } else if (arg6 == 9) {
            class128 var31;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var31 = var9.method4640(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class86(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2678(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3387 != 0) {
                arg8.method3100(arg2, arg3, var10, var11, var9.field3405);
            }
        } else if (arg6 == 4) {
            class128 var32;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var32 = var9.method4640(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class86(arg4, 4, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2677(arg0, arg2, arg3, var17, var32, (class128) null, field451[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2694(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class269.method2323(class121.method594(var34)).field3380;
            }
            class128 var36;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var36 = var9.method4640(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class86(arg4, 4, arg5, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2677(arg0, arg2, arg3, var17, var36, (class128) null, field451[arg5], 0, field453[arg5] * var33, field454[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2694(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class269.method2323(class121.method594(var38)).field3380 / 2;
            }
            class128 var40;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var40 = var9.method4640(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class86(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2677(arg0, arg2, arg3, var17, var40, (class128) null, 256, arg5, field459[arg5] * var37, field450[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class128 var42;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var42 = var9.method4640(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class86(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2677(arg0, arg2, arg3, var17, var42, (class128) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2694(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class269.method2323(class121.method594(var44)).field3380 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class128 var47;
            class128 var48;
            if (var9.field3373 == -1 && var9.field3411 == null) {
                var47 = var9.method4640(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4640(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class86(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3373, true, (class128) null);
                var48 = new class86(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3373, true, (class128) null);
            }
            arg7.method2677(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field459[arg5] * var43, field450[arg5] * var43, var20, var22);
        }
    }
}
