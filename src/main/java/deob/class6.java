package deob;

@ObfuscatedName("d")
public final class class6 {

    @ObfuscatedName("d.j")
    public static int[][][] field88 = new int[4][105][105];

    @ObfuscatedName("d.y")
    public static byte[][][] field89 = new byte[4][104][104];

    @ObfuscatedName("d.z")
    public static int field94 = 99;

    @ObfuscatedName("d.n")
    public static final int[] field99 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("d.h")
    public static final int[] field90 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("d.p")
    public static final int[] field100 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("d.c")
    public static final int[] field101 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("d.x")
    public static final int[] field102 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("d.q")
    public static final int[] field103 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("d.b")
    public static int field104 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("d.k")
    public static int field105 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.j(I)V")
    public static void method840() {
        field94 = 99;
        Statics.field98 = new byte[4][104][104];
        Statics.field1869 = new byte[4][104][104];
        Statics.field92 = new byte[4][104][104];
        Statics.field705 = new byte[4][104][104];
        Statics.field110 = new int[4][105][105];
        Statics.field93 = new byte[4][105][105];
        Statics.field2837 = new int[105][105];
        Statics.field91 = new int[104];
        Statics.field1878 = new int[104];
        Statics.field1044 = new int[104];
        Statics.field95 = new int[104];
        Statics.field96 = new int[104];
    }

    @ObfuscatedName("d.z(IIIII)V")
    public static final void method85(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field93[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field88[0][var5][var4] = field88[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field88[0][var5][var4] = field88[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field88[0][var5][var4] = field88[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field88[0][var5][var4] = field88[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bc.l([BIIIIIII[Lhi;B)V")
    public static final void method1618(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class223[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3161[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class114 var11 = new class114(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method178(var11, arg1, arg2 + class171.method814(var13 & 0x7, var14 & 0x7, arg7), arg3 + class171.method3083(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method178(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.w(Lde;IIIIIII)V")
    public static final void method178(class114 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2322();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2322();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2322();
                }
            }
            return;
        }
        field89[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2322();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field88[0][arg2][arg3] = -method1969(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field88[arg1][arg2][arg3] = field88[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2322();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field88[0][arg2][arg3] = -var8 * 8;
                } else {
                    field88[arg1][arg2][arg3] = field88[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1869[arg1][arg2][arg3] = arg0.method2323();
                Statics.field92[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field705[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field89[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field98[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ao.d([BIII)Z")
    public static final boolean method1023(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class114 var4 = new class114(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2401();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2401();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2322() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class39 var16 = class39.method902(var5);
                        if (var13 != 22 || !client.field307 || var16.field922 != 0 || var16.field920 == 1 || var16.field932) {
                            if (!var16.method767()) {
                                client.field357++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2401();
                if (var9 == 0) {
                    break;
                }
                var4.method2322();
            }
        }
    }

    @ObfuscatedName("ae.f([BIILcc;[Lhi;I)V")
    public static final void method846(byte[] arg0, int arg1, int arg2, class84 arg3, class223[] arg4) {
        class114 var5 = new class114(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2401();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2401();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2322();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field89[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class223 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method596(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("q.i(IIIIIILcc;Lhi;B)V")
    public static final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class84 arg6, class223 arg7) {
        if (client.field307 && (field89[0][arg1][arg2] & 0x2) == 0) {
            if ((field89[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1020(arg0, arg1, arg2) != client.field324) {
                return;
            }
        }
        if (arg0 < field94) {
            field94 = arg0;
        }
        class39 var8 = class39.method902(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field949;
            var10 = var8.field918;
        } else {
            var9 = var8.field918;
            var10 = var8.field949;
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
        int[][] var15 = field88[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field922 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field903 == 1) {
            var20 += 256;
        }
        if (var8.method807()) {
            class23.method2255(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field307 || var8.field922 != 0 || var8.field920 == 1 || var8.field932) {
                class83 var21;
                if (var8.field926 == -1 && var8.field944 == null) {
                    var21 = var8.method768(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
                }
                arg6.method1806(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field920 == 1 && arg7 != null) {
                    arg7.method3818(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class83 var44;
            if (var8.field926 == -1 && var8.field944 == null) {
                var44 = var8.method768(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            if (var44 != null && arg6.method1844(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field934) {
                int var45 = 15;
                if (var44 instanceof class103) {
                    var45 = ((class103) var44).method2172() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field93[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field93[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field920 != 0 && arg7 != null) {
                arg7.method3805(arg1, arg2, var9, var10, var8.field953);
            }
        } else if (arg5 >= 12) {
            class83 var22;
            if (var8.field926 == -1 && var8.field944 == null) {
                var22 = var8.method768(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1844(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field110[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field920 != 0 && arg7 != null) {
                arg7.method3805(arg1, arg2, var9, var10, var8.field953);
            }
        } else if (arg5 == 0) {
            class83 var23;
            if (var8.field926 == -1 && var8.field944 == null) {
                var23 = var8.method768(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1815(arg0, arg1, arg2, var16, var23, (class83) null, field99[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field934) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field925) {
                    Statics.field110[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field934) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field925) {
                    Statics.field110[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field934) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field925) {
                    Statics.field110[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field934) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field925) {
                    Statics.field110[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field920 != 0 && arg7 != null) {
                arg7.method3800(arg1, arg2, arg5, arg4, var8.field953);
            }
            if (var8.field940 != 16) {
                arg6.method1816(arg0, arg1, arg2, var8.field940);
            }
        } else if (arg5 == 1) {
            class83 var24;
            if (var8.field926 == -1 && var8.field944 == null) {
                var24 = var8.method768(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1815(arg0, arg1, arg2, var16, var24, (class83) null, field90[arg4], 0, var19, var20);
            if (var8.field934) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field920 != 0 && arg7 != null) {
                arg7.method3800(arg1, arg2, arg5, arg4, var8.field953);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class83 var26;
            class83 var27;
            if (var8.field926 == -1 && var8.field944 == null) {
                var26 = var8.method768(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method768(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field926, true, (class83) null);
                var27 = new class12(arg3, 2, var25, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1815(arg0, arg1, arg2, var16, var26, var27, field99[arg4], field99[var25], var19, var20);
            if (var8.field925) {
                if (arg4 == 0) {
                    Statics.field110[arg0][arg1][arg2] |= 0x249;
                    Statics.field110[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field110[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field110[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field110[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field110[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field110[arg0][arg1][arg2] |= 0x492;
                    Statics.field110[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field920 != 0 && arg7 != null) {
                arg7.method3800(arg1, arg2, arg5, arg4, var8.field953);
            }
            if (var8.field940 != 16) {
                arg6.method1816(arg0, arg1, arg2, var8.field940);
            }
        } else if (arg5 == 3) {
            class83 var28;
            if (var8.field926 == -1 && var8.field944 == null) {
                var28 = var8.method768(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1815(arg0, arg1, arg2, var16, var28, (class83) null, field90[arg4], 0, var19, var20);
            if (var8.field934) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field920 != 0 && arg7 != null) {
                arg7.method3800(arg1, arg2, arg5, arg4, var8.field953);
            }
        } else if (arg5 == 9) {
            class83 var29;
            if (var8.field926 == -1 && var8.field944 == null) {
                var29 = var8.method768(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1844(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field920 != 0 && arg7 != null) {
                arg7.method3805(arg1, arg2, var9, var10, var8.field953);
            }
            if (var8.field940 != 16) {
                arg6.method1816(arg0, arg1, arg2, var8.field940);
            }
        } else if (arg5 == 4) {
            class83 var30;
            if (var8.field926 == -1 && var8.field944 == null) {
                var30 = var8.method768(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1809(arg0, arg1, arg2, var16, var30, (class83) null, field99[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1867(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class39.method902(var32 >> 14 & 0x7FFF).field940;
            }
            class83 var33;
            if (var8.field926 == -1 && var8.field944 == null) {
                var33 = var8.method768(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1809(arg0, arg1, arg2, var16, var33, (class83) null, field99[arg4], 0, field100[arg4] * var31, field101[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1867(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class39.method902(var35 >> 14 & 0x7FFF).field940 / 2;
            }
            class83 var36;
            if (var8.field926 == -1 && var8.field944 == null) {
                var36 = var8.method768(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1809(arg0, arg1, arg2, var16, var36, (class83) null, 256, arg4, field102[arg4] * var34, field103[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class83 var38;
            if (var8.field926 == -1 && var8.field944 == null) {
                var38 = var8.method768(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class12(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1809(arg0, arg1, arg2, var16, var38, (class83) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1867(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class39.method902(var40 >> 14 & 0x7FFF).field940 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class83 var42;
            class83 var43;
            if (var8.field926 == -1 && var8.field944 == null) {
                var42 = var8.method768(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method768(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field926, true, (class83) null);
                var43 = new class12(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field926, true, (class83) null);
            }
            arg6.method1809(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field102[arg4] * var39, field103[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("o.a(Lcc;[Lhi;I)V")
    public static final void method130(class84 arg0, class223[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field89[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field89[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3827(var3, var4);
                        }
                    }
                }
            }
        }
        field104 += (int) (Math.random() * 5.0D) - 2;
        if (field104 < -8) {
            field104 = -8;
        }
        if (field104 > 8) {
            field104 = 8;
        }
        field105 += (int) (Math.random() * 5.0D) - 2;
        if (field105 < -16) {
            field105 = -16;
        }
        if (field105 > 16) {
            field105 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field93[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field88[var6][var11 + 1][var10] - field88[var6][var11 - 1][var10];
                    int var13 = field88[var6][var11][var10 + 1] - field88[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2837[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field91[var20] = 0;
                Statics.field1878[var20] = 0;
                Statics.field1044[var20] = 0;
                Statics.field95[var20] = 0;
                Statics.field96[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field98[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class40 var25 = class40.method936(var24 - 1);
                            Statics.field91[var22] += var25.field958;
                            Statics.field1878[var22] += var25.field959;
                            Statics.field1044[var22] += var25.field960;
                            Statics.field95[var22] += var25.field956;
                            var10002 = Statics.field96[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field98[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class40 var28 = class40.method936(var27 - 1);
                            Statics.field91[var22] -= var28.field958;
                            Statics.field1878[var22] -= var28.field959;
                            Statics.field1044[var22] -= var28.field960;
                            Statics.field95[var22] -= var28.field956;
                            var10002 = Statics.field96[var22]--;
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
                            var29 += Statics.field91[var35];
                            var30 += Statics.field1878[var35];
                            var31 += Statics.field1044[var35];
                            var32 += Statics.field95[var35];
                            var33 += Statics.field96[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field91[var36];
                            var30 -= Statics.field1878[var36];
                            var31 -= Statics.field1044[var36];
                            var32 -= Statics.field95[var36];
                            var33 -= Statics.field96[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field307 || (field89[0][var21][var34] & 0x2) != 0 || (field89[var6][var21][var34] & 0x10) == 0 && method1020(var6, var21, var34) == client.field324)) {
                            if (var6 < field94) {
                                field94 = var6;
                            }
                            int var37 = Statics.field98[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field1869[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field88[var6][var21][var34];
                                int var40 = field88[var6][var21 + 1][var34];
                                int var41 = field88[var6][var21 + 1][var34 + 1];
                                int var42 = field88[var6][var21][var34 + 1];
                                int var43 = Statics.field2837[var21][var34];
                                int var44 = Statics.field2837[var21 + 1][var34];
                                int var45 = Statics.field2837[var21 + 1][var34 + 1];
                                int var46 = Statics.field2837[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method2057(var49, var50, var51);
                                    int var52 = field104 + var49 & 0xFF;
                                    int var53 = field105 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method2057(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field92[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class45 var56 = (class45) class45.field1028.method3432((long) var55);
                                        class45 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field1036.method2995(4, var55);
                                            class45 var59 = new class45();
                                            if (var58 != null) {
                                                var59.method949(new class114(var58), var55);
                                            }
                                            var59.method948();
                                            class45.field1028.method3434(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field1031) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field110[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class89.field1540[method2871(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1819(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2871(var47, var43), method2871(var47, var44), method2871(var47, var45), method2871(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field92[var6][var21][var34] + 1;
                                    byte var62 = Statics.field705[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class45 var64 = (class45) class45.field1028.method3432((long) var63);
                                    class45 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field1036.method2995(4, var63);
                                        class45 var67 = new class45();
                                        if (var66 != null) {
                                            var67.method949(new class114(var66), var63);
                                        }
                                        var67.method948();
                                        class45.field1028.method3434(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field1030;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1519.method2050(var69);
                                        var71 = -1;
                                    } else if (var65.field1029 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method2057(var65.field1033, var65.field1034, var65.field1038);
                                        int var72 = field104 + var65.field1033 & 0xFF;
                                        int var73 = field105 + var65.field1038;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method2057(var72, var65.field1034, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class89.field1540[method2889(var70, 96)];
                                    }
                                    if (var65.field1032 != -1) {
                                        int var75 = field104 + var65.field1027 & 0xFF;
                                        int var76 = field105 + var65.field1035;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method2057(var75, var65.field1037, var76);
                                        var74 = class89.field1540[method2889(var77, 96)];
                                    }
                                    arg0.method1819(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, method2871(var47, var43), method2871(var47, var44), method2871(var47, var45), method2871(var47, var46), method2889(var71, var43), method2889(var71, var44), method2889(var71, var45), method2889(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1804(var6, var79, var78, method1020(var6, var79, var78));
                }
            }
            Statics.field98[var6] = (byte[][]) null;
            Statics.field1869[var6] = (byte[][]) null;
            Statics.field92[var6] = (byte[][]) null;
            Statics.field705[var6] = (byte[][]) null;
            Statics.field93[var6] = (byte[][]) null;
        }
        arg0.method1831(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field89[1][var80][var81] & 0x2) == 2) {
                    arg0.method1802(var80, var81);
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
                        if ((Statics.field110[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field110[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field110[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label357: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field110[var91 - 1][var88][var93] & var82) == 0) {
                                        break label357;
                                    }
                                }
                                var91--;
                            }
                            label346: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field110[var92 + 1][var88][var94] & var82) == 0) {
                                        break label346;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field88[var92][var88][var89] - var96;
                                int var98 = field88[var91][var88][var89];
                                class84.method1810(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field110[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field110[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field110[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field110[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label410: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field110[var103 - 1][var105][var87] & var83) == 0) {
                                        break label410;
                                    }
                                }
                                var103--;
                            }
                            label399: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field110[var104 + 1][var106][var87] & var83) == 0) {
                                        break label399;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field88[var104][var101][var87] - var108;
                                int var110 = field88[var103][var101][var87];
                                class84.method1810(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field110[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field110[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field110[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field110[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label463: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field110[var86][var113 - 1][var117] & var84) == 0) {
                                        break label463;
                                    }
                                }
                                var113--;
                            }
                            label452: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field110[var86][var114 + 1][var118] & var84) == 0) {
                                        break label452;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field88[var86][var113][var115];
                                class84.method1810(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field110[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.o(IIII)I")
    public static int method1020(int arg0, int arg1, int arg2) {
        if ((field89[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field89[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ci.u(III)I")
    public static final int method1969(int arg0, int arg1) {
        int var2 = method2164(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2164(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2164(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("cr.m(IIIB)I")
    public static final int method2164(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method595(var3, var5);
        int var8 = method595(var3 + 1, var5);
        int var9 = method595(var3, var5 + 1);
        int var10 = method595(var3 + 1, var5 + 1);
        int var11 = method2873(var7, var8, var4, arg2);
        int var12 = method2873(var9, var10, var4, arg2);
        return method2873(var11, var12, var6, arg2);
    }

    @ObfuscatedName("eh.e(IIIII)I")
    public static final int method2873(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class89.field1543[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("q.v(IIB)I")
    public static final int method595(int arg0, int arg1) {
        int var2 = method2876(arg0 - 1, arg1 - 1) + method2876(arg0 + 1, arg1 - 1) + method2876(arg0 - 1, arg1 + 1) + method2876(arg0 + 1, arg1 + 1);
        int var3 = method2876(arg0 - 1, arg1) + method2876(arg0 + 1, arg1) + method2876(arg0, arg1 - 1) + method2876(arg0, arg1 + 1);
        int var4 = method2876(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ec.r(IIB)I")
    public static final int method2876(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("eg.t(III)I")
    public static final int method2871(int arg0, int arg1) {
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

    @ObfuscatedName("ev.g(III)I")
    public static final int method2889(int arg0, int arg1) {
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

    @ObfuscatedName("cj.s(IIII)I")
    public static final int method2057(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("f.n(III)Z")
    public static final boolean method97(int arg0, int arg1) {
        class39 var2 = class39.method902(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method766(arg1);
    }
}
