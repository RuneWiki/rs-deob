package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("b")
public class class20 {

    @ObfuscatedName("b.t")
    public static boolean field313 = false;

    @ObfuscatedName("b.d")
    public static int[] field304 = new int[256];

    @ObfuscatedName("b.b")
    public static int field303 = 0;

    @ObfuscatedName("b.h")
    public static int field301 = 0;

    @ObfuscatedName("b.c")
    public static int field306 = 0;

    @ObfuscatedName("b.al")
    public static int field307 = 0;

    @ObfuscatedName("b.ai")
    public static int field308 = 0;

    @ObfuscatedName("b.ad")
    public static int field309 = 0;

    @ObfuscatedName("b.aw")
    public static int field310 = 10;

    @ObfuscatedName("b.af")
    public static String field311 = "";

    @ObfuscatedName("b.an")
    public static int field312 = 0;

    @ObfuscatedName("b.ao")
    public static String field329 = "";

    @ObfuscatedName("b.ak")
    public static String field314 = "";

    @ObfuscatedName("b.ah")
    public static String field315 = "";

    @ObfuscatedName("b.aq")
    public static String field316 = "";

    @ObfuscatedName("b.ax")
    public static String field317 = "";

    @ObfuscatedName("b.ag")
    public static int field318 = 0;

    @ObfuscatedName("b.am")
    public static String field319 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("b.ae")
    public static boolean field322 = false;

    @ObfuscatedName("b.aa")
    public static int field298 = 0;

    @ObfuscatedName("b.bc")
    public static int[] field323 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("b.br")
    public static int[] field297 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("b.bo")
    public static int field302 = -1;

    public class20() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.g(Lez;Lez;I)I")
    public static int method28(class150 arg0, class150 arg1) {
        int var2 = 0;
        if (arg0.method3040("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3040("logo", "")) {
            var2++;
        }
        if (arg1.method3040("titlebox", "")) {
            var2++;
        }
        if (arg1.method3040("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3040("runes", "")) {
            var2++;
        }
        if (arg1.method3040("title_mute", "")) {
            var2++;
        }
        arg1.method3040("sl_back", "");
        arg1.method3040("sl_flags", "");
        arg1.method3040("sl_arrows", "");
        arg1.method3040("sl_stars", "");
        arg1.method3040("sl_button", "");
        return var2;
    }

    @ObfuscatedName("w.e(Lbj;I)V")
    public static void method106(class72 arg0) {
        if (!field322) {
            if (class76.field1387 == 1 && class76.field1378 >= 715 && class76.field1381 >= 453) {
                field313 = !field313;
                if (field313) {
                    class137.method12();
                } else {
                    class152 var9 = Statics.field2455;
                    int var10 = var9.method3021("scape main");
                    int var11 = var9.method3038(var10, "");
                    class137.method2466(var9, var10, var11, 255, false);
                }
            }
            if (client.field474 != 5) {
                field308++;
                if (client.field474 == 10) {
                    if (client.field499 == 0) {
                        if (class76.field1387 == 1) {
                            byte var12 = 5;
                            short var13 = 463;
                            byte var14 = 100;
                            byte var15 = 35;
                            if (class76.field1378 >= var12 && class76.field1378 <= var12 + var14 && class76.field1381 >= var13 && class76.field1381 <= var13 + var15) {
                                method125();
                                return;
                            }
                        }
                        if (Statics.field321 != null) {
                            method125();
                        }
                    }
                    int var16 = class76.field1387;
                    int var17 = class76.field1378;
                    int var18 = class76.field1381;
                    if (field312 == 0) {
                        short var19 = 302;
                        short var20 = 291;
                        if (var16 == 1 && var17 >= var19 - 75 && var17 <= var19 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field312 = 3;
                            field318 = 0;
                        }
                        short var21 = 462;
                        if (var16 == 1 && var17 >= var21 - 75 && var17 <= var21 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field329 = class133.field2166;
                            field314 = class133.field2261;
                            field315 = class133.field2262;
                            field312 = 2;
                            field318 = 0;
                        }
                    } else if (field312 == 2) {
                        short var22 = 231;
                        int var31 = var22 + 30;
                        if (var16 == 1 && var18 >= var31 - 15 && var18 < var31) {
                            field318 = 0;
                        }
                        var31 += 15;
                        if (var16 == 1 && var18 >= var31 - 15 && var18 < var31) {
                            field318 = 1;
                        }
                        var31 += 15;
                        short var23 = 302;
                        short var24 = 321;
                        if (var16 == 1 && var17 >= var23 - 75 && var17 <= var23 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field316 = field316.trim();
                            if (field316.length() == 0) {
                                method811(class133.field2210, class133.field2098, class133.field2172);
                                return;
                            }
                            if (field317.length() == 0) {
                                method811(class133.field2173, class133.field2286, class133.field2214);
                                return;
                            }
                            method811(class133.field2197, class133.field2245, class133.field2265);
                            client.method3044(20);
                            return;
                        }
                        short var25 = 462;
                        if (var16 == 1 && var17 >= var25 - 75 && var17 <= var25 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field312 = 0;
                            field316 = "";
                            field317 = "";
                        }
                        while (true) {
                            while (class74.method114()) {
                                boolean var26 = false;
                                for (int var27 = 0; var27 < field319.length(); var27++) {
                                    if (Statics.field201 == field319.charAt(var27)) {
                                        var26 = true;
                                        break;
                                    }
                                }
                                if (field318 == 0) {
                                    if (Statics.field1798 == 85 && field316.length() > 0) {
                                        field316 = field316.substring(0, field316.length() - 1);
                                    }
                                    if (Statics.field1798 == 84 || Statics.field1798 == 80) {
                                        field318 = 1;
                                    }
                                    if (var26 && field316.length() < 320) {
                                        field316 = field316 + Statics.field201;
                                    }
                                } else if (field318 == 1) {
                                    if (Statics.field1798 == 85 && field317.length() > 0) {
                                        field317 = field317.substring(0, field317.length() - 1);
                                    }
                                    if (Statics.field1798 == 84 || Statics.field1798 == 80) {
                                        field318 = 0;
                                    }
                                    if (client.field467 == 2 && Statics.field1798 == 84) {
                                        field316 = field316.trim();
                                        if (field316.length() == 0) {
                                            method811(class133.field2210, class133.field2098, class133.field2172);
                                            return;
                                        }
                                        if (field317.length() == 0) {
                                            method811(class133.field2173, class133.field2286, class133.field2214);
                                            return;
                                        }
                                        method811(class133.field2197, class133.field2245, class133.field2265);
                                        client.method3044(20);
                                        return;
                                    }
                                    if (var26 && field317.length() < 20) {
                                        field317 = field317 + Statics.field201;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field312 == 3) {
                        short var28 = 382;
                        short var29 = 321;
                        if (var16 == 1 && var17 >= var28 - 75 && var17 <= var28 + 75 && var18 >= var29 - 20 && var18 <= var29 + 20) {
                            field312 = 0;
                        }
                    }
                }
            }
        } else if (class76.field1387 == 1) {
            short var1 = 280;
            if (class76.field1378 >= var1 && class76.field1378 <= var1 + 14 && class76.field1381 >= 4 && class76.field1381 <= 18) {
                Statics.method1364(0, 0);
            } else if (class76.field1378 >= var1 + 15 && class76.field1378 <= var1 + 80 && class76.field1381 >= 4 && class76.field1381 <= 18) {
                Statics.method1364(0, 1);
            } else {
                short var2 = 390;
                if (class76.field1378 >= var2 && class76.field1378 <= var2 + 14 && class76.field1381 >= 4 && class76.field1381 <= 18) {
                    Statics.method1364(1, 0);
                } else if (class76.field1378 >= var2 + 15 && class76.field1378 <= var2 + 80 && class76.field1381 >= 4 && class76.field1381 <= 18) {
                    Statics.method1364(1, 1);
                } else {
                    short var3 = 500;
                    if (class76.field1378 >= var3 && class76.field1378 <= var3 + 14 && class76.field1381 >= 4 && class76.field1381 <= 18) {
                        Statics.method1364(2, 0);
                    } else if (class76.field1378 >= var3 + 15 && class76.field1378 <= var3 + 80 && class76.field1381 >= 4 && class76.field1381 <= 18) {
                        Statics.method1364(2, 1);
                    } else {
                        short var4 = 610;
                        if (class76.field1378 >= var4 && class76.field1378 <= var4 + 14 && class76.field1381 >= 4 && class76.field1381 <= 18) {
                            Statics.method1364(3, 0);
                        } else if (class76.field1378 >= var4 + 15 && class76.field1378 <= var4 + 80 && class76.field1381 >= 4 && class76.field1381 <= 18) {
                            Statics.method1364(3, 1);
                        } else if (class76.field1378 >= 708 && class76.field1381 >= 4 && class76.field1378 <= 758 && class76.field1381 <= 20) {
                            field322 = false;
                            Statics.field320.method1700(0, 0);
                            Statics.field325.method1700(382, 0);
                            Statics.field299.method1782(382 - Statics.field299.field1468 / 2, 18);
                        } else if (field302 != -1) {
                            class12 var5 = Statics.field1786[field302];
                            if (client.field470 == var5.field195) {
                                Statics.field2665 = var5.field191;
                                client.field466 = var5.field194;
                                Statics.field503 = client.field467 == 0 ? 43594 : var5.field194 + 40000;
                                Statics.field178 = client.field467 == 0 ? 443 : var5.field194 + 50000;
                                Statics.field1032 = Statics.field503;
                                field322 = false;
                                Statics.field320.method1700(0, 0);
                                Statics.field325.method1700(382, 0);
                                Statics.field299.method1782(382 - Statics.field299.field1468 / 2, 18);
                            } else {
                                String var6 = "";
                                if (client.field467 != 0) {
                                    var6 = ":" + (var5.field194 + 7000);
                                }
                                String var7 = "http://" + var5.field191 + var6 + "/j" + client.field473;
                                try {
                                    arg0.getAppletContext().showDocument(new URL(var7), "_self");
                                } catch (Exception var30) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cd.n(Lfe;Lfe;B)V")
    public static void method2157(class181 arg0, class181 arg1) {
        if (!field322) {
            if (client.field474 == 0 || client.field474 == 5) {
                byte var25 = 20;
                arg0.method3445(class133.field2199, 382, 245 - var25, 16777215, -1);
                int var26 = 253 - var25;
                class88.method1800(230, var26, 304, 34, 9179409);
                class88.method1800(231, var26 + 1, 302, 32, 0);
                class88.method1842(232, var26 + 2, field310 * 3, 30, 9179409);
                class88.method1842(field310 * 3 + 232, var26 + 2, 300 - field310 * 3, 30, 0);
                arg0.method3445(field311, 382, 276 - var25, 16777215, -1);
            }
            if (client.field474 == 20) {
                Statics.field1792.method1782(382 - Statics.field1792.field1468 / 2, 271 - Statics.field1792.field1469 / 2);
                short var27 = 211;
                arg0.method3445(field329, 382, var27, 16776960, 0);
                int var67 = var27 + 15;
                arg0.method3445(field314, 382, var67, 16776960, 0);
                int var68 = var67 + 15;
                arg0.method3445(field315, 382, var68, 16776960, 0);
                int var69 = var68 + 15;
                int var70 = var69 + 10;
                arg0.method3510(class133.field2102, 272, var70, 16777215, 0);
                short var28 = 200;
                String var29;
                for (var29 = field316; arg0.method3497(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
                }
                arg0.method3510(class183.method3453(var29), 312, var70, 16777215, 0);
                var67 = var70 + 15;
                String var31 = class133.field2142;
                String var32 = field317;
                int var33 = var32.length();
                char[] var34 = new char[var33];
                for (int var35 = 0; var35 < var33; var35++) {
                    var34[var35] = '*';
                }
                String var36 = new String(var34);
                arg0.method3510(var31 + var36, 274, var67, 16777215, 0);
                var67 += 15;
            }
            if (client.field474 == 10) {
                Statics.field1792.method1782(202, 171);
                if (field312 == 0) {
                    short var38 = 251;
                    arg0.method3445(class133.field2264, 382, var38, 16776960, 0);
                    int var71 = var38 + 30;
                    short var39 = 302;
                    short var40 = 291;
                    Statics.field295.method1782(var39 - 73, var40 - 20);
                    arg0.method3457(class133.field2196, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var41 = 462;
                    Statics.field295.method1782(var41 - 73, var40 - 20);
                    arg0.method3457(class133.field2270, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (field312 == 2) {
                    short var42 = 211;
                    arg0.method3445(field329, 382, var42, 16776960, 0);
                    int var72 = var42 + 15;
                    arg0.method3445(field314, 382, var72, 16776960, 0);
                    int var73 = var72 + 15;
                    arg0.method3445(field315, 382, var73, 16776960, 0);
                    int var74 = var73 + 15;
                    int var75 = var74 + 10;
                    arg0.method3510(class133.field2102, 272, var75, 16777215, 0);
                    short var43 = 200;
                    String var44;
                    for (var44 = field316; arg0.method3497(var44) > var43; var44 = var44.substring(1)) {
                    }
                    arg0.method3510(class183.method3453(var44) + (field318 == 0 & client.field652 % 40 < 20 ? class2.method1398(16776960) + class2.field19 : ""), 312, var75, 16777215, 0);
                    var72 = var75 + 15;
                    String var46 = class133.field2142;
                    String var47 = field317;
                    int var48 = var47.length();
                    char[] var49 = new char[var48];
                    for (int var50 = 0; var50 < var48; var50++) {
                        var49[var50] = '*';
                    }
                    String var51 = new String(var49);
                    arg0.method3510(var46 + var51 + (field318 == 1 & client.field652 % 40 < 20 ? class2.method1398(16776960) + class2.field19 : ""), 274, var72, 16777215, 0);
                    var72 += 15;
                    short var53 = 302;
                    short var54 = 321;
                    Statics.field295.method1782(var53 - 73, var54 - 20);
                    arg0.method3445(class133.field2252, var53, var54 + 5, 16777215, 0);
                    short var55 = 462;
                    Statics.field295.method1782(var55 - 73, var54 - 20);
                    arg0.method3445(class133.field2272, var55, var54 + 5, 16777215, 0);
                } else if (field312 == 3) {
                    arg0.method3445(class133.field2273, 382, 211, 16776960, 0);
                    short var56 = 236;
                    arg0.method3445(class133.field2274, 382, var56, 16777215, 0);
                    int var76 = var56 + 15;
                    arg0.method3445(class133.field2085, 382, var76, 16777215, 0);
                    int var77 = var76 + 15;
                    arg0.method3445(class133.field2259, 382, var77, 16777215, 0);
                    int var78 = var77 + 15;
                    arg0.method3445(class133.field2277, 382, var78, 16777215, 0);
                    int var79 = var78 + 15;
                    short var57 = 382;
                    short var58 = 321;
                    Statics.field295.method1782(var57 - 73, var58 - 20);
                    arg0.method3445(class133.field2272, var57, var58 + 5, 16777215, 0);
                }
            }
            if (field308 > 0) {
                method2060(field308);
                field308 = 0;
            }
            method99();
            Statics.field2045[field313 ? 1 : 0].method1782(725, 463);
            if (client.field474 > 5 && client.field499 == 0) {
                if (Statics.field2055 == null) {
                    Statics.field2055 = class83.method1597(Statics.field1037, "sl_button", "");
                } else {
                    byte var59 = 5;
                    short var60 = 463;
                    byte var61 = 100;
                    byte var62 = 35;
                    Statics.field2055.method1782(var59, var60);
                    arg0.method3445(class133.field2101 + " " + client.field466, var61 / 2 + var59, var62 / 2 + var60 - 2, 16777215, 0);
                    if (Statics.field321 == null) {
                        arg1.method3445(class133.field2288, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                    } else {
                        arg1.method3445(class133.field2287, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                    }
                }
            }
            try {
                Graphics var63 = Statics.field1013.getGraphics();
                Statics.field1187.method1622(var63, 0, 0);
            } catch (Exception var66) {
                Statics.field1013.repaint();
            }
            return;
        }
        if (Statics.field941 == null) {
            Statics.field941 = class83.method153(Statics.field1037, "sl_back", "");
        }
        if (Statics.field66 == null) {
            Statics.field66 = class83.method3136(Statics.field1037, "sl_flags", "");
        }
        if (Statics.field587 == null) {
            Statics.field587 = class83.method3136(Statics.field1037, "sl_arrows", "");
        }
        if (Statics.field2309 == null) {
            Statics.field2309 = class83.method3136(Statics.field1037, "sl_stars", "");
        }
        class88.method1842(0, 23, 765, 480, 0);
        class88.method1820(0, 0, 125, 23, 12425273, 9135624);
        class88.method1820(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3445(class133.field2240, 62, 15, 0, -1);
        if (Statics.field2309 != null) {
            Statics.field2309[1].method1782(140, 1);
            arg1.method3510(class133.field2279, 152, 10, 16777215, -1);
            Statics.field2309[0].method1782(140, 12);
            arg1.method3510(class133.field2280, 152, 21, 16777215, -1);
        }
        if (Statics.field587 != null) {
            short var2 = 280;
            if (field323[0] == 0 && field297[0] == 0) {
                Statics.field587[2].method1782(var2, 4);
            } else {
                Statics.field587[0].method1782(var2, 4);
            }
            if (field323[0] == 0 && field297[0] == 1) {
                Statics.field587[3].method1782(var2 + 15, 4);
            } else {
                Statics.field587[1].method1782(var2 + 15, 4);
            }
            arg0.method3510(class133.field2281, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field323[0] == 1 && field297[0] == 0) {
                Statics.field587[2].method1782(var3, 4);
            } else {
                Statics.field587[0].method1782(var3, 4);
            }
            if (field323[0] == 1 && field297[0] == 1) {
                Statics.field587[3].method1782(var3 + 15, 4);
            } else {
                Statics.field587[1].method1782(var3 + 15, 4);
            }
            arg0.method3510(class133.field2282, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field323[0] == 2 && field297[0] == 0) {
                Statics.field587[2].method1782(var4, 4);
            } else {
                Statics.field587[0].method1782(var4, 4);
            }
            if (field323[0] == 2 && field297[0] == 1) {
                Statics.field587[3].method1782(var4 + 15, 4);
            } else {
                Statics.field587[1].method1782(var4 + 15, 4);
            }
            arg0.method3510(class133.field2149, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field323[0] == 3 && field297[0] == 0) {
                Statics.field587[2].method1782(var5, 4);
            } else {
                Statics.field587[0].method1782(var5, 4);
            }
            if (field323[0] == 3 && field297[0] == 1) {
                Statics.field587[3].method1782(var5 + 15, 4);
            } else {
                Statics.field587[1].method1782(var5 + 15, 4);
            }
            arg0.method3510(class133.field2284, var5 + 32, 17, 16777215, -1);
        }
        class88.method1842(708, 4, 50, 16, 0);
        arg1.method3445(class133.field2272, 733, 16, 16777215, -1);
        field302 = -1;
        if (Statics.field941 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field298) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field298) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field298) {
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
            for (int var19 = 0; var19 < field298; var19++) {
                class12 var20 = Statics.field1786[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field190);
                if (var20.field190 == -1) {
                    var22 = class133.field2285;
                    var21 = false;
                } else if (var20.field190 > 1980) {
                    var22 = class133.field2118;
                    var21 = false;
                }
                if (class76.field1380 >= var17 && class76.field1384 >= var16 && class76.field1380 < var6 + var17 && class76.field1384 < var7 + var16 && var21) {
                    field302 = var19;
                    Statics.field941[var20.field195 ? 1 : 0].method1706(var17, var16, 128, 16777215);
                } else {
                    Statics.field941[var20.field195 ? 1 : 0].method1700(var17, var16);
                }
                if (Statics.field66 != null) {
                    Statics.field66[var20.field192 + (var20.field195 ? 8 : 0)].method1782(var17 + 29, var16);
                }
                arg0.method3445(Integer.toString(var20.field194), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3445(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
        }
        try {
            Graphics var23 = Statics.field1013.getGraphics();
            Statics.field1187.method1622(var23, 0, 0);
        } catch (Exception var65) {
            Statics.field1013.repaint();
        }
    }

    @ObfuscatedName("ax.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method811(String arg0, String arg1, String arg2) {
        field329 = arg0;
        field314 = arg1;
        field315 = arg2;
    }

    @ObfuscatedName("s.i(Lce;I)V")
    public static final void method128(class86 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field305.length; var2++) {
            Statics.field305[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field305[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1968[var8] = (Statics.field305[var8 - 1] + Statics.field305[var8 + 1] + Statics.field305[var8 - 128] + Statics.field305[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field305;
            Statics.field305 = Statics.field1968;
            Statics.field1968 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1469; var11++) {
            for (int var12 = 0; var12 < arg0.field1468; var12++) {
                if (arg0.field1470[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1467;
                    int var14 = var11 + 16 + arg0.field1471;
                    int var15 = (var14 << 7) + var13;
                    Statics.field305[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cp.o(II)V")
    public static final void method2060(int arg0) {
        short var1 = 256;
        field306 += arg0 * 128;
        if (field306 > Statics.field305.length) {
            field306 -= Statics.field305.length;
            int var2 = (int) (Math.random() * 12.0D);
            method128(Statics.field296[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2499[var3 + var4] - Statics.field305[field306 + var3 & Statics.field305.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2499[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2499[var9 + var10] = 255;
                } else {
                    Statics.field2499[var9 + var10] = 0;
                }
            }
        }
        if (field303 > 0) {
            field303 -= arg0 * 4;
        }
        if (field301 > 0) {
            field301 -= arg0 * 4;
        }
        if (field303 == 0 && field301 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field303 = 1024;
            }
            if (var12 == 1) {
                field301 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field304[var13] = field304[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field304[var14] = (int) (Math.sin((double) field309 / 14.0D) * 16.0D + Math.sin((double) field309 / 15.0D) * 14.0D + Math.sin((double) field309 / 16.0D) * 12.0D);
            field309++;
        }
        field307 += arg0 * 25058893;
        int var15 = ((client.field652 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field307 * 604773364; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2499[(var18 << 7) + var17] = 192;
        }
        field307 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2499[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2499[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1296[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1296[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1296[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2499[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dy.l(IIII)I")
    public static final int method2341(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("w.p(B)V")
    public static final void method99() {
        short var0 = 256;
        if (field303 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field303 > 768) {
                    Statics.field1295[var1] = method2341(Statics.field847[var1], Statics.field111[var1], 1024 - field303);
                } else if (field303 > 256) {
                    Statics.field1295[var1] = Statics.field111[var1];
                } else {
                    Statics.field1295[var1] = method2341(Statics.field111[var1], Statics.field847[var1], 256 - field303);
                }
            }
        } else if (field301 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field301 > 768) {
                    Statics.field1295[var2] = method2341(Statics.field847[var2], Statics.field1971[var2], 1024 - field301);
                } else if (field301 > 256) {
                    Statics.field1295[var2] = Statics.field1971[var2];
                } else {
                    Statics.field1295[var2] = method2341(Statics.field1971[var2], Statics.field847[var2], 256 - field301);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1295[var3] = Statics.field847[var3];
            }
        }
        class88.method1792(0, 9, 128, var0 + 7);
        Statics.field320.method1700(0, 0);
        class88.method1816();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field304[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2499[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1295[var10];
                    int var14 = Statics.field1187.field1450[var5];
                    Statics.field1187.field1450[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class88.method1792(637, 9, 765, var0 + 7);
        Statics.field325.method1700(382, 0);
        class88.method1816();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field304[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2499[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1295[var22];
                    int var26 = Statics.field1187.field1450[var20];
                    Statics.field1187.field1450[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("x.t(I)V")
    public static void method125() {
        try {
            if (Statics.field321 == null) {
                Statics.field321 = new class23(Statics.field1791, new URL(Statics.field2298));
            } else {
                byte[] var0 = Statics.field321.method205();
                if (var0 != null) {
                    class126 var1 = new class126(var0);
                    field298 = var1.method2487();
                    Statics.field1786 = new class12[field298];
                    int var2 = 0;
                    while (var2 < field298) {
                        class12 var3 = Statics.field1786[var2] = new class12();
                        int var4 = var1.method2487();
                        var3.field194 = var4 & 0x7FFF;
                        var3.field195 = (var4 & 0x8000) != 0;
                        var3.field191 = var1.method2470();
                        var3.field192 = var1.method2485();
                        var3.field190 = var1.method2488();
                        var3.field197 = var2++;
                    }
                    method547(Statics.field1786, 0, Statics.field1786.length - 1, field323, field297);
                    field322 = true;
                    Statics.field321 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field321 = null;
        }
    }

    @ObfuscatedName("client.r([La;II[I[II)V")
    public static void method547(class12[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class12 var8 = arg0[var7];
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
                        var11 = arg0[var6].field197;
                        var12 = var8.field197;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field190;
                        var12 = var8.field190;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field195 ? 1 : 0;
                        var12 = var8.field195 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field194;
                        var12 = var8.field194;
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
                        var15 = arg0[var5].field197;
                        var16 = var8.field197;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field190;
                        var16 = var8.field190;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field195 ? 1 : 0;
                        var16 = var8.field195 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field194;
                        var16 = var8.field194;
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
                class12 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method547(arg0, arg1, var6, arg3, arg4);
        method547(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
