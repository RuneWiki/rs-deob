package deob;

@ObfuscatedName("au")
public class class33 {

    @ObfuscatedName("au.o")
    public static byte[] field726 = new byte[2048];

    @ObfuscatedName("au.z")
    public static byte[] field735 = new byte[2048];

    @ObfuscatedName("au.c")
    public static class119[] field728 = new class119[2048];

    @ObfuscatedName("au.d")
    public static int field729 = 0;

    @ObfuscatedName("au.l")
    public static int[] field730 = new int[2048];

    @ObfuscatedName("au.b")
    public static int field731 = 0;

    @ObfuscatedName("au.j")
    public static int[] field732 = new int[2048];

    @ObfuscatedName("au.f")
    public static int[] field724 = new int[2048];

    @ObfuscatedName("au.i")
    public static int[] field727 = new int[2048];

    @ObfuscatedName("au.g")
    public static int[] field740 = new int[2048];

    @ObfuscatedName("au.t")
    public static int field736 = 0;

    @ObfuscatedName("au.e")
    public static int[] field737 = new int[2048];

    @ObfuscatedName("au.q")
    public static class119 field738 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.k(Ldh;I)V")
    public static final void method799(class122 arg0) {
        arg0.method2590();
        int var1 = client.field501;
        class3 var2 = Statics.field2258 = client.field321[var1] = new class3();
        var2.field49 = var1;
        int var3 = arg0.method2565(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field842[0] = var5 - Statics.field2725;
        var2.field818 = (var2.field842[0] << 7) + (var2.method16() << 6);
        var2.field844[0] = var6 - Statics.field1887;
        var2.field788 = (var2.field844[0] << 7) + (var2.method16() << 6);
        Statics.field2108 = var2.field48 = var4;
        if (field728[var1] != null) {
            var2.method9(field728[var1]);
        }
        field729 = 0;
        field730[++field729 - 1] = var1;
        field726[var1] = 0;
        field731 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2565(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field724[var7] = (var9 << 28) + (var10 << 14) + var11;
                field727[var7] = 0;
                field740[var7] = -1;
                field732[++field731 - 1] = var7;
                field726[var7] = 0;
            }
        }
        arg0.method2571();
    }

    @ObfuscatedName("ac.h(Ldh;I)I")
    public static int method951(class122 arg0) {
        int var1 = arg0.method2565(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2565(5);
        } else if (var1 == 2) {
            var2 = arg0.method2565(8);
        } else {
            var2 = arg0.method2565(11);
        }
        return var2;
    }

    @ObfuscatedName("j.o(Ldh;IB)V")
    public static void method114(class122 arg0, int arg1) {
        boolean var2 = arg0.method2565(1) == 1;
        if (var2) {
            field737[++field736 - 1] = arg1;
        }
        int var3 = arg0.method2565(2);
        class3 var4 = client.field321[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field50 = false;
            } else if (client.field501 == arg1) {
                throw new RuntimeException();
            } else {
                field724[arg1] = (Statics.field1887 + var4.field844[0] >> 6) + (Statics.field2725 + var4.field842[0] >> 6 << 14) + (var4.field48 << 28);
                if (var4.field810 == -1) {
                    field727[arg1] = var4.field837;
                } else {
                    field727[arg1] = var4.field810;
                }
                field740[arg1] = var4.field812;
                client.field321[arg1] = null;
                if (arg0.method2565(1) != 0) {
                    method5(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2565(3);
            int var6 = var4.field842[0];
            int var7 = var4.field844[0];
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
            if (client.field501 == arg1 && var4.field818 < 1536 || var4.field788 < 1536 || var4.field818 >= 11776 || var4.field788 >= 11776) {
                var4.method13(var6, var7);
                var4.field50 = false;
            } else if (var2) {
                var4.field50 = true;
                var4.field53 = var6;
                var4.field52 = var7;
            } else {
                var4.field50 = false;
                var4.method12(var6, var7, field735[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2565(4);
            int var9 = var4.field842[0];
            int var10 = var4.field844[0];
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
            if (client.field501 == arg1 && var4.field818 < 1536 || var4.field788 < 1536 || var4.field818 >= 11776 || var4.field788 >= 11776) {
                var4.method13(var9, var10);
                var4.field50 = false;
            } else if (var2) {
                var4.field50 = true;
                var4.field53 = var9;
                var4.field52 = var10;
            } else {
                var4.field50 = false;
                var4.method12(var9, var10, field735[arg1]);
            }
        } else {
            int var11 = arg0.method2565(1);
            if (var11 == 0) {
                int var12 = arg0.method2565(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field842[0] + var14;
                int var17 = var4.field844[0] + var15;
                if (client.field501 == arg1 && var4.field818 < 1536 || var4.field788 < 1536 || var4.field818 >= 11776 || var4.field788 >= 11776) {
                    var4.method13(var16, var17);
                    var4.field50 = false;
                } else if (var2) {
                    var4.field50 = true;
                    var4.field53 = var16;
                    var4.field52 = var17;
                } else {
                    var4.field50 = false;
                    var4.method12(var16, var17, field735[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var13 & 0x3);
                if (client.field501 == arg1) {
                    Statics.field2108 = var4.field48;
                }
            } else {
                int var18 = arg0.method2565(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2725 + var4.field842[0] + var20 & 0x3FFF) - Statics.field2725;
                int var23 = (Statics.field1887 + var4.field844[0] + var21 & 0x3FFF) - Statics.field1887;
                if (client.field501 == arg1 && var4.field818 < 1536 || var4.field788 < 1536 || var4.field818 >= 11776 || var4.field788 >= 11776) {
                    var4.method13(var22, var23);
                    var4.field50 = false;
                } else if (var2) {
                    var4.field50 = true;
                    var4.field53 = var22;
                    var4.field52 = var23;
                } else {
                    var4.field50 = false;
                    var4.method12(var22, var23, field735[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var19 & 0x3);
                if (client.field501 == arg1) {
                    Statics.field2108 = var4.field48;
                }
            }
        }
    }

    @ObfuscatedName("h.z(Ldh;II)Z")
    public static boolean method5(class122 arg0, int arg1) {
        int var2 = arg0.method2565(2);
        if (var2 == 0) {
            if (arg0.method2565(1) != 0) {
                method5(arg0, arg1);
            }
            int var3 = arg0.method2565(6);
            int var4 = arg0.method2565(6);
            boolean var5 = arg0.method2565(1) == 1;
            if (var5) {
                field737[++field736 - 1] = arg1;
            }
            if (client.field321[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field321[arg1] = new class3();
            var6.field49 = arg1;
            if (field728[arg1] != null) {
                var6.method9(field728[arg1]);
            }
            var6.field837 = field727[arg1];
            var6.field812 = field740[arg1];
            int var7 = field724[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field843[0] = field735[arg1];
            var6.field48 = (byte) var8;
            var6.method13((var9 << 6) + var3 - Statics.field2725, (var10 << 6) + var4 - Statics.field1887);
            var6.field50 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2565(2);
            int var12 = field724[arg1];
            field724[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2565(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field724[arg1];
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
            field724[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2565(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field724[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field724[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ac.c(Ldh;ILo;IS)V")
    public static final void method956(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x20) != 0) {
            int var5 = arg0.method2330();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2340(var6, 0, var5);
            field728[arg1] = var7;
            arg2.method9(var7);
        }
        if ((arg3 & 0x8) != 0) {
            int var8 = arg0.method2332();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2330();
            client.method3041(arg2, var8, var9);
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field812 = arg0.method2332();
            if (arg2.field812 == 65535) {
                arg2.field812 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field838 = arg0.method2337();
            if (arg2.field838.charAt(0) == '~') {
                arg2.field838 = arg2.field838.substring(1);
                Statics.method78(2, arg2.field41, arg2.field838);
            } else if (Statics.field2258 == arg2) {
                Statics.method78(2, arg2.field41, arg2.field838);
            }
            arg2.field801 = false;
            arg2.field804 = 0;
            arg2.field805 = 0;
            arg2.field803 = 150;
        }
        if ((arg3 & 0x10) != 0) {
            int var10 = arg0.method2332();
            int var11 = arg0.method2330();
            arg2.method693(var10, var11, client.field312);
            arg2.field809 = client.field312 + 300;
            arg2.field839 = arg0.method2330();
            arg2.field794 = arg0.method2330();
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field810 = arg0.method2332();
            if (arg2.field840 == 0) {
                arg2.field837 = arg2.field810;
                arg2.field810 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var12 = arg0.method2332();
            class152[] var13 = new class152[] { class152.field2238, class152.field2236, class152.field2237, class152.field2239, class152.field2243 };
            class152 var14 = (class152) class109.method782(var13, arg0.method2330());
            boolean var15 = arg0.method2330() == 1;
            int var16 = arg0.method2330();
            int var17 = arg0.field1949;
            if (arg2.field41 != null && arg2.field28 != null) {
                boolean var18 = false;
                if (var14.field2245 && client.method742(arg2.field41)) {
                    var18 = true;
                }
                if (!var18 && client.field405 == 0 && !arg2.field47) {
                    field738.field1949 = 0;
                    arg0.method2340(field738.field1960, 0, var16);
                    field738.field1949 = 0;
                    String var19 = class223.method3856(class163.method3718(class222.method142(field738)));
                    arg2.field838 = var19.trim();
                    arg2.field804 = var12 >> 8;
                    arg2.field805 = var12 & 0xFF;
                    arg2.field803 = 150;
                    arg2.field801 = var15;
                    arg2.field815 = Statics.field2258 != arg2 && var14.field2245 && client.field503 != "" && var19.toLowerCase().indexOf(client.field503) == -1;
                    int var20;
                    if (var14.field2235) {
                        var20 = var15 ? 91 : 1;
                    } else {
                        var20 = var15 ? 90 : 2;
                    }
                    if (var14.field2241 == -1) {
                        Statics.method78(var20, arg2.field41, var19);
                    } else {
                        int var22 = var14.field2241;
                        String var23 = "<img=" + var22 + ">";
                        Statics.method78(var20, var23 + arg2.field41, var19);
                    }
                }
            }
            arg0.field1949 = var16 + var17;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field802 = arg0.method2332();
            int var24 = arg0.method2415();
            arg2.field836 = var24 >> 16;
            arg2.field826 = (var24 & 0xFFFF) + client.field312;
            arg2.field824 = 0;
            arg2.field825 = 0;
            if (arg2.field826 > client.field312) {
                arg2.field824 = -1;
            }
            if (arg2.field802 == 65535) {
                arg2.field802 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field828 = arg0.method2413();
            arg2.field830 = arg0.method2413();
            arg2.field835 = arg0.method2413();
            arg2.field831 = arg0.method2413();
            arg2.field817 = arg0.method2332() + client.field312;
            arg2.field833 = arg0.method2332() + client.field312;
            arg2.field827 = arg0.method2332();
            if (arg2.field50) {
                arg2.field828 += arg2.field53;
                arg2.field830 += arg2.field52;
                arg2.field835 += arg2.field53;
                arg2.field831 += arg2.field52;
                arg2.field840 = 0;
            } else {
                arg2.field828 += arg2.field842[0];
                arg2.field830 += arg2.field844[0];
                arg2.field835 += arg2.field842[0];
                arg2.field831 += arg2.field844[0];
                arg2.field840 = 1;
            }
            arg2.field823 = 0;
        }
        if ((arg3 & 0x2000) != 0) {
            int var25 = arg0.method2332();
            int var26 = arg0.method2330();
            arg2.method693(var25, var26, client.field312);
            arg2.field809 = client.field312 + 300;
            arg2.field839 = arg0.method2330();
            arg2.field794 = arg0.method2330();
        }
        if ((arg3 & 0x400) != 0) {
            field735[arg1] = arg0.method2413();
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method2413();
        }
        if ((arg3 & 0x200) != 0) {
            for (int var27 = 0; var27 < 3; var27++) {
                arg2.field44[var27] = arg0.method2337();
            }
        }
        if (!arg2.field50) {
            return;
        }
        if (var4 == 127) {
            arg2.method13(arg2.field53, arg2.field52);
            return;
        }
        byte var28;
        if (var4 == -1) {
            var28 = field735[arg1];
        } else {
            var28 = var4;
        }
        arg2.method12(arg2.field53, arg2.field52, var28);
    }

    @ObfuscatedName("dk.d(I)V")
    public static void method2521() {
        field729 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field728[var0] = null;
            field735[var0] = 1;
        }
    }
}
