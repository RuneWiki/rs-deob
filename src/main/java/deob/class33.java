package deob;

@ObfuscatedName("ax")
public class class33 {

    @ObfuscatedName("ax.f")
    public static byte[] field729 = new byte[2048];

    @ObfuscatedName("ax.l")
    public static byte[] field732 = new byte[2048];

    @ObfuscatedName("ax.u")
    public static class119[] field733 = new class119[2048];

    @ObfuscatedName("ax.a")
    public static int field734 = 0;

    @ObfuscatedName("ax.h")
    public static int[] field731 = new int[2048];

    @ObfuscatedName("ax.i")
    public static int field743 = 0;

    @ObfuscatedName("ax.t")
    public static int[] field737 = new int[2048];

    @ObfuscatedName("ax.k")
    public static int[] field738 = new int[2048];

    @ObfuscatedName("ax.s")
    public static int[] field739 = new int[2048];

    @ObfuscatedName("ax.w")
    public static int[] field736 = new int[2048];

    @ObfuscatedName("ax.e")
    public static int field741 = 0;

    @ObfuscatedName("ax.z")
    public static int[] field742 = new int[2048];

    @ObfuscatedName("ax.p")
    public static class119 field740 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.j(Lde;I)V")
    public static final void method2980(class122 arg0) {
        arg0.method2623();
        int var1 = client.field524;
        class3 var2 = Statics.field13 = client.field398[var1] = new class3();
        var2.field59 = var1;
        int var3 = arg0.method2622(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field810[0] = var5 - Statics.field1054;
        var2.field847 = (var2.field810[0] << 7) + (var2.method16() << 6);
        var2.field817[0] = var6 - Statics.field2630;
        var2.field835 = (var2.field817[0] << 7) + (var2.method16() << 6);
        Statics.field135 = var2.field57 = var4;
        if (field733[var1] != null) {
            var2.method15(field733[var1]);
        }
        field734 = 0;
        field731[++field734 - 1] = var1;
        field729[var1] = 0;
        field743 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2622(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field738[var7] = (var9 << 28) + (var10 << 14) + var11;
                field739[var7] = 0;
                field736[var7] = -1;
                field737[++field743 - 1] = var7;
                field729[var7] = 0;
            }
        }
        arg0.method2636();
    }

    @ObfuscatedName("ab.m(Lde;I)V")
    public static final void method1031(class122 arg0) {
        int var1 = 0;
        arg0.method2623();
        for (int var2 = 0; var2 < field734; var2++) {
            int var3 = field731[var2];
            if ((field729[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field729[var3] = (byte) (field729[var3] | 0x2);
                } else {
                    int var4 = arg0.method2622(1);
                    if (var4 == 0) {
                        var1 = method116(arg0);
                        field729[var3] = (byte) (field729[var3] | 0x2);
                    } else {
                        method677(arg0, var3);
                    }
                }
            }
        }
        arg0.method2636();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2623();
        for (int var5 = 0; var5 < field734; var5++) {
            int var6 = field731[var5];
            if ((field729[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field729[var6] = (byte) (field729[var6] | 0x2);
                } else {
                    int var7 = arg0.method2622(1);
                    if (var7 == 0) {
                        var1 = method116(arg0);
                        field729[var6] = (byte) (field729[var6] | 0x2);
                    } else {
                        method677(arg0, var6);
                    }
                }
            }
        }
        arg0.method2636();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2623();
        for (int var8 = 0; var8 < field743; var8++) {
            int var9 = field737[var8];
            if ((field729[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field729[var9] = (byte) (field729[var9] | 0x2);
                } else {
                    int var10 = arg0.method2622(1);
                    if (var10 == 0) {
                        var1 = method116(arg0);
                        field729[var9] = (byte) (field729[var9] | 0x2);
                    } else if (method177(arg0, var9)) {
                        field729[var9] = (byte) (field729[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2636();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2623();
        for (int var11 = 0; var11 < field743; var11++) {
            int var12 = field737[var11];
            if ((field729[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field729[var12] = (byte) (field729[var12] | 0x2);
                } else {
                    int var13 = arg0.method2622(1);
                    if (var13 == 0) {
                        var1 = method116(arg0);
                        field729[var12] = (byte) (field729[var12] | 0x2);
                    } else if (method177(arg0, var12)) {
                        field729[var12] = (byte) (field729[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2636();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field734 = 0;
        field743 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field729[var14] = (byte) (field729[var14] >> 1);
            class3 var15 = client.field398[var14];
            if (var15 == null) {
                field737[++field743 - 1] = var14;
            } else {
                field731[++field734 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("h.f(Lde;B)I")
    public static int method116(class122 arg0) {
        int var1 = arg0.method2622(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2622(5);
        } else if (var1 == 2) {
            var2 = arg0.method2622(8);
        } else {
            var2 = arg0.method2622(11);
        }
        return var2;
    }

    @ObfuscatedName("ao.l(Lde;IB)V")
    public static void method677(class122 arg0, int arg1) {
        boolean var2 = arg0.method2622(1) == 1;
        if (var2) {
            field742[++field741 - 1] = arg1;
        }
        int var3 = arg0.method2622(2);
        class3 var4 = client.field398[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field55 = false;
            } else if (client.field524 == arg1) {
                throw new RuntimeException();
            } else {
                field738[arg1] = (Statics.field2630 + var4.field817[0] >> 6) + (Statics.field1054 + var4.field810[0] >> 6 << 14) + (var4.field57 << 28);
                if (var4.field826 == -1) {
                    field739[arg1] = var4.field849;
                } else {
                    field739[arg1] = var4.field826;
                }
                field736[arg1] = var4.field824;
                client.field398[arg1] = null;
                if (arg0.method2622(1) != 0) {
                    method177(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2622(3);
            int var6 = var4.field810[0];
            int var7 = var4.field817[0];
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
            if (client.field524 == arg1 && var4.field847 < 1536 || var4.field835 < 1536 || var4.field847 >= 11776 || var4.field835 >= 11776) {
                var4.method27(var6, var7);
                var4.field55 = false;
            } else if (var2) {
                var4.field55 = true;
                var4.field56 = var6;
                var4.field52 = var7;
            } else {
                var4.field55 = false;
                var4.method33(var6, var7, field732[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2622(4);
            int var9 = var4.field810[0];
            int var10 = var4.field817[0];
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
            if (client.field524 == arg1 && var4.field847 < 1536 || var4.field835 < 1536 || var4.field847 >= 11776 || var4.field835 >= 11776) {
                var4.method27(var9, var10);
                var4.field55 = false;
            } else if (var2) {
                var4.field55 = true;
                var4.field56 = var9;
                var4.field52 = var10;
            } else {
                var4.field55 = false;
                var4.method33(var9, var10, field732[arg1]);
            }
        } else {
            int var11 = arg0.method2622(1);
            if (var11 == 0) {
                int var12 = arg0.method2622(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field810[0] + var14;
                int var17 = var4.field817[0] + var15;
                if (client.field524 == arg1 && var4.field847 < 1536 || var4.field835 < 1536 || var4.field847 >= 11776 || var4.field835 >= 11776) {
                    var4.method27(var16, var17);
                    var4.field55 = false;
                } else if (var2) {
                    var4.field55 = true;
                    var4.field56 = var16;
                    var4.field52 = var17;
                } else {
                    var4.field55 = false;
                    var4.method33(var16, var17, field732[arg1]);
                }
                var4.field57 = (byte) (var4.field57 + var13 & 0x3);
                if (client.field524 == arg1) {
                    Statics.field135 = var4.field57;
                }
            } else {
                int var18 = arg0.method2622(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1054 + var4.field810[0] + var20 & 0x3FFF) - Statics.field1054;
                int var23 = (Statics.field2630 + var4.field817[0] + var21 & 0x3FFF) - Statics.field2630;
                if (client.field524 == arg1 && var4.field847 < 1536 || var4.field835 < 1536 || var4.field847 >= 11776 || var4.field835 >= 11776) {
                    var4.method27(var22, var23);
                    var4.field55 = false;
                } else if (var2) {
                    var4.field55 = true;
                    var4.field56 = var22;
                    var4.field52 = var23;
                } else {
                    var4.field55 = false;
                    var4.method33(var22, var23, field732[arg1]);
                }
                var4.field57 = (byte) (var4.field57 + var19 & 0x3);
                if (client.field524 == arg1) {
                    Statics.field135 = var4.field57;
                }
            }
        }
    }

    @ObfuscatedName("e.u(Lde;II)Z")
    public static boolean method177(class122 arg0, int arg1) {
        int var2 = arg0.method2622(2);
        if (var2 == 0) {
            if (arg0.method2622(1) != 0) {
                method177(arg0, arg1);
            }
            int var3 = arg0.method2622(6);
            int var4 = arg0.method2622(6);
            boolean var5 = arg0.method2622(1) == 1;
            if (var5) {
                field742[++field741 - 1] = arg1;
            }
            if (client.field398[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field398[arg1] = new class3();
            var6.field59 = arg1;
            if (field733[arg1] != null) {
                var6.method15(field733[arg1]);
            }
            var6.field849 = field739[arg1];
            var6.field824 = field736[arg1];
            int var7 = field738[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field856[0] = field732[arg1];
            var6.field57 = (byte) var8;
            var6.method27((var9 << 6) + var3 - Statics.field1054, (var10 << 6) + var4 - Statics.field2630);
            var6.field55 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2622(2);
            int var12 = field738[arg1];
            field738[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2622(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field738[arg1];
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
            field738[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2622(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field738[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field738[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("af.a(Lde;I)V")
    public static final void method1003(class122 arg0) {
        for (int var1 = 0; var1 < field741; var1++) {
            int var2 = field742[var1];
            class3 var3 = client.field398[var2];
            int var4 = arg0.method2372();
            if ((var4 & 0x20) != 0) {
                var4 += arg0.method2372() << 8;
            }
            method12(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("m.h(Lde;ILf;II)V")
    public static final void method12(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1) != 0) {
            int var5 = arg0.method2372();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2382(var6, 0, var5);
            field733[arg1] = var7;
            arg2.method15(var7);
        }
        if ((arg3 & 0x8) != 0) {
            int var8 = arg0.method2374();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2372();
            client.method3263(arg2, var8, var9);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field824 = arg0.method2374();
            if (arg2.field824 == 65535) {
                arg2.field824 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field853 = arg0.method2380();
            if (arg2.field853.charAt(0) == '~') {
                arg2.field853 = arg2.field853.substring(1);
                class12.method1029(2, arg2.field35, arg2.field853);
            } else if (Statics.field13 == arg2) {
                class12.method1029(2, arg2.field35, arg2.field853);
            }
            arg2.field813 = false;
            arg2.field816 = 0;
            arg2.field799 = 0;
            arg2.field815 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            int var10 = arg0.method2374();
            int var11 = arg0.method2372();
            arg2.method761(var10, var11, client.field287);
            arg2.field821 = client.field287 + 300;
            arg2.field834 = arg0.method2372();
            arg2.field854 = arg0.method2372();
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field826 = arg0.method2374();
            if (arg2.field852 == 0) {
                arg2.field849 = arg2.field826;
                arg2.field826 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var12 = arg0.method2374();
            class152[] var13 = new class152[] { class152.field2254, class152.field2250, class152.field2253, class152.field2251, class152.field2252 };
            class152 var14 = (class152) Statics.method625(var13, arg0.method2372());
            boolean var15 = arg0.method2372() == 1;
            int var16 = arg0.method2372();
            int var17 = arg0.field1982;
            if (arg2.field35 != null && arg2.field32 != null) {
                boolean var18 = false;
                if (var14.field2258 && client.method847(arg2.field35)) {
                    var18 = true;
                }
                if (!var18 && client.field397 == 0 && !arg2.field36) {
                    field740.field1982 = 0;
                    arg0.method2382(field740.field1981, 0, var16);
                    field740.field1982 = 0;
                    String var19 = class223.method3842(class163.method2686(class222.method2964(field740)));
                    arg2.field853 = var19.trim();
                    arg2.field816 = var12 >> 8;
                    arg2.field799 = var12 & 0xFF;
                    arg2.field815 = 150;
                    arg2.field813 = var15;
                    arg2.field814 = Statics.field13 != arg2 && var14.field2258 && client.field495 != "" && var19.toLowerCase().indexOf(client.field495) == -1;
                    int var20;
                    if (var14.field2257) {
                        var20 = var15 ? 91 : 1;
                    } else {
                        var20 = var15 ? 90 : 2;
                    }
                    if (var14.field2256 == -1) {
                        class12.method1029(var20, arg2.field35, var19);
                    } else {
                        class12.method1029(var20, class2.method256(var14.field2256) + arg2.field35, var19);
                    }
                }
            }
            arg0.field1982 = var16 + var17;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field806 = arg0.method2374();
            int var21 = arg0.method2377();
            arg2.field839 = var21 >> 16;
            arg2.field838 = (var21 & 0xFFFF) + client.field287;
            arg2.field836 = 0;
            arg2.field809 = 0;
            if (arg2.field838 > client.field287) {
                arg2.field836 = -1;
            }
            if (arg2.field806 == 65535) {
                arg2.field806 = -1;
            }
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field840 = arg0.method2373();
            arg2.field843 = arg0.method2373();
            arg2.field841 = arg0.method2373();
            arg2.field822 = arg0.method2373();
            arg2.field844 = arg0.method2374() + client.field287;
            arg2.field845 = arg0.method2374() + client.field287;
            arg2.field846 = arg0.method2374();
            if (arg2.field55) {
                arg2.field840 += arg2.field56;
                arg2.field843 += arg2.field52;
                arg2.field841 += arg2.field56;
                arg2.field822 += arg2.field52;
                arg2.field852 = 0;
            } else {
                arg2.field840 += arg2.field810[0];
                arg2.field843 += arg2.field817[0];
                arg2.field841 += arg2.field810[0];
                arg2.field822 += arg2.field817[0];
                arg2.field852 = 1;
            }
            arg2.field857 = 0;
        }
        if ((arg3 & 0x800) != 0) {
            int var22 = arg0.method2374();
            int var23 = arg0.method2372();
            arg2.method761(var22, var23, client.field287);
            arg2.field821 = client.field287 + 300;
            arg2.field834 = arg0.method2372();
            arg2.field854 = arg0.method2372();
        }
        if ((arg3 & 0x200) != 0) {
            field732[arg1] = arg0.method2373();
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method2373();
        }
        if ((arg3 & 0x100) != 0) {
            for (int var24 = 0; var24 < 3; var24++) {
                arg2.field33[var24] = arg0.method2380();
            }
        }
        if (!arg2.field55) {
            return;
        }
        if (var4 == 127) {
            arg2.method27(arg2.field56, arg2.field52);
            return;
        }
        byte var25;
        if (var4 == -1) {
            var25 = field732[arg1];
        } else {
            var25 = var4;
        }
        arg2.method33(arg2.field56, arg2.field52, var25);
    }
}
