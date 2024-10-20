package deob;

@ObfuscatedName("s")
public final class class88 {

    @ObfuscatedName("s.b")
    public static int[][][] field1247 = new int[4][105][105];

    @ObfuscatedName("s.c")
    public static int field1251 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("s.a")
    public static final int[] field1248 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("s.n")
    public static final int[] field1243 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("s.m")
    public static final int[] field1250 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("s.k")
    public static int field1238 = 99;

    @ObfuscatedName("s.h")
    public static byte[][][] field1237 = new byte[4][104][104];

    @ObfuscatedName("s.v")
    public static int field1240 = (int) (Math.random() * 33.0D) - 16;

    @ObfuscatedName("s.u")
    public static final int[] field1246 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("s.p")
    public static final int[] field1245 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("s.y")
    public static final int[] field1253 = new int[] { 1, 0, -1, 0 };

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.q(IIII)I")
    public static final int method468(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("f.g(III)I")
    public static final int method893(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("g.x(IIB)I")
    public static final int method959(int arg0, int arg1) {
        int var2 = method893(arg0 - 1, arg1 - 1) + method893(arg0 + 1, arg1 - 1) + method893(arg0 - 1, arg1 + 1) + method893(arg0 + 1, arg1 + 1);
        int var3 = method893(arg0 - 1, arg1) + method893(arg0 + 1, arg1) + method893(arg0, arg1 - 1) + method893(arg0, arg1 + 1);
        int var4 = method893(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("c.e(IIB)I")
    public static final int method1100(int arg0, int arg1) {
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

    @ObfuscatedName("ey.z(IIB)Z")
    public static final boolean method1105(int arg0, int arg1) {
        class182 var2 = class182.method3383(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3291(arg1);
    }

    @ObfuscatedName("k.k([BIIIIIII[Lfm;I)V")
    public static final void method1172(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class8[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field42[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class50 var11 = new class50(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
                        int var21 = arg7 & 0x3;
                        int var22;
                        if (var21 == 0) {
                            var22 = var18;
                        } else if (var21 == 1) {
                            var22 = var19;
                        } else if (var21 == 2) {
                            var22 = 7 - var18;
                        } else {
                            var22 = 7 - var19;
                        }
                        method1419(var11, arg1, arg2 + var22, arg3 + class4.method534(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1419(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.i(IIIIIIILca;Lfm;B)V")
    public static final void method1188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class107 arg7, class8 arg8) {
        class182 var9 = class182.method3383(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2769;
            var11 = var9.field2777;
        } else {
            var10 = var9.field2777;
            var11 = var9.field2769;
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
        int[][] var16 = field1247[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field2767 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field2759 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class145 var22;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var22 = var9.method3294(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class60(arg4, 22, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1557(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field2771 == 1) {
                arg8.method71(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class145 var45;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var45 = var9.method3294(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class60(arg4, 10, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            if (var45 != null) {
                arg7.method1509(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field2771 != 0) {
                arg8.method63(arg2, arg3, var10, var11, var9.field2778);
            }
        } else if (arg6 >= 12) {
            class145 var23;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var23 = var9.method3294(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class60(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1509(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field2771 != 0) {
                arg8.method63(arg2, arg3, var10, var11, var9.field2778);
            }
        } else if (arg6 == 0) {
            class145 var24;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var24 = var9.method3294(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class60(arg4, 0, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1572(arg0, arg2, arg3, var17, var24, (class145) null, field1243[arg5], 0, var20, var21);
            if (var9.field2771 != 0) {
                arg8.method91(arg2, arg3, arg6, arg5, var9.field2778);
            }
        } else if (arg6 == 1) {
            class145 var25;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var25 = var9.method3294(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class60(arg4, 1, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1572(arg0, arg2, arg3, var17, var25, (class145) null, field1246[arg5], 0, var20, var21);
            if (var9.field2771 != 0) {
                arg8.method91(arg2, arg3, arg6, arg5, var9.field2778);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class145 var27;
            class145 var28;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var27 = var9.method3294(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method3294(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class60(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2772, true, (class145) null);
                var28 = new class60(arg4, 2, var26, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1572(arg0, arg2, arg3, var17, var27, var28, field1243[arg5], field1243[var26], var20, var21);
            if (var9.field2771 != 0) {
                arg8.method91(arg2, arg3, arg6, arg5, var9.field2778);
            }
        } else if (arg6 == 3) {
            class145 var29;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var29 = var9.method3294(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class60(arg4, 3, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1572(arg0, arg2, arg3, var17, var29, (class145) null, field1246[arg5], 0, var20, var21);
            if (var9.field2771 != 0) {
                arg8.method91(arg2, arg3, arg6, arg5, var9.field2778);
            }
        } else if (arg6 == 9) {
            class145 var30;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var30 = var9.method3294(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class60(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1509(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2771 != 0) {
                arg8.method63(arg2, arg3, var10, var11, var9.field2778);
            }
        } else if (arg6 == 4) {
            class145 var31;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var31 = var9.method3294(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class60(arg4, 4, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1508(arg0, arg2, arg3, var17, var31, (class145) null, field1243[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1611(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class182.method3383(var33 >> 14 & 0x7FFF).field2780;
            }
            class145 var34;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var34 = var9.method3294(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class60(arg4, 4, arg5, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1508(arg0, arg2, arg3, var17, var34, (class145) null, field1243[arg5], 0, field1253[arg5] * var32, field1248[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1611(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class182.method3383(var36 >> 14 & 0x7FFF).field2780 / 2;
            }
            class145 var37;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var37 = var9.method3294(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class60(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1508(arg0, arg2, arg3, var17, var37, (class145) null, 256, arg5, field1245[arg5] * var35, field1250[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class145 var39;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var39 = var9.method3294(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class60(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1508(arg0, arg2, arg3, var17, var39, (class145) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1611(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class182.method3383(var41 >> 14 & 0x7FFF).field2780 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class145 var43;
            class145 var44;
            if (var9.field2772 == -1 && var9.field2796 == null) {
                var43 = var9.method3294(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method3294(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class60(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2772, true, (class145) null);
                var44 = new class60(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field2772, true, (class145) null);
            }
            arg7.method1508(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field1245[arg5] * var40, field1250[arg5] * var40, var20, var21);
        }
    }

    @ObfuscatedName("es.t(Ldp;IIIIIIB)V")
    public static final void method1419(class50 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method726();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method726();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method726();
                }
            }
            return;
        }
        field1237[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method726();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field1247[0][arg2][arg3] = -method2909(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field1247[arg1][arg2][arg3] = field1247[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method726();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field1247[0][arg2][arg3] = -var8 * 8;
                } else {
                    field1247[arg1][arg2][arg3] = field1247[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field964[arg1][arg2][arg3] = arg0.method681();
                Statics.field1241[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1252[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1237[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1239[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bz.s(IIIB)I")
    public static final int method1984(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method959(var3, var5);
        int var8 = method959(var3 + 1, var5);
        int var9 = method959(var3, var5 + 1);
        int var10 = method959(var3 + 1, var5 + 1);
        int var11 = method2948(var7, var8, var4, arg2);
        int var12 = method2948(var9, var10, var4, arg2);
        return method2948(var11, var12, var6, arg2);
    }

    @ObfuscatedName("bl.l(IIII)I")
    public static int method2186(int arg0, int arg1, int arg2) {
        if ((field1237[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field1237[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("da.d(IIIIIILca;Lfm;B)V")
    public static final void method2345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class107 arg6, class8 arg7) {
        if (client.field1537 && (field1237[0][arg1][arg2] & 0x2) == 0) {
            if ((field1237[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2186(arg0, arg1, arg2) != client.field1710) {
                return;
            }
        }
        if (arg0 < field1238) {
            field1238 = arg0;
        }
        class182 var8 = class182.method3383(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2769;
            var10 = var8.field2777;
        } else {
            var9 = var8.field2777;
            var10 = var8.field2769;
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
        int[][] var15 = field1247[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field2767 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field2759 == 1) {
            var20 += 256;
        }
        if (var8.method3298()) {
            class69 var21 = new class69();
            var21.field754 = arg0;
            var21.field771 = arg1 * 128;
            var21.field756 = arg2 * 128;
            int var22 = var8.field2777;
            int var23 = var8.field2769;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field2769;
                var23 = var8.field2777;
            }
            var21.field753 = (arg1 + var22) * 128;
            var21.field772 = (arg2 + var23) * 128;
            var21.field760 = var8.field2760;
            var21.field759 = var8.field2800 * 128;
            var21.field762 = var8.field2801;
            var21.field763 = var8.field2781;
            var21.field764 = var8.field2803;
            if (var8.field2796 != null) {
                var21.field767 = var8;
                var21.method1132();
            }
            class69.field755.method219(var21);
            if (var21.field764 != null) {
                var21.field765 = var21.field762 + (int) (Math.random() * (double) (var21.field763 - var21.field762));
            }
        }
        if (arg5 == 22) {
            if (!client.field1537 || var8.field2767 != 0 || var8.field2771 == 1 || var8.field2793) {
                class145 var24;
                if (var8.field2772 == -1 && var8.field2796 == null) {
                    var24 = var8.method3318(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class60(arg3, 22, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
                }
                arg6.method1557(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field2771 == 1 && arg7 != null) {
                    arg7.method71(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class145 var47;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var47 = var8.method3318(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class60(arg3, 10, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            if (var47 != null && arg6.method1509(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field2785) {
                int var48 = 15;
                if (var47 instanceof class27) {
                    var48 = ((class27) var47).method431() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field1242[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field1242[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field2771 != 0 && arg7 != null) {
                arg7.method63(arg1, arg2, var9, var10, var8.field2778);
            }
        } else if (arg5 >= 12) {
            class145 var25;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var25 = var8.method3318(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class60(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1509(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field448[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2771 != 0 && arg7 != null) {
                arg7.method63(arg1, arg2, var9, var10, var8.field2778);
            }
        } else if (arg5 == 0) {
            class145 var26;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var26 = var8.method3318(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class60(arg3, 0, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1572(arg0, arg1, arg2, var16, var26, (class145) null, field1243[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field2785) {
                    Statics.field1242[arg0][arg1][arg2] = 50;
                    Statics.field1242[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2776) {
                    Statics.field448[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2785) {
                    Statics.field1242[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1242[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2776) {
                    Statics.field448[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2785) {
                    Statics.field1242[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1242[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2776) {
                    Statics.field448[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2785) {
                    Statics.field1242[arg0][arg1][arg2] = 50;
                    Statics.field1242[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2776) {
                    Statics.field448[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2771 != 0 && arg7 != null) {
                arg7.method91(arg1, arg2, arg5, arg4, var8.field2778);
            }
            if (var8.field2780 != 16) {
                arg6.method1515(arg0, arg1, arg2, var8.field2780);
            }
        } else if (arg5 == 1) {
            class145 var27;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var27 = var8.method3318(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class60(arg3, 1, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1572(arg0, arg1, arg2, var16, var27, (class145) null, field1246[arg4], 0, var19, var20);
            if (var8.field2785) {
                if (arg4 == 0) {
                    Statics.field1242[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1242[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1242[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1242[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2771 != 0 && arg7 != null) {
                arg7.method91(arg1, arg2, arg5, arg4, var8.field2778);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class145 var29;
            class145 var30;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var29 = var8.method3318(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method3318(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class60(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
                var30 = new class60(arg3, 2, var28, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1572(arg0, arg1, arg2, var16, var29, var30, field1243[arg4], field1243[var28], var19, var20);
            if (var8.field2776) {
                if (arg4 == 0) {
                    Statics.field448[arg0][arg1][arg2] |= 0x249;
                    Statics.field448[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field448[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field448[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field448[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field448[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field448[arg0][arg1][arg2] |= 0x492;
                    Statics.field448[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2771 != 0 && arg7 != null) {
                arg7.method91(arg1, arg2, arg5, arg4, var8.field2778);
            }
            if (var8.field2780 != 16) {
                arg6.method1515(arg0, arg1, arg2, var8.field2780);
            }
        } else if (arg5 == 3) {
            class145 var31;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var31 = var8.method3318(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class60(arg3, 3, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1572(arg0, arg1, arg2, var16, var31, (class145) null, field1246[arg4], 0, var19, var20);
            if (var8.field2785) {
                if (arg4 == 0) {
                    Statics.field1242[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1242[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1242[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1242[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2771 != 0 && arg7 != null) {
                arg7.method91(arg1, arg2, arg5, arg4, var8.field2778);
            }
        } else if (arg5 == 9) {
            class145 var32;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var32 = var8.method3318(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class60(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1509(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field2771 != 0 && arg7 != null) {
                arg7.method63(arg1, arg2, var9, var10, var8.field2778);
            }
            if (var8.field2780 != 16) {
                arg6.method1515(arg0, arg1, arg2, var8.field2780);
            }
        } else if (arg5 == 4) {
            class145 var33;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var33 = var8.method3318(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class60(arg3, 4, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1508(arg0, arg1, arg2, var16, var33, (class145) null, field1243[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1611(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class182.method3383(var35 >> 14 & 0x7FFF).field2780;
            }
            class145 var36;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var36 = var8.method3318(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class60(arg3, 4, arg4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1508(arg0, arg1, arg2, var16, var36, (class145) null, field1243[arg4], 0, field1253[arg4] * var34, field1248[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1611(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class182.method3383(var38 >> 14 & 0x7FFF).field2780 / 2;
            }
            class145 var39;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var39 = var8.method3318(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class60(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1508(arg0, arg1, arg2, var16, var39, (class145) null, 256, arg4, field1245[arg4] * var37, field1250[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class145 var41;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var41 = var8.method3318(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class60(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1508(arg0, arg1, arg2, var16, var41, (class145) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1611(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class182.method3383(var43 >> 14 & 0x7FFF).field2780 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class145 var45;
            class145 var46;
            if (var8.field2772 == -1 && var8.field2796 == null) {
                var45 = var8.method3318(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method3318(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class60(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
                var46 = new class60(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field2772, true, (class145) null);
            }
            arg6.method1508(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field1245[arg4] * var42, field1250[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cv.h([BIIII[Lfm;I)V")
    public static final void method2375(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class8[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field42[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class50 var9 = new class50(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1419(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ax.f(III)I")
    public static final int method2909(int arg0, int arg1) {
        int var2 = method1984(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1984(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1984(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("av.w(IIII)V")
    public static final void method2937(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1247[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1247[arg0][arg1][arg2 + var5] = field1247[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1247[arg0][arg1 + var6][arg2] = field1247[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1247[arg0][arg1 - 1][arg2] != 0) {
            field1247[arg0][arg1][arg2] = field1247[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1247[arg0][arg1][arg2 - 1] != 0) {
            field1247[arg0][arg1][arg2] = field1247[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1247[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1247[arg0][arg1][arg2] = field1247[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("au.j(IIIII)I")
    public static final int method2948(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class153.field2299[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }
}
