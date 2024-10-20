package deob;

@ObfuscatedName("c")
public final class class9 {

    @ObfuscatedName("c.p")
    public static int[][][] field156 = new int[4][105][105];

    @ObfuscatedName("c.j")
    public static byte[][][] field136 = new byte[4][104][104];

    @ObfuscatedName("c.w")
    public static int field137 = 99;

    @ObfuscatedName("c.d")
    public static final int[] field145 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.f")
    public static final int[] field146 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.a")
    public static final int[] field147 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.x")
    public static final int[] field141 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.r")
    public static final int[] field149 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.t")
    public static final int[] field150 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.b")
    public static int field139 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.q")
    public static int field152 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.p(IIIII)V")
    public static final void method646(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field364[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field156[0][var5][var4] = field156[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field156[0][var5][var4] = field156[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field156[0][var5][var4] = field156[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field156[0][var5][var4] = field156[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.j([BIIII[Lfe;I)V")
    public static final void method651(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class163[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2742[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class126 var9 = new class126(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("p.w(Ldv;IIIIIII)V")
    public static final void method2(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2544();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2544();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2544();
                }
            }
            return;
        }
        field136[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2544();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field156[0][arg2][arg3] = -method2080(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field156[arg1][arg2][arg3] = field156[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2544();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field156[0][arg2][arg3] = -var8 * 8;
                } else {
                    field156[arg1][arg2][arg3] = field156[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field142[arg1][arg2][arg3] = arg0.method2376();
                Statics.field140[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field361[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field136[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field138[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ck.h([BIII)Z")
    public static final boolean method1612(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class126 var4 = new class126(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2388();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2388();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2544() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class31 var16 = class31.method187(var5);
                        if (var13 != 22 || !client.field634 || var16.field834 != 0 || var16.field849 == 1 || var16.field857) {
                            if (!var16.method633()) {
                                client.field477++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2388();
                if (var9 == 0) {
                    break;
                }
                var4.method2544();
            }
        }
    }

    @ObfuscatedName("z.v([BIILcp;[Lfe;S)V")
    public static final void method130(byte[] arg0, int arg1, int arg2, class94 arg3, class163[] arg4) {
        class126 var5 = new class126(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2388();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2388();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2544();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field136[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class163 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1232(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("a.k([BIIIIIIILcp;[Lfe;B)V")
    public static final void method210(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8, class163[] arg9) {
        class126 var10 = new class126(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2388();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2388();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2544();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class31 var21 = class31.method187(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field830;
                    int var27 = var21.field831;
                    if ((var20 & 0x1) == 1) {
                        int var28 = var26;
                        var26 = var27;
                        var27 = var28;
                    }
                    int var29 = arg7 & 0x3;
                    int var30;
                    if (var29 == 0) {
                        var30 = var23;
                    } else if (var29 == 1) {
                        var30 = var24;
                    } else if (var29 == 2) {
                        var30 = 7 - var23 - (var26 - 1);
                    } else {
                        var30 = 7 - var24 - (var27 - 1);
                    }
                    int var31 = arg2 + var30;
                    int var32 = arg3 + class159.method505(var16 & 0x7, var15 & 0x7, arg7, var21.field830, var21.field831, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field136[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class163 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method1232(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.g(IIIIIILcp;Lfe;S)V")
    public static final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class94 arg6, class163 arg7) {
        if (client.field634 && (field136[0][arg1][arg2] & 0x2) == 0) {
            if ((field136[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field136[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field136[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field530 != var8) {
                return;
            }
        }
        if (arg0 < field137) {
            field137 = arg0;
        }
        class31 var9 = class31.method187(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field831;
            var11 = var9.field830;
        } else {
            var10 = var9.field830;
            var11 = var9.field831;
        }
        int var12;
        int var13;
        if (arg1 + var10 <= 104) {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        } else {
            var12 = arg1;
            var13 = arg1 + 1;
        }
        int var14;
        int var15;
        if (arg2 + var11 <= 104) {
            var14 = (var11 >> 1) + arg2;
            var15 = (var11 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int[][] var16 = field156[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field834 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field821 == 1) {
            var21 += 256;
        }
        if (var9.method636()) {
            class7 var22 = new class7();
            var22.field98 = arg0;
            var22.field109 = arg1 * 128;
            var22.field100 = arg2 * 128;
            int var23 = var9.field830;
            int var24 = var9.field831;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field831;
                var24 = var9.field830;
            }
            var22.field118 = (arg1 + var23) * 128;
            var22.field102 = (arg2 + var24) * 128;
            var22.field110 = var9.field860;
            var22.field103 = var9.field861 * 128;
            var22.field106 = var9.field862;
            var22.field107 = var9.field863;
            var22.field108 = var9.field864;
            if (var9.field851 != null) {
                var22.field101 = var9;
                var22.method52();
            }
            class7.field121.method3305(var22);
            if (var22.field108 != null) {
                var22.field97 = var22.field106 + (int) (Math.random() * (double) (var22.field107 - var22.field106));
            }
        }
        if (arg5 == 22) {
            if (!client.field634 || var9.field834 != 0 || var9.field849 == 1 || var9.field857) {
                class93 var25;
                if (var9.field838 == -1 && var9.field851 == null) {
                    var25 = var9.method603(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
                }
                arg6.method1904(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field849 == 1 && arg7 != null) {
                    arg7.method3161(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class93 var48;
            if (var9.field838 == -1 && var9.field851 == null) {
                var48 = var9.method603(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            if (var48 != null && arg6.method1872(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field817) {
                int var49 = 15;
                if (var48 instanceof class111) {
                    var49 = ((class111) var48).method2185() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field364[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field364[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3159(arg1, arg2, var10, var11, var9.field832);
            }
        } else if (arg5 >= 12) {
            class93 var26;
            if (var9.field838 == -1 && var9.field851 == null) {
                var26 = var9.method603(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1872(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field34[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3159(arg1, arg2, var10, var11, var9.field832);
            }
        } else if (arg5 == 0) {
            class93 var27;
            if (var9.field838 == -1 && var9.field851 == null) {
                var27 = var9.method603(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1841(arg0, arg1, arg2, var17, var27, (class93) null, field145[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field817) {
                    Statics.field364[arg0][arg1][arg2] = 50;
                    Statics.field364[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field823) {
                    Statics.field34[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field817) {
                    Statics.field364[arg0][arg1][arg2 + 1] = 50;
                    Statics.field364[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field823) {
                    Statics.field34[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field817) {
                    Statics.field364[arg0][arg1 + 1][arg2] = 50;
                    Statics.field364[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field823) {
                    Statics.field34[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field817) {
                    Statics.field364[arg0][arg1][arg2] = 50;
                    Statics.field364[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field823) {
                    Statics.field34[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3158(arg1, arg2, arg5, arg4, var9.field832);
            }
            if (var9.field840 != 16) {
                arg6.method1949(arg0, arg1, arg2, var9.field840);
            }
        } else if (arg5 == 1) {
            class93 var28;
            if (var9.field838 == -1 && var9.field851 == null) {
                var28 = var9.method603(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1841(arg0, arg1, arg2, var17, var28, (class93) null, field146[arg4], 0, var20, var21);
            if (var9.field817) {
                if (arg4 == 0) {
                    Statics.field364[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field364[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field364[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field364[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3158(arg1, arg2, arg5, arg4, var9.field832);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class93 var30;
            class93 var31;
            if (var9.field838 == -1 && var9.field851 == null) {
                var30 = var9.method603(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method603(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field838, true, (class93) null);
                var31 = new class13(arg3, 2, var29, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1841(arg0, arg1, arg2, var17, var30, var31, field145[arg4], field145[var29], var20, var21);
            if (var9.field823) {
                if (arg4 == 0) {
                    Statics.field34[arg0][arg1][arg2] |= 0x249;
                    Statics.field34[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field34[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field34[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field34[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field34[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field34[arg0][arg1][arg2] |= 0x492;
                    Statics.field34[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3158(arg1, arg2, arg5, arg4, var9.field832);
            }
            if (var9.field840 != 16) {
                arg6.method1949(arg0, arg1, arg2, var9.field840);
            }
        } else if (arg5 == 3) {
            class93 var32;
            if (var9.field838 == -1 && var9.field851 == null) {
                var32 = var9.method603(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1841(arg0, arg1, arg2, var17, var32, (class93) null, field146[arg4], 0, var20, var21);
            if (var9.field817) {
                if (arg4 == 0) {
                    Statics.field364[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field364[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field364[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field364[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3158(arg1, arg2, arg5, arg4, var9.field832);
            }
        } else if (arg5 == 9) {
            class93 var33;
            if (var9.field838 == -1 && var9.field851 == null) {
                var33 = var9.method603(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1872(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3159(arg1, arg2, var10, var11, var9.field832);
            }
            if (var9.field840 != 16) {
                arg6.method1949(arg0, arg1, arg2, var9.field840);
            }
        } else if (arg5 == 4) {
            class93 var34;
            if (var9.field838 == -1 && var9.field851 == null) {
                var34 = var9.method603(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1924(arg0, arg1, arg2, var17, var34, (class93) null, field145[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1843(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class31.method187(var36 >> 14 & 0x7FFF).field840;
            }
            class93 var37;
            if (var9.field838 == -1 && var9.field851 == null) {
                var37 = var9.method603(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1924(arg0, arg1, arg2, var17, var37, (class93) null, field145[arg4], 0, field147[arg4] * var35, field141[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1843(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class31.method187(var39 >> 14 & 0x7FFF).field840 / 2;
            }
            class93 var40;
            if (var9.field838 == -1 && var9.field851 == null) {
                var40 = var9.method603(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1924(arg0, arg1, arg2, var17, var40, (class93) null, 256, arg4, field149[arg4] * var38, field150[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class93 var42;
            if (var9.field838 == -1 && var9.field851 == null) {
                var42 = var9.method603(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1924(arg0, arg1, arg2, var17, var42, (class93) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1843(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class31.method187(var44 >> 14 & 0x7FFF).field840 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class93 var46;
            class93 var47;
            if (var9.field838 == -1 && var9.field851 == null) {
                var46 = var9.method603(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method603(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field838, true, (class93) null);
                var47 = new class13(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field838, true, (class93) null);
            }
            arg6.method1924(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field149[arg4] * var43, field150[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("er.n(Lcp;[Lfe;B)V")
    public static final void method2979(class94 arg0, class163[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field136[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field136[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3180(var3, var4);
                        }
                    }
                }
            }
        }
        field139 += (int) (Math.random() * 5.0D) - 2;
        if (field139 < -8) {
            field139 = -8;
        }
        if (field139 > 8) {
            field139 = 8;
        }
        field152 += (int) (Math.random() * 5.0D) - 2;
        if (field152 < -16) {
            field152 = -16;
        }
        if (field152 > 16) {
            field152 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field364[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field156[var6][var11 + 1][var10] - field156[var6][var11 - 1][var10];
                    int var13 = field156[var6][var11][var10 + 1] - field156[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field151[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field148[var20] = 0;
                Statics.field153[var20] = 0;
                Statics.field144[var20] = 0;
                Statics.field1383[var20] = 0;
                Statics.field1819[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field138[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class32 var25 = class32.method1130(var24 - 1);
                            Statics.field148[var22] += var25.field871;
                            Statics.field153[var22] += var25.field870;
                            Statics.field144[var22] += var25.field875;
                            Statics.field1383[var22] += var25.field872;
                            var10002 = Statics.field1819[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field138[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class32 var28 = class32.method1130(var27 - 1);
                            Statics.field148[var22] -= var28.field871;
                            Statics.field153[var22] -= var28.field870;
                            Statics.field144[var22] -= var28.field875;
                            Statics.field1383[var22] -= var28.field872;
                            var10002 = Statics.field1819[var22]--;
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
                            var29 += Statics.field148[var35];
                            var30 += Statics.field153[var35];
                            var31 += Statics.field144[var35];
                            var32 += Statics.field1383[var35];
                            var33 += Statics.field1819[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field148[var36];
                            var30 -= Statics.field153[var36];
                            var31 -= Statics.field144[var36];
                            var32 -= Statics.field1383[var36];
                            var33 -= Statics.field1819[var36];
                        }
                        if (var34 >= 1 && var34 < 103) {
                            if (client.field634 && (field136[0][var21][var34] & 0x2) == 0) {
                                if ((field136[var6][var21][var34] & 0x10) != 0) {
                                    continue;
                                }
                                int var37;
                                if ((field136[var6][var21][var34] & 0x8) != 0) {
                                    var37 = 0;
                                } else if (var6 <= 0 || (field136[1][var21][var34] & 0x2) == 0) {
                                    var37 = var6;
                                } else {
                                    var37 = var6 - 1;
                                }
                                if (client.field530 != var37) {
                                    continue;
                                }
                            }
                            if (var6 < field137) {
                                field137 = var6;
                            }
                            int var38 = Statics.field138[var6][var21][var34] & 0xFF;
                            int var39 = Statics.field142[var6][var21][var34] & 0xFF;
                            if (var38 > 0 || var39 > 0) {
                                int var40 = field156[var6][var21][var34];
                                int var41 = field156[var6][var21 + 1][var34];
                                int var42 = field156[var6][var21 + 1][var34 + 1];
                                int var43 = field156[var6][var21][var34 + 1];
                                int var44 = Statics.field151[var21][var34];
                                int var45 = Statics.field151[var21 + 1][var34];
                                int var46 = Statics.field151[var21 + 1][var34 + 1];
                                int var47 = Statics.field151[var21][var34 + 1];
                                int var48 = -1;
                                int var49 = -1;
                                if (var38 > 0) {
                                    int var50 = var29 * 256 / var32;
                                    int var51 = var30 / var33;
                                    int var52 = var31 / var33;
                                    var48 = Statics.method2356(var50, var51, var52);
                                    int var53 = field139 + var50 & 0xFF;
                                    int var54 = field152 + var52;
                                    if (var54 < 0) {
                                        var54 = 0;
                                    } else if (var54 > 255) {
                                        var54 = 255;
                                    }
                                    var49 = Statics.method2356(var53, var51, var54);
                                }
                                if (var6 > 0) {
                                    boolean var55 = true;
                                    if (var38 == 0 && Statics.field140[var6][var21][var34] != 0) {
                                        var55 = false;
                                    }
                                    if (var39 > 0 && !Statics.method47(var39 - 1).field937) {
                                        var55 = false;
                                    }
                                    if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
                                        Statics.field34[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var56 = 0;
                                if (var49 != -1) {
                                    var56 = class103.field1786[method1616(var49, 96)];
                                }
                                if (var39 == 0) {
                                    arg0.method1903(var6, var21, var34, 0, 0, -1, var40, var41, var42, var43, method1616(var48, var44), method1616(var48, var45), method1616(var48, var46), method1616(var48, var47), 0, 0, 0, 0, var56, 0);
                                } else {
                                    int var57 = Statics.field140[var6][var21][var34] + 1;
                                    byte var58 = Statics.field361[var6][var21][var34];
                                    class36 var59 = Statics.method47(var39 - 1);
                                    int var60 = var59.field948;
                                    int var61;
                                    int var62;
                                    if (var60 >= 0) {
                                        var61 = Statics.field1789.method2145(var60);
                                        var62 = -1;
                                    } else if (var59.field935 == 16711935) {
                                        var62 = -2;
                                        var60 = -1;
                                        var61 = -2;
                                    } else {
                                        var62 = Statics.method2356(var59.field946, var59.field940, var59.field939);
                                        int var63 = field139 + var59.field946 & 0xFF;
                                        int var64 = field152 + var59.field939;
                                        if (var64 < 0) {
                                            var64 = 0;
                                        } else if (var64 > 255) {
                                            var64 = 255;
                                        }
                                        var61 = Statics.method2356(var63, var59.field940, var64);
                                    }
                                    int var65 = 0;
                                    if (var61 != -2) {
                                        var65 = class103.field1786[method51(var61, 96)];
                                    }
                                    if (var59.field938 != -1) {
                                        int var66 = field139 + var59.field942 & 0xFF;
                                        int var67 = field152 + var59.field944;
                                        if (var67 < 0) {
                                            var67 = 0;
                                        } else if (var67 > 255) {
                                            var67 = 255;
                                        }
                                        int var68 = Statics.method2356(var66, var59.field943, var67);
                                        var65 = class103.field1786[method51(var68, 96)];
                                    }
                                    arg0.method1903(var6, var21, var34, var57, var58, var60, var40, var41, var42, var43, method1616(var48, var44), method1616(var48, var45), method1616(var48, var46), method1616(var48, var47), method51(var62, var44), method51(var62, var45), method51(var62, var46), method51(var62, var47), var56, var65);
                                }
                            }
                        }
                    }
                }
            }
            for (int var69 = 1; var69 < 103; var69++) {
                for (int var70 = 1; var70 < 103; var70++) {
                    int var75;
                    if ((field136[var6][var70][var69] & 0x8) != 0) {
                        var75 = 0;
                    } else if (var6 <= 0 || (field136[1][var70][var69] & 0x2) == 0) {
                        var75 = var6;
                    } else {
                        var75 = var6 - 1;
                    }
                    arg0.method1837(var6, var70, var69, var75);
                }
            }
            Statics.field138[var6] = (byte[][]) null;
            Statics.field142[var6] = (byte[][]) null;
            Statics.field140[var6] = (byte[][]) null;
            Statics.field361[var6] = (byte[][]) null;
            Statics.field364[var6] = (byte[][]) null;
        }
        arg0.method1864(-50, -10, -50);
        for (int var76 = 0; var76 < 104; var76++) {
            for (int var77 = 0; var77 < 104; var77++) {
                if ((field136[1][var76][var77] & 0x2) == 2) {
                    arg0.method1835(var76, var77);
                }
            }
        }
        int var78 = 1;
        int var79 = 2;
        int var80 = 4;
        for (int var81 = 0; var81 < 4; var81++) {
            if (var81 > 0) {
                var78 <<= 0x3;
                var79 <<= 0x3;
                var80 <<= 0x3;
            }
            for (int var82 = 0; var82 <= var81; var82++) {
                for (int var83 = 0; var83 <= 104; var83++) {
                    for (int var84 = 0; var84 <= 104; var84++) {
                        if ((Statics.field34[var82][var84][var83] & var78) != 0) {
                            int var85 = var83;
                            int var86 = var83;
                            int var87 = var82;
                            int var88 = var82;
                            while (var85 > 0 && (Statics.field34[var82][var84][var85 - 1] & var78) != 0) {
                                var85--;
                            }
                            while (var86 < 104 && (Statics.field34[var82][var84][var86 + 1] & var78) != 0) {
                                var86++;
                            }
                            label351: while (var87 > 0) {
                                for (int var89 = var85; var89 <= var86; var89++) {
                                    if ((Statics.field34[var87 - 1][var84][var89] & var78) == 0) {
                                        break label351;
                                    }
                                }
                                var87--;
                            }
                            label340: while (var88 < var81) {
                                for (int var90 = var85; var90 <= var86; var90++) {
                                    if ((Statics.field34[var88 + 1][var84][var90] & var78) == 0) {
                                        break label340;
                                    }
                                }
                                var88++;
                            }
                            int var91 = (var88 + 1 - var87) * (var86 - var85 + 1);
                            if (var91 >= 8) {
                                short var92 = 240;
                                int var93 = field156[var88][var84][var85] - var92;
                                int var94 = field156[var87][var84][var85];
                                class94.method1943(var81, 1, var84 * 128, var84 * 128, var85 * 128, var86 * 128 + 128, var93, var94);
                                for (int var95 = var87; var95 <= var88; var95++) {
                                    for (int var96 = var85; var96 <= var86; var96++) {
                                        Statics.field34[var95][var84][var96] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field34[var82][var84][var83] & var79) != 0) {
                            int var97 = var84;
                            int var98 = var84;
                            int var99 = var82;
                            int var100 = var82;
                            while (var97 > 0 && (Statics.field34[var82][var97 - 1][var83] & var79) != 0) {
                                var97--;
                            }
                            while (var98 < 104 && (Statics.field34[var82][var98 + 1][var83] & var79) != 0) {
                                var98++;
                            }
                            label404: while (var99 > 0) {
                                for (int var101 = var97; var101 <= var98; var101++) {
                                    if ((Statics.field34[var99 - 1][var101][var83] & var79) == 0) {
                                        break label404;
                                    }
                                }
                                var99--;
                            }
                            label393: while (var100 < var81) {
                                for (int var102 = var97; var102 <= var98; var102++) {
                                    if ((Statics.field34[var100 + 1][var102][var83] & var79) == 0) {
                                        break label393;
                                    }
                                }
                                var100++;
                            }
                            int var103 = (var100 + 1 - var99) * (var98 - var97 + 1);
                            if (var103 >= 8) {
                                short var104 = 240;
                                int var105 = field156[var100][var97][var83] - var104;
                                int var106 = field156[var99][var97][var83];
                                class94.method1943(var81, 2, var97 * 128, var98 * 128 + 128, var83 * 128, var83 * 128, var105, var106);
                                for (int var107 = var99; var107 <= var100; var107++) {
                                    for (int var108 = var97; var108 <= var98; var108++) {
                                        Statics.field34[var107][var108][var83] &= ~var79;
                                    }
                                }
                            }
                        }
                        if ((Statics.field34[var82][var84][var83] & var80) != 0) {
                            int var109 = var84;
                            int var110 = var84;
                            int var111 = var83;
                            int var112 = var83;
                            while (var111 > 0 && (Statics.field34[var82][var84][var111 - 1] & var80) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field34[var82][var84][var112 + 1] & var80) != 0) {
                                var112++;
                            }
                            label457: while (var109 > 0) {
                                for (int var113 = var111; var113 <= var112; var113++) {
                                    if ((Statics.field34[var82][var109 - 1][var113] & var80) == 0) {
                                        break label457;
                                    }
                                }
                                var109--;
                            }
                            label446: while (var110 < 104) {
                                for (int var114 = var111; var114 <= var112; var114++) {
                                    if ((Statics.field34[var82][var110 + 1][var114] & var80) == 0) {
                                        break label446;
                                    }
                                }
                                var110++;
                            }
                            if ((var110 - var109 + 1) * (var112 - var111 + 1) >= 4) {
                                int var115 = field156[var82][var109][var111];
                                class94.method1943(var81, 4, var109 * 128, var110 * 128 + 128, var111 * 128, var112 * 128 + 128, var115, var115);
                                for (int var116 = var109; var116 <= var110; var116++) {
                                    for (int var117 = var111; var117 <= var112; var117++) {
                                        Statics.field34[var82][var116][var117] &= ~var80;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.c(IIB)I")
    public static final int method2080(int arg0, int arg1) {
        int var2 = method139(arg0 + 45365, arg1 + 91923, 4) - 128 + (method139(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method139(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("l.o(IIIB)I")
    public static final int method139(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2251(var3, var5);
        int var8 = method2251(var3 + 1, var5);
        int var9 = method2251(var3, var5 + 1);
        int var10 = method2251(var3 + 1, var5 + 1);
        int var11 = method1996(var7, var8, var4, arg2);
        int var12 = method1996(var9, var10, var4, arg2);
        return method1996(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ch.u(IIIIB)I")
    public static final int method1996(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class103.field1787[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("dj.z(III)I")
    public static final int method2251(int arg0, int arg1) {
        int var2 = method2081(arg0 - 1, arg1 - 1) + method2081(arg0 + 1, arg1 - 1) + method2081(arg0 - 1, arg1 + 1) + method2081(arg0 + 1, arg1 + 1);
        int var3 = method2081(arg0 - 1, arg1) + method2081(arg0 + 1, arg1) + method2081(arg0, arg1 - 1) + method2081(arg0, arg1 + 1);
        int var4 = method2081(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cf.e(III)I")
    public static final int method2081(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ck.l(III)I")
    public static final int method1616(int arg0, int arg1) {
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

    @ObfuscatedName("k.m(III)I")
    public static final int method51(int arg0, int arg1) {
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

    @ObfuscatedName("k.i(IIIIIIILcp;Lfe;I)V")
    public static final void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class94 arg7, class163 arg8) {
        class31 var9 = class31.method187(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field831;
            var11 = var9.field830;
        } else {
            var10 = var9.field830;
            var11 = var9.field831;
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
        int[][] var16 = field156[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field834 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field821 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class93 var22;
            if (var9.field838 == -1 && var9.field851 == null) {
                var22 = var9.method604(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1904(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field849 == 1) {
                arg8.method3161(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class93 var45;
            if (var9.field838 == -1 && var9.field851 == null) {
                var45 = var9.method604(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            if (var45 != null) {
                arg7.method1872(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field849 != 0) {
                arg8.method3159(arg2, arg3, var10, var11, var9.field832);
            }
        } else if (arg6 >= 12) {
            class93 var23;
            if (var9.field838 == -1 && var9.field851 == null) {
                var23 = var9.method604(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1872(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3159(arg2, arg3, var10, var11, var9.field832);
            }
        } else if (arg6 == 0) {
            class93 var24;
            if (var9.field838 == -1 && var9.field851 == null) {
                var24 = var9.method604(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1841(arg0, arg2, arg3, var17, var24, (class93) null, field145[arg5], 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3158(arg2, arg3, arg6, arg5, var9.field832);
            }
        } else if (arg6 == 1) {
            class93 var25;
            if (var9.field838 == -1 && var9.field851 == null) {
                var25 = var9.method604(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1841(arg0, arg2, arg3, var17, var25, (class93) null, field146[arg5], 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3158(arg2, arg3, arg6, arg5, var9.field832);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class93 var27;
            class93 var28;
            if (var9.field838 == -1 && var9.field851 == null) {
                var27 = var9.method604(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method604(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field838, true, (class93) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1841(arg0, arg2, arg3, var17, var27, var28, field145[arg5], field145[var26], var20, var21);
            if (var9.field849 != 0) {
                arg8.method3158(arg2, arg3, arg6, arg5, var9.field832);
            }
        } else if (arg6 == 3) {
            class93 var29;
            if (var9.field838 == -1 && var9.field851 == null) {
                var29 = var9.method604(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1841(arg0, arg2, arg3, var17, var29, (class93) null, field146[arg5], 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3158(arg2, arg3, arg6, arg5, var9.field832);
            }
        } else if (arg6 == 9) {
            class93 var30;
            if (var9.field838 == -1 && var9.field851 == null) {
                var30 = var9.method604(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1872(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field849 != 0) {
                arg8.method3159(arg2, arg3, var10, var11, var9.field832);
            }
        } else if (arg6 == 4) {
            class93 var31;
            if (var9.field838 == -1 && var9.field851 == null) {
                var31 = var9.method604(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1924(arg0, arg2, arg3, var17, var31, (class93) null, field145[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1843(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class31.method187(var33 >> 14 & 0x7FFF).field840;
            }
            class93 var34;
            if (var9.field838 == -1 && var9.field851 == null) {
                var34 = var9.method604(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1924(arg0, arg2, arg3, var17, var34, (class93) null, field145[arg5], 0, field147[arg5] * var32, field141[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1843(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class31.method187(var36 >> 14 & 0x7FFF).field840 / 2;
            }
            class93 var37;
            if (var9.field838 == -1 && var9.field851 == null) {
                var37 = var9.method604(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1924(arg0, arg2, arg3, var17, var37, (class93) null, 256, arg5, field149[arg5] * var35, field150[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class93 var39;
            if (var9.field838 == -1 && var9.field851 == null) {
                var39 = var9.method604(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1924(arg0, arg2, arg3, var17, var39, (class93) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1843(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class31.method187(var41 >> 14 & 0x7FFF).field840 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class93 var43;
            class93 var44;
            if (var9.field838 == -1 && var9.field851 == null) {
                var43 = var9.method604(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method604(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field838, true, (class93) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field838, true, (class93) null);
            }
            arg7.method1924(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field149[arg5] * var40, field150[arg5] * var40, var20, var21);
        }
    }
}
