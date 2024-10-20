package deob;

@ObfuscatedName("p")
public final class class6 {

    @ObfuscatedName("p.x")
    public static int[][][] field87 = new int[4][105][105];

    @ObfuscatedName("p.v")
    public static byte[][][] field71 = new byte[4][104][104];

    @ObfuscatedName("p.m")
    public static int field72 = 99;

    @ObfuscatedName("p.f")
    public static final int[] field78 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("p.t")
    public static final int[] field79 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("p.o")
    public static final int[] field80 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("p.z")
    public static final int[] field89 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("p.d")
    public static final int[] field90 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("p.y")
    public static final int[] field83 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("p.a")
    public static int field84 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("p.n")
    public static int field85 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.x(I)V")
    public static void method499() {
        Statics.field73 = (byte[][][]) null;
        Statics.field2932 = (byte[][][]) null;
        Statics.field74 = (byte[][][]) null;
        Statics.field3012 = (byte[][][]) null;
        Statics.field77 = (int[][][]) null;
        Statics.field1280 = (byte[][][]) null;
        Statics.field1531 = (int[][]) null;
        Statics.field1765 = null;
        Statics.field75 = null;
        Statics.field1927 = null;
        Statics.field76 = null;
        Statics.field2076 = null;
    }

    @ObfuscatedName("d.v(IIIII)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1280[0][var5][var4] = 127;
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

    @ObfuscatedName("ev.m([BIIII[Lhq;I)V")
    public static final void method2900(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class209[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3005[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class108 var9 = new class108(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2076(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("db.e(Ldm;IIIIIII)V")
    public static final void method2076(class108 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2299();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2299();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2299();
                }
            }
            return;
        }
        field71[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2299();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field87[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method76(var10 + 45365, var11 + 91923, 4) - 128 + (method76(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method76(var10, var11, 1) - 128 >> 2);
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
                int var15 = arg0.method2299();
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
                Statics.field2932[arg1][arg2][arg3] = arg0.method2128();
                Statics.field74[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3012[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field71[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field73[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fk.h([BIII)Z")
    public static final boolean method3170(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class108 var4 = new class108(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2125();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2125();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2299() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class37 var16 = class37.method96(var5);
                        if (var13 != 22 || !client.field244 || var16.field894 != 0 || var16.field867 == 1 || var16.field888) {
                            if (!var16.method670()) {
                                client.field468++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2125();
                if (var9 == 0) {
                    break;
                }
                var4.method2299();
            }
        }
    }

    @ObfuscatedName("ag.p([BIILcq;[Lhq;I)V")
    public static final void method597(byte[] arg0, int arg1, int arg2, class80 arg3, class209[] arg4) {
        class108 var5 = new class108(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2125();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2125();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2299();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field71[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class209 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    Statics.method849(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("j.u(IIII)I")
    public static final int method76(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2079(var3, var5);
        int var8 = method2079(var3 + 1, var5);
        int var9 = method2079(var3, var5 + 1);
        int var10 = method2079(var3 + 1, var5 + 1);
        int var11 = Statics.method1330(var7, var8, var4, arg2);
        int var12 = Statics.method1330(var9, var10, var4, arg2);
        return Statics.method1330(var11, var12, var6, arg2);
    }

    @ObfuscatedName("db.k(III)I")
    public static final int method2079(int arg0, int arg1) {
        int var2 = Statics.method2523(arg0 - 1, arg1 - 1) + Statics.method2523(arg0 + 1, arg1 - 1) + Statics.method2523(arg0 - 1, arg1 + 1) + Statics.method2523(arg0 + 1, arg1 + 1);
        int var3 = Statics.method2523(arg0 - 1, arg1) + Statics.method2523(arg0 + 1, arg1) + Statics.method2523(arg0, arg1 - 1) + Statics.method2523(arg0, arg1 + 1);
        int var4 = Statics.method2523(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("n.b(III)I")
    public static final int method537(int arg0, int arg1) {
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

    @ObfuscatedName("ei.w(IIB)I")
    public static final int method2702(int arg0, int arg1) {
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

    @ObfuscatedName("db.g(IIII)I")
    public static final int method2080(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dp.s(IIB)Z")
    public static final boolean method2394(int arg0, int arg1) {
        class37 var2 = class37.method96(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method689(arg1);
    }
}
