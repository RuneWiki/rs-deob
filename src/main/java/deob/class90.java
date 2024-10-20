package deob;

@ObfuscatedName("ca")
public final class class90 {

    @ObfuscatedName("ca.f")
    public static int[][][] field1099 = new int[4][105][105];

    @ObfuscatedName("ca.e")
    public static byte[][][] field1097 = new byte[4][104][104];

    @ObfuscatedName("ca.v")
    public static int field1105 = 99;

    @ObfuscatedName("ca.q")
    public static final int[] field1103 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("ca.s")
    public static final int[] field1108 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("ca.p")
    public static final int[] field1101 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("ca.c")
    public static final int[] field1106 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("ca.n")
    public static final int[] field1107 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("ca.l")
    public static final int[] field1098 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("ca.w")
    public static int field1109 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("ca.a")
    public static int field1110 = (int) (Math.random() * 33.0D) - 16;

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.f(IIIII)V")
    public static final void method2242(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field308[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1099[0][var5][var4] = field1099[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1099[0][var5][var4] = field1099[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1099[0][var5][var4] = field1099[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1099[0][var5][var4] = field1099[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.e([BIIIIIII[Lfl;B)V")
    public static final void method2302(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class159[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1912[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class384 var11 = new class384(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method4393(var11, arg1, arg2 + class245.method2512(var13 & 0x7, var14 & 0x7, arg7), arg3 + class245.method3271(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method4393(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ix.v(Lnt;IIIIIII)V")
    public static final void method4393(class384 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method5902();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method5902();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method5902();
                }
            }
            return;
        }
        field1097[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5902();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field1099[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2106(var10 + 45365, var11 + 91923, 4) - 128 + (method2106(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2106(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field1099[arg1][arg2][arg3] = field1099[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method5902();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field1099[0][arg2][arg3] = -var15 * 8;
                } else {
                    field1099[arg1][arg2][arg3] = field1099[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1112[arg1][arg2][arg3] = arg0.method5968();
                Statics.field187[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field133[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1097[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field4099[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bo.y([BIII)Z")
    public static final boolean method993(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class384 var4 = new class384(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5912();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5911();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5902() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class155 var16 = class155.method1864(var5);
                        if (var13 != 22 || !client.field624 || var16.field1776 != 0 || var16.field1774 == 1 || var16.field1800) {
                            if (!var16.method2707()) {
                                client.field743++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5911();
                if (var9 == 0) {
                    break;
                }
                var4.method5902();
            }
        }
    }

    @ObfuscatedName("a.j([BIIIIIIILgp;[Lfl;B)V")
    public static final void method196(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class199 arg8, class159[] arg9) {
        class384 var10 = new class384(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5912();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5911();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5902();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class155 var21 = class155.method1864(var11);
                    int var22 = arg2 + class245.method3352(var16 & 0x7, var15 & 0x7, arg7, var21.field1772, var21.field1773, var20);
                    int var23 = arg3 + class245.method3793(var16 & 0x7, var15 & 0x7, arg7, var21.field1772, var21.field1773, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field1097[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class159 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method1995(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.o(IIIIIILgp;Lfl;I)V")
    public static final void method1995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class199 arg6, class159 arg7) {
        if (client.field624 && (field1097[0][arg1][arg2] & 0x2) == 0 && (field1097[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1105) {
            field1105 = arg0;
        }
        class155 var8 = class155.method1864(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field1773;
            var10 = var8.field1772;
        } else {
            var9 = var8.field1772;
            var10 = var8.field1773;
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
        int[][] var15 = field1099[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class207.method2277(arg1, arg2, 2, var8.field1776 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field1784 == 1) {
            var21 += 256;
        }
        if (var8.method2715()) {
            class78.method3269(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field624 || var8.field1776 != 0 || var8.field1774 == 1 || var8.field1800) {
                class200 var22;
                if (var8.field1780 == -1 && var8.field1798 == null) {
                    var22 = var8.method2737(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
                }
                arg6.method3741(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field1774 == 1 && arg7 != null) {
                    arg7.method2898(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class200 var48;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var48 = var8.method2737(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            if (var48 != null && arg6.method3588(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field1756) {
                int var49 = 15;
                if (var48 instanceof class206) {
                    var49 = ((class206) var48).method3867() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field308[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field308[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field1774 != 0 && arg7 != null) {
                arg7.method2896(arg1, arg2, var9, var10, var8.field1775);
            }
        } else if (arg5 >= 12) {
            class200 var23;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var23 = var8.method2737(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3588(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1102[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field1774 != 0 && arg7 != null) {
                arg7.method2896(arg1, arg2, var9, var10, var8.field1775);
            }
        } else if (arg5 == 0) {
            class200 var24;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var24 = var8.method2737(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3586(arg0, arg1, arg2, var16, var24, (class200) null, field1103[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field1756) {
                    Statics.field308[arg0][arg1][arg2] = 50;
                    Statics.field308[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field1797) {
                    Statics.field1102[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field1756) {
                    Statics.field308[arg0][arg1][arg2 + 1] = 50;
                    Statics.field308[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1797) {
                    Statics.field1102[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field1756) {
                    Statics.field308[arg0][arg1 + 1][arg2] = 50;
                    Statics.field308[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1797) {
                    Statics.field1102[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field1756) {
                    Statics.field308[arg0][arg1][arg2] = 50;
                    Statics.field308[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field1797) {
                    Statics.field1102[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field1774 != 0 && arg7 != null) {
                arg7.method2903(arg1, arg2, arg5, arg4, var8.field1775);
            }
            if (var8.field1781 != 16) {
                arg6.method3746(arg0, arg1, arg2, var8.field1781);
            }
        } else if (arg5 == 1) {
            class200 var25;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var25 = var8.method2737(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3586(arg0, arg1, arg2, var16, var25, (class200) null, field1108[arg4], 0, var19, var21);
            if (var8.field1756) {
                if (arg4 == 0) {
                    Statics.field308[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field308[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field308[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field308[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1774 != 0 && arg7 != null) {
                arg7.method2903(arg1, arg2, arg5, arg4, var8.field1775);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class200 var27;
            class200 var28;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var27 = var8.method2737(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method2737(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
                var28 = new class88(arg3, 2, var26, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3586(arg0, arg1, arg2, var16, var27, var28, field1103[arg4], field1103[var26], var19, var21);
            if (var8.field1797) {
                if (arg4 == 0) {
                    Statics.field1102[arg0][arg1][arg2] |= 0x249;
                    Statics.field1102[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1102[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1102[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1102[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1102[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1102[arg0][arg1][arg2] |= 0x492;
                    Statics.field1102[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field1774 != 0 && arg7 != null) {
                arg7.method2903(arg1, arg2, arg5, arg4, var8.field1775);
            }
            if (var8.field1781 != 16) {
                arg6.method3746(arg0, arg1, arg2, var8.field1781);
            }
        } else if (arg5 == 3) {
            class200 var29;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var29 = var8.method2737(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3586(arg0, arg1, arg2, var16, var29, (class200) null, field1108[arg4], 0, var19, var21);
            if (var8.field1756) {
                if (arg4 == 0) {
                    Statics.field308[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field308[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field308[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field308[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1774 != 0 && arg7 != null) {
                arg7.method2903(arg1, arg2, arg5, arg4, var8.field1775);
            }
        } else if (arg5 == 9) {
            class200 var30;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var30 = var8.method2737(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3588(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field1774 != 0 && arg7 != null) {
                arg7.method2896(arg1, arg2, var9, var10, var8.field1775);
            }
            if (var8.field1781 != 16) {
                arg6.method3746(arg0, arg1, arg2, var8.field1781);
            }
        } else if (arg5 == 4) {
            class200 var31;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var31 = var8.method2737(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3577(arg0, arg1, arg2, var16, var31, (class200) null, field1103[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3686(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class155.method1864(class207.method1030(var33)).field1781;
            }
            class200 var35;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var35 = var8.method2737(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3577(arg0, arg1, arg2, var16, var35, (class200) null, field1103[arg4], 0, field1101[arg4] * var32, field1106[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3686(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class155.method1864(class207.method1030(var37)).field1781 / 2;
            }
            class200 var39;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var39 = var8.method2737(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3577(arg0, arg1, arg2, var16, var39, (class200) null, 256, arg4, field1107[arg4] * var36, field1098[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class200 var41;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var41 = var8.method2737(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class88(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3577(arg0, arg1, arg2, var16, var41, (class200) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3686(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class155.method1864(class207.method1030(var43)).field1781 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class200 var46;
            class200 var47;
            if (var8.field1780 == -1 && var8.field1798 == null) {
                var46 = var8.method2737(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method2737(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
                var47 = new class88(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field1780, var8.field1785, (class200) null);
            }
            arg6.method3577(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1107[arg4] * var42, field1098[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("bo.m(Lgp;[Lfl;B)V")
    public static final void method996(class199 arg0, class159[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1097[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1097[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2934(var3, var4);
                        }
                    }
                }
            }
        }
        field1109 += (int) (Math.random() * 5.0D) - 2;
        if (field1109 < -8) {
            field1109 = -8;
        }
        if (field1109 > 8) {
            field1109 = 8;
        }
        field1110 += (int) (Math.random() * 5.0D) - 2;
        if (field1110 < -16) {
            field1110 = -16;
        }
        if (field1110 > 16) {
            field1110 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field308[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field1099[var6][var11 + 1][var10] - field1099[var6][var11 - 1][var10];
                    int var13 = field1099[var6][var11][var10 + 1] - field1099[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1329[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2814[var20] = 0;
                Statics.field1100[var20] = 0;
                Statics.field3117[var20] = 0;
                Statics.field2059[var20] = 0;
                Statics.field1096[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field4099[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class150 var26 = (class150) class150.field1699.method3987((long) var25);
                            class150 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field1704.method4504(1, var25);
                                class150 var29 = new class150();
                                if (var28 != null) {
                                    var29.method2603(new class384(var28), var25);
                                }
                                var29.method2595();
                                class150.field1699.method3988(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field2814[var22] += var27.field1705;
                            Statics.field1100[var22] += var27.field1703;
                            Statics.field3117[var22] += var27.field1702;
                            Statics.field2059[var22] += var27.field1701;
                            var10002 = Statics.field1096[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field4099[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class150 var34 = (class150) class150.field1699.method3987((long) var33);
                            class150 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field1704.method4504(1, var33);
                                class150 var37 = new class150();
                                if (var36 != null) {
                                    var37.method2603(new class384(var36), var33);
                                }
                                var37.method2595();
                                class150.field1699.method3988(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field2814[var22] -= var35.field1705;
                            Statics.field1100[var22] -= var35.field1703;
                            Statics.field3117[var22] -= var35.field1702;
                            Statics.field2059[var22] -= var35.field1701;
                            var10002 = Statics.field1096[var22]--;
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
                            var39 += Statics.field2814[var45];
                            var40 += Statics.field1100[var45];
                            var41 += Statics.field3117[var45];
                            var42 += Statics.field2059[var45];
                            var43 += Statics.field1096[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field2814[var46];
                            var40 -= Statics.field1100[var46];
                            var41 -= Statics.field3117[var46];
                            var42 -= Statics.field2059[var46];
                            var43 -= Statics.field1096[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field624 || (field1097[0][var21][var44] & 0x2) != 0 || (field1097[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field1105) {
                                field1105 = var6;
                            }
                            int var47 = Statics.field4099[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field1112[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field1099[var6][var21][var44];
                                int var50 = field1099[var6][var21 + 1][var44];
                                int var51 = field1099[var6][var21 + 1][var44 + 1];
                                int var52 = field1099[var6][var21][var44 + 1];
                                int var53 = Statics.field1329[var21][var44];
                                int var54 = Statics.field1329[var21 + 1][var44];
                                int var55 = Statics.field1329[var21 + 1][var44 + 1];
                                int var56 = Statics.field1329[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method2312(var59, var60, var61);
                                    int var62 = field1109 + var59 & 0xFF;
                                    int var63 = field1110 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method2312(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field187[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class157.method3287(var48 - 1).field1869) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field1102[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class197.field2277[method5834(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method3583(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method5834(var57, var53), method5834(var57, var54), method5834(var57, var55), method5834(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field187[var6][var21][var44] + 1;
                                    byte var67 = Statics.field133[var6][var21][var44];
                                    class157 var68 = class157.method3287(var48 - 1);
                                    int var69 = var68.field1872;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field2284.method3804(var69);
                                        var71 = -1;
                                    } else if (var68.field1874 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method2312(var68.field1871, var68.field1867, var68.field1873);
                                        int var72 = field1109 + var68.field1871 & 0xFF;
                                        int var73 = field1110 + var68.field1873;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method2312(var72, var68.field1867, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class197.field2277[method3323(var70, 96)];
                                    }
                                    if (var68.field1870 != -1) {
                                        int var75 = field1109 + var68.field1866 & 0xFF;
                                        int var76 = field1110 + var68.field1868;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method2312(var75, var68.field1875, var76);
                                        var74 = class197.field2277[method3323(var77, 96)];
                                    }
                                    arg0.method3583(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method5834(var57, var53), method5834(var57, var54), method5834(var57, var55), method5834(var57, var56), method3323(var71, var53), method3323(var71, var54), method3323(var71, var55), method3323(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field1097[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field1097[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method3709(var6, var79, var78, var84);
                }
            }
            Statics.field4099[var6] = (byte[][]) null;
            Statics.field1112[var6] = (byte[][]) null;
            Statics.field187[var6] = (byte[][]) null;
            Statics.field133[var6] = (byte[][]) null;
            Statics.field308[var6] = (byte[][]) null;
        }
        arg0.method3609(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field1097[1][var85][var86] & 0x2) == 2) {
                    arg0.method3580(var85, var86);
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
                        if ((Statics.field1102[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field1102[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field1102[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field1102[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field1102[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field1099[var97][var93][var94] - var101;
                                int var103 = field1099[var96][var93][var94];
                                class199.method3622(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field1102[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1102[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field1102[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field1102[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field1102[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field1102[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field1099[var109][var106][var92] - var113;
                                int var115 = field1099[var108][var106][var92];
                                class199.method3622(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field1102[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1102[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field1102[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field1102[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field1102[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field1102[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field1099[var91][var118][var120];
                                class199.method3622(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field1102[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.r(IIII)I")
    public static final int method2106(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2231(var3, var5);
        int var8 = method2231(var3 + 1, var5);
        int var9 = method2231(var3, var5 + 1);
        int var10 = method2231(var3 + 1, var5 + 1);
        int var11 = 65536 - class197.field2285[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class197.field2285[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class197.field2285[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("dz.h(III)I")
    public static final int method2231(int arg0, int arg1) {
        int var2 = method2105(arg0 - 1, arg1 - 1) + method2105(arg0 + 1, arg1 - 1) + method2105(arg0 - 1, arg1 + 1) + method2105(arg0 + 1, arg1 + 1);
        int var3 = method2105(arg0 - 1, arg1) + method2105(arg0 + 1, arg1) + method2105(arg0, arg1 - 1) + method2105(arg0, arg1 + 1);
        int var4 = method2105(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dh.d(III)I")
    public static final int method2105(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("nh.z(III)I")
    public static final int method5834(int arg0, int arg1) {
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

    @ObfuscatedName("ff.b(III)I")
    public static final int method3323(int arg0, int arg1) {
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

    @ObfuscatedName("dw.i(IIII)I")
    public static final int method2312(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bt.k(IIIIIIILgp;Lfl;B)V")
    public static final void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class199 arg7, class159 arg8) {
        class155 var9 = class155.method1864(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field1773;
            var11 = var9.field1772;
        } else {
            var10 = var9.field1772;
            var11 = var9.field1773;
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
        int[][] var16 = field1099[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class207.method2277(arg2, arg3, 2, var9.field1776 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field1784 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class200 var23;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var23 = var9.method2709(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class88(arg4, 22, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3741(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field1774 == 1) {
                arg8.method2898(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class200 var49;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var49 = var9.method2709(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class88(arg4, 10, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            if (var49 != null) {
                arg7.method3588(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field1774 != 0) {
                arg8.method2896(arg2, arg3, var10, var11, var9.field1775);
            }
        } else if (arg6 >= 12) {
            class200 var24;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var24 = var9.method2709(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3588(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field1774 != 0) {
                arg8.method2896(arg2, arg3, var10, var11, var9.field1775);
            }
        } else if (arg6 == 0) {
            class200 var25;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var25 = var9.method2709(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class88(arg4, 0, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3586(arg0, arg2, arg3, var17, var25, (class200) null, field1103[arg5], 0, var20, var22);
            if (var9.field1774 != 0) {
                arg8.method2903(arg2, arg3, arg6, arg5, var9.field1775);
            }
        } else if (arg6 == 1) {
            class200 var26;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var26 = var9.method2709(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class88(arg4, 1, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3586(arg0, arg2, arg3, var17, var26, (class200) null, field1108[arg5], 0, var20, var22);
            if (var9.field1774 != 0) {
                arg8.method2903(arg2, arg3, arg6, arg5, var9.field1775);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class200 var28;
            class200 var29;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var28 = var9.method2709(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method2709(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class88(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
                var29 = new class88(arg4, 2, var27, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3586(arg0, arg2, arg3, var17, var28, var29, field1103[arg5], field1103[var27], var20, var22);
            if (var9.field1774 != 0) {
                arg8.method2903(arg2, arg3, arg6, arg5, var9.field1775);
            }
        } else if (arg6 == 3) {
            class200 var30;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var30 = var9.method2709(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class88(arg4, 3, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3586(arg0, arg2, arg3, var17, var30, (class200) null, field1108[arg5], 0, var20, var22);
            if (var9.field1774 != 0) {
                arg8.method2903(arg2, arg3, arg6, arg5, var9.field1775);
            }
        } else if (arg6 == 9) {
            class200 var31;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var31 = var9.method2709(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3588(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field1774 != 0) {
                arg8.method2896(arg2, arg3, var10, var11, var9.field1775);
            }
        } else if (arg6 == 4) {
            class200 var32;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var32 = var9.method2709(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3577(arg0, arg2, arg3, var17, var32, (class200) null, field1103[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method3686(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class155.method1864(class207.method1030(var34)).field1781;
            }
            class200 var36;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var36 = var9.method2709(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3577(arg0, arg2, arg3, var17, var36, (class200) null, field1103[arg5], 0, field1101[arg5] * var33, field1106[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method3686(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class155.method1864(class207.method1030(var38)).field1781 / 2;
            }
            class200 var40;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var40 = var9.method2709(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3577(arg0, arg2, arg3, var17, var40, (class200) null, 256, arg5, field1107[arg5] * var37, field1098[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class200 var42;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var42 = var9.method2709(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class88(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3577(arg0, arg2, arg3, var17, var42, (class200) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method3686(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class155.method1864(class207.method1030(var44)).field1781 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class200 var47;
            class200 var48;
            if (var9.field1780 == -1 && var9.field1798 == null) {
                var47 = var9.method2709(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method2709(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
                var48 = new class88(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field1780, var9.field1785, (class200) null);
            }
            arg7.method3577(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field1107[arg5] * var43, field1098[arg5] * var43, var20, var22);
        }
    }
}
