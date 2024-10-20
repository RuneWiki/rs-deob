package deob;

@ObfuscatedName("y")
public final class class6 {

    @ObfuscatedName("y.b")
    public static int[][][] field84 = new int[4][105][105];

    @ObfuscatedName("y.g")
    public static byte[][][] field70 = new byte[4][104][104];

    @ObfuscatedName("y.j")
    public static int field71 = 99;

    @ObfuscatedName("y.v")
    public static final int[] field76 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("y.a")
    public static final int[] field69 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("y.f")
    public static final int[] field89 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("y.q")
    public static final int[] field78 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("y.m")
    public static final int[] field77 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("y.s")
    public static final int[] field81 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("y.i")
    public static int field79 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("y.e")
    public static int field82 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.b(I)V")
    public static void method3163() {
        field71 = 99;
        Statics.field72 = new byte[4][104][104];
        Statics.field73 = new byte[4][104][104];
        Statics.field74 = new byte[4][104][104];
        Statics.field1068 = new byte[4][104][104];
        Statics.field2226 = new int[4][105][105];
        Statics.field92 = new byte[4][105][105];
        Statics.field958 = new int[105][105];
        Statics.field145 = new int[104];
        Statics.field213 = new int[104];
        Statics.field955 = new int[104];
        Statics.field1357 = new int[104];
        Statics.field162 = new int[104];
    }

    @ObfuscatedName("o.g(IIIII)V")
    public static final void method172(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field92[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field84[0][var5][var4] = field84[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field84[0][var5][var4] = field84[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field84[0][var5][var4] = field84[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field84[0][var5][var4] = field84[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.j(IIII)V")
    public static final void method783(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field84[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field84[arg0][arg1][arg2 + var5] = field84[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field84[arg0][arg1 + var6][arg2] = field84[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field84[arg0][arg1 - 1][arg2] != 0) {
            field84[arg0][arg1][arg2] = field84[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field84[arg0][arg1][arg2 - 1] != 0) {
            field84[arg0][arg1][arg2] = field84[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field84[arg0][arg1 - 1][arg2 - 1] != 0) {
            field84[arg0][arg1][arg2] = field84[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("fr.d(Lds;IIIIIIB)V")
    public static final void method3229(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2344();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2344();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2344();
                }
            }
            return;
        }
        field70[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2344();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field84[0][arg2][arg3] = -method159(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field84[arg1][arg2][arg3] = field84[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2344();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field84[0][arg2][arg3] = -var8 * 8;
                } else {
                    field84[arg1][arg2][arg3] = field84[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field73[arg1][arg2][arg3] = arg0.method2345();
                Statics.field74[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1068[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field70[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field72[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("k.x([BIIB)Z")
    public static final boolean method163(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class120 var4 = new class120(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2472();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2472();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2344() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method3164(var5);
                        if (var13 != 22 || !client.field384 || var16.field920 != 0 || var16.field918 == 1 || var16.field939) {
                            if (!var16.method785()) {
                                client.field347++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2472();
                if (var9 == 0) {
                    break;
                }
                var4.method2344();
            }
        }
    }

    @ObfuscatedName("g.y(IIIIIILcb;Ldr;I)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, class109 arg7) {
        if (client.field384 && (field70[0][arg1][arg2] & 0x2) == 0 && (field70[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field71) {
            field71 = arg0;
        }
        class41 var8 = class41.method3164(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field905;
            var10 = var8.field916;
        } else {
            var9 = var8.field916;
            var10 = var8.field905;
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
        int[][] var15 = field84[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field920 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field941 == 1) {
            var20 += 256;
        }
        if (var8.method791()) {
            class24.method160(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field384 || var8.field920 != 0 || var8.field918 == 1 || var8.field939) {
                class86 var21;
                if (var8.field946 == -1 && var8.field950 == null) {
                    var21 = var8.method814(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
                }
                arg6.method1787(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field918 == 1 && arg7 != null) {
                    arg7.method2228(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class86 var44;
            if (var8.field946 == -1 && var8.field950 == null) {
                var44 = var8.method814(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            if (var44 != null && arg6.method1801(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field922) {
                int var45 = 15;
                if (var44 instanceof class106) {
                    var45 = ((class106) var44).method2180() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field92[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field92[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field918 != 0 && arg7 != null) {
                arg7.method2226(arg1, arg2, var9, var10, var8.field919);
            }
        } else if (arg5 >= 12) {
            class86 var22;
            if (var8.field946 == -1 && var8.field950 == null) {
                var22 = var8.method814(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1801(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2226[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field918 != 0 && arg7 != null) {
                arg7.method2226(arg1, arg2, var9, var10, var8.field919);
            }
        } else if (arg5 == 0) {
            class86 var23;
            if (var8.field946 == -1 && var8.field950 == null) {
                var23 = var8.method814(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, var23, (class86) null, field76[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field922) {
                    Statics.field92[arg0][arg1][arg2] = 50;
                    Statics.field92[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field923) {
                    Statics.field2226[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field922) {
                    Statics.field92[arg0][arg1][arg2 + 1] = 50;
                    Statics.field92[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field923) {
                    Statics.field2226[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field922) {
                    Statics.field92[arg0][arg1 + 1][arg2] = 50;
                    Statics.field92[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field923) {
                    Statics.field2226[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field922) {
                    Statics.field92[arg0][arg1][arg2] = 50;
                    Statics.field92[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field923) {
                    Statics.field2226[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field918 != 0 && arg7 != null) {
                arg7.method2225(arg1, arg2, arg5, arg4, var8.field919);
            }
            if (var8.field909 != 16) {
                arg6.method1797(arg0, arg1, arg2, var8.field909);
            }
        } else if (arg5 == 1) {
            class86 var24;
            if (var8.field946 == -1 && var8.field950 == null) {
                var24 = var8.method814(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, var24, (class86) null, field69[arg4], 0, var19, var20);
            if (var8.field922) {
                if (arg4 == 0) {
                    Statics.field92[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field92[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field92[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field92[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field918 != 0 && arg7 != null) {
                arg7.method2225(arg1, arg2, arg5, arg4, var8.field919);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class86 var26;
            class86 var27;
            if (var8.field946 == -1 && var8.field950 == null) {
                var26 = var8.method814(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method814(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field946, true, (class86) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, var26, var27, field76[arg4], field76[var25], var19, var20);
            if (var8.field923) {
                if (arg4 == 0) {
                    Statics.field2226[arg0][arg1][arg2] |= 0x249;
                    Statics.field2226[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2226[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2226[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2226[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2226[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2226[arg0][arg1][arg2] |= 0x492;
                    Statics.field2226[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field918 != 0 && arg7 != null) {
                arg7.method2225(arg1, arg2, arg5, arg4, var8.field919);
            }
            if (var8.field909 != 16) {
                arg6.method1797(arg0, arg1, arg2, var8.field909);
            }
        } else if (arg5 == 3) {
            class86 var28;
            if (var8.field946 == -1 && var8.field950 == null) {
                var28 = var8.method814(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1789(arg0, arg1, arg2, var16, var28, (class86) null, field69[arg4], 0, var19, var20);
            if (var8.field922) {
                if (arg4 == 0) {
                    Statics.field92[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field92[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field92[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field92[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field918 != 0 && arg7 != null) {
                arg7.method2225(arg1, arg2, arg5, arg4, var8.field919);
            }
        } else if (arg5 == 9) {
            class86 var29;
            if (var8.field946 == -1 && var8.field950 == null) {
                var29 = var8.method814(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1801(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field918 != 0 && arg7 != null) {
                arg7.method2226(arg1, arg2, var9, var10, var8.field919);
            }
            if (var8.field909 != 16) {
                arg6.method1797(arg0, arg1, arg2, var8.field909);
            }
        } else if (arg5 == 4) {
            class86 var30;
            if (var8.field946 == -1 && var8.field950 == null) {
                var30 = var8.method814(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1909(arg0, arg1, arg2, var16, var30, (class86) null, field76[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1807(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method3164(var32 >> 14 & 0x7FFF).field909;
            }
            class86 var33;
            if (var8.field946 == -1 && var8.field950 == null) {
                var33 = var8.method814(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1909(arg0, arg1, arg2, var16, var33, (class86) null, field76[arg4], 0, field89[arg4] * var31, field78[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1807(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method3164(var35 >> 14 & 0x7FFF).field909 / 2;
            }
            class86 var36;
            if (var8.field946 == -1 && var8.field950 == null) {
                var36 = var8.method814(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1909(arg0, arg1, arg2, var16, var36, (class86) null, 256, arg4, field77[arg4] * var34, field81[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class86 var38;
            if (var8.field946 == -1 && var8.field950 == null) {
                var38 = var8.method814(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1909(arg0, arg1, arg2, var16, var38, (class86) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1807(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method3164(var40 >> 14 & 0x7FFF).field909 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class86 var42;
            class86 var43;
            if (var8.field946 == -1 && var8.field950 == null) {
                var42 = var8.method814(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method814(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field946, true, (class86) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field946, true, (class86) null);
            }
            arg6.method1909(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field77[arg4] * var39, field81[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("x.r(Lcb;[Ldr;I)V")
    public static final void method39(class87 arg0, class109[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field70[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field70[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2227(var3, var4);
                        }
                    }
                }
            }
        }
        field79 += (int) (Math.random() * 5.0D) - 2;
        if (field79 < -8) {
            field79 = -8;
        }
        if (field79 > 8) {
            field79 = 8;
        }
        field82 += (int) (Math.random() * 5.0D) - 2;
        if (field82 < -16) {
            field82 = -16;
        }
        if (field82 > 16) {
            field82 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field92[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field84[var6][var11 + 1][var10] - field84[var6][var11 - 1][var10];
                    int var13 = field84[var6][var11][var10 + 1] - field84[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field958[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field145[var20] = 0;
                Statics.field213[var20] = 0;
                Statics.field955[var20] = 0;
                Statics.field1357[var20] = 0;
                Statics.field162[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field72[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class42 var26 = (class42) class42.field956.method3495((long) var25);
                            class42 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field2023.method3037(1, var25);
                                class42 var29 = new class42();
                                if (var28 != null) {
                                    var29.method828(new class120(var28), var25);
                                }
                                var29.method836();
                                class42.field956.method3490(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field145[var22] += var27.field954;
                            Statics.field213[var22] += var27.field959;
                            Statics.field955[var22] += var27.field961;
                            Statics.field1357[var22] += var27.field957;
                            var10002 = Statics.field162[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field72[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class42 var34 = (class42) class42.field956.method3495((long) var33);
                            class42 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field2023.method3037(1, var33);
                                class42 var37 = new class42();
                                if (var36 != null) {
                                    var37.method828(new class120(var36), var33);
                                }
                                var37.method836();
                                class42.field956.method3490(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field145[var22] -= var35.field954;
                            Statics.field213[var22] -= var35.field959;
                            Statics.field955[var22] -= var35.field961;
                            Statics.field1357[var22] -= var35.field957;
                            var10002 = Statics.field162[var22]--;
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
                            var39 += Statics.field145[var45];
                            var40 += Statics.field213[var45];
                            var41 += Statics.field955[var45];
                            var42 += Statics.field1357[var45];
                            var43 += Statics.field162[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field145[var46];
                            var40 -= Statics.field213[var46];
                            var41 -= Statics.field955[var46];
                            var42 -= Statics.field1357[var46];
                            var43 -= Statics.field162[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field384 || (field70[0][var21][var44] & 0x2) != 0 || (field70[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field71) {
                                field71 = var6;
                            }
                            int var47 = Statics.field72[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field73[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field84[var6][var21][var44];
                                int var50 = field84[var6][var21 + 1][var44];
                                int var51 = field84[var6][var21 + 1][var44 + 1];
                                int var52 = field84[var6][var21][var44 + 1];
                                int var53 = Statics.field958[var21][var44];
                                int var54 = Statics.field958[var21 + 1][var44];
                                int var55 = Statics.field958[var21 + 1][var44 + 1];
                                int var56 = Statics.field958[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method1223(var59, var60, var61);
                                    int var62 = field79 + var59 & 0xFF;
                                    int var63 = field82 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method1223(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field74[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !Statics.method1183(var48 - 1).field1032) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field2226[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class92.field1550[method171(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1786(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method171(var57, var53), method171(var57, var54), method171(var57, var55), method171(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field74[var6][var21][var44] + 1;
                                    byte var67 = Statics.field1068[var6][var21][var44];
                                    class47 var68 = Statics.method1183(var48 - 1);
                                    int var69 = var68.field1031;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1561.method2015(var69);
                                        var71 = -1;
                                    } else if (var68.field1028 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method1223(var68.field1038, var68.field1035, var68.field1036);
                                        int var72 = field79 + var68.field1038 & 0xFF;
                                        int var73 = field82 + var68.field1036;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method1223(var72, var68.field1035, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class92.field1550[method157(var70, 96)];
                                    }
                                    if (var68.field1039 != -1) {
                                        int var75 = field79 + var68.field1037 & 0xFF;
                                        int var76 = field82 + var68.field1033;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method1223(var75, var68.field1030, var76);
                                        var74 = class92.field1550[method157(var77, 96)];
                                    }
                                    arg0.method1786(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method171(var57, var53), method171(var57, var54), method171(var57, var55), method171(var57, var56), method157(var71, var53), method157(var71, var54), method157(var71, var55), method157(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1785(var6, var79, var78, method2639(var6, var79, var78));
                }
            }
            Statics.field72[var6] = (byte[][]) null;
            Statics.field73[var6] = (byte[][]) null;
            Statics.field74[var6] = (byte[][]) null;
            Statics.field1068[var6] = (byte[][]) null;
            Statics.field92[var6] = (byte[][]) null;
        }
        arg0.method1812(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field70[1][var80][var81] & 0x2) == 2) {
                    arg0.method1911(var80, var81);
                }
            }
        }
        int var82 = 1;
        int var83 = 2;
        int var84 = 4;
        for (int var85 = 0; var85 < 4; var85++) {
            if (var85 > 0) {
                var82 <<= 0x3;
                var83 <<= 0x3;
                var84 <<= 0x3;
            }
            for (int var86 = 0; var86 <= var85; var86++) {
                for (int var87 = 0; var87 <= 104; var87++) {
                    for (int var88 = 0; var88 <= 104; var88++) {
                        if ((Statics.field2226[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field2226[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field2226[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label355: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field2226[var91 - 1][var88][var93] & var82) == 0) {
                                        break label355;
                                    }
                                }
                                var91--;
                            }
                            label344: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field2226[var92 + 1][var88][var94] & var82) == 0) {
                                        break label344;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field84[var92][var88][var89] - var96;
                                int var98 = field84[var91][var88][var89];
                                class87.method1784(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field2226[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2226[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field2226[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field2226[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label408: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field2226[var103 - 1][var105][var87] & var83) == 0) {
                                        break label408;
                                    }
                                }
                                var103--;
                            }
                            label397: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field2226[var104 + 1][var106][var87] & var83) == 0) {
                                        break label397;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field84[var104][var101][var87] - var108;
                                int var110 = field84[var103][var101][var87];
                                class87.method1784(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field2226[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2226[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field2226[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field2226[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label461: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field2226[var86][var113 - 1][var117] & var84) == 0) {
                                        break label461;
                                    }
                                }
                                var113--;
                            }
                            label450: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field2226[var86][var114 + 1][var118] & var84) == 0) {
                                        break label450;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field84[var86][var113][var115];
                                class87.method1784(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field2226[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("da.c(IIIS)I")
    public static int method2639(int arg0, int arg1, int arg2) {
        if ((field70[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field70[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("k.l(III)I")
    public static final int method159(int arg0, int arg1) {
        int var2 = method721(arg0 + 45365, arg1 + 91923, 4) - 128 + (method721(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method721(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ax.u(IIIB)I")
    public static final int method721(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2971(var3, var5);
        int var8 = method2971(var3 + 1, var5);
        int var9 = method2971(var3, var5 + 1);
        int var10 = method2971(var3 + 1, var5 + 1);
        int var11 = 65536 - class92.field1565[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class92.field1565[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class92.field1565[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("fg.p(IIB)I")
    public static final int method2971(int arg0, int arg1) {
        int var2 = method222(arg0 - 1, arg1 - 1) + method222(arg0 + 1, arg1 - 1) + method222(arg0 - 1, arg1 + 1) + method222(arg0 + 1, arg1 + 1);
        int var3 = method222(arg0 - 1, arg1) + method222(arg0 + 1, arg1) + method222(arg0, arg1 - 1) + method222(arg0, arg1 + 1);
        int var4 = method222(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("a.n(IIB)I")
    public static final int method222(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("o.w(III)I")
    public static final int method171(int arg0, int arg1) {
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

    @ObfuscatedName("z.z(III)I")
    public static final int method157(int arg0, int arg1) {
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

    @ObfuscatedName("bz.k(IIII)I")
    public static final int method1223(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("s.o(III)Z")
    public static final boolean method586(int arg0, int arg1) {
        class41 var2 = class41.method3164(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method784(arg1);
    }
}
