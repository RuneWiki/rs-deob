package deob;

@ObfuscatedName("af")
public class class33 {

    @ObfuscatedName("af.u")
    public static byte[] field746 = new byte[2048];

    @ObfuscatedName("af.b")
    public static byte[] field749 = new byte[2048];

    @ObfuscatedName("af.p")
    public static class119[] field748 = new class119[2048];

    @ObfuscatedName("af.s")
    public static int field754 = 0;

    @ObfuscatedName("af.y")
    public static int[] field750 = new int[2048];

    @ObfuscatedName("af.t")
    public static int field751 = 0;

    @ObfuscatedName("af.w")
    public static int[] field752 = new int[2048];

    @ObfuscatedName("af.h")
    public static int[] field747 = new int[2048];

    @ObfuscatedName("af.d")
    public static int[] field753 = new int[2048];

    @ObfuscatedName("af.l")
    public static int[] field755 = new int[2048];

    @ObfuscatedName("af.n")
    public static int field756 = 0;

    @ObfuscatedName("af.q")
    public static int[] field757 = new int[2048];

    @ObfuscatedName("af.f")
    public static class119 field758 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.o(Ldm;I)V")
    public static final void method2020(class122 arg0) {
        arg0.method2596();
        int var1 = client.field398;
        class3 var2 = Statics.field159 = client.field337[var1] = new class3();
        var2.field35 = var1;
        int var3 = arg0.method2607(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field865[0] = var5 - Statics.field253;
        var2.field845 = (var2.field865[0] << 7) + (var2.method34() << 6);
        var2.field827[0] = var6 - Statics.field2902;
        var2.field812 = (var2.field827[0] << 7) + (var2.method34() << 6);
        Statics.field575 = var2.field54 = var4;
        if (field748[var1] != null) {
            var2.method12(field748[var1]);
        }
        field754 = 0;
        field750[++field754 - 1] = var1;
        field746[var1] = 0;
        field751 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2607(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field747[var7] = (var9 << 28) + (var10 << 14) + var11;
                field753[var7] = 0;
                field755[var7] = -1;
                field752[++field751 - 1] = var7;
                field746[var7] = 0;
            }
        }
        arg0.method2598();
    }

    @ObfuscatedName("l.e(Ldm;B)I")
    public static int method159(class122 arg0) {
        int var1 = arg0.method2607(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2607(5);
        } else if (var1 == 2) {
            var2 = arg0.method2607(8);
        } else {
            var2 = arg0.method2607(11);
        }
        return var2;
    }

    @ObfuscatedName("cq.u(Ldm;IB)V")
    public static void method1936(class122 arg0, int arg1) {
        boolean var2 = arg0.method2607(1) == 1;
        if (var2) {
            field757[++field756 - 1] = arg1;
        }
        int var3 = arg0.method2607(2);
        class3 var4 = client.field337[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field32 = false;
            } else if (client.field398 == arg1) {
                throw new RuntimeException();
            } else {
                field747[arg1] = (Statics.field2902 + var4.field827[0] >> 6) + (Statics.field253 + var4.field865[0] >> 6 << 14) + (var4.field54 << 28);
                if (var4.field838 == -1) {
                    field753[arg1] = var4.field849;
                } else {
                    field753[arg1] = var4.field838;
                }
                field755[arg1] = var4.field836;
                client.field337[arg1] = null;
                if (arg0.method2607(1) != 0) {
                    method2683(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2607(3);
            int var6 = var4.field865[0];
            int var7 = var4.field827[0];
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
            if (client.field398 == arg1 && var4.field845 < 1536 || var4.field812 < 1536 || var4.field845 >= 11776 || var4.field812 >= 11776) {
                var4.method27(var6, var7);
                var4.field32 = false;
            } else if (var2) {
                var4.field32 = true;
                var4.field49 = var6;
                var4.field34 = var7;
            } else {
                var4.field32 = false;
                var4.method15(var6, var7, field749[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2607(4);
            int var9 = var4.field865[0];
            int var10 = var4.field827[0];
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
            if (client.field398 == arg1 && var4.field845 < 1536 || var4.field812 < 1536 || var4.field845 >= 11776 || var4.field812 >= 11776) {
                var4.method27(var9, var10);
                var4.field32 = false;
            } else if (var2) {
                var4.field32 = true;
                var4.field49 = var9;
                var4.field34 = var10;
            } else {
                var4.field32 = false;
                var4.method15(var9, var10, field749[arg1]);
            }
        } else {
            int var11 = arg0.method2607(1);
            if (var11 == 0) {
                int var12 = arg0.method2607(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field865[0] + var14;
                int var17 = var4.field827[0] + var15;
                if (client.field398 == arg1 && var4.field845 < 1536 || var4.field812 < 1536 || var4.field845 >= 11776 || var4.field812 >= 11776) {
                    var4.method27(var16, var17);
                    var4.field32 = false;
                } else if (var2) {
                    var4.field32 = true;
                    var4.field49 = var16;
                    var4.field34 = var17;
                } else {
                    var4.field32 = false;
                    var4.method15(var16, var17, field749[arg1]);
                }
                var4.field54 = (byte) (var4.field54 + var13 & 0x3);
                if (client.field398 == arg1) {
                    Statics.field575 = var4.field54;
                }
            } else {
                int var18 = arg0.method2607(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field253 + var4.field865[0] + var20 & 0x3FFF) - Statics.field253;
                int var23 = (Statics.field2902 + var4.field827[0] + var21 & 0x3FFF) - Statics.field2902;
                if (client.field398 == arg1 && var4.field845 < 1536 || var4.field812 < 1536 || var4.field845 >= 11776 || var4.field812 >= 11776) {
                    var4.method27(var22, var23);
                    var4.field32 = false;
                } else if (var2) {
                    var4.field32 = true;
                    var4.field49 = var22;
                    var4.field34 = var23;
                } else {
                    var4.field32 = false;
                    var4.method15(var22, var23, field749[arg1]);
                }
                var4.field54 = (byte) (var4.field54 + var19 & 0x3);
                if (client.field398 == arg1) {
                    Statics.field575 = var4.field54;
                }
            }
        }
    }

    @ObfuscatedName("eu.b(Ldm;II)Z")
    public static boolean method2683(class122 arg0, int arg1) {
        int var2 = arg0.method2607(2);
        if (var2 == 0) {
            if (arg0.method2607(1) != 0) {
                method2683(arg0, arg1);
            }
            int var3 = arg0.method2607(6);
            int var4 = arg0.method2607(6);
            boolean var5 = arg0.method2607(1) == 1;
            if (var5) {
                field757[++field756 - 1] = arg1;
            }
            if (client.field337[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field337[arg1] = new class3();
            var6.field35 = arg1;
            if (field748[arg1] != null) {
                var6.method12(field748[arg1]);
            }
            var6.field849 = field753[arg1];
            var6.field836 = field755[arg1];
            int var7 = field747[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field848[0] = field749[arg1];
            var6.field54 = (byte) var8;
            var6.method27((var9 << 6) + var3 - Statics.field253, (var10 << 6) + var4 - Statics.field2902);
            var6.field32 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2607(2);
            int var12 = field747[arg1];
            field747[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2607(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field747[arg1];
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
            field747[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2607(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field747[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field747[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ee.p(Ldm;ILu;II)V")
    public static final void method2814(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x4) != 0) {
            int var5 = arg0.method2427();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2348(var6, 0, var5);
            field748[arg1] = var7;
            arg2.method12(var7);
        }
        if ((arg3 & 0x1) != 0) {
            int var8 = arg0.method2339();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2427();
            client.method40(arg2, var8, var9);
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field836 = arg0.method2339();
            if (arg2.field836 == 65535) {
                arg2.field836 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field829 = arg0.method2528();
            if (arg2.field829.charAt(0) == '~') {
                arg2.field829 = arg2.field829.substring(1);
                class12.method2960(2, arg2.field58, arg2.field829);
            } else if (Statics.field159 == arg2) {
                class12.method2960(2, arg2.field58, arg2.field829);
            }
            arg2.field866 = false;
            arg2.field828 = 0;
            arg2.field819 = 0;
            arg2.field824 = 150;
        }
        if ((arg3 & 0x8) != 0) {
            int var10 = arg0.method2339();
            int var11 = arg0.method2427();
            arg2.method739(var10, var11, client.field288);
            arg2.field833 = client.field288 + 300;
            arg2.field834 = arg0.method2427();
            arg2.field835 = arg0.method2427();
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field838 = arg0.method2339();
            if (arg2.field864 == 0) {
                arg2.field849 = arg2.field838;
                arg2.field838 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var12 = arg0.method2339();
            class152[] var13 = new class152[] { class152.field2261, class152.field2268, class152.field2260, class152.field2263, class152.field2262 };
            class152 var14 = (class152) class109.method1468(var13, arg0.method2427());
            boolean var15 = arg0.method2427() == 1;
            int var16 = arg0.method2427();
            int var17 = arg0.field1974;
            if (arg2.field58 != null && arg2.field33 != null) {
                boolean var18 = false;
                if (var14.field2264 && client.method83(arg2.field58)) {
                    var18 = true;
                }
                if (!var18 && client.field396 == 0 && !arg2.field53) {
                    field758.field1974 = 0;
                    arg0.method2348(field758.field1977, 0, var16);
                    field758.field1974 = 0;
                    String var19 = class223.method3770(class163.method646(Statics.method648(field758)));
                    arg2.field829 = var19.trim();
                    arg2.field828 = var12 >> 8;
                    arg2.field819 = var12 & 0xFF;
                    arg2.field824 = 150;
                    arg2.field866 = var15;
                    arg2.field856 = Statics.field159 != arg2 && var14.field2264 && client.field495 != "" && var19.toLowerCase().indexOf(client.field495) == -1;
                    int var20;
                    if (var14.field2267) {
                        var20 = var15 ? 91 : 1;
                    } else {
                        var20 = var15 ? 90 : 2;
                    }
                    if (var14.field2266 == -1) {
                        class12.method2960(var20, arg2.field58, var19);
                    } else {
                        int var22 = var14.field2266;
                        String var23 = "<img=" + var22 + ">";
                        class12.method2960(var20, var23 + arg2.field58, var19);
                    }
                }
            }
            arg0.field1974 = var16 + var17;
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field847 = arg0.method2339();
            int var24 = arg0.method2342();
            arg2.field851 = var24 >> 16;
            arg2.field855 = (var24 & 0xFFFF) + client.field288;
            arg2.field867 = 0;
            arg2.field860 = 0;
            if (arg2.field855 > client.field288) {
                arg2.field867 = -1;
            }
            if (arg2.field847 == 65535) {
                arg2.field847 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field861 = arg0.method2338();
            arg2.field854 = arg0.method2338();
            arg2.field817 = arg0.method2338();
            arg2.field831 = arg0.method2338();
            arg2.field815 = arg0.method2339() + client.field288;
            arg2.field857 = arg0.method2339() + client.field288;
            arg2.field858 = arg0.method2339();
            if (arg2.field32) {
                arg2.field861 += arg2.field49;
                arg2.field854 += arg2.field34;
                arg2.field817 += arg2.field49;
                arg2.field831 += arg2.field34;
                arg2.field864 = 0;
            } else {
                arg2.field861 += arg2.field865[0];
                arg2.field854 += arg2.field827[0];
                arg2.field817 += arg2.field865[0];
                arg2.field831 += arg2.field827[0];
                arg2.field864 = 1;
            }
            arg2.field869 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            int var25 = arg0.method2339();
            int var26 = arg0.method2427();
            arg2.method739(var25, var26, client.field288);
            arg2.field833 = client.field288 + 300;
            arg2.field834 = arg0.method2427();
            arg2.field835 = arg0.method2427();
        }
        if ((arg3 & 0x800) != 0) {
            field749[arg1] = arg0.method2338();
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method2338();
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var27 = 0; var27 < 3; var27++) {
                arg2.field37[var27] = arg0.method2528();
            }
        }
        if (!arg2.field32) {
            return;
        }
        if (var4 == 127) {
            arg2.method27(arg2.field49, arg2.field34);
            return;
        }
        byte var28;
        if (var4 == -1) {
            var28 = field749[arg1];
        } else {
            var28 = var4;
        }
        arg2.method15(arg2.field49, arg2.field34, var28);
    }
}
