package deob;

@ObfuscatedName("ai")
public class class33 {

    @ObfuscatedName("ai.d")
    public static byte[] field769 = new byte[2048];

    @ObfuscatedName("ai.c")
    public static byte[] field773 = new byte[2048];

    @ObfuscatedName("ai.y")
    public static class120[] field762 = new class120[2048];

    @ObfuscatedName("ai.k")
    public static int field772 = 0;

    @ObfuscatedName("ai.r")
    public static int[] field763 = new int[2048];

    @ObfuscatedName("ai.p")
    public static int field765 = 0;

    @ObfuscatedName("ai.q")
    public static int[] field766 = new int[2048];

    @ObfuscatedName("ai.m")
    public static int[] field767 = new int[2048];

    @ObfuscatedName("ai.e")
    public static int[] field768 = new int[2048];

    @ObfuscatedName("ai.x")
    public static int[] field760 = new int[2048];

    @ObfuscatedName("ai.z")
    public static int field770 = 0;

    @ObfuscatedName("ai.i")
    public static int[] field771 = new int[2048];

    @ObfuscatedName("ai.t")
    public static class120 field764 = new class120(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.a(Ldl;I)V")
    public static final void method3304(class123 arg0) {
        arg0.method2715();
        int var1 = client.field458;
        class3 var2 = Statics.field94 = client.field551[var1] = new class3();
        var2.field50 = var1;
        int var3 = arg0.method2712(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field872[0] = var5 - Statics.field2205;
        var2.field845 = (var2.field872[0] << 7) + (var2.method18() << 6);
        var2.field836[0] = var6 - Statics.field68;
        var2.field820 = (var2.field836[0] << 7) + (var2.method18() << 6);
        Statics.field1003 = var2.field55 = var4;
        if (field762[var1] != null) {
            var2.method17(field762[var1]);
        }
        field772 = 0;
        field763[++field772 - 1] = var1;
        field769[var1] = 0;
        field765 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2712(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field767[var7] = (var9 << 28) + (var10 << 14) + var11;
                field768[var7] = 0;
                field760[var7] = -1;
                field766[++field765 - 1] = var7;
                field769[var7] = 0;
            }
        }
        arg0.method2717();
    }

    @ObfuscatedName("bv.w(Ldl;I)V")
    public static final void method1664(class123 arg0) {
        int var1 = 0;
        arg0.method2715();
        for (int var2 = 0; var2 < field772; var2++) {
            int var3 = field763[var2];
            if ((field769[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field769[var3] = (byte) (field769[var3] | 0x2);
                } else {
                    int var4 = arg0.method2712(1);
                    if (var4 == 0) {
                        var1 = method3347(arg0);
                        field769[var3] = (byte) (field769[var3] | 0x2);
                    } else {
                        method2802(arg0, var3);
                    }
                }
            }
        }
        arg0.method2717();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2715();
        for (int var5 = 0; var5 < field772; var5++) {
            int var6 = field763[var5];
            if ((field769[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field769[var6] = (byte) (field769[var6] | 0x2);
                } else {
                    int var7 = arg0.method2712(1);
                    if (var7 == 0) {
                        var1 = method3347(arg0);
                        field769[var6] = (byte) (field769[var6] | 0x2);
                    } else {
                        method2802(arg0, var6);
                    }
                }
            }
        }
        arg0.method2717();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2715();
        for (int var8 = 0; var8 < field765; var8++) {
            int var9 = field766[var8];
            if ((field769[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field769[var9] = (byte) (field769[var9] | 0x2);
                } else {
                    int var10 = arg0.method2712(1);
                    if (var10 == 0) {
                        var1 = method3347(arg0);
                        field769[var9] = (byte) (field769[var9] | 0x2);
                    } else if (method3308(arg0, var9)) {
                        field769[var9] = (byte) (field769[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2717();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2715();
        for (int var11 = 0; var11 < field765; var11++) {
            int var12 = field766[var11];
            if ((field769[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field769[var12] = (byte) (field769[var12] | 0x2);
                } else {
                    int var13 = arg0.method2712(1);
                    if (var13 == 0) {
                        var1 = method3347(arg0);
                        field769[var12] = (byte) (field769[var12] | 0x2);
                    } else if (method3308(arg0, var12)) {
                        field769[var12] = (byte) (field769[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2717();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field772 = 0;
        field765 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field769[var14] = (byte) (field769[var14] >> 1);
            class3 var15 = client.field551[var14];
            if (var15 == null) {
                field766[++field765 - 1] = var14;
            } else {
                field763[++field772 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("fq.d(Ldl;I)I")
    public static int method3347(class123 arg0) {
        int var1 = arg0.method2712(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2712(5);
        } else if (var1 == 2) {
            var2 = arg0.method2712(8);
        } else {
            var2 = arg0.method2712(11);
        }
        return var2;
    }

    @ObfuscatedName("ee.c(Ldl;II)V")
    public static void method2802(class123 arg0, int arg1) {
        boolean var2 = arg0.method2712(1) == 1;
        if (var2) {
            field771[++field770 - 1] = arg1;
        }
        int var3 = arg0.method2712(2);
        class3 var4 = client.field551[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field57 = false;
            } else if (client.field458 == arg1) {
                throw new RuntimeException();
            } else {
                field767[arg1] = (Statics.field68 + var4.field836[0] >> 6) + (Statics.field2205 + var4.field872[0] >> 6 << 14) + (var4.field55 << 28);
                if (var4.field828 == -1) {
                    field768[arg1] = var4.field854;
                } else {
                    field768[arg1] = var4.field828;
                }
                field760[arg1] = var4.field843;
                client.field551[arg1] = null;
                if (arg0.method2712(1) != 0) {
                    method3308(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2712(3);
            int var6 = var4.field872[0];
            int var7 = var4.field836[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (client.field458 == arg1 && var4.field845 < 1536 || var4.field820 < 1536 || var4.field845 >= 11776 || var4.field820 >= 11776) {
                var4.method21(var6, var7);
                var4.field57 = false;
            } else if (var2) {
                var4.field57 = true;
                var4.field58 = var6;
                var4.field35 = var7;
            } else {
                var4.field57 = false;
                var4.method20(var6, var7, field773[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2712(4);
            int var9 = var4.field872[0];
            int var10 = var4.field836[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (client.field458 == arg1 && var4.field845 < 1536 || var4.field820 < 1536 || var4.field845 >= 11776 || var4.field820 >= 11776) {
                var4.method21(var9, var10);
                var4.field57 = false;
            } else if (var2) {
                var4.field57 = true;
                var4.field58 = var9;
                var4.field35 = var10;
            } else {
                var4.field57 = false;
                var4.method20(var9, var10, field773[arg1]);
            }
        } else {
            int var11 = arg0.method2712(1);
            if (var11 == 0) {
                int var12 = arg0.method2712(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field872[0] + var14;
                int var17 = var4.field836[0] + var15;
                if (client.field458 == arg1 && var4.field845 < 1536 || var4.field820 < 1536 || var4.field845 >= 11776 || var4.field820 >= 11776) {
                    var4.method21(var16, var17);
                    var4.field57 = false;
                } else if (var2) {
                    var4.field57 = true;
                    var4.field58 = var16;
                    var4.field35 = var17;
                } else {
                    var4.field57 = false;
                    var4.method20(var16, var17, field773[arg1]);
                }
                var4.field55 = (byte) (var4.field55 + var13 & 0x3);
                if (client.field458 == arg1) {
                    Statics.field1003 = var4.field55;
                }
            } else {
                int var18 = arg0.method2712(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2205 + var4.field872[0] + var20 & 0x3FFF) - Statics.field2205;
                int var23 = (Statics.field68 + var4.field836[0] + var21 & 0x3FFF) - Statics.field68;
                if (client.field458 == arg1 && var4.field845 < 1536 || var4.field820 < 1536 || var4.field845 >= 11776 || var4.field820 >= 11776) {
                    var4.method21(var22, var23);
                    var4.field57 = false;
                } else if (var2) {
                    var4.field57 = true;
                    var4.field58 = var22;
                    var4.field35 = var23;
                } else {
                    var4.field57 = false;
                    var4.method20(var22, var23, field773[arg1]);
                }
                var4.field55 = (byte) (var4.field55 + var19 & 0x3);
                if (client.field458 == arg1) {
                    Statics.field1003 = var4.field55;
                }
            }
        }
    }

    @ObfuscatedName("fz.y(Ldl;II)Z")
    public static boolean method3308(class123 arg0, int arg1) {
        int var2 = arg0.method2712(2);
        if (var2 == 0) {
            if (arg0.method2712(1) != 0) {
                method3308(arg0, arg1);
            }
            int var3 = arg0.method2712(6);
            int var4 = arg0.method2712(6);
            boolean var5 = arg0.method2712(1) == 1;
            if (var5) {
                field771[++field770 - 1] = arg1;
            }
            if (client.field551[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field551[arg1] = new class3();
            var6.field50 = arg1;
            if (field762[arg1] != null) {
                var6.method17(field762[arg1]);
            }
            var6.field854 = field768[arg1];
            var6.field843 = field760[arg1];
            int var7 = field767[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field827[0] = field773[arg1];
            var6.field55 = (byte) var8;
            var6.method21((var9 << 6) + var3 - Statics.field2205, (var10 << 6) + var4 - Statics.field68);
            var6.field57 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2712(2);
            int var12 = field767[arg1];
            field767[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2712(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field767[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field767[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2712(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field767[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field767[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("d.k(Ldl;B)V")
    public static final void method45(class123 arg0) {
        for (int var1 = 0; var1 < field770; var1++) {
            int var2 = field771[var1];
            class3 var3 = client.field551[var2];
            int var4 = arg0.method2462();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method2462() << 8;
            }
            method2378(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("dm.r(Ldl;ILd;IB)V")
    public static final void method2378(class123 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x80) != 0) {
            int var5 = arg0.method2462();
            byte[] var6 = new byte[var5];
            class120 var7 = new class120(var6);
            arg0.method2589(var6, 0, var5);
            field762[arg1] = var7;
            arg2.method17(var7);
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = arg0.method2464();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2462();
            client.method3489(arg2, var8, var9);
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field843 = arg0.method2464();
            if (arg2.field843 == 65535) {
                arg2.field843 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field831 = arg0.method2470();
            if (arg2.field831.charAt(0) == '~') {
                arg2.field831 = arg2.field831.substring(1);
                class12.method2783(2, arg2.field59, arg2.field831);
            } else if (Statics.field94 == arg2) {
                class12.method2783(2, arg2.field59, arg2.field831);
            }
            arg2.field862 = false;
            arg2.field835 = 0;
            arg2.field874 = 0;
            arg2.field857 = 150;
        }
        if ((arg3 & 0x20) != 0) {
            int var10 = arg0.method2464();
            int var11 = arg0.method2462();
            arg2.method817(var10, var11, client.field307);
            arg2.field871 = client.field307 + 300;
            arg2.field841 = arg0.method2462();
            arg2.field832 = arg0.method2462();
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field828 = arg0.method2464();
            if (arg2.field822 == 0) {
                arg2.field854 = arg2.field828;
                arg2.field828 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var12 = arg0.method2464();
            class153[] var13 = new class153[] { class153.field2262, class153.field2269, class153.field2263, class153.field2264, class153.field2266 };
            class153 var14 = (class153) class110.method2766(var13, arg0.method2462());
            boolean var15 = arg0.method2462() == 1;
            int var16 = arg0.method2462();
            int var17 = arg0.field1993;
            if (arg2.field59 != null && arg2.field34 != null) {
                boolean var18 = false;
                if (var14.field2260 && client.method789(arg2.field59)) {
                    var18 = true;
                }
                if (!var18 && client.field367 == 0 && !arg2.field52) {
                    field764.field1993 = 0;
                    arg0.method2589(field764.field1994, 0, var16);
                    field764.field1993 = 0;
                    String var19 = class224.method3854(class164.method15(class223.method2790(field764)));
                    arg2.field831 = var19.trim();
                    arg2.field835 = var12 >> 8;
                    arg2.field874 = var12 & 0xFF;
                    arg2.field857 = 150;
                    arg2.field862 = var15;
                    arg2.field833 = Statics.field94 != arg2 && var14.field2260 && client.field331 != "" && var19.toLowerCase().indexOf(client.field331) == -1;
                    int var20;
                    if (var14.field2267) {
                        var20 = var15 ? 91 : 1;
                    } else {
                        var20 = var15 ? 90 : 2;
                    }
                    if (var14.field2261 == -1) {
                        class12.method2783(var20, arg2.field59, var19);
                    } else {
                        class12.method2783(var20, class2.method2761(var14.field2261) + arg2.field59, var19);
                    }
                }
            }
            arg0.field1993 = var16 + var17;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field866 = arg0.method2464();
            int var21 = arg0.method2467();
            arg2.field858 = var21 >> 16;
            arg2.field851 = (var21 & 0xFFFF) + client.field307;
            arg2.field855 = 0;
            arg2.field856 = 0;
            if (arg2.field851 > client.field307) {
                arg2.field855 = -1;
            }
            if (arg2.field866 == 65535) {
                arg2.field866 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field859 = arg0.method2548();
            arg2.field861 = arg0.method2548();
            arg2.field860 = arg0.method2548();
            arg2.field834 = arg0.method2548();
            arg2.field863 = arg0.method2464() + client.field307;
            arg2.field867 = arg0.method2464() + client.field307;
            arg2.field865 = arg0.method2464();
            if (arg2.field57) {
                arg2.field859 += arg2.field58;
                arg2.field861 += arg2.field35;
                arg2.field860 += arg2.field58;
                arg2.field834 += arg2.field35;
                arg2.field822 = 0;
            } else {
                arg2.field859 += arg2.field872[0];
                arg2.field861 += arg2.field836[0];
                arg2.field860 += arg2.field872[0];
                arg2.field834 += arg2.field836[0];
                arg2.field822 = 1;
            }
            arg2.field876 = 0;
        }
        if ((arg3 & 0x2000) != 0) {
            int var22 = arg0.method2464();
            int var23 = arg0.method2462();
            arg2.method817(var22, var23, client.field307);
            arg2.field871 = client.field307 + 300;
            arg2.field841 = arg0.method2462();
            arg2.field832 = arg0.method2462();
        }
        if ((arg3 & 0x800) != 0) {
            field773[arg1] = arg0.method2548();
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method2548();
        }
        if ((arg3 & 0x200) != 0) {
            for (int var24 = 0; var24 < 3; var24++) {
                arg2.field56[var24] = arg0.method2470();
            }
        }
        if (!arg2.field57) {
            return;
        }
        if (var4 == 127) {
            arg2.method21(arg2.field58, arg2.field35);
            return;
        }
        byte var25;
        if (var4 == -1) {
            var25 = field773[arg1];
        } else {
            var25 = var4;
        }
        arg2.method20(arg2.field58, arg2.field35, var25);
    }
}
