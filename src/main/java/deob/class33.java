package deob;

@ObfuscatedName("ax")
public class class33 {

    @ObfuscatedName("ax.a")
    public static byte[] field747 = new byte[2048];

    @ObfuscatedName("ax.i")
    public static byte[] field748 = new byte[2048];

    @ObfuscatedName("ax.f")
    public static class119[] field746 = new class119[2048];

    @ObfuscatedName("ax.m")
    public static int field750 = 0;

    @ObfuscatedName("ax.o")
    public static int[] field756 = new int[2048];

    @ObfuscatedName("ax.h")
    public static int field751 = 0;

    @ObfuscatedName("ax.n")
    public static int[] field752 = new int[2048];

    @ObfuscatedName("ax.k")
    public static int[] field753 = new int[2048];

    @ObfuscatedName("ax.r")
    public static int[] field755 = new int[2048];

    @ObfuscatedName("ax.b")
    public static int[] field754 = new int[2048];

    @ObfuscatedName("ax.q")
    public static int field757 = 0;

    @ObfuscatedName("ax.u")
    public static int[] field749 = new int[2048];

    @ObfuscatedName("ax.g")
    public static class119 field759 = new class119(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.j(Ldb;I)V")
    public static final void method144(class122 arg0) {
        arg0.method2551();
        int var1 = client.field478;
        class3 var2 = Statics.field2250 = client.field411[var1] = new class3();
        var2.field57 = var1;
        int var3 = arg0.method2552(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field865[0] = var5 - Statics.field1684;
        var2.field840 = (var2.field865[0] << 7) + (var2.method32() << 6);
        var2.field818[0] = var6 - Statics.field1599;
        var2.field849 = (var2.field818[0] << 7) + (var2.method32() << 6);
        Statics.field1387 = var2.field56 = var4;
        if (field746[var1] != null) {
            var2.method12(field746[var1]);
        }
        field750 = 0;
        field756[++field750 - 1] = var1;
        field747[var1] = 0;
        field751 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2552(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field753[var7] = (var9 << 28) + (var10 << 14) + var11;
                field755[var7] = 0;
                field754[var7] = -1;
                field752[++field751 - 1] = var7;
                field747[var7] = 0;
            }
        }
        arg0.method2553();
    }

    @ObfuscatedName("e.l(Ldb;II)V")
    public static final void method590(class122 arg0, int arg1) {
        int var2 = arg0.field1999;
        field757 = 0;
        method99(arg0);
        method726(arg0);
        if (arg0.field1999 - var2 != arg1) {
            throw new RuntimeException(arg0.field1999 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("n.a(Ldb;B)V")
    public static final void method99(class122 arg0) {
        int var1 = 0;
        arg0.method2551();
        for (int var2 = 0; var2 < field750; var2++) {
            int var3 = field756[var2];
            if ((field747[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field747[var3] = (byte) (field747[var3] | 0x2);
                } else {
                    int var4 = arg0.method2552(1);
                    if (var4 == 0) {
                        var1 = method2712(arg0);
                        field747[var3] = (byte) (field747[var3] | 0x2);
                    } else {
                        method5(arg0, var3);
                    }
                }
            }
        }
        arg0.method2553();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2551();
        for (int var5 = 0; var5 < field750; var5++) {
            int var6 = field756[var5];
            if ((field747[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field747[var6] = (byte) (field747[var6] | 0x2);
                } else {
                    int var7 = arg0.method2552(1);
                    if (var7 == 0) {
                        var1 = method2712(arg0);
                        field747[var6] = (byte) (field747[var6] | 0x2);
                    } else {
                        method5(arg0, var6);
                    }
                }
            }
        }
        arg0.method2553();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2551();
        for (int var8 = 0; var8 < field751; var8++) {
            int var9 = field752[var8];
            if ((field747[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field747[var9] = (byte) (field747[var9] | 0x2);
                } else {
                    int var10 = arg0.method2552(1);
                    if (var10 == 0) {
                        var1 = method2712(arg0);
                        field747[var9] = (byte) (field747[var9] | 0x2);
                    } else if (method715(arg0, var9)) {
                        field747[var9] = (byte) (field747[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2553();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2551();
        for (int var11 = 0; var11 < field751; var11++) {
            int var12 = field752[var11];
            if ((field747[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field747[var12] = (byte) (field747[var12] | 0x2);
                } else {
                    int var13 = arg0.method2552(1);
                    if (var13 == 0) {
                        var1 = method2712(arg0);
                        field747[var12] = (byte) (field747[var12] | 0x2);
                    } else if (method715(arg0, var12)) {
                        field747[var12] = (byte) (field747[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2553();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field750 = 0;
        field751 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field747[var14] = (byte) (field747[var14] >> 1);
            class3 var15 = client.field411[var14];
            if (var15 == null) {
                field752[++field751 - 1] = var14;
            } else {
                field756[++field750 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("eu.i(Ldb;B)I")
    public static int method2712(class122 arg0) {
        int var1 = arg0.method2552(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2552(5);
        } else if (var1 == 2) {
            var2 = arg0.method2552(8);
        } else {
            var2 = arg0.method2552(11);
        }
        return var2;
    }

    @ObfuscatedName("j.f(Ldb;II)V")
    public static void method5(class122 arg0, int arg1) {
        boolean var2 = arg0.method2552(1) == 1;
        if (var2) {
            field749[++field757 - 1] = arg1;
        }
        int var3 = arg0.method2552(2);
        class3 var4 = client.field411[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field50 = false;
            } else if (client.field478 == arg1) {
                throw new RuntimeException();
            } else {
                field753[arg1] = (Statics.field1599 + var4.field818[0] >> 6) + (Statics.field1684 + var4.field865[0] >> 6 << 14) + (var4.field56 << 28);
                if (var4.field854 == -1) {
                    field755[arg1] = var4.field861;
                } else {
                    field755[arg1] = var4.field854;
                }
                field754[arg1] = var4.field836;
                client.field411[arg1] = null;
                if (arg0.method2552(1) != 0) {
                    method715(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2552(3);
            int var6 = var4.field865[0];
            int var7 = var4.field818[0];
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
            if (client.field478 == arg1 && var4.field840 < 1536 || var4.field849 < 1536 || var4.field840 >= 11776 || var4.field849 >= 11776) {
                var4.method13(var6, var7);
                var4.field50 = false;
            } else if (var2) {
                var4.field50 = true;
                var4.field58 = var6;
                var4.field36 = var7;
            } else {
                var4.field50 = false;
                var4.method27(var6, var7, field748[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2552(4);
            int var9 = var4.field865[0];
            int var10 = var4.field818[0];
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
            if (client.field478 == arg1 && var4.field840 < 1536 || var4.field849 < 1536 || var4.field840 >= 11776 || var4.field849 >= 11776) {
                var4.method13(var9, var10);
                var4.field50 = false;
            } else if (var2) {
                var4.field50 = true;
                var4.field58 = var9;
                var4.field36 = var10;
            } else {
                var4.field50 = false;
                var4.method27(var9, var10, field748[arg1]);
            }
        } else {
            int var11 = arg0.method2552(1);
            if (var11 == 0) {
                int var12 = arg0.method2552(12);
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
                int var17 = var4.field818[0] + var15;
                if (client.field478 == arg1 && var4.field840 < 1536 || var4.field849 < 1536 || var4.field840 >= 11776 || var4.field849 >= 11776) {
                    var4.method13(var16, var17);
                    var4.field50 = false;
                } else if (var2) {
                    var4.field50 = true;
                    var4.field58 = var16;
                    var4.field36 = var17;
                } else {
                    var4.field50 = false;
                    var4.method27(var16, var17, field748[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var13 & 0x3);
                if (client.field478 == arg1) {
                    Statics.field1387 = var4.field56;
                }
            } else {
                int var18 = arg0.method2552(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1684 + var4.field865[0] + var20 & 0x3FFF) - Statics.field1684;
                int var23 = (Statics.field1599 + var4.field818[0] + var21 & 0x3FFF) - Statics.field1599;
                if (client.field478 == arg1 && var4.field840 < 1536 || var4.field849 < 1536 || var4.field840 >= 11776 || var4.field849 >= 11776) {
                    var4.method13(var22, var23);
                    var4.field50 = false;
                } else if (var2) {
                    var4.field50 = true;
                    var4.field58 = var22;
                    var4.field36 = var23;
                } else {
                    var4.field50 = false;
                    var4.method27(var22, var23, field748[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var19 & 0x3);
                if (client.field478 == arg1) {
                    Statics.field1387 = var4.field56;
                }
            }
        }
    }

    @ObfuscatedName("ai.m(Ldb;II)Z")
    public static boolean method715(class122 arg0, int arg1) {
        int var2 = arg0.method2552(2);
        if (var2 == 0) {
            if (arg0.method2552(1) != 0) {
                method715(arg0, arg1);
            }
            int var3 = arg0.method2552(6);
            int var4 = arg0.method2552(6);
            boolean var5 = arg0.method2552(1) == 1;
            if (var5) {
                field749[++field757 - 1] = arg1;
            }
            if (client.field411[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field411[arg1] = new class3();
            var6.field57 = arg1;
            if (field746[arg1] != null) {
                var6.method12(field746[arg1]);
            }
            var6.field861 = field755[arg1];
            var6.field836 = field754[arg1];
            int var7 = field753[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field867[0] = field748[arg1];
            var6.field56 = (byte) var8;
            var6.method13((var9 << 6) + var3 - Statics.field1684, (var10 << 6) + var4 - Statics.field1599);
            var6.field50 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2552(2);
            int var12 = field753[arg1];
            field753[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2552(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field753[arg1];
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
            field753[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2552(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field753[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field753[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("aa.o(Ldb;I)V")
    public static final void method726(class122 arg0) {
        for (int var1 = 0; var1 < field757; var1++) {
            int var2 = field749[var1];
            class3 var3 = client.field411[var2];
            int var4 = arg0.method2316();
            if ((var4 & 0x1) != 0) {
                var4 += arg0.method2316() << 8;
            }
            method2888(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ew.h(Ldb;ILa;IB)V")
    public static final void method2888(class122 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x80) != 0) {
            int var5 = arg0.method2316();
            byte[] var6 = new byte[var5];
            class119 var7 = new class119(var6);
            arg0.method2397(var6, 0, var5);
            field746[arg1] = var7;
            arg2.method12(var7);
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = arg0.method2318();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2316();
            client.method161(arg2, var8, var9);
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field836 = arg0.method2318();
            if (arg2.field836 == 65535) {
                arg2.field836 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field824 = arg0.method2324();
            if (arg2.field824.charAt(0) == '~') {
                arg2.field824 = arg2.field824.substring(1);
                class12.method183(2, arg2.field49, arg2.field824);
            } else if (Statics.field2250 == arg2) {
                class12.method183(2, arg2.field49, arg2.field824);
            }
            arg2.field843 = false;
            arg2.field860 = 0;
            arg2.field829 = 0;
            arg2.field827 = 150;
        }
        if ((arg3 & 0x20) != 0) {
            int var10 = arg0.method2318();
            int var11 = arg0.method2316();
            arg2.method740(var10, var11, client.field395);
            arg2.field850 = client.field395 + 300;
            arg2.field813 = arg0.method2316();
            arg2.field835 = arg0.method2316();
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field854 = arg0.method2318();
            if (arg2.field825 == 0) {
                arg2.field861 = arg2.field854;
                arg2.field854 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var12 = arg0.method2318();
            class152 var13 = (class152) class109.method2910(class152.method3197(), arg0.method2316());
            boolean var14 = arg0.method2316() == 1;
            int var15 = arg0.method2316();
            int var16 = arg0.field1999;
            if (arg2.field49 != null && arg2.field35 != null) {
                boolean var17 = false;
                if (var13.field2279 && client.method191(arg2.field49)) {
                    var17 = true;
                }
                if (!var17 && client.field472 == 0 && !arg2.field55) {
                    field759.field1999 = 0;
                    arg0.method2397(field759.field1996, 0, var15);
                    field759.field1999 = 0;
                    String var18 = class223.method3721(class163.method3460(class222.method3644(field759)));
                    arg2.field824 = var18.trim();
                    arg2.field860 = var12 >> 8;
                    arg2.field829 = var12 & 0xFF;
                    arg2.field827 = 150;
                    arg2.field843 = var14;
                    arg2.field826 = Statics.field2250 != arg2 && var13.field2279 && client.field509 != "" && var18.toLowerCase().indexOf(client.field509) == -1;
                    int var19;
                    if (var13.field2278) {
                        var19 = var14 ? 91 : 1;
                    } else {
                        var19 = var14 ? 90 : 2;
                    }
                    if (var13.field2277 == -1) {
                        class12.method183(var19, arg2.field49, var18);
                    } else {
                        int var21 = var13.field2277;
                        String var22 = "<img=" + var21 + ">";
                        class12.method183(var19, var22 + arg2.field49, var18);
                    }
                }
            }
            arg0.field1999 = var15 + var16;
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field847 = arg0.method2318();
            int var23 = arg0.method2321();
            arg2.field851 = var23 >> 16;
            arg2.field834 = (var23 & 0xFFFF) + client.field395;
            arg2.field848 = 0;
            arg2.field842 = 0;
            if (arg2.field834 > client.field395) {
                arg2.field848 = -1;
            }
            if (arg2.field847 == 65535) {
                arg2.field847 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field852 = arg0.method2317();
            arg2.field833 = arg0.method2317();
            arg2.field811 = arg0.method2317();
            arg2.field855 = arg0.method2317();
            arg2.field856 = arg0.method2318() + client.field395;
            arg2.field857 = arg0.method2318() + client.field395;
            arg2.field866 = arg0.method2318();
            if (arg2.field50) {
                arg2.field852 += arg2.field58;
                arg2.field833 += arg2.field36;
                arg2.field811 += arg2.field58;
                arg2.field855 += arg2.field36;
                arg2.field825 = 0;
            } else {
                arg2.field852 += arg2.field865[0];
                arg2.field833 += arg2.field818[0];
                arg2.field811 += arg2.field865[0];
                arg2.field855 += arg2.field818[0];
                arg2.field825 = 1;
            }
            arg2.field869 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            int var24 = arg0.method2318();
            int var25 = arg0.method2316();
            arg2.method740(var24, var25, client.field395);
            arg2.field850 = client.field395 + 300;
            arg2.field813 = arg0.method2316();
            arg2.field835 = arg0.method2316();
        }
        if ((arg3 & 0x400) != 0) {
            field748[arg1] = arg0.method2317();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2317();
        }
        if ((arg3 & 0x800) != 0) {
            for (int var26 = 0; var26 < 3; var26++) {
                arg2.field39[var26] = arg0.method2324();
            }
        }
        if (!arg2.field50) {
            return;
        }
        if (var4 == 127) {
            arg2.method13(arg2.field58, arg2.field36);
            return;
        }
        byte var27;
        if (var4 == -1) {
            var27 = field748[arg1];
        } else {
            var27 = var4;
        }
        arg2.method27(arg2.field58, arg2.field36, var27);
    }

    @ObfuscatedName("ci.n(B)V")
    public static void method2036() {
        field750 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field746[var0] = null;
            field748[var0] = 1;
        }
    }
}
