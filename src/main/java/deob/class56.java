package deob;

@ObfuscatedName("bu")
public final class class56 {

    @ObfuscatedName("bu.u")
    public static int[][][] field496 = new int[4][105][105];

    @ObfuscatedName("bu.f")
    public static byte[][][] field513 = new byte[4][104][104];

    @ObfuscatedName("bu.b")
    public static int field498 = 99;

    @ObfuscatedName("bu.d")
    public static final int[] field506 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bu.s")
    public static final int[] field507 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bu.t")
    public static final int[] field508 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bu.m")
    public static final int[] field509 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bu.v")
    public static final int[] field510 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bu.q")
    public static final int[] field514 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bu.l")
    public static int field512 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bu.j")
    public static int field504 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.u(IIIIB)V")
    public static final void method2109(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field424[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field496[0][var5][var4] = field496[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field496[0][var5][var4] = field496[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field496[0][var5][var4] = field496[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field496[0][var5][var4] = field496[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.f([BIIII[Lfh;B)V")
    public static final void method103(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class173[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2089[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class300 var9 = new class300(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method87(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ey.b(IIII)V")
    public static final void method2840(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field496[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field496[arg0][arg1][arg2 + var5] = field496[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field496[arg0][arg1 + var6][arg2] = field496[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field496[arg0][arg1 - 1][arg2] != 0) {
            field496[arg0][arg1][arg2] = field496[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field496[arg0][arg1][arg2 - 1] != 0) {
            field496[arg0][arg1][arg2] = field496[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field496[arg0][arg1 - 1][arg2 - 1] != 0) {
            field496[arg0][arg1][arg2] = field496[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("i.g(Lkg;IIIIIIB)V")
    public static final void method87(class300 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5138();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5138();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5138();
                }
            }
            return;
        }
        field513[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5138();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field496[0][arg2][arg3] = -method3368(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field496[arg1][arg2][arg3] = field496[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5138();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field496[0][arg2][arg3] = -var8 * 8;
                } else {
                    field496[arg1][arg2][arg3] = field496[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field500[arg1][arg2][arg3] = arg0.method5139();
                Statics.field501[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field502[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field513[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field499[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ci.z([BIIB)Z")
    public static final boolean method2054(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class300 var4 = new class300(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5247();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5246();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5138() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class254 var16 = class254.method3048(var5);
                        if (var13 != 22 || !client.field847 || var16.field3388 != 0 || var16.field3371 == 1 || var16.field3392) {
                            if (!var16.method4287()) {
                                client.field851++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5246();
                if (var9 == 0) {
                    break;
                }
                var4.method5138();
            }
        }
    }

    @ObfuscatedName("fr.p([BIIIIIIILel;[Lfh;I)V")
    public static final void method3237(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class134 arg8, class173[] arg9) {
        class300 var10 = new class300(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5247();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5246();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5138();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class254 var21 = class254.method3048(var11);
                    int var22 = arg2 + class217.method2085(var16 & 0x7, var15 & 0x7, arg7, var21.field3369, var21.field3370, var20);
                    int var23 = arg3 + class217.method3234(var16 & 0x7, var15 & 0x7, arg7, var21.field3369, var21.field3370, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field513[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class173 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        Statics.method4251(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("er.y(Lel;[Lfh;B)V")
    public static final void method3046(class134 arg0, class173[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field513[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field513[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3274(var3, var4);
                        }
                    }
                }
            }
        }
        field512 += (int) (Math.random() * 5.0D) - 2;
        if (field512 < -8) {
            field512 = -8;
        }
        if (field512 > 8) {
            field512 = 8;
        }
        field504 += (int) (Math.random() * 5.0D) - 2;
        if (field504 < -16) {
            field504 = -16;
        }
        if (field504 > 16) {
            field504 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field424[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field496[var6][var11 + 1][var10] - field496[var6][var11 - 1][var10];
                    int var13 = field496[var6][var11][var10 + 1] - field496[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1208[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field511[var20] = 0;
                Statics.field497[var20] = 0;
                Statics.field505[var20] = 0;
                Statics.field3658[var20] = 0;
                Statics.field589[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field499[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class245 var25 = class245.method3050(var24 - 1);
                            Statics.field511[var22] += var25.field3268;
                            Statics.field497[var22] += var25.field3266;
                            Statics.field505[var22] += var25.field3267;
                            Statics.field3658[var22] += var25.field3262;
                            var10002 = Statics.field589[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field499[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class245 var28 = class245.method3050(var27 - 1);
                            Statics.field511[var22] -= var28.field3268;
                            Statics.field497[var22] -= var28.field3266;
                            Statics.field505[var22] -= var28.field3267;
                            Statics.field3658[var22] -= var28.field3262;
                            var10002 = Statics.field589[var22]--;
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
                            var29 += Statics.field511[var35];
                            var30 += Statics.field497[var35];
                            var31 += Statics.field505[var35];
                            var32 += Statics.field3658[var35];
                            var33 += Statics.field589[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field511[var36];
                            var30 -= Statics.field497[var36];
                            var31 -= Statics.field505[var36];
                            var32 -= Statics.field3658[var36];
                            var33 -= Statics.field589[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field847 || (field513[0][var21][var34] & 0x2) != 0 || (field513[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field498) {
                                field498 = var6;
                            }
                            int var37 = Statics.field499[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field500[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field496[var6][var21][var34];
                                int var40 = field496[var6][var21 + 1][var34];
                                int var41 = field496[var6][var21 + 1][var34 + 1];
                                int var42 = field496[var6][var21][var34 + 1];
                                int var43 = Statics.field1208[var21][var34];
                                int var44 = Statics.field1208[var21 + 1][var34];
                                int var45 = Statics.field1208[var21 + 1][var34 + 1];
                                int var46 = Statics.field1208[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method4887(var49, var50, var51);
                                    int var52 = field512 + var49 & 0xFF;
                                    int var53 = field504 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method4887(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field501[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class258.method275(var38 - 1).field3507) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field234[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class131.field1759[method4826(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2933(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method4826(var47, var43), method4826(var47, var44), method4826(var47, var45), method4826(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field501[var6][var21][var34] + 1;
                                    byte var57 = Statics.field502[var6][var21][var34];
                                    class258 var58 = class258.method275(var38 - 1);
                                    int var59 = var58.field3503;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1770.method2516(var59);
                                        var61 = -1;
                                    } else if (var58.field3506 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method4887(var58.field3509, var58.field3510, var58.field3514);
                                        int var62 = field512 + var58.field3509 & 0xFF;
                                        int var63 = field504 + var58.field3514;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method4887(var62, var58.field3510, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class131.field1759[method1652(var60, 96)];
                                    }
                                    if (var58.field3515 != -1) {
                                        int var65 = field512 + var58.field3512 & 0xFF;
                                        int var66 = field504 + var58.field3505;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method4887(var65, var58.field3513, var66);
                                        var64 = class131.field1759[method1652(var67, 96)];
                                    }
                                    arg0.method2933(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method4826(var47, var43), method4826(var47, var44), method4826(var47, var45), method4826(var47, var46), method1652(var61, var43), method1652(var61, var44), method1652(var61, var45), method1652(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field513[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field513[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2848(var6, var69, var68, var74);
                }
            }
            Statics.field499[var6] = (byte[][]) null;
            Statics.field500[var6] = (byte[][]) null;
            Statics.field501[var6] = (byte[][]) null;
            Statics.field502[var6] = (byte[][]) null;
            Statics.field424[var6] = (byte[][]) null;
        }
        arg0.method2900(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field513[1][var75][var76] & 0x2) == 2) {
                    arg0.method2929(var75, var76);
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
                        if ((Statics.field234[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field234[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field234[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field234[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field234[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field496[var87][var83][var84] - var91;
                                int var93 = field496[var86][var83][var84];
                                class134.method2847(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field234[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field234[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field234[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field234[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field234[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field234[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field496[var99][var96][var82] - var103;
                                int var105 = field496[var98][var96][var82];
                                class134.method2847(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field234[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field234[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field234[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field234[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field234[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field234[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field496[var81][var108][var110];
                                class134.method2847(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field234[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gh.w(III)I")
    public static final int method3368(int arg0, int arg1) {
        int var2 = method3316(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3316(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3316(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("fg.i(IIII)I")
    public static final int method3316(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method4656(var3, var5);
        int var8 = method4656(var3 + 1, var5);
        int var9 = method4656(var3, var5 + 1);
        int var10 = method4656(var3 + 1, var5 + 1);
        int var11 = 65536 - class131.field1774[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = method4890(var9, var10, var4, arg2);
        return method4890(var12, var14, var6, arg2);
    }

    @ObfuscatedName("kx.k(IIIII)I")
    public static final int method4890(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class131.field1774[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("jy.x(IIB)I")
    public static final int method4656(int arg0, int arg1) {
        int var2 = method56(arg0 - 1, arg1 - 1) + method56(arg0 + 1, arg1 - 1) + method56(arg0 - 1, arg1 + 1) + method56(arg0 + 1, arg1 + 1);
        int var3 = method56(arg0 - 1, arg1) + method56(arg0 + 1, arg1) + method56(arg0, arg1 - 1) + method56(arg0, arg1 + 1);
        int var4 = method56(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("p.o(IIB)I")
    public static final int method56(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ja.e(III)I")
    public static final int method4826(int arg0, int arg1) {
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

    @ObfuscatedName("bv.n(III)I")
    public static final int method1652(int arg0, int arg1) {
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

    @ObfuscatedName("jf.c(IIII)I")
    public static final int method4887(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cg.s(IIIIIIILel;Lfh;I)V")
    public static final void method1898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7, class173 arg8) {
        class254 var9 = class254.method3048(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3370;
            var11 = var9.field3369;
        } else {
            var10 = var9.field3369;
            var11 = var9.field3370;
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
        int[][] var16 = field496[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class129.method960(arg2, arg3, 2, var9.field3388 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3394 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class136 var23;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var23 = var9.method4323(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class94(arg4, 22, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method3011(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3371 == 1) {
                arg8.method3275(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var49;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var49 = var9.method4323(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class94(arg4, 10, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            if (var49 != null) {
                arg7.method2977(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3371 != 0) {
                arg8.method3273(arg2, arg3, var10, var11, var9.field3387);
            }
        } else if (arg6 >= 12) {
            class136 var24;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var24 = var9.method4323(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2977(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3371 != 0) {
                arg8.method3273(arg2, arg3, var10, var11, var9.field3387);
            }
        } else if (arg6 == 0) {
            class136 var25;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var25 = var9.method4323(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class94(arg4, 0, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2843(arg0, arg2, arg3, var17, var25, (class136) null, field506[arg5], 0, var20, var22);
            if (var9.field3371 != 0) {
                arg8.method3293(arg2, arg3, arg6, arg5, var9.field3387);
            }
        } else if (arg6 == 1) {
            class136 var26;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var26 = var9.method4323(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class94(arg4, 1, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2843(arg0, arg2, arg3, var17, var26, (class136) null, field507[arg5], 0, var20, var22);
            if (var9.field3371 != 0) {
                arg8.method3293(arg2, arg3, arg6, arg5, var9.field3387);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class136 var28;
            class136 var29;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var28 = var9.method4323(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4323(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class94(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3396, true, (class136) null);
                var29 = new class94(arg4, 2, var27, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2843(arg0, arg2, arg3, var17, var28, var29, field506[arg5], field506[var27], var20, var22);
            if (var9.field3371 != 0) {
                arg8.method3293(arg2, arg3, arg6, arg5, var9.field3387);
            }
        } else if (arg6 == 3) {
            class136 var30;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var30 = var9.method4323(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class94(arg4, 3, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2843(arg0, arg2, arg3, var17, var30, (class136) null, field507[arg5], 0, var20, var22);
            if (var9.field3371 != 0) {
                arg8.method3293(arg2, arg3, arg6, arg5, var9.field3387);
            }
        } else if (arg6 == 9) {
            class136 var31;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var31 = var9.method4323(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2977(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3371 != 0) {
                arg8.method3273(arg2, arg3, var10, var11, var9.field3387);
            }
        } else if (arg6 == 4) {
            class136 var32;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var32 = var9.method4323(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2852(arg0, arg2, arg3, var17, var32, (class136) null, field506[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2869(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class254.method3048(class129.method1028(var34)).field3372;
            }
            class136 var36;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var36 = var9.method4323(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2852(arg0, arg2, arg3, var17, var36, (class136) null, field506[arg5], 0, field508[arg5] * var33, field509[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2869(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class254.method3048(class129.method1028(var38)).field3372 / 2;
            }
            class136 var40;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var40 = var9.method4323(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2852(arg0, arg2, arg3, var17, var40, (class136) null, 256, arg5, field510[arg5] * var37, field514[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class136 var42;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var42 = var9.method4323(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class94(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2852(arg0, arg2, arg3, var17, var42, (class136) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2869(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class254.method3048(class129.method1028(var44)).field3372 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class136 var47;
            class136 var48;
            if (var9.field3396 == -1 && var9.field3395 == null) {
                var47 = var9.method4323(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4323(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3396, true, (class136) null);
                var48 = new class94(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3396, true, (class136) null);
            }
            arg7.method2852(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field510[arg5] * var43, field514[arg5] * var43, var20, var22);
        }
    }
}
