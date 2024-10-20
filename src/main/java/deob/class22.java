package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("r")
public class class22 {

    @ObfuscatedName("r.g")
    public static int[] field350 = new int[256];

    @ObfuscatedName("r.f")
    public static int field342 = 0;

    @ObfuscatedName("r.s")
    public static int field352 = 0;

    @ObfuscatedName("r.h")
    public static int field340 = 0;

    @ObfuscatedName("r.v")
    public static int field346 = 0;

    @ObfuscatedName("r.ax")
    public static int field347 = 0;

    @ObfuscatedName("r.ao")
    public static int field348 = 0;

    @ObfuscatedName("r.al")
    public static int field349 = 10;

    @ObfuscatedName("r.ap")
    public static String field332 = "";

    @ObfuscatedName("r.ak")
    public static int field351 = 0;

    @ObfuscatedName("r.aw")
    public static String field339 = "";

    @ObfuscatedName("r.av")
    public static String field353 = "";

    @ObfuscatedName("r.ah")
    public static String field354 = "";

    @ObfuscatedName("r.ae")
    public static String field355 = "";

    @ObfuscatedName("r.am")
    public static String field357 = "";

    @ObfuscatedName("r.aq")
    public static int field336 = 0;

    @ObfuscatedName("r.ai")
    public static String field331 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("r.aa")
    public static boolean field359 = false;

    @ObfuscatedName("r.as")
    public static int field361 = 0;

    @ObfuscatedName("r.bg")
    public static int[] field363 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("r.bw")
    public static int[] field364 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("r.bm")
    public static int field356 = -1;

    public class22() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.e(Lbc;B)V")
    public static void method155(class74 arg0) {
        if (field359) {
            method1364(arg0);
            return;
        }
        if ((class78.field1393 == 1 || !Statics.field2078 && class78.field1393 == 4) && class78.field1404 >= 715 && class78.field1405 >= 453) {
            Statics.field197.field196 = !Statics.field197.field196;
            class12.method1540();
            if (Statics.field197.field196) {
                Statics.field2373.method2797();
                class141.field2377 = 1;
                Statics.field2378 = null;
            } else {
                class157 var1 = Statics.field97;
                int var2 = var1.method3035("scape main");
                int var3 = var1.method3036(var2, "");
                class141.method267(var1, var2, var3, 255, false);
            }
        }
        if (client.field507 == 5) {
            return;
        }
        field347++;
        if (client.field507 != 10) {
            return;
        }
        if (client.field506 == 0) {
            if (class78.field1393 == 1 || !Statics.field2078 && class78.field1393 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class78.field1404 >= var4 && class78.field1404 <= var4 + var6 && class78.field1405 >= var5 && class78.field1405 <= var5 + var7) {
                    method1467();
                    return;
                }
            }
            if (Statics.field109 != null) {
                method1467();
            }
        }
        int var8 = class78.field1393;
        int var9 = class78.field1404;
        int var10 = class78.field1405;
        if (!Statics.field2078 && var8 == 4) {
            var8 = 1;
        }
        if (field351 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field351 = 3;
                field336 = 0;
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field501 & 0x4) != 0) {
                    if ((client.field501 & 0x400) == 0) {
                        field339 = class137.field2343;
                        field353 = class137.field2231;
                        field354 = class137.field2313;
                    } else {
                        field339 = class137.field2222;
                        field353 = class137.field2311;
                        field354 = class137.field2319;
                    }
                    field351 = 1;
                    field336 = 0;
                } else if ((client.field501 & 0x400) == 0) {
                    field339 = class137.field2332;
                    field353 = class137.field2308;
                    field354 = class137.field2113;
                    field351 = 2;
                    field336 = 0;
                } else {
                    field339 = class137.field2238;
                    field353 = class137.field2272;
                    field354 = class137.field2316;
                    field351 = 1;
                    field336 = 0;
                }
            }
        } else if (field351 == 1) {
            while (class76.method1483()) {
                if (Statics.field91 == 84) {
                    field339 = class137.field2332;
                    field353 = class137.field2308;
                    field354 = class137.field2113;
                    field351 = 2;
                    field336 = 0;
                } else if (Statics.field91 == 13) {
                    field351 = 0;
                }
            }
            short var14 = 302;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field339 = class137.field2332;
                field353 = class137.field2308;
                field354 = class137.field2113;
                field351 = 2;
                field336 = 0;
            }
            short var16 = 462;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field351 = 0;
            }
        } else if (field351 == 2) {
            short var17 = 231;
            int var25 = var17 + 30;
            if (var8 == 1 && var10 >= var25 - 15 && var10 < var25) {
                field336 = 0;
            }
            var25 += 15;
            if (var8 == 1 && var10 >= var25 - 15 && var10 < var25) {
                field336 = 1;
            }
            var25 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field355 = field355.trim();
                if (field355.length() == 0) {
                    method730(class137.field2219, class137.field2220, class137.field2221);
                    return;
                }
                if (field357.length() == 0) {
                    method730(class137.field2301, class137.field2307, class137.field2241);
                    return;
                }
                method730(class137.field2320, class137.field2110, class137.field2322);
                client.method2989(20);
                return;
            }
            short var20 = 462;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field351 = 0;
                field355 = "";
                field357 = "";
            }
            while (true) {
                while (class76.method1483()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field331.length(); var22++) {
                        if (Statics.field1050 == field331.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field91 == 13) {
                        field351 = 0;
                        field355 = "";
                        field357 = "";
                    } else if (field336 == 0) {
                        if (Statics.field91 == 85 && field355.length() > 0) {
                            field355 = field355.substring(0, field355.length() - 1);
                        }
                        if (Statics.field91 == 84 || Statics.field91 == 80) {
                            field336 = 1;
                        }
                        if (var21 && field355.length() < 320) {
                            field355 = field355 + Statics.field1050;
                        }
                    } else if (field336 == 1) {
                        if (Statics.field91 == 85 && field357.length() > 0) {
                            field357 = field357.substring(0, field357.length() - 1);
                        }
                        if (Statics.field91 == 84 || Statics.field91 == 80) {
                            field336 = 0;
                        }
                        if (Statics.field91 == 84) {
                            field355 = field355.trim();
                            if (field355.length() == 0) {
                                method730(class137.field2219, class137.field2220, class137.field2221);
                                return;
                            }
                            if (field357.length() == 0) {
                                method730(class137.field2301, class137.field2307, class137.field2241);
                                return;
                            }
                            method730(class137.field2320, class137.field2110, class137.field2322);
                            client.method2989(20);
                            return;
                        }
                        if (var21 && field357.length() < 20) {
                            field357 = field357 + Statics.field1050;
                        }
                    }
                }
                return;
            }
        } else if (field351 == 3) {
            short var23 = 382;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field351 = 0;
            }
        }
    }

    @ObfuscatedName("bz.i(Lgs;Lgs;B)V")
    public static void method1446(class185 arg0, class185 arg1) {
        if (field359) {
            if (Statics.field334 == null) {
                Statics.field334 = class85.method1422(Statics.field395, "sl_back", "");
            }
            if (Statics.field2857 == null) {
                Statics.field2857 = class85.method253(Statics.field395, "sl_flags", "");
            }
            if (Statics.field2379 == null) {
                Statics.field2379 = class85.method253(Statics.field395, "sl_arrows", "");
            }
            if (Statics.field123 == null) {
                Statics.field123 = class85.method253(Statics.field395, "sl_stars", "");
            }
            class90.method1828(0, 23, 765, 480, 0);
            class90.method1829(0, 0, 125, 23, 12425273, 9135624);
            class90.method1829(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3405(class137.field2335, 62, 15, 0, -1);
            if (Statics.field123 != null) {
                Statics.field123[1].method1811(140, 1);
                arg1.method3429(class137.field2336, 152, 10, 16777215, -1);
                Statics.field123[0].method1811(140, 12);
                arg1.method3429(class137.field2337, 152, 21, 16777215, -1);
            }
            if (Statics.field2379 != null) {
                short var2 = 280;
                if (field363[0] == 0 && field364[0] == 0) {
                    Statics.field2379[2].method1811(var2, 4);
                } else {
                    Statics.field2379[0].method1811(var2, 4);
                }
                if (field363[0] == 0 && field364[0] == 1) {
                    Statics.field2379[3].method1811(var2 + 15, 4);
                } else {
                    Statics.field2379[1].method1811(var2 + 15, 4);
                }
                arg0.method3429(class137.field2338, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field363[0] == 1 && field364[0] == 0) {
                    Statics.field2379[2].method1811(var3, 4);
                } else {
                    Statics.field2379[0].method1811(var3, 4);
                }
                if (field363[0] == 1 && field364[0] == 1) {
                    Statics.field2379[3].method1811(var3 + 15, 4);
                } else {
                    Statics.field2379[1].method1811(var3 + 15, 4);
                }
                arg0.method3429(class137.field2135, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field363[0] == 2 && field364[0] == 0) {
                    Statics.field2379[2].method1811(var4, 4);
                } else {
                    Statics.field2379[0].method1811(var4, 4);
                }
                if (field363[0] == 2 && field364[0] == 1) {
                    Statics.field2379[3].method1811(var4 + 15, 4);
                } else {
                    Statics.field2379[1].method1811(var4 + 15, 4);
                }
                arg0.method3429(class137.field2340, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field363[0] == 3 && field364[0] == 0) {
                    Statics.field2379[2].method1811(var5, 4);
                } else {
                    Statics.field2379[0].method1811(var5, 4);
                }
                if (field363[0] == 3 && field364[0] == 1) {
                    Statics.field2379[3].method1811(var5 + 15, 4);
                } else {
                    Statics.field2379[1].method1811(var5 + 15, 4);
                }
                arg0.method3429(class137.field2341, var5 + 32, 17, 16777215, -1);
            }
            class90.method1828(708, 4, 50, 16, 0);
            arg1.method3405(class137.field2329, 733, 16, 16777215, -1);
            field356 = -1;
            if (Statics.field334 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field361) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field361) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field361) {
                        var9--;
                    }
                } while (var9 != var10 || var8 != var11);
                int var12 = (765 - var6 * var8) / (var8 + 1);
                if (var12 > 5) {
                    var12 = 5;
                }
                int var13 = (480 - var7 * var9) / (var9 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
                int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
                int var16 = var15 + 23;
                int var17 = var14;
                int var18 = 0;
                boolean var19 = false;
                for (int var20 = 0; var20 < field361; var20++) {
                    class13 var21 = Statics.field362[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field204);
                    if (var21.field204 == -1) {
                        var23 = class137.field2342;
                        var22 = false;
                    } else if (var21.field204 > 1980) {
                        var23 = class137.field2214;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method149()) {
                        if (var21.method148()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method148()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class78.field1397 >= var17 && class78.field1398 * -58530351 >= var16 && class78.field1397 < var6 + var17 && class78.field1398 * -58530351 < var7 + var16 && var22) {
                        field356 = var20;
                        Statics.field334[var24].method1742(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field334[var24].method1736(var17, var16);
                    }
                    if (Statics.field2857 != null) {
                        Statics.field2857[(var21.method148() ? 8 : 0) + var21.field209].method1811(var17 + 29, var16);
                    }
                    arg0.method3405(Integer.toString(var21.field206), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3405(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3398(Statics.field362[field356].field216) + 6;
                    int var26 = arg1.field2876 + 8;
                    class90.method1828(class78.field1397 - var25 / 2, class78.field1398 * -58530351 + 20 + 5, var25, var26, 16777120);
                    class90.method1830(class78.field1397 - var25 / 2, class78.field1398 * -58530351 + 20 + 5, var25, var26, 0);
                    arg1.method3405(Statics.field362[field356].field216, class78.field1397, class78.field1398 * -58530351 + 20 + 5 + arg1.field2876 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1817.getGraphics();
                Statics.field313.method1648(var27, 0, 0);
            } catch (Exception var84) {
                Statics.field1817.repaint();
            }
            return;
        }
        if (client.field507 == 0 || client.field507 == 5) {
            byte var29 = 20;
            arg0.method3405(class137.field2306, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class90.method1830(230, var30, 304, 34, 9179409);
            class90.method1830(231, var30 + 1, 302, 32, 0);
            class90.method1828(232, var30 + 2, field349 * 3, 30, 9179409);
            class90.method1828(field349 * 3 + 232, var30 + 2, 300 - field349 * 3, 30, 0);
            arg0.method3405(field332, 382, 276 - var29, 16777215, -1);
        }
        if (client.field507 == 20) {
            Statics.field330.method1811(382 - Statics.field330.field1473 / 2, 271 - Statics.field330.field1471 / 2);
            short var31 = 211;
            arg0.method3405(field339, 382, var31, 16776960, 0);
            int var86 = var31 + 15;
            arg0.method3405(field353, 382, var86, 16776960, 0);
            int var87 = var86 + 15;
            arg0.method3405(field354, 382, var87, 16776960, 0);
            int var88 = var87 + 15;
            int var89 = var88 + 10;
            arg0.method3429(class137.field2250, 272, var89, 16777215, 0);
            short var32 = 200;
            String var33;
            for (var33 = field355; arg0.method3398(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
            }
            arg0.method3429(class187.method3402(var33), 312, var89, 16777215, 0);
            var86 = var89 + 15;
            arg0.method3429(class137.field2309 + class150.method2049(field357), 274, var86, 16777215, 0);
            var86 += 15;
        }
        if (client.field507 == 10) {
            Statics.field330.method1811(202, 171);
            if (field351 == 0) {
                short var34 = 251;
                arg0.method3405(class137.field2325, 382, var34, 16776960, 0);
                int var90 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                Statics.field367.method1811(var35 - 73, var36 - 20);
                arg0.method3463(class137.field2243, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                Statics.field367.method1811(var37 - 73, var36 - 20);
                arg0.method3463(class137.field2192, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field351 == 1) {
                arg0.method3405(class137.field2212, 382, 211, 16776960, 0);
                short var38 = 236;
                arg0.method3405(field339, 382, var38, 16777215, 0);
                int var91 = var38 + 15;
                arg0.method3405(field353, 382, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method3405(field354, 382, var92, 16777215, 0);
                int var93 = var92 + 15;
                short var39 = 302;
                short var40 = 321;
                Statics.field367.method1811(var39 - 73, var40 - 20);
                arg0.method3405(class137.field2318, var39, var40 + 5, 16777215, 0);
                short var41 = 462;
                Statics.field367.method1811(var41 - 73, var40 - 20);
                arg0.method3405(class137.field2329, var41, var40 + 5, 16777215, 0);
            } else if (field351 == 2) {
                short var42 = 211;
                arg0.method3405(field339, 382, var42, 16776960, 0);
                int var94 = var42 + 15;
                arg0.method3405(field353, 382, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method3405(field354, 382, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 10;
                arg0.method3429(class137.field2250, 272, var97, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field355; arg0.method3398(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3429(class187.method3402(var44) + (field336 == 0 & client.field569 % 40 < 20 ? class2.method13(16776960) + class2.field23 : ""), 312, var97, 16777215, 0);
                var94 = var97 + 15;
                arg0.method3429(class137.field2309 + class150.method2049(field357) + (field336 == 1 & client.field569 % 40 < 20 ? class2.method13(16776960) + class2.field23 : ""), 274, var94, 16777215, 0);
                var94 += 15;
                short var45 = 302;
                short var46 = 321;
                Statics.field367.method1811(var45 - 73, var46 - 20);
                arg0.method3405(class137.field2328, var45, var46 + 5, 16777215, 0);
                short var47 = 462;
                Statics.field367.method1811(var47 - 73, var46 - 20);
                arg0.method3405(class137.field2329, var47, var46 + 5, 16777215, 0);
            } else if (field351 == 3) {
                arg0.method3405(class137.field2330, 382, 211, 16776960, 0);
                short var48 = 236;
                arg0.method3405(class137.field2254, 382, var48, 16777215, 0);
                int var98 = var48 + 15;
                arg0.method3405(class137.field2276, 382, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method3405(class137.field2333, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method3405(class137.field2334, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                short var49 = 382;
                short var50 = 321;
                Statics.field367.method1811(var49 - 73, var50 - 20);
                arg0.method3405(class137.field2329, var49, var50 + 5, 16777215, 0);
            }
        }
        if (field347 > 0) {
            method6(field347);
            field347 = 0;
        }
        short var51 = 256;
        if (field342 > 0) {
            for (int var52 = 0; var52 < 256; var52++) {
                if (field342 > 768) {
                    Statics.field1674[var52] = method239(Statics.field358[var52], Statics.field341[var52], 1024 - field342);
                } else if (field342 > 256) {
                    Statics.field1674[var52] = Statics.field341[var52];
                } else {
                    Statics.field1674[var52] = method239(Statics.field341[var52], Statics.field358[var52], 256 - field342);
                }
            }
        } else if (field352 > 0) {
            for (int var53 = 0; var53 < 256; var53++) {
                if (field352 > 768) {
                    Statics.field1674[var53] = method239(Statics.field358[var53], Statics.field370[var53], 1024 - field352);
                } else if (field352 > 256) {
                    Statics.field1674[var53] = Statics.field370[var53];
                } else {
                    Statics.field1674[var53] = method239(Statics.field370[var53], Statics.field358[var53], 256 - field352);
                }
            }
        } else {
            for (int var54 = 0; var54 < 256; var54++) {
                Statics.field1674[var54] = Statics.field358[var54];
            }
        }
        class90.method1822(0, 9, 128, var51 + 7);
        Statics.field65.method1736(0, 0);
        class90.method1835();
        int var55 = 0;
        int var56 = 6885;
        for (int var57 = 1; var57 < var51 - 1; var57++) {
            int var58 = (var51 - var57) * field350[var57] / var51;
            int var59 = var58 + 22;
            if (var59 < 0) {
                var59 = 0;
            }
            var55 += var59;
            for (int var60 = var59; var60 < 128; var60++) {
                int var61 = Statics.field976[var55++];
                if (var61 == 0) {
                    var56++;
                } else {
                    int var63 = 256 - var61;
                    int var64 = Statics.field1674[var61];
                    int var65 = Statics.field313.field1451[var56];
                    Statics.field313.field1451[var56++] = ((var64 & 0xFF00FF) * var61 + (var65 & 0xFF00FF) * var63 & 0xFF00FF00) + ((var64 & 0xFF00) * var61 + (var65 & 0xFF00) * var63 & 0xFF0000) >> 8;
                }
            }
            var56 += var59 + 765 - 128;
        }
        class90.method1822(637, 9, 765, var51 + 7);
        Statics.field333.method1736(382, 0);
        class90.method1835();
        int var66 = 0;
        int var67 = 7546;
        for (int var68 = 1; var68 < var51 - 1; var68++) {
            int var69 = (var51 - var68) * field350[var68] / var51;
            int var70 = 103 - var69;
            int var71 = var67 + var69;
            for (int var72 = 0; var72 < var70; var72++) {
                int var73 = Statics.field976[var66++];
                if (var73 == 0) {
                    var71++;
                } else {
                    int var75 = 256 - var73;
                    int var76 = Statics.field1674[var73];
                    int var77 = Statics.field313.field1451[var71];
                    Statics.field313.field1451[var71++] = ((var76 & 0xFF00FF) * var73 + (var77 & 0xFF00FF) * var75 & 0xFF00FF00) + ((var76 & 0xFF00) * var73 + (var77 & 0xFF00) * var75 & 0xFF0000) >> 8;
                }
            }
            var66 += 128 - var70;
            var67 = 765 - var70 - var69 + var71;
        }
        Statics.field335[Statics.field197.field196 ? 1 : 0].method1811(725, 463);
        if (client.field507 > 5 && client.field506 == 0) {
            if (Statics.field992 == null) {
                Statics.field992 = class85.method52(Statics.field395, "sl_button", "");
            } else {
                byte var78 = 5;
                short var79 = 463;
                byte var80 = 100;
                byte var81 = 35;
                Statics.field992.method1811(var78, var79);
                arg0.method3405(class137.field2296 + " " + client.field603, var80 / 2 + var78, var81 / 2 + var79 - 2, 16777215, 0);
                if (Statics.field109 == null) {
                    arg1.method3405(class137.field2345, var80 / 2 + var78, var81 / 2 + var79 + 12, 16777215, 0);
                } else {
                    arg1.method3405(class137.field2247, var80 / 2 + var78, var81 / 2 + var79 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var82 = Statics.field1817.getGraphics();
            Statics.field313.method1648(var82, 0, 0);
        } catch (Exception var85) {
            Statics.field1817.repaint();
        }
    }

    @ObfuscatedName("av.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method730(String arg0, String arg1, String arg2) {
        field339 = arg0;
        field353 = arg1;
        field354 = arg2;
    }

    @ObfuscatedName("z.q(Lcr;I)V")
    public static final void method36(class88 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field253.length; var2++) {
            Statics.field253[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field253[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field193[var8] = (Statics.field253[var8 - 1] + Statics.field253[var8 + 1] + Statics.field253[var8 - 128] + Statics.field253[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field253;
            Statics.field253 = Statics.field193;
            Statics.field193 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1471; var11++) {
            for (int var12 = 0; var12 < arg0.field1473; var12++) {
                if (arg0.field1474[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1477;
                    int var14 = var11 + 16 + arg0.field1475;
                    int var15 = (var14 << 7) + var13;
                    Statics.field253[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("i.j(IB)V")
    public static final void method6(int arg0) {
        short var1 = 256;
        field340 += arg0 * 128;
        if (field340 > Statics.field253.length) {
            field340 -= Statics.field253.length;
            int var2 = (int) (Math.random() * 12.0D);
            method36(Statics.field343[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field976[var3 + var4] - Statics.field253[field340 + var3 & Statics.field253.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field976[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field976[var9 + var10] = 255;
                } else {
                    Statics.field976[var9 + var10] = 0;
                }
            }
        }
        if (field342 > 0) {
            field342 -= arg0 * 4;
        }
        if (field352 > 0) {
            field352 -= arg0 * 4;
        }
        if (field342 == 0 && field352 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field342 = 1024;
            }
            if (var12 == 1) {
                field352 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field350[var13] = field350[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field350[var14] = (int) (Math.sin((double) field348 / 14.0D) * 16.0D + Math.sin((double) field348 / 15.0D) * 14.0D + Math.sin((double) field348 / 16.0D) * 12.0D);
            field348++;
        }
        field346 += arg0 * 2106121657;
        int var15 = ((client.field569 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field346 * -940993148; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field976[(var18 << 7) + var17] = 192;
        }
        field346 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field976[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field976[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field344[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field344[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field344[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field976[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("l.z(IIII)I")
    public static final int method239(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("by.m(Lbc;I)V")
    public static void method1364(class74 arg0) {
        if (class78.field1393 != 1 && Statics.field2078 || class78.field1393 != 4) {
            return;
        }
        short var1 = 280;
        if (class78.field1404 >= var1 && class78.field1404 <= var1 + 14 && class78.field1405 >= 4 && class78.field1405 <= 18) {
            method283(0, 0);
            return;
        }
        if (class78.field1404 >= var1 + 15 && class78.field1404 <= var1 + 80 && class78.field1405 >= 4 && class78.field1405 <= 18) {
            method283(0, 1);
            return;
        }
        short var2 = 390;
        if (class78.field1404 >= var2 && class78.field1404 <= var2 + 14 && class78.field1405 >= 4 && class78.field1405 <= 18) {
            method283(1, 0);
            return;
        }
        if (class78.field1404 >= var2 + 15 && class78.field1404 <= var2 + 80 && class78.field1405 >= 4 && class78.field1405 <= 18) {
            method283(1, 1);
            return;
        }
        short var3 = 500;
        if (class78.field1404 >= var3 && class78.field1404 <= var3 + 14 && class78.field1405 >= 4 && class78.field1405 <= 18) {
            method283(2, 0);
            return;
        }
        if (class78.field1404 >= var3 + 15 && class78.field1404 <= var3 + 80 && class78.field1405 >= 4 && class78.field1405 <= 18) {
            method283(2, 1);
            return;
        }
        short var4 = 610;
        if (class78.field1404 >= var4 && class78.field1404 <= var4 + 14 && class78.field1405 >= 4 && class78.field1405 <= 18) {
            method283(3, 0);
            return;
        }
        if (class78.field1404 >= var4 + 15 && class78.field1404 <= var4 + 80 && class78.field1405 >= 4 && class78.field1405 <= 18) {
            method283(3, 1);
            return;
        }
        if (class78.field1404 >= 708 && class78.field1405 >= 4 && class78.field1404 <= 758 && class78.field1405 <= 20) {
            field359 = false;
            Statics.field65.method1736(0, 0);
            Statics.field333.method1736(382, 0);
            Statics.field360.method1811(382 - Statics.field360.field1473 / 2, 18);
            return;
        }
        if (field356 == -1) {
            return;
        }
        class13 var5 = Statics.field362[field356];
        method179(var5);
        field359 = false;
        Statics.field65.method1736(0, 0);
        Statics.field333.method1736(382, 0);
        Statics.field360.method1811(382 - Statics.field360.field1473 / 2, 18);
        return;
    }

    @ObfuscatedName("f.w(Lt;I)V")
    public static void method179(class13 arg0) {
        if (arg0.method148() != client.field504) {
            client.field504 = arg0.method148();
            boolean var1 = arg0.method148();
            if (Statics.field1017 != var1) {
                class41.method130();
                Statics.field1017 = var1;
            }
        }
        Statics.field1658 = arg0.field207;
        client.field603 = arg0.field206;
        client.field501 = arg0.field205;
        Statics.field2445 = client.field503 == 0 ? 43594 : arg0.field206 + 40000;
        Statics.field2792 = client.field503 == 0 ? 443 : arg0.field206 + 50000;
        Statics.field513 = Statics.field2445;
    }

    @ObfuscatedName("bu.a(I)V")
    public static void method1467() {
        try {
            if (Statics.field109 == null) {
                Statics.field109 = new class25(Statics.field200, new URL(Statics.field762));
            } else {
                byte[] var0 = Statics.field109.method248();
                if (var0 != null) {
                    class128 var1 = new class128(var0);
                    field361 = var1.method2456();
                    Statics.field362 = new class13[field361];
                    int var2 = 0;
                    while (var2 < field361) {
                        class13 var3 = Statics.field362[var2] = new class13();
                        var3.field206 = var1.method2456();
                        var3.field205 = var1.method2592();
                        var3.field207 = var1.method2559();
                        var3.field216 = var1.method2559();
                        var3.field209 = var1.method2548();
                        var3.field204 = var1.method2457();
                        var3.field210 = var2++;
                    }
                    method1571(Statics.field362, 0, Statics.field362.length - 1, field363, field364);
                    field359 = true;
                    Statics.field109 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field109 = null;
        }
    }

    @ObfuscatedName("ao.d(IIB)V")
    public static void method283(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field363[var5] != arg0) {
                var2[var4] = field363[var5];
                var3[var4] = field364[var5];
                var4++;
            }
        }
        field363 = var2;
        field364 = var3;
        method1571(Statics.field362, 0, Statics.field362.length - 1, field363, field364);
    }

    @ObfuscatedName("bf.u([Lt;II[I[II)V")
    public static void method1571(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class13 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field210;
                        var12 = var8.field210;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field204;
                        var12 = var8.field204;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method148() ? 1 : 0;
                        var12 = var8.method148() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field206;
                        var12 = var8.field206;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field210;
                        var16 = var8.field210;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field204;
                        var16 = var8.field204;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method148() ? 1 : 0;
                        var16 = var8.method148() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field206;
                        var16 = var8.field206;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class13 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1571(arg0, arg1, var6, arg3, arg4);
        method1571(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
