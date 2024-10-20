package deob;

@ObfuscatedName("ae")
public class class33 {

    @ObfuscatedName("ae.f")
    public static byte[] field757 = new byte[2048];

    @ObfuscatedName("ae.h")
    public static byte[] field758 = new byte[2048];

    @ObfuscatedName("ae.a")
    public static class119[] field759 = new class119[2048];

    @ObfuscatedName("ae.s")
    public static int field768 = 0;

    @ObfuscatedName("ae.p")
    public static int[] field761 = new int[2048];

    @ObfuscatedName("ae.r")
    public static int field762 = 0;

    @ObfuscatedName("ae.k")
    public static int[] field770 = new int[2048];

    @ObfuscatedName("ae.d")
    public static int[] field764 = new int[2048];

    @ObfuscatedName("ae.n")
    public static int[] field765 = new int[2048];

    @ObfuscatedName("ae.z")
    public static int[] field766 = new int[2048];

    @ObfuscatedName("ae.c")
    public static int field771 = 0;

    @ObfuscatedName("ae.b")
    public static int[] field763 = new int[2048];

    @ObfuscatedName("ae.w")
    public static class119 field769 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.i(Ldt;B)V")
    public static final void method107(class122 arg0) {
        arg0.method2551();
        int var1 = client.field336;
        class3 var2 = Statics.field162 = client.field412[var1] = new class3();
        var2.field56 = var1;
        int var3 = arg0.method2567(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field878[0] = var5 - Statics.field2644;
        var2.field855 = (var2.field878[0] << 7) + (var2.method16() << 6);
        var2.field879[0] = var6 - Statics.field934;
        var2.field825 = (var2.field879[0] << 7) + (var2.method16() << 6);
        Statics.field1963 = var2.field55 = var4;
        if (field759[var1] != null) {
            var2.method15(field759[var1]);
        }
        field768 = 0;
        field761[++field768 - 1] = var1;
        field757[var1] = 0;
        field762 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2567(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field764[var7] = (var9 << 28) + (var10 << 14) + var11;
                field765[var7] = 0;
                field766[var7] = -1;
                field770[++field762 - 1] = var7;
                field757[var7] = 0;
            }
        }
        arg0.method2552();
    }

    @ObfuscatedName("ab.v(Ldt;IB)V")
    public static final void method606(class122 arg0, int arg1) {
        int var2 = arg0.field1984;
        field771 = 0;
        int var3 = 0;
        arg0.method2551();
        for (int var4 = 0; var4 < field768; var4++) {
            int var5 = field761[var4];
            if ((field757[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field757[var5] = (byte) (field757[var5] | 0x2);
                } else {
                    int var6 = arg0.method2567(1);
                    if (var6 == 0) {
                        var3 = method90(arg0);
                        field757[var5] = (byte) (field757[var5] | 0x2);
                    } else {
                        method680(arg0, var5);
                    }
                }
            }
        }
        arg0.method2552();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2551();
        for (int var7 = 0; var7 < field768; var7++) {
            int var8 = field761[var7];
            if ((field757[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field757[var8] = (byte) (field757[var8] | 0x2);
                } else {
                    int var9 = arg0.method2567(1);
                    if (var9 == 0) {
                        var3 = method90(arg0);
                        field757[var8] = (byte) (field757[var8] | 0x2);
                    } else {
                        method680(arg0, var8);
                    }
                }
            }
        }
        arg0.method2552();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2551();
        for (int var10 = 0; var10 < field762; var10++) {
            int var11 = field770[var10];
            if ((field757[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field757[var11] = (byte) (field757[var11] | 0x2);
                } else {
                    int var12 = arg0.method2567(1);
                    if (var12 == 0) {
                        var3 = method90(arg0);
                        field757[var11] = (byte) (field757[var11] | 0x2);
                    } else if (method2591(arg0, var11)) {
                        field757[var11] = (byte) (field757[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2552();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2551();
        for (int var13 = 0; var13 < field762; var13++) {
            int var14 = field770[var13];
            if ((field757[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field757[var14] = (byte) (field757[var14] | 0x2);
                } else {
                    int var15 = arg0.method2567(1);
                    if (var15 == 0) {
                        var3 = method90(arg0);
                        field757[var14] = (byte) (field757[var14] | 0x2);
                    } else if (method2591(arg0, var14)) {
                        field757[var14] = (byte) (field757[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2552();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field768 = 0;
        field762 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field757[var16] = (byte) (field757[var16] >> 1);
            class3 var17 = client.field412[var16];
            if (var17 == null) {
                field770[++field762 - 1] = var16;
            } else {
                field761[++field768 - 1] = var16;
            }
        }
        method91(arg0);
        if (arg0.field1984 - var2 != arg1) {
            throw new RuntimeException(arg0.field1984 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("s.f(Ldt;B)I")
    public static int method90(class122 arg0) {
        int var1 = arg0.method2567(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2567(5);
        } else if (var1 == 2) {
            var2 = arg0.method2567(8);
        } else {
            var2 = arg0.method2567(11);
        }
        return var2;
    }

    @ObfuscatedName("aq.h(Ldt;IB)V")
    public static void method680(class122 arg0, int arg1) {
        boolean var2 = arg0.method2567(1) == 1;
        if (var2) {
            field763[++field771 - 1] = arg1;
        }
        int var3 = arg0.method2567(2);
        class3 var4 = client.field412[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field57 = false;
            } else if (client.field336 == arg1) {
                throw new RuntimeException();
            } else {
                field764[arg1] = (Statics.field934 + var4.field879[0] >> 6) + (Statics.field2644 + var4.field878[0] >> 6 << 14) + (var4.field55 << 28);
                if (var4.field830 == -1) {
                    field765[arg1] = var4.field874;
                } else {
                    field765[arg1] = var4.field830;
                }
                field766[arg1] = var4.field849;
                client.field412[arg1] = null;
                if (arg0.method2567(1) != 0) {
                    method2591(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2567(3);
            int var6 = var4.field878[0];
            int var7 = var4.field879[0];
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
            if (client.field336 == arg1 && var4.field855 < 1536 || var4.field825 < 1536 || var4.field855 >= 11776 || var4.field825 >= 11776) {
                var4.method37(var6, var7);
                var4.field57 = false;
            } else if (var2) {
                var4.field57 = true;
                var4.field58 = var6;
                var4.field59 = var7;
            } else {
                var4.field57 = false;
                var4.method18(var6, var7, field758[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2567(4);
            int var9 = var4.field878[0];
            int var10 = var4.field879[0];
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
            if (client.field336 == arg1 && var4.field855 < 1536 || var4.field825 < 1536 || var4.field855 >= 11776 || var4.field825 >= 11776) {
                var4.method37(var9, var10);
                var4.field57 = false;
            } else if (var2) {
                var4.field57 = true;
                var4.field58 = var9;
                var4.field59 = var10;
            } else {
                var4.field57 = false;
                var4.method18(var9, var10, field758[arg1]);
            }
        } else {
            int var11 = arg0.method2567(1);
            if (var11 == 0) {
                int var12 = arg0.method2567(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field878[0] + var14;
                int var17 = var4.field879[0] + var15;
                if (client.field336 == arg1 && var4.field855 < 1536 || var4.field825 < 1536 || var4.field855 >= 11776 || var4.field825 >= 11776) {
                    var4.method37(var16, var17);
                    var4.field57 = false;
                } else if (var2) {
                    var4.field57 = true;
                    var4.field58 = var16;
                    var4.field59 = var17;
                } else {
                    var4.field57 = false;
                    var4.method18(var16, var17, field758[arg1]);
                }
                var4.field55 = (byte) (var4.field55 + var13 & 0x3);
                if (client.field336 == arg1) {
                    Statics.field1963 = var4.field55;
                }
            } else {
                int var18 = arg0.method2567(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2644 + var4.field878[0] + var20 & 0x3FFF) - Statics.field2644;
                int var23 = (Statics.field934 + var4.field879[0] + var21 & 0x3FFF) - Statics.field934;
                if (client.field336 == arg1 && var4.field855 < 1536 || var4.field825 < 1536 || var4.field855 >= 11776 || var4.field825 >= 11776) {
                    var4.method37(var22, var23);
                    var4.field57 = false;
                } else if (var2) {
                    var4.field57 = true;
                    var4.field58 = var22;
                    var4.field59 = var23;
                } else {
                    var4.field57 = false;
                    var4.method18(var22, var23, field758[arg1]);
                }
                var4.field55 = (byte) (var4.field55 + var19 & 0x3);
                if (client.field336 == arg1) {
                    Statics.field1963 = var4.field55;
                }
            }
        }
    }

    @ObfuscatedName("dh.a(Ldt;II)Z")
    public static boolean method2591(class122 arg0, int arg1) {
        int var2 = arg0.method2567(2);
        if (var2 == 0) {
            if (arg0.method2567(1) != 0) {
                method2591(arg0, arg1);
            }
            int var3 = arg0.method2567(6);
            int var4 = arg0.method2567(6);
            boolean var5 = arg0.method2567(1) == 1;
            if (var5) {
                field763[++field771 - 1] = arg1;
            }
            if (client.field412[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field412[arg1] = new class3();
            var6.field56 = arg1;
            if (field759[arg1] != null) {
                var6.method15(field759[arg1]);
            }
            var6.field874 = field765[arg1];
            var6.field849 = field766[arg1];
            int var7 = field764[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field880[0] = field758[arg1];
            var6.field55 = (byte) var8;
            var6.method37((var9 << 6) + var3 - Statics.field2644, (var10 << 6) + var4 - Statics.field934);
            var6.field57 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2567(2);
            int var12 = field764[arg1];
            field764[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2567(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field764[arg1];
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
            field764[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2567(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field764[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field764[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("s.s(Ldt;I)V")
    public static final void method91(class122 arg0) {
        for (int var1 = 0; var1 < field771; var1++) {
            int var2 = field763[var1];
            class3 var3 = client.field412[var2];
            int var4 = arg0.method2310();
            if ((var4 & 0x20) != 0) {
                var4 += arg0.method2310() << 8;
            }
            method98(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("p.p(Ldt;ILf;IB)V")
    public static final void method98(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method2310();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2339(var6, 0, var5);
            field759[arg1] = var7;
            arg2.method15(var7);
        }
        if ((arg3 & 0x10) != 0) {
            int var8 = arg0.method2312();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2310();
            client.method168(arg2, var8, var9);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field849 = arg0.method2312();
            if (arg2.field849 == 65535) {
                arg2.field849 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field885 = arg0.method2318();
            if (arg2.field885.charAt(0) == '~') {
                arg2.field885 = arg2.field885.substring(1);
                class12.method930(2, arg2.field51, arg2.field885);
            } else if (Statics.field162 == arg2) {
                class12.method930(2, arg2.field51, arg2.field885);
            }
            arg2.field838 = false;
            arg2.field871 = 0;
            arg2.field842 = 0;
            arg2.field840 = 150;
        }
        if ((arg3 & 0x8) != 0) {
            int var10 = arg0.method2312();
            int var11 = arg0.method2310();
            arg2.method705(var10, var11, client.field302);
            arg2.field846 = client.field302 + 300;
            arg2.field847 = arg0.method2310();
            arg2.field877 = arg0.method2310();
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field830 = arg0.method2312();
            if (arg2.field882 == 0) {
                arg2.field874 = arg2.field830;
                arg2.field830 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var12 = arg0.method2312();
            class152 var13 = (class152) class109.method927(class152.method2976(), arg0.method2310());
            boolean var14 = arg0.method2310() == 1;
            int var15 = arg0.method2310();
            int var16 = arg0.field1984;
            if (arg2.field51 != null && arg2.field35 != null) {
                boolean var17 = false;
                if (var13.field2256 && client.method2898(arg2.field51)) {
                    var17 = true;
                }
                if (!var17 && client.field411 == 0 && !arg2.field54) {
                    field769.field1984 = 0;
                    arg0.method2339(field769.field1988, 0, var15);
                    field769.field1984 = 0;
                    String var18 = class223.method3742(class163.method836(Statics.method784(field769)));
                    arg2.field885 = var18.trim();
                    arg2.field871 = var12 >> 8;
                    arg2.field842 = var12 & 0xFF;
                    arg2.field840 = 150;
                    arg2.field838 = var14;
                    arg2.field837 = Statics.field162 != arg2 && var13.field2256 && client.field418 != "" && var18.toLowerCase().indexOf(client.field418) == -1;
                    int var19;
                    if (var13.field2263) {
                        var19 = var14 ? 91 : 1;
                    } else {
                        var19 = var14 ? 90 : 2;
                    }
                    if (var13.field2262 == -1) {
                        class12.method930(var19, arg2.field51, var18);
                    } else {
                        class12.method930(var19, class2.method959(var13.field2262) + arg2.field51, var18);
                    }
                }
            }
            arg0.field1984 = var15 + var16;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field852 = arg0.method2312();
            int var20 = arg0.method2315();
            arg2.field864 = var20 >> 16;
            arg2.field836 = (var20 & 0xFFFF) + client.field302;
            arg2.field861 = 0;
            arg2.field845 = 0;
            if (arg2.field836 > client.field302) {
                arg2.field861 = -1;
            }
            if (arg2.field852 == 65535) {
                arg2.field852 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field865 = arg0.method2311();
            arg2.field833 = arg0.method2311();
            arg2.field866 = arg0.method2311();
            arg2.field868 = arg0.method2311();
            arg2.field869 = arg0.method2312() + client.field302;
            arg2.field870 = arg0.method2312() + client.field302;
            arg2.field862 = arg0.method2312();
            if (arg2.field57) {
                arg2.field865 += arg2.field58;
                arg2.field833 += arg2.field59;
                arg2.field866 += arg2.field58;
                arg2.field868 += arg2.field59;
                arg2.field882 = 0;
            } else {
                arg2.field865 += arg2.field878[0];
                arg2.field833 += arg2.field879[0];
                arg2.field866 += arg2.field878[0];
                arg2.field868 += arg2.field879[0];
                arg2.field882 = 1;
            }
            arg2.field851 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            int var21 = arg0.method2312();
            int var22 = arg0.method2310();
            arg2.method705(var21, var22, client.field302);
            arg2.field846 = client.field302 + 300;
            arg2.field847 = arg0.method2310();
            arg2.field877 = arg0.method2310();
        }
        if ((arg3 & 0x200) != 0) {
            field758[arg1] = arg0.method2311();
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method2311();
        }
        if (!arg2.field57) {
            return;
        }
        if (var4 == 127) {
            arg2.method37(arg2.field58, arg2.field59);
            return;
        }
        byte var23;
        if (var4 == -1) {
            var23 = field758[arg1];
        } else {
            var23 = var4;
        }
        arg2.method18(arg2.field58, arg2.field59, var23);
    }
}
