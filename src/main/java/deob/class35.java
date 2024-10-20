package deob;

@ObfuscatedName("ag")
public class class35 {

    @ObfuscatedName("ag.t")
    public static byte[] field741 = new byte[2048];

    @ObfuscatedName("ag.y")
    public static byte[] field742 = new byte[2048];

    @ObfuscatedName("ag.p")
    public static class123[] field743 = new class123[2048];

    @ObfuscatedName("ag.g")
    public static int field744 = 0;

    @ObfuscatedName("ag.m")
    public static int[] field740 = new int[2048];

    @ObfuscatedName("ag.f")
    public static int field746 = 0;

    @ObfuscatedName("ag.k")
    public static int[] field755 = new int[2048];

    @ObfuscatedName("ag.h")
    public static int[] field748 = new int[2048];

    @ObfuscatedName("ag.r")
    public static int[] field749 = new int[2048];

    @ObfuscatedName("ag.w")
    public static int[] field756 = new int[2048];

    @ObfuscatedName("ag.u")
    public static int field751 = 0;

    @ObfuscatedName("ag.n")
    public static int[] field745 = new int[2048];

    @ObfuscatedName("ag.d")
    public static class123 field752 = new class123(new byte[5000]);

    public class35() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.s(Ldp;B)V")
    public static final void method104(class126 arg0) {
        arg0.method2632();
        int var1 = client.field382;
        class3 var2 = Statics.field1663 = client.field391[var1] = new class3();
        var2.field49 = var1;
        int var3 = arg0.method2644(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field857[0] = var5 - Statics.field590;
        var2.field810 = (var2.field857[0] << 7) + (var2.method10() << 6);
        var2.field831[0] = var6 - Statics.field133;
        var2.field843 = (var2.field831[0] << 7) + (var2.method10() << 6);
        Statics.field1239 = var2.field48 = var4;
        if (field743[var1] != null) {
            var2.method8(field743[var1]);
        }
        field744 = 0;
        field740[++field744 - 1] = var1;
        field741[var1] = 0;
        field746 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2644(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field748[var7] = (var9 << 28) + (var10 << 14) + var11;
                field749[var7] = 0;
                field756[var7] = -1;
                field755[++field746 - 1] = var7;
                field741[var7] = 0;
            }
        }
        arg0.method2633();
    }

    @ObfuscatedName("az.z(Ldp;I)I")
    public static int method859(class126 arg0) {
        int var1 = arg0.method2644(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2644(5);
        } else if (var1 == 2) {
            var2 = arg0.method2644(8);
        } else {
            var2 = arg0.method2644(11);
        }
        return var2;
    }

    @ObfuscatedName("an.t(Ldp;IB)V")
    public static void method682(class126 arg0, int arg1) {
        boolean var2 = arg0.method2644(1) == 1;
        if (var2) {
            field745[++field751 - 1] = arg1;
        }
        int var3 = arg0.method2644(2);
        class3 var4 = client.field391[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field47 = false;
            } else if (client.field382 == arg1) {
                throw new RuntimeException();
            } else {
                field748[arg1] = (Statics.field133 + var4.field831[0] >> 6) + (Statics.field590 + var4.field857[0] >> 6 << 14) + (var4.field48 << 28);
                if (var4.field851 == -1) {
                    field749[arg1] = var4.field853;
                } else {
                    field749[arg1] = var4.field851;
                }
                field756[arg1] = var4.field823;
                client.field391[arg1] = null;
                if (arg0.method2644(1) != 0) {
                    method183(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2644(3);
            int var6 = var4.field857[0];
            int var7 = var4.field831[0];
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
            if (client.field382 == arg1 && var4.field810 < 1536 || var4.field843 < 1536 || var4.field810 >= 11776 || var4.field843 >= 11776) {
                var4.method13(var6, var7);
                var4.field47 = false;
            } else if (var2) {
                var4.field47 = true;
                var4.field54 = var6;
                var4.field52 = var7;
            } else {
                var4.field47 = false;
                var4.method12(var6, var7, field742[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2644(4);
            int var9 = var4.field857[0];
            int var10 = var4.field831[0];
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
            if (client.field382 == arg1 && var4.field810 < 1536 || var4.field843 < 1536 || var4.field810 >= 11776 || var4.field843 >= 11776) {
                var4.method13(var9, var10);
                var4.field47 = false;
            } else if (var2) {
                var4.field47 = true;
                var4.field54 = var9;
                var4.field52 = var10;
            } else {
                var4.field47 = false;
                var4.method12(var9, var10, field742[arg1]);
            }
        } else {
            int var11 = arg0.method2644(1);
            if (var11 == 0) {
                int var12 = arg0.method2644(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field857[0] + var14;
                int var17 = var4.field831[0] + var15;
                if (client.field382 == arg1 && var4.field810 < 1536 || var4.field843 < 1536 || var4.field810 >= 11776 || var4.field843 >= 11776) {
                    var4.method13(var16, var17);
                    var4.field47 = false;
                } else if (var2) {
                    var4.field47 = true;
                    var4.field54 = var16;
                    var4.field52 = var17;
                } else {
                    var4.field47 = false;
                    var4.method12(var16, var17, field742[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var13 & 0x3);
                if (client.field382 == arg1) {
                    Statics.field1239 = var4.field48;
                }
            } else {
                int var18 = arg0.method2644(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field590 + var4.field857[0] + var20 & 0x3FFF) - Statics.field590;
                int var23 = (Statics.field133 + var4.field831[0] + var21 & 0x3FFF) - Statics.field133;
                if (client.field382 == arg1 && var4.field810 < 1536 || var4.field843 < 1536 || var4.field810 >= 11776 || var4.field843 >= 11776) {
                    var4.method13(var22, var23);
                    var4.field47 = false;
                } else if (var2) {
                    var4.field47 = true;
                    var4.field54 = var22;
                    var4.field52 = var23;
                } else {
                    var4.field47 = false;
                    var4.method12(var22, var23, field742[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var19 & 0x3);
                if (client.field382 == arg1) {
                    Statics.field1239 = var4.field48;
                }
            }
        }
    }

    @ObfuscatedName("b.y(Ldp;IB)Z")
    public static boolean method183(class126 arg0, int arg1) {
        int var2 = arg0.method2644(2);
        if (var2 == 0) {
            if (arg0.method2644(1) != 0) {
                method183(arg0, arg1);
            }
            int var3 = arg0.method2644(6);
            int var4 = arg0.method2644(6);
            boolean var5 = arg0.method2644(1) == 1;
            if (var5) {
                field745[++field751 - 1] = arg1;
            }
            if (client.field391[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field391[arg1] = new class3();
            var6.field49 = arg1;
            if (field743[arg1] != null) {
                var6.method8(field743[arg1]);
            }
            var6.field853 = field749[arg1];
            var6.field823 = field756[arg1];
            int var7 = field748[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field859[0] = field742[arg1];
            var6.field48 = (byte) var8;
            var6.method13((var9 << 6) + var3 - Statics.field590, (var10 << 6) + var4 - Statics.field133);
            var6.field47 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2644(2);
            int var12 = field748[arg1];
            field748[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2644(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field748[arg1];
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
            field748[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2644(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field748[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field748[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("t.p(Ldp;I)V")
    public static final void method39(class126 arg0) {
        for (int var1 = 0; var1 < field751; var1++) {
            int var2 = field745[var1];
            class3 var3 = client.field391[var2];
            int var4 = arg0.method2363();
            if ((var4 & 0x10) != 0) {
                var4 += arg0.method2363() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x20) != 0) {
                int var6 = arg0.method2363();
                byte[] var7 = new byte[var6];
                class123 var8 = new class123(var7);
                arg0.method2374(var7, 0, var6);
                field743[var2] = var8;
                var3.method8(var8);
            }
            if ((var4 & 0x80) != 0) {
                int var9 = arg0.method2550();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2363();
                client.method672(var3, var9, var10);
            }
            if ((var4 & 0x1) != 0) {
                var3.field823 = arg0.method2550();
                if (var3.field823 == 65535) {
                    var3.field823 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field815 = arg0.method2385();
                if (var3.field815.charAt(0) == '~') {
                    var3.field815 = var3.field815.substring(1);
                    class12.method37(2, var3.field30, var3.field815);
                } else if (Statics.field1663 == var3) {
                    class12.method37(2, var3.field30, var3.field815);
                }
                var3.field816 = false;
                var3.field819 = 0;
                var3.field820 = 0;
                var3.field818 = 150;
            }
            if ((var4 & 0x8) != 0) {
                int var11 = arg0.method2363();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2536();
                        if (var16 == 32767) {
                            var16 = arg0.method2536();
                            var14 = arg0.method2536();
                            var13 = arg0.method2536();
                            var15 = arg0.method2536();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2536();
                        }
                        int var17 = arg0.method2536();
                        var3.method757(var16, var14, var13, var15, client.field326, var17);
                    }
                }
                int var18 = arg0.method2363();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2536();
                        int var21 = arg0.method2536();
                        if (var21 == 32767) {
                            var3.method759(var20);
                        } else {
                            int var22 = arg0.method2536();
                            int var23 = arg0.method2363();
                            int var24 = var21 > 0 ? arg0.method2363() : var23;
                            var3.method764(var20, client.field326, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field851 = arg0.method2550();
                if (var3.field856 == 0) {
                    var3.field853 = var3.field851;
                    var3.field851 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var25 = arg0.method2550();
                class156[] var26 = new class156[] { class156.field2310, class156.field2306, class156.field2308, class156.field2307, class156.field2309 };
                class156 var27 = (class156) class113.method1576(var26, arg0.method2363());
                boolean var28 = arg0.method2363() == 1;
                int var29 = arg0.method2363();
                int var30 = arg0.field2028;
                if (var3.field30 != null && var3.field27 != null) {
                    boolean var31 = false;
                    if (var27.field2313 && client.method752(var3.field30)) {
                        var31 = true;
                    }
                    if (!var31 && client.field427 == 0 && !var3.field51) {
                        field752.field2028 = 0;
                        arg0.method2374(field752.field2033, 0, var29);
                        field752.field2028 = 0;
                        String var32 = class227.method3833(class167.method3283(class226.method2985(field752)));
                        var3.field815 = var32.trim();
                        var3.field819 = var25 >> 8;
                        var3.field820 = var25 & 0xFF;
                        var3.field818 = 150;
                        var3.field816 = var28;
                        var3.field817 = Statics.field1663 != var3 && var27.field2313 && client.field489 != "" && var32.toLowerCase().indexOf(client.field489) == -1;
                        int var33;
                        if (var27.field2315) {
                            var33 = var28 ? 91 : 1;
                        } else {
                            var33 = var28 ? 90 : 2;
                        }
                        if (var27.field2305 == -1) {
                            class12.method37(var33, var3.field30, var32);
                        } else {
                            int var35 = var27.field2305;
                            String var36 = "<img=" + var35 + ">";
                            class12.method37(var33, var36 + var3.field30, var32);
                        }
                    }
                }
                arg0.field2028 = var29 + var30;
            }
            if ((var4 & 0x200) != 0) {
                var3.field805 = arg0.method2550();
                int var37 = arg0.method2408();
                var3.field840 = var37 >> 16;
                var3.field854 = (var37 & 0xFFFF) + client.field326;
                var3.field812 = 0;
                var3.field841 = 0;
                if (var3.field854 > client.field326) {
                    var3.field812 = -1;
                }
                if (var3.field805 == 65535) {
                    var3.field805 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field844 = arg0.method2483();
                var3.field846 = arg0.method2483();
                var3.field845 = arg0.method2483();
                var3.field847 = arg0.method2483();
                var3.field848 = arg0.method2550() + client.field326;
                var3.field849 = arg0.method2550() + client.field326;
                var3.field850 = arg0.method2550();
                if (var3.field47) {
                    var3.field844 += var3.field54;
                    var3.field846 += var3.field52;
                    var3.field845 += var3.field54;
                    var3.field847 += var3.field52;
                    var3.field856 = 0;
                } else {
                    var3.field844 += var3.field857[0];
                    var3.field846 += var3.field831[0];
                    var3.field845 += var3.field857[0];
                    var3.field847 += var3.field831[0];
                    var3.field856 = 1;
                }
                var3.field822 = 0;
            }
            if ((var4 & 0x800) != 0) {
                field742[var2] = arg0.method2483();
            }
            if ((var4 & 0x400) != 0) {
                var5 = arg0.method2483();
            }
            if ((var4 & 0x1000) != 0) {
                for (int var38 = 0; var38 < 3; var38++) {
                    var3.field31[var38] = arg0.method2385();
                }
            }
            if (var3.field47) {
                if (var5 == 127) {
                    var3.method13(var3.field54, var3.field52);
                } else {
                    byte var39;
                    if (var5 == -1) {
                        var39 = field742[var2];
                    } else {
                        var39 = var5;
                    }
                    var3.method12(var3.field54, var3.field52, var39);
                }
            }
        }
    }

    @ObfuscatedName("ae.g(B)V")
    public static void method601() {
        field744 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field743[var0] = null;
            field742[var0] = 1;
        }
    }
}
