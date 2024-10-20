package deob;

import java.awt.Graphics;

@ObfuscatedName("v")
public class class21 {

    @ObfuscatedName("v.j")
    public static boolean field302 = false;

    @ObfuscatedName("v.c")
    public static int[] field303 = new int[256];

    @ObfuscatedName("v.z")
    public static int field307 = 0;

    @ObfuscatedName("v.v")
    public static int field308 = 0;

    @ObfuscatedName("v.e")
    public static int field320 = 0;

    @ObfuscatedName("v.as")
    public static int field305 = 0;

    @ObfuscatedName("v.an")
    public static int field312 = 0;

    @ObfuscatedName("v.aj")
    public static int field313 = 0;

    @ObfuscatedName("v.ax")
    public static int field314 = 10;

    @ObfuscatedName("v.av")
    public static String field315 = "";

    @ObfuscatedName("v.ae")
    public static int field316 = 0;

    @ObfuscatedName("v.am")
    public static String field317 = "";

    @ObfuscatedName("v.aq")
    public static String field318 = "";

    @ObfuscatedName("v.at")
    public static String field319 = "";

    @ObfuscatedName("v.ac")
    public static String field326 = "";

    @ObfuscatedName("v.al")
    public static String field334 = "";

    @ObfuscatedName("v.ab")
    public static int field322 = 0;

    @ObfuscatedName("v.aa")
    public static String field323 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("v.ah")
    public static boolean field321 = false;

    @ObfuscatedName("v.ad")
    public static int field332 = 0;

    @ObfuscatedName("v.bd")
    public static int[] field327 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("v.be")
    public static int[] field329 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("v.bl")
    public static int field298 = -1;

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.y(I)I")
    public static int method706() {
        return 6;
    }

    @ObfuscatedName("m.m(Lbs;I)V")
    public static void method11(class73 arg0) {
        if (!field321) {
            if (class77.field1402 == 1 && class77.field1399 >= 715 && class77.field1400 >= 453) {
                field302 = !field302;
                if (field302) {
                    class138.method1681();
                } else {
                    class154 var6 = Statics.field205;
                    int var7 = var6.method3022("scape main");
                    int var8 = var6.method3007(var7, "");
                    class138.method213(var6, var7, var8, 255, false);
                }
            }
            if (client.field664 != 5) {
                field312++;
                if (client.field664 == 10) {
                    if (client.field464 == 0) {
                        if (class77.field1402 == 1) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class77.field1399 >= var9 && class77.field1399 <= var9 + var11 && class77.field1400 >= var10 && class77.field1400 <= var10 + var12) {
                                Statics.method3();
                                return;
                            }
                        }
                        if (Statics.field1173 != null) {
                            Statics.method3();
                        }
                    }
                    int var13 = class77.field1402;
                    int var14 = class77.field1399;
                    int var15 = class77.field1400;
                    if (field316 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field316 = 3;
                            field322 = 0;
                        }
                        short var18 = 462;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field317 = class134.field2282;
                            field318 = class134.field2283;
                            field319 = class134.field2284;
                            field316 = 2;
                            field322 = 0;
                        }
                    } else if (field316 == 2) {
                        short var19 = 231;
                        int var27 = var19 + 30;
                        if (var13 == 1 && var15 >= var27 - 15 && var15 < var27) {
                            field322 = 0;
                        }
                        var27 += 15;
                        if (var13 == 1 && var15 >= var27 - 15 && var15 < var27) {
                            field322 = 1;
                        }
                        var27 += 15;
                        short var20 = 302;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field326 = field326.trim();
                            if (field326.length() == 0) {
                                method908(class134.field2192, class134.field2170, class134.field2194);
                                return;
                            }
                            if (field334.length() == 0) {
                                method908(class134.field2195, class134.field2196, class134.field2197);
                                return;
                            }
                            method908(class134.field2226, class134.field2286, class134.field2287);
                            client.method125(20);
                            return;
                        }
                        short var22 = 462;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field316 = 0;
                            field326 = "";
                            field334 = "";
                        }
                        while (true) {
                            while (class75.method1365()) {
                                boolean var23 = false;
                                for (int var24 = 0; var24 < field323.length(); var24++) {
                                    if (Statics.field81 == field323.charAt(var24)) {
                                        var23 = true;
                                        break;
                                    }
                                }
                                if (field322 == 0) {
                                    if (Statics.field358 == 85 && field326.length() > 0) {
                                        field326 = field326.substring(0, field326.length() - 1);
                                    }
                                    if (Statics.field358 == 84 || Statics.field358 == 80) {
                                        field322 = 1;
                                    }
                                    if (var23 && field326.length() < 320) {
                                        field326 = field326 + Statics.field81;
                                    }
                                } else if (field322 == 1) {
                                    if (Statics.field358 == 85 && field334.length() > 0) {
                                        field334 = field334.substring(0, field334.length() - 1);
                                    }
                                    if (Statics.field358 == 84 || Statics.field358 == 80) {
                                        field322 = 0;
                                    }
                                    if (Statics.field358 == 84) {
                                        field326 = field326.trim();
                                        if (field326.length() == 0) {
                                            method908(class134.field2192, class134.field2170, class134.field2194);
                                            return;
                                        }
                                        if (field334.length() == 0) {
                                            method908(class134.field2195, class134.field2196, class134.field2197);
                                            return;
                                        }
                                        method908(class134.field2226, class134.field2286, class134.field2287);
                                        client.method125(20);
                                        return;
                                    }
                                    if (var23 && field334.length() < 20) {
                                        field334 = field334 + Statics.field81;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field316 == 3) {
                        short var25 = 382;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field316 = 0;
                        }
                    }
                }
            }
        } else if (class77.field1402 == 1) {
            short var1 = 280;
            if (class77.field1399 >= var1 && class77.field1399 <= var1 + 14 && class77.field1400 >= 4 && class77.field1400 <= 18) {
                method91(0, 0);
            } else if (class77.field1399 >= var1 + 15 && class77.field1399 <= var1 + 80 && class77.field1400 >= 4 && class77.field1400 <= 18) {
                method91(0, 1);
            } else {
                short var2 = 390;
                if (class77.field1399 >= var2 && class77.field1399 <= var2 + 14 && class77.field1400 >= 4 && class77.field1400 <= 18) {
                    method91(1, 0);
                } else if (class77.field1399 >= var2 + 15 && class77.field1399 <= var2 + 80 && class77.field1400 >= 4 && class77.field1400 <= 18) {
                    method91(1, 1);
                } else {
                    short var3 = 500;
                    if (class77.field1399 >= var3 && class77.field1399 <= var3 + 14 && class77.field1400 >= 4 && class77.field1400 <= 18) {
                        method91(2, 0);
                    } else if (class77.field1399 >= var3 + 15 && class77.field1399 <= var3 + 80 && class77.field1400 >= 4 && class77.field1400 <= 18) {
                        method91(2, 1);
                    } else {
                        short var4 = 610;
                        if (class77.field1399 >= var4 && class77.field1399 <= var4 + 14 && class77.field1400 >= 4 && class77.field1400 <= 18) {
                            method91(3, 0);
                        } else if (class77.field1399 >= var4 + 15 && class77.field1399 <= var4 + 80 && class77.field1400 >= 4 && class77.field1400 <= 18) {
                            method91(3, 1);
                        } else if (class77.field1399 >= 708 && class77.field1400 >= 4 && class77.field1399 <= 758 && class77.field1400 <= 20) {
                            field321 = false;
                            Statics.field328.method1693(0, 0);
                            Statics.field2834.method1693(382, 0);
                            Statics.field2005.method1783(382 - Statics.field2005.field1473 / 2, 18);
                        } else if (field298 != -1) {
                            class13 var5 = Statics.field1666[field298];
                            if (client.field564 != var5.field188) {
                                client.field564 = var5.field188;
                                class40.method2056(var5.field188);
                            }
                            Statics.field20 = var5.field195;
                            client.field665 = var5.field200;
                            Statics.field218 = client.field461 == 0 ? 43594 : var5.field200 + 40000;
                            Statics.field263 = client.field461 == 0 ? 443 : var5.field200 + 50000;
                            Statics.field2314 = Statics.field218;
                            field321 = false;
                            Statics.field328.method1693(0, 0);
                            Statics.field2834.method1693(382, 0);
                            Statics.field2005.method1783(382 - Statics.field2005.field1473 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.d(Lge;Lge;I)V")
    public static void method40(class183 arg0, class183 arg1) {
        if (field321) {
            if (Statics.field325 == null) {
                Statics.field325 = class84.method15(Statics.field297, "sl_back", "");
            }
            if (Statics.field1618 == null) {
                Statics.field1618 = Statics.method1516(Statics.field297, "sl_flags", "");
            }
            if (Statics.field59 == null) {
                Statics.field59 = Statics.method1516(Statics.field297, "sl_arrows", "");
            }
            if (Statics.field110 == null) {
                Statics.field110 = Statics.method1516(Statics.field297, "sl_stars", "");
            }
            class89.method1804(0, 23, 765, 480, 0);
            class89.method1802(0, 0, 125, 23, 12425273, 9135624);
            class89.method1802(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3437(class134.field2303, 62, 15, 0, -1);
            if (Statics.field110 != null) {
                Statics.field110[1].method1783(140, 1);
                arg1.method3484(class134.field2224, 152, 10, 16777215, -1);
                Statics.field110[0].method1783(140, 12);
                arg1.method3484(class134.field2085, 152, 21, 16777215, -1);
            }
            if (Statics.field59 != null) {
                short var2 = 280;
                if (field327[0] == 0 && field329[0] == 0) {
                    Statics.field59[2].method1783(var2, 4);
                } else {
                    Statics.field59[0].method1783(var2, 4);
                }
                if (field327[0] == 0 && field329[0] == 1) {
                    Statics.field59[3].method1783(var2 + 15, 4);
                } else {
                    Statics.field59[1].method1783(var2 + 15, 4);
                }
                arg0.method3484(class134.field2285, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field327[0] == 1 && field329[0] == 0) {
                    Statics.field59[2].method1783(var3, 4);
                } else {
                    Statics.field59[0].method1783(var3, 4);
                }
                if (field327[0] == 1 && field329[0] == 1) {
                    Statics.field59[3].method1783(var3 + 15, 4);
                } else {
                    Statics.field59[1].method1783(var3 + 15, 4);
                }
                arg0.method3484(class134.field2304, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field327[0] == 2 && field329[0] == 0) {
                    Statics.field59[2].method1783(var4, 4);
                } else {
                    Statics.field59[0].method1783(var4, 4);
                }
                if (field327[0] == 2 && field329[0] == 1) {
                    Statics.field59[3].method1783(var4 + 15, 4);
                } else {
                    Statics.field59[1].method1783(var4 + 15, 4);
                }
                arg0.method3484(class134.field2305, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field327[0] == 3 && field329[0] == 0) {
                    Statics.field59[2].method1783(var5, 4);
                } else {
                    Statics.field59[0].method1783(var5, 4);
                }
                if (field327[0] == 3 && field329[0] == 1) {
                    Statics.field59[3].method1783(var5 + 15, 4);
                } else {
                    Statics.field59[1].method1783(var5 + 15, 4);
                }
                arg0.method3484(class134.field2306, var5 + 32, 17, 16777215, -1);
            }
            class89.method1804(708, 4, 50, 16, 0);
            arg1.method3437(class134.field2294, 733, 16, 16777215, -1);
            field298 = -1;
            if (Statics.field325 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field332) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field332) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field332) {
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
                for (int var20 = 0; var20 < field332; var20++) {
                    class13 var21 = Statics.field1666[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field189);
                    if (var21.field189 == -1) {
                        var23 = class134.field2307;
                        var22 = false;
                    } else if (var21.field189 > 1980) {
                        var23 = class134.field2227;
                        var22 = false;
                    }
                    if (class77.field1401 >= var17 && class77.field1393 >= var16 && class77.field1401 < var6 + var17 && class77.field1393 < var7 + var16 && var22) {
                        field298 = var20;
                        Statics.field325[var21.field188 ? 1 : 0].method1687(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field325[var21.field188 ? 1 : 0].method1693(var17, var16);
                    }
                    if (Statics.field1618 != null) {
                        Statics.field1618[(var21.field188 ? 8 : 0) + var21.field192].method1783(var17 + 29, var16);
                    }
                    arg0.method3437(Integer.toString(var21.field200), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3437(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var24 = arg1.method3436(Statics.field1666[field298].field191) + 6;
                    int var25 = arg1.field2841 + 8;
                    class89.method1804(class77.field1401 - var24 / 2, class77.field1393 + 20 + 5, var24, var25, 16777120);
                    class89.method1826(class77.field1401 - var24 / 2, class77.field1393 + 20 + 5, var24, var25, 0);
                    arg1.method3437(Statics.field1666[field298].field191, class77.field1401, class77.field1393 + 20 + 5 + arg1.field2841 + 4, 0, -1);
                }
            }
            try {
                Graphics var26 = Statics.field850.getGraphics();
                Statics.field1301.method1601(var26, 0, 0);
            } catch (Exception var87) {
                Statics.field850.repaint();
            }
            return;
        }
        if (client.field664 == 0 || client.field664 == 5) {
            byte var28 = 20;
            arg0.method3437(class134.field2281, 382, 245 - var28, 16777215, -1);
            int var29 = 253 - var28;
            class89.method1826(230, var29, 304, 34, 9179409);
            class89.method1826(231, var29 + 1, 302, 32, 0);
            class89.method1804(232, var29 + 2, field314 * 3, 30, 9179409);
            class89.method1804(field314 * 3 + 232, var29 + 2, 300 - field314 * 3, 30, 0);
            arg0.method3437(field315, 382, 276 - var28, 16777215, -1);
        }
        if (client.field664 == 20) {
            Statics.field301.method1783(382 - Statics.field301.field1473 / 2, 271 - Statics.field301.field1471 / 2);
            short var30 = 211;
            arg0.method3437(field317, 382, var30, 16776960, 0);
            int var89 = var30 + 15;
            arg0.method3437(field318, 382, var89, 16776960, 0);
            int var90 = var89 + 15;
            arg0.method3437(field319, 382, var90, 16776960, 0);
            int var91 = var90 + 15;
            int var92 = var91 + 10;
            arg0.method3484(class134.field2288, 272, var92, 16777215, 0);
            short var31 = 200;
            String var32;
            for (var32 = field326; arg0.method3436(var32) > var31; var32 = var32.substring(0, var32.length() - 1)) {
            }
            arg0.method3484(class185.method3435(var32), 312, var92, 16777215, 0);
            var89 = var92 + 15;
            String var34 = class134.field2289;
            String var35 = field334;
            String var36 = class147.method2857('*', var35.length());
            arg0.method3484(var34 + var36, 274, var89, 16777215, 0);
            var89 += 15;
        }
        if (client.field664 == 10) {
            Statics.field301.method1783(202, 171);
            if (field316 == 0) {
                short var37 = 251;
                arg0.method3437(class134.field2295, 382, var37, 16776960, 0);
                int var93 = var37 + 30;
                short var38 = 302;
                short var39 = 291;
                Statics.field299.method1783(var38 - 73, var39 - 20);
                arg0.method3508(class134.field2291, var38 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var40 = 462;
                Statics.field299.method1783(var40 - 73, var39 - 20);
                arg0.method3508(class134.field2122, var40 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field316 == 2) {
                short var41 = 211;
                arg0.method3437(field317, 382, var41, 16776960, 0);
                int var94 = var41 + 15;
                arg0.method3437(field318, 382, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method3437(field319, 382, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 10;
                arg0.method3484(class134.field2288, 272, var97, 16777215, 0);
                short var42 = 200;
                String var43;
                for (var43 = field326; arg0.method3436(var43) > var42; var43 = var43.substring(1)) {
                }
                arg0.method3484(class185.method3435(var43) + (field322 == 0 & client.field691 % 40 < 20 ? class2.method177(16776960) + class2.field16 : ""), 312, var97, 16777215, 0);
                var94 = var97 + 15;
                String var45 = class134.field2289;
                String var46 = field334;
                String var47 = class147.method2857('*', var46.length());
                arg0.method3484(var45 + var47 + (field322 == 1 & client.field691 % 40 < 20 ? class2.method177(16776960) + class2.field16 : ""), 274, var94, 16777215, 0);
                var94 += 15;
                short var48 = 302;
                short var49 = 321;
                Statics.field299.method1783(var48 - 73, var49 - 20);
                arg0.method3437(class134.field2293, var48, var49 + 5, 16777215, 0);
                short var50 = 462;
                Statics.field299.method1783(var50 - 73, var49 - 20);
                arg0.method3437(class134.field2294, var50, var49 + 5, 16777215, 0);
            } else if (field316 == 3) {
                arg0.method3437(class134.field2248, 382, 211, 16776960, 0);
                short var51 = 236;
                arg0.method3437(class134.field2084, 382, var51, 16777215, 0);
                int var98 = var51 + 15;
                arg0.method3437(class134.field2270, 382, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method3437(class134.field2298, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method3437(class134.field2299, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                short var52 = 382;
                short var53 = 321;
                Statics.field299.method1783(var52 - 73, var53 - 20);
                arg0.method3437(class134.field2294, var52, var53 + 5, 16777215, 0);
            }
        }
        if (field312 > 0) {
            method748(field312);
            field312 = 0;
        }
        short var54 = 256;
        if (field307 > 0) {
            for (int var55 = 0; var55 < 256; var55++) {
                if (field307 > 768) {
                    Statics.field304[var55] = method139(Statics.field1417[var55], Statics.field333[var55], 1024 - field307);
                } else if (field307 > 256) {
                    Statics.field304[var55] = Statics.field333[var55];
                } else {
                    Statics.field304[var55] = method139(Statics.field333[var55], Statics.field1417[var55], 256 - field307);
                }
            }
        } else if (field308 > 0) {
            for (int var56 = 0; var56 < 256; var56++) {
                if (field308 > 768) {
                    Statics.field304[var56] = method139(Statics.field1417[var56], Statics.field306[var56], 1024 - field308);
                } else if (field308 > 256) {
                    Statics.field304[var56] = Statics.field306[var56];
                } else {
                    Statics.field304[var56] = method139(Statics.field306[var56], Statics.field1417[var56], 256 - field308);
                }
            }
        } else {
            for (int var57 = 0; var57 < 256; var57++) {
                Statics.field304[var57] = Statics.field1417[var57];
            }
        }
        class89.method1795(0, 9, 128, var54 + 7);
        Statics.field328.method1693(0, 0);
        class89.method1845();
        int var58 = 0;
        int var59 = 6885;
        for (int var60 = 1; var60 < var54 - 1; var60++) {
            int var61 = (var54 - var60) * field303[var60] / var54;
            int var62 = var61 + 22;
            if (var62 < 0) {
                var62 = 0;
            }
            var58 += var62;
            for (int var63 = var62; var63 < 128; var63++) {
                int var64 = Statics.field1509[var58++];
                if (var64 == 0) {
                    var59++;
                } else {
                    int var66 = 256 - var64;
                    int var67 = Statics.field304[var64];
                    int var68 = Statics.field1301.field1451[var59];
                    Statics.field1301.field1451[var59++] = ((var67 & 0xFF00FF) * var64 + (var68 & 0xFF00FF) * var66 & 0xFF00FF00) + ((var67 & 0xFF00) * var64 + (var68 & 0xFF00) * var66 & 0xFF0000) >> 8;
                }
            }
            var59 += var62 + 765 - 128;
        }
        class89.method1795(637, 9, 765, var54 + 7);
        Statics.field2834.method1693(382, 0);
        class89.method1845();
        int var69 = 0;
        int var70 = 7546;
        for (int var71 = 1; var71 < var54 - 1; var71++) {
            int var72 = (var54 - var71) * field303[var71] / var54;
            int var73 = 103 - var72;
            int var74 = var70 + var72;
            for (int var75 = 0; var75 < var73; var75++) {
                int var76 = Statics.field1509[var69++];
                if (var76 == 0) {
                    var74++;
                } else {
                    int var78 = 256 - var76;
                    int var79 = Statics.field304[var76];
                    int var80 = Statics.field1301.field1451[var74];
                    Statics.field1301.field1451[var74++] = ((var79 & 0xFF00FF) * var76 + (var80 & 0xFF00FF) * var78 & 0xFF00FF00) + ((var79 & 0xFF00) * var76 + (var80 & 0xFF00) * var78 & 0xFF0000) >> 8;
                }
            }
            var69 += 128 - var73;
            var70 = 765 - var73 - var72 + var74;
        }
        Statics.field86[field302 ? 1 : 0].method1783(725, 463);
        if (client.field664 > 5 && client.field464 == 0) {
            if (Statics.field2380 == null) {
                Statics.field2380 = class84.method194(Statics.field297, "sl_button", "");
            } else {
                byte var81 = 5;
                short var82 = 463;
                byte var83 = 100;
                byte var84 = 35;
                Statics.field2380.method1783(var81, var82);
                arg0.method3437(class134.field2164 + " " + client.field665, var83 / 2 + var81, var84 / 2 + var82 - 2, 16777215, 0);
                if (Statics.field1173 == null) {
                    arg1.method3437(class134.field2310, var83 / 2 + var81, var84 / 2 + var82 + 12, 16777215, 0);
                } else {
                    arg1.method3437(class134.field2209, var83 / 2 + var81, var84 / 2 + var82 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var85 = Statics.field850.getGraphics();
            Statics.field1301.method1601(var85, 0, 0);
        } catch (Exception var88) {
            Statics.field850.repaint();
        }
    }

    @ObfuscatedName("ah.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method908(String arg0, String arg1, String arg2) {
        field317 = arg0;
        field318 = arg1;
        field319 = arg2;
    }

    @ObfuscatedName("be.n(Lcj;I)V")
    public static final void method1246(class87 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2349.length; var2++) {
            Statics.field2349[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2349[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field309[var8] = (Statics.field2349[var8 - 1] + Statics.field2349[var8 + 1] + Statics.field2349[var8 - 128] + Statics.field2349[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2349;
            Statics.field2349 = Statics.field309;
            Statics.field309 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1471; var11++) {
            for (int var12 = 0; var12 < arg0.field1473; var12++) {
                if (arg0.field1477[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1475;
                    int var14 = var11 + 16 + arg0.field1476;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2349[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("at.s(II)V")
    public static final void method748(int arg0) {
        short var1 = 256;
        field320 += arg0 * 128;
        if (field320 > Statics.field2349.length) {
            field320 -= Statics.field2349.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1246(Statics.field300[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1509[var3 + var4] - Statics.field2349[field320 + var3 & Statics.field2349.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1509[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1509[var9 + var10] = 255;
                } else {
                    Statics.field1509[var9 + var10] = 0;
                }
            }
        }
        if (field307 > 0) {
            field307 -= arg0 * 4;
        }
        if (field308 > 0) {
            field308 -= arg0 * 4;
        }
        if (field307 == 0 && field308 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field307 = 1024;
            }
            if (var12 == 1) {
                field308 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field303[var13] = field303[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field303[var14] = (int) (Math.sin((double) field313 / 14.0D) * 16.0D + Math.sin((double) field313 / 15.0D) * 14.0D + Math.sin((double) field313 / 16.0D) * 12.0D);
            field313++;
        }
        field305 += arg0 * -1507291451;
        int var15 = ((client.field691 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field305 * 848233748; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1509[(var18 << 7) + var17] = 192;
        }
        field305 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1509[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1509[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1997[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1997[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1997[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1509[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("f.x(IIII)I")
    public static final int method139(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("p.j(III)V")
    public static void method91(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field327[var5] != arg0) {
                var2[var4] = field327[var5];
                var3[var4] = field329[var5];
                var4++;
            }
        }
        field327 = var2;
        field329 = var3;
        method824(Statics.field1666, 0, Statics.field1666.length - 1, field327, field329);
    }

    @ObfuscatedName("ab.p([Lr;II[I[II)V")
    public static void method824(class13[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field193;
                        var12 = var8.field193;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field189;
                        var12 = var8.field189;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field188 ? 1 : 0;
                        var12 = var8.field188 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field200;
                        var12 = var8.field200;
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
                        var15 = arg0[var5].field193;
                        var16 = var8.field193;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field189;
                        var16 = var8.field189;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field188 ? 1 : 0;
                        var16 = var8.field188 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field200;
                        var16 = var8.field200;
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
        method824(arg0, arg1, var6, arg3, arg4);
        method824(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
